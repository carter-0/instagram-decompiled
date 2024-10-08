package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.48Q  reason: invalid class name */
public final class AnonymousClass48Q implements AnonymousClass1MK {
    public AnonymousClass3LX A00;
    public final CountDownLatch A01 = new CountDownLatch(1);

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        0qQ.A0B(r3, 1);
        this.A00 = r3;
        this.A01.countDown();
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        this.A01.countDown();
    }
}
