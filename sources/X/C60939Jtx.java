package X;

/* renamed from: X.Jtx  reason: case insensitive filesystem */
public final class C60939Jtx extends AnonymousClass0T0 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final long A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60939Jtx) {
                C60939Jtx jtx = (C60939Jtx) obj;
                if (!0qQ.A0K(this.A04, jtx.A04) || !0qQ.A0K(this.A03, jtx.A03) || !0qQ.A0K(this.A02, jtx.A02) || !0qQ.A0K(this.A01, jtx.A01) || this.A00 != jtx.A00 || this.A05 != jtx.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A04));
        return AnonymousClass7TF.A01(this.A05, AnonymousClass7TF.A01(this.A00, (AnonymousClass7TF.A08(this.A02, A08) + AnonymousClass7TG.A0E(this.A01)) * 31)) + C54732HQn.A00();
    }

    public C60939Jtx(long j, String str, String str2, String str3, String str4, long j2) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A00 = j;
        this.A05 = j2;
    }
}
