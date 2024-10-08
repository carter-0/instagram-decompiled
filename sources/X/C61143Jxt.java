package X;

/* renamed from: X.Jxt  reason: case insensitive filesystem */
public final class C61143Jxt extends AnonymousClass0T0 implements C66385MPr {
    public final C53373Gn3 A00;
    public final C61071Jw9 A01;
    public final C62737Klb A02;
    public final C266444Yx A03;
    public final Integer A04;
    public final boolean A05;

    public C61143Jxt(C53373Gn3 gn3, C61071Jw9 jw9, C62737Klb klb, C266444Yx r5, Integer num, boolean z) {
        0qQ.A0B(num, 6);
        this.A00 = gn3;
        this.A01 = jw9;
        this.A03 = r5;
        this.A05 = z;
        this.A02 = klb;
        this.A04 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61143Jxt) {
                C61143Jxt jxt = (C61143Jxt) obj;
                if (!0qQ.A0K(this.A00, jxt.A00) || !0qQ.A0K(this.A01, jxt.A01) || !0qQ.A0K(this.A03, jxt.A03) || this.A05 != jxt.A05 || !0qQ.A0K(this.A02, jxt.A02) || this.A04 != jxt.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A03, (AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01)) * 31))) + C63046Kqb.A00(this.A04);
    }
}
