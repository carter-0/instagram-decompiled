package com.facebook.analytics2.logger.legacy.uploader;

import X.00n;
import X.0KC;
import X.0Sd;
import X.1uw;
import X.AnonymousClass000;
import X.AnonymousClass0eV;
import X.C12013SkX;
import X.C251463n9;
import X.C258093yS;
import X.C270404gg;
import X.C585200m;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.PersistableBundle;
import com.facebook.common.build.BuildConstants;

public class LollipopUploadServiceDelegate extends C585200m {
    public C251463n9 A00;

    public final int A00(Intent intent, int i, int i2) {
        ConditionVariable conditionVariable = AnonymousClass0eV.A00;
        C251463n9 r2 = this.A00;
        0Sd.A00(r2);
        return r2.A02(intent, new C270404gg(this.A01, i2));
    }

    public final void A02() {
        ConditionVariable conditionVariable = AnonymousClass0eV.A00;
        this.A00 = C251463n9.A00(this.A01);
    }

    public final boolean A04(JobParameters jobParameters) {
        C251463n9 r1 = this.A00;
        if (r1 == null) {
            return true;
        }
        r1.A03(jobParameters.getJobId());
        return true;
    }

    public final void A01() {
        super.A01();
        this.A00 = null;
    }

    public final boolean A03(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            0KC.A0C("LollipopUploadServiceDel", AnonymousClass000.A00(453));
        } else {
            try {
                if (BuildConstants.A01() == extras.getInt("__VERSION_CODE", 0)) {
                    z = true;
                }
            } catch (Exception e) {
                0KC.A0G("LollipopUploadServiceDel", "Corrupt bundle, cancelling job", e);
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
            r5.A04(new 1uw(new Bundle(jobParameters.getExtras())), new C12013SkX(jobParameters, this), jobParameters.getExtras().getString("action"), jobId);
            return true;
        } catch (C258093yS e2) {
            0KC.A0H("LollipopUploadServiceDel", "Misunderstood job service extras: %s", e2);
            return false;
        }
    }

    public LollipopUploadServiceDelegate(00n r1) {
        super(r1);
    }
}
