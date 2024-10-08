package com.instagram.push;

import X.0fR;
import android.app.job.JobParameters;
import android.app.job.JobService;

public final class RefreshPushTokenJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r3 <= 0) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r14) {
        /*
            r13 = this;
            X.C271004hk.A00(r14, r13)
            com.facebook.quicklog.QuickPerformanceLogger r8 = com.facebook.quicklog.QuickPerformanceLoggerProvider.getQPLInstance()
            if (r8 != 0) goto L_0x000b
            X.0eg r8 = com.facebook.quicklog.QuickPerformanceLoggerProvider.A01
        L_0x000b:
            r7 = 813776631(0x30813ef7, float:9.403881E-10)
            r8.markerStart(r7)
            X.0eM r4 = X.AnonymousClass9D9.A00
            java.lang.Object r2 = r4.getValue()
            X.0xa r2 = (X.0xa) r2
            r0 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0051
            java.lang.Object r3 = r4.getValue()
            X.0xa r3 = (X.0xa) r3
            r0 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1 = 0
            long r5 = r3.getLong(r0, r1)
            java.lang.Object r3 = r4.getValue()
            X.0xa r3 = (X.0xa) r3
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r3 = r3.getLong(r0, r1)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            r12 = 1
            if (r1 == 0) goto L_0x00c2
            if (r14 == 0) goto L_0x00bd
            android.os.PersistableBundle r3 = r14.getExtras()
            r1 = -1
            if (r3 == 0) goto L_0x00bd
            r0 = 1749(0x6d5, float:2.451E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            long r10 = r3.getLong(r0, r1)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            X.0wX r9 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r9)
            X.0xa r5 = r0.A00
            java.lang.String r2 = "last_push_token_successful_refresh"
            r0 = 0
            long r2 = r5.getLong(r2, r0)
            java.lang.String r4 = "last_push_token_refresh_attempt_via_background_job"
            long r0 = r5.getLong(r4, r0)
            long r5 = java.lang.Math.max(r2, r0)
            long r5 = r5 + r10
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r1 = r0.getTime()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bd
            java.lang.String r0 = "refresh_token_start"
            r8.markerPoint(r7, r0)
            X.0xm r3 = X.AnonymousClass0xl.A00(r9)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r1 = r0.getTime()
            X.0xa r0 = r3.A00
            X.0xY r0 = r0.AR4()
            r0.E5c(r4, r1)
            r0.apply()
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.AnonymousClass3FH.A02(r0)
            java.lang.String r0 = "refresh_token_end"
            r8.markerPoint(r7, r0)
        L_0x00bd:
            r0 = 2
        L_0x00be:
            r8.markerEnd(r7, r0)
            return r12
        L_0x00c2:
            android.content.Context r1 = r13.getApplicationContext()
            X.0qQ.A07(r1)
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r1 = r1.getSystemService(r0)
            boolean r0 = r1 instanceof android.app.job.JobScheduler
            if (r0 == 0) goto L_0x00dd
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1
            if (r1 == 0) goto L_0x00dd
            r0 = 1560068420(0x5cfcc144, float:5.69153535E17)
            r1.cancel(r0)
        L_0x00dd:
            r0 = 4
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.push.RefreshPushTokenJobService.onStartJob(android.app.job.JobParameters):boolean");
    }
}
