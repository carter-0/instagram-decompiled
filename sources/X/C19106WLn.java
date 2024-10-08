package X;

/* renamed from: X.WLn  reason: case insensitive filesystem */
public final class C19106WLn implements X6B {
    public C17419VUy A00;
    public final C20893X2z A01;

    public final void AG5(C17186VLq vLq) {
        C17419VUy vUy = this.A00;
        if (vUy != null) {
            C18436Vrf.A00(vLq.A00.A04.A03).A00.remove(vUy);
            this.A00 = null;
        }
    }

    public final void EJW(C20892X2y x2y, C17186VLq vLq, WLK wlk) {
        if (wlk != null) {
            throw new NullPointerException("effectId");
        }
        C17419VUy vUy = new C17419VUy(x2y, vLq, this);
        this.A00 = vUy;
        WM2.A00(C18436Vrf.A00(vLq.A00.A04.A03), vUy);
    }

    public C19106WLn(Class cls) {
        this.A01 = new C19113WLu(0, this, cls);
    }

    public C19106WLn(C20893X2z x2z) {
        this.A01 = x2z;
    }

    public C19106WLn() {
        this.A01 = new C19112WLt(this);
    }
}
