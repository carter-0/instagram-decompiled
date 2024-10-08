package X;

/* renamed from: X.Glt  reason: case insensitive filesystem */
public final class C53307Glt extends AnonymousClass0T0 {
    public final long A00;
    public final long A01;
    public final GO6 A02;
    public final GO6 A03;
    public final GO6 A04;
    public final C53289Glb A05;
    public final C53289Glb A06;
    public final C53289Glb A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53307Glt) {
                C53307Glt glt = (C53307Glt) obj;
                if (this.A00 != glt.A00 || this.A01 != glt.A01 || !0qQ.A0K(this.A02, glt.A02) || !0qQ.A0K(this.A03, glt.A03) || !0qQ.A0K(this.A04, glt.A04) || !0qQ.A0K(this.A05, glt.A05) || !0qQ.A0K(this.A06, glt.A06) || !0qQ.A0K(this.A07, glt.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A07, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A01(this.A01, C51967G9n.A02(this.A00))))))));
    }

    public C53307Glt(GO6 go6, GO6 go62, GO6 go63, C53289Glb glb, C53289Glb glb2, C53289Glb glb3, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = go6;
        this.A03 = go62;
        this.A04 = go63;
        this.A05 = glb;
        this.A06 = glb2;
        this.A07 = glb3;
    }
}
