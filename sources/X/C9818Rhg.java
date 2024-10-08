package X;

/* renamed from: X.Rhg  reason: case insensitive filesystem */
public abstract class C9818Rhg {
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        if (r4 != null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C276544tV A00(android.util.SparseArray r11, X.C276544tV r12, X.S53 r13, java.lang.Object r14, java.util.List r15, java.util.Set r16) {
        /*
            r2 = 0
            if (r14 == 0) goto L_0x0194
            boolean r0 = r14 instanceof java.util.List
            if (r0 == 0) goto L_0x00c6
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r3 = X.AnonymousClass7TE.A13(r14)
            r0 = 1
            java.lang.Object r1 = r14.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            r0 = 2
            java.lang.String r0 = X.AnonymousClass7TE.A19(r14, r0)
            X.Q2j r14 = new X.Q2j
            r14.<init>(r3, r0, r15, r1)
        L_0x001e:
            java.lang.Object r3 = r14.A00
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L_0x00a0
            int r5 = X.AnonymousClass7TE.A0M(r3)
            r0 = 143(0x8f, float:2.0E-43)
            java.util.List r4 = r12.A0M(r0)
            if (r5 < 0) goto L_0x0141
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x0141
            java.lang.Object r4 = r4.get(r5)
            X.4tV r4 = (X.C276544tV) r4
        L_0x003c:
            X.6Rj r1 = r13.A01
            java.lang.String r0 = r14.A01
            int r8 = r1.A00(r12, r4, r0)
            java.util.List r0 = r14.A02
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>(r0)
            X.AnonymousClass7TF.A1M(r5, r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.String r7 = X.C7283Q2i.A00(r0, r5)
            java.util.Map r1 = r14.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00d1
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r1)
        L_0x0060:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r10)
            java.lang.String r0 = X.DbT.A13(r1)
            java.lang.String r6 = X.C7283Q2i.A01(r0, r7)
            r0 = r16
            r0.add(r6)
            java.lang.Object r9 = r1.getValue()
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.util.Map r0 = r13.A08
            if (r0 == 0) goto L_0x009e
            java.lang.Object r3 = r0.get(r6)
        L_0x0087:
            java.util.Map r0 = r13.A07
            r0.put(r6, r9)
            X.Rpp r1 = r13.A04
            if (r1 == 0) goto L_0x0060
            boolean r0 = X.Q06.A00(r3, r9)
            if (r0 != 0) goto L_0x0060
            X.0vq r1 = r1.A00
            monitor-enter(r1)
            r1.A09(r6)     // Catch:{ all -> 0x00ce }
            monitor-exit(r1)
            goto L_0x0060
        L_0x009e:
            r3 = 0
            goto L_0x0087
        L_0x00a0:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x0194
            X.6Qe r1 = r13.A00
            java.util.Map r0 = r1.A04
            java.lang.Object r0 = r0.get(r3)
            X.9G2 r0 = (X.AnonymousClass9G2) r0
            if (r0 == 0) goto L_0x00bd
            X.8fY r0 = r0.A00
            X.4tN r0 = r0.A00
            X.3ew r2 = r0.A00
            if (r2 == 0) goto L_0x0175
            X.4tV r4 = r2.A00
        L_0x00ba:
            if (r4 == 0) goto L_0x0175
            goto L_0x003c
        L_0x00bd:
            java.util.Map r0 = r1.A05
            java.lang.Object r4 = r0.get(r3)
            X.4tV r4 = (X.C276544tV) r4
            goto L_0x00ba
        L_0x00c6:
            boolean r0 = r14 instanceof X.C7284Q2j
            if (r0 == 0) goto L_0x0194
            X.Q2j r14 = (X.C7284Q2j) r14
            goto L_0x001e
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00d1:
            if (r11 == 0) goto L_0x00e0
            java.lang.Object r6 = r11.get(r8)
            X.4tV r6 = (X.C276544tV) r6
            if (r6 == 0) goto L_0x00e0
            X.4tV r0 = r6.A07
            if (r0 != r4) goto L_0x00e0
        L_0x00df:
            return r6
        L_0x00e0:
            X.T6o r0 = new X.T6o
            r0.<init>(r14, r12, r13, r5)
            r1 = 0
            X.4tV r6 = X.C7288Q2n.A00(r1, r0, r4)
            if (r2 == 0) goto L_0x00df
            r0 = 1
            X.0qQ.A0B(r6, r0)
            java.util.List r0 = r2.A07
            if (r0 == 0) goto L_0x00df
            X.6Rx r7 = r13.A00(r6, r1, r1)
            java.util.List r2 = r2.A07
            java.util.List r1 = r6.A09
            if (r1 == 0) goto L_0x013c
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r5 = X.C7283Q2i.A00(r0, r1)
            X.0qQ.A07(r5)
            java.util.Iterator r4 = r2.iterator()
        L_0x010b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r2 = r4.next()
            X.4tQ r2 = (X.C276494tQ) r2
            java.lang.String r0 = r2.A00
            java.lang.String r3 = X.C7283Q2i.A01(r0, r5)
            X.0qQ.A07(r3)
            java.util.Map r1 = r13.A09
            boolean r0 = r1.containsKey(r3)
            if (r0 != 0) goto L_0x010b
            java.util.Map r0 = r2.A02
            java.lang.Object r2 = X.Q08.A00(r7, r0)
            r1.put(r3, r2)
            X.S4e r1 = r13.A03
            X.Q3P r0 = new X.Q3P
            r0.<init>(r3, r2)
            r1.A01(r0)
            goto L_0x010b
        L_0x013c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0141:
            X.RhZ.A00(r12)
            java.lang.String r3 = r14.A01
            java.lang.String r0 = "["
            java.lang.StringBuilder r2 = X.Pxe.A16(r0)
            java.util.Iterator r1 = r4.iterator()
        L_0x0150:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r1.next()
            X.4tV r0 = (X.C276544tV) r0
            int r0 = r0.A04
            r2.append(r0)
            X.Pxe.A1Y(r2)
            goto L_0x0150
        L_0x0165:
            java.lang.StringBuilder r0 = X.Pxh.A0r(r3, r2, r4, r5)
            X.Pxf.A1O(r0, r2)
            java.lang.String r0 = r0.toString()
            java.lang.IndexOutOfBoundsException r0 = X.Pxe.A0k(r0)
            throw r0
        L_0x0175:
            X.RhZ.A00(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unable to find template ID "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " in tree resources for scope key "
            r1.append(r0)
            java.lang.String r0 = r14.A01
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0194:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9818Rhg.A00(android.util.SparseArray, X.4tV, X.S53, java.lang.Object, java.util.List, java.util.Set):X.4tV");
    }
}
