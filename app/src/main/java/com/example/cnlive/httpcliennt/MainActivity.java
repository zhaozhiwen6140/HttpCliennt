package com.example.cnlive.httpcliennt;

import android.content.Entity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
//       在子线程中运行即可，因为访问网络是耗时操作。post的访问方式
//        HttpClient httpClient=new DefaultHttpClient();
//        HttpPost httpPost=new HttpPost("https://www.baidu.com/");
//        List<NameValuePair> params=new ArrayList<NameValuePair>();
//        params.add(new BasicNameValuePair("name","hava"));
//        params.add(new BasicNameValuePair("admin","123456"));
//        UrlEncodedFormEntity encodedFormEntity=new UrlEncodedFormEntity(params,"utf-8");
//        httpPost.setEntity(encodedFormEntity);
        //       HttpResponse httpResponse=httpClient.execute(httpPost);
//        if(httpResponse.getStatusLine().getStatusCode()==200){
//            HttpEntity entity=httpResponse.getEntity();
//            String str=EntityUtils.toString(entity,"utf-8");
//        }
        //        get方法的访问方式:
//        HttpClient httpClient=new DefaultHttpClient();
//        HttpGet httpGet=new HttpGet("https://www.baidu.com/");
//        HttpResponse httpResponse=httpClient.execute(httpGet);
//        if(httpResponse.getStatusLine().getStatusCode()==200){
//            HttpEntity entity=httpResponse.getEntity();
//            String str=EntityUtils.toString(entity,"utf-8");
//        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
