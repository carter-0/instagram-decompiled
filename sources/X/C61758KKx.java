package X;

import java.util.List;

/* renamed from: X.KKx  reason: case insensitive filesystem */
public final class C61758KKx extends C62753Klr {
    public final List A00;

    public C61758KKx(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61758KKx) && 0qQ.A0K(this.A00, ((C61758KKx) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
