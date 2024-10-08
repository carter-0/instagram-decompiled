package X;

/* renamed from: X.NZs  reason: case insensitive filesystem */
public final class C68860NZs extends C69604Nom {
    public final int A00;
    public final long A01;
    public final C61037Jvb A02;
    public final AnonymousClass3NV A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68860NZs) {
                C68860NZs nZs = (C68860NZs) obj;
                if (!(0qQ.A0K(this.A02, nZs.A02) && this.A05 == nZs.A05 && this.A03 == nZs.A03 && this.A00 == nZs.A00 && this.A01 == nZs.A01 && 0qQ.A0K(this.A04, nZs.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TG.A0C(this.A02) * 31);
        return C51972G9s.A07(this.A01, (AnonymousClass7TF.A07(this.A03, A09) + this.A00) * 31) + C41845B3m.A00(this.A04);
    }

    public C68860NZs(C61037Jvb jvb, AnonymousClass3NV r2, String str, int i, long j, boolean z) {
        this.A02 = jvb;
        this.A05 = z;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = str;
    }
}
