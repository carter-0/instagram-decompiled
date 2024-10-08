package X;

public final class WLU implements C20891X2x {
    public final VU7 A00;

    public final /* bridge */ /* synthetic */ void CtB(C20888X2s x2s, Object obj) {
        V33 v33 = (V33) obj;
        if (v33 instanceof C15211UVo) {
            VU7 vu7 = this.A00;
            C17420VUz vUz = new C17420VUz(x2s, this, v33);
            1NY r2 = new 1NY(vu7.A00, 606);
            r2.A05();
            r2.A0A("zr/carrier_signal/config/");
            1OC A0S = DbT.A0S(r2, UWv.class, C18128Vlw.class);
            C15619Ufl.A00(A0S, vu7, vUz, 28);
            vu7.A01.schedule(A0S);
        }
    }

    public WLU(VU7 vu7) {
        this.A00 = vu7;
    }
}
