package X;

import java.util.List;

public final class BBR extends AnonymousClass0T0 {
    public final List A00;

    public BBR(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BBR) && 0qQ.A0K(this.A00, ((BBR) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List A00() {
        return this.A00;
    }
}
