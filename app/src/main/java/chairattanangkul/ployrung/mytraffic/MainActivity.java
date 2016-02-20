package chairattanangkul.ployrung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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


    }   //Main Method

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.bee);
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
