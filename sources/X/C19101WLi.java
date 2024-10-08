package X;

/* renamed from: X.WLi  reason: case insensitive filesystem */
public final class C19101WLi implements X6B {
    public final Object A00;

    public final void AG5(C17186VLq vLq) {
    }

    public final void EJW(C20892X2y x2y, C17186VLq vLq, WLK wlk) {
        if (wlk != null) {
            throw new NullPointerException("effectId");
        }
        C20282WoX woX = new C20282WoX(x2y, vLq, this);
        VR5 vr5 = vLq.A00.A04.A05;
        VV4 vv4 = new VV4(vr5, woX);
        VV4 vv42 = vr5.A01;
        if (vv42 == null) {
            vr5.A01 = vv4;
            vr5.A00 = vv4;
            return;
        }
        vv42.A00 = vv4;
        vr5.A01 = vv4;
    }

    public C19101WLi(Object obj) {
        this.A00 = obj;
    }
}
