package X;

import java.util.Iterator;

/* renamed from: X.Nw6  reason: case insensitive filesystem */
public abstract class C70028Nw6 {
    public static final boolean A00(String str) {
        Iterator it = C72541P9y.A05.iterator();
        while (it.hasNext()) {
            if (00l.A0d(AnonymousClass7TF.A0j(str), AnonymousClass7TE.A18(it), false)) {
                return true;
            }
        }
        return false;
    }
}
