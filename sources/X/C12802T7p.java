package X;

import android.app.job.JobParameters;
import com.instagram.gallery.scanner.MediaScannerJobService;

/* renamed from: X.T7p  reason: case insensitive filesystem */
public final class C12802T7p implements C13672Teh {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ MediaScannerJobService A01;

    public C12802T7p(JobParameters jobParameters, MediaScannerJobService mediaScannerJobService) {
        this.A01 = mediaScannerJobService;
        this.A00 = jobParameters;
    }

    public final void DMc() {
        0fR.A02(this.A00, this.A01, false);
    }
}
