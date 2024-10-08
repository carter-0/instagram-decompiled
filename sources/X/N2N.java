package X;

import java.util.List;

public final class N2N extends AnonymousClass0T0 {
    public final List A00;

    public N2N(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N2N) && 0qQ.A0K(this.A00, ((N2N) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
