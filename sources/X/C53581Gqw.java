package X;

/* renamed from: X.Gqw  reason: case insensitive filesystem */
public final class C53581Gqw extends AnonymousClass0T0 implements C59516JMo {
    public final AnonymousClass3X1 A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53581Gqw) {
                C53581Gqw gqw = (C53581Gqw) obj;
                if (!0qQ.A0K(this.A01, gqw.A01) || !0qQ.A0K(this.A02, gqw.A02) || this.A00 != gqw.A00 || this.A03 != gqw.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A01))));
    }

    public C53581Gqw(AnonymousClass3X1 r1, String str, String str2, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r1;
        this.A03 = z;
    }
}
