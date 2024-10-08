package X;

/* renamed from: X.GmR  reason: case insensitive filesystem */
public final class C53341GmR extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final long A03;
    public final AnonymousClass5VN A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53341GmR) {
                C53341GmR gmR = (C53341GmR) obj;
                if (!0qQ.A0K(this.A02, gmR.A02) || !0qQ.A0K(this.A01, gmR.A01) || this.A00 != gmR.A00 || this.A03 != gmR.A03 || !0qQ.A0K(this.A04, gmR.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float A00() {
        AnonymousClass5VN r2 = this.A04;
        long j = this.A03;
        return ((r2.A02 - r2.A01) * (r2.A00 - r2.A03)) / ((float) (C51965G9l.A04(j) * C289005cr.A00(j)));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A04, C51972G9s.A07(this.A03, (((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A01)) * 31) + this.A00) * 31));
    }

    public C53341GmR(AnonymousClass5VN r1, String str, String str2, int i, long j) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = j;
        this.A04 = r1;
    }
}
