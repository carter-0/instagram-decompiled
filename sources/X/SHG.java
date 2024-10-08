package X;

import android.os.Handler;

public abstract class SHG {
    public static volatile Handler A03;
    public final C11381SQt A00;
    public final Runnable A01 = new TDP(this);
    public volatile long A02;

    public static final Handler A00(SHG shg) {
        Handler handler;
        if (A03 != null) {
            return A03;
        }
        synchronized (SHG.class) {
            if (A03 == null) {
                A03 = new Handler(shg.A00.A00.getMainLooper());
            }
            handler = A03;
        }
        return handler;
    }

    public final void A01(long j) {
        this.A02 = 0;
        Handler A002 = A00(this);
        Runnable runnable = this.A01;
        A002.removeCallbacks(runnable);
        if (j >= 0) {
            C11381SQt sQt = this.A00;
            this.A02 = System.currentTimeMillis();
            if (!A00(this).postDelayed(runnable, j)) {
                C8485QvX qvX = sQt.A0C;
                C11381SQt.A02(qvX);
                qvX.A0H("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public SHG(C11381SQt sQt) {
        this.A00 = sQt;
    }
}
