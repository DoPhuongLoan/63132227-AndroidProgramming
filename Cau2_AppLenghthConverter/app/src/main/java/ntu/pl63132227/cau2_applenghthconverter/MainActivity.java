package ntu.pl63132227.cau2_applenghthconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

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
    TextView ketqua, thongbao;
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
        thongbao = findViewById(R.id.txtthongbao);
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


            }
        });
    }
    private boolean XuLy(){
        
    }
}