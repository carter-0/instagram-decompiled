package com.instagram.jobscheduler.bgfetch.scheduler;

import X.0fR;
import X.2IT;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C10637RvW;
import X.C20592WvV;
import X.C271004hk;
import X.C51971G9r;
import X.C73666Phf;
import X.DbT;
import X.Pxe;
import X.T7D;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.instagram.common.session.UserSession;

public final class IgBgFetchSchedulerService extends JobService {
    public final boolean onStartJob(JobParameters jobParameters) {
        Integer num;
        C271004hk.A00(jobParameters, this);
        UserSession A0a = Pxe.A0a(this);
        if (jobParameters != null) {
            num = Integer.valueOf(jobParameters.getJobId());
        } else {
            num = null;
        }
        T7D A00 = 2IT.A00(DbT.A05(this), A0a);
        if (num == null || A00 == null) {
            jobFinished(jobParameters, false);
            return false;
        }
        C10637RvW rvW = new C10637RvW(DbT.A05(this), new C73666Phf(33, jobParameters, this), num.intValue());
        AnonymousClass7TE.A1Z(new C20592WvV(A00, rvW, (AnonymousClass4D7) null, 3), A00.A07);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        T7D A00 = 2IT.A00(DbT.A05(this), Pxe.A0a(this));
        if (A00 == null) {
            return false;
        }
        C51971G9r.A1P(A00, A00.A07, 18);
        return false;
    }

    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        T7D A00 = 2IT.A00(DbT.A05(this), Pxe.A0a(this));
        if (A00 != null) {
            C51971G9r.A1P(A00, A00.A07, 18);
        }
    }
}
