package X;

/* renamed from: X.Jxr  reason: case insensitive filesystem */
public final class C61141Jxr extends AnonymousClass0T0 implements C66384MPq {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C61141Jxr(String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        0qQ.A0B(str4, 6);
        this.A05 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A06 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61141Jxr) {
                C61141Jxr jxr = (C61141Jxr) obj;
                if (!0qQ.A0K(this.A05, jxr.A05) || this.A00 != jxr.A00 || this.A01 != jxr.A01 || !0qQ.A0K(this.A02, jxr.A02) || !0qQ.A0K(this.A04, jxr.A04) || !0qQ.A0K(this.A03, jxr.A03) || this.A06 != jxr.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A06, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A02, (((AnonymousClass7TE.A0O(this.A05) + this.A00) * 31) + this.A01) * 31))));
    }
}
