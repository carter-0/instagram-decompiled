package X;

import java.util.concurrent.Callable;

public final class TNK implements Callable {
    public final /* synthetic */ 1Ef A00;
    public final /* synthetic */ 1vn A01;

    public TNK(1Ef r1, 1vn r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture, X.1K2] */
    public final /* bridge */ /* synthetic */ Object call() {
        ? obj = new Object();
        C8811RAn rAn = new C8811RAn(obj);
        1vn r1 = this.A01;
        1Ef r6 = this.A00;
        1vy A002 = 1vn.A00(r1, r6.getSchema());
        1vy.A00(new C12090Smk((Object) rAn, 9), new C12093Smn(rAn, 7), r6, A002, 1Lf.A01, A002.A04);
        return obj.get();
    }
}
