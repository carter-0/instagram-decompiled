package X;

/* renamed from: X.Jxv  reason: case insensitive filesystem */
public final class C61145Jxv extends AnonymousClass0T0 implements C66389MPv {
    public final long A00;
    public final 2EG A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61145Jxv) {
                C61145Jxv jxv = (C61145Jxv) obj;
                if (!0qQ.A0K(this.A03, jxv.A03) || this.A01 != jxv.A01 || !0qQ.A0K(this.A02, jxv.A02) || this.A00 != jxv.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A03))) + C51968G9o.A03(this.A00);
    }

    public C61145Jxv(2EG r1, String str, String str2, long j) {
        AnonymousClass7TG.A1U(str, r1, str2);
        this.A03 = str;
        this.A01 = r1;
        this.A02 = str2;
        this.A00 = j;
    }
}
