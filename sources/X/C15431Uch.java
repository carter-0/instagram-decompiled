package X;

/* renamed from: X.Uch  reason: case insensitive filesystem */
public final class C15431Uch extends C18477VsT {
    public final C17201VMf A00;
    public final X1F A01;
    public final X1G A02;

    public C15431Uch(C17732Vd1 vd1) {
        super(new C18478VsU(vd1.A04, vd1.A0G), vd1.A08, vd1.A0A, 100);
        C17631VbN vbN;
        VY6 vy6 = vd1.A05;
        if (vy6 != null) {
            this.A01 = new C19192WOy(new C17333VRm(vy6));
            C18477VsT.A00(vy6);
            C17630VbM vbM = vd1.A04;
            if (vbM == null || (vbN = vbM.A00) == null) {
                throw AnonymousClass7TE.A0y();
            }
            this.A02 = new C19193WOz(new VZM(vbN));
            this.A00 = new C17201VMf(vd1.A0A);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C15431Uch(C17629VbL vbL, int i) {
        super(new C18478VsU(vbL.A01, vbL.A06), vbL.A03, vbL.A04, i);
        C17631VbN vbN;
        VY6 vy6 = vbL.A02;
        if (vy6 != null) {
            this.A01 = new C19192WOy(new C17333VRm(vy6));
            C18477VsT.A00(vy6);
            C17630VbM vbM = vbL.A01;
            if (vbM == null || (vbN = vbM.A00) == null) {
                throw AnonymousClass7TE.A0y();
            }
            this.A02 = new C19193WOz(new VZM(vbN));
            this.A00 = new C17201VMf(vbL.A04);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
