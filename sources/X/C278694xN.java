package X;

import android.app.job.JobParameters;
import com.instagram.util.offline.BackgroundPrefetchJobService;

/* renamed from: X.4xN  reason: invalid class name and case insensitive filesystem */
public final class C278694xN implements C278704xO {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ BackgroundPrefetchJobService A01;

    public C278694xN(JobParameters jobParameters, BackgroundPrefetchJobService backgroundPrefetchJobService) {
        this.A01 = backgroundPrefetchJobService;
        this.A00 = jobParameters;
    }

    public final void DFq(Integer num, boolean z) {
        JobParameters jobParameters = this.A00;
        if (jobParameters != null) {
            0fR.A02(jobParameters, this.A01, false);
        }
    }
}
