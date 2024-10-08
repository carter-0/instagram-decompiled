package X;

import java.util.List;

public final class K3D extends C62723KlN {
    public final List A00;

    public K3D(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K3D) && 0qQ.A0K(this.A00, ((K3D) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
