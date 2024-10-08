package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.OsM  reason: case insensitive filesystem */
public final class C71878OsM implements C74383Pty {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ 0rm A01;
    public final /* synthetic */ 0rm A02;

    public final /* synthetic */ void DCq(String str, int i, String str2) {
        0qQ.A0B(str, 1);
        this.A01.A00 = str;
        this.A00.countDown();
    }

    public final void Dog(String str, boolean z) {
        0qQ.A0B(str, 0);
        this.A02.A00 = str;
        this.A00.countDown();
    }

    public C71878OsM(CountDownLatch countDownLatch, 0rm r2, 0rm r3) {
        this.A02 = r2;
        this.A00 = countDownLatch;
        this.A01 = r3;
    }
}
