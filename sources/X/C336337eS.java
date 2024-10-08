package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7eS  reason: invalid class name and case insensitive filesystem */
public final class C336337eS implements C336287eN {
    public final 1yo A00;
    public final /* synthetic */ UserSession A01;

    public C336337eS(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = 1yr.A00(userSession);
    }

    public final /* bridge */ /* synthetic */ Object AIL(Object obj, Object obj2) {
        List emptyList;
        0sn r6 = (List) obj2;
        if (r6 == null) {
            r6 = 0sn.A00;
        }
        if (obj != null) {
            emptyList = (List) obj;
        } else {
            emptyList = Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(emptyList.size() + r6.size());
        arrayList.addAll(emptyList);
        for (Object next : r6) {
            if (!emptyList.contains(next)) {
                arrayList.add(next);
            }
        }
        return new ArrayList(arrayList);
    }

    public final Object E5m(String str) {
        ArrayList A02 = this.A00.A02(str);
        ArrayList arrayList = new ArrayList(A02.size());
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            C18023Vjz vjz = new C18023Vjz(C281965Ag.A00((String) it.next()));
            vjz.A05 = true;
            arrayList.add(vjz.A00());
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ Object ARG() {
        return new ArrayList(Collections.emptyList());
    }
}
