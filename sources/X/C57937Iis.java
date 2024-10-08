package X;

import android.os.Handler;

/* renamed from: X.Iis  reason: case insensitive filesystem */
public final class C57937Iis implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ RRF A01;
    public final /* synthetic */ 0rk A02;
    public final /* synthetic */ Integer[] A03;

    public C57937Iis(Handler handler, RRF rrf, 0rk r3, Integer[] numArr) {
        this.A01 = rrf;
        this.A03 = numArr;
        this.A02 = r3;
        this.A00 = handler;
    }

    public final void run() {
        RRF rrf = this.A01;
        Integer[] numArr = this.A03;
        0rk r2 = this.A02;
        rrf.A01(numArr[r2.A00]);
        int i = r2.A00 + 1;
        r2.A00 = i;
        if (i < numArr.length) {
            this.A00.postDelayed(this, 1000);
        }
    }
}
