package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.WLk  reason: case insensitive filesystem */
public final class C19103WLk implements X6B {
    public boolean A00;
    public final C18026Vk4 A01 = new C18026Vk4();

    public final void AG5(C17186VLq vLq) {
        if (!this.A00) {
            this.A00 = true;
            C18026Vk4 vk4 = this.A01;
            WM2 wm2 = new WM2();
            Iterator A0s = AnonymousClass7TF.A0s(vk4.A00);
            while (A0s.hasNext()) {
                WM2.A00(wm2, C51971G9r.A0p(A0s));
            }
            Iterator it = wm2.iterator();
            while (it.hasNext()) {
                ((X6B) it.next()).AG5(vLq);
            }
        }
    }

    public final void EJW(C20892X2y x2y, C17186VLq vLq, WLK wlk) {
        if (wlk != null) {
            throw new NullPointerException("effectId");
        }
        C18026Vk4 vk4 = this.A01;
        HashSet hashSet = new HashSet();
        Iterator A0u = Pxf.A0u(vk4.A00);
        while (A0u.hasNext()) {
            JTT.A1U(hashSet, A0u);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            X6B x6b = (X6B) vk4.A00.get(number);
            x6b.EJW(new C19111WLs(x6b, x2y, vLq, this, intValue), vLq, wlk);
        }
    }
}
