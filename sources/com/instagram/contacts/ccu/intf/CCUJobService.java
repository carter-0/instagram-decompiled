package com.instagram.contacts.ccu.intf;

import X.0fR;
import X.0qQ;
import X.0wb;
import X.C10898Rzy;
import X.C12793T7d;
import X.C271004hk;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.common.stringformat.StringFormatUtil;

public final class CCUJobService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        0qQ.A0B(jobParameters, 0);
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        0qQ.A0B(jobParameters, 0);
        try {
            Object newInstance = Class.forName("com.instagram.contacts.ccu.impl.CCUServiceImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
            0qQ.A0C(newInstance, "null cannot be cast to non-null type com.instagram.contacts.ccu.intf.CCUService");
            C10898Rzy rzy = (C10898Rzy) newInstance;
            if (rzy != null) {
                return rzy.onStart(this, new C12793T7d(jobParameters, this));
            }
            return false;
        } catch (Throwable th) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to initialize CCUService");
            0qQ.A0A(formatStrLocaleSafe);
            0wb.A06("CCUService", formatStrLocaleSafe, th);
            return false;
        }
    }
}
