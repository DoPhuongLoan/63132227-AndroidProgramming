package ntu.dpl63132227.onthi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cau2Fragment extends Fragment {

    EditText editTextso1, editTextso2;
    TextView editTextkq;
    Button cong, tru, nhan, chia;

    public Cau2Fragment() {
        // Required empty public constructor
    }

    public static Cau2Fragment newInstance(String param1, String param2) {
        Cau2Fragment fragment = new Cau2Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewcau2 = inflater.inflate(R.layout.fragment_cau2, container, false);
        editTextso1 = viewcau2.findViewById(R.id.edtso1);
        editTextso2 = viewcau2.findViewById(R.id.edtso2);
        editTextkq = viewcau2.findViewById(R.id.edtkq);
        cong = viewcau2.findViewById(R.id.btncong);
        tru = viewcau2.findViewById(R.id.btntru);
        nhan = viewcau2.findViewById(R.id.btnnhan);
        chia = viewcau2.findViewById(R.id.btnchia);

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoiso1 = editTextso1.getText().toString();
                String chuoiso2 = editTextso2.getText().toString();
                float so1 = Float.parseFloat(chuoiso1);
                float so2 = Float.parseFloat(chuoiso2);
                float kq = so1 + so2;
                String ketqua = String.valueOf(kq);
                editTextkq.setText(ketqua);
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoiso1 = editTextso1.getText().toString();
                String chuoiso2 = editTextso2.getText().toString();
                float so1 = Float.parseFloat(chuoiso1);
                float so2 = Float.parseFloat(chuoiso2);
                float kq = so1 - so2;
                String ketqua = String.valueOf(kq);
                editTextkq.setText(ketqua);
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoiso1 = editTextso1.getText().toString();
                String chuoiso2 = editTextso2.getText().toString();
                float so1 = Float.parseFloat(chuoiso1);
                float so2 = Float.parseFloat(chuoiso2);
                float kq = so1 * so2;
                String ketqua = String.valueOf(kq);
                editTextkq.setText(ketqua);
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoiso1 = editTextso1.getText().toString();
                String chuoiso2 = editTextso2.getText().toString();
                float so1 = Float.parseFloat(chuoiso1);
                float so2 = Float.parseFloat(chuoiso2);
                float kq = so1 / so2;
                String ketqua = String.valueOf(kq);
                editTextkq.setText(ketqua);
            }
        });

        return viewcau2;
    }
}