package X;

import android.app.job.JobParameters;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadServiceDelegate;

/* renamed from: X.SkX  reason: case insensitive filesystem */
public final class C12013SkX implements C275334py {
    public final JobParameters A00;
    public final /* synthetic */ LollipopUploadServiceDelegate A01;

    public C12013SkX(JobParameters jobParameters, LollipopUploadServiceDelegate lollipopUploadServiceDelegate) {
        this.A01 = lollipopUploadServiceDelegate;
        this.A00 = jobParameters;
    }

    public final void Dzt(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        0fR.A02(jobParameters, this.A01.A01, z);
    }
}
