package chairattanangkul.ployrung.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //ประกาศตัวแปรในคลาสเหนือ method
    //Explicit บอก device ว่า ram พอป่าว
    //ship + ctrl + enter มันจะเติม สัญลักษณ์ข้างหลังให้ , ctrl +atl +L จะเรียงความสวย ctrl + space จะ suggest ให้

    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }   //Main Method
}   //Main Class
