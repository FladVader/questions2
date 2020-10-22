package com.example.questions2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.util.HashMap;

public class AddItems extends AppCompatActivity {

    private static final String TAG = "AddItems";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);

        findViewById(R.id.btn_add_mesttrolig).setOnClickListener(listener);
        findViewById(R.id.btn_add_jagharaldrig).setOnClickListener(listener);

    }


    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String URL = "";
            String str = "";

            if (v.getId() == R.id.btn_add_mesttrolig){

                str = ((TextView) ((View)v.getParent()).findViewById(R.id.input_mesttrolig)).getText().toString();
                URL = "https://questions2backend.herokuapp.com/add/mesttrolig";

            }else if (v.getId() == R.id.btn_add_jagharaldrig){

                str = ((TextView) ((View)v.getParent()).findViewById(R.id.input_jagharaldrig)).getText().toString();
                URL = "https://questions2backend.herokuapp.com/add/jagharaldrig";

            }

            HashMap<String, String> params = new HashMap<String, String>();
            params.put("statement", str);

            JsonObjectRequest postRequest = new JsonObjectRequest(Request.Method.POST, URL, new JSONObject(params), new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {

                    Toast.makeText(getApplicationContext(), response.toString(), Toast.LENGTH_SHORT).show();
                    finish();

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                    Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    finish();
                }
            });

            MainActivity.getRequestQueue().add(postRequest);
        }
    };
}

