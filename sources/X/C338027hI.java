package X;

/* renamed from: X.7hI  reason: invalid class name and case insensitive filesystem */
public final class C338027hI extends AnonymousClass0T0 implements C335937dm {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C338027hI) {
                C338027hI r5 = (C338027hI) obj;
                if (this.A01 != r5.A01 || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + this.A00.hashCode();
    }

    public C338027hI(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
