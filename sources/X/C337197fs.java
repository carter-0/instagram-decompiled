package X;

/* renamed from: X.7fs  reason: invalid class name and case insensitive filesystem */
public final class C337197fs extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C337197fs) {
                C337197fs r5 = (C337197fs) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A05, r5.A05) || this.A06 != r5.A06 || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.A02.hashCode() * 31) + this.A01) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i4 + i;
    }

    public C337197fs(String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str2;
        this.A05 = str3;
        this.A06 = z;
        this.A04 = str4;
    }
}
