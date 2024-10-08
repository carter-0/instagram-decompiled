package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Ts4  reason: case insensitive filesystem */
public final class C14224Ts4 {
    public List A00 = new CopyOnWriteArrayList();

    public static final void A00(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onPost");
        }
    }
}
