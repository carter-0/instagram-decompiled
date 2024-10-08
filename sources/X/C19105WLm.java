package X;

import java.util.Iterator;

/* renamed from: X.WLm  reason: case insensitive filesystem */
public final class C19105WLm implements X6B {
    public int A00;
    public boolean A01;
    public final WM2 A02 = new WM2();
    public final WM2 A03 = new WM2();

    public final void A00(X6B x6b) {
        WM2.A00(this.A02, x6b);
        WM2.A00(this.A03, (Object) null);
    }

    public final void AG5(C17186VLq vLq) {
        if (!this.A01) {
            this.A01 = true;
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((X6B) it.next()).AG5(vLq);
            }
        }
    }

    public final void EJW(C20892X2y x2y, C17186VLq vLq, WLK wlk) {
        if (wlk != null) {
            throw new NullPointerException("effectId");
        }
        WM2 wm2 = this.A02;
        if (wm2.A00.isEmpty()) {
            this.A01 = true;
            x2y.DBa(new WM2());
            return;
        }
        for (int i = 0; i < wm2.A00.size(); i++) {
            ((X6B) wm2.A00.get(i)).EJW(new C19110WLr(x2y, vLq, this, i), vLq, wlk);
        }
    }
}
