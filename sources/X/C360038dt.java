package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8dt  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C360038dt {
    public static final C255463uA A01(List list, C62320sa r7, C62230ry r8) {
        0qQ.A0B(list, 1);
        if (!r8.equals(new 0Yh(Collection.class))) {
            Class<List> cls = List.class;
            if (!r8.equals(new 0Yh(cls)) && !r8.equals(new 0Yh(cls)) && !r8.equals(new 0Yh(ArrayList.class))) {
                if (r8.equals(new 0Yh(HashSet.class))) {
                    return new C20804WzH((C255463uA) list.get(0));
                }
                Class<Set> cls2 = Set.class;
                if (r8.equals(new 0Yh(cls2)) || r8.equals(new 0Yh(cls2)) || r8.equals(new 0Yh(LinkedHashSet.class))) {
                    return new C20805WzI((C255463uA) list.get(0));
                }
                if (r8.equals(new 0Yh(HashMap.class))) {
                    return new AnonymousClass40T((C255463uA) list.get(0), (C255463uA) list.get(1));
                }
                Class<Map> cls3 = Map.class;
                if (r8.equals(new 0Yh(cls3)) || r8.equals(new 0Yh(cls3)) || r8.equals(new 0Yh(LinkedHashMap.class))) {
                    return new C258613zM((C255463uA) list.get(0), (C255463uA) list.get(1));
                }
                if (r8.equals(new 0Yh(Map.Entry.class))) {
                    C255463uA r1 = (C255463uA) list.get(0);
                    C255463uA r0 = (C255463uA) list.get(1);
                    0qQ.A0B(r1, 0);
                    0qQ.A0B(r0, 1);
                    return new C20806WzJ(r1, r0);
                } else if (r8.equals(new 0Yh(0eP.class))) {
                    C255463uA r12 = (C255463uA) list.get(0);
                    C255463uA r02 = (C255463uA) list.get(1);
                    0qQ.A0B(r12, 0);
                    0qQ.A0B(r02, 1);
                    return new C20807WzK(r12, r02);
                } else if (r8.equals(new 0Yh(AnonymousClass59G.class))) {
                    C255463uA r3 = (C255463uA) list.get(0);
                    C255463uA r2 = (C255463uA) list.get(1);
                    C255463uA r03 = (C255463uA) list.get(2);
                    0qQ.A0B(r3, 0);
                    0qQ.A0B(r2, 1);
                    0qQ.A0B(r03, 2);
                    return new C20431WrH(r3, r2, r03);
                } else if (AnonymousClass2YU.A00(r8).isArray()) {
                    Object invoke = r7.invoke();
                    0qQ.A0C(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    C62230ry r13 = (C62230ry) invoke;
                    C255463uA r04 = (C255463uA) list.get(0);
                    0qQ.A0B(r13, 0);
                    0qQ.A0B(r04, 1);
                    return new C2592440y(r13, r04);
                } else {
                    C255463uA[] r14 = (C255463uA[]) list.toArray(new C255463uA[0]);
                    return C360168e6.A01(r8, (C255463uA[]) Arrays.copyOf(r14, r14.length));
                }
            }
        }
        return new AnonymousClass409((C255463uA) list.get(0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        if (r1 != null) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C255463uA A02(X.C62220rx r7, X.AnonymousClass40R r8) {
        /*
            r5 = 0
            r0 = 1
            X.0qQ.A0B(r7, r0)
            X.0y3 r2 = r7.AnR()
            boolean r0 = r2 instanceof X.C62230ry
            if (r0 == 0) goto L_0x00da
            X.0ry r2 = (X.C62230ry) r2
            boolean r6 = r7.CWq()
            java.util.List r1 = r7.AcS()
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0026:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r1.next()
            X.0Dj r0 = (X.0Dj) r0
            X.0qQ.A0B(r0, r5)
            X.0rx r3 = r0.A01
            if (r3 == 0) goto L_0x003d
            r4.add(r3)
            goto L_0x0026
        L_0x003d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Star projections in type arguments are not allowed, but had "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0054:
            boolean r0 = r4.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x00bd
            X.0qQ.A0B(r2, r5)
            java.lang.Class r0 = X.AnonymousClass2YU.A00(r2)
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L_0x006d
            java.util.Map r0 = r8.A00
            r0.get(r2)
        L_0x006d:
            if (r6 != 0) goto L_0x00ba
            X.8dy r0 = X.C360048du.A02
        L_0x0071:
            X.3uA r1 = r0.AXN(r2)
        L_0x0075:
            if (r1 != 0) goto L_0x00ab
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00ac
            X.3uA[] r0 = new X.C255463uA[r5]
            X.3uA r1 = X.C360168e6.A01(r2, r0)
            if (r1 != 0) goto L_0x008d
            java.util.Map r0 = X.C360178eA.A00
            java.lang.Object r1 = r0.get(r2)
            X.3uA r1 = (X.C255463uA) r1
        L_0x008d:
            if (r1 != 0) goto L_0x00a3
            java.util.Map r0 = r8.A00
            r0.get(r2)
            java.lang.Class r0 = X.AnonymousClass2YU.A00(r2)
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L_0x00d2
            kotlinx.serialization.PolymorphicSerializer r1 = new kotlinx.serialization.PolymorphicSerializer
            r1.<init>(r2)
        L_0x00a3:
            if (r6 == 0) goto L_0x00a9
            X.3uA r1 = X.C360578eo.A00(r1)
        L_0x00a9:
            if (r1 == 0) goto L_0x00d2
        L_0x00ab:
            return r1
        L_0x00ac:
            java.util.List r1 = A00(r4, r8)
            X.Au9 r0 = new X.Au9
            r0.<init>(r4)
            X.3uA r1 = A01(r1, r0, r2)
            goto L_0x008d
        L_0x00ba:
            X.8dy r0 = X.C360048du.A03
            goto L_0x0071
        L_0x00bd:
            X.8e2 r0 = X.C360048du.A00
            X.0qQ.A0B(r2, r5)
            if (r6 == 0) goto L_0x00c6
            X.8e2 r0 = X.C360048du.A01
        L_0x00c6:
            java.lang.Object r1 = r0.AXX(r4, r2)
            boolean r0 = r1 instanceof X.0eQ
            if (r0 == 0) goto L_0x00cf
            r1 = r3
        L_0x00cf:
            X.3uA r1 = (X.C255463uA) r1
            goto L_0x0075
        L_0x00d2:
            X.C360608er.A01(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Only KClass supported as classifier, got "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360038dt.A02(X.0rx, X.40R):X.3uA");
    }

    public static final List A00(List list, AnonymousClass40R r4) {
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A02((C62220rx) it.next(), r4));
        }
        return arrayList;
    }
}
