package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.5Fw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C283045Fw implements Runnable {
    public final /* synthetic */ C282905Ff A00;
    public final /* synthetic */ ListenableFuture A01;

    public /* synthetic */ C283045Fw(C282905Ff r1, ListenableFuture listenableFuture) {
        this.A00 = r1;
        this.A01 = listenableFuture;
    }

    public final void run() {
        C282905Ff r0 = this.A00;
        ListenableFuture listenableFuture = this.A01;
        if (r0.A0F.isCancelled()) {
            listenableFuture.cancel(true);
        }
    }
}
