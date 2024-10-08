package X;

/* renamed from: X.MCa  reason: case insensitive filesystem */
public final class C66116MCa implements 02o {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C66116MCa(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.MQ0 r17, X.AnonymousClass4D7 r18) {
        /*
            r16 = this;
            r3 = r17
            r7 = 3
            r4 = r18
            boolean r0 = X.ME9.A03(r7, r4)
            r5 = r16
            if (r0 == 0) goto L_0x012d
            r8 = r4
            X.ME9 r8 = (X.ME9) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x012d
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001b:
            java.lang.Object r2 = r8.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x00c1
            if (r0 != r6) goto L_0x0133
            java.lang.Object r3 = r8.A02
            X.MQ0 r3 = (X.MQ0) r3
            java.lang.Object r1 = r8.A01
            X.MCa r1 = (X.C66116MCa) r1
            X.0eS.A00(r2)
        L_0x0031:
            boolean r0 = X.C59678JTj.A01(r6, r3)
            if (r0 == 0) goto L_0x0047
            java.lang.Object r5 = r1.A01
            com.instagram.mediakit.repository.MediaKitRepository r5 = (com.instagram.mediakit.repository.MediaKitRepository) r5
            X.JTj r3 = (X.C59678JTj) r3
            java.lang.Object r4 = r3.A01
            X.Jz9 r4 = (X.C61216Jz9) r4
            if (r4 != 0) goto L_0x004a
            r0 = 0
        L_0x0044:
            com.instagram.mediakit.repository.MediaKitRepository.A04(r0, r5)
        L_0x0047:
            X.0gF r4 = X.C60340gF.A00
        L_0x0049:
            return r4
        L_0x004a:
            java.util.List r0 = r4.A02
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r0.iterator()
        L_0x0054:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r2 = r8.next()
            r1 = r2
            X.JzD r1 = (X.C61220JzD) r1
            com.instagram.mediakit.model.MediaKitSectionType r0 = r1.A01
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x0073
            if (r0 != r6) goto L_0x006f
            java.util.List r0 = r1.A05
        L_0x006d:
            if (r0 == 0) goto L_0x0054
        L_0x006f:
            r3.add(r2)
            goto L_0x0054
        L_0x0073:
            X.JzC r0 = r1.A00
            goto L_0x006d
        L_0x0076:
            r1 = r3
            X.JzE r2 = r4.A00
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x00ba
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r8 = r1.iterator()
            r7 = 0
        L_0x0086:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r8.next()
            int r1 = r7 + 1
            if (r7 >= 0) goto L_0x009c
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009c:
            X.JzD r0 = (X.C61220JzD) r0
            X.0qQ.A0B(r0, r6)
            java.util.List r14 = r0.A05
            java.lang.String r11 = r0.A02
            java.util.List r15 = r0.A06
            X.JzC r9 = r0.A00
            java.lang.String r13 = r0.A04
            com.instagram.mediakit.model.MediaKitSectionType r10 = r0.A01
            java.lang.String r12 = java.lang.String.valueOf(r7)
            X.JzD r0 = X.C63319Kv2.A00(r9, r10, r11, r12, r13, r14, r15)
            r3.add(r0)
            r7 = r1
            goto L_0x0086
        L_0x00ba:
            java.lang.String r0 = r4.A01
            X.Jz9 r0 = X.C63314Kux.A00(r2, r0, r3)
            goto L_0x0044
        L_0x00c1:
            X.0eS.A00(r2)
            java.lang.Object r2 = r5.A01
            com.instagram.mediakit.repository.MediaKitRepository r2 = (com.instagram.mediakit.repository.MediaKitRepository) r2
            boolean r1 = r5.A02
            X.ME9.A01(r5, r3, r8, r6)
            boolean r0 = r3 instanceof X.C59702JUj
            if (r0 == 0) goto L_0x00f5
            X.JzE r0 = com.instagram.mediakit.repository.MediaKitRepository.A00(r2)
            if (r1 == 0) goto L_0x00ed
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x00ea
            X.LtM r1 = X.C65438LtM.A00
        L_0x00df:
            X.MQk r1 = (X.C66404MQk) r1
        L_0x00e1:
            java.lang.Object r0 = com.instagram.mediakit.repository.MediaKitRepository.A02(r1, r2, r8)
            if (r0 == r4) goto L_0x0049
            r1 = r5
            goto L_0x0031
        L_0x00ea:
            X.LtK r1 = X.C65436LtK.A00
            goto L_0x00df
        L_0x00ed:
            if (r0 == 0) goto L_0x00f2
            X.LtG r1 = X.C65432LtG.A00
            goto L_0x00df
        L_0x00f2:
            X.LtF r1 = X.C65431LtF.A00
            goto L_0x00df
        L_0x00f5:
            boolean r0 = X.C59678JTj.A01(r6, r3)
            if (r0 == 0) goto L_0x0110
            if (r1 == 0) goto L_0x010d
            X.JzE r0 = com.instagram.mediakit.repository.MediaKitRepository.A00(r2)
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x010a
            X.LtL r1 = X.C65437LtL.A00
            goto L_0x00df
        L_0x010a:
            X.LtJ r1 = X.C65435LtJ.A00
            goto L_0x00df
        L_0x010d:
            X.LtE r1 = X.C65430LtE.A00
            goto L_0x00e1
        L_0x0110:
            boolean r0 = X.C59678JTj.A02(r3)
            if (r0 == 0) goto L_0x0138
            r0 = r3
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r0 = r0.A01
            X.L4n r0 = (X.C63729L4n) r0
            java.lang.String r0 = r0.A01
            if (r1 == 0) goto L_0x0127
            X.LtP r1 = new X.LtP
            r1.<init>(r0)
            goto L_0x00e1
        L_0x0127:
            X.LtO r1 = new X.LtO
            r1.<init>(r0)
            goto L_0x00e1
        L_0x012d:
            X.ME9 r8 = X.ME9.A00(r5, r4, r7)
            goto L_0x001b
        L_0x0133:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0138:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66116MCa.A00(X.MQ0, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x001a
            java.lang.Object r2 = r5.A01
            X.GCg r2 = (X.C52034GCg) r2
            boolean r0 = r5.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            X.C52034GCg.A06(r2, r0, r1)
        L_0x0017:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x001a:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r5.A01
            X.GCg r0 = (X.C52034GCg) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A04
            java.lang.String r0 = "hide_gifts_count_setting_failed"
            X.C59689JTv.A0E(r1, r0)
            goto L_0x0017
        L_0x002a:
            r4 = 35
            boolean r0 = X.ME6.A02(r4, r7)
            if (r0 == 0) goto L_0x004f
            r3 = r7
            X.ME6 r3 = (X.ME6) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004f
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0040:
            java.lang.Object r1 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r2) goto L_0x0080
            X.0eS.A00(r1)
            goto L_0x0017
        L_0x004f:
            X.ME6 r3 = new X.ME6
            r3.<init>(r5, r7, r4)
            goto L_0x0040
        L_0x0055:
            X.0eS.A00(r1)
            java.lang.Object r1 = r5.A01
            X.02o r1 = (X.02o) r1
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0071
            boolean r0 = r6.booleanValue()
        L_0x0064:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r2
            java.lang.Object r0 = r1.emit(r0, r3)
            if (r0 != r4) goto L_0x0017
            return r4
        L_0x0071:
            boolean r0 = r5.A02
            goto L_0x0064
        L_0x0074:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0079:
            X.MQ0 r6 = (X.MQ0) r6
            java.lang.Object r4 = r5.A00(r6, r7)
            return r4
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66116MCa.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
