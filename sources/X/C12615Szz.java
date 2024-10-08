package X;

import java.io.Serializable;
import java.util.List;

/* renamed from: X.Szz  reason: case insensitive filesystem */
public final class C12615Szz implements 1UV, Serializable {
    public final List A00;

    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.A00;
            if (i >= list.size()) {
                return true;
            }
            if (!((1UV) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12615Szz) {
            return this.A00.equals(((C12615Szz) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.A00;
        StringBuilder A16 = Pxe.A16("Predicates.");
        A16.append("and");
        A16.append('(');
        boolean z = true;
        for (Object next : list) {
            if (!z) {
                A16.append(',');
            }
            A16.append(next);
            z = false;
        }
        return AnonymousClass7TG.A0p(A16);
    }

    public C12615Szz(List list) {
        this.A00 = list;
    }
}
