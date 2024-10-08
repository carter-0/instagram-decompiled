package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4R8  reason: invalid class name */
public final class AnonymousClass4R8 {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public final void A00(AnonymousClass4RU r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A00;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C45329CuX cuX = (C45329CuX) it.next();
            if (cuX.A02 == r5) {
                cuX.A00 = true;
                copyOnWriteArrayList.remove(cuX);
            }
        }
    }
}
