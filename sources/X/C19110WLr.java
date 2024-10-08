package X;

/* renamed from: X.WLr  reason: case insensitive filesystem */
public final class C19110WLr implements C20892X2y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C20892X2y A01;
    public final /* synthetic */ C17186VLq A02;
    public final /* synthetic */ C19105WLm A03;

    public C19110WLr(C20892X2y x2y, C17186VLq vLq, C19105WLm wLm, int i) {
        this.A03 = wLm;
        this.A00 = i;
        this.A01 = x2y;
        this.A02 = vLq;
    }

    public final void DBa(Object obj) {
        C19105WLm wLm = this.A03;
        if (!wLm.A01) {
            WM2 wm2 = wLm.A03;
            wm2.A00.set(this.A00, obj);
            int i = wLm.A00 + 1;
            wLm.A00 = i;
            if (i == wLm.A02.A00.size()) {
                wLm.A01 = true;
                this.A01.DBa(wm2);
            }
        }
    }
}
