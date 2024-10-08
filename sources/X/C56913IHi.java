package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.IHi  reason: case insensitive filesystem */
public final class C56913IHi implements C59649JRr {
    public final View A00;

    public final C58696Iw5 CNc(GWO gwo) {
        I9x i9x = new I9x(0, new Object(), gwo, this);
        gwo.addOnAttachStateChangeListener(i9x);
        IHD ihd = new IHD(gwo);
        C275604qc.A00(gwo).A00.add(ihd);
        return new C58696Iw5(8, i9x, ihd, gwo);
    }

    public C56913IHi(Window window) {
        View decorView = window.getDecorView();
        0qQ.A07(decorView);
        this.A00 = decorView;
    }
}
