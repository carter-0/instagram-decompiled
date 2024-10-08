package X;

import java.util.Iterator;

/* renamed from: X.4Yo  reason: invalid class name and case insensitive filesystem */
public final class C266354Yo implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C263694Mz A03;

    public C266354Yo(C263694Mz r1, float f, int i, int i2) {
        this.A03 = r1;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }

    public final void run() {
        Iterator it = this.A03.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DyH(this.A02, this.A01, this.A00);
        }
    }
}
