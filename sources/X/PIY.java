package X;

import java.lang.ref.WeakReference;

public final class PIY implements AnonymousClass520 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PIZ A01;
    public final /* synthetic */ C242713Vq A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;

    public PIY(PIZ piz, C242713Vq r2, String str, WeakReference weakReference, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A03 = str;
        this.A01 = piz;
        this.A04 = weakReference;
    }

    public final void DFr(boolean z) {
        C308836Vu r0;
        int i = this.A00;
        String str = this.A03;
        PIZ piz = this.A01;
        C74263Prr prr = piz.A07;
        0qQ.A0A(str);
        C72743PIa pIa = (C72743PIa) prr;
        pIa.A00.A09.A00(str, z, i);
        11Z.A02(new C73103PWk(pIa));
        WeakReference weakReference = this.A04;
        if (!(weakReference == null || (r0 = (C308836Vu) weakReference.get()) == null)) {
            r0.A00(z);
        }
        PIZ.A00(piz);
    }
}
