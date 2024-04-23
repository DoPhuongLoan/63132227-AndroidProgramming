package ntu.dpl63132227.bai2_loginintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void QuayVe(View v) {
        Intent MHMain = new Intent(this, MainActivity.class);
        startActivity(MHMain);
    }
}