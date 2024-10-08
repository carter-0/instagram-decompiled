package X;

/* renamed from: X.N3r  reason: case insensitive filesystem */
public final class C68176N3r extends AnonymousClass0T0 {
    public final C61078JwG A00;
    public final C61080JwI A01;
    public final C53370Gmu A02;
    public final BBV A03;
    public final BBV A04;
    public final BBV A05;
    public final BBV A06;
    public final JV7 A07;
    public final N38 A08;

    public C68176N3r() {
        this((C61078JwG) null, (C61080JwI) null, (C53370Gmu) null, (BBV) null, (BBV) null, (BBV) null, (BBV) null, (JV7) null, (N38) null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68176N3r) {
                C68176N3r n3r = (C68176N3r) obj;
                if (!0qQ.A0K(this.A08, n3r.A08) || !0qQ.A0K(this.A05, n3r.A05) || !0qQ.A0K(this.A03, n3r.A03) || !0qQ.A0K(this.A06, n3r.A06) || !0qQ.A0K(this.A07, n3r.A07) || !0qQ.A0K(this.A02, n3r.A02) || !0qQ.A0K(this.A04, n3r.A04) || !0qQ.A0K(this.A00, n3r.A00) || !0qQ.A0K(this.A01, n3r.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0C(this.A08) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C68176N3r(C61078JwG jwG, C61080JwI jwI, C53370Gmu gmu, BBV bbv, BBV bbv2, BBV bbv3, BBV bbv4, JV7 jv7, N38 n38) {
        this.A08 = n38;
        this.A05 = bbv;
        this.A03 = bbv2;
        this.A06 = bbv3;
        this.A07 = jv7;
        this.A02 = gmu;
        this.A04 = bbv4;
        this.A00 = jwG;
        this.A01 = jwI;
    }
}
