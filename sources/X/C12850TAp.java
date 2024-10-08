package X;

import android.util.Log;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.TAp  reason: case insensitive filesystem */
public final /* synthetic */ class C12850TAp implements Runnable {
    public final /* synthetic */ ConstraintTrackingWorker A00;

    public /* synthetic */ C12850TAp(ConstraintTrackingWorker constraintTrackingWorker) {
        this.A00 = constraintTrackingWorker;
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void run() {
        Object obj;
        Object r0;
        ConstraintTrackingWorker constraintTrackingWorker = this.A00;
        C2379539x r3 = constraintTrackingWorker.A02;
        if (!r3.isCancelled()) {
            String A03 = constraintTrackingWorker.mWorkerParams.A02.A03("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            0qQ.A07(AnonymousClass389.A00());
            if (A03 == null || A03.length() == 0) {
                Log.e(C9895RjA.A00, "No worker to delegate to.");
            } else {
                C283015Ft A002 = constraintTrackingWorker.mWorkerParams.A05.A00(constraintTrackingWorker.mAppContext, constraintTrackingWorker.A01, A03);
                constraintTrackingWorker.A00 = A002;
                if (A002 != null) {
                    AnonymousClass385 A003 = AnonymousClass385.A00(constraintTrackingWorker.mAppContext);
                    0qQ.A07(A003);
                    AnonymousClass3DG CGi = A003.A04.A05().CGi(DbT.A10(constraintTrackingWorker.mWorkerParams.A09));
                    if (CGi != null) {
                        AnonymousClass397 r02 = A003.A09;
                        0qQ.A07(r02);
                        C2377939g r2 = new C2377939g(r02);
                        AnonymousClass4CZ r03 = ((AnonymousClass38M) A003.A06).A03;
                        0qQ.A07(r03);
                        r3.addListener(new C12851TAq(AnonymousClass52Y.A00(constraintTrackingWorker, r2, CGi, r03)), new Object());
                        if (r2.A00(CGi)) {
                            try {
                                C283015Ft r04 = constraintTrackingWorker.A00;
                                0qQ.A0A(r04);
                                ListenableFuture startWork = r04.startWork();
                                0qQ.A07(startWork);
                                startWork.addListener(new TEv(constraintTrackingWorker, startWork), constraintTrackingWorker.mWorkerParams.A0A);
                                return;
                            } catch (Throwable unused) {
                                synchronized (constraintTrackingWorker.A03) {
                                    if (constraintTrackingWorker.A04) {
                                        r0 = new Object();
                                    } else {
                                        r0 = new C282925Fh();
                                    }
                                    r3.A07(r0);
                                    return;
                                }
                            }
                        } else {
                            obj = new Object();
                            r3.A07(obj);
                        }
                    }
                }
            }
            obj = new C282925Fh();
            r3.A07(obj);
        }
    }
}
