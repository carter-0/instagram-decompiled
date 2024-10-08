package X;

import com.facebook.papaya.client.PapayaJNI;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.TIe  reason: case insensitive filesystem */
public final /* synthetic */ class C13022TIe implements Runnable {
    public final /* synthetic */ C10742RxL A00;
    public final /* synthetic */ C10673Rw8 A01;
    public final /* synthetic */ SettableFuture A02;

    public /* synthetic */ C13022TIe(C10742RxL rxL, C10673Rw8 rw8, SettableFuture settableFuture) {
        this.A00 = rxL;
        this.A01 = rw8;
        this.A02 = settableFuture;
    }

    public final void run() {
        C10742RxL rxL = this.A00;
        SettableFuture settableFuture = this.A02;
        rxL.A00.A00();
        PapayaJNI.submitExecutor("batch_mldw_falco_executor", "federated");
        settableFuture.set(AnonymousClass7TE.A0v());
    }
}
