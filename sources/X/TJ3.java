package X;

import android.app.job.JobParameters;

public final /* synthetic */ class TJ3 implements Runnable {
    public final JobParameters A00;
    public final C8485QvX A01;
    public final SH4 A02;

    public TJ3(JobParameters jobParameters, C8485QvX qvX, SH4 sh4) {
        this.A02 = sh4;
        this.A01 = qvX;
        this.A00 = jobParameters;
    }

    public final void run() {
        SH4 sh4 = this.A02;
        C8485QvX qvX = this.A01;
        JobParameters jobParameters = this.A00;
        ST5.A0B(qvX, "AnalyticsJobService processed last dispatch request", 2);
        ((C13642Te9) sh4.A00).FP3(jobParameters, false);
    }
}
