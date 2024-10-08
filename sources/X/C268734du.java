package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.4du  reason: invalid class name and case insensitive filesystem */
public final class C268734du {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C268734du)) {
                return false;
            }
            C268734du r4 = (C268734du) obj;
            if (!(this.A01 == r4.A01 && this.A00 == r4.A00)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String format = String.format((Locale) null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00)}, 2));
        0qQ.A07(format);
        return format;
    }

    public final int hashCode() {
        return ((this.A01 + 31) * 31) + this.A00;
    }

    public C268734du(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
