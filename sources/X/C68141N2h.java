package X;

/* renamed from: X.N2h  reason: case insensitive filesystem */
public final class C68141N2h extends AnonymousClass0T0 {
    public final long A00;
    public final O63 A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68141N2h) {
                C68141N2h n2h = (C68141N2h) obj;
                if (!0qQ.A0K(this.A02, n2h.A02) || this.A00 != n2h.A00 || !0qQ.A0K(this.A03, n2h.A03) || !0qQ.A0K(this.A01, n2h.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A08(this.A03, C51972G9s.A07(this.A00, AnonymousClass7TE.A0O(this.A02))));
    }

    public C68141N2h(O63 o63, String str, String str2, long j) {
        AnonymousClass7TG.A1P(str, str2);
        this.A02 = str;
        this.A00 = j;
        this.A03 = str2;
        this.A01 = o63;
    }
}
