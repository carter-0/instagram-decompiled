package X;

import java.util.Arrays;

/* renamed from: X.97J  reason: invalid class name */
public final class AnonymousClass97J {
    public final Class A00;
    public final Class A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass97J)) {
            return false;
        }
        AnonymousClass97J r4 = (AnonymousClass97J) obj;
        if (!r4.A00.equals(this.A00) || !r4.A01.equals(this.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final String toString() {
        return 002.A0g(this.A00.getSimpleName(), " with primitive type: ", this.A01.getSimpleName());
    }

    public AnonymousClass97J(Class cls, Class cls2) {
        this.A00 = cls;
        this.A01 = cls2;
    }
}
