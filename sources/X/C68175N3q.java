package X;

/* renamed from: X.N3q  reason: case insensitive filesystem */
public final class C68175N3q extends AnonymousClass0T0 {
    public final C45274Ctd A00;
    public final HMC A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public C68175N3q() {
        this((C45274Ctd) null, HMC.Initial, "", (String) null, (String) null, false, true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68175N3q) {
                C68175N3q n3q = (C68175N3q) obj;
                if (this.A01 != n3q.A01 || this.A05 != n3q.A05 || !0qQ.A0K(this.A03, n3q.A03) || !0qQ.A0K(this.A02, n3q.A02) || this.A06 != n3q.A06 || !0qQ.A0K(this.A00, n3q.A00) || !0qQ.A0K(this.A04, n3q.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A05, AnonymousClass7TE.A0K(this.A01));
        return ((AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A08(this.A03, A09) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A04);
    }

    public C68175N3q(C45274Ctd ctd, HMC hmc, String str, String str2, String str3, boolean z, boolean z2) {
        this.A01 = hmc;
        this.A05 = z;
        this.A03 = str;
        this.A02 = str2;
        this.A06 = z2;
        this.A00 = ctd;
        this.A04 = str3;
    }
}
