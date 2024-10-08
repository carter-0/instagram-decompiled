package X;

import java.util.List;

/* renamed from: X.5gg  reason: invalid class name and case insensitive filesystem */
public final class C291175gg implements C254773t1 {
    public final List A00;

    public C291175gg(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C291175gg)) {
            return false;
        }
        List list = this.A00;
        List list2 = ((C291175gg) obj).A00;
        return list.containsAll(list2) && list2.containsAll(list);
    }

    public final int hashCode() {
        int i = 0;
        for (Object hashCode : this.A00) {
            i ^= hashCode.hashCode();
        }
        return i;
    }
}
