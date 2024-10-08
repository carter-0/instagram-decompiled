package X;

import java.util.Iterator;

/* renamed from: X.Vg5  reason: case insensitive filesystem */
public final class C17793Vg5 {
    public C21046XBn A00;
    public final C17418VUx A01 = new C17418VUx();

    public final void A00() {
        WM2 wm2;
        C17418VUx vUx = this.A01;
        synchronized (vUx.A02) {
            wm2 = vUx.A01;
            vUx.A00 = wm2;
        }
        Iterator it = wm2.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("executor");
        }
    }
}
