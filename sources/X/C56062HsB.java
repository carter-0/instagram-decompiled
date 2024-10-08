package X;

import java.util.List;

/* renamed from: X.HsB  reason: case insensitive filesystem */
public final class C56062HsB {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56062HsB) && 0qQ.A0K(this.A00, ((C56062HsB) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C56062HsB(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PressedStateStyleValues(pressedStateAnimations=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
