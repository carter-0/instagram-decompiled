package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: X.2lg  reason: invalid class name and case insensitive filesystem */
public abstract class C228442lg {
    public boolean A01(int i, int i2) {
        AnonymousClass52T A05;
        int A02;
        if (this instanceof C228432lf) {
            C228432lf r5 = (C228432lf) this;
            RecyclerView recyclerView = r5.A00;
            C252553pI r4 = recyclerView.A0D;
            if (r4 == null || recyclerView.A0A == null) {
                return false;
            }
            int i3 = recyclerView.A0t;
            if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(r4 instanceof C252563pJ) || (A05 = r5.A05(r4)) == null || (A02 = r5.A02(r4, i, i2)) == -1) {
                return false;
            }
            A05.A00 = A02;
            r4.A0t(A05);
            return true;
        }
        Iterator it = ((C238153At) this).A00.A04.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                boolean A01 = ((C228442lg) it.next()).A01(i, i2);
                if (z || A01) {
                    z = true;
                }
            }
        }
    }
}
