package X;

/* renamed from: X.Ju3  reason: case insensitive filesystem */
public final class C60945Ju3 extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C60945Ju3(String str, String str2, String str3, String str4, int i, boolean z) {
        C51973G9u.A0r(3, str2, str3, str4);
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60945Ju3) {
                C60945Ju3 ju3 = (C60945Ju3) obj;
                if (!0qQ.A0K(this.A03, ju3.A03) || this.A00 != ju3.A00 || !0qQ.A0K(this.A04, ju3.A04) || !0qQ.A0K(this.A02, ju3.A02) || !0qQ.A0K(this.A01, ju3.A01) || this.A05 != ju3.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, (AnonymousClass7TE.A0O(this.A03) + this.A00) * 31))));
    }
}
