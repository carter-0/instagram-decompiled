package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6j0  reason: invalid class name and case insensitive filesystem */
public final class C314886j0 implements C314016hW {
    public final List A00 = new CopyOnWriteArrayList();
    public final AnonymousClass3BQ A01;
    public final C313056fm A02;
    public final C273404mW A03;
    public final C313426gQ A04;

    public C314886j0(AnonymousClass3BQ r2, C313056fm r3, C273404mW r4, C313426gQ r5) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r2, 3);
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final boolean Cn1(C255773uh r6, C250973mM r7, C309426Yf r8, float f) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r8, 2);
        if (!r6.CcK() || !this.A01.A01()) {
            return false;
        }
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C314016hW) it.next()).Cn1(r6, r7, r8, f)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        int currentPositionMs = this.A04.getCurrentPositionMs();
        if (C297785sK.A0i(r6, r7) && !C297785sK.A0o(r7, r8)) {
            1Xj r0 = r6.A0b;
            r0.getClass();
            f = (((float) currentPositionMs) * 1.0f) / ((float) (C297785sK.A00(r0) * 1000.0d));
        }
        r8.A02(f);
        boolean CYp = this.A02.CYp();
        1Xj r1 = r6.A0b;
        if (r6.CcK() && !CYp && r1 != null && C297785sK.A0i(r6, r7) && !C297785sK.A0o(r7, r8) && r8.A0B >= 1.0f) {
            this.A03.DaM(r6);
        }
        return true;
    }

    public final void DaV(C255773uh r1, C250973mM r2, C309426Yf r3, float f) {
    }
}
