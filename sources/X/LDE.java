package X;

import java.util.HashSet;
import java.util.Iterator;

public final class LDE {
    public final 2el A00;
    public final C64894Lju A01;
    public final HashSet A02 = AnonymousClass7TE.A1F();

    public final void A00() {
        HashSet hashSet = this.A02;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.A00.A04(JTO.A0H(it));
        }
        hashSet.clear();
    }

    public LDE(2el r2, LS8 ls8) {
        this.A00 = r2;
        this.A01 = new C64894Lju(ls8);
    }
}
