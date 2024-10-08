package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class SP7 {
    public static final String[] A09 = {GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    public int A00 = 0;
    public boolean A01 = false;
    public C8218QkR[] A02;
    public C8218QkR[] A03;
    public C8218QkR[] A04;
    public final C269134ed A05;
    public final boolean A06;
    public final boolean A07;
    public final C8207QkG[] A08 = new C8207QkG[11];

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r7 = r4.A0I(0);
        r6 = r10.A0I(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r7 != r6) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r1 = r10.A09();
        r0 = X.C269574fL.A00;
        r6 = java.lang.Enum.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r6.isAssignableFrom(r1) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if ("valueOf".equals(r10.A05()) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r6.isAssignableFrom(r7) != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r7.isAssignableFrom(r6) != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r7.isPrimitive() == r6.isPrimitive()) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r7.isPrimitive() == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r6.isAssignableFrom(r4.A09()) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if ("valueOf".equals(r4.A05()) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        r1 = A09[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (r12 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r0 = "explicitly marked";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        throw X.Pxf.A0X("Conflicting %s creators: already had %s creator %s, encountered another: %s", new java.lang.Object[]{r1, r0, r4, r10});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a8, code lost:
        r0 = "implicitly discovered";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r12 == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if ((!r12) != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r4.getClass() != r10.getClass()) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C8207QkG r10, int r11, boolean r12) {
        /*
            r9 = this;
            r3 = 1
            int r8 = r3 << r11
            r9.A01 = r3
            X.QkG[] r2 = r9.A08
            r4 = r2[r11]
            if (r4 == 0) goto L_0x007c
            int r0 = r9.A00
            r0 = r0 & r8
            r5 = 0
            if (r0 == 0) goto L_0x0014
            if (r12 != 0) goto L_0x0018
        L_0x0013:
            return r5
        L_0x0014:
            r0 = r12 ^ 1
            if (r0 == 0) goto L_0x007c
        L_0x0018:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r10.getClass()
            if (r1 != r0) goto L_0x007c
            java.lang.Class r7 = r4.A0I(r5)
            java.lang.Class r6 = r10.A0I(r5)
            if (r7 != r6) goto L_0x0048
            java.lang.Class r1 = r10.A09()
            java.util.Iterator r0 = X.C269574fL.A00
            java.lang.Class<java.lang.Enum> r6 = java.lang.Enum.class
            boolean r0 = r6.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = r10.A05()
            java.lang.String r0 = "valueOf"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            return r5
        L_0x0048:
            boolean r0 = r6.isAssignableFrom(r7)
            if (r0 != 0) goto L_0x0013
            boolean r0 = r7.isAssignableFrom(r6)
            if (r0 != 0) goto L_0x007c
            boolean r1 = r7.isPrimitive()
            boolean r0 = r6.isPrimitive()
            if (r1 == r0) goto L_0x0095
            boolean r0 = r7.isPrimitive()
            if (r0 == 0) goto L_0x007c
            return r5
        L_0x0065:
            java.lang.Class r0 = r4.A09()
            boolean r0 = r6.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = r4.A05()
            java.lang.String r0 = "valueOf"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
        L_0x007c:
            if (r12 == 0) goto L_0x0083
            int r0 = r9.A00
            r0 = r0 | r8
            r9.A00 = r0
        L_0x0083:
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x0092
            java.lang.reflect.AnnotatedElement r1 = r10.A07()
            java.lang.reflect.Member r1 = (java.lang.reflect.Member) r1
            boolean r0 = r9.A07
            X.C269574fL.A0H(r1, r0)
        L_0x0092:
            r2[r11] = r10
            return r3
        L_0x0095:
            java.lang.String[] r0 = A09
            r1 = r0[r11]
            if (r12 == 0) goto L_0x00a8
            java.lang.String r0 = "explicitly marked"
        L_0x009d:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r4, r10}
            java.lang.String r0 = "Conflicting %s creators: already had %s creator %s, encountered another: %s"
            java.lang.IllegalArgumentException r0 = X.Pxf.A0X(r0, r1)
            throw r0
        L_0x00a8:
            java.lang.String r0 = "implicitly discovered"
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SP7.A03(X.QkG, int, boolean):boolean");
    }

    public static C268894eF A00(C269674fV r6, SP7 sp7, C8207QkG qkG, C8218QkR[] qkRArr) {
        if (!sp7.A01 || qkG == null) {
            return null;
        }
        int i = 0;
        if (qkRArr != null) {
            int length = qkRArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (qkRArr[i2] == null) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        C269454f9 r3 = r6.A02;
        C268894eF A0G = qkG.A0G(i);
        C268854eA A012 = r3.A01();
        if (A012 == null) {
            return A0G;
        }
        C8202QkB A0H = qkG.A0H(i);
        Object A0Z = A012.A0Z(A0H);
        if (A0Z != null) {
            return A0G.A0F(r6.A0F(A0Z));
        }
        return A012.A0B(A0G, r3, A0H);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r2 = java.lang.Integer.valueOf(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C8207QkG r8, X.C8218QkR[] r9, boolean r10) {
        /*
            r7 = this;
            r0 = 9
            boolean r0 = r7.A03(r8, r0, r10)
            if (r0 == 0) goto L_0x004b
            int r6 = r9.length
            r0 = 1
            if (r6 <= r0) goto L_0x0049
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            r4 = 0
        L_0x0011:
            r0 = r9[r4]
            X.4f7 r0 = r0.A06
            java.lang.String r3 = r0.A02
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x002a
            r0 = r9[r4]
            java.lang.Object r0 = r0.A0B()
            if (r0 == 0) goto L_0x002a
        L_0x0025:
            int r4 = r4 + 1
            if (r4 >= r6) goto L_0x0049
            goto L_0x0011
        L_0x002a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r5.put(r3, r2)
            if (r1 == 0) goto L_0x0025
            X.4ed r0 = r7.A05
            X.4eF r0 = r0.A05
            java.lang.Class r0 = r0.A00
            java.lang.String r0 = X.C269574fL.A06(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r2, r0}
            java.lang.String r0 = "Duplicate creator property \"%s\" (index %s vs %d) for type %s "
            java.lang.IllegalArgumentException r0 = X.Pxf.A0X(r0, r1)
            throw r0
        L_0x0049:
            r7.A04 = r9
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SP7.A02(X.QkG, X.QkR[], boolean):void");
    }

    public SP7(C269144ee r2, C269134ed r3) {
        this.A05 = r3;
        this.A06 = r2.A06();
        this.A07 = r2.A08();
    }

    public final void A01(C8207QkG qkG, C8218QkR[] qkRArr, int i, boolean z) {
        if (qkG.A0G(i).A0M()) {
            if (A03(qkG, 10, z)) {
                this.A02 = qkRArr;
            }
        } else if (A03(qkG, 8, z)) {
            this.A03 = qkRArr;
        }
    }
}
