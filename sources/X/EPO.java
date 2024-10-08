package X;

import java.util.List;

public final class EPO extends C48204Eak {
    public final List A00;

    public EPO(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EPO) && 0qQ.A0K(this.A00, ((EPO) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
