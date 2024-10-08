package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.48n  reason: invalid class name and case insensitive filesystem */
public final class C2611648n {
    public final long A00;
    public final String A01;
    public final Set A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2611648n r7 = (C2611648n) obj;
            if (this.A00 != r7.A00 || !2Ob.A00(this.A01, r7.A01) || !2Ob.A00(this.A02, r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A01, this.A02});
    }

    public C2611648n(String str, Set set, long j) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = set;
    }
}
