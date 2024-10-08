package X;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;

public final /* synthetic */ class TEv implements Runnable {
    public final /* synthetic */ ConstraintTrackingWorker A00;
    public final /* synthetic */ ListenableFuture A01;

    public /* synthetic */ TEv(ConstraintTrackingWorker constraintTrackingWorker, ListenableFuture listenableFuture) {
        this.A00 = constraintTrackingWorker;
        this.A01 = listenableFuture;
    }

    public final void run() {
        ConstraintTrackingWorker constraintTrackingWorker = this.A00;
        ListenableFuture listenableFuture = this.A01;
        synchronized (constraintTrackingWorker.A03) {
            if (constraintTrackingWorker.A04) {
                C2379539x r1 = constraintTrackingWorker.A02;
                0qQ.A06(r1);
                r1.A07(new Object());
            } else {
                constraintTrackingWorker.A02.A06(listenableFuture);
            }
        }
    }
}
