package X;

/* renamed from: X.Q2o  reason: case insensitive filesystem */
public abstract class C7289Q2o {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.68u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C276544tV A00(X.AnonymousClass6SA r11, X.C276544tV r12, X.C276544tV r13, java.lang.Object r14, java.util.List r15, java.util.Map r16) {
        /*
            r2 = 0
            if (r14 != 0) goto L_0x0004
            return r2
        L_0x0004:
            boolean r0 = r14 instanceof java.util.List
            if (r0 == 0) goto L_0x00ba
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r3 = X.AnonymousClass7TE.A13(r14)
            r0 = 1
            java.lang.Object r1 = r14.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            r0 = 2
            java.lang.String r0 = X.AnonymousClass7TE.A19(r14, r0)
            X.Q2j r14 = new X.Q2j
            r14.<init>(r3, r0, r15, r1)
        L_0x001f:
            java.lang.Object r1 = r14.A00
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0082
            int r5 = X.AnonymousClass7TE.A0M(r1)
            r0 = 143(0x8f, float:2.0E-43)
            java.util.List r4 = r12.A0M(r0)
            if (r5 < 0) goto L_0x0183
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x0183
            java.lang.Object r5 = r4.get(r5)
            X.4tV r5 = (X.C276544tV) r5
        L_0x003d:
            X.6Rj r7 = r11.A02
            java.lang.String r6 = r14.A01
            int r4 = r7.A00(r12, r5, r6)
            java.util.List r0 = r14.A02
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>(r0)
            X.AnonymousClass7TF.A1M(r3, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.String r9 = X.C7283Q2i.A00(r0, r3)
            java.util.Map r0 = r14.A03
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r0)
        L_0x005b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r8 = r10.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r0 = r8.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = X.C7283Q2i.A01(r0, r9)
            java.lang.Object r0 = r8.getValue()
            r11.A01(r1, r0)
            java.lang.Object r0 = r8.getValue()
            r8 = r16
            r8.put(r1, r0)
            goto L_0x005b
        L_0x0082:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00b0
            X.6Qe r0 = r11.A00
            java.util.Map r0 = r0.A04
            java.lang.Object r0 = r0.get(r1)
            X.9G2 r0 = (X.AnonymousClass9G2) r0
            if (r0 == 0) goto L_0x00a4
            X.8fY r0 = r0.A00
            X.4tN r0 = r0.A00
            X.3ew r1 = r0.A00
            if (r1 == 0) goto L_0x01b9
            X.68u r0 = X.C3034368u.A03(r2, r1, r2)
            X.4tV r5 = r1.A00
        L_0x00a0:
            if (r5 == 0) goto L_0x01b9
            r2 = r0
            goto L_0x003d
        L_0x00a4:
            X.6Qe r0 = r11.A00
            java.util.Map r0 = r0.A05
            java.lang.Object r5 = r0.get(r1)
            X.4tV r5 = (X.C276544tV) r5
            r0 = r2
            goto L_0x00a0
        L_0x00b0:
            boolean r0 = r1 instanceof X.C3034368u
            if (r0 == 0) goto L_0x01ba
            r2 = r1
            X.68u r2 = (X.C3034368u) r2
            X.4tV r5 = r2.A02
            goto L_0x003d
        L_0x00ba:
            boolean r0 = r14 instanceof X.C7284Q2j
            if (r0 == 0) goto L_0x01ba
            X.Q2j r14 = (X.C7284Q2j) r14
            goto L_0x001f
        L_0x00c2:
            X.6SB r0 = r11.A03
            if (r13 == 0) goto L_0x00df
            android.util.SparseArray r1 = r0.A01
            int r0 = r13.A03
            java.lang.Object r0 = r1.get(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 == 0) goto L_0x00df
            java.lang.Object r4 = r0.get(r4)
            X.4tV r4 = (X.C276544tV) r4
            if (r4 == 0) goto L_0x00df
            X.4tV r0 = r4.A07
            if (r0 != r5) goto L_0x00df
        L_0x00de:
            return r4
        L_0x00df:
            X.Q2p r0 = new X.Q2p
            r0.<init>(r7, r12, r6, r3)
            r3 = 0
            X.4tV r4 = X.C7288Q2n.A00(r3, r0, r5)
            if (r2 == 0) goto L_0x00de
            X.68v r2 = r2.A01
            X.6Qe r1 = r11.A00
            java.util.Map r0 = r2.A06
            X.6Qe r1 = r1.A04(r0)
            X.68t r0 = r2.A00
            X.6Qe r1 = r1.A00(r0)
            java.util.List r0 = r2.A03
            X.6Qe r1 = r1.A01(r0)
            java.util.Map r0 = r2.A07
            X.6Qe r1 = r1.A05(r0)
            java.util.List r0 = r2.A04
            X.6Qe r0 = r1.A02(r0)
            r11.A00 = r0
            java.util.List r0 = r11.A08
            r0.add(r2)
            java.util.List r2 = r2.A05
            if (r2 == 0) goto L_0x00de
            X.6Rx r6 = r11.A00(r4, r3, r3)
            java.util.List r1 = r4.A09
            r1.getClass()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r5 = X.C7283Q2i.A00(r0, r1)
            java.util.Iterator r8 = r2.iterator()
        L_0x012b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00de
            java.lang.Object r7 = r8.next()
            X.4tR r7 = (X.C276504tR) r7
            r1 = r7
            X.4tQ r1 = (X.C276494tQ) r1
            java.lang.String r0 = r1.A00
            java.lang.String r3 = X.C7283Q2i.A01(r0, r5)
            X.6Qe r0 = r11.A00
            java.util.Map r0 = r0.A08
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x012b
            java.lang.String r2 = r1.A01
            java.util.Map r0 = r11.A0A
            java.lang.Object r1 = r0.get(r2)
            X.6RV r1 = (X.AnonymousClass6RV) r1
            if (r1 == 0) goto L_0x0178
            X.6Qe r0 = r11.A00
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r2)
            X.TgO r2 = r1.BH5(r6, r7, r0)
            X.6Qe r1 = r11.A00
            java.lang.Object r0 = r2.BHB()
            java.util.Map r0 = java.util.Collections.singletonMap(r3, r0)
            X.6Qe r0 = r1.A06(r0)
            r11.A00 = r0
            java.util.HashMap r0 = r11.A06
            r0.put(r3, r2)
            goto L_0x012b
        L_0x0178:
            r0 = 1307(0x51b, float:1.831E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.RuntimeException r0 = X.Pxg.A0k(r0, r2)
            throw r0
        L_0x0183:
            X.RhZ.A00(r12)
            java.lang.String r3 = r14.A01
            java.lang.String r0 = "["
            java.lang.StringBuilder r2 = X.Pxe.A16(r0)
            java.util.Iterator r1 = r4.iterator()
        L_0x0192:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r0 = r1.next()
            X.4tV r0 = (X.C276544tV) r0
            int r0 = r0.A04
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            goto L_0x0192
        L_0x01a9:
            java.lang.StringBuilder r0 = X.Pxh.A0r(r3, r2, r4, r5)
            X.Pxf.A1O(r0, r2)
            java.lang.String r0 = r0.toString()
            java.lang.IndexOutOfBoundsException r0 = X.Pxe.A0k(r0)
            throw r0
        L_0x01b9:
            return r2
        L_0x01ba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7289Q2o.A00(X.6SA, X.4tV, X.4tV, java.lang.Object, java.util.List, java.util.Map):X.4tV");
    }
}
