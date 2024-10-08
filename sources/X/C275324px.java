package X;

import android.app.job.JobParameters;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadService;

/* renamed from: X.4px  reason: invalid class name and case insensitive filesystem */
public final class C275324px implements C275334py {
    public final JobParameters A00;
    public final /* synthetic */ LollipopUploadService A01;

    public C275324px(JobParameters jobParameters, LollipopUploadService lollipopUploadService) {
        this.A01 = lollipopUploadService;
        this.A00 = jobParameters;
    }

    public final void Dzt(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        0fR.A02(jobParameters, this.A01, z);
    }
}
