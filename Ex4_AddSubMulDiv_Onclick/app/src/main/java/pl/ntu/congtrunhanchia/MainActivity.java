package pl.ntu.congtrunhanchia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Khai ba các đối tượng gắn với điều khiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutChia,nutNhan;
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }
    public void XuLyCong(View v){
        //b1.1 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.2 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2 Tính toán
        float Tong = soA + soB;
        //b3 Hiện kq
        //b3.1 Chuẩn bị dl xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gắn kê quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyTru(View v){
        //b1.1 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.2 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2 Tính toán
        float Tru = soA - soB;
        //b3 Hiện kq
        //b3.1 Chuẩn bị dl xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tru);
        //b3.3 gắn kê quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){
        //b1.1 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.2 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2 Tính toán
        float Nhan = soA * soB;
        //b3 Hiện kq
        //b3.1 Chuẩn bị dl xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Nhan);
        //b3.3 gắn kê quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyChia(View v){
        //b1.1 Lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.2 Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2 Tính toán
        float Chia = soA / soB;
        //b3 Hiện kq
        //b3.1 Chuẩn bị dl xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Chia);
        //b3.3 gắn kê quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
}