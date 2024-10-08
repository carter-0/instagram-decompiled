package X;

/* renamed from: X.Ju2  reason: case insensitive filesystem */
public final class C60944Ju2 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60944Ju2) {
                C60944Ju2 ju2 = (C60944Ju2) obj;
                if (!0qQ.A0K(this.A04, ju2.A04) || !0qQ.A0K(this.A03, ju2.A03) || !0qQ.A0K(this.A05, ju2.A05) || this.A00 != ju2.A00 || this.A01 != ju2.A01 || this.A02 != ju2.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A04))) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public C60944Ju2(String str, String str2, String str3, int i, int i2, int i3) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
