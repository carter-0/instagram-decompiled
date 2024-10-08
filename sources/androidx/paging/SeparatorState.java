package androidx.paging;

import X.00k;
import X.0sK;
import X.0sr;
import X.AnonymousClass7TE;
import X.C51970G9q;
import X.LGK;
import X.LP3;
import X.LRX;
import X.MDa;
import java.util.List;

public final class SeparatorState {
    public int A00;
    public int A01;
    public LP3 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final LGK A07 = new LGK();
    public final List A08 = AnonymousClass7TE.A1C();
    public final Integer A09;
    public final 0sK A0A;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(androidx.paging.PageEvent$StaticList r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            r1 = 0
            boolean r0 = r12 instanceof X.C66126MDe
            if (r0 == 0) goto L_0x0077
            r8 = r12
            X.MDe r8 = (X.C66126MDe) r8
            int r0 = r8.A09
            if (r0 != r1) goto L_0x0077
            int r2 = r8.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r8.A02 = r2
        L_0x0017:
            java.lang.Object r2 = r8.A07
            X.1Hj r9 = X.1Hj.A02
            int r0 = r8.A02
            r7 = 1
            if (r0 == 0) goto L_0x0068
            if (r0 != r7) goto L_0x007d
            int r6 = r8.A01
            int r5 = r8.A00
            java.lang.Object r1 = r8.A06
            java.lang.Object r4 = r8.A05
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r11 = r8.A04
            androidx.paging.PageEvent$StaticList r11 = (androidx.paging.PageEvent$StaticList) r11
            java.lang.Object r3 = r8.A03
            androidx.paging.SeparatorState r3 = (androidx.paging.SeparatorState) r3
            X.0eS.A00(r2)
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r4.add(r2)
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r4.add(r1)
        L_0x0041:
            if (r5 == r6) goto L_0x0082
            int r5 = r5 + 1
        L_0x0045:
            java.util.List r1 = r11.A02
            int r0 = r5 + -1
            java.lang.Object r2 = X.00k.A0O(r1, r0)
            java.lang.Object r1 = X.00k.A0O(r1, r5)
            X.0sK r0 = r3.A0A
            r8.A03 = r3
            r8.A04 = r11
            r8.A05 = r4
            r8.A06 = r1
            r8.A00 = r5
            r8.A01 = r6
            r8.A02 = r7
            java.lang.Object r2 = r0.invoke(r2, r1, r8)
            if (r2 != r9) goto L_0x0037
            return r9
        L_0x0068:
            java.util.ArrayList r4 = X.JTQ.A0e(r2)
            r5 = 0
            java.util.List r0 = r11.A02
            int r6 = r0.size()
            if (r6 < 0) goto L_0x0082
            r3 = r10
            goto L_0x0045
        L_0x0077:
            X.MDe r8 = new X.MDe
            r8.<init>(r10, r12)
            goto L_0x0017
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0082:
            X.LP3 r2 = r11.A01
            X.LP3 r1 = r11.A00
            androidx.paging.PageEvent$StaticList r0 = new androidx.paging.PageEvent$StaticList
            r0.<init>(r2, r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.A03(androidx.paging.PageEvent$StaticList, X.4D7):java.lang.Object");
    }

    public static final LRX A00(LRX lrx) {
        int i;
        int A0A2;
        LRX lrx2 = LRX.A04;
        int[] iArr = lrx.A03;
        List list = lrx.A01;
        List A1P = 0sr.A1P(new Object[]{00k.A0I(list), 00k.A0K(list)});
        int i2 = lrx.A00;
        List list2 = lrx.A02;
        if (list2 != null) {
            i = AnonymousClass7TE.A0M(00k.A0I(list2));
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (list2 != null) {
            A0A2 = AnonymousClass7TE.A0M(00k.A0K(list2));
        } else {
            A0A2 = C51970G9q.A0A(list);
        }
        return new LRX(A1P, 0sr.A1P(new Integer[]{valueOf, Integer.valueOf(A0A2)}), iArr, i2);
    }

    public static void A01(MDa mDa, Object obj, Object obj2, Object obj3, Object obj4) {
        mDa.A05 = obj;
        mDa.A06 = obj2;
        mDa.A07 = obj3;
        mDa.A08 = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v44, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v50, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v52, resolved type: java.util.AbstractCollection} */
    /* JADX WARNING: type inference failed for: r10v1, types: [X.MDa, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0207, code lost:
        r20 = r13.A00;
        r14 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x020f, code lost:
        if (r14 == null) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0211, code lost:
        r21 = X.AnonymousClass7TE.A0M(X.00k.A0I(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0219, code lost:
        androidx.paging.SeparatorsKt.A01((X.LRX) null, r13, r6, r5, r20, r21);
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0223, code lost:
        if (r7 != 0) goto L_0x0510;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0225, code lost:
        r14 = X.JTP.A09(r12);
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022b, code lost:
        r21 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x025d, code lost:
        r15.add(r6);
        r13 = r13 + 1;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0262, code lost:
        if (r13 >= r14) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0264, code lost:
        r10.A04 = r0;
        A01(r10, r1, r5, r2, r11);
        r10.A09 = r12;
        r10.A0A = r3;
        r10.A0B = r4;
        r10.A0C = r5;
        r10.A0D = null;
        r10.A0E = r8;
        r10.A00 = r7;
        r10.A01 = r13;
        r10.A02 = r14;
        r10.A03 = 3;
        r6 = androidx.paging.SeparatorsKt.A00((X.LRX) r1.A05.get(r13), r10, r0.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0291, code lost:
        if (r6 == r9) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0293, code lost:
        r15 = r5;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0295, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0299, code lost:
        if (r1.A04 != X.C62448Kfy.APPEND) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x029b, code lost:
        r13 = r0.A08;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a1, code lost:
        if (X.AnonymousClass7TE.A1b(r13) == false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a3, code lost:
        r13 = (X.LRX) X.00k.A0K(r13);
        r16 = r0.A0A;
        r15 = X.00k.A0K(r13.A01);
        X.0qQ.A0A(r11);
        r14 = X.00k.A0I(r11.A01);
        r10.A04 = r0;
        A01(r10, r1, r5, r2, r11);
        r10.A09 = r12;
        r10.A0A = r3;
        r10.A0B = r4;
        r10.A0C = r13;
        r10.A0D = null;
        r10.A0E = r8;
        r10.A00 = r7;
        r10.A03 = 4;
        r6 = r16.invoke(r15, r14, r10);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d9, code lost:
        if (r6 != r9) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02db, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0307, code lost:
        r14 = r11.A00;
        r15 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x030b, code lost:
        if (r15 == null) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x030d, code lost:
        r20 = X.AnonymousClass7TE.A0M(X.00k.A0I(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0315, code lost:
        androidx.paging.SeparatorsKt.A01(r13, r11, r6, r5, r14, r20);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0321, code lost:
        X.0qQ.A0A(r11);
        r2.add(A00(r11));
        r13 = r0.A0A;
        r10.A04 = r0;
        A01(r10, r1, r5, r2, r12);
        r10.A09 = r3;
        r10.A0A = r4;
        r10.A0B = r5;
        r10.A0C = null;
        r10.A0D = null;
        r10.A0E = r8;
        r10.A00 = r7;
        r10.A03 = 5;
        r6 = androidx.paging.SeparatorsKt.A00(r11, r10, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0348, code lost:
        if (r6 == r9) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034a, code lost:
        r11 = r5;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x034c, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0376, code lost:
        r5.add(r6);
        r14 = r1.A05.subList(r12.intValue(), X.JTP.A09(r4) + 1).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0391, code lost:
        if (r14.hasNext() == false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0393, code lost:
        r11 = r11;
        r13 = r14.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x039b, code lost:
        if (r14.hasNext() == false) goto L_0x0481;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x039d, code lost:
        r12 = (X.LRX) r14.next();
        r13 = (X.LRX) r13;
        r6 = r12.A01;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03ab, code lost:
        if (X.AnonymousClass7TE.A1b(r6) == false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03ad, code lost:
        r16 = r0.A0A;
        r15 = X.00k.A0K(r13.A01);
        r6 = X.00k.A0I(r6);
        r10.A04 = r0;
        A01(r10, r1, r11, r2, r3);
        r10.A09 = r4;
        r10.A0A = r14;
        r10.A0B = r12;
        r10.A0C = r13;
        r10.A0D = null;
        r10.A0E = r8;
        r10.A00 = r7;
        r10.A03 = 6;
        r6 = r16.invoke(r15, r6, r10);
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03d8, code lost:
        if (r6 != r9) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03da, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0406, code lost:
        r5 = r1.A04;
        r16 = r5;
        r15 = X.C62448Kfy.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x040c, code lost:
        if (r5 != r15) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x040e, code lost:
        r19 = r13.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0414, code lost:
        if (r16 != r15) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0416, code lost:
        r5 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0418, code lost:
        if (r5 == null) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x041a, code lost:
        r5 = X.00k.A0K(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x041e, code lost:
        r20 = X.AnonymousClass7TE.A0M(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0422, code lost:
        androidx.paging.SeparatorsKt.A01(r13, r12, r6, r11, r19, r20);
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0432, code lost:
        if (X.AnonymousClass7TE.A1b(r12.A01) == false) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0434, code lost:
        r2.add(A00(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x043b, code lost:
        r6 = r0.A0A;
        r10.A04 = r0;
        A01(r10, r1, r11, r2, r3);
        r10.A09 = r4;
        r10.A0A = r14;
        r10.A0B = r12;
        r10.A0C = r13;
        r10.A0D = r11;
        r10.A0E = r8;
        r10.A00 = r7;
        r10.A03 = 7;
        r6 = androidx.paging.SeparatorsKt.A00(r12, r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0457, code lost:
        if (r6 == r9) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0459, code lost:
        r15 = r11;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x045a, code lost:
        r11.add(r6);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0463, code lost:
        if (X.AnonymousClass7TE.A1b(r12.A01) == false) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0465, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0466, code lost:
        r11 = r15;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0469, code lost:
        r20 = X.C51970G9q.A0A(r13.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0470, code lost:
        r5 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0472, code lost:
        if (r5 == null) goto L_0x0479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0474, code lost:
        r5 = X.00k.A0I(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0479, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x047c, code lost:
        r19 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0481, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0485, code lost:
        if (r1.A04 != X.C62448Kfy.PREPEND) goto L_0x0501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0487, code lost:
        r6 = r0.A08;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x048d, code lost:
        if (X.AnonymousClass7TE.A1b(r6) == false) goto L_0x0501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x048f, code lost:
        r13 = (X.LRX) X.00k.A0I(r6);
        r14 = r0.A0A;
        X.0qQ.A0A(r3);
        r12 = X.00k.A0K(r3.A01);
        r6 = X.00k.A0I(r13.A01);
        r10.A04 = r0;
        A01(r10, r1, r11, r2, r3);
        r10.A09 = r4;
        r10.A0A = r13;
        r10.A0B = null;
        r10.A0C = null;
        r10.A0D = null;
        r10.A0E = r8;
        r10.A00 = r7;
        r10.A03 = 8;
        r6 = r14.invoke(r12, r6, r10);
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04c2, code lost:
        if (r6 != r9) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04c4, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04e8, code lost:
        r12 = r3.A00;
        r5 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04ec, code lost:
        if (r5 == null) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04ee, code lost:
        r19 = X.AnonymousClass7TE.A0M(X.00k.A0K(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04f6, code lost:
        androidx.paging.SeparatorsKt.A01(r3, r13, r6, r11, r12, r19);
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0501, code lost:
        r13 = r4.intValue() + 1;
        r12 = X.C51970G9q.A0A(r1.A05);
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x050d, code lost:
        if (r13 <= r12) goto L_0x0577;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x050f, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0510, code lost:
        if (r8 == false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0514, code lost:
        if (r0.A04 != false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0516, code lost:
        r0.A04 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0519, code lost:
        if (r7 == 0) goto L_0x0548;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x051b, code lost:
        r3 = (X.LRX) X.00k.A0K(r0.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0523, code lost:
        r8 = r0.A0A;
        r7 = X.00k.A0K(r3.A01);
        r10.A04 = r0;
        A01(r10, r1, r5, r2, r3);
        r10.A09 = r5;
        r10.A0A = null;
        r10.A0B = null;
        r10.A0C = null;
        r10.A0D = null;
        r10.A03 = 10;
        r6 = r8.invoke(r7, (java.lang.Object) null, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0543, code lost:
        if (r6 == r9) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0545, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0548, code lost:
        X.0qQ.A0A(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x056f, code lost:
        r11.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0572, code lost:
        if (r13 == r12) goto L_0x0510;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0574, code lost:
        r13 = r13 + 1;
        r11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0577, code lost:
        r5 = r0.A0A;
        r10.A04 = r0;
        A01(r10, r1, r11, r2, r3);
        r10.A09 = r11;
        r10.A0A = null;
        r10.A0B = null;
        r10.A0C = null;
        r10.A0D = null;
        r10.A0E = r8;
        r10.A00 = r7;
        r10.A01 = r13;
        r10.A02 = r12;
        r10.A03 = 9;
        r6 = androidx.paging.SeparatorsKt.A00((X.LRX) r1.A05.get(r13), r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05a1, code lost:
        if (r6 == r9) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05a3, code lost:
        r5 = r11;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05a5, code lost:
        r19 = X.C51970G9q.A0A(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05b7, code lost:
        throw X.AnonymousClass7TE.A1B(X.AnonymousClass000.A00(932));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05c5, code lost:
        r0.A03 = r7;
        r0.A06 = r7;
        r0.A05 = r2;
        r0.A04 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05cd, code lost:
        if (r6 != null) goto L_0x05d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05cf, code lost:
        X.0qQ.A0B(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05d2, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05d3, code lost:
        r5 = r1.A04;
        r0 = X.LRX.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0602, code lost:
        return new androidx.paging.PageEvent$Insert(r1.A03, r1.A02, r5, X.AnonymousClass7TE.A1I(new X.LRX(X.AnonymousClass7TE.A1I(r6), X.AnonymousClass7TE.A1I(java.lang.Integer.valueOf(r7)), new int[]{r7}, r7)), r1.A01, r1.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x061e, code lost:
        r7 = r3.A00;
        r4 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0623, code lost:
        if (r4 == null) goto L_0x065a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0625, code lost:
        r14 = X.AnonymousClass7TE.A0M(X.00k.A0K(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x062d, code lost:
        androidx.paging.SeparatorsKt.A01(r3, (X.LRX) null, r6, r8, r7, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0634, code lost:
        r0.A03 = false;
        r0.A06 = false;
        r4 = r1.A04;
        r3 = X.C62448Kfy.APPEND;
        r0 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x063f, code lost:
        if (r4 != r3) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0641, code lost:
        r0.addAll(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0655, code lost:
        return new androidx.paging.PageEvent$Insert(r1.A03, r1.A02, r4, r5, r1.A01, r1.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0656, code lost:
        r0.addAll(0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x065a, code lost:
        r14 = X.C51970G9q.A0A(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f6, code lost:
        if (r3 != r4) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0134, code lost:
        if (r8 != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013c, code lost:
        if (r13 != false) goto L_0x013e;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r7v2, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(androidx.paging.PageEvent$Insert r23, X.AnonymousClass4D7 r24) {
        /*
            r22 = this;
            r4 = r24
            r1 = r23
            boolean r0 = r4 instanceof X.MDa
            r14 = r22
            if (r0 == 0) goto L_0x0026
            r10 = r4
            X.MDa r10 = (X.MDa) r10
            int r3 = r10.A03
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0026
            int r3 = r3 - r2
            r10.A03 = r3
        L_0x0018:
            java.lang.Object r6 = r10.A0F
            X.1Hj r9 = X.1Hj.A02
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x05b8;
                case 2: goto L_0x01d8;
                case 3: goto L_0x022e;
                case 4: goto L_0x02dc;
                case 5: goto L_0x034f;
                case 6: goto L_0x03db;
                case 7: goto L_0x002c;
                case 8: goto L_0x04c5;
                case 9: goto L_0x054c;
                case 10: goto L_0x0603;
                default: goto L_0x0021;
            }
        L_0x0021:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0026:
            X.MDa r10 = new X.MDa
            r10.<init>(r14, r4)
            goto L_0x0018
        L_0x002c:
            int r7 = r10.A00
            boolean r8 = r10.A0E
            java.lang.Object r11 = r10.A0D
            java.util.AbstractCollection r11 = (java.util.AbstractCollection) r11
            java.lang.Object r13 = r10.A0C
            X.LRX r13 = (X.LRX) r13
            java.lang.Object r12 = r10.A0B
            X.LRX r12 = (X.LRX) r12
            java.lang.Object r14 = r10.A0A
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r4 = r10.A09
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r3 = r10.A08
            X.LRX r3 = (X.LRX) r3
            java.lang.Object r2 = r10.A07
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            java.lang.Object r15 = r10.A06
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
            goto L_0x045a
        L_0x005d:
            X.0eS.A00(r6)
            java.lang.Integer r0 = r14.A09
            boolean r6 = X.AnonymousClass7TG.A1Z(r1, r0)
            X.Kfy r3 = r1.A04
            X.Kfy r2 = X.C62448Kfy.APPEND
            if (r3 != r2) goto L_0x00c0
            boolean r13 = r14.A06
        L_0x006e:
            X.Kfy r4 = X.C62448Kfy.PREPEND
            if (r3 != r4) goto L_0x00aa
            boolean r8 = r14.A03
        L_0x0074:
            java.util.List r15 = r1.A05
            boolean r0 = r15 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0090
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0090
        L_0x0080:
            r7 = 1
        L_0x0081:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x00d6
            if (r3 != r4) goto L_0x00d6
            if (r7 != 0) goto L_0x00d6
            java.lang.String r0 = "Additional prepend event after prepend state is done"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0090:
            java.util.Iterator r5 = r15.iterator()
        L_0x0094:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r5.next()
            X.LRX r0 = (X.LRX) r0
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0094
            r7 = 0
            goto L_0x0081
        L_0x00aa:
            r8 = 0
            X.LP3 r0 = r1.A03
            X.KzI r0 = r0.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0074
            X.LP3 r0 = r1.A02
            if (r0 == 0) goto L_0x00be
            X.KzI r0 = r0.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00be
            goto L_0x0074
        L_0x00be:
            r8 = 1
            goto L_0x0074
        L_0x00c0:
            r13 = 0
            X.LP3 r0 = r1.A03
            X.KzI r0 = r0.A01
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x006e
            X.LP3 r0 = r1.A02
            if (r0 == 0) goto L_0x00d4
            X.KzI r0 = r0.A01
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00d4
            goto L_0x006e
        L_0x00d4:
            r13 = 1
            goto L_0x006e
        L_0x00d6:
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x00e5
            if (r3 != r2) goto L_0x00e5
            if (r7 != 0) goto L_0x00e5
            java.lang.String r0 = "Additional append event after append state is done"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00e5:
            X.LGK r5 = r14.A07
            X.LP3 r0 = r1.A03
            r5.A03(r0)
            X.LP3 r0 = r1.A02
            r14.A02 = r0
            if (r3 == r2) goto L_0x00f8
            int r0 = r1.A01
            r14.A01 = r0
            if (r3 == r4) goto L_0x00fc
        L_0x00f8:
            int r0 = r1.A00
            r14.A00 = r0
        L_0x00fc:
            if (r7 == 0) goto L_0x0145
            if (r13 != 0) goto L_0x0103
            if (r8 != 0) goto L_0x0103
        L_0x0102:
            return r23
        L_0x0103:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x010c
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x010c
            return r23
        L_0x010c:
            java.util.List r0 = r14.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0145
            if (r13 == 0) goto L_0x0134
            if (r8 == 0) goto L_0x013e
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x0136
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0136
            X.0sK r3 = r14.A0A
            r10.A04 = r14
            r10.A05 = r1
            r2 = 1
            r10.A03 = r6
            r0 = 0
            java.lang.Object r6 = r3.invoke(r0, r0, r10)
            if (r6 == r9) goto L_0x03da
            r0 = r14
            r7 = 0
            goto L_0x05c5
        L_0x0134:
            if (r8 == 0) goto L_0x0102
        L_0x0136:
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x013c
            r14.A03 = r6
        L_0x013c:
            if (r13 == 0) goto L_0x0102
        L_0x013e:
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x0102
            r14.A06 = r6
            return r23
        L_0x0145:
            java.util.ArrayList r5 = X.C51970G9q.A0m(r15)
            java.util.ArrayList r2 = X.C51970G9q.A0m(r15)
            if (r7 != 0) goto L_0x0188
            r3 = 0
        L_0x0150:
            int r0 = X.C51966G9m.A06(r15)
            if (r3 >= r0) goto L_0x0167
            java.lang.Object r0 = r15.get(r3)
            X.LRX r0 = (X.LRX) r0
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0167
            int r3 = r3 + 1
            goto L_0x0150
        L_0x0167:
            java.lang.Integer r12 = X.JTO.A0w(r3)
            java.lang.Object r11 = r15.get(r3)
            X.LRX r11 = (X.LRX) r11
            int r3 = X.C51966G9m.A06(r15)
        L_0x0175:
            if (r3 <= 0) goto L_0x018d
            java.lang.Object r0 = r15.get(r3)
            X.LRX r0 = (X.LRX) r0
            java.util.List r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018d
            int r3 = r3 + -1
            goto L_0x0175
        L_0x0188:
            r11 = 0
            r12 = 0
            r3 = 0
            r4 = 0
            goto L_0x0197
        L_0x018d:
            java.lang.Integer r4 = X.JTO.A0w(r3)
            java.lang.Object r3 = r15.get(r3)
            X.LRX r3 = (X.LRX) r3
        L_0x0197:
            if (r13 == 0) goto L_0x01d6
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x01d6
            r14.A05 = r6
            if (r7 == 0) goto L_0x01d1
            java.util.List r0 = r14.A08
            java.lang.Object r13 = X.00k.A0I(r0)
            X.LRX r13 = (X.LRX) r13
        L_0x01a9:
            X.0sK r15 = r14.A0A
            java.util.List r0 = r13.A01
            java.lang.Object r6 = X.00k.A0I(r0)
            r10.A04 = r14
            A01(r10, r1, r5, r2, r11)
            r10.A09 = r12
            r10.A0A = r3
            r10.A0B = r4
            r10.A0C = r13
            r10.A0D = r5
            r10.A0E = r8
            r10.A00 = r7
            r0 = 2
            r10.A03 = r0
            r0 = 0
            java.lang.Object r6 = r15.invoke(r0, r6, r10)
            if (r6 == r9) goto L_0x03da
            r0 = r14
            r15 = r5
            goto L_0x0207
        L_0x01d1:
            X.0qQ.A0A(r11)
            r13 = r11
            goto L_0x01a9
        L_0x01d6:
            r0 = r14
            goto L_0x0223
        L_0x01d8:
            int r7 = r10.A00
            boolean r8 = r10.A0E
            java.lang.Object r5 = r10.A0D
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r13 = r10.A0C
            X.LRX r13 = (X.LRX) r13
            java.lang.Object r4 = r10.A0B
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r3 = r10.A0A
            X.LRX r3 = (X.LRX) r3
            java.lang.Object r12 = r10.A09
            java.lang.Number r12 = (java.lang.Number) r12
            java.lang.Object r11 = r10.A08
            X.LRX r11 = (X.LRX) r11
            java.lang.Object r2 = r10.A07
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            java.lang.Object r15 = r10.A06
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
        L_0x0207:
            r16 = 0
            int r14 = r13.A00
            r20 = r14
            java.util.List r14 = r13.A02
            if (r14 == 0) goto L_0x022b
            java.lang.Object r14 = X.00k.A0I(r14)
            int r21 = X.AnonymousClass7TE.A0M(r14)
        L_0x0219:
            r17 = r13
            r18 = r6
            r19 = r5
            androidx.paging.SeparatorsKt.A01(r16, r17, r18, r19, r20, r21)
            r5 = r15
        L_0x0223:
            if (r7 != 0) goto L_0x0510
            int r14 = X.JTP.A09(r12)
            r13 = 0
            goto L_0x0262
        L_0x022b:
            r21 = 0
            goto L_0x0219
        L_0x022e:
            int r14 = r10.A02
            int r13 = r10.A01
            int r7 = r10.A00
            boolean r8 = r10.A0E
            java.lang.Object r15 = r10.A0C
            java.util.AbstractCollection r15 = (java.util.AbstractCollection) r15
            java.lang.Object r4 = r10.A0B
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r3 = r10.A0A
            X.LRX r3 = (X.LRX) r3
            java.lang.Object r12 = r10.A09
            java.lang.Number r12 = (java.lang.Number) r12
            java.lang.Object r11 = r10.A08
            X.LRX r11 = (X.LRX) r11
            java.lang.Object r2 = r10.A07
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            java.lang.Object r5 = r10.A06
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
        L_0x025d:
            r15.add(r6)
            int r13 = r13 + 1
        L_0x0262:
            if (r13 >= r14) goto L_0x0295
            java.util.List r6 = r1.A05
            java.lang.Object r15 = r6.get(r13)
            X.LRX r15 = (X.LRX) r15
            X.0sK r6 = r0.A0A
            r16 = r6
            r10.A04 = r0
            A01(r10, r1, r5, r2, r11)
            r10.A09 = r12
            r10.A0A = r3
            r10.A0B = r4
            r10.A0C = r5
            r6 = 0
            r10.A0D = r6
            r10.A0E = r8
            r10.A00 = r7
            r10.A01 = r13
            r10.A02 = r14
            r6 = 3
            r10.A03 = r6
            r6 = r16
            java.lang.Object r6 = androidx.paging.SeparatorsKt.A00(r15, r10, r6)
            if (r6 == r9) goto L_0x03da
            r15 = r5
            goto L_0x025d
        L_0x0295:
            X.Kfy r13 = r1.A04
            X.Kfy r6 = X.C62448Kfy.APPEND
            if (r13 != r6) goto L_0x0321
            java.util.List r13 = r0.A08
            boolean r6 = X.AnonymousClass7TE.A1b(r13)
            if (r6 == 0) goto L_0x0321
            java.lang.Object r13 = X.00k.A0K(r13)
            X.LRX r13 = (X.LRX) r13
            X.0sK r6 = r0.A0A
            r16 = r6
            java.util.List r6 = r13.A01
            java.lang.Object r15 = X.00k.A0K(r6)
            X.0qQ.A0A(r11)
            java.util.List r6 = r11.A01
            java.lang.Object r14 = X.00k.A0I(r6)
            r10.A04 = r0
            A01(r10, r1, r5, r2, r11)
            r10.A09 = r12
            r10.A0A = r3
            r10.A0B = r4
            r10.A0C = r13
            r6 = 0
            r10.A0D = r6
            r10.A0E = r8
            r10.A00 = r7
            r6 = 4
            r10.A03 = r6
            r6 = r16
            java.lang.Object r6 = r6.invoke(r15, r14, r10)
            if (r6 != r9) goto L_0x0307
            return r9
        L_0x02dc:
            int r7 = r10.A00
            boolean r8 = r10.A0E
            java.lang.Object r13 = r10.A0C
            X.LRX r13 = (X.LRX) r13
            java.lang.Object r4 = r10.A0B
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r3 = r10.A0A
            X.LRX r3 = (X.LRX) r3
            java.lang.Object r12 = r10.A09
            java.lang.Number r12 = (java.lang.Number) r12
            java.lang.Object r11 = r10.A08
            X.LRX r11 = (X.LRX) r11
            java.lang.Object r2 = r10.A07
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            java.lang.Object r5 = r10.A06
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
        L_0x0307:
            int r14 = r11.A00
            java.util.List r15 = r11.A02
            if (r15 == 0) goto L_0x034c
            java.lang.Object r15 = X.00k.A0I(r15)
            int r20 = X.AnonymousClass7TE.A0M(r15)
        L_0x0315:
            r15 = r13
            r16 = r11
            r17 = r6
            r18 = r5
            r19 = r14
            androidx.paging.SeparatorsKt.A01(r15, r16, r17, r18, r19, r20)
        L_0x0321:
            X.0qQ.A0A(r11)
            X.LRX r6 = A00(r11)
            r2.add(r6)
            X.0sK r13 = r0.A0A
            r10.A04 = r0
            A01(r10, r1, r5, r2, r12)
            r10.A09 = r3
            r10.A0A = r4
            r10.A0B = r5
            r6 = 0
            r10.A0C = r6
            r10.A0D = r6
            r10.A0E = r8
            r10.A00 = r7
            r6 = 5
            r10.A03 = r6
            java.lang.Object r6 = androidx.paging.SeparatorsKt.A00(r11, r10, r13)
            if (r6 == r9) goto L_0x03da
            r11 = r5
            goto L_0x0376
        L_0x034c:
            r20 = 0
            goto L_0x0315
        L_0x034f:
            int r7 = r10.A00
            boolean r8 = r10.A0E
            java.lang.Object r5 = r10.A0B
            java.util.AbstractCollection r5 = (java.util.AbstractCollection) r5
            java.lang.Object r4 = r10.A0A
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r3 = r10.A09
            X.LRX r3 = (X.LRX) r3
            java.lang.Object r12 = r10.A08
            java.lang.Number r12 = (java.lang.Number) r12
            java.lang.Object r2 = r10.A07
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            java.lang.Object r11 = r10.A06
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
        L_0x0376:
            r5.add(r6)
            java.util.List r13 = r1.A05
            int r6 = r12.intValue()
            int r5 = X.JTP.A09(r4)
            int r5 = r5 + 1
            java.util.List r5 = r13.subList(r6, r5)
            java.util.Iterator r14 = r5.iterator()
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x05ad
            java.lang.Object r13 = r14.next()
        L_0x0397:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0481
            java.lang.Object r12 = r14.next()
            X.LRX r12 = (X.LRX) r12
            X.LRX r13 = (X.LRX) r13
            java.util.List r6 = r12.A01
            boolean r5 = X.AnonymousClass7TE.A1b(r6)
            if (r5 == 0) goto L_0x042c
            X.0sK r5 = r0.A0A
            r16 = r5
            java.util.List r5 = r13.A01
            java.lang.Object r15 = X.00k.A0K(r5)
            java.lang.Object r6 = X.00k.A0I(r6)
            r10.A04 = r0
            A01(r10, r1, r11, r2, r3)
            r10.A09 = r4
            r10.A0A = r14
            r10.A0B = r12
            r10.A0C = r13
            r5 = 0
            r10.A0D = r5
            r10.A0E = r8
            r10.A00 = r7
            r5 = 6
            r10.A03 = r5
            r5 = r16
            java.lang.Object r6 = r5.invoke(r15, r6, r10)
            if (r6 != r9) goto L_0x0406
        L_0x03da:
            return r9
        L_0x03db:
            int r7 = r10.A00
            boolean r8 = r10.A0E
            java.lang.Object r13 = r10.A0C
            X.LRX r13 = (X.LRX) r13
            java.lang.Object r12 = r10.A0B
            X.LRX r12 = (X.LRX) r12
            java.lang.Object r14 = r10.A0A
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r4 = r10.A09
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r3 = r10.A08
            X.LRX r3 = (X.LRX) r3
            java.lang.Object r2 = r10.A07
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            java.lang.Object r11 = r10.A06
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
        L_0x0406:
            X.Kfy r5 = r1.A04
            r16 = r5
            X.Kfy r15 = X.C62448Kfy.PREPEND
            if (r5 != r15) goto L_0x047c
            int r5 = r13.A00
            r19 = r5
        L_0x0412:
            r5 = r16
            if (r5 != r15) goto L_0x0470
            java.util.List r5 = r13.A02
            if (r5 == 0) goto L_0x0469
            java.lang.Object r5 = X.00k.A0K(r5)
        L_0x041e:
            int r20 = X.AnonymousClass7TE.A0M(r5)
        L_0x0422:
            r16 = r12
            r17 = r6
            r18 = r11
            r15 = r13
            androidx.paging.SeparatorsKt.A01(r15, r16, r17, r18, r19, r20)
        L_0x042c:
            java.util.List r5 = r12.A01
            boolean r5 = X.AnonymousClass7TE.A1b(r5)
            if (r5 == 0) goto L_0x043b
            X.LRX r5 = A00(r12)
            r2.add(r5)
        L_0x043b:
            X.0sK r6 = r0.A0A
            r10.A04 = r0
            A01(r10, r1, r11, r2, r3)
            r10.A09 = r4
            r10.A0A = r14
            r10.A0B = r12
            r10.A0C = r13
            r10.A0D = r11
            r10.A0E = r8
            r10.A00 = r7
            r5 = 7
            r10.A03 = r5
            java.lang.Object r6 = androidx.paging.SeparatorsKt.A00(r12, r10, r6)
            if (r6 == r9) goto L_0x03da
            r15 = r11
        L_0x045a:
            r11.add(r6)
            java.util.List r5 = r12.A01
            boolean r5 = X.AnonymousClass7TE.A1b(r5)
            if (r5 == 0) goto L_0x0466
            r13 = r12
        L_0x0466:
            r11 = r15
            goto L_0x0397
        L_0x0469:
            java.util.List r5 = r13.A01
            int r20 = X.C51970G9q.A0A(r5)
            goto L_0x0422
        L_0x0470:
            java.util.List r5 = r12.A02
            if (r5 == 0) goto L_0x0479
            java.lang.Object r5 = X.00k.A0I(r5)
            goto L_0x041e
        L_0x0479:
            r20 = 0
            goto L_0x0422
        L_0x047c:
            int r5 = r12.A00
            r19 = r5
            goto L_0x0412
        L_0x0481:
            X.Kfy r6 = r1.A04
            X.Kfy r5 = X.C62448Kfy.PREPEND
            if (r6 != r5) goto L_0x0501
            java.util.List r6 = r0.A08
            boolean r5 = X.AnonymousClass7TE.A1b(r6)
            if (r5 == 0) goto L_0x0501
            java.lang.Object r13 = X.00k.A0I(r6)
            X.LRX r13 = (X.LRX) r13
            X.0sK r14 = r0.A0A
            X.0qQ.A0A(r3)
            java.util.List r5 = r3.A01
            java.lang.Object r12 = X.00k.A0K(r5)
            java.util.List r5 = r13.A01
            java.lang.Object r6 = X.00k.A0I(r5)
            r10.A04 = r0
            A01(r10, r1, r11, r2, r3)
            r10.A09 = r4
            r10.A0A = r13
            r5 = 0
            r10.A0B = r5
            r10.A0C = r5
            r10.A0D = r5
            r10.A0E = r8
            r10.A00 = r7
            r5 = 8
            r10.A03 = r5
            java.lang.Object r6 = r14.invoke(r12, r6, r10)
            if (r6 != r9) goto L_0x04e8
            return r9
        L_0x04c5:
            int r7 = r10.A00
            boolean r8 = r10.A0E
            java.lang.Object r13 = r10.A0A
            X.LRX r13 = (X.LRX) r13
            java.lang.Object r4 = r10.A09
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r3 = r10.A08
            X.LRX r3 = (X.LRX) r3
            java.lang.Object r2 = r10.A07
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r11 = r10.A06
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
        L_0x04e8:
            int r12 = r3.A00
            java.util.List r5 = r3.A02
            if (r5 == 0) goto L_0x05a5
            java.lang.Object r5 = X.00k.A0K(r5)
            int r19 = X.AnonymousClass7TE.A0M(r5)
        L_0x04f6:
            r14 = r3
            r15 = r13
            r16 = r6
            r17 = r11
            r18 = r12
            androidx.paging.SeparatorsKt.A01(r14, r15, r16, r17, r18, r19)
        L_0x0501:
            int r4 = r4.intValue()
            int r13 = r4 + 1
            java.util.List r4 = r1.A05
            int r12 = X.C51970G9q.A0A(r4)
            if (r13 <= r12) goto L_0x0577
            r5 = r11
        L_0x0510:
            if (r8 == 0) goto L_0x0634
            boolean r4 = r0.A04
            if (r4 != 0) goto L_0x0634
            r4 = 1
            r0.A04 = r4
            if (r7 == 0) goto L_0x0548
            java.util.List r3 = r0.A08
            java.lang.Object r3 = X.00k.A0K(r3)
            X.LRX r3 = (X.LRX) r3
        L_0x0523:
            X.0sK r8 = r0.A0A
            java.util.List r4 = r3.A01
            java.lang.Object r7 = X.00k.A0K(r4)
            r10.A04 = r0
            A01(r10, r1, r5, r2, r3)
            r10.A09 = r5
            r6 = 0
            r10.A0A = r6
            r10.A0B = r6
            r10.A0C = r6
            r10.A0D = r6
            r4 = 10
            r10.A03 = r4
            java.lang.Object r6 = r8.invoke(r7, r6, r10)
            if (r6 == r9) goto L_0x03da
            r8 = r5
            goto L_0x061e
        L_0x0548:
            X.0qQ.A0A(r3)
            goto L_0x0523
        L_0x054c:
            int r12 = r10.A02
            int r13 = r10.A01
            int r7 = r10.A00
            boolean r8 = r10.A0E
            java.lang.Object r11 = r10.A09
            java.util.AbstractCollection r11 = (java.util.AbstractCollection) r11
            java.lang.Object r3 = r10.A08
            X.LRX r3 = (X.LRX) r3
            java.lang.Object r2 = r10.A07
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r5 = r10.A06
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
        L_0x056f:
            r11.add(r6)
            if (r13 == r12) goto L_0x0510
            int r13 = r13 + 1
            r11 = r5
        L_0x0577:
            java.util.List r4 = r1.A05
            java.lang.Object r6 = r4.get(r13)
            X.LRX r6 = (X.LRX) r6
            X.0sK r5 = r0.A0A
            r10.A04 = r0
            A01(r10, r1, r11, r2, r3)
            r10.A09 = r11
            r4 = 0
            r10.A0A = r4
            r10.A0B = r4
            r10.A0C = r4
            r10.A0D = r4
            r10.A0E = r8
            r10.A00 = r7
            r10.A01 = r13
            r10.A02 = r12
            r4 = 9
            r10.A03 = r4
            java.lang.Object r6 = androidx.paging.SeparatorsKt.A00(r6, r10, r5)
            if (r6 == r9) goto L_0x03da
            r5 = r11
            goto L_0x056f
        L_0x05a5:
            java.util.List r5 = r3.A01
            int r19 = X.C51970G9q.A0A(r5)
            goto L_0x04f6
        L_0x05ad:
            r0 = 932(0x3a4, float:1.306E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x05b8:
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
            r7 = 0
            r2 = 1
        L_0x05c5:
            r0.A03 = r7
            r0.A06 = r7
            r0.A05 = r2
            r0.A04 = r2
            if (r6 != 0) goto L_0x05d3
            X.0qQ.A0B(r1, r7)
            return r1
        L_0x05d3:
            X.Kfy r5 = r1.A04
            int[] r4 = new int[]{r7}
            X.LRX r0 = X.LRX.A04
            java.util.List r3 = X.AnonymousClass7TE.A1I(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            X.LRX r0 = new X.LRX
            r0.<init>(r3, r2, r4, r7)
            java.util.List r6 = X.AnonymousClass7TE.A1I(r0)
            int r4 = r1.A01
            int r3 = r1.A00
            X.LP3 r2 = r1.A03
            X.LP3 r0 = r1.A02
            androidx.paging.PageEvent$Insert r1 = new androidx.paging.PageEvent$Insert
            r7 = r4
            r8 = r3
            r3 = r2
            r4 = r0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0603:
            java.lang.Object r8 = r10.A09
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r3 = r10.A08
            X.LRX r3 = (X.LRX) r3
            java.lang.Object r2 = r10.A07
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r5 = r10.A06
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r1 = r10.A05
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent$Insert) r1
            java.lang.Object r0 = r10.A04
            androidx.paging.SeparatorState r0 = (androidx.paging.SeparatorState) r0
            X.0eS.A00(r6)
        L_0x061e:
            r10 = 0
            int r7 = r3.A00
            java.util.List r4 = r3.A02
            if (r4 == 0) goto L_0x065a
            java.lang.Object r4 = X.00k.A0K(r4)
            int r14 = X.AnonymousClass7TE.A0M(r4)
        L_0x062d:
            r9 = r3
            r11 = r6
            r12 = r8
            r13 = r7
            androidx.paging.SeparatorsKt.A01(r9, r10, r11, r12, r13, r14)
        L_0x0634:
            r6 = 0
            r0.A03 = r6
            r0.A06 = r6
            X.Kfy r4 = r1.A04
            X.Kfy r3 = X.C62448Kfy.APPEND
            java.util.List r0 = r0.A08
            if (r4 != r3) goto L_0x0656
            r0.addAll(r2)
        L_0x0644:
            int r2 = r1.A01
            int r0 = r1.A00
            X.LP3 r7 = r1.A03
            X.LP3 r8 = r1.A02
            androidx.paging.PageEvent$Insert r6 = new androidx.paging.PageEvent$Insert
            r11 = r2
            r12 = r0
            r9 = r4
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x0656:
            r0.addAll(r6, r2)
            goto L_0x0644
        L_0x065a:
            java.util.List r4 = r3.A01
            int r14 = X.C51970G9q.A0A(r4)
            goto L_0x062d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.A02(androidx.paging.PageEvent$Insert, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: X.Jje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: X.Jje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: X.Jje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: X.Jje} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: X.Jje} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r0 != false) goto L_0x0071;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C62942Kou r14, X.AnonymousClass4D7 r15) {
        /*
            r13 = this;
            r4 = 13
            boolean r0 = X.C66144MDw.A02(r4, r15)
            if (r0 == 0) goto L_0x002c
            r1 = r15
            X.MDw r1 = (X.C66144MDw) r1
            int r3 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x002c
            int r3 = r3 - r2
            r1.A00 = r3
        L_0x0016:
            java.lang.Object r6 = r1.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r4 = 3
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 == r3) goto L_0x0032
            if (r0 == r5) goto L_0x0032
            if (r0 == r4) goto L_0x0032
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002c:
            X.MDw r1 = new X.MDw
            r1.<init>(r13, r15, r4)
            goto L_0x0016
        L_0x0032:
            java.lang.Object r1 = r1.A01
            androidx.paging.SeparatorState r1 = (androidx.paging.SeparatorState) r1
            X.0eS.A00(r6)
            goto L_0x00d3
        L_0x003b:
            X.0eS.A00(r6)
            boolean r0 = r14 instanceof androidx.paging.PageEvent$Insert
            if (r0 == 0) goto L_0x004f
            androidx.paging.PageEvent$Insert r14 = (androidx.paging.PageEvent$Insert) r14
            r1.A01 = r13
            r1.A00 = r3
            java.lang.Object r6 = r13.A02(r14, r1)
        L_0x004c:
            if (r6 != r2) goto L_0x00d2
            return r2
        L_0x004f:
            boolean r0 = r14 instanceof X.C60335Jje
            if (r0 == 0) goto L_0x00c2
            X.Jje r14 = (X.C60335Jje) r14
            r1.A01 = r13
            r1.A00 = r5
            X.LP3 r6 = r13.A02
            X.LGK r3 = r13.A07
            X.LP3 r0 = r3.A01()
            X.LP3 r7 = r14.A01
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x0073
            X.LP3 r0 = r14.A00
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x0073
        L_0x0071:
            r6 = r14
            goto L_0x004c
        L_0x0073:
            r3.A03(r7)
            X.LP3 r8 = r14.A00
            r13.A02 = r8
            r0 = 0
            if (r8 == 0) goto L_0x0071
            X.KzI r4 = r8.A01
            boolean r3 = r4.A00
            if (r3 == 0) goto L_0x00a5
            if (r6 == 0) goto L_0x00a3
            X.KzI r3 = r6.A01
        L_0x0087:
            boolean r3 = X.0qQ.A0K(r3, r4)
            if (r3 != 0) goto L_0x00a5
            androidx.paging.PageEvent$Insert r0 = androidx.paging.PageEvent$Insert.A06
            X.0sn r10 = X.0sn.A00
            int r11 = r13.A01
            X.Dba.A0j(r5, r10, r7)
            X.Kfy r9 = X.C62448Kfy.PREPEND
            r12 = -1
        L_0x0099:
            androidx.paging.PageEvent$Insert r6 = new androidx.paging.PageEvent$Insert
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.Object r14 = r13.A02(r6, r1)
            goto L_0x0071
        L_0x00a3:
            r3 = r0
            goto L_0x0087
        L_0x00a5:
            X.KzI r4 = r8.A00
            boolean r3 = r4.A00
            if (r3 == 0) goto L_0x0071
            if (r6 == 0) goto L_0x00af
            X.KzI r0 = r6.A00
        L_0x00af:
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x0071
            androidx.paging.PageEvent$Insert r0 = androidx.paging.PageEvent$Insert.A06
            X.0sn r10 = X.0sn.A00
            int r12 = r13.A00
            X.Dba.A0j(r5, r10, r7)
            X.Kfy r9 = X.C62448Kfy.APPEND
            r11 = -1
            goto L_0x0099
        L_0x00c2:
            boolean r0 = r14 instanceof androidx.paging.PageEvent$StaticList
            if (r0 == 0) goto L_0x00fa
            androidx.paging.PageEvent$StaticList r14 = (androidx.paging.PageEvent$StaticList) r14
            r1.A01 = r13
            r1.A00 = r4
            java.lang.Object r6 = r13.A03(r14, r1)
            goto L_0x004c
        L_0x00d2:
            r1 = r13
        L_0x00d3:
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00e6
            java.util.List r0 = r1.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = "deferred endTerm, page stash should be empty"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00e6:
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x00f9
            java.util.List r0 = r1.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = "deferred startTerm, page stash should be empty"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00f9:
            return r6
        L_0x00fa:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.A04(X.Kou, X.4D7):java.lang.Object");
    }

    public SeparatorState(Integer num, 0sK r3) {
        this.A09 = num;
        this.A0A = r3;
    }
}
