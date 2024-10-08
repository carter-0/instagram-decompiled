package X;

import com.google.common.util.concurrent.ListenableFuture;

public final class Pz3 implements Runnable {
    public final /* synthetic */ PzD A00;
    public final /* synthetic */ ListenableFuture A01;
    public final /* synthetic */ String A02;

    public Pz3(PzD pzD, ListenableFuture listenableFuture, String str) {
        this.A00 = pzD;
        this.A02 = str;
        this.A01 = listenableFuture;
    }

    public final void run() {
        PzD pzD = this.A00;
        pzD.A01.A03.remove(this.A02);
        ListenableFuture listenableFuture = this.A01;
        if (!listenableFuture.isCancelled()) {
            try {
                listenableFuture.get();
            } catch (Exception e) {
                pzD.A00.A07(e);
            }
        }
    }
}
