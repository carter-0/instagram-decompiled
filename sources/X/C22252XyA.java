package X;

import android.os.Handler;

/* renamed from: X.XyA  reason: case insensitive filesystem */
public final class C22252XyA implements C341687nM {
    public final Handler A00;
    public final C391719tX A01;
    public final C341687nM A02;
    public final Runnable A03;

    public final void DCg(C391719tX r4) {
        Handler handler = this.A00;
        Runnable runnable = this.A03;
        if (handler.hasCallbacks(runnable)) {
            handler.removeCallbacks(runnable);
            C18097VlR.A00(handler, r4, this.A02);
        }
    }

    public final void onSuccess() {
        Handler handler = this.A00;
        Runnable runnable = this.A03;
        if (handler.hasCallbacks(runnable)) {
            handler.removeCallbacks(runnable);
            C18097VlR.A01(this.A02, handler);
        }
    }

    public C22252XyA(Handler handler, C391719tX r5, C341687nM r6, int i) {
        Y1i y1i = new Y1i(this);
        this.A03 = y1i;
        this.A02 = r6;
        this.A00 = handler;
        this.A01 = r5;
        handler.postDelayed(y1i, (long) i);
    }

    public final Handler A00() {
        return this.A00;
    }
}
