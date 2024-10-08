package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.96o  reason: invalid class name and case insensitive filesystem */
public final class C3736996o implements C3736496j, C3736596k, C3736696l {
    public final CountDownLatch A00 = new CountDownLatch(1);

    public final void D0c() {
        this.A00.countDown();
    }

    public final void onFailure(Exception exc) {
        this.A00.countDown();
    }

    public final void onSuccess(Object obj) {
        this.A00.countDown();
    }

    public /* synthetic */ C3736996o(C391789tg r3) {
    }

    public C3736996o() {
    }
}
