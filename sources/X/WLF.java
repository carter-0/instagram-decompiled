package X;

public final class WLF implements X2v {
    public final X2v A00;
    public final X2v A01 = new Object();
    public final X2v A02;

    public final /* bridge */ /* synthetic */ Object EB6(Object obj, Object obj2) {
        C17681VcC vcC = (C17681VcC) obj;
        C18474VsQ vsQ = vcC.A00;
        C18474VsQ vsQ2 = vsQ;
        VV3 vv3 = vcC.A02;
        C18475VsR vsR = vcC.A03;
        C18475VsR vsR2 = vsR;
        X2v x2v = this.A01;
        C18499Vsu vsu = vcC.A01;
        Object obj3 = obj2;
        C18499Vsu vsu2 = (C18499Vsu) x2v.EB6(vsu, obj3);
        boolean z = true;
        boolean A1a = C51969G9p.A1a(vsu2, vsu);
        X2v x2v2 = this.A00;
        if (x2v2 != null) {
            vsQ2 = (C18474VsQ) x2v2.EB6(vsQ, obj3);
            A1a |= C51969G9p.A1a(vsQ2, vsQ);
        }
        X2v x2v3 = this.A02;
        if (x2v3 != null) {
            vsR2 = (C18475VsR) x2v3.EB6(vsR, obj3);
            if (vsR2 == vsR) {
                z = false;
            }
            A1a |= z;
        }
        if (!A1a) {
            return vcC;
        }
        boolean z2 = vcC.A04;
        boolean z3 = vcC.A05;
        boolean z4 = vcC.A07;
        return new C17681VcC(vsQ2, vsu2, vv3, vsR2, z3, z2, vcC.A09, z4, vcC.A06, vcC.A08);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.X2v, java.lang.Object] */
    public WLF(X2v x2v, X2v x2v2) {
        this.A00 = x2v;
        this.A02 = x2v2;
    }
}
