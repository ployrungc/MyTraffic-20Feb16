package chairattanangkul.ployrung.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView; //มี text view 2 ตัว ประกาศ 2  ตัว
    private ImageView trafficImageView;
    private Button preButton, backButton, nextButton;
    private int[] iconInts; //แหล่งกำเนิดภาพ
    private String[] titleStrings, detailLongStrings;
    private int myIndexAnInt;


    //1.ประกาศตัวแปรก่อน
    //2.ใส่ widget = bindWidget

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);//ctrl + เอาเมามาคลิก จะเปิด xml ขึ้นมาให้


        //2//Bind Widget // bindWidget คือการบอกว่า ตัวแปรที่ประกาศ ทำหน้าที่อะไร เอาอะไรมาแสดง
        bindWidget();

        //Show View
        showView();



    }       //Main Method

    private void showView() {

        //Receive Value From Intent จาก array 2 ชุด int 1 ตัว
        titleStrings = getIntent().getStringArrayExtra("Title");
        iconInts = getIntent().getIntArrayExtra("Image");
        myIndexAnInt = getIntent().getIntExtra("Index", 0);

        detailLongStrings = getResources().getStringArray(R.array.detail_long);

        changeView(myIndexAnInt);

    }       //showView

    private void changeView(int myIndexAnInt) {

        titleTextView.setText(titleStrings[myIndexAnInt]);
        trafficImageView.setImageResource(iconInts[myIndexAnInt]);
        detailTextView.setText(detailLongStrings[myIndexAnInt]);

    }   //Change View

    private void bindWidget() {

        titleTextView = (TextView) findViewById(R.id.textView4);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);
        detailTextView = (TextView) findViewById(R.id.textView5);
        preButton = (Button) findViewById(R.id.button2);
        backButton = (Button) findViewById(R.id.button3);
        nextButton = (Button) findViewById(R.id.button4);

    }


}   //Main Class



//dp independent pixel ปรับสัดส่วนตามจอ
//buttom ด้านล่าง เลือก 3 ปุ่ม แล้ว layoutweight = 1