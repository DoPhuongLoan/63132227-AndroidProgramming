package ntu.dpl63132227.onthi;

import static android.content.Context.MODE_PRIVATE;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ntu.dpl63132227.onthi.R;

public class Cau4FragmentRy extends Fragment {

    public Cau4FragmentRy() {
        // Required empty public constructor
    }

    public static Cau4FragmentRy newInstance(String param1, String param2) {
        Cau4FragmentRy fragment = new Cau4FragmentRy();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cau4_ry, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rvBooks);
        //hướng dọc:
//        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(view.getContext());
//        recyclerView.setLayoutManager(layoutLinear);

        //hướng ngang
        RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutLinearHorizonal);

        // Tạo GridLayoutManager với số cột mong muốn
//        int numberOfColumns = 2; // Số cột bạn muốn hiển thị
//        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(view.getContext(), numberOfColumns);
//        recyclerView.setLayoutManager(layoutGrid);

        // Step 0: Create the database and populate it with initial data
//        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLSach1.db", // Database file name
//                MODE_PRIVATE,  // Access mode
//                null           // Cursor factory
//        );
//
//        // Create table and populate with initial data
//        String sqlXoaBangNeuDaCo = "DROP TABLE IF EXISTS Books;";
//        String sqlTaoBang = "CREATE TABLE Books( BookID integer PRIMARY KEY, " +
//                "BookName text, " +
//                "Page integer, " +
//                "Price Float, " +
//                "Description text);";
//        db.execSQL(sqlXoaBangNeuDaCo);
//        db.execSQL(sqlTaoBang);
//
//        // Insert initial data
//        String sqlThem1 = "INSERT INTO Books VALUES(1, 'Java', 100, 9.99, 'sách về java');";
//        String sqlThem2 = "INSERT INTO Books VALUES(2, 'Android', 320, 19.00, 'Android cơ bản');";
//        String sqlThem3 = "INSERT INTO Books VALUES(3, 'Học làm giàu', 120, 0.99, 'sách đọc cho vui');";
//        String sqlThem4 = "INSERT INTO Books VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ điển 100.000 từ');";
//        String sqlThem5 = "INSERT INTO Books VALUES(5, 'Tư Tưởng HCM', 1, 1, 'chuyện cổ tích');";
//        db.execSQL(sqlThem1);
//        db.execSQL(sqlThem2);
//        db.execSQL(sqlThem3);
//        db.execSQL(sqlThem4);
//        db.execSQL(sqlThem5);
//        db.close();
//        return inflater.inflate(R.layout.fragment_cau4_ry, container,false);


        SQLiteDatabase db =getActivity().openOrCreateDatabase("QLSach1.db", // tên file = tên DB
                MODE_PRIVATE,  // giới hạn truy cập
                null          // con trỏ bản ghi
        );
        // Query the database for data
        String sqlSelect = "SELECT * FROM Books;";
        Cursor cs = db.rawQuery(sqlSelect, null);
        if (cs.moveToFirst()) { // Move cursor to the first record
            ArrayList<BookA> dsSach = new ArrayList<>();
            do {
                int idSach = cs.getInt(0);  // Get data from column 0
                String tenSach = cs.getString(1);
                int soTrang = cs.getInt(2);
                float gia = cs.getFloat(3);
                String mota = cs.getString(4);
                BookA b = new BookA(idSach, tenSach, soTrang, gia, mota);
                dsSach.add(b);
            } while (cs.moveToNext());
            cs.close();
            db.close();

            // Set up the RecyclerView with the adapter
            BookAdapter adapter = new BookAdapter(dsSach);
            recyclerView.setAdapter(adapter);
        } else {
            cs.close();
            db.close();
        }

        return view;
    }
}
