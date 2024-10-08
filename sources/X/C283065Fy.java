package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.5Fy  reason: invalid class name and case insensitive filesystem */
public final class C283065Fy implements Runnable {
    public final /* synthetic */ C282905Ff A00;
    public final /* synthetic */ ListenableFuture A01;

    public C283065Fy(C282905Ff r1, ListenableFuture listenableFuture) {
        this.A00 = r1;
        this.A01 = listenableFuture;
    }

    public final void run() {
        C282905Ff r2 = this.A00;
        C2379539x r1 = r2.A0F;
        if (!r1.isCancelled()) {
            try {
                this.A01.get();
                AnonymousClass389.A00();
                r1.A06(r2.A03.startWork());
            } catch (Throwable th) {
                r1.A08(th);
            }
        }
    }
}
