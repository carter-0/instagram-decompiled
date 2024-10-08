package X;

/* renamed from: X.GQo  reason: case insensitive filesystem */
public final class C52389GQo extends AnonymousClass0T0 {
    public final C266444Yx A00;
    public final C283155Gi A01;
    public final GQR A02;
    public final C54698HPd A03;
    public final C52406GRh A04;
    public final C59643JRl A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52389GQo) {
                C52389GQo gQo = (C52389GQo) obj;
                if (!0qQ.A0K(this.A05, gQo.A05) || !0qQ.A0K(this.A02, gQo.A02) || !0qQ.A0K(this.A00, gQo.A00) || !0qQ.A0K(this.A06, gQo.A06) || !0qQ.A0K(this.A04, gQo.A04) || !0qQ.A0K(this.A03, gQo.A03) || this.A07 != gQo.A07 || !0qQ.A0K(this.A01, gQo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A05);
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A07(this.A03, (((((AnonymousClass7TF.A07(this.A02, A0K) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31)));
    }

    public C52389GQo(C266444Yx r1, C283155Gi r2, GQR gqr, C54698HPd hPd, C52406GRh gRh, C59643JRl jRl, String str, boolean z) {
        this.A05 = jRl;
        this.A02 = gqr;
        this.A00 = r1;
        this.A06 = str;
        this.A04 = gRh;
        this.A03 = hPd;
        this.A07 = z;
        this.A01 = r2;
    }
}
