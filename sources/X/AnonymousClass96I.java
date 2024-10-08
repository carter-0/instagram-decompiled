package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.96I  reason: invalid class name */
public abstract class AnonymousClass96I {
    public static void A00(List list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass95n r7 = (AnonymousClass95n) it.next();
            AnonymousClass96J r6 = new AnonymousClass96J(r7);
            Iterator it2 = r7.A04.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    boolean z = false;
                    if (r7.A01 == 0) {
                        z = true;
                    }
                    AnonymousClass96K r2 = new AnonymousClass96K(cls, !z);
                    if (!hashMap.containsKey(r2)) {
                        hashMap.put(r2, new HashSet());
                    }
                    Set set = (Set) hashMap.get(r2);
                    if (set.isEmpty() || r2.A00) {
                        set.add(r6);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<AnonymousClass96J> it3 : hashMap.values()) {
            for (AnonymousClass96J r5 : it3) {
                for (C3735395y r1 : r5.A00.A03) {
                    if (r1.A00 == 0) {
                        Class cls2 = r1.A02;
                        int i = r1.A01;
                        boolean z2 = false;
                        if (i == 2) {
                            z2 = true;
                        }
                        Set<AnonymousClass96J> set2 = (Set) hashMap.get(new AnonymousClass96K(cls2, z2));
                        if (set2 != null) {
                            for (AnonymousClass96J r12 : set2) {
                                r5.A01.add(r12);
                                r12.A02.add(r5);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Collection addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            AnonymousClass96J r13 = (AnonymousClass96J) it4.next();
            if (r13.A02.isEmpty()) {
                hashSet2.add(r13);
            }
        }
        int i2 = 0;
        while (!hashSet2.isEmpty()) {
            AnonymousClass96J r3 = (AnonymousClass96J) hashSet2.iterator().next();
            hashSet2.remove(r3);
            i2++;
            for (AnonymousClass96J r14 : r3.A01) {
                Set set3 = r14.A02;
                set3.remove(r3);
                if (set3.isEmpty()) {
                    hashSet2.add(r14);
                }
            }
        }
        if (i2 != list.size()) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                AnonymousClass96J r15 = (AnonymousClass96J) it5.next();
                if (!r15.A02.isEmpty() && !r15.A01.isEmpty()) {
                    arrayList.add(r15.A00);
                }
            }
            throw new C384499hQ(arrayList);
        }
    }
}
