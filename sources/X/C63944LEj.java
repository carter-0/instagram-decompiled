package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.LEj  reason: case insensitive filesystem */
public final class C63944LEj {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public final boolean A01() {
        ConcurrentHashMap concurrentHashMap = this.A00;
        if (!concurrentHashMap.isEmpty()) {
            Iterator A0s = AnonymousClass7TF.A0s(concurrentHashMap);
            while (A0s.hasNext()) {
                Iterable<GNY> iterable = (Iterable) C51971G9r.A0p(A0s);
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (GNY gny : iterable) {
                        if (0qQ.A0K(((C317966o8) gny.A01).A0U, "avatar_sticker")) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        ConcurrentHashMap concurrentHashMap2 = this.A01;
        if (concurrentHashMap2.isEmpty()) {
            return false;
        }
        Iterator A0s2 = AnonymousClass7TF.A0s(concurrentHashMap2);
        while (A0s2.hasNext()) {
            Iterable<GNY> iterable2 = (Iterable) C51971G9r.A0p(A0s2);
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (GNY gny2 : iterable2) {
                    if (0qQ.A0K(((C317966o8) gny2.A01).A0U, "avatar_sticker")) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public final List A00(List list, String str) {
        ArrayList arrayList;
        AnonymousClass7TG.A1N(list, str);
        List<GNY> list2 = (List) this.A01.get(str);
        if (list2 != null) {
            arrayList = AnonymousClass7TF.A0p(list2);
            for (GNY gny : list2) {
                arrayList.add(gny.A01);
            }
        } else {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object obj : list) {
                Object obj2 = this.A00.get(obj);
                if (obj2 != null) {
                    A1C.add(obj2);
                }
            }
            List A002 = MAY.A00(0Yv.A1F(A1C), 6);
            HashSet A1F = AnonymousClass7TE.A1F();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next : A002) {
                C51971G9r.A1O(((C317966o8) ((GNY) next).A01).A0S, next, A1F, A1C2);
            }
            arrayList = AnonymousClass7TF.A0p(A1C2);
            Iterator it = A1C2.iterator();
            while (it.hasNext()) {
                arrayList.add(((GNY) it.next()).A01);
            }
        }
        return arrayList;
    }
}
