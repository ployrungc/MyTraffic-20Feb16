package chairattanangkul.ployrung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //ประกาศตัวแปรในคลาสเหนือ method
    //Explicit บอก device ว่า ram พอป่าว
    //ship + ctrl + enter มันจะเติม สัญลักษณ์ข้างหลังให้ , ctrl +atl +L จะเรียงความสวย ctrl + space จะ suggest ให้ alt+enter

    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bind widget
        bindWidget();

        //Button Controller
        buttonController();

        //ListView Controller
        listViewController();

        // listViewController(); = ตั้งชื่อเอง ใช่วงเล็บเพื่อสร้าง method complete sentence then alt + enter จะเสนอสร้าง method ให้

    }   //Main Method

    private void listViewController() {

        //Create ListView
        //drive array 3 types
        //Type1

        final int[] iconInts = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20,};

        //Type2 ถ้าแบบที่ 1 ต้องใส่ "" สำหรับ string
        //แบบสอง จองหน่วยความจำ  copy past then ctrl+alt+L เรียงโค้ด

        final String[] titleStrings = new String[20];
        titleStrings[0] = "หัวข้อหลักที่ 1";
        titleStrings[1] = "หัวข้อหลักที่ 2";
        titleStrings[2] = "หัวข้อหลักที่ 3";
        titleStrings[3] = "หัวข้อหลักที่ 4";
        titleStrings[4] = "หัวข้อหลักที่ 5";
        titleStrings[5] = "หัวข้อหลักที่ 6";
        titleStrings[6] = "หัวข้อหลักที่ 7";
        titleStrings[7] = "หัวข้อหลักที่ 8";
        titleStrings[8] = "หัวข้อหลักที่ 9";
        titleStrings[9] = "หัวข้อหลักที่ 10";
        titleStrings[10] = "หัวข้อหลักที่ 11";
        titleStrings[11] = "หัวข้อหลักที่ 12";
        titleStrings[12] = "หัวข้อหลักที่ 13";
        titleStrings[13] = "หัวข้อหลักที่ 14";
        titleStrings[14] = "หัวข้อหลักที่ 15";
        titleStrings[15] = "หัวข้อหลักที่ 16";
        titleStrings[16] = "หัวข้อหลักที่ 17";
        titleStrings[17] = "หัวข้อหลักที่ 18";
        titleStrings[18] = "หัวข้อหลักที่ 19";
        titleStrings[19] = "หัวข้อหลักที่ 20";

        //Type3 ทำ xml เพิ่ม โดย วางเมาส์ที่ value alt+insert เลือก value resource file
        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        //Sent Value to Adapter (ถ้าพิมผิด เอาเคอเซอวาง alt+Ent)
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, iconInts, titleStrings, detailStrings);
        trafficListView.setAdapter(myAdapter);

        //ListView Active When Click by Item

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                // จากที่ไหน .this ไปที่ไหน .class
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);


                //ทำ intent และ put extra โดยการ โยน array ของ รูป และ title และ index ไปด้วย ลิ้ง 2 หน้าหลังจากคลิกหน้าแรก เลยต้องมาทำที่ ลิสวิว
                intent.putExtra("Title", titleStrings);
                intent.putExtra("Image", iconInts);
                intent.putExtra("Index", i);
                // ละไปเขียนรับค่าหน้า detail

                startActivity(intent);

            }   //event
        });


    }   // listViewController

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.bee);
                mediaPlayer.start();

                //Web View, action view จะถามว่าจะเปิดด้วย browser ไหน
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/6GUm5g8SG4o"));
                startActivity(intent);


            }   // event
        });

    }   //buttonController ชื่อ method อะไรก็ได้เพื่อสื่อ ได้จาก alt+enter ใส่วงเล็บ เพื่อแสดงว่าเป็น method

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }
}   //Main Class
