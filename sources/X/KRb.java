package X;

import java.util.List;

public final class KRb extends C62815Kmr {
    public final List A00;

    public KRb(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KRb) && 0qQ.A0K(this.A00, ((KRb) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
