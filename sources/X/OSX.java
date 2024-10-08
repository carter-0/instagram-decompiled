package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class OSX {
    public static List A00 = 0sn.A00;
    public static final AtomicBoolean A01 = new AtomicBoolean(true);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r0.booleanValue() == false) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.NBD r77) {
        /*
            r15 = 0
            r1 = r77
            X.0qQ.A0B(r1, r15)
            java.util.concurrent.atomic.AtomicBoolean r0 = A01
            boolean r0 = r0.getAndSet(r15)
            if (r0 == 0) goto L_0x035f
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            int r0 = X.C66580MXl.A04(r1)
            if (r0 != 0) goto L_0x001f
            com.instagram.direct.model.DirectThreadThemeInfo r0 = X.AnonymousClass6BI.A0D
            java.util.List r11 = X.AnonymousClass7TE.A1I(r0)
            return r11
        L_0x001f:
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            int r6 = X.C66580MXl.A04(r1)
            r4 = 0
        L_0x0028:
            if (r4 >= r6) goto L_0x0068
            com.facebook.msys.mci.CQLResultSet r2 = r1.mResultSet
            r0 = 3
            boolean r0 = r2.getBoolean(r4, r0)
            if (r0 != 0) goto L_0x0065
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            r3 = 1
            int r0 = r0.getInteger(r4, r3)
            java.lang.Object r2 = X.C51968G9o.A0z(r5, r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0055
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.add(r0)
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            java.lang.Integer r0 = X.C66581MXm.A0o(r0, r4, r3)
            java.lang.Object r0 = r5.put(r0, r2)
            if (r0 != 0) goto L_0x0065
        L_0x0055:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.AnonymousClass7TF.A1M(r2, r4)
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            int r0 = r0.getInteger(r4, r3)
            X.C51967G9n.A1O(r2, r5, r0)
        L_0x0065:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0068:
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r5)
            java.util.Iterator r22 = X.AnonymousClass7TF.A0s(r0)
        L_0x0071:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x035c
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r22)
            r0.getKey()
            java.lang.Object r10 = r0.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Int>"
            X.0qQ.A0C(r10, r0)
            java.util.List r0 = X.0u4.A01(r10)
            int r9 = r0.size()
            r8 = -1
            r7 = 0
            r3 = -1
            r2 = -1
        L_0x0093:
            if (r7 >= r9) goto L_0x00b6
            java.util.List r0 = X.0u4.A01(r10)
            int r6 = X.C51971G9r.A0I(r0, r7)
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            r5 = 8
            int r4 = r0.getInteger(r6, r5)
            r0 = 1
            if (r4 != r0) goto L_0x00a9
            r2 = r6
        L_0x00a9:
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            int r4 = r0.getInteger(r6, r5)
            r0 = 2
            if (r4 != r0) goto L_0x00b3
            r3 = r6
        L_0x00b3:
            int r7 = r7 + 1
            goto L_0x0093
        L_0x00b6:
            if (r3 != r8) goto L_0x00b9
            r3 = r2
        L_0x00b9:
            if (r2 != r8) goto L_0x00bc
            r2 = r3
        L_0x00bc:
            if (r2 == r8) goto L_0x0071
            if (r3 == r8) goto L_0x0071
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            long r4 = r0.getLong(r2, r15)
            java.lang.String r21 = java.lang.String.valueOf(r4)
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r0 = 74
            java.lang.Boolean r0 = r4.getNullableBoolean(r2, r0)
            r12 = 1
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.booleanValue()
            r71 = 1
            if (r0 != 0) goto L_0x00df
        L_0x00dd:
            r71 = 0
        L_0x00df:
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            r4 = 35
            java.lang.String r58 = X.C66584MXp.A0U(r0, r2, r4)
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            java.lang.Integer r0 = r0.getNullableInteger(r3, r4)
            if (r0 == 0) goto L_0x00f9
            int r0 = r0.intValue()
            java.lang.String r39 = java.lang.Integer.toHexString(r0)
            if (r39 != 0) goto L_0x00fb
        L_0x00f9:
            r39 = r58
        L_0x00fb:
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            r5 = 41
            java.lang.String r4 = r0.getString(r2, r5)
            java.lang.String r0 = ","
            if (r4 == 0) goto L_0x01b8
            java.util.List r4 = X.DbV.A18(r4, r0)
            if (r4 == 0) goto L_0x01b8
            java.lang.Object r10 = X.00k.A0J(r4)
            java.lang.String r10 = (java.lang.String) r10
        L_0x0113:
            java.lang.String r4 = X.C66580MXl.A0v(r1, r3, r5)
            if (r4 == 0) goto L_0x0127
            java.util.List r4 = X.DbV.A18(r4, r0)
            if (r4 == 0) goto L_0x0127
            java.lang.Object r9 = X.00k.A0J(r4)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x0128
        L_0x0127:
            r9 = r10
        L_0x0128:
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r5 = 57
            java.lang.String r54 = X.C66584MXp.A0U(r4, r2, r5)
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            java.lang.String r34 = X.C66584MXp.A0U(r4, r3, r5)
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            java.lang.String r55 = X.C66584MXp.A0U(r4, r2, r5)
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            java.lang.Integer r4 = r4.getNullableInteger(r3, r5)
            if (r4 == 0) goto L_0x014e
            int r4 = r4.intValue()
            java.lang.String r35 = java.lang.Integer.toHexString(r4)
            if (r35 != 0) goto L_0x0150
        L_0x014e:
            r35 = r55
        L_0x0150:
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r5 = 69
            java.lang.String r48 = X.C66584MXp.A0V(r4, r2, r5)
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            java.lang.String r28 = X.C66584MXp.A0V(r4, r3, r5)
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r5 = 59
            java.lang.String r63 = X.C66584MXp.A0V(r4, r2, r5)
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            java.lang.String r44 = X.C66584MXp.A0V(r4, r3, r5)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 68
            java.lang.String r53 = X.C66584MXp.A0V(r5, r2, r4)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            java.lang.String r33 = X.C66584MXp.A0V(r5, r3, r4)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 29
            java.lang.String r51 = X.C66584MXp.A0V(r5, r2, r4)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            java.lang.String r31 = X.C66584MXp.A0V(r5, r3, r4)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r4 = 28
            java.lang.String r60 = X.C66584MXp.A0V(r5, r2, r4)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            java.lang.String r41 = X.C66584MXp.A0V(r5, r3, r4)
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r5 = 34
            java.lang.String r4 = r4.getString(r2, r5)
            if (r4 == 0) goto L_0x01bb
            java.util.List r4 = X.DbV.A18(r4, r0)
            if (r4 == 0) goto L_0x01bb
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x01ae:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01bc
            X.C66583MXo.A1V(r8, r4)
            goto L_0x01ae
        L_0x01b8:
            r10 = 0
            goto L_0x0113
        L_0x01bb:
            r8 = 0
        L_0x01bc:
            java.lang.String r4 = X.C66580MXl.A0v(r1, r3, r5)
            if (r4 == 0) goto L_0x01da
            java.util.List r4 = X.DbV.A18(r4, r0)
            if (r4 == 0) goto L_0x01da
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x01d0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01db
            X.C66583MXo.A1V(r7, r4)
            goto L_0x01d0
        L_0x01da:
            r7 = 0
        L_0x01db:
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r5 = 16
            java.lang.String r4 = r4.getString(r2, r5)
            if (r4 == 0) goto L_0x02dc
            java.util.List r4 = X.DbV.A18(r4, r0)
            if (r4 == 0) goto L_0x02dc
            java.lang.Object r6 = X.00k.A0J(r4)
            java.lang.String r6 = (java.lang.String) r6
        L_0x01f1:
            java.lang.String r4 = X.C66580MXl.A0v(r1, r3, r5)
            if (r4 == 0) goto L_0x02d9
            java.util.List r0 = X.DbV.A18(r4, r0)
            if (r0 == 0) goto L_0x02d9
            java.lang.Object r4 = X.00k.A0J(r0)
            java.lang.String r4 = (java.lang.String) r4
        L_0x0203:
            r27 = 0
            r40 = 0
            r59 = 0
            r0 = r21
            java.util.ArrayList r20 = X.AnonymousClass7TF.A0q(r0, r12)
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r25 = X.AnonymousClass05K.A00
            java.lang.Integer r24 = X.AnonymousClass05K.A01
            java.lang.String r26 = X.C66581MXm.A0v(r1, r2)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            r0 = 4
            int r5 = r5.getInteger(r2, r0)
            java.lang.String r61 = java.lang.Integer.toHexString(r5)
            com.facebook.msys.mci.CQLResultSet r5 = r1.mResultSet
            int r0 = r5.getInteger(r3, r0)
            java.lang.String r42 = java.lang.Integer.toHexString(r0)
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            r5 = 71
            java.lang.Double r0 = r0.getNullableDouble(r2, r5)
            if (r0 == 0) goto L_0x02d5
            double r13 = r0.doubleValue()
            int r0 = (int) r13
            r16 = r0
        L_0x0249:
            com.facebook.msys.mci.CQLResultSet r13 = r1.mResultSet
            r0 = 17
            java.lang.String r47 = r13.getString(r2, r0)
            java.lang.String r36 = X.C66580MXl.A0v(r1, r3, r0)
            com.facebook.msys.mci.CQLResultSet r13 = r1.mResultSet
            r0 = 13
            java.lang.String r56 = r13.getString(r2, r0)
            java.lang.String r37 = X.C66580MXl.A0v(r1, r3, r0)
            com.facebook.msys.mci.CQLResultSet r0 = r1.mResultSet
            java.lang.Double r0 = r0.getNullableDouble(r2, r5)
            if (r0 == 0) goto L_0x02d3
            double r13 = r0.doubleValue()
            int r5 = (int) r13
        L_0x026e:
            if (r10 == 0) goto L_0x0282
            if (r9 == 0) goto L_0x0282
            int r0 = java.lang.Integer.parseInt(r10)
            java.lang.String r10 = java.lang.Integer.toHexString(r0)
            int r0 = java.lang.Integer.parseInt(r9)
            java.lang.String r9 = java.lang.Integer.toHexString(r0)
        L_0x0282:
            if (r8 == 0) goto L_0x0296
            if (r7 == 0) goto L_0x0296
            r20.clear()
            r0 = r20
            r0.addAll(r8)
            r19.clear()
            r0 = r19
            r0.addAll(r7)
        L_0x0296:
            if (r6 == 0) goto L_0x02aa
            if (r4 == 0) goto L_0x02aa
            int r0 = java.lang.Integer.parseInt(r6)
            java.lang.String r59 = java.lang.Integer.toHexString(r0)
            int r0 = java.lang.Integer.parseInt(r4)
            java.lang.String r40 = java.lang.Integer.toHexString(r0)
        L_0x02aa:
            com.facebook.msys.mci.CQLResultSet r4 = r1.mResultSet
            r0 = 76
            java.lang.String r2 = r4.getString(r2, r0)
            r4 = 0
            if (r2 == 0) goto L_0x02df
            java.util.List r6 = X.DbX.A0x(r2)
            if (r6 == 0) goto L_0x02df
            boolean r2 = r6.isEmpty()
            if (r2 == r12) goto L_0x02df
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r2 = r6.iterator()
        L_0x02c9:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x02df
            X.C66583MXo.A1V(r4, r2)
            goto L_0x02c9
        L_0x02d3:
            r5 = 0
            goto L_0x026e
        L_0x02d5:
            r16 = 0
            goto L_0x0249
        L_0x02d9:
            r4 = 0
            goto L_0x0203
        L_0x02dc:
            r6 = 0
            goto L_0x01f1
        L_0x02df:
            java.lang.String r0 = X.C66580MXl.A0v(r1, r3, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0304
            java.util.List r3 = X.DbX.A0x(r0)
            if (r3 == 0) goto L_0x0304
            boolean r0 = r3.isEmpty()
            if (r0 == r12) goto L_0x0304
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r0 = r3.iterator()
        L_0x02fa:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0304
            X.C66583MXo.A1V(r2, r0)
            goto L_0x02fa
        L_0x0304:
            if (r4 == 0) goto L_0x031e
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 != r12) goto L_0x031e
            r18.clear()
            r0 = r18
            r0.addAll(r4)
            r17.clear()
            if (r2 == 0) goto L_0x031e
            r0 = r17
            r0.addAll(r2)
        L_0x031e:
            com.instagram.direct.model.DirectThreadThemeInfo r0 = new com.instagram.direct.model.DirectThreadThemeInfo
            r29 = r27
            r30 = r27
            r32 = r27
            r38 = r27
            r43 = r9
            r45 = r27
            r46 = r27
            r49 = r27
            r50 = r27
            r52 = r27
            r57 = r27
            r62 = r10
            r64 = r27
            r65 = r21
            r66 = r17
            r67 = r19
            r68 = r18
            r69 = r20
            r70 = r15
            r72 = r15
            r73 = r15
            r74 = r16
            r75 = r15
            r76 = r15
            r77 = r5
            r23 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)
            r11.add(r0)
            goto L_0x0071
        L_0x035c:
            A00 = r11
            return r11
        L_0x035f:
            java.util.List r11 = A00
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OSX.A00(X.NBD):java.util.List");
    }
}
