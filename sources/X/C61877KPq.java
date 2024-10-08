package X;

/* renamed from: X.KPq  reason: case insensitive filesystem */
public final class C61877KPq extends C62790KmS {
    public final 1Xj A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61877KPq) {
                C61877KPq kPq = (C61877KPq) obj;
                if (!0qQ.A0K(this.A00, kPq.A00) || !0qQ.A0K(this.A01, kPq.A01) || !0qQ.A0K(this.A02, kPq.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0E(this.A02);
    }

    public C61877KPq(1Xj r1, String str, String str2) {
        AnonymousClass7TG.A1O(r1, str);
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }
}
