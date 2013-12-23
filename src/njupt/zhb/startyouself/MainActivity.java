package njupt.zhb.startyouself;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-6-7  Nanjing,njupt,China
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new Thread() {
            public void run() {
                try { 
                    /*10秒后关闭页面*/
                    sleep(10000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    finish(); //关闭页面
                }
            }
        }.start();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
