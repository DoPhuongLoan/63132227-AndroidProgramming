package ntu.dpl63132227.onthi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();
                if (itemId == R.id.navigation_information) {
                    selectedFragment = new InformationFragment();
                }else if (itemId == R.id.cau1) {
                    selectedFragment = new Cau1Fragment();
                } else if (itemId == R.id.cau2) {
                    selectedFragment = new Cau2Fragment();
                } else if (itemId == R.id.cau3) {
                    selectedFragment = new Cau3Fragment();
                }  else if (itemId == R.id.cau4) {
                    selectedFragment = new Cau4Fragment();
                }
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace, selectedFragment).commit();
                }
                return true;
            }
        });

    }
}