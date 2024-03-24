package ntu.pl63132227.cau2_applenghthconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nhapso;
    RadioButton rdkilomet, rdhectomet, rddecamet, rddmet, rddecimet, rdcentimet, rdmilimet;
    RadioButton rskilomet, rshectomet, rsdecamet, rsdmet, rsdecimet, rscentimet, rsmilimet;
    Button buttondoi;
    TextView ketqua;
    void layDL (){
        nhapso = findViewById(R.id.txtnhap);
        rdkilomet = findViewById(R.id.rdKm);
        rdhectomet = findViewById(R.id.rdHm);
        rddecamet = findViewById(R.id.rdDam);
        rddmet = findViewById(R.id.rdM);
        rddecimet = findViewById(R.id.rdDm);
        rdcentimet = findViewById(R.id.rdCm);
        rdmilimet = findViewById(R.id.rdMm);

        rskilomet = findViewById(R.id.rsKm);
        rshectomet = findViewById(R.id.rsHm);
        rsdecamet = findViewById(R.id.rsDam);
        rsdmet = findViewById(R.id.rsM);
        rsdecimet = findViewById(R.id.rsDm);
        rscentimet = findViewById(R.id.rsCm);
        rsmilimet = findViewById(R.id.rsMm);

        buttondoi = findViewById(R.id.btndoi);
        ketqua = findViewById(R.id.txtkq);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layDL();
        buttondoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(!XuLy()){
                return;
            }
            if(rdkilomet.isChecked()){
                DoiTuKm();
            }
            if(rdhectomet.isChecked()){
                DoiTuHec();
            }
            if(rddecamet.isChecked()){
                DoiTuDam();
            }
            if(rddmet.isChecked()){
                DoiTuM();
            }
            if(rddecimet.isChecked()){
                DoiTuDm();
            }
            if(rdcentimet.isChecked()){
                DoiTuCm();
            }
            if (rdmilimet.isChecked()){
                DoiTuMm();
            }
            }
        });
    }
    private boolean XuLy(){
        String input = nhapso.getText().toString().trim();
        if(input.isEmpty()){
            Toast.makeText(this, "Vui lòng nhập số!", Toast.LENGTH_SHORT).show();
            return false;
        }
        try {
            double so = Double.parseDouble(input);
            if (so < 0) {
                Toast.makeText(this, "Không hỗ trợ số âm!", Toast.LENGTH_SHORT).show();
                return false;
            }
        } catch (Exception e) {
            Toast.makeText(this, "Nhập không hợp lệ!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    private double DoiTuKm(){
        double gtnhap = Double.parseDouble(nhapso.getText().toString());
        double kqua = 0;
        if (rskilomet.isChecked()) {
            kqua = gtnhap;
        } else if (rshectomet.isChecked()) {
            kqua = gtnhap * 10;
        } else if (rsdecamet.isChecked()) {
            kqua = gtnhap * 100;
        } else if (rsdmet.isChecked()) {
            kqua = gtnhap * 1000;
        } else if (rsdecimet.isChecked()) {
            kqua = gtnhap * 10000;
        } else if (rscentimet.isChecked()) {
            kqua = gtnhap * 100000;
        } else if (rsmilimet.isChecked()) {
            kqua = gtnhap * 1000000;
        }
        ketqua.setText(String.valueOf(kqua));
        return kqua;
    }
    private double DoiTuHec(){
        double gtnhap = Double.parseDouble(nhapso.getText().toString());
        double kqua = 0;
        if (rskilomet.isChecked()) {
            kqua = gtnhap / 10;
        } else if (rshectomet.isChecked()) {
            kqua = gtnhap;
        } else if (rsdecamet.isChecked()) {
            kqua = gtnhap * 10;
        } else if (rsdmet.isChecked()) {
            kqua = gtnhap * 100;
        } else if (rsdecimet.isChecked()) {
            kqua = gtnhap * 1000;
        } else if (rscentimet.isChecked()) {
            kqua = gtnhap * 10000;
        } else if (rsmilimet.isChecked()) {
            kqua = gtnhap * 100000;
        }
        ketqua.setText(String.valueOf(kqua));
        return kqua;
    }
    private double DoiTuDam(){

    }
    private double DoiTuM(){

    }
    private double DoiTuDm(){

    }
    private double DoiTuCm(){

    }
    private double DoiTuMm(){

    }

}