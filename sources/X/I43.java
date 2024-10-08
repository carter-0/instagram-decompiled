package X;

public final class I43 {
    public final C53307Glt A00;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r3 != null) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public I43(com.instagram.common.session.UserSession r15) {
        /*
            r14 = this;
            r4 = 1
            X.0qQ.A0B(r15, r4)
            r14.<init>()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36601445011099846(0x8208d2002710c6, double:3.210239434984329E-306)
            int r0 = X.DbS.A04(r2, r15, r0)
            if (r0 != 0) goto L_0x001a
            X.A9A r0 = X.C55069Hbe.A00(r15)
            int r0 = r0.A00
        L_0x001a:
            switch(r0) {
                case 2: goto L_0x0029;
                case 3: goto L_0x002f;
                case 4: goto L_0x0035;
                case 5: goto L_0x003b;
                case 6: goto L_0x0041;
                case 7: goto L_0x0047;
                case 8: goto L_0x004d;
                case 9: goto L_0x0053;
                case 10: goto L_0x0059;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = 36882919987151318(0x8308d2001d01d6, double:3.3882453432480345E-306)
        L_0x0022:
            java.lang.String r3 = X.182.A04(r2, r15, r0)
            java.lang.String r2 = "ClipsSwipePersonalizationWithODMLRepository"
            goto L_0x005f
        L_0x0029:
            r0 = 36882919987216855(0x8308d2001e01d7, double:3.3882453432894803E-306)
            goto L_0x0022
        L_0x002f:
            r0 = 36882919987282392(0x8308d2001f01d8, double:3.388245343330926E-306)
            goto L_0x0022
        L_0x0035:
            r0 = 36882919987347929(0x8308d2002001d9, double:3.388245343372372E-306)
            goto L_0x0022
        L_0x003b:
            r0 = 36882919987413466(0x8308d2002101da, double:3.388245343413818E-306)
            goto L_0x0022
        L_0x0041:
            r0 = 36882919987479003(0x8308d2002201db, double:3.388245343455264E-306)
            goto L_0x0022
        L_0x0047:
            r0 = 36882919987544540(0x8308d2002301dc, double:3.3882453434967097E-306)
            goto L_0x0022
        L_0x004d:
            r0 = 36882919987610077(0x8308d2002401dd, double:3.3882453435381555E-306)
            goto L_0x0022
        L_0x0053:
            r0 = 36882919987675614(0x8308d2002501de, double:3.3882453435796014E-306)
            goto L_0x0022
        L_0x0059:
            r0 = 36882919987741151(0x8308d2002601df, double:3.388245343621047E-306)
            goto L_0x0022
        L_0x005f:
            X.3mC r1 = X.C250863mB.A03     // Catch:{ Exception -> 0x006e }
            kotlinx.serialization.json.JsonElementSerializer r0 = kotlinx.serialization.json.JsonElementSerializer.A00     // Catch:{ Exception -> 0x006e }
            java.lang.Object r0 = r1.A00(r3, r0)     // Catch:{ Exception -> 0x006e }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ Exception -> 0x006e }
            kotlinx.serialization.json.JsonArray r3 = X.C271114hv.A02(r0)     // Catch:{ Exception -> 0x006e }
            goto L_0x0088
        L_0x006e:
            r3 = move-exception
            X.0wj r1 = X.0wj.A01
            r0 = 817902720(0x30c03480, float:1.398476E-9)
            X.0f9 r2 = r1.AEf(r2, r0)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Failed to parse swipe personalization data"
            X.AnonymousClass7TF.A19(r2, r1, r0, r3)
            r3 = 0
        L_0x0080:
            r10 = 2000(0x7d0, double:9.88E-321)
            if (r3 == 0) goto L_0x0085
            goto L_0x009f
        L_0x0085:
            r12 = 8000(0x1f40, double:3.9525E-320)
            goto L_0x00b5
        L_0x0088:
            r0 = 0
            java.lang.Object r0 = X.00k.A0O(r3, r0)
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0080
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0080
            long r10 = r0.longValue()
        L_0x009f:
            java.lang.Object r0 = X.00k.A0O(r3, r4)
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0085
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0085
            long r12 = r0.longValue()
        L_0x00b5:
            r2 = 2
            X.GO6 r4 = A00(r3, r2)
            r1 = 3
            X.GO6 r5 = A00(r3, r1)
            r0 = 4
            X.GO6 r6 = A00(r3, r0)
            X.Glb r7 = A01(r15, r3, r2)
            X.Glb r8 = A01(r15, r3, r1)
            X.Glb r9 = A01(r15, r3, r0)
            X.Glt r3 = new X.Glt
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12)
            r14.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I43.<init>(com.instagram.common.session.UserSession):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r1 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a5, code lost:
        if (r1 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
        if (r1 != null) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.GO6 A00(kotlinx.serialization.json.JsonArray r11, int r12) {
        /*
            if (r11 == 0) goto L_0x0038
            java.util.List r0 = r11.A00
            java.lang.Object r0 = r0.get(r12)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x0038
            kotlinx.serialization.json.JsonArray r0 = X.C271114hv.A02(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0018:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r2.next()
            X.DbU.A1X(r0, r1)
            goto L_0x0018
        L_0x0026:
            r0 = 2
            java.lang.String r0 = X.C51966G9m.A1G(r1, r0)
            if (r0 == 0) goto L_0x0039
            java.lang.Double r0 = X.012.A0p(r0)
            if (r0 == 0) goto L_0x0039
            double r2 = r0.doubleValue()
            goto L_0x003d
        L_0x0038:
            r1 = 0
        L_0x0039:
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r1 == 0) goto L_0x00ad
        L_0x003d:
            r0 = 3
            java.lang.String r0 = X.C51966G9m.A1G(r1, r0)
            if (r0 == 0) goto L_0x00ad
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x00ad
            int r0 = r0.intValue()
        L_0x004e:
            int r12 = r0 * 2
            r8 = 0
            if (r1 == 0) goto L_0x00a3
            r0 = 6
            java.lang.String r0 = X.C51966G9m.A1G(r1, r0)
            if (r0 == 0) goto L_0x00a3
            java.lang.Double r0 = X.012.A0p(r0)
            if (r0 == 0) goto L_0x00a3
            double r4 = r0.doubleValue()
        L_0x0065:
            r0 = 7
            java.lang.String r0 = X.C51966G9m.A1G(r1, r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.Double r0 = X.012.A0p(r0)
            if (r0 == 0) goto L_0x00a8
            double r6 = r0.doubleValue()
        L_0x0076:
            r0 = 4
            java.lang.String r0 = X.C51966G9m.A1G(r1, r0)
            if (r0 == 0) goto L_0x0087
            java.lang.Double r0 = X.012.A0p(r0)
            if (r0 == 0) goto L_0x0087
            double r8 = r0.doubleValue()
        L_0x0087:
            if (r1 == 0) goto L_0x00a0
            r0 = 5
            java.lang.String r0 = X.C51966G9m.A1G(r1, r0)
            if (r0 == 0) goto L_0x00a0
            java.lang.Double r0 = X.012.A0p(r0)
            if (r0 == 0) goto L_0x00a0
            double r10 = r0.doubleValue()
        L_0x009a:
            X.GO6 r1 = new X.GO6
            r1.<init>(r2, r4, r6, r8, r10, r12)
            return r1
        L_0x00a0:
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x009a
        L_0x00a3:
            r4 = 0
            if (r1 == 0) goto L_0x00a8
            goto L_0x0065
        L_0x00a8:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 == 0) goto L_0x0087
            goto L_0x0076
        L_0x00ad:
            r0 = 35
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I43.A00(kotlinx.serialization.json.JsonArray, int):X.GO6");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r2 != null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C53289Glb A01(com.instagram.common.session.UserSession r10, kotlinx.serialization.json.JsonArray r11, int r12) {
        /*
            if (r11 == 0) goto L_0x0038
            java.util.List r0 = r11.A00
            java.lang.Object r0 = r0.get(r12)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L_0x0038
            kotlinx.serialization.json.JsonArray r0 = X.C271114hv.A02(r0)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0018:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            X.DbU.A1X(r0, r2)
            goto L_0x0018
        L_0x0026:
            r0 = 0
            java.lang.String r0 = X.C51966G9m.A1G(r2, r0)
            if (r0 == 0) goto L_0x0039
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0039
            int r11 = r0.intValue()
            goto L_0x003c
        L_0x0038:
            r2 = 0
        L_0x0039:
            r11 = 5
            if (r2 == 0) goto L_0x0079
        L_0x003c:
            r0 = 1
            java.lang.String r0 = X.C51966G9m.A1G(r2, r0)
            if (r0 == 0) goto L_0x0079
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0079
            int r12 = r0.intValue()
        L_0x004d:
            X.0Tu r2 = X.0Tu.A06
            r0 = 37164394962223417(0x8408d200040139, double:3.5662512508923805E-306)
            double r3 = X.182.A00(r2, r10, r0)
            r0 = 37164394962354491(0x8408d20006013b, double:3.566251250975272E-306)
            double r5 = X.182.A00(r2, r10, r0)
            r0 = 37164394962288954(0x8408d20005013a, double:3.5662512509338264E-306)
            double r7 = X.182.A00(r2, r10, r0)
            r0 = 37164394962420028(0x8408d20007013c, double:3.566251251016718E-306)
            double r9 = X.182.A00(r2, r10, r0)
            X.Glb r2 = new X.Glb
            r2.<init>(r3, r5, r7, r9, r11, r12)
            return r2
        L_0x0079:
            r12 = 35
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I43.A01(com.instagram.common.session.UserSession, kotlinx.serialization.json.JsonArray, int):X.Glb");
    }
}
