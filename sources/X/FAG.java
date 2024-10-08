package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class FAG {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();
    public final AtomicReference A01 = new AtomicReference();
    public final AtomicReference A02 = new AtomicReference();

    public static void A00(FAG fag, Throwable th) {
        Iterator it;
        CopyOnWriteArrayList copyOnWriteArrayList = fag.A00;
        synchronized (copyOnWriteArrayList) {
            fag.A01.set(th);
            it = copyOnWriteArrayList.iterator();
            copyOnWriteArrayList.clear();
        }
        while (it.hasNext()) {
            it.next();
        }
    }
}
