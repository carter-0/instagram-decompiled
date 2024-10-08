package X;

public final class WLV implements C20891X2x {
    public final VQ4 A00;

    public final /* bridge */ /* synthetic */ void CtB(C20888X2s x2s, Object obj) {
        V33 v33 = (V33) obj;
        if (v33 instanceof C15218UVv) {
            C15218UVv uVv = (C15218UVv) v33;
            String A11 = 002.A11(uVv.A01.A02, "&ping_id=", uVv.A03, "&ping_group_id=", uVv.A02);
            VQ4 vq4 = this.A00;
            VV0 vv0 = new VV0(x2s, uVv, this);
            1OC A002 = SC6.A00(A11);
            C15619Ufl.A00(A002, vq4, vv0, 29);
            vq4.A00.schedule(A002);
        }
    }

    public WLV(VQ4 vq4) {
        this.A00 = vq4;
    }
}
