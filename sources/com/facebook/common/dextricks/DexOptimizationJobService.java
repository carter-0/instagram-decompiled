package com.facebook.common.dextricks;

import android.app.job.JobService;

public class DexOptimizationJobService extends JobService {
    public static final int JOB_ID = -87105850;
    public static final String KEY_SCHEDULED_AT = "scheduledAt";
    public static final String TAG = "DexOptimizationJobService";

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.common.dextricks.DexOptimizationJobService.onStartJob(android.app.job.JobParameters):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public boolean onStartJob(android.app.job.JobParameters r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.common.dextricks.DexOptimizationJobService.onStartJob(android.app.job.JobParameters):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptimizationJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.facebook.common.dextricks.DexOptimizationJobService.onStopJob(android.app.job.JobParameters):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public boolean onStopJob(android.app.job.JobParameters r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.facebook.common.dextricks.DexOptimizationJobService.onStopJob(android.app.job.JobParameters):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptimizationJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
