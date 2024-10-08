package X;

/* renamed from: X.8sR  reason: invalid class name and case insensitive filesystem */
public final class C368328sR extends AnonymousClass0T0 {
    public final C368318sQ A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C368328sR(C368318sQ r2, String str, String str2, String str3, boolean z) {
        0qQ.A0B(r2, 2);
        0qQ.A0B(str3, 5);
        this.A01 = str;
        this.A00 = r2;
        this.A02 = str2;
        this.A04 = z;
        this.A03 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C368328sR) {
                C368328sR r5 = (C368328sR) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || this.A04 != r5.A04 || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.A00.hashCode()) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        return ((i2 + i3) * 31) + this.A03.hashCode();
    }
}
