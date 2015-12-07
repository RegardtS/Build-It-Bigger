package regimeister.displayjokelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity_main);


        try {
            String joke = getIntent().getExtras().getString("joke");
            ((TextView)findViewById(R.id.txt_main)).setText(joke+"edit");
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"no bundle :(",Toast.LENGTH_LONG).show();
            Log.wtf("regi",">>"  + e.getMessage());
        }




    }
}
