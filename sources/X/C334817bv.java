package X;

/* renamed from: X.7bv  reason: invalid class name and case insensitive filesystem */
public final class C334817bv extends AnonymousClass0T0 implements C334127ai {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C334817bv) {
                C334817bv r5 = (C334817bv) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return hashCode + i;
    }

    public C334817bv(String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }
}
