package com.example.slt_android_04_lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;
/**
 * 实现播放视频
 * @author jj
 *
 */
public class VideoActivity extends Activity {

	private VideoView video;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video);
		
		if (video == null) {
			
			video = (VideoView)findViewById(R.id.videoView1);	
			
			MediaController  mediaController = new  MediaController(this);//当前上下文，设置实现暂停，播放，上一集，下一集的控件
			video.setMediaController(mediaController);//播放控制条
			//video.setVideoPath(path);
			

		}
	}
}
