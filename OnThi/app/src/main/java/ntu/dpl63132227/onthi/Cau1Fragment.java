package ntu.dpl63132227.onthi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {
    EditText editText_met;
    EditText editText_kilomet;
    Button btnChuyen;
    Button btnReset;

    public Cau1Fragment() {
        // Required empty public constructor
    }

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        // Tìm điều khiển trong view này
        editText_met = viewCau1.findViewById(R.id.txtmet);
        editText_kilomet = viewCau1.findViewById(R.id.txtkm);
        btnChuyen = viewCau1.findViewById(R.id.btnchuyen);
        btnReset = viewCau1.findViewById(R.id.btnreset);

        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieuMet = editText_met.getText().toString();
                String duLieuKiloMet = editText_kilomet.getText().toString();

                if (!duLieuMet.isEmpty()) {
                    try {
                        double met = Double.parseDouble(duLieuMet);
                        double kilomet = met / 1000;
                        editText_kilomet.setText(String.valueOf(kilomet));
                    } catch (NumberFormatException e) {
                        Toast.makeText(viewCau1.getContext(), "Dữ liệu nhập vào không hợp lệ (mét)", Toast.LENGTH_SHORT).show();
                    }
                } else if (!duLieuKiloMet.isEmpty()) { // Đổi từ km sang mét
                    try {
                        double kilomet = Double.parseDouble(duLieuKiloMet);
                        double met = kilomet * 1000;
                        editText_met.setText(String.valueOf(met));
                    } catch (NumberFormatException e) {
                        Toast.makeText(viewCau1.getContext(), "Dữ liệu nhập vào không hợp lệ (kilomet)", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(viewCau1.getContext(), "Vui lòng nhập giá trị", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_met.setText("");
                editText_kilomet.setText("");
            }
        });

        return viewCau1;
    }
}