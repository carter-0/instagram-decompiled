package X;

import android.app.job.JobParameters;
import android.content.Context;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

/* renamed from: X.4xf  reason: invalid class name and case insensitive filesystem */
public final class C278874xf implements C278884xg {
    public final JobParameters A00;
    public final Context A01;
    public final /* synthetic */ JobServiceCompat A02;

    public C278874xf(JobParameters jobParameters, Context context, JobServiceCompat jobServiceCompat) {
        this.A02 = jobServiceCompat;
        this.A00 = jobParameters;
        this.A01 = context;
    }

    public final void DMd(boolean z) {
        JobServiceCompat jobServiceCompat = this.A02;
        JobParameters jobParameters = this.A00;
        0fR.A02(jobParameters, jobServiceCompat, z);
        if (!z) {
            AnonymousClass2Qc A002 = AnonymousClass2Qc.A00(this.A01);
            synchronized (A002) {
                A002.A00.put(jobParameters.getJobId(), false);
            }
        }
    }
}
