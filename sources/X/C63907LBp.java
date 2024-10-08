package X;

import java.lang.ref.WeakReference;

/* renamed from: X.LBp  reason: case insensitive filesystem */
public final class C63907LBp {
    public final WeakReference A00;

    public final void A00(Integer num) {
        0qQ.A0B(num, 0);
        LAA laa = (LAA) this.A00.get();
        if (laa != null) {
            String A002 = C62974KpQ.A00(num);
            0sP r0 = laa.A01;
            if (r0 != null) {
                r0.invoke(A002);
            } else {
                laa.A00 = A002;
            }
        }
    }

    public C63907LBp(LAA laa) {
        this.A00 = C51965G9l.A0v(laa);
    }
}
