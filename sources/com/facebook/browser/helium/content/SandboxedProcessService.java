package com.facebook.browser.helium.content;

import android.app.Service;

public class SandboxedProcessService extends Service {
    public static long A01;
    public Object A00 = null;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.browser.helium.content.SandboxedProcessService.onBind(android.content.Intent):android.os.IBinder, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.os.IBinder onBind(android.content.Intent r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.browser.helium.content.SandboxedProcessService.onBind(android.content.Intent):android.os.IBinder, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.helium.content.SandboxedProcessService.onBind(android.content.Intent):android.os.IBinder");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.browser.helium.content.SandboxedProcessService.onDestroy():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void onDestroy() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.browser.helium.content.SandboxedProcessService.onDestroy():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.helium.content.SandboxedProcessService.onDestroy():void");
    }
}
