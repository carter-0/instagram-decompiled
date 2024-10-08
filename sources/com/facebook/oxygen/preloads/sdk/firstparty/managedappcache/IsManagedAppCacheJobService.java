package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.0fR;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C11457SVv;
import X.C271004hk;
import X.Pxf;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.HandlerThread;

public class IsManagedAppCacheJobService extends JobService {
    public static HandlerThread A02;
    public Handler A00;
    public volatile boolean A01;

    public final void onCreate() {
        HandlerThread handlerThread;
        int A04 = AnonymousClass0fD.A04(1923869393);
        synchronized (IsManagedAppCacheJobService.class) {
            if (A02 == null) {
                HandlerThread A0I = Pxf.A0I("th-IsManagedAppCacheJobSvc");
                A02 = A0I;
                A0I.start();
            }
            handlerThread = A02;
        }
        this.A00 = new Handler(handlerThread.getLooper(), new C11457SVv(this, 0));
        AnonymousClass0fD.A0B(2020117912, A04);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        this.A01 = false;
        AnonymousClass7TE.A1S(this.A00, jobParameters, 1);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        this.A01 = true;
        return true;
    }
}
