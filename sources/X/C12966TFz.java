package X;

import android.app.job.JobParameters;
import com.facebook.papaya.fb.instagram.papaya.PapayaExecutionJobService;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;

/* renamed from: X.TFz  reason: case insensitive filesystem */
public final class C12966TFz implements Runnable {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ PapayaExecutionJobService A01;

    public C12966TFz(JobParameters jobParameters, PapayaExecutionJobService papayaExecutionJobService) {
        this.A01 = papayaExecutionJobService;
        this.A00 = jobParameters;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.1K2] */
    public final void run() {
        ListenableFuture listenableFuture;
        PapayaExecutionJobService papayaExecutionJobService = this.A01;
        JobParameters jobParameters = this.A00;
        synchronized (papayaExecutionJobService) {
            try {
                UserSession A0a = Pxe.A0a(papayaExecutionJobService);
                listenableFuture = C255183ti.A03(((S1l) A0a.A01(S1l.class, new C13349TVw(3, papayaExecutionJobService, A0a))).A00());
            } catch (IllegalStateException unused) {
                IllegalStateException A0z = AnonymousClass7TE.A0z("Can't locate Papaya instance when User session has ended.");
                ? obj = new Object();
                obj.setException(A0z);
                listenableFuture = obj;
            }
            C255183ti.A04(new T0O(3, jobParameters, papayaExecutionJobService), listenableFuture, 1Lf.A01);
        }
    }
}
