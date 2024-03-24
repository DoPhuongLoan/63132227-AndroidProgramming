package ntu.dpl63132227.cau2_appbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText nhapcannang, nhapchieucao;
    Button buttondanhgia, buttonxoa;
    TextView ketqua, trangthai;
    ImageView hinhanh;
    void layDL(){
        nhapcannang = findViewById(R.id.txtcnang);
        nhapchieucao = findViewById(R.id.txtccao);
        buttondanhgia = findViewById(R.id.btnkq);
        buttonxoa = findViewById(R.id.btnxoa);
        ketqua = findViewById(R.id.txtkq);
        hinhanh = findViewById(R.id.image);
        trangthai = findViewById(R.id.intrangthai);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layDL();
        buttondanhgia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhBMI();
            }
        });
        buttonxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhapcannang.setText("");
                nhapchieucao.setText("");
                ketqua.setText("");
                trangthai.setText("");
                hinhanh.setImageResource(0);
            }
        });
    }
    private void tinhBMI() {
        String canNang = nhapcannang.getText().toString();
        String chieuCao = nhapchieucao.getText().toString();

        if (canNang.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập cân nặng!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (chieuCao.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập chiều cao!", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}