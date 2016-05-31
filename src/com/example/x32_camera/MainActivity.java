package com.example.x32_camera;

import java.io.File;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    
    public void image(View v){
    	//����ϵͳ�ṩ������activity
    	Intent intent = new Intent();
    	intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
    	intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(Environment.getExternalStorageDirectory(),"photo.jpg")));
    	startActivityForResult(intent, 10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	if(requestCode == 10){
    		Toast.makeText(this, "���ճɹ�", Toast.LENGTH_SHORT).show();
    	}else if(requestCode == 20){
    		Toast.makeText(this, "¼��ɹ�", Toast.LENGTH_SHORT).show();
    	}
    	
    }
   
    
    
    public void video(View v){
    	//����ϵͳ�ṩ������activity
    	Intent intent = new Intent();
    	intent.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
    	intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(Environment.getExternalStorageDirectory(),"video.3gp")));
    	intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
    	startActivityForResult(intent, 20);
    	
    }
}
