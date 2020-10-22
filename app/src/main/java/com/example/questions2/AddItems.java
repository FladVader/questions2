package com.example.questions2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.util.HashMap;

public class AddItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);






        findViewById(R.id.btn_add_jagharaldrig).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textField = (EditText)findViewById(R.id.input_jagharaldrig);
                String str = textField.getText().toString();

                final String URL = "https://questions2backend.herokuapp.com/add/jagharaldrig";
                HashMap<String, String> params = new HashMap<String, String>();
                params.put("statement", str);
               // params.put("name", item.getName());
               // params.put("type", item.getType());
               // params.put("ean", item.getEan());

                JsonObjectRequest postRequest = new JsonObjectRequest( Request.Method.POST, URL, new JSONObject(params), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("TAG", "onResponse() called with: response = [" + response + "]");
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("TAG", "onErrorResponse() called with: error = [" + error + "]");
                        //"VolleyLog.d();"

                    }});
                MainActivity.getRequestQueue().add(postRequest);



                       /*
                        response -> {
                            try {
                                VolleyLog.v("Response:%n %s", response.toString(4));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                           // updateList();
                        }, error -> VolleyLog.e("Error: ", error));

*/
            }
        });


    }
}
