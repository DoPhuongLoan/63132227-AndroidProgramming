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
        btnChuyen  = viewCau1.findViewById(R.id.btnchuyen);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieuMet = editText_met.getText().toString();
                String duLieuKiloMet = editText_kilomet.getText().toString();
                //
                if (!duLieuMet.isEmpty()) // user có nhập dữ liệu met, cần đổi sang km
                {
                    Toast.makeText(viewCau1.getContext(),"m->km", Toast.LENGTH_SHORT).show();
                }
                else //đổi từ km sang met
                {
                    Toast.makeText(viewCau1.getContext(),"km->m", Toast.LENGTH_SHORT).show();
                }

            }
        });
        return viewCau1;
    }
}