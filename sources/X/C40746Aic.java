package X;

import java.util.Iterator;

/* renamed from: X.Aic  reason: case insensitive filesystem */
public final class C40746Aic implements Runnable {
    public final /* synthetic */ C341877nf A00;

    public C40746Aic(C341877nf r1) {
        this.A00 = r1;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
