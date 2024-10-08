package X;

import java.util.List;

/* renamed from: X.9dc  reason: invalid class name and case insensitive filesystem */
public final class C382389dc extends C370308wB {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C382389dc) && 0qQ.A0K(this.A00, ((C382389dc) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C382389dc(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MlInputFloatArrays(floatArrays=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
