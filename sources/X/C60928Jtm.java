package X;

/* renamed from: X.Jtm  reason: case insensitive filesystem */
public final class C60928Jtm extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60928Jtm) {
                C60928Jtm jtm = (C60928Jtm) obj;
                if (!0qQ.A0K(this.A03, jtm.A03) || !0qQ.A0K(this.A02, jtm.A02) || this.A00 != jtm.A00 || this.A01 != jtm.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03)));
        long j = this.A01;
        return A012 + ((int) (j ^ (j >>> 32)));
    }

    public C60928Jtm(long j, String str, long j2, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = j2;
    }
}
