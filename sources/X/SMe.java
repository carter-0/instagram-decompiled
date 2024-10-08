package X;

public final class SMe {
    public static final SMe A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x012d, code lost:
        if (r17.getRawY() >= ((float) r2)) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x021b, code lost:
        if (X.00l.A0d(r1, "realme", false) == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0223, code lost:
        if (android.os.Build.VERSION.SDK_INT < 30) goto L_0x01b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.Context r16, android.view.MotionEvent r17, android.view.MotionEvent r18, com.instagram.common.session.UserSession r19, X.C309426Yf r20) {
        /*
            X.0Tu r5 = X.0Tu.A05
            r0 = 36316400917352775(0x81059300331147, double:3.029976402318243E-306)
            r6 = r19
            boolean r0 = X.182.A06(r5, r6, r0)
            r7 = r16
            if (r0 == 0) goto L_0x0079
            r0 = 36316400917287238(0x81059300321146, double:3.0299764022767974E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0079
            r16 = 1
            int r3 = X.0nA.A09(r7)
            int r2 = X.0nA.A08(r7)
            r0 = 37160825845645456(0x84059300170090, double:3.563994127196799E-306)
            double r12 = X.182.A00(r5, r6, r0)
            r0 = 37160825845579919(0x8405930016008f, double:3.563994127155353E-306)
            double r8 = X.182.A00(r5, r6, r0)
            r0 = 37160825845514382(0x8405930015008e, double:3.5639941271139074E-306)
            double r0 = X.182.A00(r5, r6, r0)
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 - r0
            double r0 = (double) r3
            double r8 = r8 * r0
            int r3 = (int) r8
            double r0 = r0 * r12
            int r4 = (int) r0
            double r0 = (double) r2
            double r0 = r0 * r10
            int r2 = (int) r0
            float r1 = r17.getRawY()
            float r0 = r18.getRawY()
            float r1 = X.AnonymousClass7TE.A00(r1, r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0164
            float r1 = r17.getRawX()
            float r0 = (float) r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0164
            float r1 = r17.getRawX()
            float r0 = (float) r3
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0164
            float r1 = r17.getRawY()
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0164
        L_0x0078:
            return r16
        L_0x0079:
            r0 = 36316400918794576(0x81059300491150, double:3.029976403230044E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0095
            float r1 = r17.getRawY()
            float r0 = r18.getRawY()
            float r1 = r1 - r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r16 = X.AnonymousClass7TF.A1R(r0)
            return r16
        L_0x0095:
            r0 = 37160825844465799(0x84059300050087, double:3.563994126450779E-306)
            double r8 = X.182.A00(r5, r6, r0)
            r0 = 37160825844334725(0x84059300030085, double:3.5639941263678875E-306)
            double r2 = X.182.A00(r5, r6, r0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = 37160825844400262(0x84059300040086, double:3.5639941264093334E-306)
            double r0 = X.182.A00(r5, r6, r0)
            double r11 = r14 - r0
            int r0 = X.0nA.A09(r7)
            int r4 = X.0nA.A08(r7)
            double r0 = (double) r0
            double r2 = r2 * r0
            int r10 = (int) r2
            double r0 = r0 * r8
            int r8 = (int) r0
            double r0 = (double) r4
            double r0 = r0 * r11
            int r4 = (int) r0
            float r1 = r17.getRawY()
            float r0 = r18.getRawY()
            float r13 = X.AnonymousClass7TE.A00(r1, r0)
            r0 = 36597875891833885(0x82059300110c1d, double:3.2079823095888455E-306)
            int r9 = X.DbS.A04(r5, r6, r0)
            r16 = 0
            if (r9 <= 0) goto L_0x0141
            r0 = 36316400915255609(0x81059300131139, double:3.029976400991987E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x012f
            r0 = 37160825845645456(0x84059300170090, double:3.563994127196799E-306)
            double r11 = X.182.A00(r5, r6, r0)
            r0 = 37160825845579919(0x8405930016008f, double:3.563994127155353E-306)
            double r2 = X.182.A00(r5, r6, r0)
            r0 = 37160825845514382(0x8405930015008e, double:3.5639941271139074E-306)
            double r0 = X.182.A00(r5, r6, r0)
            double r14 = r14 - r0
            int r0 = X.0nA.A09(r7)
            int r6 = X.0nA.A08(r7)
            double r0 = (double) r0
            double r2 = r2 * r0
            int r5 = (int) r2
            double r0 = r0 * r11
            int r3 = (int) r0
            double r0 = (double) r6
            double r0 = r0 * r14
            int r2 = (int) r0
            float r1 = r17.getRawX()
            float r0 = (float) r3
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x012f
            float r1 = r17.getRawX()
            float r0 = (float) r5
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x012f
            float r1 = r17.getRawY()
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0141
        L_0x012f:
            float r2 = X.0nA.A04(r7, r9)
            float r1 = r17.getRawY()
            float r0 = r18.getRawY()
            float r1 = r1 - r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0141
            return r16
        L_0x0141:
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            float r1 = r17.getRawX()
            float r0 = (float) r8
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            float r1 = r17.getRawX()
            float r0 = (float) r10
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0078
            float r1 = r17.getRawY()
            float r0 = (float) r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            r16 = 1
            return r16
        L_0x0164:
            r0 = r20
            double r3 = X.C55100Hc9.A00(r6, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x019d
            r0 = 37160825850560680(0x840593006200a8, double:3.5639941303052066E-306)
            double r1 = X.182.A00(r5, r6, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x019d
            r0 = 36597875891833885(0x82059300110c1d, double:3.2079823095888455E-306)
            int r1 = X.DbS.A04(r5, r6, r0)
            float r2 = r17.getRawY()
            float r0 = r18.getRawY()
            float r2 = r2 - r0
            float r1 = X.0nA.A04(r7, r1)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0226
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
        L_0x019a:
            if (r0 < 0) goto L_0x0226
            return r16
        L_0x019d:
            r0 = 36597875893865509(0x82059300300c25, double:3.207982310873653E-306)
            int r2 = X.DbS.A04(r5, r6, r0)
            int r1 = X.AnonymousClass0Ke.A00(r7)
            r0 = -1
            if (r1 == r0) goto L_0x01e2
            r0 = 2016(0x7e0, float:2.825E-42)
            if (r1 >= r0) goto L_0x01e2
        L_0x01b1:
            r4 = 1
        L_0x01b2:
            r3 = 0
            if (r4 == 0) goto L_0x01cc
            r0 = 36316400918401355(0x8105930043114b, double:3.0299764029813695E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x01cc
            r0 = 37160825848594594(0x840593004400a2, double:3.563994129061846E-306)
            double r3 = X.182.A00(r5, r6, r0)
            double r0 = (double) r2
            double r0 = r0 * r3
            int r3 = (int) r0
        L_0x01cc:
            int r2 = r2 + r3
            float r3 = r17.getRawY()
            float r0 = r18.getRawY()
            float r3 = r3 - r0
            float r1 = X.0nA.A04(r7, r2)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0226
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            goto L_0x019a
        L_0x01e2:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r3 = 0
            if (r1 == 0) goto L_0x021e
            java.util.Locale r0 = java.util.Locale.US
            X.0qQ.A08(r0)
            java.lang.String r1 = X.DbT.A12(r0, r1)
            java.lang.String r0 = "xiaomi"
            boolean r0 = X.00l.A0d(r1, r0, r3)
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "redmi"
            boolean r0 = X.00l.A0d(r1, r0, r3)
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "vivo"
            boolean r0 = X.00l.A0d(r1, r0, r3)
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "oppo"
            boolean r0 = X.00l.A0d(r1, r0, r3)
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "realme"
            boolean r0 = X.00l.A0d(r1, r0, r3)
            if (r0 == 0) goto L_0x021e
            goto L_0x01b1
        L_0x021e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            r4 = 0
            if (r1 >= r0) goto L_0x01b2
            goto L_0x01b1
        L_0x0226:
            r16 = 0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMe.A00(android.content.Context, android.view.MotionEvent, android.view.MotionEvent, com.instagram.common.session.UserSession, X.6Yf):boolean");
    }
}
