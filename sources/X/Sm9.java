package X;

import java.util.concurrent.CountDownLatch;

public final class Sm9 implements C278884xg {
    public CountDownLatch A00 = new CountDownLatch(1);
    public boolean A01 = true;

    public final synchronized void DMd(boolean z) {
        this.A01 = z;
        this.A00.countDown();
    }
}
