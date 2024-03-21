package pl.ntu.bai1_login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText Editname, Editpass;
    Button Login;
    TextView EditAttempts;
    int dem = 0;
    void LayDL(){
        Editname = (EditText) findViewById(R.id.edtname);
        Editpass = (EditText) findViewById(R.id.edtpass);
        Login = findViewById(R.id.btnlog);
        EditAttempts = findViewById(R.id.textat);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayDL();
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyDangNhap();
            }
        });
    }
    public void XuLyDangNhap(){
        String username = Editname.getText().toString();
        String password = Editpass.getText().toString();
        dem++;
        EditAttempts.setText(String.valueOf(dem));
        if(username.equals("dophuongloan") && password.equals("63cntt2")){
            Toast.makeText(this,"User and password is correct",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
        }
    }
}
