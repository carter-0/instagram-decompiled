package X;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Pba  reason: case insensitive filesystem */
public final class C73377Pba implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C74299PsY A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ 0rm A03;

    public C73377Pba(Context context, C74299PsY psY, CountDownLatch countDownLatch, 0rm r4) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = psY;
        this.A02 = countDownLatch;
    }

    public final void run() {
        this.A03.A00 = C74540PwZ.A00.AL4(this.A00, this.A01);
        this.A02.countDown();
    }
}
