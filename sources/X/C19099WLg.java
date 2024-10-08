package X;

/* renamed from: X.WLg  reason: case insensitive filesystem */
public final class C19099WLg implements X6B {
    public final C17617Vb9 A00;

    public final void AG5(C17186VLq vLq) {
    }

    public final void EJW(C20892X2y x2y, C17186VLq vLq, WLK wlk) {
        if (wlk != null) {
            throw new NullPointerException("effectId");
        }
        C18731VzA vzA = this.A00.A01;
        if (vzA != null && !vzA.A01) {
            vzA.A01 = true;
            Object obj = vzA.A00.A00;
            if (obj != null) {
                ((X6B) obj).AG5(vzA.A03);
            }
            vzA.A00 = vzA.A02.EJH();
            C18731VzA.A00(vzA);
        }
        x2y.DBa((Object) null);
    }

    public C19099WLg(C17617Vb9 vb9) {
        this.A00 = vb9;
    }
}
