package ntu.dpl63132227.bai2_loginintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChuyenMHLogin(View v) {
        Intent MHlogin = new Intent(this, LoginActivity.class);
        startActivity(MHlogin);
    }
}

