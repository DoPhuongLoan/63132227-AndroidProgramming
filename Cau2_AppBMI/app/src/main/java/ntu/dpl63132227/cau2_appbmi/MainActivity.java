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

        double cannang = Double.parseDouble(canNang);
        double chieucao = Double.parseDouble(chieuCao) / 100;
        double bmi = cannang / (chieucao * chieucao);
        String kqua = "BMI: " + bmi;

        if (bmi < 18.5) {
            ketqua.setText(kqua);
            trangthai.setText("Thiếu Cân");
            trangthai.setTextColor(getResources().getColor(R.color.thieu_can));
            hinhanh.setImageResource(R.drawable.thieucan);
        } else if (bmi >= 18.5 && bmi < 24.9) {
            ketqua.setText(kqua);
            trangthai.setText("Cân Đối");
            trangthai.setTextColor(getResources().getColor(R.color.can_doi));
            hinhanh.setImageResource(R.drawable.candoi);
        } else if (bmi >= 24.9 && bmi < 29.9) {
            ketqua.setText(kqua);
            trangthai.setText("Thừa Cân");
            trangthai.setTextColor(getResources().getColor(R.color.thua_can));
            hinhanh.setImageResource(R.drawable.thuacan);
        } else if (bmi >= 29.9 && bmi < 34.9) {
            ketqua.setText(kqua);
            trangthai.setText("Béo Phì");
            trangthai.setTextColor(getResources().getColor(R.color.beo_phi));
            hinhanh.setImageResource(R.drawable.beophi);
        } else {
            ketqua.setText(kqua);
            trangthai.setText("Béo Phì Nguy Hiểm");
            trangthai.setTextColor(getResources().getColor(R.color.beo_phinh));
            hinhanh.setImageResource(R.drawable.beophi_nguyhiem);
        }
    }
}