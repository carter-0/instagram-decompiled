package X;

import android.graphics.Typeface;
import android.os.Handler;

/* renamed from: X.S0v  reason: case insensitive filesystem */
public final class C10918S0v {
    public final Handler A00;
    public final C375519Dx A01;

    public final void A00(SE3 se3) {
        Handler handler;
        Runnable ti3;
        int i = se3.A00;
        if (i == 0) {
            Typeface typeface = se3.A01;
            C375519Dx r0 = this.A01;
            handler = this.A00;
            ti3 = new TI2(typeface, this, r0);
        } else {
            C375519Dx r02 = this.A01;
            handler = this.A00;
            ti3 = new TI3(this, r02, i);
        }
        handler.post(ti3);
    }

    public C10918S0v(Handler handler, C375519Dx r2) {
        this.A01 = r2;
        this.A00 = handler;
    }
}
