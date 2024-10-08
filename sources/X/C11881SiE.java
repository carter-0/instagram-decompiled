package X;

/* renamed from: X.SiE  reason: case insensitive filesystem */
public final class C11881SiE implements C13692TfA {
    public final /* synthetic */ C11904Sid A00;
    public final /* synthetic */ C10528Rth A01;

    public C11881SiE(C11904Sid sid, C10528Rth rth) {
        this.A00 = sid;
        this.A01 = rth;
    }

    public final void D7o(Object obj) {
        C11904Sid sid = this.A00;
        C10528Rth rth = this.A01;
        C10528Rth rth2 = sid.A05;
        if (rth2 != null && rth2 == rth) {
            C10112Rmo rmo = sid.A01.A06;
            Object obj2 = obj;
            if (obj != null) {
                Integer AvP = rth.A01.AvP();
                if (!(rmo instanceof QH3) ? !(!(rmo instanceof QH2) || AvP == AnonymousClass05K.A0C || AvP == AnonymousClass05K.A0Y) : AnonymousClass7TF.A1W(AvP, AnonymousClass05K.A01)) {
                    sid.A06 = obj;
                    sid.A00.EHo();
                    return;
                }
            }
            C13766Tge tge = sid.A00;
            C13892TjF tjF = rth.A00;
            C13812Thf thf = rth.A01;
            tge.D7m(tjF, sid.A04, thf, thf.AvP(), obj2);
        }
    }

    public final void DOG(Exception exc) {
        C11904Sid sid = this.A00;
        C10528Rth rth = this.A01;
        C10528Rth rth2 = sid.A05;
        if (rth2 != null && rth2 == rth) {
            C13766Tge tge = sid.A00;
            C11854Shg shg = sid.A04;
            C13812Thf thf = rth.A01;
            tge.D7l(shg, thf, exc, thf.AvP());
        }
    }
}
