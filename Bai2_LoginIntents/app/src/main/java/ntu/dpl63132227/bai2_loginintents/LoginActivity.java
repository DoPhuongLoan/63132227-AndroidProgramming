package ntu.dpl63132227.bai2_loginintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edtUserName, edtPass, edtMail;
    TextView tberr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserName = findViewById(R.id.edtUserName);
        edtPass = findViewById(R.id.edtPass);
        edtMail = findViewById(R.id.edtMail);
        tberr = findViewById(R.id.tberr);
    }

    public void ChuyenMHHome(View v) {
        String username = edtUserName.getText().toString();
        String password = edtPass.getText().toString();
        String email = edtMail.getText().toString();
        if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
            tberr.setText("Vui lòng điền đầy đủ thông tin");
            return;
        }
        int flag = 0;
        if (!username.isEmpty()) {
            if (username.equals("dophuongloan")) {
                flag++;
            } else {
                tberr.setText("Tên đăng nhập không chính xác");
                return;
            }
        }
        if (!password.isEmpty()) {
            if (password.equals("123")) {
                flag++;
            } else {
                tberr.setText("Mật khẩu không chính xác!");
                return;
            }
        }
        if (!email.isEmpty()) {
            if (email.equals("loan@gmail.com")) {
                flag++;
            } else {
                tberr.setText("Email không chính xác!");
                return;
            }
        }

        Intent MHHome = new Intent(this, HomeActivity.class);
        startActivity(MHHome);
    }
}
