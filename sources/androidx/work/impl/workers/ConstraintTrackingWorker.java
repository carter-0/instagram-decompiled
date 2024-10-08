package androidx.work.impl.workers;

import X.0qQ;
import X.AnonymousClass389;
import X.AnonymousClass3DG;
import X.AnonymousClass7TG;
import X.C12850TAp;
import X.C2377639c;
import X.C2379539x;
import X.C2805152d;
import X.C283015Ft;
import X.Pxe;
import X.QG4;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

public final class ConstraintTrackingWorker extends C283015Ft implements C2377639c {
    public C283015Ft A00;
    public final WorkerParameters A01;
    public final C2379539x A02 = new Object();
    public final Object A03 = Pxe.A0p();
    public volatile boolean A04;

    public final void D5t(C2805152d r4, AnonymousClass3DG r5) {
        0qQ.A0B(r4, 1);
        AnonymousClass389.A00();
        if (r4 instanceof QG4) {
            synchronized (this.A03) {
                this.A04 = true;
            }
        }
    }

    public final void onStopped() {
        int i;
        C283015Ft r2 = this.A00;
        if (r2 != null && !r2.isStopped()) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = getStopReason();
            } else {
                i = 0;
            }
            r2.stop(i);
        }
    }

    public final ListenableFuture startWork() {
        this.mWorkerParams.A0A.execute(new C12850TAp(this));
        C2379539x r0 = this.A02;
        0qQ.A06(r0);
        return r0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.39x, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
        this.A01 = workerParameters;
    }
}
