package X;

import com.instagram.save.model.SavedCollection;
import java.util.Iterator;
import java.util.List;

public abstract class I32 {
    public static void A00(1Ng r3, SavedCollection savedCollection, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51966G9m.A0t(it).A3i().add(savedCollection.A0F);
        }
        C57077INr.A00(r3, savedCollection, list);
    }

    public static void A01(1Ng r3, SavedCollection savedCollection, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51966G9m.A0t(it).A3i().remove(savedCollection.A0F);
        }
        C57077INr.A00(r3, savedCollection, list);
    }

    public static void A02(SavedCollection savedCollection, SavedCollection savedCollection2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xj A0t = C51966G9m.A0t(it);
            A0t.A3i().add(savedCollection2.A0F);
            A0t.A3i().remove(savedCollection.A0F);
        }
        if (savedCollection2.A04 == null) {
            1Xj r1 = (1Xj) AnonymousClass7TE.A13(list);
            savedCollection2.A0H = r1.getId();
            savedCollection2.A04 = r1;
        }
    }
}
