package pl.ntu.bai2_tientiep;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText nhaptt;
    RadioButton rd13, rd15, rd18;
    Button buttontinh;
    TextView thongbao;
    double tientip;
    void LayDL(){
        rd13 = findViewById(R.id.btn13);
        rd15 = findViewById(R.id.btn15);
        rd18 = findViewById(R.id.btn18);
        buttontinh = findViewById(R.id.btntinh);
        nhaptt = findViewById(R.id.edttext);
        thongbao = findViewById(R.id.tb);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayDL();
        buttontinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!XuLy()){
                    return;
                }
                double tt = Double.parseDouble(nhaptt.getText().toString());
                if(rd13.isChecked()){
                    tientip = tt * 0.13;
                }
                if(rd15.isChecked()){
                    tientip = tt * 0.15;
                }
                if(rd18.isChecked()){
                    tientip = tt * 0.18;
                }
                thongbao.setText("Your tip will be &"+String.valueOf(tientip));
            }
        });
    }
    private boolean XuLy(){
        String tip = nhaptt.getText().toString();
        if(tip.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập sô tiền", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}