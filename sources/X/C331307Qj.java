package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Qj  reason: invalid class name and case insensitive filesystem */
public final class C331307Qj implements AnonymousClass0lh {
    public final List A00 = new ArrayList();

    public final List A00(String str) {
        Object obj;
        if (str != null) {
            Iterator it = this.A00.iterator();
            loop0:
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                List<0eP> list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (0eP r0 : list) {
                        if (0qQ.A0K(((C254703su) r0.A00).A0g(), str)) {
                            break loop0;
                        }
                    }
                    continue;
                }
            }
            List<0eP> list2 = (List) obj;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
                for (0eP r02 : list2) {
                    arrayList.add(r02.A00);
                }
                if (!arrayList.isEmpty()) {
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
                    0qQ.A0A(copyOf);
                    return copyOf;
                }
            }
        }
        return 0sn.A00;
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
