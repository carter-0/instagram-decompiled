package X;

import java.util.concurrent.Callable;

/* renamed from: X.MAd  reason: case insensitive filesystem */
public final class C66070MAd implements Callable {
    public final /* synthetic */ 2NU A00;
    public final /* synthetic */ A8B A01;

    public C66070MAd(2NU r1, A8B a8b) {
        this.A00 = r1;
        this.A01 = a8b;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        2NU r0 = this.A00;
        C251983oI r2 = r0.A02;
        r2.beginTransaction();
        try {
            Long valueOf = Long.valueOf(r0.A01.insertAndReturnId(this.A01));
            r2.setTransactionSuccessful();
            return valueOf;
        } finally {
            r2.endTransaction();
        }
    }
}
