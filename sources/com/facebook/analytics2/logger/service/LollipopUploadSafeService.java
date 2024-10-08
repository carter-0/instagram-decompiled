package com.facebook.analytics2.logger.service;

import X.0KC;
import X.0Sd;
import X.0fR;
import X.1uw;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.C12014SkY;
import X.C251463n9;
import X.C258093yS;
import X.C270404gg;
import X.C271004hk;
import X.TZs;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUpload;
import com.facebook.common.build.BuildConstants;

public class LollipopUploadSafeService extends JobService implements TZs {
    public LollipopUpload A00;

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(-1174714972);
        try {
            LollipopUpload lollipopUpload = (LollipopUpload) Class.forName("com.facebook.analytics2.logger.legacy.uploader.LollipopUpload").newInstance();
            this.A00 = lollipopUpload;
            lollipopUpload.A00 = C251463n9.A00(this);
        } catch (Exception e) {
            0KC.A0N("LollipopUploadSafeService", "LollipopUpload failed to be created, className %s", e, new Object[]{"com.facebook.analytics2.logger.legacy.uploader.LollipopUpload"});
        }
        AnonymousClass0fD.A0B(-1140422133, A04);
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0fD.A04(2115989313);
        super.onDestroy();
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload != null) {
            lollipopUpload.A00 = null;
        }
        this.A00 = null;
        AnonymousClass0fD.A0B(-1362703904, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A02;
        int i3;
        int A04 = AnonymousClass0fD.A04(-1465034373);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null) {
            A02 = 1;
            i3 = -2147350927;
        } else {
            C251463n9 r1 = lollipopUpload.A00;
            0Sd.A00(r1);
            A02 = r1.A02(intent, new C270404gg(this, i2));
            i3 = -742844753;
        }
        AnonymousClass0fD.A0B(i3, A04);
        return A02;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            0KC.A0C("PostLolliopUploadService", AnonymousClass000.A00(453));
        } else {
            try {
                if (BuildConstants.A01() == extras.getInt("__VERSION_CODE", 0)) {
                    try {
                        C251463n9 r4 = lollipopUpload.A00;
                        0Sd.A00(r4);
                        int jobId = jobParameters.getJobId();
                        r4.A04(new 1uw(new Bundle(jobParameters.getExtras())), new C12014SkY(jobParameters, lollipopUpload, this), jobParameters.getExtras().getString("action"), jobId);
                        return true;
                    } catch (C258093yS e) {
                        0KC.A0H("PostLolliopUploadService", "Misunderstood job service extras: %s", e);
                        return false;
                    }
                }
            } catch (Exception e2) {
                0KC.A0G("PostLolliopUploadService", "Corrupt bundle, cancelling job", e2);
            }
        }
        jobParameters.getJobId();
        return false;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        C251463n9 r1;
        0fR.A01(jobParameters, this);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null || (r1 = lollipopUpload.A00) == null) {
            return true;
        }
        r1.A03(jobParameters.getJobId());
        return true;
    }
}
