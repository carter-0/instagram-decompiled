package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5mD  reason: invalid class name and case insensitive filesystem */
public final class C294295mD extends 0Yx implements Set, Collection, C62650uo {
    public final C284985Pf A00;

    public final int A08() {
        return this.A00.size();
    }

    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        C284985Pf r2 = this.A00;
        Object obj2 = r2.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != null) {
            return obj2.equals(value);
        }
        if (value != null || !r2.containsKey(entry.getKey())) {
            return false;
        }
        return true;
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

    public C294295mD(C284985Pf r1) {
        this.A00 = r1;
    }
}
