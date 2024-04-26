package ntu.dpl63132227.bottomnavigationview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.main, new Home_nav()).commit();
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener navListener = item -> {
        Fragment selectedFragment = null;
        int itemId = item.getItemId();
        if (itemId == R.id.home) {
            selectedFragment = new Home_nav();
            Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.music) {
            selectedFragment = new Music_nav();
            Toast.makeText(MainActivity.this, "Music", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.film) {
            selectedFragment = new Film_nav();
            Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();
        }
        if (selectedFragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main, selectedFragment).commit();
        }
        return true;
    };
}
