package pl.ntu.lisview_themxoasua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsLop; // khai bao
    Button btnThem, btnSua, btnXoa;

    EditText editTextlop;
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hien thi du lieu len listView
        // b1: can du lieu
        // du lieu tu CDL ( SQL , noSQL, XML, ...)
        // can bien phu hop de chua dl


        dsLop = new ArrayList<String>(); // khai bao cu the

        btnThem = (Button) findViewById(R.id.btnthem);
        btnSua = (Button) findViewById(R.id.btnSua);
        btnXoa = (Button) findViewById(R.id.btnXoa);

        editTextlop = (EditText) findViewById(R.id.editTextlop);
        // them du lieu ( tu 1 nguon or cho san ( hard-code)
        dsLop.add("63-CNTT1");
        dsLop.add("63-CNTT2");
        dsLop.add("63-CNTT3");
        dsLop.add("63-CNTT4");
        dsLop.add("63-CNTT1-CLC");
        dsLop.add("63-CNTT2-CLC");
        // b2: tao adapter
        ArrayAdapter<String> adapterlop;
        adapterlop = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsLop);
        // b3: gan vao DK hien thi ListView
        // b3.1: tim
        ListView lvDSlop = findViewById(R.id.lvDSlop);
        // b3.2 gan
        lvDSlop.setAdapter(adapterlop);
        // b3.3 lang nghe va xu ly SK nguoi dung tuong tac
        lvDSlop.setOnItemClickListener(BLNVXL);

        // Them
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lop = editTextlop.getText().toString();
                dsLop.add(lop);
                adapterlop.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Thêm thành công",Toast.LENGTH_SHORT).show();
            }
        });

        // Sua
        lvDSlop.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                editTextlop.setText(dsLop.get(i));
                vitri = i;
            }
        }));

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dsLop.set(vitri, editTextlop.getText().toString());
                adapterlop.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"Sửa thành công",Toast.LENGTH_SHORT).show();
            }
        });

        // Xoa
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(vitri != -1) {
                    dsLop.remove(vitri);
                    adapterlop.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this, "Xóa thành công", Toast.LENGTH_SHORT).show();
                    editTextlop.setText("");
                    vitri = -1;
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng chọn lớp cần xóa", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    // tao 1 bo lang nghe va XLSK onItemClick
    AdapterView.OnItemClickListener BLNVXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
            // i la vi tri cua pt dc click

            // hien thi nhanh 1 thong bao ( hien vi tri cua pt )
            // Toast.makeText(MainActivity.this,"Ban vua click vao i"+String.valueOf(i), Toast.LENGTH_SHORT).show();
            // hien gia tri cua pt i
            String strTenMH = dsLop.get(i);
            Toast.makeText(MainActivity.this,strTenMH, Toast.LENGTH_SHORT).show();
        }
    };
}