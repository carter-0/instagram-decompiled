package com.instagram.gallery.scanner;

import X.0fR;
import X.0qQ;
import X.AnonymousClass5EZ;
import X.C12802T7p;
import X.C271004hk;
import X.C40242AXg;
import android.app.job.JobParameters;
import android.app.job.JobService;

public final class MediaScannerJobService extends JobService {
    public final AnonymousClass5EZ A00 = new AnonymousClass5EZ();

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        0qQ.A0B(jobParameters, 0);
        this.A00.A00(new C12802T7p(jobParameters, this));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        0qQ.A0B(jobParameters, 0);
        C40242AXg aXg = this.A00.A00;
        if (aXg != null) {
            aXg.A04();
        }
        return false;
    }
}
