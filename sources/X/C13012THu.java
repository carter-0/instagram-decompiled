package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.THu  reason: case insensitive filesystem */
public final class C13012THu implements Runnable {
    public final /* synthetic */ TL0 A00;
    public final /* synthetic */ Exception A01;

    public C13012THu(TL0 tl0, Exception exc) {
        this.A00 = tl0;
        this.A01 = exc;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00.A00;
        Exception exc = this.A01;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C13761TgX) it.next()).DJG(exc);
        }
    }
}
