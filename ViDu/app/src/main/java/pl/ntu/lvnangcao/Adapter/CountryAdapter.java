package pl.ntu.lvnangcao.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import pl.ntu.lvnangcao.R;
import pl.ntu.lvnangcao.Modul.Country;

public class CountryAdapter extends BaseAdapter {
    //Nguồn dữ liệu cho Adapter
    ArrayList<Country> listQG;
    //Context hoạt động
    Context mContext;
    //Layout
    LayoutInflater mInfater;

    public CountryAdapter(Context mContext, ArrayList<Country> listQG) {
        this.listQG = listQG;
        this.mContext = mContext;
        mInfater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return listQG.size();
    }

    @Override
    public Object getItem(int position) {
        return listQG.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CountryViewHolder viewItem;
        if(convertView == null){
            convertView = mInfater.inflate(R.layout.country_item, null);
            viewItem = new CountryViewHolder();
            viewItem.textViewNationName = convertView.findViewById(R.id.tvNationName);
            viewItem.textViewPopulation = convertView.findViewById(R.id.tvPopulation);
            viewItem.imageViewFLag = convertView.findViewById(R.id.imgNation);
            convertView.setTag(viewItem);
        }
        else{
            viewItem = (CountryViewHolder)convertView.getTag();
        }
        //Đặt dữ liệu lên view
        Country QuocGiaShow = listQG.get(position);
        String tenQG = QuocGiaShow.getTenQG();
        int soDan = QuocGiaShow.getSoLuongDan();
        String laCoQG = QuocGiaShow.getTenFileAnhLaCo();
        viewItem.textViewNationName.setText(tenQG);
        viewItem.textViewPopulation.setText("Dân số: " + String.valueOf(soDan));

        //Tìm id file ảnh ở đây
        int idFlag = FindIDImage_NameFile(laCoQG);

        viewItem.imageViewFLag.setImageResource(idFlag);
        return convertView;
    }

    int FindIDImage_NameFile(String File){
        String tenPkg = mContext.getPackageName();
        int id = mContext.getResources().getIdentifier(File, "mipmap", tenPkg);
        return id;
    }

    static class CountryViewHolder{
        ImageView imageViewFLag;
        TextView textViewNationName;
        TextView textViewPopulation;

    }
}