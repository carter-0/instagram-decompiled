package com.instagram.backgroundsync;

import X.09i;
import X.0Tu;
import X.0kg;
import X.0qQ;
import X.0wb;
import X.182;
import X.1B2;
import X.2Hz;
import X.AnonymousClass1B0;
import X.AnonymousClass1B1;
import X.AnonymousClass2jI;
import X.AnonymousClass5BJ;
import X.C227452jL;
import X.C271004hk;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.keepalive.RealtimeClientKeepAlive;

public final class BackgroundSyncJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        C271004hk.A01(jobParameters, this, true);
        0qQ.A0B(jobParameters, 0);
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        0qQ.A0B(jobParameters, 0);
        AnonymousClass5BJ r1 = AnonymousClass5BJ.A00;
        Context applicationContext = getApplicationContext();
        0qQ.A07(applicationContext);
        try {
            UserSession A05 = 09i.A0A.A05(r1);
            if (A05 instanceof UserSession) {
                UserSession userSession = A05;
                if (!userSession.hasEnded()) {
                    if (!C227452jL.A00(A05).booleanValue() && !182.A06(0Tu.A05, A05, 36321168327713931L)) {
                        return false;
                    }
                    long j = AnonymousClass1B0.A02;
                    if (!AnonymousClass1B1.A00(A05).A00(1B2.A0V)) {
                        2Hz.A00(userSession).A07 = true;
                        RealtimeClientKeepAlive.getInstance(userSession).doKeepAlive("periodic_sync");
                    }
                    AnonymousClass2jI A00 = AnonymousClass2jI.A03.A00(applicationContext, userSession);
                    UserSession userSession2 = A00.A01;
                    if (!C227452jL.A00(userSession2).booleanValue() && !182.A06(0Tu.A05, userSession2, 36321168327713931L)) {
                        return false;
                    }
                    AnonymousClass2jI.A01(A00);
                    return false;
                }
            }
        } catch (Exception e) {
            0wb.A02(0kg.A09, "BackgroundSyncExecutor", "Exception in BackgroundSyncExecutor", e);
        }
        return false;
    }
}
