package X;

/* renamed from: X.GEe  reason: case insensitive filesystem */
public final class C52084GEe extends AnonymousClass0T0 {
    public final int A00;
    public final C267324bN A01;
    public final C295365o2 A02;
    public final String A03;
    public final boolean A04;

    public C52084GEe(C267324bN r2, C295365o2 r3, String str, int i, boolean z) {
        0qQ.A0B(r3, 2);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i;
        this.A03 = str;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52084GEe) {
                C52084GEe gEe = (C52084GEe) obj;
                if (!(0qQ.A0K(this.A01, gEe.A01) && this.A02 == gEe.A02 && this.A00 == gEe.A00 && 0qQ.A0K(this.A03, gEe.A03) && this.A04 == gEe.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        return DbS.A06(this.A04, AnonymousClass7TF.A08(this.A03, (AnonymousClass7TF.A07(this.A02, A0K) + this.A00) * 31));
    }
}
