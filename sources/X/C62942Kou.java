package X;

/* renamed from: X.Kou  reason: case insensitive filesystem */
public abstract class C62942Kou {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r18, X.0sL r19) {
        /*
            r17 = this;
            r1 = r17
            r14 = r19
            boolean r0 = r1 instanceof androidx.paging.PageEvent$StaticList
            r5 = r18
            if (r0 == 0) goto L_0x0088
            r2 = r1
            androidx.paging.PageEvent$StaticList r2 = (androidx.paging.PageEvent$StaticList) r2
            r4 = 0
            boolean r0 = X.ME1.A02(r4, r5)
            if (r0 == 0) goto L_0x0071
            r6 = r5
            X.ME1 r6 = (X.ME1) r6
            int r3 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0071
            int r3 = r3 - r1
            r6.A00 = r3
        L_0x0022:
            java.lang.Object r0 = r6.A06
            X.1Hj r15 = X.1Hj.A02
            int r1 = r6.A00
            r5 = 1
            if (r1 == 0) goto L_0x0063
            if (r1 != r5) goto L_0x0083
            java.lang.Object r1 = r6.A05
            java.lang.Object r4 = r6.A04
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r6.A03
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r14 = r6.A02
            X.0sL r14 = (X.0sL) r14
            java.lang.Object r2 = r6.A01
            androidx.paging.PageEvent$StaticList r2 = (androidx.paging.PageEvent$StaticList) r2
            X.0eS.A00(r0)
        L_0x0042:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x004b
            r3.add(r1)
        L_0x004b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r4.next()
            X.ME1.A00(r2, r14, r3, r4, r6)
            r6.A05 = r1
            r6.A00 = r5
            java.lang.Object r0 = r14.invoke(r1, r6)
            if (r0 != r15) goto L_0x0042
            return r15
        L_0x0063:
            X.0eS.A00(r0)
            java.util.List r0 = r2.A02
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
            goto L_0x004b
        L_0x0071:
            X.ME1 r6 = new X.ME1
            r6.<init>(r2, r5, r4)
            goto L_0x0022
        L_0x0077:
            java.util.List r3 = (java.util.List) r3
            X.LP3 r1 = r2.A01
            X.LP3 r0 = r2.A00
            androidx.paging.PageEvent$StaticList r15 = new androidx.paging.PageEvent$StaticList
            r15.<init>(r1, r0, r3)
            return r15
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0088:
            boolean r0 = r1 instanceof androidx.paging.PageEvent$Insert
            if (r0 == 0) goto L_0x0190
            r3 = r1
            androidx.paging.PageEvent$Insert r3 = (androidx.paging.PageEvent$Insert) r3
            boolean r0 = r5 instanceof X.MDZ
            if (r0 == 0) goto L_0x016d
            r13 = r5
            X.MDZ r13 = (X.MDZ) r13
            int r2 = r13.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x016d
            int r2 = r2 - r1
            r13.A02 = r2
        L_0x00a1:
            java.lang.Object r0 = r13.A0E
            X.1Hj r15 = X.1Hj.A02
            int r2 = r13.A02
            r16 = 1
            if (r2 == 0) goto L_0x0134
            r1 = r16
            if (r2 != r1) goto L_0x0174
            int r12 = r13.A01
            int r11 = r13.A00
            java.lang.Object r10 = r13.A05
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r2 = r13.A0D
            java.lang.Object r9 = r13.A0C
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r8 = r13.A0B
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r13.A0A
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r1 = r13.A09
            X.LRX r1 = (X.LRX) r1
            java.lang.Object r6 = r13.A08
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r13.A07
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r4 = r13.A06
            X.Kfy r4 = (X.C62448Kfy) r4
            java.lang.Object r3 = r13.A04
            androidx.paging.PageEvent$Insert r3 = (androidx.paging.PageEvent$Insert) r3
            java.lang.Object r14 = r13.A03
            X.0sL r14 = (X.0sL) r14
            X.0eS.A00(r0)
        L_0x00e0:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00f8
            r7.add(r2)
            java.util.List r0 = r1.A02
            if (r0 == 0) goto L_0x00f1
            int r12 = X.C51971G9r.A0I(r0, r12)
        L_0x00f1:
            java.lang.Integer r0 = X.JTO.A0w(r12)
            r8.add(r0)
        L_0x00f8:
            r12 = r11
        L_0x00f9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r2 = r9.next()
            int r11 = r12 + 1
            if (r12 >= 0) goto L_0x010f
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010f:
            r13.A03 = r14
            r13.A04 = r3
            r13.A06 = r4
            r13.A07 = r5
            r13.A08 = r6
            r13.A09 = r1
            r13.A0A = r7
            r13.A0B = r8
            r13.A0C = r9
            r13.A0D = r2
            r13.A05 = r10
            r13.A00 = r11
            r13.A01 = r12
            r0 = r16
            r13.A02 = r0
            java.lang.Object r0 = r14.invoke(r2, r13)
            if (r0 != r15) goto L_0x00e0
            return r15
        L_0x0134:
            X.0eS.A00(r0)
            X.Kfy r4 = r3.A04
            java.util.List r0 = r3.A05
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
            goto L_0x0150
        L_0x0144:
            int[] r2 = r1.A03
            int r1 = r1.A00
            X.LRX r0 = new X.LRX
            r0.<init>(r7, r8, r2, r1)
            r10.add(r0)
        L_0x0150:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0179
            java.lang.Object r1 = r6.next()
            X.LRX r1 = (X.LRX) r1
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r1.A01
            java.util.Iterator r9 = r0.iterator()
            r10 = r5
            r12 = 0
            goto L_0x00f9
        L_0x016d:
            X.MDZ r13 = new X.MDZ
            r13.<init>(r3, r5)
            goto L_0x00a1
        L_0x0174:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0179:
            java.util.List r5 = (java.util.List) r5
            int r6 = r3.A01
            int r2 = r3.A00
            X.LP3 r1 = r3.A03
            X.LP3 r0 = r3.A02
            androidx.paging.PageEvent$Insert r15 = new androidx.paging.PageEvent$Insert
            r7 = r4
            r8 = r5
            r9 = r6
            r10 = r2
            r4 = r15
            r5 = r1
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r15
        L_0x0190:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62942Kou.A00(X.4D7, X.0sL):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r0 == r14) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r22, X.0sL r23) {
        /*
            r21 = this;
            r1 = r21
            r9 = r23
            boolean r0 = r1 instanceof androidx.paging.PageEvent$StaticList
            r4 = r22
            if (r0 == 0) goto L_0x0073
            r2 = r1
            androidx.paging.PageEvent$StaticList r2 = (androidx.paging.PageEvent$StaticList) r2
            r6 = 1
            boolean r0 = X.ME1.A02(r6, r4)
            if (r0 == 0) goto L_0x006d
            r5 = r4
            X.ME1 r5 = (X.ME1) r5
            int r3 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x006d
            int r3 = r3 - r1
            r5.A00 = r3
        L_0x0022:
            java.lang.Object r0 = r5.A06
            X.1Hj r14 = X.1Hj.A02
            int r1 = r5.A00
            if (r1 == 0) goto L_0x005f
            if (r1 != r6) goto L_0x013e
            java.lang.Object r4 = r5.A05
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r3 = r5.A04
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r1 = r5.A03
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r9 = r5.A02
            X.0sL r9 = (X.0sL) r9
            java.lang.Object r2 = r5.A01
            androidx.paging.PageEvent$StaticList r2 = (androidx.paging.PageEvent$StaticList) r2
            X.0eS.A00(r0)
        L_0x0043:
            r4.add(r0)
        L_0x0046:
            r4 = r1
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r3.next()
            X.ME1.A00(r2, r9, r1, r3, r5)
            r5.A05 = r1
            r5.A00 = r6
            java.lang.Object r0 = r9.invoke(r0, r5)
            if (r0 != r14) goto L_0x0043
        L_0x005e:
            return r14
        L_0x005f:
            X.0eS.A00(r0)
            java.util.List r0 = r2.A02
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
            goto L_0x0046
        L_0x006d:
            X.ME1 r5 = new X.ME1
            r5.<init>(r2, r4, r6)
            goto L_0x0022
        L_0x0073:
            boolean r0 = r1 instanceof androidx.paging.PageEvent$Insert
            if (r0 == 0) goto L_0x0162
            r3 = r1
            androidx.paging.PageEvent$Insert r3 = (androidx.paging.PageEvent$Insert) r3
            r1 = 0
            boolean r0 = r4 instanceof X.C66135MDn
            if (r0 == 0) goto L_0x012b
            r8 = r4
            X.MDn r8 = (X.C66135MDn) r8
            int r0 = r8.A0E
            if (r0 != r1) goto L_0x012b
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x012b
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0091:
            java.lang.Object r0 = r8.A04
            X.1Hj r14 = X.1Hj.A02
            int r1 = r8.A00
            r7 = 1
            if (r1 == 0) goto L_0x00f3
            if (r1 != r7) goto L_0x0143
            java.lang.Object r12 = r8.A06
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r13 = r8.A03
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r2 = r8.A0D
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r11 = r8.A0C
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r10 = r8.A0B
            int[] r10 = (int[]) r10
            java.lang.Object r1 = r8.A0A
            X.LRX r1 = (X.LRX) r1
            java.lang.Object r6 = r8.A09
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r8.A08
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r4 = r8.A07
            X.Kfy r4 = (X.C62448Kfy) r4
            java.lang.Object r3 = r8.A02
            androidx.paging.PageEvent$Insert r3 = (androidx.paging.PageEvent$Insert) r3
            java.lang.Object r9 = r8.A01
            X.0sL r9 = (X.0sL) r9
            X.0eS.A00(r0)
        L_0x00cb:
            r13.add(r0)
        L_0x00ce:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0103
            java.lang.Object r0 = r2.next()
            r8.A01 = r9
            r8.A02 = r3
            r8.A07 = r4
            r8.A08 = r5
            X.C66135MDn.A00(r6, r1, r10, r11, r8)
            r8.A0D = r2
            r8.A03 = r11
            r8.A06 = r12
            r8.A00 = r7
            java.lang.Object r0 = r9.invoke(r0, r8)
            if (r0 == r14) goto L_0x005e
            r13 = r11
            goto L_0x00cb
        L_0x00f3:
            X.0eS.A00(r0)
            X.Kfy r4 = r3.A04
            java.util.List r0 = r3.A05
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r6 = r0.iterator()
            goto L_0x0111
        L_0x0103:
            java.util.List r11 = (java.util.List) r11
            int r2 = r1.A00
            java.util.List r1 = r1.A02
            X.LRX r0 = new X.LRX
            r0.<init>(r11, r1, r10, r2)
            r12.add(r0)
        L_0x0111:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r1 = r6.next()
            X.LRX r1 = (X.LRX) r1
            int[] r10 = r1.A03
            java.util.List r0 = r1.A01
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r2 = r0.iterator()
            r12 = r5
            goto L_0x00ce
        L_0x012b:
            X.MDn r8 = new X.MDn
            r8.<init>((androidx.paging.PageEvent$Insert) r3, (X.AnonymousClass4D7) r4)
            goto L_0x0091
        L_0x0132:
            java.util.List r4 = (java.util.List) r4
            X.LP3 r1 = r2.A01
            X.LP3 r0 = r2.A00
            androidx.paging.PageEvent$StaticList r14 = new androidx.paging.PageEvent$StaticList
            r14.<init>(r1, r0, r4)
            return r14
        L_0x013e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0143:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0148:
            java.util.List r5 = (java.util.List) r5
            int r2 = r3.A01
            int r1 = r3.A00
            X.LP3 r15 = r3.A03
            X.LP3 r0 = r3.A02
            androidx.paging.PageEvent$Insert r14 = new androidx.paging.PageEvent$Insert
            r19 = r2
            r20 = r1
            r18 = r5
            r17 = r4
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r14
        L_0x0162:
            return r21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62942Kou.A01(X.4D7, X.0sL):java.lang.Object");
    }
}
