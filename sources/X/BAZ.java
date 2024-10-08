package X;

import java.util.List;

public final class BAZ extends AnonymousClass0T0 {
    public final List A00;

    public BAZ(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BAZ) && 0qQ.A0K(this.A00, ((BAZ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
