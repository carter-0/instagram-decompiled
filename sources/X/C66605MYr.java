package X;

/* renamed from: X.MYr  reason: case insensitive filesystem */
public final /* synthetic */ class C66605MYr implements Runnable {
    public final /* synthetic */ 2DU A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C66605MYr(2DU r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r1 = r21
            X.2DU r5 = r1.A00
            java.lang.String r0 = r1.A01
            r20 = r0
            boolean r0 = r1.A02
            r19 = r0
            com.instagram.common.session.UserSession r4 = r5.A09
            X.0Tu r6 = X.0Tu.A05
            r0 = 36324307948875738(0x810cc400012fda, double:3.0349768408924254E-306)
            boolean r18 = X.182.A06(r6, r4, r0)
            r3 = 1
            X.MYx r0 = X.C66612MYy.A00
            boolean r0 = r0.A02(r4, r3)
            if (r0 == 0) goto L_0x0027
            X.0wX r0 = r4.A03
            X.C300375x2.A00(r0)
        L_0x0027:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0047
            r5.A02 = r3
            java.lang.String r1 = "DirectUserScopedInitializer.initializePlatformStorage"
            r0 = 2067113502(0x7b35a61e, float:9.43175E35)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x003b }
            android.content.Context r0 = r5.A07     // Catch:{ all -> 0x003b }
            com.facebook.advancedcryptotransport.PlatformStorageProvider.initialize(r0)     // Catch:{ all -> 0x003b }
            goto L_0x0041
        L_0x003b:
            r1 = move-exception
            r0 = 1554555555(0x5ca8a2a3, float:3.79732936E17)
            goto L_0x0458
        L_0x0041:
            r0 = 1942970140(0x73cf5f1c, float:3.285933E31)
            X.0fh.A00(r0)
        L_0x0047:
            java.lang.String r1 = "DirectUserScopedInitializer.maybeInitializeArmadilloExpress"
            r0 = -2127423062(0xffffffff813219aa, float:-3.271185E-38)
            X.0fh.A01(r1, r0)
            r2 = 0
            X.0qQ.A0B(r4, r2)
            r0 = 2342161901210704514(0x208107d7001e1a82, double:4.064646387691594E-152)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 != 0) goto L_0x0064
            boolean r0 = X.C308556Us.A05(r4)
            if (r0 == 0) goto L_0x0164
        L_0x0064:
            r0 = 49
            X.Pm1 r1 = X.C73921Pm1.A00(r4, r0)
            java.lang.Class<X.MZ0> r0 = X.MZ0.class
            java.lang.Object r15 = r4.A01(r0, r1)
            X.MZ0 r15 = (X.MZ0) r15
            com.instagram.common.session.UserSession r14 = r15.A00
            r0 = 48
            X.Pm1 r1 = X.C73921Pm1.A00(r14, r0)
            java.lang.Class<X.MYz> r0 = X.C66613MYz.class
            java.lang.Object r8 = r14.A01(r0, r1)
            X.MYz r8 = (X.C66613MYz) r8
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A0D
            X.0xa r0 = X.C51969G9p.A0n(r1, r0, r8)
            java.util.Map r0 = r0.getAll()
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r0)
        L_0x009a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r8 = r9.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x00c3 }
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00c3 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00c3 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x009a
        L_0x00c3:
            r1 = move-exception
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
            goto L_0x009a
        L_0x00ca:
            java.util.Iterator r17 = X.AnonymousClass7TF.A0s(r7)
        L_0x00ce:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0164
            java.lang.Object r7 = r17.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Object r9 = r7.getValue()
            java.lang.String r9 = (java.lang.String) r9
            X.0rm r13 = new X.0rm
            r13.<init>()
            r13.A00 = r9
            java.lang.String r8 = ":"
            boolean r7 = X.00l.A0d(r9, r8, r2)
            r16 = 15
            if (r7 == 0) goto L_0x0116
            java.lang.String[] r7 = new java.lang.String[]{r8}     // Catch:{ Exception -> 0x0114 }
            java.util.List r8 = X.00l.A0R(r9, r7, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r7 = r8.get(r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0114 }
            int r12 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r7 = r8.get(r3)     // Catch:{ Exception -> 0x0114 }
            r13.A00 = r7     // Catch:{ Exception -> 0x0114 }
            goto L_0x0118
        L_0x0114:
            r13.A00 = r9
        L_0x0116:
            r12 = 15
        L_0x0118:
            X.OO2 r8 = X.O0F.A00(r14)
            java.lang.Object r11 = r13.A00
            java.lang.String r11 = (java.lang.String) r11
            X.0qQ.A0B(r11, r2)
            java.util.Set r7 = r8.A04
            r7.add(r11)
            X.OZu r10 = r8.A01
            boolean r7 = X.C71033OZu.A01(r10, r11)
            if (r7 != 0) goto L_0x013d
            X.02m r7 = r10.A00
            r9 = r7
            r8 = 724174487(0x2b2a0697, float:6.040528E-13)
            int r7 = X.C71033OZu.A00(r10, r11)
            r9.markerStart(r8, r7, r2)
        L_0x013d:
            java.lang.String r7 = "thread_fetch_start"
            r10.A02(r11, r7)
            java.lang.String r7 = "message_otid"
            r10.A03(r11, r7, r11)
            X.PDr r10 = new X.PDr
            r10.<init>(r15, r13, r0)
            X.0eM r7 = r15.A02
            java.lang.Object r9 = r7.getValue()
            X.OMV r9 = (X.OMV) r9
            com.instagram.direct.perf.constants.ThreadFetchReason r8 = com.instagram.direct.perf.constants.ThreadFetchReason.AE_MISSING_THREAD_IN_THREAD_STORE
            r7 = r16
            if (r12 != r7) goto L_0x015f
            r9.A00(r8, r10, r0)
            goto L_0x00ce
        L_0x015f:
            r9.A01(r8, r10, r0)
            goto L_0x00ce
        L_0x0164:
            r0 = 36327666613369444(0x810fd200023a64, double:3.0371008738425015E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x017c
            X.C370748x0.A00()
            r0 = 3
            X.Plo r1 = X.C73913Plo.A00(r4, r0)
            java.lang.Class<X.OyQ> r0 = X.C72201OyQ.class
            r4.A01(r0, r1)
        L_0x017c:
            X.MZ6 r0 = X.MZ6.A00
            X.MZ2.A00 = r0
            X.MZ4 r0 = X.MZ4.A00
            X.MZ3.A00 = r0
            X.MZ5 r0 = X.MZ5.A00
            X.AnonymousClass4OF.A00 = r0
            r0 = 36318892004154069(0x8107d7008b1ad5, double:3.031551775642183E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x01af
            r0 = 8
            X.MMO r1 = new X.MMO
            r1.<init>(r4, r0)
            java.lang.Class<X.OL4> r0 = X.OL4.class
            java.lang.Object r8 = r4.A01(r0, r1)
            X.OL4 r8 = (X.OL4) r8
            X.2Dm r0 = r8.A02
            X.2Dr r0 = (X.2Dr) r0
            X.1bC r0 = r0.A0H
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x01f6
            r8.A00()
        L_0x01af:
            r0 = 946767252(0x386e8594, float:5.6868026E-5)
            X.0fh.A00(r0)
            if (r18 != 0) goto L_0x01ba
            X.2DU.A02(r5)
        L_0x01ba:
            X.0wX r0 = X.C61170le.A00
            X.18g r0 = X.C638918c.A01(r0)
            boolean r0 = r0.A0M
            com.facebook.advancedcryptotransport.AppInstallContext.mIsApplicationFirstRunOnUpgrade = r0
            java.lang.String r1 = "DirectUserScopedInitializer.maybeInitializeACT"
            r0 = -573534196(0xffffffffddd0900c, float:-1.87856564E18)
            X.0fh.A01(r1, r0)
            X.1a3 r1 = X.C65011a4.A00()
            r0 = r20
            r1.initialize(r4, r0)
            X.1a3 r1 = X.C65011a4.A00()
            r1.maybeInitializeACT(r4, r0)
            r0 = -1886478546(0xffffffff8f8e9f2e, float:-1.4063595E-29)
            X.0fh.A00(r0)
            boolean r0 = X.AnonymousClass5HM.A01(r4)
            if (r0 == 0) goto L_0x0224
            X.0Tu r7 = X.0Tu.A06
            r0 = 2342157872530983785(0x2081042d00180b69, double:4.061230409031727E-152)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x0224
            goto L_0x0203
        L_0x01f6:
            X.1Ng r7 = r8.A00
            java.lang.Class<X.2KZ> r1 = X.AnonymousClass2KZ.class
            r0 = 4
            X.OtG r0 = X.C71932OtG.A00(r8, r0)
            r7.A01(r0, r1)
            goto L_0x01af
        L_0x0203:
            java.lang.String r1 = "DirectUserScopedInitializer.maybeInitializeNotificationEngineSyncPathIntegrator"
            r0 = 1841487534(0x6dc2deae, float:7.538662E27)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x0454 }
            r0 = 35
            X.Plm r1 = X.C73911Plm.A00(r4, r0)     // Catch:{ all -> 0x0454 }
            java.lang.Class<com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator> r0 = com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator.class
            java.lang.Object r1 = r4.A01(r0, r1)     // Catch:{ all -> 0x0454 }
            com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator r1 = (com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator) r1     // Catch:{ all -> 0x0454 }
            r0 = r20
            r1.initialize(r0)     // Catch:{ all -> 0x0454 }
            r0 = -473301499(0xffffffffe3c9fe05, float:-7.452199E21)
            X.0fh.A00(r0)
        L_0x0224:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x02b3
            if (r19 == 0) goto L_0x02b3
            java.lang.String r1 = "DirectUserScopedInitializer.initializeArmadilloNotificationBadge"
            r0 = 1194076803(0x472c2a83, float:44074.51)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x02a7 }
            r5.A00 = r3     // Catch:{ all -> 0x02a7 }
            r0 = 17
            X.PhW r1 = new X.PhW     // Catch:{ all -> 0x02a7 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x02a7 }
            java.lang.Class<X.MZg> r0 = X.C66619MZg.class
            java.lang.Object r9 = r4.A01(r0, r1)     // Catch:{ all -> 0x02a7 }
            X.MZg r9 = (X.C66619MZg) r9     // Catch:{ all -> 0x02a7 }
            X.1a8 r7 = r9.A00     // Catch:{ all -> 0x02a7 }
            X.MYk r8 = r9.A02     // Catch:{ all -> 0x02a7 }
            X.1aS r1 = r8.A01     // Catch:{ all -> 0x02a7 }
            X.MZh r0 = new X.MZh     // Catch:{ all -> 0x02a7 }
            r0.<init>(r9)     // Catch:{ all -> 0x02a7 }
            X.1aU r1 = r1.A0L(r0)     // Catch:{ all -> 0x02a7 }
            X.MZi r0 = new X.MZi     // Catch:{ all -> 0x02a7 }
            r0.<init>(r9)     // Catch:{ all -> 0x02a7 }
            r7.A02(r1, r0)     // Catch:{ all -> 0x02a7 }
            boolean r0 = r8.A00     // Catch:{ all -> 0x02a7 }
            if (r0 != 0) goto L_0x02ad
            X.0sa r0 = r8.A04     // Catch:{ all -> 0x02a7 }
            java.lang.Object r10 = r0.invoke()     // Catch:{ all -> 0x02a7 }
            X.MYb r10 = (X.MYb) r10     // Catch:{ all -> 0x02a7 }
            com.instagram.common.session.UserSession r7 = r8.A03     // Catch:{ all -> 0x02a7 }
            r0 = 36315773849374238(0x81050100090e1e, double:3.0295798420036164E-306)
            boolean r0 = X.182.A06(r6, r7, r0)     // Catch:{ all -> 0x02a7 }
            if (r0 == 0) goto L_0x027e
            X.1a8 r7 = r8.A02     // Catch:{ all -> 0x02a7 }
            X.1aU r1 = X.C66598MYk.A00(r8, r10)     // Catch:{ all -> 0x02a7 }
            X.0sP r0 = r8.A05     // Catch:{ all -> 0x02a7 }
            X.PUD.A00(r1, r7, r0, r2)     // Catch:{ all -> 0x02a7 }
        L_0x027e:
            X.1a8 r9 = r8.A02     // Catch:{ all -> 0x02a7 }
            X.1aU r7 = X.MYb.A00(r10)     // Catch:{ all -> 0x02a7 }
            X.6ES r1 = X.AnonymousClass6ES.A00     // Catch:{ all -> 0x02a7 }
            X.MZk r0 = new X.MZk     // Catch:{ all -> 0x02a7 }
            r0.<init>(r1)     // Catch:{ all -> 0x02a7 }
            X.1aU r7 = r7.A0N(r0)     // Catch:{ all -> 0x02a7 }
            r0 = 26
            X.PqX r1 = new X.PqX     // Catch:{ all -> 0x02a7 }
            r1.<init>((int) r0, (java.lang.Object) r10, (java.lang.Object) r8)     // Catch:{ all -> 0x02a7 }
            X.MZl r0 = new X.MZl     // Catch:{ all -> 0x02a7 }
            r0.<init>(r1)     // Catch:{ all -> 0x02a7 }
            X.1aU r1 = r7.A0M(r0)     // Catch:{ all -> 0x02a7 }
            X.0sP r0 = r8.A05     // Catch:{ all -> 0x02a7 }
            X.PUD.A00(r1, r9, r0, r2)     // Catch:{ all -> 0x02a7 }
            r8.A00 = r3     // Catch:{ all -> 0x02a7 }
            goto L_0x02ad
        L_0x02a7:
            r1 = move-exception
            r0 = -178432703(0xfffffffff55d5541, float:-2.8057294E32)
            goto L_0x0458
        L_0x02ad:
            r0 = 2086330973(0x7c5ae25d, float:4.5460476E36)
            X.0fh.A00(r0)
        L_0x02b3:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x02e3
            r0 = 36313403026900908(0x8102d9000107ac, double:3.0280805243249467E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 != 0) goto L_0x0301
            r0 = 36313403026835371(0x8102d9000007ab, double:3.028080524283501E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 != 0) goto L_0x0301
            boolean r0 = X.C265504Uf.A01(r4)
            if (r0 != 0) goto L_0x0301
            boolean r0 = X.C265504Uf.A00(r4)
            if (r0 != 0) goto L_0x0301
            X.2HN r0 = X.2HM.A00(r4)
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0301
        L_0x02e3:
            if (r18 == 0) goto L_0x02e8
            X.2DU.A02(r5)
        L_0x02e8:
            X.2HN r0 = X.2HM.A00(r4)
            X.2HR r0 = r0.A0g
            boolean r0 = X.DbX.A1Z(r0)
            if (r0 != 0) goto L_0x030e
            X.2HN r0 = X.2HM.A00(r4)
            X.2HR r0 = r0.A0U
            boolean r0 = X.DbX.A1Z(r0)
            if (r0 == 0) goto L_0x036c
            goto L_0x030e
        L_0x0301:
            r5.A01 = r3
            X.1Hb r1 = X.AnonymousClass1HI.A02
            X.NSi r0 = new X.NSi
            r0.<init>(r5)
            r1.Eym(r0)
            goto L_0x02e3
        L_0x030e:
            java.lang.String r1 = "DirectUserScopedInitializer.maybeInitializeArmadilloCallingEvents"
            r0 = 412438725(0x189550c5, float:3.8597154E-24)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x044f }
            r0 = 8
            X.Plo r1 = X.C73913Plo.A00(r4, r0)     // Catch:{ all -> 0x044f }
            java.lang.Class<X.6EX> r0 = X.AnonymousClass6EX.class
            java.lang.Object r9 = r4.A01(r0, r1)     // Catch:{ all -> 0x044f }
            X.6EX r9 = (X.AnonymousClass6EX) r9     // Catch:{ all -> 0x044f }
            boolean r0 = r9.A00     // Catch:{ all -> 0x044f }
            java.lang.String r7 = "MailboxAdminMessageHandler"
            if (r0 == 0) goto L_0x0330
            java.lang.String r0 = "Should only be initialized once"
            X.0KC.A0C(r7, r0)     // Catch:{ all -> 0x044f }
            goto L_0x0366
        L_0x0330:
            com.instagram.common.session.UserSession r6 = r9.A02     // Catch:{ all -> 0x044f }
            X.MYg r0 = X.MYc.A01(r6, r7)     // Catch:{ all -> 0x044f }
            X.MYb r1 = r0.A01     // Catch:{ all -> 0x044f }
            X.6EZ r0 = X.AnonymousClass6EY.A00(r6, r7)     // Catch:{ all -> 0x044f }
            X.6Ea r8 = r0.A00     // Catch:{ all -> 0x044f }
            X.1a8 r7 = r9.A01     // Catch:{ all -> 0x044f }
            X.1aU r6 = X.MYb.A00(r1)     // Catch:{ all -> 0x044f }
            X.6Eb r1 = X.C304576Eb.A00     // Catch:{ all -> 0x044f }
            X.6Ec r0 = new X.6Ec     // Catch:{ all -> 0x044f }
            r0.<init>(r1)     // Catch:{ all -> 0x044f }
            X.1aU r6 = r6.A0N(r0)     // Catch:{ all -> 0x044f }
            r0 = 10
            X.9M5 r1 = new X.9M5     // Catch:{ all -> 0x044f }
            r1.<init>(r0, r9, r8)     // Catch:{ all -> 0x044f }
            X.6Ed r0 = new X.6Ed     // Catch:{ all -> 0x044f }
            r0.<init>(r1)     // Catch:{ all -> 0x044f }
            X.1aU r1 = r6.A0M(r0)     // Catch:{ all -> 0x044f }
            X.6Ee r0 = X.AnonymousClass6Ee.A00     // Catch:{ all -> 0x044f }
            r7.A02(r1, r0)     // Catch:{ all -> 0x044f }
            r9.A00 = r3     // Catch:{ all -> 0x044f }
        L_0x0366:
            r0 = 1465056598(0x5752fd56, float:2.31985511E14)
            X.0fh.A00(r0)
        L_0x036c:
            r8 = 0
            X.65C r0 = X.AnonymousClass65B.A03
            X.65E r0 = X.AnonymousClass65D.A00(r4)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0388
            X.65B r7 = X.AnonymousClass65C.A01(r4)
            com.instagram.common.session.UserSession r6 = r7.A02
            r1 = 6
            X.9M5 r0 = new X.9M5
            r0.<init>(r1, r7, r8)
            X.AnonymousClass65B.A04(r0, r6)
        L_0x0388:
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x0395
            java.lang.String r1 = "DirectUserScopedInitializer"
            java.lang.String r0 = "Trying to initialize Armadillo Reverb for a stopped user session"
            X.0KC.A0E(r1, r0)
        L_0x0395:
            X.14i r1 = X.14i.A08
            X.0lV r0 = r5.A08
            r1.A0A(r0)
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x03aa
            java.lang.String r1 = "DirectUserScopedInitializer"
            java.lang.String r0 = "Trying to initialize Security Alert for a stopped user session"
            X.0KC.A0E(r1, r0)
            return
        L_0x03aa:
            r1 = -1241265151(0xffffffffb603cc01, float:-1.9639267E-6)
            java.lang.String r0 = "maybeInitializeSecurityAlert"
            X.0fh.A01(r0, r1)
            boolean r0 = X.AnonymousClass5OS.A00(r4)
            if (r0 == 0) goto L_0x0448
            X.JaB r0 = com.instagram.direct.securityalert.data.SecurityAlertRepository.A04
            com.instagram.direct.securityalert.data.SecurityAlertRepository r7 = r0.A00(r4)
            X.KbC r6 = r7.A01
            r5 = 959394273(0x392f31e1, float:1.6707882E-4)
            r6.A02(r5, r2, r8)
            r7.A00 = r3
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r0 = r7.A02
            com.instagram.common.session.UserSession r11 = r0.A00
            X.5Gf r4 = X.C283115Ge.A00(r11)
            X.0xa r9 = r4.A01
            java.lang.String r0 = "is_self_security_alert_enabled"
            boolean r0 = r9.contains(r0)
            com.instagram.common.session.UserSession r3 = r4.A00
            r1 = 40
            if (r0 != 0) goto L_0x03e0
            r1 = 39
        L_0x03e0:
            X.9Km r0 = new X.9Km
            r0.<init>(r4, r1)
            X.C67572Mq6.A00(r0, r3)
            java.lang.String r0 = "is_contact_security_alert_enabled"
            boolean r0 = r9.contains(r0)
            r1 = 42
            if (r0 != 0) goto L_0x03f4
            r1 = 41
        L_0x03f4:
            X.9Km r0 = new X.9Km
            r0.<init>(r4, r1)
            X.C67572Mq6.A00(r0, r3)
            java.lang.String r1 = "SYNC_SETTINGS"
            X.0sm r0 = X.0Yt.A0E()
            r6.A01(r5, r2, r1, r0)
            X.0Tu r10 = X.0Tu.A06
            r3 = 36321481861440950(0x810a32001125b6, double:3.033189611818925E-306)
            boolean r0 = X.182.A06(r10, r11, r3)
            if (r0 == 0) goto L_0x0427
            X.4Cq r9 = r7.A01
            r1 = 28
            X.MGt r0 = new X.MGt
            r0.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r9)
            java.lang.String r1 = "SYNC_PARTICIPANT_DEVICE_CHANGE"
            X.0sm r0 = X.0Yt.A0E()
            r6.A01(r5, r2, r1, r0)
        L_0x0427:
            boolean r0 = X.182.A06(r10, r11, r3)
            if (r0 == 0) goto L_0x0439
            X.4Cq r3 = r7.A01
            r1 = 28
            X.MGt r0 = new X.MGt
            r0.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x0439:
            X.4Cq r3 = r7.A01
            r1 = 27
            X.MGt r0 = new X.MGt
            r0.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r6.A03(r8, r5, r2)
        L_0x0448:
            r0 = -952820526(0xffffffffc7351cd2, float:-46364.82)
            X.0fh.A00(r0)
            return
        L_0x044f:
            r1 = move-exception
            r0 = -311037528(0xffffffffed75f1a8, float:-4.7572482E27)
            goto L_0x0458
        L_0x0454:
            r1 = move-exception
            r0 = -1613993886(0xffffffff9fcc6862, float:-8.657005E-20)
        L_0x0458:
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66605MYr.run():void");
    }
}
