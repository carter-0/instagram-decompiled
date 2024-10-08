package X;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

public final class AUH implements C41827B2i {
    public final int A00;
    public final Object A01;

    public AUH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D0z(C382309dU r3) {
        if (this.A00 != 0) {
            C40695AhF.A01((C40695AhF) this.A01, "Controller capture failed", r3);
            return;
        }
        AVA ava = (AVA) this.A01;
        ava.A07 = r3;
        CountDownLatch countDownLatch = ava.A05;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void D11() {
        if (this.A00 != 0) {
            C40695AhF ahF = (C40695AhF) this.A01;
            if (ahF.A03) {
                ahF.A02 = null;
                ahF.A03 = false;
            }
            if (ahF.A04) {
                ahF.A07.Dc3();
            }
            ahF.A04 = true;
            return;
        }
        CountDownLatch countDownLatch = ((AVA) this.A01).A05;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void D17(long j) {
        if (this.A00 != 0) {
            C40695AhF ahF = (C40695AhF) this.A01;
            ahF.A07.Dc1(true);
            ahF.A05.postDelayed(new C40913AlL(ahF), 100);
            return;
        }
        ((AVA) this.A01).A03.A02(C21986Xoh.A0W, Long.valueOf(j));
    }

    public final long now() {
        if (this.A00 != 0) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime();
    }
}
