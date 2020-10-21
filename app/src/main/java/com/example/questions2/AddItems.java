package com.example.questions2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AddItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);
/*
        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textField = (EditText)findViewById(R.id.input_grej);
                String str = textField.getText().toString();

                final String URL = "https://nameless-sands-01228.herokuapp.com/addItem";
                HashMap<String, String> params = new HashMap<String, String>();
                params.put("String", str);
               // params.put("name", item.getName());
               // params.put("type", item.getType());
               // params.put("ean", item.getEan());

                JsonObjectRequest postRequest = new JsonObjectRequest(Request.Method.POST, url, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("TAG", "onResponse() called with: response = [" + response + "]");
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("TAG", "Error: " + error.getMessage());

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


            }
        });
  */

    }
}
