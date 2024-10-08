package X;

import java.util.List;

/* renamed from: X.8qr  reason: invalid class name and case insensitive filesystem */
public final class C367508qr {
    public final int A00;
    public final int A01;

    public static List A00(AnonymousClass3Q2 r4, int i, int i2) {
        return AB8.A00(new C367508qr(i, i2), r4.A2k, r4.A4a, r4.A69);
    }

    public final boolean equals(Object obj) {
        C367508qr r4;
        if (obj == null || !(obj instanceof C367508qr) || (r4 = (C367508qr) obj) == null || this.A01 != r4.A01 || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0P("x", this.A01, this.A00);
    }

    public C367508qr(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
