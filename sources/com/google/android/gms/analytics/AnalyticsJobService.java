package com.google.android.gms.analytics;

import X.0fR;
import X.AnonymousClass0fD;
import X.C11200SFa;
import X.C11381SQt;
import X.C13642Te9;
import X.C271004hk;
import X.C8481QvT;
import X.C8485QvX;
import X.SH4;
import X.ST5;
import X.SyH;
import X.TH9;
import X.TJ3;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;

public final class AnalyticsJobService extends JobService implements C13642Te9 {
    public SH4 A00;

    public final void FP3(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        return false;
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(79434226);
        super.onCreate();
        SH4 sh4 = this.A00;
        if (sh4 == null) {
            sh4 = new SH4(this);
            this.A00 = sh4;
        }
        C8485QvX qvX = C11381SQt.A01(sh4.A00).A0C;
        C11381SQt.A02(qvX);
        ST5.A0B(qvX, "Local AnalyticsService is starting up", 2);
        AnonymousClass0fD.A0B(1600208358, A04);
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0fD.A04(-1496486914);
        SH4 sh4 = this.A00;
        if (sh4 == null) {
            sh4 = new SH4(this);
            this.A00 = sh4;
        }
        C8485QvX qvX = C11381SQt.A01(sh4.A00).A0C;
        C11381SQt.A02(qvX);
        ST5.A0B(qvX, "Local AnalyticsService is shutting down", 2);
        super.onDestroy();
        AnonymousClass0fD.A0B(-1074823759, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0fD.A04(-742697436);
        SH4 sh4 = this.A00;
        if (sh4 == null) {
            sh4 = new SH4(this);
            this.A00 = sh4;
        }
        int A01 = sh4.A01(intent, i2);
        AnonymousClass0fD.A0B(-238538585, A04);
        return A01;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        SH4 sh4 = this.A00;
        if (sh4 == null) {
            sh4 = new SH4(this);
            this.A00 = sh4;
        }
        Context context = sh4.A00;
        C8485QvX qvX = C11381SQt.A01(context).A0C;
        C11381SQt.A02(qvX);
        String string = jobParameters.getExtras().getString("action");
        qvX.A0E("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        TJ3 tj3 = new TJ3(jobParameters, qvX, sh4);
        C8481QvT qvT = C11381SQt.A01(context).A06;
        C11381SQt.A02(qvT);
        SyH syH = new SyH(sh4, tj3);
        qvT.A0J();
        C11200SFa A002 = C11381SQt.A00(qvT);
        A002.A02.submit(new TH9(qvT, syH));
        return true;
    }
}
