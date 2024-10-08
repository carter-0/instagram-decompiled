package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Xvz  reason: case insensitive filesystem */
public final class C22135Xvz implements Y9B {
    public final List A00 = AnonymousClass7TE.A1C();
    public final int A01;

    public final boolean CXT(long j) {
        int i = this.A01;
        Iterator it = this.A00.iterator();
        if (i == 2) {
            while (it.hasNext()) {
                if (((Y9B) it.next()).CXT(0)) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (!((Y9B) it.next()).CXT(0)) {
                return false;
            }
        }
        return true;
    }

    public C22135Xvz(int i) {
        this.A01 = i;
    }
}
