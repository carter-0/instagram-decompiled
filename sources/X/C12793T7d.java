package X;

import android.app.job.JobParameters;
import com.instagram.contacts.ccu.intf.CCUJobService;

/* renamed from: X.T7d  reason: case insensitive filesystem */
public final class C12793T7d implements X3Y {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ CCUJobService A01;

    public C12793T7d(JobParameters jobParameters, CCUJobService cCUJobService) {
        this.A01 = cCUJobService;
        this.A00 = jobParameters;
    }

    public final void onFinish() {
        0fR.A02(this.A00, this.A01, false);
    }
}
