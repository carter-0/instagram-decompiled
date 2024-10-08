package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUpload;

/* renamed from: X.SkY  reason: case insensitive filesystem */
public final class C12014SkY implements C275334py {
    public final JobParameters A00;
    public final TZs A01;
    public final /* synthetic */ LollipopUpload A02;

    public C12014SkY(JobParameters jobParameters, LollipopUpload lollipopUpload, TZs tZs) {
        this.A02 = lollipopUpload;
        this.A00 = jobParameters;
        this.A01 = tZs;
    }

    public final void Dzt(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        ((JobService) this.A01).jobFinished(jobParameters, z);
    }
}
