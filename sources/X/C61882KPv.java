package X;

import java.util.List;

/* renamed from: X.KPv  reason: case insensitive filesystem */
public final class C61882KPv extends C62791KmT {
    public final List A00;

    public C61882KPv(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61882KPv) && 0qQ.A0K(this.A00, ((C61882KPv) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
