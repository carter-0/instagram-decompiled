package X;

import java.util.List;

/* renamed from: X.60L  reason: invalid class name */
public final class AnonymousClass60L extends AnonymousClass0T0 implements AnonymousClass60M {
    public final List A00;

    public AnonymousClass60L(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final AnonymousClass60L F6w(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass60L) && 0qQ.A0K(this.A00, ((AnonymousClass60L) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
