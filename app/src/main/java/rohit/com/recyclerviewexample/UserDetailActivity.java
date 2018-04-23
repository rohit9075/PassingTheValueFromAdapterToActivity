package rohit.com.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class UserDetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);


        String name = getIntent().getStringExtra("name");
        String city = getIntent().getStringExtra("city");

        Toast.makeText(this, "Name : " + name + "City : " + city , Toast.LENGTH_LONG).show();



    }
}
