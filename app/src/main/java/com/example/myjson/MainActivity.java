package com.example.myjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set();
        Log.d("abcd", "onCreate: ");
    }

    private void set() {
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("one","one");
            jsonObject.put("two","two");
            JSONArray jsonArray = new JSONArray();
            jsonArray.put(jsonObject.toString());
            
            JSONObject jsonObject1 = new JSONObject();
            jsonObject1.put("message",jsonArray.toJSONObject(jsonArray));//转换的string中\少
//            jsonObject1.put("root",jsonArray.toString());//转换的string中\多
            Log.d("abcd", "set333: "+jsonObject1.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
