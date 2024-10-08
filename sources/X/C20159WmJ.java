package X;

import java.util.Iterator;

/* renamed from: X.WmJ  reason: case insensitive filesystem */
public final class C20159WmJ implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ C17183VLn A01;

    public C20159WmJ(C263694Mz r1, C17183VLn vLn) {
        this.A00 = r1;
        this.A01 = vLn;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DNz(this.A01);
        }
    }
}
