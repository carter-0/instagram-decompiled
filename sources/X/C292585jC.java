package X;

import java.util.Iterator;

/* renamed from: X.5jC  reason: invalid class name and case insensitive filesystem */
public final class C292585jC implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C263694Mz A04;

    public C292585jC(C263694Mz r1, int i, int i2, int i3, int i4) {
        this.A04 = r1;
        this.A00 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
    }

    public final void run() {
        Iterator it = this.A04.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).D80(this.A00, this.A03, this.A02, this.A01);
        }
    }
}
