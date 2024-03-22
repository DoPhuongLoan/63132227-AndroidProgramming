package pl.ntu.imagecongtrunhanchia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText Editso1, Editso2;
    TextView textkq;
    Button buttondl;
    ImageButton buttoncong, buttontru, buttonnhan, buttonchia;
    void layDL(){
        Editso1 = findViewById(R.id.edtso1);
        Editso2 = findViewById(R.id.edtso2);
        textkq = findViewById(R.id.edtkq);
        buttondl = findViewById(R.id.btndl);
        buttoncong = findViewById(R.id.btncong);
        buttontru = findViewById(R.id.btntru);
        buttonnhan = findViewById(R.id.btnnhan);
        buttonchia = findViewById(R.id.btnchia);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layDL();
        buttondl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ngaunhien = new Random();
                int ngaunhienso1 = ngaunhien.nextInt(10)+1;
                int ngaunhienso2 = ngaunhien.nextInt(10)+1;
                Editso1.setText(String.valueOf(ngaunhienso1));
                Editso2.setText(String.valueOf(ngaunhienso2));

            }
        });
        buttoncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xulycong();
            }
        });
        buttontru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xulytru();
            }
        });
        buttonnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xulynhan();
            }
        });
        buttonchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xulychia();
            }
        });
    }

    void Xulycong(){
        String sothunhat = Editso1.getText().toString();
        String sothuhai = Editso2.getText().toString();
        int so1 = Integer.parseInt(sothunhat);
        int so2 = Integer.parseInt(sothuhai);
        int tong = so1 + so2;
        String chuoiKq = String.valueOf(tong);
        textkq.setText(chuoiKq);
    }
    void Xulytru(){
        String sothunhat = Editso1.getText().toString();
        String sothuhai = Editso2.getText().toString();
        int so1 = Integer.parseInt(sothunhat);
        int so2 = Integer.parseInt(sothuhai);
        int tru = so1 - so2;
        String chuoiKq = String.valueOf(tru);
        textkq.setText(chuoiKq);
    }
    void Xulynhan(){
        String sothunhat = Editso1.getText().toString();
        String sothuhai = Editso2.getText().toString();
        int so1 = Integer.parseInt(sothunhat);
        int so2 = Integer.parseInt(sothuhai);
        int nhan = so1 * so2;
        String chuoiKq = String.valueOf(nhan);
        textkq.setText(chuoiKq);
    }
    void Xulychia(){
        String sothunhat = Editso1.getText().toString();
        String sothuhai = Editso2.getText().toString();
        int so1 = Integer.parseInt(sothunhat);
        int so2 = Integer.parseInt(sothuhai);
        float chia = (float) so1 / so2;
        String chuoiKq = String.valueOf(chia);
        textkq.setText(chuoiKq);
    }

}