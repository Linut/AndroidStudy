package edu.just.feng.chap4;


import com.example.androidbookcodes.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**   
*    
* 项目名称：AndroidBookCodes   
* 类名称：ActivityLifeCycleActivity   
* 类描述： 通过示例理解Activity事件回调函数的调用顺序
* 创建人：Feng   
* 创建时间：2016-11-3 上午9:03:13   
* 修改人：Feng   
* 修改时间：2016-11-3 上午9:03:13   
* 修改备注：   
*       
*/
public class ActivityLifeCycleActivity extends Activity {

	private static String TAG = "LIFECYCLE";
	//完全生命周期开始时被调用，初始化Activity

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(TAG,"(1) onCreate()");
		
		//定义按钮和按钮监听函数，通过用户点击按钮调用finish()函数结束程序
		Button button = (Button)findViewById(R.id.btn_finish);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	

}
