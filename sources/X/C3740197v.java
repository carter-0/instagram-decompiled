package X;

import java.util.Arrays;

/* renamed from: X.97v  reason: invalid class name and case insensitive filesystem */
public final class C3740197v {
    public final Class A00;
    public final Class A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3740197v)) {
            return false;
        }
        C3740197v r4 = (C3740197v) obj;
        if (!r4.A00.equals(this.A00) || !r4.A01.equals(this.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final String toString() {
        return 002.A0g(this.A00.getSimpleName(), " with serialization type: ", this.A01.getSimpleName());
    }

    public C3740197v(Class cls, Class cls2) {
        this.A00 = cls;
        this.A01 = cls2;
    }
}
