package X;

import android.os.Handler;

/* renamed from: X.XoP  reason: case insensitive filesystem */
public final class C21977XoP {
    public static final AnonymousClass0eM A03 = AnonymousClass0eN.A01(Y6O.A00);
    public Runnable A00;
    public Runnable A01;
    public final Handler A02 = AnonymousClass7TF.A0D();

    public final void A00(AnonymousClass3W1 r4) {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
            this.A01 = null;
        }
        Runnable runnable2 = this.A00;
        if (runnable2 != null) {
            this.A02.removeCallbacks(runnable2);
            this.A00 = null;
        }
        if (false != r4.A1o) {
            r4.A1o = false;
            AnonymousClass3W1.A00(r4, 79);
        }
    }

    public final void A01(AnonymousClass3W1 r4, long j, long j2) {
        A00(r4);
        C22411Y2t y2t = new C22411Y2t(this, r4);
        this.A01 = y2t;
        this.A00 = new C22412Y2u(this, r4);
        Handler handler = this.A02;
        handler.postDelayed(y2t, j);
        Runnable runnable = this.A00;
        if (runnable != null) {
            handler.postDelayed(runnable, j + j2);
        }
    }
}
