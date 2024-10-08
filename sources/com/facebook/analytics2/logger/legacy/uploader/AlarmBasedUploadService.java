package com.facebook.analytics2.logger.legacy.uploader;

import X.AnonymousClass0fD;
import X.C251463n9;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;

public class AlarmBasedUploadService extends Service {
    public C251463n9 A00;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.analytics2.logger.legacy.uploader.AlarmBasedUploadService.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final int onStartCommand(android.content.Intent r1, int r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.analytics2.logger.legacy.uploader.AlarmBasedUploadService.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics2.logger.legacy.uploader.AlarmBasedUploadService.onStartCommand(android.content.Intent, int, int):int");
    }

    static {
        TimeUnit.MINUTES.toMillis(5);
        TimeUnit.HOURS.toMillis(6);
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(-267131111);
        this.A00 = C251463n9.A00(this);
        AnonymousClass0fD.A0B(-108753737, A04);
    }
}
