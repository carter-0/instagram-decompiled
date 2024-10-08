package X;

/* renamed from: X.Jxs  reason: case insensitive filesystem */
public final class C61142Jxs extends AnonymousClass0T0 implements C66385MPr {
    public final C53373Gn3 A00;
    public final C61071Jw9 A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61142Jxs) {
                C61142Jxs jxs = (C61142Jxs) obj;
                if (!0qQ.A0K(this.A00, jxs.A00) || !0qQ.A0K(this.A01, jxs.A01) || this.A02 != jxs.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)) + C63046Kqb.A00(this.A02);
    }

    public C61142Jxs(C53373Gn3 gn3, C61071Jw9 jw9, Integer num) {
        AnonymousClass7TG.A1U(gn3, jw9, num);
        this.A00 = gn3;
        this.A01 = jw9;
        this.A02 = num;
    }
}
