package X;

import android.os.Handler;

public final class Y37 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C22147XwB A01;
    public final /* synthetic */ C341737nR A02;

    public Y37(Handler handler, C22147XwB xwB, C341737nR r3) {
        this.A01 = xwB;
        this.A02 = r3;
        this.A00 = handler;
    }

    public final void run() {
        C22147XwB xwB = this.A01;
        C341737nR r4 = this.A02;
        Handler handler = this.A00;
        if (xwB.A0B != AnonymousClass05K.A01) {
            xwB.A04.A01("stAEe");
            C18091VlL.A01(handler, r4, DbW.A0c("prepare() must be called before starting audio encoding. Current state is: ", XUR.A00(xwB.A0B)));
            return;
        }
        try {
            0fX.A05(xwB.A01, -1339699077);
            xwB.A0B = AnonymousClass05K.A0C;
            xwB.A04.A01("stAEs");
            C18091VlL.A00(handler, r4);
        } catch (Exception e) {
            xwB.A04.A01("stAEe1");
            C18091VlL.A01(handler, r4, e);
        }
    }
}
