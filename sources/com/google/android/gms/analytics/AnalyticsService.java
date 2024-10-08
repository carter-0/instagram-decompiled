package com.google.android.gms.analytics;

import X.AnonymousClass0fD;
import X.C11381SQt;
import X.C13642Te9;
import X.C66580MXl;
import X.C8485QvX;
import X.Pxg;
import X.SH4;
import X.ST5;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

public final class AnalyticsService extends Service implements C13642Te9 {
    public SH4 A00;

    public final IBinder onBind(Intent intent) {
        if (this.A00 != null) {
            return null;
        }
        this.A00 = new SH4(this);
        return null;
    }

    public final void FP3(JobParameters jobParameters, boolean z) {
        throw C66580MXl.A11();
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(290715201);
        super.onCreate();
        SH4 sh4 = this.A00;
        if (sh4 == null) {
            sh4 = new SH4(this);
            this.A00 = sh4;
        }
        C8485QvX qvX = C11381SQt.A01(sh4.A00).A0C;
        C11381SQt.A02(qvX);
        ST5.A0B(qvX, "Local AnalyticsService is starting up", 2);
        AnonymousClass0fD.A0B(1563828197, A04);
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0fD.A04(-657970395);
        SH4 sh4 = this.A00;
        if (sh4 == null) {
            sh4 = new SH4(this);
            this.A00 = sh4;
        }
        C8485QvX qvX = C11381SQt.A01(sh4.A00).A0C;
        C11381SQt.A02(qvX);
        ST5.A0B(qvX, "Local AnalyticsService is shutting down", 2);
        super.onDestroy();
        AnonymousClass0fD.A0B(1303338529, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A01 = Pxg.A01(this, intent, -279201795);
        SH4 sh4 = this.A00;
        if (sh4 == null) {
            sh4 = new SH4(this);
            this.A00 = sh4;
        }
        int A012 = sh4.A01(intent, i2);
        AnonymousClass0fD.A0B(168731270, A01);
        return A012;
    }
}
