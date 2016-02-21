package chairattanangkul.ployrung.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Waen on 21/2/2559.
 */
public class MyAdapter extends BaseAdapter {
//extends ดึง sdk มาจากกูเกิ้ล ละ alt+enter ละเลือก implement มันจะสร้างอัตโนมัติ

    //Explicit ,context ตัวเล็กคือ ชื่อ ตัวแปร ตั้งเอง กด ctrl + space จะ suggest ชื่อต่อให้ เช่นกด icon ละ ctrl + space จะได้ iconInts

    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailShortStrings;

    //atl+insert ได้ constructer=head of methods


    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] detailShortStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailShortStrings = detailShortStrings;
    }   //Constructor จะดึง data ทั้งหมดมาที่ตัวมันก่อน ละค่อยส่ง data ไปปลายทาง

    @Override
    //getCount ต้องการสร้าง กี่อัน ให้มันนับเอง
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //คนหิ้วของเข้าไปตามท่อ ไปวางตามตำแหน่งต่างๆ(x,y,falst = no security) = view ,,,ship + ctrl+enter จะขึ้นบรรทัดใหม่ให้
        View view = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //About Icon
        ImageView iconImageView = (ImageView) view.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);
        //setimageresource = change image location, parameter = ตำแหน่งทีไปเอาภาพมา

        //About Tile
        TextView titleTextView = (TextView) view.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);


        TextView detailTextView = (TextView) view.findViewById(R.id.textView3);
        detailTextView.setText(detailShortStrings[i]);

        //About detail
        //detailTextView = ชื่อที่ตั้งเอง
        //setText คือเอามาจากไหนมา set




        return view; //เปิดใช้งาน กดปิด ctrl + alt + enter ถ้าแดง alt+enter = cast to
        //ctrl+spce = แดงปลายๆ จะใช้้อันนี้
        //alt+enter = แดงทั้งบรรทัด แก้ผิดเป็นถูก
    }
}   //Main Class //suggest ตัวแปร ctrl+space

