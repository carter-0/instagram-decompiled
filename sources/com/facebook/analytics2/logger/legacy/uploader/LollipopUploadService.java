package com.facebook.analytics2.logger.legacy.uploader;

import X.0KC;
import X.0Sd;
import X.1uw;
import X.AnonymousClass000;
import X.AnonymousClass0eV;
import X.AnonymousClass0fD;
import X.C251463n9;
import X.C258093yS;
import X.C270404gg;
import X.C271004hk;
import X.C275324px;
import X.Pxd;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.PersistableBundle;
import com.facebook.common.build.BuildConstants;

public class LollipopUploadService extends JobService {
    public C251463n9 A00;

    public final boolean onStopJob(JobParameters jobParameters) {
        C271004hk.A01(jobParameters, this, true);
        C251463n9 r1 = this.A00;
        if (r1 != null) {
            r1.A03(jobParameters.getJobId());
        }
        return true;
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(1518969629);
        ConditionVariable conditionVariable = AnonymousClass0eV.A00;
        this.A00 = C251463n9.A00(this);
        AnonymousClass0fD.A0B(1318666777, A04);
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0fD.A04(-2137746405);
        super.onDestroy();
        this.A00 = null;
        AnonymousClass0fD.A0B(1150396897, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0fD.A04(-2051245152);
        C251463n9 r1 = this.A00;
        0Sd.A00(r1);
        int A02 = r1.A02(intent, new C270404gg(this, i2));
        AnonymousClass0fD.A0B(948061333, A04);
        return A02;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            0KC.A0C("PostLolliopUploadService", AnonymousClass000.A00(453));
        } else {
            try {
                if (BuildConstants.A01() == extras.getInt("__VERSION_CODE", 0)) {
                    z = true;
                }
            } catch (Exception e) {
                0KC.A0G("PostLolliopUploadService", Pxd.A00(461), e);
            }
        }
        if (!z) {
            jobParameters.getJobId();
            return false;
        }
        ConditionVariable conditionVariable = AnonymousClass0eV.A00;
        try {
            C251463n9 r5 = this.A00;
            0Sd.A00(r5);
            int jobId = jobParameters.getJobId();
            r5.A04(new 1uw(new Bundle(jobParameters.getExtras())), new C275324px(jobParameters, this), jobParameters.getExtras().getString("action"), jobId);
            return true;
        } catch (C258093yS e2) {
            0KC.A0H("PostLolliopUploadService", Pxd.A00(530), e2);
            return false;
        }
    }
}
