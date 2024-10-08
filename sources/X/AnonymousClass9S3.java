package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9S3  reason: invalid class name */
public final class AnonymousClass9S3 {
    public final AtomicReference A00 = new AtomicReference(new CountDownLatch(0));

    public static CountDownLatch A00(AnonymousClass9S3 r0) {
        Object obj = r0.A00.get();
        obj.getClass();
        return (CountDownLatch) obj;
    }

    public final void A01(int i) {
        CountDownLatch countDownLatch = (CountDownLatch) this.A00.getAndSet(new CountDownLatch(i));
        if (countDownLatch != null) {
            while (countDownLatch.getCount() > 0) {
                countDownLatch.countDown();
            }
        }
    }
}
