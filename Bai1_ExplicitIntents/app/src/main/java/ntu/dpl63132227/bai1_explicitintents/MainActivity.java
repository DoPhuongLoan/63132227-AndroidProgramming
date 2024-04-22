package ntu.dpl63132227.bai1_explicitintents;

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

    public void ChuyenManHinh(View v) {
        Intent ManHinh2 = new Intent(this, SubOneActivity.class);
        startActivity(ManHinh2);
    }
}
