package X;

import com.instagram.save.model.SavedCollection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.HzT  reason: case insensitive filesystem */
public final class C56497HzT {
    public final LinkedList A00 = new LinkedList();

    public static final synchronized int A00(C56497HzT hzT, String str) {
        int i;
        synchronized (hzT) {
            Iterator it = hzT.A00.iterator();
            i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                int i2 = i + 1;
                if (0qQ.A0K(((SavedCollection) it.next()).A0F, str)) {
                    break;
                }
                i = i2;
            }
        }
        return i;
    }
}
