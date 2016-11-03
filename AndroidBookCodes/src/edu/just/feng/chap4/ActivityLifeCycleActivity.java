package edu.just.feng.chap4;


import com.example.androidbookcodes.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**   
*    
* ��Ŀ���ƣ�AndroidBookCodes   
* �����ƣ�ActivityLifeCycleActivity   
* �������� ͨ��ʾ�����Activity�¼��ص������ĵ���˳��
* �����ˣ�Feng   
* ����ʱ�䣺2016-11-3 ����9:03:13   
* �޸��ˣ�Feng   
* �޸�ʱ�䣺2016-11-3 ����9:03:13   
* �޸ı�ע��   
*       
*/
public class ActivityLifeCycleActivity extends Activity {

	private static String TAG = "LIFECYCLE";
	
	//��ȫ�������ڿ�ʼʱ�����ã���ʼ��Activity
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(TAG,"(1) onCreate()");
		
		//���尴ť�Ͱ�ť����������ͨ���û������ť����finish()������������
		Button button = (Button)findViewById(R.id.btn_finish);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}
	
    //�����������ڿ�ʼʱ�����ã����û�������б�Ҫ���޸�
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(TAG, "(2) onStart()");
	}
	
    //��onStart()�󱻵��ã����ڻָ�onSaveInstanceState()������û�������Ϣ
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
		Log.i(TAG, "(3) onRestoreInstanceState()");
	}
	
	//�ڻ�������ڿ�ʼʱ�����ã��ָ���onPause()ֹͣ�����ڽ�����µ���Դ
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(TAG, "(4) onResume()");
	}
	
	//��onPause()�󱻵��ã����������ʱ��Ϣ
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		Log.i(TAG, "(5) onSaveInstanceState()");
	}
	
	//�����½��������������ǰ�����ã������������Ҫ�ĸ�����Ϣ
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(TAG, "(6) onRestart()");
	}
	
	//�ڻ�������ڽ���ʱ�����ã���������־õ����ݻ��ͷ�ռ�õ���Դ
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(TAG, "(7) onPause()");
	}
	
	//�ڿ����������ڽ���ʱ�����ã������ͷ�ռ�õ���Դ
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i(TAG, "(8) onStop()");
	}
	
	//����ȫ�������ڽ���ʱ�����ã��ͷ���Դ�������̡߳��������ӵ�
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(TAG, "(9) onDestory()");
	}







	
	

}
