package X;

/* renamed from: X.GlX  reason: case insensitive filesystem */
public final class C53285GlX extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final AnonymousClass7a4 A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C53285GlX(AnonymousClass7a4 r2, String str, String str2, int i, long j, boolean z) {
        0qQ.A0B(str2, 2);
        this.A04 = str;
        this.A03 = str2;
        this.A01 = j;
        this.A00 = i;
        this.A02 = r2;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53285GlX) {
                C53285GlX glX = (C53285GlX) obj;
                if (!0qQ.A0K(this.A04, glX.A04) || !0qQ.A0K(this.A03, glX.A03) || this.A01 != glX.A01 || this.A00 != glX.A00 || !0qQ.A0K(this.A02, glX.A02) || this.A05 != glX.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A04));
        return DbS.A06(this.A05, (((C51972G9s.A07(this.A01, A08) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31);
    }
}
