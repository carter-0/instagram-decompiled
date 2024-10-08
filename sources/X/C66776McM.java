package X;

/* renamed from: X.McM  reason: case insensitive filesystem */
public final class C66776McM extends AnonymousClass0T0 {
    public final AnonymousClass9IV A00;
    public final C69597Nof A01;
    public final C69648NpW A02;
    public final C69598Nog A03;
    public final C69599Noh A04;
    public final AnonymousClass70M A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66776McM) {
                C66776McM mcM = (C66776McM) obj;
                if (!0qQ.A0K(this.A01, mcM.A01) || !0qQ.A0K(this.A03, mcM.A03) || !0qQ.A0K(this.A02, mcM.A02) || !0qQ.A0K(this.A06, mcM.A06) || !0qQ.A0K(this.A04, mcM.A04) || !0qQ.A0K(this.A00, mcM.A00) || this.A05 != mcM.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A04, (((((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public C66776McM(AnonymousClass9IV r1, C69597Nof nof, C69648NpW npW, C69598Nog nog, C69599Noh noh, AnonymousClass70M r6, String str) {
        this.A01 = nof;
        this.A03 = nog;
        this.A02 = npW;
        this.A06 = str;
        this.A04 = noh;
        this.A00 = r1;
        this.A05 = r6;
    }
}
