package X;

import java.util.Iterator;

/* renamed from: X.WLs  reason: case insensitive filesystem */
public final class C19111WLs implements C20892X2y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ X6B A01;
    public final /* synthetic */ C20892X2y A02;
    public final /* synthetic */ C17186VLq A03;
    public final /* synthetic */ C19103WLk A04;

    public C19111WLs(X6B x6b, C20892X2y x2y, C17186VLq vLq, C19103WLk wLk, int i) {
        this.A04 = wLk;
        this.A01 = x6b;
        this.A03 = vLq;
        this.A00 = i;
        this.A02 = x2y;
    }

    public final void DBa(Object obj) {
        C19103WLk wLk = this.A04;
        if (!wLk.A00) {
            wLk.A00 = true;
            C18026Vk4 vk4 = wLk.A01;
            WM2 wm2 = new WM2();
            Iterator A0s = AnonymousClass7TF.A0s(vk4.A00);
            while (A0s.hasNext()) {
                WM2.A00(wm2, C51971G9r.A0p(A0s));
            }
            Iterator it = wm2.iterator();
            while (it.hasNext()) {
                X6B x6b = (X6B) it.next();
                if (x6b != this.A01) {
                    x6b.AG5(this.A03);
                }
            }
            this.A02.DBa(new VR4(this.A00, obj));
        }
    }
}
