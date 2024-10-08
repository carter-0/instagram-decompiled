package X;

/* renamed from: X.Drb  reason: case insensitive filesystem */
public final class C47160Drb extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final AnonymousClass7JT A02;
    public final C329667Jt A03;
    public final C329667Jt A04;
    public final String A05;
    public final int A06;
    public final AnonymousClass7JU A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47160Drb) {
                C47160Drb drb = (C47160Drb) obj;
                if (!(this.A01 == drb.A01 && this.A00 == drb.A00 && this.A02 == drb.A02 && this.A06 == drb.A06 && 0qQ.A0K(this.A05, drb.A05) && this.A07 == drb.A07 && 0qQ.A0K(this.A04, drb.A04) && 0qQ.A0K(this.A03, drb.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AnonymousClass7JT r0 = this.A02;
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A07, (((AnonymousClass7TF.A07(r0, ((this.A01 * 31) + this.A00) * 31) + this.A06) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31)));
    }

    public C47160Drb(AnonymousClass7JU r1, AnonymousClass7JT r2, C329667Jt r3, C329667Jt r4, String str, int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
        this.A06 = i3;
        this.A05 = str;
        this.A07 = r1;
        this.A04 = r3;
        this.A03 = r4;
    }
}
