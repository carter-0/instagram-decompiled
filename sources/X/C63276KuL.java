package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.KuL  reason: case insensitive filesystem */
public abstract class C63276KuL {
    public static final C62523KhF A00(List list) {
        Object next;
        C62523KhF khF;
        int i;
        0qQ.A0B(list, 0);
        list.size();
        ArrayList<C361408gB> A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C361408gB r0 = JTO.A0W(it).A0F;
            if (r0 != null) {
                A1C.add(r0);
            }
        }
        ArrayList<AbstractMap> A0r = AnonymousClass7TG.A0r(A1C);
        for (C361408gB r4 : A1C) {
            TreeMap treeMap = new TreeMap();
            JTP.A1Q(C62523KhF.PEOPLE, treeMap, r4.A08);
            JTP.A1Q(C62523KhF.PET, treeMap, r4.A09);
            JTP.A1Q(C62523KhF.SCENIC, treeMap, r4.A05);
            JTP.A1Q(C62523KhF.FOOD, treeMap, r4.A04);
            JTP.A1Q(C62523KhF.EVENT, treeMap, r4.A03);
            JTP.A1Q(C62523KhF.OUTDOORS, treeMap, r4.A07);
            A0r.add(treeMap);
        }
        TreeMap treeMap2 = new TreeMap();
        for (AbstractMap A0s : A0r) {
            Iterator A0s2 = AnonymousClass7TF.A0s(A0s);
            while (A0s2.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s2);
                C62523KhF khF2 = (C62523KhF) A1J.getKey();
                float A04 = AnonymousClass7TE.A04(A1J.getValue());
                switch (khF2.ordinal()) {
                    case 1:
                    case 3:
                        i = (A04 > 0.8f ? 1 : (A04 == 0.8f ? 0 : -1));
                        break;
                    case 2:
                    case 4:
                        i = (A04 > 0.35f ? 1 : (A04 == 0.35f ? 0 : -1));
                        break;
                    case 5:
                    case 6:
                        i = (A04 > 0.3f ? 1 : (A04 == 0.3f ? 0 : -1));
                        break;
                }
                if (i > 0) {
                    treeMap2.put(khF2, Integer.valueOf(AnonymousClass7TE.A0M(treeMap2.getOrDefault(khF2, 0)) + 1));
                }
            }
        }
        Iterator A0s3 = AnonymousClass7TF.A0s(treeMap2);
        if (!A0s3.hasNext()) {
            next = null;
        } else {
            next = A0s3.next();
            if (A0s3.hasNext()) {
                int A0M = AnonymousClass7TE.A0M(((Map.Entry) next).getValue());
                do {
                    Object next2 = A0s3.next();
                    int A0M2 = AnonymousClass7TE.A0M(((Map.Entry) next2).getValue());
                    if (A0M < A0M2) {
                        next = next2;
                        A0M = A0M2;
                    }
                } while (A0s3.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (khF = (C62523KhF) entry.getKey()) == null) {
            return C62523KhF.A04;
        }
        return khF;
    }
}
