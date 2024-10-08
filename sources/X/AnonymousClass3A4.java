package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.3A4  reason: invalid class name */
public final class AnonymousClass3A4 implements Runnable {
    public final C2379639y A00;
    public final ListenableFuture A01;

    public final void run() {
        C2379639y r2 = this.A00;
        if (r2.value == this) {
            if (C2379639y.A00.A04(r2, this, C2379639y.A00(this.A01))) {
                C2379639y.A04(r2);
            }
        }
    }

    public AnonymousClass3A4(C2379639y r1, ListenableFuture listenableFuture) {
        this.A00 = r1;
        this.A01 = listenableFuture;
    }
}
