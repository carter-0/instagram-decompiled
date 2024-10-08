package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class AEL {
    public static final ArrayList A00(List list, List list2) {
        if (list == null) {
            return null;
        }
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0r.add(((User) it.next()).getId());
        }
        A1D.removeAll(A0r);
        return A1D;
    }

    public static final List A01(List list, List list2) {
        if (list2 == null) {
            return list;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!list2.contains(((User) next).getId())) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public static final List A02(List list, List list2) {
        Set linkedHashSet;
        if (list != null) {
            linkedHashSet = 00k.A0j(list);
        } else {
            linkedHashSet = new LinkedHashSet();
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0r.add(((User) it.next()).getId());
        }
        linkedHashSet.addAll(A0r);
        return 00k.A0a(linkedHashSet);
    }
}
