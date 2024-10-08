package com.facebook.common.zopt;

import X.0fR;
import X.C271004hk;
import X.JTQ;
import X.TR9;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import java.util.concurrent.atomic.AtomicBoolean;

public class ZOptBackgroundService extends JobService {
    public final AtomicBoolean A00 = JTQ.A0k();

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        this.A00.set(false);
        PersistableBundle extras = jobParameters.getExtras();
        extras.getInt("profile_delta_size", 0);
        extras.getInt("profile_delta_pct", 0);
        extras.getBoolean("skip_quickening", false);
        new TR9(jobParameters, this, this).start();
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        this.A00.set(true);
        return false;
    }
}
