package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3PP  reason: invalid class name */
public final class AnonymousClass3PP {
    public final UserSession A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public final void A00(AnonymousClass3BU r7, C279314yR r8, String str, String str2, Map map) {
        String str3 = str2;
        0qQ.A0B(str2, 3);
        HashSet hashSet = new HashSet();
        if (str != null) {
            hashSet.add(str);
        }
        A01(r7, r8, str3, map, hashSet);
    }

    public final void A01(AnonymousClass3BU r9, C279314yR r10, String str, Map map, Set set) {
        WeakReference weakReference;
        C279314yR r0;
        AnonymousClass3BU r3 = r9;
        0qQ.A0B(r9, 4);
        Set set2 = set;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (this.A03.contains(it.next())) {
                it.remove();
            }
        }
        this.A03.addAll(set);
        if (r10 != null) {
            weakReference = new WeakReference(r10);
        } else {
            weakReference = null;
        }
        if (!set.isEmpty()) {
            new AnonymousClass3PT(this.A00, r3, new AnonymousClass3PR(this, str, weakReference), str, map, set2).A06();
        } else if (weakReference != null && (r0 = (C279314yR) weakReference.get()) != null) {
            r0.Dok((Map) null);
        }
    }

    public final void A02(AnonymousClass3BU r7, String str, String str2, Map map) {
        0qQ.A0B(str2, 2);
        A00(r7, (C279314yR) null, str, str2, map);
    }

    public final void A03(AnonymousClass3PN r5) {
        0qQ.A0B(r5, 0);
        ArrayList arrayList = new ArrayList(this.A01.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (str != null) {
                A04(r5, str);
            }
        }
    }

    public final void A04(AnonymousClass3PN r5, String str) {
        0qQ.A0B(r5, 1);
        List<Reference> list = (List) this.A01.get(str);
        if (list != null) {
            for (Reference reference : list) {
                Object obj = reference.get();
                if (obj == r5 || obj == null) {
                    list.remove(reference);
                }
            }
        }
    }

    public final void A05(AnonymousClass3PN r4, String str, String str2, boolean z) {
        0qQ.A0B(r4, 2);
        UserSession userSession = this.A00;
        Reel A0M = ReelStore.A03(userSession).A0M(str);
        if (z || !AnonymousClass3PQ.A05(userSession, A0M, str2)) {
            Map map = this.A01;
            List list = (List) map.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                map.put(str, list);
            }
            list.add(new WeakReference(r4));
        } else if (A0M != null) {
            r4.DOW(A0M.getId(), true);
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public AnonymousClass3PP(UserSession userSession) {
        this.A00 = userSession;
    }
}
