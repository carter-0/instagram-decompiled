package com.facebook.browser.helium.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class PrivilegedProcessService0 extends Service {
    public ChildProcessServiceBridge A00 = null;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.browser.helium.content.PrivilegedProcessService0.onCreate():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onCreate() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.browser.helium.content.PrivilegedProcessService0.onCreate():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.helium.content.PrivilegedProcessService0.onCreate():void");
    }

    public final IBinder onBind(Intent intent) {
        ChildProcessServiceBridge childProcessServiceBridge = this.A00;
        if (childProcessServiceBridge != null) {
            return childProcessServiceBridge.onBind(intent);
        }
        return null;
    }

    public final void onDestroy() {
        super.onDestroy();
        ChildProcessServiceBridge childProcessServiceBridge = this.A00;
        if (childProcessServiceBridge != null) {
            childProcessServiceBridge.onDestroy();
            this.A00 = null;
        }
    }
}
