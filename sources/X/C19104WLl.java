package X;

/* renamed from: X.WLl  reason: case insensitive filesystem */
public final class C19104WLl implements X6B {
    public C19106WLn A00;
    public final UVD A01;
    public final C20893X2z A02;

    public final void AG5(C17186VLq vLq) {
        C19106WLn wLn = this.A00;
        if (wLn != null) {
            wLn.AG5(vLq);
            this.A00 = null;
        }
    }

    public final void EJW(C20892X2y x2y, C17186VLq vLq, WLK wlk) {
        C19106WLn wLn = new C19106WLn(this.A02);
        this.A00 = wLn;
        wLn.EJW(new C19108WLp(x2y, this), vLq, wlk);
        new C19101WLi(this.A01).EJW(new C19107WLo(this), vLq, wlk);
    }

    public C19104WLl(UVD uvd, Class cls) {
        this.A01 = uvd;
        this.A02 = new C19113WLu(1, this, cls);
    }
}
