package X;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* renamed from: X.0vZ  reason: invalid class name and case insensitive filesystem */
public final class C62760vZ extends JobServiceEngine implements AnonymousClass029 {
    public JobParameters A00;
    public final 02C A01;
    public final Object A02 = new Object();

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0vZ.onStartJob(android.app.job.JobParameters):boolean, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final boolean onStartJob(android.app.job.JobParameters r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0vZ.onStartJob(android.app.job.JobParameters):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62760vZ.onStartJob(android.app.job.JobParameters):boolean");
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean doStopCurrentWork = this.A01.doStopCurrentWork();
        synchronized (this.A02) {
            this.A00 = null;
        }
        return doStopCurrentWork;
    }

    public C62760vZ(02C r2) {
        super(r2);
        this.A01 = r2;
    }
}
