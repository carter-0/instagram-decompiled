package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class WXR implements C320986tO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void DOa(C20997X8u x8u, String str, String str2) {
        0qQ.A0B(str2, 2);
        ((AtomicReference) this.A03).set(str2);
        ((CountDownLatch) this.A01).countDown();
    }

    public final void DOb(C20997X8u x8u, String str, String str2, String str3) {
        0qQ.A0B(str2, 2);
        ((AtomicReference) this.A03).set(str2);
        ((CountDownLatch) this.A01).countDown();
    }

    public WXR(CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference, int i) {
        this.A00 = i;
        this.A03 = atomicReference;
        this.A01 = countDownLatch;
        this.A02 = atomicBoolean;
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }

    public final void onError(String str) {
        ((AtomicBoolean) this.A02).set(true);
        ((CountDownLatch) this.A01).countDown();
    }

    public final void DaG(String str, float f) {
    }

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }
}
