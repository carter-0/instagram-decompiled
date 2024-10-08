package X;

import java.util.Arrays;

/* renamed from: X.5kL  reason: invalid class name and case insensitive filesystem */
public final class C293205kL {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C293205kL)) {
            return false;
        }
        C293205kL r4 = (C293205kL) obj;
        if (!2PP.A00(this.A00, r4.A00) || this.A01 != r4.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, Boolean.valueOf(this.A01)});
    }

    public C293205kL(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
