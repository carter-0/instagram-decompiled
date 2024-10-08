package X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.414  reason: invalid class name */
public abstract class AnonymousClass414 {
    public static final C233632w4 A01(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C250973mM) it.next()).A0H);
        }
        return A00(arrayList, list2, i);
    }

    public static final C233632w4 A00(List list, List list2, int i) {
        String str;
        Reel reel = (Reel) 00k.A0O(list, i);
        if (reel != null) {
            str = reel.getId();
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        int i2 = 0;
        while (it.hasNext()) {
            Reel reel2 = (Reel) it.next();
            String A0F = reel2.A0F();
            if (A0F != null) {
                if (0qQ.A0K(reel2.getId(), str)) {
                    i2 = arrayList.size();
                }
                arrayList.add(A0F);
            }
            if (!z) {
                z = false;
                if (!reel2.A1L) {
                }
            }
            z = true;
        }
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list2) {
                if (AnonymousClass3f0.A04((String) next)) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return new C233632w4(arrayList, i, i2, z);
    }
}
