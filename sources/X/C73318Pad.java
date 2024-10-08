package X;

import com.facebook.msys.mca.Mailbox;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Pad  reason: case insensitive filesystem */
public final class C73318Pad implements Runnable {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ 0rm A02;

    public C73318Pad(Mailbox mailbox, CountDownLatch countDownLatch, 0rm r3) {
        this.A02 = r3;
        this.A00 = mailbox;
        this.A01 = countDownLatch;
    }

    public final void run() {
        this.A02.A00 = this.A00;
        this.A01.countDown();
    }
}
