package com.example.questions2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

                JsonObjectRequest postRequest = new JsonObjectRequest( Request.Method.POST, URL, new JSONObject(params), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("TAG", "onResponse() called with: response = [" + response + "]");
                        finish();
                        Toast.makeText(getApplicationContext(),response.toString(), Toast.LENGTH_SHORT).show();


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("TAG", "onErrorResponse() called with: error = [" + error + "]");
                        Toast.makeText(getApplicationContext(),error.getMessage(), Toast.LENGTH_SHORT).show();

                        //"VolleyLog.d();"
                        finish();
                    }});
                MainActivity.getRequestQueue().add(postRequest);
    }



        });

        findViewById(R.id.btn_add_mesttrolig).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textField = (EditText) findViewById(R.id.input_mesttrolig);
                String str = textField.getText().toString();

                final String URL = "https://questions2backend.herokuapp.com/add/jagharaldrig";
                HashMap<String, String> params = new HashMap<String, String>();
                params.put("statement", str);

                JsonObjectRequest postRequest = new JsonObjectRequest(Request.Method.POST, URL, new JSONObject(params), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("TAG", "onResponse() called with: response = [" + response + "]");
                        finish();
                        Toast.makeText(getApplicationContext(),response.toString(), Toast.LENGTH_SHORT).show();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("TAG", "onErrorResponse() called with: error = [" + error + "]");
                        Toast.makeText(getApplicationContext(),error.getMessage(), Toast.LENGTH_SHORT).show();

                        //"VolleyLog.d();"
                        finish();
                    }
                });
                MainActivity.getRequestQueue().add(postRequest);

            }
        });
    }
}
