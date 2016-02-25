package aixuran.com.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    String data = "{\"data\":{\"data\":\"很多钱\",\"name\":\"line\",\"age\":\"1\"}}";
    @Bind(R.id.tv)
    TextView tv;
    @Bind(R.id.layout)
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tv.setText("我是来自注解");
        Gson gson = new Gson();
        aaa a = gson.fromJson(data, aaa.class);
        Log.e("tag",a.getData().getData());
//        gson.toJson(data,aaa.class);
//        JSONObject obj = new JSONObject();
//        JSONObject obj_data = new JSONObject();
//        try {
//            obj_data.put("age","1");
//            obj_data.put("name","line");
//            obj_data.put("data","很多钱");
//            obj.put("data",obj_data);
//            Log.e("tag",obj.toString());
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }
}
