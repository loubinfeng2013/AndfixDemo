package com.loubinfeng.www.andfixdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.loubinfeng.www.andfixdemo.andfix.AndFixManager;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static final String FILE_END = ".apatch";

    private TextView resultView;
    private String mPatchDir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView = (TextView)findViewById(R.id.result_view);
        mPatchDir = getExternalCacheDir().getAbsolutePath()+"/apatch/";
        File file = new File(mPatchDir);
        if (file == null || !file.exists()){
            file.mkdirs();
        }
    }

    public void handleCrash(View view){
        fixBugMethod();
    }

    public void handleAndfix(View view){
        AndFixManager.getAndFixManager().addPatch(mPatchDir.concat("fix").concat(FILE_END));
    }

    private void fixBugMethod(){
        resultView.setText("app fix bug succes");
    }
}
