package com.facebook.common.jobscheduler.compat;

import X.AnonymousClass0fD;
import X.C278864xe;
import android.app.job.JobService;
import android.content.Intent;

public abstract class JobServiceCompat extends JobService {
    public abstract C278864xe A00();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.common.jobscheduler.compat.JobServiceCompat.onStartJob(android.app.job.JobParameters):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final boolean onStartJob(android.app.job.JobParameters r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.common.jobscheduler.compat.JobServiceCompat.onStartJob(android.app.job.JobParameters):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.jobscheduler.compat.JobServiceCompat.onStartJob(android.app.job.JobParameters):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.common.jobscheduler.compat.JobServiceCompat.onStopJob(android.app.job.JobParameters):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final boolean onStopJob(android.app.job.JobParameters r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.common.jobscheduler.compat.JobServiceCompat.onStopJob(android.app.job.JobParameters):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.jobscheduler.compat.JobServiceCompat.onStopJob(android.app.job.JobParameters):boolean");
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0fD.A04(-1247149497);
        A00();
        AnonymousClass0fD.A0B(925118995, A04);
        return 2;
    }
}
