package com.facebook.papaya.fb.instagram.papaya;

import X.0fR;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C10742RxL;
import X.C12964TFx;
import X.C12966TFz;
import X.C13349TVw;
import X.C271004hk;
import X.Pxe;
import X.S3J;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class PapayaExecutionJobService extends JobService {
    public C10742RxL A00;
    public ExecutorService A01;

    public final synchronized boolean onStartJob(JobParameters jobParameters) {
        boolean z;
        synchronized (this) {
            C271004hk.A00(jobParameters, this);
            try {
                UserSession A0a = Pxe.A0a(this);
                AnonymousClass7TG.A1N(this, A0a);
                if (((S3J) A0a.A01(S3J.class, new C13349TVw(2, this, A0a))).A07) {
                    ExecutorService executorService = this.A01;
                    if (executorService == null) {
                        executorService = Executors.newSingleThreadExecutor();
                        this.A01 = executorService;
                    }
                    executorService.execute(new C12966TFz(jobParameters, this));
                    z = true;
                }
            } catch (IllegalStateException unused) {
            }
            z = false;
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final synchronized boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        C10742RxL rxL = this.A00;
        if (rxL != null) {
            rxL.A04.execute(new C12964TFx(rxL, new Object()));
        }
        return false;
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(-2038292478);
        super.onCreate();
        AnonymousClass0fD.A0B(1604463720, A04);
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0fD.A04(724985562);
        super.onDestroy();
        AnonymousClass0fD.A0B(-1091795650, A04);
    }
}
