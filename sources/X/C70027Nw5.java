package X;

/* renamed from: X.Nw5  reason: case insensitive filesystem */
public abstract class C70027Nw5 {
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.content.Context r9, X.C328497Fa r10, X.C272074k3 r11, X.2FW r12, java.lang.Integer r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, long r17, boolean r19, boolean r20, boolean r21) {
        /*
            r6 = 0
            r0 = 5
            r1 = r10
            X.0qQ.A0B(r10, r0)
            r4 = 8
            r10 = 1
            r3 = 7
            r0 = 3
            r2 = 9
            r7 = r9
            if (r20 == 0) goto L_0x0061
            int r1 = r1.ordinal()
            if (r1 == r0) goto L_0x0023
            r0 = 2131960386(0x7f132242, float:1.955744E38)
            if (r1 != r6) goto L_0x001e
            r0 = 2131960706(0x7f132382, float:1.9558088E38)
        L_0x001e:
            java.lang.String r0 = r9.getString(r0)
        L_0x0022:
            return r0
        L_0x0023:
            X.2FW r0 = X.2FW.A0q
            if (r0 == r12) goto L_0x002b
            X.2FW r0 = X.2FW.A1j
            if (r0 != r12) goto L_0x0061
        L_0x002b:
            if (r11 == 0) goto L_0x0061
            if (r13 == 0) goto L_0x0061
            int r0 = r13.intValue()
            if (r0 <= 0) goto L_0x0061
            int r0 = r11.ordinal()
            if (r0 == r3) goto L_0x004f
            if (r0 == r2) goto L_0x0049
            if (r0 != r4) goto L_0x0061
            if (r19 == 0) goto L_0x0055
            r0 = 2131960705(0x7f132381, float:1.9558086E38)
        L_0x0044:
            java.lang.String r0 = X.DbW.A0h(r9, r13, r0)
            return r0
        L_0x0049:
            if (r19 == 0) goto L_0x0059
            r0 = 2131960704(0x7f132380, float:1.9558084E38)
            goto L_0x0044
        L_0x004f:
            if (r19 == 0) goto L_0x005d
            r0 = 2131960703(0x7f13237f, float:1.9558082E38)
            goto L_0x0044
        L_0x0055:
            r0 = 2131960389(0x7f132245, float:1.9557445E38)
            goto L_0x001e
        L_0x0059:
            r0 = 2131960388(0x7f132244, float:1.9557443E38)
            goto L_0x001e
        L_0x005d:
            r0 = 2131960387(0x7f132243, float:1.9557441E38)
            goto L_0x001e
        L_0x0061:
            r0 = r17
            java.lang.String r8 = X.AnonymousClass7F5.A00(r9, r0)
            r9 = 2
            if (r21 == 0) goto L_0x007b
            r1 = 2131964456(0x7f133228, float:1.9565694E38)
            r0 = 2131959745(0x7f131fc1, float:1.955614E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r8 = X.DbV.A0u(r7, r8, r0, r1)
            X.0qQ.A0A(r8)
        L_0x007b:
            if (r14 == 0) goto L_0x0148
            if (r16 == 0) goto L_0x00c9
            long r3 = r16.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00c9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009a
            r0 = 2131960910(0x7f13244e, float:1.9558502E38)
            if (r20 == 0) goto L_0x0095
            r0 = 2131960909(0x7f13244d, float:1.95585E38)
        L_0x0095:
            java.lang.String r0 = X.DbY.A0c(r7, r8, r0)
            return r0
        L_0x009a:
            java.lang.Long[] r0 = new java.lang.Long[]{r14, r15}
            X.0qQ.A0B(r0, r6)
            java.util.List r0 = X.03t.A0I(r0)
            java.util.Iterator r3 = r0.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0142
            java.lang.Object r2 = r3.next()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x00b5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x00b5
            r2 = r1
            goto L_0x00b5
        L_0x00c9:
            long r0 = r14.longValue()
            goto L_0x00d2
        L_0x00ce:
            long r0 = X.AnonymousClass7TE.A0R(r2)
        L_0x00d2:
            X.0qQ.A0B(r8, r10)
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r2 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r2 == 0) goto L_0x0115
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r4 = 0
            long r0 = java.lang.Math.max(r4, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r15 = r2.toSeconds(r0)
            long r13 = r2.toMinutes(r0)
            long r2 = r2.toHours(r0)
            r11 = 24
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0116
            double r0 = (double) r2
            r11 = 4627448617123184640(0x4038000000000000, double:24.0)
            double r0 = r0 / r11
            int r0 = X.AnonymousClass1GB.A00(r0)
            if (r0 <= 0) goto L_0x0116
            r4 = 2131960953(0x7f132479, float:1.955859E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r6] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x010d:
            r1[r10] = r0
        L_0x010f:
            java.lang.String r0 = r7.getString(r4, r1)
            if (r0 != 0) goto L_0x0022
        L_0x0115:
            return r8
        L_0x0116:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0126
            r4 = 2131960954(0x7f13247a, float:1.9558591E38)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r0}
            goto L_0x010f
        L_0x0126:
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            r4 = 2131960955(0x7f13247b, float:1.9558593E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r6] = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            goto L_0x010d
        L_0x0136:
            r4 = 2131960956(0x7f13247c, float:1.9558595E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r6] = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            goto L_0x010d
        L_0x0142:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0148:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70027Nw5.A00(android.content.Context, X.7Fa, X.4k3, X.2FW, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, long, boolean, boolean, boolean):java.lang.String");
    }
}
