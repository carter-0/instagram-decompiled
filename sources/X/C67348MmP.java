package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.MmP  reason: case insensitive filesystem */
public final /* synthetic */ class C67348MmP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1L8 A01;
    public final /* synthetic */ ListenableFuture A02;

    public /* synthetic */ C67348MmP(1L8 r1, ListenableFuture listenableFuture, int i) {
        this.A01 = r1;
        this.A02 = listenableFuture;
        this.A00 = i;
    }

    public final void run() {
        1L8 r4 = this.A01;
        ListenableFuture listenableFuture = this.A02;
        int i = this.A00;
        try {
            if (listenableFuture.isCancelled()) {
                r4.A00 = null;
                r4.cancel(false);
            } else {
                1L8.A02(r4, listenableFuture, i);
            }
        } finally {
            1L8.A01((ImmutableCollection) null, r4);
        }
    }
}
