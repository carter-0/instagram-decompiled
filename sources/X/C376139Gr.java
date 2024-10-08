package X;

import java.util.Arrays;

/* renamed from: X.9Gr  reason: invalid class name and case insensitive filesystem */
public final class C376139Gr {
    public final C368148s9 A00;
    public final C376119Gp A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C376139Gr)) {
            return false;
        }
        C376139Gr r4 = (C376139Gr) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A01, this.A00});
    }

    public C376139Gr(C368148s9 r1, C376119Gp r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
