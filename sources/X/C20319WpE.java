package X;

import java.util.Iterator;

/* renamed from: X.WpE  reason: case insensitive filesystem */
public final class C20319WpE implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C263694Mz A02;
    public final /* synthetic */ C263674Mx A03;

    public C20319WpE(C263694Mz r1, C263674Mx r2, float f, long j) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = j;
        this.A03 = r2;
    }

    public final void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DXg(this.A03, this.A00, this.A01);
        }
    }
}
