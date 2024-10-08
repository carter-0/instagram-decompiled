package X;

public abstract class RVQ {
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(java.lang.Object r5) {
        /*
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L_0x0020
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r4 = X.C51970G9q.A0m(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = A00(r0)
            r4.add(r0)
            goto L_0x000e
        L_0x0020:
            boolean r0 = r5 instanceof java.util.Set
            if (r0 == 0) goto L_0x0045
            java.util.Set r5 = (java.util.Set) r5
            int r0 = r5.size()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r0)
            java.util.Iterator r1 = r5.iterator()
        L_0x0033:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = A00(r0)
            r4.add(r0)
            goto L_0x0033
        L_0x0045:
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L_0x0077
            java.util.Map r5 = (java.util.Map) r5
            int r0 = r5.size()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r0)
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r5)
        L_0x0058:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0076
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r1 = A00(r0)
            java.lang.Object r0 = r2.getValue()
            java.lang.Object r0 = A00(r0)
            r4.put(r1, r0)
            goto L_0x0058
        L_0x0076:
            return r4
        L_0x0077:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RVQ.A00(java.lang.Object):java.lang.Object");
    }
}
