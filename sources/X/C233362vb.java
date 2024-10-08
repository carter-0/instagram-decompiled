package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.2vb  reason: invalid class name and case insensitive filesystem */
public final class C233362vb implements C233372vc {
    public final C233342vY A00;
    public final C228812mN A01;
    public final boolean A02;

    public final boolean Cd4(Object obj, List list, int i) {
        boolean z;
        Object obj2;
        0qQ.A0B(list, 0);
        if (obj == null) {
            return false;
        }
        if (i > list.size() || i < 0) {
            return this.A02;
        }
        Object A0O = 00k.A0O(list, i);
        C228812mN r2 = this.A01;
        Integer Ahl = r2.Ahl(obj);
        if (Ahl == null) {
            return true;
        }
        if (A0O != null) {
            Integer Ahi = r2.Ahi(A0O);
            z = true;
            if (Ahi != null && Ahl.intValue() < Ahi.intValue()) {
                z = false;
            }
        } else {
            z = true;
        }
        if (i != 0) {
            obj2 = list.get(i - 1);
            if (obj2 != null) {
                Integer Ahi2 = r2.Ahi(obj2);
                boolean z2 = true;
                if (Ahi2 != null && Ahl.intValue() < Ahi2.intValue()) {
                    z2 = false;
                }
                if (!z || !z2) {
                    return false;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (!z) {
            return false;
        } else {
            obj2 = null;
        }
        if (CPX(A0O, obj2, obj)) {
            return true;
        }
        return false;
    }

    public final Collection Ahg() {
        return 0sl.A00;
    }

    public final boolean CPX(Object obj, Object obj2, Object obj3) {
        C233342vY r3 = this.A00;
        if (!(r3 instanceof AnonymousClass2vZ) && r3.A00) {
            List A012 = r3.A01(obj3);
            if (!C233342vY.A00(r3, obj, A012) || !C233342vY.A00(r3, obj2, A012)) {
                return false;
            }
        }
        return true;
    }

    public C233362vb(C233342vY r1, C228812mN r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }
}
