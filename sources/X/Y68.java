package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class Y68 extends 0Yx implements Set, Collection, C62650uo {
    public final C284985Pf A00;

    public final int A08() {
        return this.A00.size();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        C285005Ph r4 = this.A00.A00;
        C294305mE[] r2 = new C294305mE[8];
        int i = 0;
        do {
            r2[i] = new C294305mE();
            i++;
        } while (i < 8);
        return new C294335mH(r4, r2);
    }

    public Y68(C284985Pf r1) {
        this.A00 = r1;
    }
}
