package X;

import java.util.List;

public final class BAX extends AnonymousClass0T0 {
    public final List A00;

    public BAX(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BAX) && 0qQ.A0K(this.A00, ((BAX) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
