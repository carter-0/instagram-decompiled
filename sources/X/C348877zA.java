package X;

import java.util.Iterator;

/* renamed from: X.7zA  reason: invalid class name and case insensitive filesystem */
public final class C348877zA implements Runnable {
    public final /* synthetic */ C341877nf A00;

    public C348877zA(C341877nf r1) {
        this.A00 = r1;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C340247kw) it.next()).DmX();
        }
    }
}
