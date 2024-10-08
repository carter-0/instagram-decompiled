package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.SkW  reason: case insensitive filesystem */
public final class C12012SkW implements C275334py {
    public final CountDownLatch A00 = Pxf.A0y();
    public volatile boolean A01;

    public final void Dzt(boolean z) {
        this.A01 = z;
        this.A00.countDown();
    }
}
