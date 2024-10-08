package X;

/* renamed from: X.EbV  reason: case insensitive filesystem */
public abstract class C48250EbV {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r4 = r10.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent A00(android.content.Context r18, X.Et8 r19, java.lang.String r20, java.util.Map r21) {
        /*
            r17 = this;
            r8 = r19
            r7 = 0
            r6 = 2
            java.util.List r0 = X.C47281Du9.A02
            java.util.Iterator r16 = r0.iterator()
        L_0x000a:
            boolean r0 = r16.hasNext()
            r9 = 0
            if (r0 == 0) goto L_0x023e
            java.lang.Object r15 = r16.next()
            r5 = r20
            r3 = r18
            android.content.Intent r13 = X.FHE.A0G(r3, r5)
            if (r13 == 0) goto L_0x000a
            java.lang.String r12 = "access_scope"
            boolean r0 = r13.hasExtra(r12)
            r11 = 0
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r13.getStringExtra(r12)
            if (r0 == 0) goto L_0x0032
            X.EVT r11 = X.EVT.valueOf(r0)
        L_0x0032:
            java.lang.String r14 = "access_domains"
            java.util.List r4 = X.F41.A00(r13, r14)
            if (r11 != 0) goto L_0x01c8
            X.EVT r2 = X.EVT.SAME_APP
            X.0sn r1 = X.0sn.A00
            X.0qQ.A0B(r1, r6)
            X.Eym r0 = new X.Eym
            r0.<init>(r2, r4, r1, r1)
        L_0x0046:
            r13.removeExtra(r12)
            r13.removeExtra(r14)
            java.lang.String r2 = "access_fbpermissions"
            r13.removeExtra(r2)
            java.lang.String r2 = "access_fbpermissions_allow_single"
            r13.removeExtra(r2)
            X.Evl r10 = new X.Evl
            r10.<init>(r13, r0)
            r12 = r21
            if (r21 == 0) goto L_0x0098
            android.content.Intent r4 = r10.A00
            android.content.ComponentName r11 = r4.getComponent()
            if (r11 == 0) goto L_0x0098
            java.lang.String r0 = "route_name"
            java.lang.String r2 = r4.getStringExtra(r0)
            if (r2 == 0) goto L_0x0075
            boolean r0 = X.00l.A0W(r2)
            if (r0 == 0) goto L_0x007c
        L_0x0075:
            java.lang.String r2 = r11.getClassName()
            X.0qQ.A07(r2)
        L_0x007c:
            boolean r0 = r12.containsKey(r2)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r2 = r12.get(r2)
            X.EVT r2 = (X.EVT) r2
            if (r2 == 0) goto L_0x0098
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.Eym r0 = new X.Eym
            r0.<init>(r2, r1, r1, r1)
            X.Evl r10 = new X.Evl
            r10.<init>(r4, r0)
        L_0x0098:
            android.content.Intent r4 = r10.A00
            X.Eym r1 = r10.A01
            boolean r2 = r8 instanceof X.C47279Du7
            if (r2 == 0) goto L_0x0127
            r10 = r8
            X.Du7 r10 = (X.C47279Du7) r10
            X.EVT r0 = r1.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x00ce;
                case 2: goto L_0x0165;
                case 3: goto L_0x00f4;
                case 4: goto L_0x0181;
                case 5: goto L_0x00b1;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b1:
            java.util.List r1 = r1.A01
            X.0cS r11 = new X.0cS
            r11.<init>()
            r11.A01()
            X.0Pj r0 = X.0cQ.A00()
            r11.A01 = r0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0175
            java.util.ArrayList r0 = r11.A02
            r0.addAll(r1)
            goto L_0x0175
        L_0x00ce:
            java.util.List r12 = r1.A01
            java.util.List r1 = r1.A02
            X.0cS r11 = new X.0cS
            r11.<init>()
            java.util.ArrayList r0 = r11.A02
            r0.addAll(r12)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0220
            java.util.Iterator r1 = r1.iterator()
        L_0x00e6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            r11.A05(r0)
            goto L_0x00e6
        L_0x00f4:
            java.util.List r1 = r1.A01
            boolean r0 = r1.isEmpty()
            X.0cS r11 = new X.0cS
            if (r0 == 0) goto L_0x011e
            r11.<init>()
        L_0x0101:
            r11.A01()
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
            java.lang.String r0 = r3.getPackageName()
            X.0PH r0 = X.0cB.A01(r3, r0)
            r1.add(r0)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r1)
            X.0Pj r0 = X.0cQ.A02(r0)
            r11.A01 = r0
            goto L_0x0175
        L_0x011e:
            r11.<init>()
            java.util.ArrayList r0 = r11.A02
            r0.addAll(r1)
            goto L_0x0101
        L_0x0127:
            r0 = r8
            X.Du8 r0 = (X.C47280Du8) r0
            X.EVT r9 = r1.A00
            X.EVT r11 = r0.A00
            java.util.List r10 = r1.A01
            java.util.List r1 = r0.A00
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0152
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000a
            java.util.Iterator r1 = r1.iterator()
        L_0x0142:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000a
            java.lang.Object r0 = r1.next()
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x0142
        L_0x0152:
            int r0 = r11.ordinal()
            switch(r0) {
                case 2: goto L_0x0181;
                case 3: goto L_0x015e;
                default: goto L_0x0159;
            }
        L_0x0159:
            X.EVT r0 = X.EVT.PUBLIC
        L_0x015b:
            if (r9 != r0) goto L_0x000a
            goto L_0x0181
        L_0x015e:
            X.EVT r0 = X.EVT.SAME_APP
            if (r9 == r0) goto L_0x0181
            X.EVT r0 = X.EVT.SAME_KEY
            goto L_0x015b
        L_0x0165:
            java.util.List r1 = r1.A01
            boolean r0 = r1.isEmpty()
            X.0cS r11 = new X.0cS
            if (r0 == 0) goto L_0x01bf
            r11.<init>()
        L_0x0172:
            r11.A01()
        L_0x0175:
            X.0cT r1 = r11.A00()
            android.content.Intent r0 = r10.A00
            boolean r0 = r1.A03(r3, r0, r9)
            if (r0 == 0) goto L_0x000a
        L_0x0181:
            if (r2 == 0) goto L_0x01a0
            X.Du7 r8 = (X.C47279Du7) r8
            android.content.Intent r0 = r8.A00
            android.os.Bundle r2 = r0.getExtras()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            if (r2 == 0) goto L_0x01a0
            java.lang.ClassLoader r0 = r3.getClassLoader()
            if (r0 == 0) goto L_0x019a
            r1.setClassLoader(r0)
        L_0x019a:
            r1.putAll(r2)
            r4.putExtras(r1)
        L_0x01a0:
            android.content.ComponentName r0 = r4.getComponent()
            java.lang.String r3 = "UriResolver"
            if (r0 == 0) goto L_0x0226
            android.content.ComponentName r0 = r4.getComponent()
            if (r0 == 0) goto L_0x01b1
            r0.getClassName()
        L_0x01b1:
            java.lang.Class r1 = r15.getClass()
            java.util.Map r0 = X.0Yh.A03
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.0q1.A01(r1)
            return r4
        L_0x01bf:
            r11.<init>()
            java.util.ArrayList r0 = r11.A02
            r0.addAll(r1)
            goto L_0x0172
        L_0x01c8:
            X.EVT r0 = X.EVT.FBPERMISSION
            if (r11 != r0) goto L_0x01e6
            java.lang.String r0 = "access_fbpermissions"
            java.util.List r2 = X.F41.A00(r13, r0)
            java.lang.String r1 = "access_fbpermissions_allow_single"
            boolean r0 = r13.hasExtra(r1)
            if (r0 == 0) goto L_0x01dd
            r13.getBooleanExtra(r1, r7)
        L_0x01dd:
            X.0sn r1 = X.0sn.A00
            X.Eym r0 = new X.Eym
            r0.<init>(r11, r4, r2, r1)
            goto L_0x0046
        L_0x01e6:
            X.EVT r0 = X.EVT.APP_SET
            if (r11 != r0) goto L_0x0214
            java.lang.String r0 = "app_set"
            java.util.List r10 = X.F41.A00(r13, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            int r2 = r10.size()
            if (r2 < 0) goto L_0x020b
            r1 = 0
        L_0x01fb:
            java.lang.String r0 = X.AnonymousClass7TE.A19(r10, r1)
            X.EUr r0 = X.C48073EUr.valueOf(r0)
            r4.add(r0)
            if (r1 == r2) goto L_0x020b
            int r1 = r1 + 1
            goto L_0x01fb
        L_0x020b:
            X.0sn r1 = X.0sn.A00
            X.Eym r0 = new X.Eym
            r0.<init>(r11, r1, r1, r4)
            goto L_0x0046
        L_0x0214:
            X.0sn r1 = X.0sn.A00
            X.0qQ.A0B(r1, r6)
            X.Eym r0 = new X.Eym
            r0.<init>(r11, r4, r1, r1)
            goto L_0x0046
        L_0x0220:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0226:
            r2 = 1
            java.lang.Class r1 = r15.getClass()
            java.util.Map r0 = X.0Yh.A03
            X.0qQ.A0B(r1, r2)
            java.lang.String r0 = X.0q1.A01(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r0}
            java.lang.String r0 = "ERROR! resolve the empty class from uri %s by Plugin %s"
            X.0KC.A0O(r3, r0, r1)
            return r4
        L_0x023e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48250EbV.A00(android.content.Context, X.Et8, java.lang.String, java.util.Map):android.content.Intent");
    }
}
