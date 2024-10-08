package X;

/* renamed from: X.3ha  reason: invalid class name and case insensitive filesystem */
public final class C248203ha extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final C61078JwG A02;
    public final String A03;
    public final boolean A04 = true;

    public C248203ha(C61078JwG jwG, String str, int i, int i2) {
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = jwG;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C248203ha) {
                C248203ha r5 = (C248203ha) obj;
                if (!(0qQ.A0K(this.A03, r5.A03) && this.A01 == r5.A01 && this.A00 == r5.A00 && 0qQ.A0K(this.A02, r5.A02) && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A03;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((((((hashCode * 31) + this.A01) * 31) + this.A00) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return hashCode2 + i;
    }
}
