package X;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.TSo  reason: case insensitive filesystem */
public final class C13273TSo extends LinkedBlockingQueue<Runnable> {
    public C13273TSo() {
        super(C249703kE.FLAG_MOVED);
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        if (size() == 0) {
            return super.offer(obj);
        }
        return false;
    }
}
