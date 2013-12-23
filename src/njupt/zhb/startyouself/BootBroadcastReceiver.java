/*
 * $filename: BootBroadcastReceiver.java,v $
 * $Date: 2013-6-7  $
 * Copyright (C) ZhengHaibo, Inc. All rights reserved.
 * This software is Made by Zhenghaibo.
 */
package njupt.zhb.startyouself;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/*
 *@author: ZhengHaibo  
 *web:     http://blog.csdn.net/nuptboyzhb
 *mail:    zhb931706659@126.com
 *2013-6-7  Nanjing,njupt,China
 */
public class BootBroadcastReceiver extends BroadcastReceiver {
    static final String action_boot="android.intent.action.BOOT_COMPLETED"; 
 
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(action_boot)){ 
            Intent StartIntent=new Intent(context,MainActivity.class); //���յ��㲥����ת��MainActivity
            StartIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
            context.startActivity(StartIntent); 
        }
 
    }
 
}
