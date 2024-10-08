package X;

/* renamed from: X.IxG  reason: case insensitive filesystem */
public final class C58769IxG extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58769IxG(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v240, resolved type: X.HPK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: X.JJc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: X.JJi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v255, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: X.2Dm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v352, resolved type: X.HPK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v72, resolved type: X.JJc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: X.JJc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v353, resolved type: X.HPK} */
    /* JADX WARNING: type inference failed for: r9v7, types: [X.632, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARNING: type inference failed for: r7v50, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x075a, code lost:
        r1.CfA((X.0sP) null, r3, X.AnonymousClass5PI.A03(r5, r0), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x07e8, code lost:
        if (r0 != null) goto L_0x07ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0f03, code lost:
        X.DbS.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x106d, code lost:
        r6.A02(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x12c6, code lost:
        if (r1.A00 == androidx.compose.animation.core.SuspendAnimationKt.A00(((X.C262224Cq) r0.A01).ArX())) goto L_0x12c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x1437, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x1497, code lost:
        r4.A06("target_name", r3);
        r4.A07(X.C66579MXk.A00(909), (java.util.List) r0.A03);
        r4.A07(X.C66579MXk.A00(666), (java.util.List) r0.A01);
        r2 = (com.facebookpay.logging.LoggingContext) r0.A04;
        X.C51971G9r.A1B(r4, r2);
        r4.A02(X.SQ1.A00(r2), "logging_policy");
        r1.A0N(r4, "event_payload");
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x14cd, code lost:
        X.C51969G9p.A1G(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x14d0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0096, code lost:
        X.AnonymousClass4HG.A00(r2, r3, r4, r5, (X.AnonymousClass4DU) r6, r7);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0427  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x128f;
                case 1: goto L_0x1227;
                case 2: goto L_0x11db;
                case 3: goto L_0x168b;
                case 4: goto L_0x1667;
                case 5: goto L_0x1154;
                case 6: goto L_0x1105;
                case 7: goto L_0x10c0;
                case 8: goto L_0x1072;
                case 9: goto L_0x136a;
                case 10: goto L_0x0f2b;
                case 11: goto L_0x163c;
                case 12: goto L_0x14d1;
                case 13: goto L_0x0f08;
                case 14: goto L_0x1483;
                case 15: goto L_0x1483;
                case 16: goto L_0x144d;
                case 17: goto L_0x1438;
                case 18: goto L_0x1438;
                case 19: goto L_0x0009;
                case 20: goto L_0x0009;
                case 21: goto L_0x0ee8;
                case 22: goto L_0x0ec3;
                case 23: goto L_0x0c9e;
                case 24: goto L_0x08f7;
                case 25: goto L_0x0845;
                case 26: goto L_0x1410;
                case 27: goto L_0x0816;
                case 28: goto L_0x13ea;
                case 29: goto L_0x0764;
                case 30: goto L_0x070a;
                case 31: goto L_0x06e5;
                case 32: goto L_0x05b5;
                case 33: goto L_0x0586;
                case 34: goto L_0x053a;
                case 35: goto L_0x051a;
                case 36: goto L_0x04f9;
                case 37: goto L_0x03b1;
                case 38: goto L_0x039a;
                case 39: goto L_0x0369;
                case 40: goto L_0x033a;
                case 41: goto L_0x031c;
                case 42: goto L_0x02ce;
                case 43: goto L_0x018b;
                case 44: goto L_0x0126;
                case 45: goto L_0x00bd;
                case 46: goto L_0x009c;
                case 47: goto L_0x007e;
                case 48: goto L_0x0053;
                case 49: goto L_0x003a;
                default: goto L_0x0009;
            }
        L_0x0009:
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r5 = r0.A01
            X.0sK r5 = (X.0sK) r5
            java.lang.Object r2 = r0.A04
            X.Hnf r2 = (X.C55799Hnf) r2
            int r2 = r2.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.A02
            X.6D8 r2 = (X.AnonymousClass6D8) r2
            X.4gU r2 = r2.A02
            boolean r3 = X.C51971G9r.A1X(r2)
            java.lang.Object r0 = r0.A03
            X.6D9 r0 = (X.AnonymousClass6D9) r0
            X.5Oz r0 = r0.A0A
            int r2 = X.C51971G9r.A0B(r0)
            X.MfE r0 = new X.MfE
            r0.<init>((int) r2, (boolean) r3, (int) r6)
            r5.invoke(r1, r4, r0)
        L_0x0037:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x003a:
            android.view.View r3 = X.C51969G9p.A0O(r1)
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r3)
            java.lang.Object r1 = r0.A04
            X.A4C r1 = (X.A4C) r1
            com.instagram.common.session.UserSession r4 = r1.A00
            java.lang.Object r5 = r0.A02
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r7 = r0.A03
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            java.lang.Object r6 = r0.A01
            goto L_0x0096
        L_0x0053:
            java.lang.Object r3 = r0.A03
            X.3Zt r3 = (X.C243673Zt) r3
            java.lang.String r2 = "MediaCTACyclicSubtitleComponent_"
            java.lang.Object r1 = r0.A04
            X.5Ev r1 = (X.C282815Ev) r1
            java.lang.String r1 = r1.A07
            java.lang.String r2 = X.002.A0R(r2, r1)
            java.lang.Object r1 = r0.A01
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            java.util.Timer r4 = X.C51974G9v.A0c(r2)
            X.Iki r5 = new X.Iki
            r5.<init>(r1, r0)
            r6 = 2500(0x9c4, double:1.235E-320)
            r8 = r6
            r4.scheduleAtFixedRate(r5, r6, r8)
            r3.A00(r4)
            goto L_0x0037
        L_0x007e:
            android.view.View r3 = X.C51969G9p.A0O(r1)
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r3)
            java.lang.Object r1 = r0.A04
            X.Hqq r1 = (X.C55985Hqq) r1
            com.instagram.common.session.UserSession r4 = r1.A00
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r7 = r0.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            java.lang.Object r6 = r0.A03
        L_0x0096:
            X.4DU r6 = (X.AnonymousClass4DU) r6
            X.AnonymousClass4HG.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x0037
        L_0x009c:
            X.2WE r6 = X.C51968G9o.A0f(r1)
            java.lang.Object r11 = r0.A03
            java.lang.Object r9 = r0.A04
            X.Gx3 r9 = (X.C53959Gx3) r9
            X.3W1 r3 = r9.A03
            X.4DU r2 = r9.A02
            java.lang.Object r10 = r0.A01
            X.4nj r1 = r9.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r3, r2, r10, r1}
            java.lang.Object r12 = r0.A02
            r8 = 15
            X.J7t r7 = new X.J7t
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x106d
        L_0x00bd:
            java.lang.Object r2 = r0.A01
            X.Vit r2 = (X.C17960Vit) r2
            java.lang.Object r1 = r0.A04
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r1)
            java.lang.Object r1 = r0.A03
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r1)
            java.lang.Object r0 = r0.A02
            X.N3A r0 = (X.N3A) r0
            X.QP5 r0 = r0.A02
            java.lang.String r6 = r0.A01
            r0 = 2
            X.0qQ.A0B(r6, r0)
            X.UZq r5 = r2.A00
            X.HrV r4 = r5.A0i
            X.MnP r3 = r5.A0G
            if (r3 != 0) goto L_0x00ef
            java.lang.String r0 = "viewpointDelegate"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ef:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.NIb r1 = new X.NIb
            r1.<init>()
            java.lang.String r0 = "search_result_uri"
            r2.putStringArrayList(r0, r8)
            java.lang.String r0 = "references_title"
            r2.putStringArrayList(r0, r7)
            java.lang.String r0 = "bot_response_id"
            r2.putString(r0, r6)
            r1.setArguments(r2)
            if (r4 == 0) goto L_0x010e
            r1.A00 = r4
        L_0x010e:
            r1.A01 = r3
            r0 = 19
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.common.session.UserSession r0 = r5.A04()
            X.7Pr r0 = X.DbS.A0W(r0)
            X.DbY.A13(r5, r1, r0)
            goto L_0x0037
        L_0x0126:
            X.0eP r1 = (X.0eP) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            r1.size()
            java.util.Iterator r4 = r1.iterator()
        L_0x0137:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x014f
            java.lang.Object r3 = r4.next()
            X.3su r3 = (X.C254703su) r3
            java.lang.Object r2 = r0.A03
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = r3.A0h()
            r2.put(r1, r3)
            goto L_0x0137
        L_0x014f:
            java.lang.Object r1 = r0.A04
            X.DbS.A1U(r1)
            java.lang.Object r6 = r0.A02
            X.0rm r6 = (X.0rm) r6
            java.lang.Object r1 = r6.A00
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r5 = r0.A03
            java.util.Map r5 = (java.util.Map) r5
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x0168:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x017f
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r1 = r1.A00
            boolean r1 = r5.containsKey(r1)
            X.DbV.A1U(r2, r4, r1)
            goto L_0x0168
        L_0x017f:
            r6.A00 = r4
            boolean r1 = X.AnonymousClass7TE.A1b(r4)
            if (r1 == 0) goto L_0x0037
            java.lang.Object r0 = r0.A01
            goto L_0x0f03
        L_0x018b:
            boolean r24 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Object r12 = r0.A04
            X.P8g r12 = (X.C72497P8g) r12
            com.instagram.common.session.UserSession r4 = r12.A05
            X.0Tu r3 = X.0Tu.A05
            r1 = 36320932104578007(0x8109b2000123d7, double:3.0328419433651064E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            r11 = 0
            r2 = 0
            if (r1 == 0) goto L_0x024e
            X.2Dm r13 = X.1bJ.A00(r4)
            X.0eK r1 = r12.A0s
            java.lang.Object r10 = r1.get()
            boolean r1 = r10 instanceof com.instagram.model.direct.DirectThreadKey
            if (r1 == 0) goto L_0x0037
            com.instagram.model.direct.DirectThreadKey r10 = (com.instagram.model.direct.DirectThreadKey) r10
            if (r10 == 0) goto L_0x0037
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.HashSet r8 = X.AnonymousClass7TE.A1F()
            java.lang.Object r1 = r0.A03
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r15 = r1.iterator()
        L_0x01c6:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x021c
            java.lang.Object r7 = r15.next()
            com.instagram.model.direct.messageid.MessageIdentifier r7 = (com.instagram.model.direct.messageid.MessageIdentifier) r7
            java.lang.String r6 = r7.A01
            X.3su r14 = r13.BRz(r10, r6)
            if (r14 == 0) goto L_0x01c6
            java.lang.Integer r3 = r14.A1F
            boolean r3 = X.AnonymousClass48R.A01(r3)
            if (r3 != 0) goto L_0x01e8
            java.lang.String r3 = r14.A0g()
            if (r3 != 0) goto L_0x020a
        L_0x01e8:
            X.0wj r5 = X.0wj.A01
            r4 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r3 = "deleteMessages - attempting to delete message with null id or pending state"
            X.0f9 r5 = r5.AEf(r3, r4)
            java.lang.Integer r3 = r14.A1F
            java.lang.String r4 = X.AnonymousClass48R.A00(r3)
            java.lang.String r3 = "lifeCycleState"
            r5.ABQ(r3, r4)
            java.lang.String r4 = r14.A0g()
            java.lang.String r3 = "messageId"
            r5.ABQ(r3, r4)
            r5.report()
        L_0x020a:
            r9.add(r14)
            java.util.ArrayList r3 = r13.Bm7(r10, r6)
            r8.addAll(r3)
            java.lang.String r3 = r7.A00()
            r13.EE5(r10, r6, r3)
            goto L_0x01c6
        L_0x021c:
            r4 = 40
            X.PqN r3 = new X.PqN
            r3.<init>(r1, r4)
            X.018.A17(r8, r3)
            java.util.Iterator r4 = r8.iterator()
        L_0x022a:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x023a
            java.lang.Object r3 = r4.next()
            X.3su r3 = (X.C254703su) r3
            r3.A13(r2)
            goto L_0x022a
        L_0x023a:
            java.util.List r4 = X.00k.A0a(r8)
            r3 = r13
            X.2Dr r3 = (X.2Dr) r3
            monitor-enter(r3)
            r14 = 1
            X.0qQ.A0B(r10, r14)     // Catch:{ all -> 0x16a9 }
            X.3U9 r2 = X.2Dr.A03(r3, r10)     // Catch:{ all -> 0x16a9 }
            r3.A0S(r2, r4, r11)     // Catch:{ all -> 0x16a9 }
            goto L_0x0275
        L_0x024e:
            X.7Zi r4 = X.C333527Zh.A00(r4)
            X.0eK r1 = r12.A0s
            java.lang.Object r3 = r1.get()
            X.0qQ.A07(r3)
            X.3sy r3 = (X.C254743sy) r3
            com.instagram.model.direct.messageid.MessageIdentifier r1 = r12.A00
            if (r1 == 0) goto L_0x0263
            java.lang.String r2 = r1.A01
        L_0x0263:
            java.lang.Object r1 = r0.A02
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r0 = r0.A01
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r8 = r0
            r9 = r24
            r7 = r1
            r6 = r2
            r5 = r3
            r4.A0L(r5, r6, r7, r8, r9)
            goto L_0x02c9
        L_0x0275:
            monitor-exit(r3)
            X.0r1 r7 = new X.0r1
            r7.<init>()
            r7.A00 = r14
            com.instagram.model.direct.messageid.MessageIdentifier r15 = r12.A00
            X.6ap r6 = X.DbS.A0a()
            android.app.Activity r5 = r12.A03
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131820646(0x7f110066, float:1.9274013E38)
            int r2 = r1.size()
            int r1 = r1.size()
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r1)
            java.lang.String r1 = r4.getQuantityString(r3, r2, r1)
            r6.A0D = r1
            r1 = 2131975851(0x7f135eab, float:1.9588806E38)
            X.DbW.A0q(r5, r6, r1)
            r6.A0L = r14
            java.lang.Object r1 = r0.A02
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r0 = r0.A01
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            X.NdN r14 = new X.NdN
            r22 = r8
            r23 = r7
            r19 = r9
            r20 = r1
            r21 = r0
            r18 = r15
            r17 = r10
            r16 = r13
            r15 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6.A0A = r14
            X.DbY.A1N(r6)
        L_0x02c9:
            r12.ATV(r11)
            goto L_0x0037
        L_0x02ce:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x0314
            java.lang.Object r2 = r0.A04
            X.Mcx r2 = (X.C66811Mcx) r2
            X.HiP r6 = r2.A04
            java.lang.Object r2 = r0.A02
            X.Mcv r2 = (X.C66809Mcv) r2
            X.7FE r5 = r2.A08
            java.lang.Object r2 = r0.A03
            X.McL r2 = (X.C66775McL) r2
            com.instagram.feed.widget.IgProgressImageView r4 = r2.A09
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r4.getIgImageView()
            android.content.Context r2 = r6.A00
            X.3Us r2 = X.C3265577g.A01(r2, r5)
            X.0qQ.A07(r2)
            X.77D r3 = X.C3265577g.A04(r2, r3)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r4.getIgImageView()
            r3.EF5(r1, r2)
            java.lang.Object r2 = r0.A01
            X.MdB r2 = (X.C66819MdB) r2
            X.PA7 r1 = X.PA7.A00
            r2.DQn(r1)
            r2.Ddt()
        L_0x0308:
            java.lang.Object r0 = r0.A03
            X.McL r0 = (X.C66775McL) r0
            com.instagram.feed.widget.IgProgressImageView r1 = r0.A09
            r0 = 0
            r1.setEnableProgressBar(r0)
            goto L_0x0037
        L_0x0314:
            java.lang.Object r1 = r0.A01
            X.MdB r1 = (X.C66819MdB) r1
            r1.Ddu()
            goto L_0x0308
        L_0x031c:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            X.C51965G9l.A1W(r2, r1)
            java.lang.Object r2 = r0.A04
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.Object r1 = r0.A03
            r2.Epw(r1)
            java.lang.Object r2 = r0.A01
            X.HqG r2 = (X.C55952HqG) r2
            X.HOn r1 = X.C54682HOn.TAP_IMAGE_SHEET
            r0 = 0
            r2.A00(r1, r0)
            goto L_0x0037
        L_0x033a:
            X.6Gb r3 = X.C51968G9o.A0L(r1)
            java.lang.Object r1 = r0.A03
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r8 = r0.A02
            java.lang.Object r7 = r0.A04
            java.lang.Object r6 = r0.A01
            java.util.Iterator r2 = r1.iterator()
        L_0x034c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r9 = r2.next()
            r0 = 436823626(0x1a09664a, float:2.8413564E-23)
            r5 = 9
            X.JJT r4 = new X.JJT
            r4.<init>(r5, r6, r7, r8, r9)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r4, r0)
            r0 = 0
            r3.Cf4(r0, r1)
            goto L_0x034c
        L_0x0369:
            X.3sy r1 = (X.C254743sy) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r5 = r0.A04
            X.7L9 r5 = (X.AnonymousClass7L9) r5
            X.7Zg r2 = r5.A02
            X.7Zj r6 = r2.BsD()
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r0.A02
            X.MWx r2 = (X.C66569MWx) r2
            X.0sa r0 = r5.A07
            boolean r12 = X.C51971G9r.A1b(r0)
            X.7L5 r0 = r5.A03
            java.lang.String r11 = r0.A00()
            r7 = r4
            r8 = r3
            r9 = r1
            r10 = r2
            r6.EM6(r7, r8, r9, r10, r11, r12)
            goto L_0x0037
        L_0x039a:
            java.lang.Object r1 = r0.A04
            X.7L9 r1 = (X.AnonymousClass7L9) r1
            X.7L7 r3 = r1.A05
            java.lang.Object r2 = r0.A03
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.A02
            com.instagram.model.direct.messageid.MessageIdentifier r1 = (com.instagram.model.direct.messageid.MessageIdentifier) r1
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            r3.A01(r0, r1, r2)
            goto L_0x0037
        L_0x03b1:
            X.N3R r1 = (X.N3R) r1
            java.lang.Object r9 = r0.A04
            X.NV6 r9 = (X.NV6) r9
            int r2 = r9.A02
            boolean r2 = X.AnonymousClass7LY.A00(r2)
            if (r2 != 0) goto L_0x0037
            java.util.List r1 = r1.A0C
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x0037
            java.lang.Object r5 = r0.A02
            X.0r1 r5 = (X.0r1) r5
            boolean r1 = r5.A00
            if (r1 == 0) goto L_0x0037
            java.lang.String r2 = r9.A04
            java.lang.String r1 = "stacks"
            boolean r1 = X.0qQ.A0K(r2, r1)
            r7 = 0
            if (r1 == 0) goto L_0x046e
            java.lang.String r2 = r9.A03
            com.instagram.common.session.UserSession r1 = r9.A0D()
            boolean r1 = X.C51966G9m.A1W(r1, r2)
            if (r1 == 0) goto L_0x046e
            com.instagram.common.session.UserSession r4 = r9.A0D()
            X.0Tu r3 = X.0Tu.A05
            r1 = 36316448158978425(0x81059e00051179, double:3.030006278112531E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x041b
            android.content.res.Resources r2 = X.DbV.A05(r9)
            r1 = 2131974166(0x7f135816, float:1.9585388E38)
            java.lang.String r4 = X.AnonymousClass7TF.A0d(r2, r1)
            r1 = 5
            X.PhV r3 = new X.PhV
            r3.<init>(r9, r1)
            r2 = 1
            X.ODX r1 = new X.ODX
            r1.<init>(r4, r3, r2)
            r9.A04 = r1
            java.lang.Object r2 = r0.A03
            android.view.View r2 = (android.view.View) r2
            r1 = 2131438169(0x7f0b2a59, float:1.8498257E38)
        L_0x0417:
            android.view.View r7 = r2.requireViewById(r1)
        L_0x041b:
            java.lang.Object r0 = r0.A03
            android.view.View r0 = (android.view.View) r0
            r9.A0J(r0)
            r0 = 0
            r5.A00 = r0
            if (r7 == 0) goto L_0x0037
            com.instagram.common.session.UserSession r0 = r9.A0D()
            X.1Av r8 = X.1Au.A00(r0)
            X.0s0 r6 = r8.A55
            X.0YZ[] r5 = X.1Av.A8a
            r4 = 421(0x1a5, float:5.9E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r8, r6, r5, r4)
            if (r0 != 0) goto L_0x0037
            androidx.fragment.app.FragmentActivity r2 = r9.requireActivity()
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131974168(0x7f135818, float:1.9585392E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            X.5Gt r1 = X.AnonymousClass7TG.A0f(r2, r0)
            r1.A03(r7)
            r1.A02()
            r0 = 5000(0x1388, float:7.006E-42)
            r1.A00 = r0
            r3 = 1
            r1.A0A = r3
            X.5Gv r0 = r1.A00()
            X.IfQ r2 = new X.IfQ
            r2.<init>(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r7.postDelayed(r2, r0)
            X.AnonymousClass7TF.A1J(r8, r6, r5, r4, r3)
            goto L_0x0037
        L_0x046e:
            java.lang.String r2 = r9.A04
            r1 = 3327(0xcff, float:4.662E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x041b
            com.instagram.common.session.UserSession r3 = r9.A0D()
            X.0Tu r4 = X.0Tu.A05
            r1 = 36316448161862021(0x81059e00311185, double:3.030006279936129E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 == 0) goto L_0x041b
            com.instagram.common.session.UserSession r3 = r9.A0D()
            r1 = 36316448161075586(0x81059e00251182, double:3.030006279438784E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 == 0) goto L_0x04d4
            android.content.res.Resources r2 = X.DbV.A05(r9)
            r1 = 2131974166(0x7f135816, float:1.9585388E38)
            java.lang.String r4 = X.AnonymousClass7TF.A0d(r2, r1)
            r1 = 6
            X.PhV r3 = new X.PhV
            r3.<init>(r9, r1)
            r2 = 1
            X.ODX r1 = new X.ODX
            r1.<init>(r4, r3, r2)
            r9.A05 = r1
            X.OMC r1 = r9.A00
            if (r1 != 0) goto L_0x04c3
            java.lang.String r0 = "sharedStacksLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04c3:
            X.0wc r2 = r1.A00
            java.lang.String r1 = "direct_shared_album_create_reel_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x04d4
            r2.Cgf()
        L_0x04d4:
            android.content.res.Resources r2 = X.DbV.A05(r9)
            r1 = 2131974165(0x7f135815, float:1.9585386E38)
            java.lang.String r4 = X.AnonymousClass7TF.A0d(r2, r1)
            java.lang.Object r2 = r0.A01
            r1 = 16
            X.Plq r3 = new X.Plq
            r3.<init>(r1, r9, r2)
            r2 = 1
            X.ODX r1 = new X.ODX
            r1.<init>(r4, r3, r2)
            r9.A04 = r1
            java.lang.Object r2 = r0.A03
            android.view.View r2 = (android.view.View) r2
            r1 = 2131440852(0x7f0b34d4, float:1.85037E38)
            goto L_0x0417
        L_0x04f9:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            if (r2 == 0) goto L_0x0514
            java.lang.Object r2 = r0.A04
            X.DlS r2 = (X.C46793DlS) r2
            com.instagram.common.session.UserSession r4 = r2.A00
            java.lang.Object r3 = r0.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r0.A02
            java.lang.String r2 = X.DbX.A0t(r2)
            X.C49951FGg.A06(r4, r3, r2)
        L_0x0514:
            java.lang.Object r0 = r0.A03
            X.0sP r0 = (X.0sP) r0
            goto L_0x07ea
        L_0x051a:
            X.6Gb r2 = X.C51968G9o.A0L(r1)
            java.lang.Object r6 = r0.A04
            java.lang.Object r7 = r0.A03
            java.lang.Object r8 = r0.A01
            java.lang.Object r5 = r0.A02
            r4 = 8
            X.JJT r3 = new X.JJT
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 24526027(0x1763ccb, float:4.522668E-38)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r3, r0)
            r0 = 0
            r2.Cf4(r0, r1)
            goto L_0x0037
        L_0x053a:
            X.6Gb r8 = X.C51968G9o.A0L(r1)
            java.lang.Object r10 = r0.A04
            X.GlZ r10 = (X.C53287GlZ) r10
            java.lang.Object r3 = r0.A01
            r1 = 42
            X.JJU r2 = new X.JJU
            r2.<init>(r1, r3, r10)
            r1 = 2126274892(0x7ebc614c, float:1.2520003E38)
            X.5PJ r1 = X.AnonymousClass5PI.A03(r2, r1)
            r7 = 0
            r8.Cf4(r7, r1)
            X.62P r9 = r10.A05
            X.J2h r2 = X.C58996J2h.A00
            java.lang.Object r6 = r0.A02
            java.lang.Object r5 = r0.A03
            X.J2i r1 = X.C58997J2i.A00
            int r4 = r9.size()
            r0 = 4
            X.PqX r3 = new X.PqX
            r3.<init>((int) r0, (java.util.List) r9, (X.0sP) r2)
            r0 = 5
            X.PqX r2 = new X.PqX
            r2.<init>((int) r0, (java.util.List) r9, (X.0sP) r1)
            r1 = 4
            X.JK1 r0 = new X.JK1
            r0.<init>((int) r1, (java.lang.Object) r9, (java.lang.Object) r6, (java.lang.Object) r5)
            X.C51967G9n.A12(r8, r0, r3, r2, r4)
            X.HLa r1 = r10.A02
            X.HLa r0 = X.C54617HLa.LOADING
            if (r1 != r0) goto L_0x0037
            X.0sK r0 = X.C55330Hfx.A00
            r8.Cf4(r7, r0)
            goto L_0x0037
        L_0x0586:
            X.6Gb r5 = X.C51968G9o.A0L(r1)
            java.lang.Object r11 = r0.A04
            java.util.List r11 = (java.util.List) r11
            X.J2P r1 = X.J2P.A00
            java.lang.Object r9 = r0.A02
            java.lang.Object r8 = r0.A01
            java.lang.Object r10 = r0.A03
            X.J2Q r4 = X.J2Q.A00
            int r3 = r11.size()
            r0 = 34
            X.J6k r2 = new X.J6k
            r2.<init>((int) r0, (java.util.List) r11, (X.0sP) r1)
            r1 = 35
            X.J6k r0 = new X.J6k
            r0.<init>((int) r1, (java.util.List) r11, (X.0sP) r4)
            r7 = 5
            X.JJc r6 = new X.JJc
            r6.<init>(r7, r8, r9, r10, r11)
            X.C51967G9n.A12(r5, r6, r2, r0, r3)
            goto L_0x0037
        L_0x05b5:
            X.5Q3 r1 = (X.AnonymousClass5Q3) r1
            r10 = 0
            X.0qQ.A0B(r1, r10)
            java.lang.Object r2 = r0.A02
            r5 = 1
            X.Ges r4 = new X.Ges
            r4.<init>(r2, r5)
            java.lang.Object r2 = r0.A03
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r11 = r2.iterator()
        L_0x05cf:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x05f7
            java.lang.Object r2 = r11.next()
            X.HkZ r2 = (X.C55614HkZ) r2
            android.graphics.PointF r3 = r2.A01
            float r9 = r3.x
            long r6 = r1.Bwg()
            float r2 = X.C288025bF.A02(r6)
            float r9 = r9 * r2
            float r3 = r3.y
            float r2 = X.C288025bF.A00(r6)
            float r3 = r3 * r2
            X.5dM r2 = X.C51975G9x.A0J(r9, r3)
            r8.add(r2)
            goto L_0x05cf
        L_0x05f7:
            r18 = 1082130432(0x40800000, float:4.0)
            r15 = 0
            r19 = 1060320051(0x3f333333, float:0.7)
            r22 = 3
            r13 = r1
            r14 = r4
            r16 = r15
            r17 = r8
            r20 = r10
            r21 = r5
            r13.AQo(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r0.A04
            X.4gU r0 = (X.C270284gU) r0
            java.util.Iterator r14 = r2.iterator()
        L_0x0618:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0037
            java.lang.Object r7 = r14.next()
            X.HkZ r7 = (X.C55614HkZ) r7
            float r6 = X.C51971G9r.A03(r0)
            int r2 = r7.A00
            float r2 = (float) r2
            r3 = 1075838976(0x40200000, float:2.5)
            float r6 = r6 - r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 / r3
            float r2 = r2 * r6
            float r2 = r2 * r6
            double r2 = (double) r2
            double r2 = java.lang.Math.exp(r2)
            float r6 = (float) r2
            r28 = 1065353216(0x3f800000, float:1.0)
            r13 = 1073741824(0x40000000, float:2.0)
            float r2 = r13 * r6
            float r28 = r28 + r2
            float r28 = r28 * r18
            android.graphics.PointF r7 = r7.A01
            float r8 = r7.x
            long r11 = r1.Bwg()
            float r2 = X.C288025bF.A02(r11)
            float r8 = r8 * r2
            float r3 = r7.y
            float r2 = X.C288025bF.A00(r11)
            float r3 = r3 * r2
            X.5dM r2 = X.C51975G9x.A0J(r8, r3)
            java.util.List r27 = X.AnonymousClass7TE.A1I(r2)
            r29 = 1050253722(0x3e99999a, float:0.3)
            float r29 = r29 * r6
            float r29 = r29 + r19
            r23 = r1
            r24 = r4
            r25 = r15
            r26 = r15
            r30 = r10
            r31 = r5
            r32 = r22
            r23.AQo(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r6 = r6 * r2
            float r6 = r6 * r18
            float r9 = r7.x
            long r11 = r1.Bwg()
            float r2 = X.C288025bF.A02(r11)
            float r8 = r9 * r2
            float r8 = r8 - r6
            float r3 = r7.y
            float r2 = X.C288025bF.A00(r11)
            float r2 = r2 * r3
            X.5dM r2 = X.C51975G9x.A0J(r8, r2)
            float r8 = X.C288025bF.A02(r11)
            float r9 = r9 * r8
            float r9 = r9 + r6
            float r8 = X.C288025bF.A00(r11)
            float r3 = r3 * r8
            X.5dM r3 = X.C51975G9x.A0J(r9, r3)
            X.5dM[] r2 = new X.C289295dM[]{r2, r3}
            java.util.List r27 = X.0sr.A1P(r2)
            float r28 = r28 / r13
            r30 = r5
            r23.AQo(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            float r8 = r7.x
            long r11 = r1.Bwg()
            float r2 = X.C288025bF.A02(r11)
            float r2 = r2 * r8
            float r7 = r7.y
            float r3 = X.C288025bF.A00(r11)
            float r3 = r3 * r7
            float r3 = r3 - r6
            X.5dM r3 = X.C51975G9x.A0J(r2, r3)
            float r2 = X.C288025bF.A02(r11)
            float r8 = r8 * r2
            float r2 = X.C288025bF.A00(r11)
            float r7 = r7 * r2
            float r7 = r7 + r6
            X.5dM r2 = X.C51975G9x.A0J(r8, r7)
            X.5dM[] r2 = new X.C289295dM[]{r3, r2}
            java.util.List r27 = X.0sr.A1P(r2)
            r23.AQo(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0618
        L_0x06e5:
            X.6Gb r1 = (X.C305006Gb) r1
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r9 = r0.A04
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.A02
            java.lang.Object r7 = r0.A01
            java.lang.Object r8 = r0.A03
            int r4 = r9.size()
            r0 = 14
            X.MP4 r3 = new X.MP4
            r3.<init>(r9, r0)
            X.JJi r5 = new X.JJi
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            goto L_0x075a
        L_0x070a:
            X.6Gb r1 = (X.C305006Gb) r1
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r3 = r0.A01
            X.JVf r3 = (X.C59721JVf) r3
            java.lang.Object r7 = r3.A00
            X.HMg r2 = X.C54649HMg.ALL
            java.lang.Object r8 = r3.A01
            java.util.List r8 = (java.util.List) r8
            if (r7 == r2) goto L_0x073f
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r8.iterator()
        L_0x0726:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x073b
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.Glg r2 = (X.C53294Glg) r2
            X.HMg r2 = r2.A00
            if (r2 != r7) goto L_0x0726
            r5.add(r3)
            goto L_0x0726
        L_0x073b:
            X.62O r8 = X.AnonymousClass62Q.A03(r5)
        L_0x073f:
            java.lang.Object r9 = r0.A03
            java.lang.Object r10 = r0.A04
            java.lang.Object r11 = r0.A02
            X.J24 r0 = X.J24.A00
            int r4 = r8.size()
            X.J6k r3 = new X.J6k
            r3.<init>((int) r6, (java.util.List) r8, (X.0sP) r0)
            r7 = 3
            X.JJc r5 = new X.JJc
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
        L_0x075a:
            X.5PJ r2 = X.AnonymousClass5PI.A03(r5, r0)
            r0 = 0
            r1.CfA(r0, r3, r2, r4)
            goto L_0x0037
        L_0x0764:
            X.HPK r1 = (X.HPK) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A04
            X.Ll4 r2 = (X.C64965Ll4) r2
            X.8N2 r11 = r2.A0S
            java.lang.Object r10 = r0.A02
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r3 = r0.A03
            X.9bz r3 = (X.C381579bz) r3
            java.lang.String r9 = r3.A06
            int r2 = r3.A01
            r29 = r2
            int r15 = r3.A00
            r2 = 1
            X.0qQ.A0B(r10, r2)
            boolean r2 = r1 instanceof X.KK5
            if (r2 != 0) goto L_0x07ef
            if (r9 == 0) goto L_0x07ef
            boolean r2 = r1 instanceof X.H91
            if (r2 == 0) goto L_0x07e4
            X.05G r8 = r11.A0H
        L_0x0790:
            java.lang.Object r7 = r8.getValue()
            r2 = r7
            X.8N5 r2 = (X.AnonymousClass8N5) r2
            r25 = 0
            java.lang.Integer r22 = X.AnonymousClass05K.A1I
            com.instagram.common.session.UserSession r4 = r11.A0E
            r3 = 1260(0x4ec, float:1.766E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            java.lang.String r27 = X.002.A0R(r3, r9)
            r3 = r1
            X.H91 r3 = (X.H91) r3
            java.lang.String r3 = r3.A00
            X.8N6 r21 = new X.8N6
            r23 = r21
            r24 = r10
            r26 = r4
            r28 = r3
            r30 = r15
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            android.graphics.Bitmap r14 = r2.A02
            android.graphics.Bitmap r12 = r2.A00
            float[] r6 = r2.A08
            android.graphics.Bitmap r5 = r2.A01
            boolean r4 = r2.A07
            boolean r3 = r2.A06
            X.JvT r13 = r2.A03
            X.8N5 r2 = new X.8N5
            r23 = r6
            r24 = r4
            r25 = r3
            r19 = r5
            r20 = r13
            r18 = r12
            r17 = r14
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r2 = r8.AIY(r7, r2)
            if (r2 == 0) goto L_0x0790
        L_0x07e4:
            java.lang.Object r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
            if (r0 == 0) goto L_0x0037
        L_0x07ea:
            r0.invoke(r1)
            goto L_0x0037
        L_0x07ef:
            X.05G r4 = r11.A0H
        L_0x07f1:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.8N5 r2 = (X.AnonymousClass8N5) r2
            java.lang.Integer r11 = X.AnonymousClass05K.A1F
            android.graphics.Bitmap r6 = r2.A02
            android.graphics.Bitmap r7 = r2.A00
            float[] r12 = r2.A08
            android.graphics.Bitmap r8 = r2.A01
            boolean r13 = r2.A07
            boolean r14 = r2.A06
            X.JvT r9 = r2.A03
            X.8N6 r10 = r2.A04
            X.8N5 r5 = new X.8N5
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r2 = r4.AIY(r3, r5)
            if (r2 == 0) goto L_0x07f1
            goto L_0x07e4
        L_0x0816:
            java.lang.Object r6 = r0.A02
            android.os.Handler r6 = (android.os.Handler) r6
            java.lang.Object r2 = r0.A03
            X.2Wa r2 = (X.2Wa) r2
            java.lang.Object r1 = r0.A01
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Object r0 = r0.A04
            X.GOK r0 = (X.GOK) r0
            X.IiF r5 = new X.IiF
            r5.<init>(r1, r2, r0)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            com.instagram.common.session.UserSession r3 = r0.A04
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36604636170556491(0x820bb90014144b, double:3.212257537074479E-306)
            long r0 = X.182.A01(r2, r3, r0)
            long r0 = r4.toMillis(r0)
            r6.postDelayed(r5, r0)
            goto L_0x0037
        L_0x0845:
            int r2 = X.AnonymousClass7TE.A0M(r1)
            java.lang.Object r1 = r0.A01
            java.lang.Object r1 = X.C51966G9m.A17(r1)
            X.5Tq r1 = (X.C286025Tq) r1
            java.util.List r9 = r1.A03(r2, r2)
            java.lang.Object r8 = r0.A03
            X.0sP r8 = (X.0sP) r8
            java.lang.Object r7 = r0.A04
            X.0sP r7 = (X.0sP) r7
            java.lang.Object r10 = r0.A02
            X.5Oz r10 = (X.C284945Oz) r10
            int r6 = r9.size()
            r5 = 0
        L_0x0866:
            if (r5 >= r6) goto L_0x0037
            java.lang.Object r3 = r9.get(r5)
            X.62b r3 = (X.C3022062b) r3
            java.lang.String r2 = r3.A03
            int r1 = r2.hashCode()
            r0 = -1818970762(0xffffffff9394b576, float:-3.7539387E-27)
            if (r1 == r0) goto L_0x08c7
            r0 = -1203351155(0xffffffffb846518d, float:-4.728283E-5)
            if (r1 == r0) goto L_0x08b5
            r0 = 148535529(0x8da78e9, float:1.3148824E-33)
            if (r1 != r0) goto L_0x08ac
            java.lang.String r0 = "hash_tag"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08ac
            java.lang.Object r4 = r3.A02
            java.lang.String r4 = (java.lang.String) r4
            int r3 = r4.length()
            r2 = 0
        L_0x0894:
            if (r2 >= r3) goto L_0x08b2
            char r1 = r4.charAt(r2)
            r0 = 64
            if (r1 == r0) goto L_0x08af
            r0 = 35
            if (r1 == r0) goto L_0x08af
            java.lang.String r0 = r4.substring(r2)
            X.0qQ.A07(r0)
        L_0x08a9:
            r8.invoke(r0)
        L_0x08ac:
            int r5 = r5 + 1
            goto L_0x0866
        L_0x08af:
            int r2 = r2 + 1
            goto L_0x0894
        L_0x08b2:
            java.lang.String r0 = ""
            goto L_0x08a9
        L_0x08b5:
            java.lang.String r0 = "show_more_or_less"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08ac
            boolean r0 = X.C51971G9r.A1W(r10)
            r0 = r0 ^ 1
            X.C51967G9n.A16(r10, r0)
            goto L_0x08ac
        L_0x08c7:
            java.lang.String r0 = "user_mention"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x08ac
            java.lang.Object r4 = r3.A02
            java.lang.String r4 = (java.lang.String) r4
            int r3 = r4.length()
            r2 = 0
        L_0x08d8:
            if (r2 >= r3) goto L_0x08f4
            char r1 = r4.charAt(r2)
            r0 = 64
            if (r1 == r0) goto L_0x08f1
            r0 = 35
            if (r1 == r0) goto L_0x08f1
            java.lang.String r0 = r4.substring(r2)
            X.0qQ.A07(r0)
        L_0x08ed:
            r7.invoke(r0)
            goto L_0x08ac
        L_0x08f1:
            int r2 = r2 + 1
            goto L_0x08d8
        L_0x08f4:
            java.lang.String r0 = ""
            goto L_0x08ed
        L_0x08f7:
            X.Hm4 r1 = (X.C55707Hm4) r1
            java.lang.Object r2 = r0.A01
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            java.lang.Object r5 = r0.A02
            com.instagram.ui.widget.spinner.SpinnerImageView r5 = (com.instagram.ui.widget.spinner.SpinnerImageView) r5
            boolean r4 = r1.A02
            int r3 = X.DbW.A00(r4)
            r2.setVisibility(r3)
            if (r4 == 0) goto L_0x09a2
            X.3uy r3 = X.C255943uy.LOADING
        L_0x090e:
            r5.setLoadingStatus(r3)
            java.lang.String r3 = r1.A00
            if (r3 == 0) goto L_0x097c
            java.lang.Object r8 = r0.A04
            X.E4h r8 = (X.C47482E4h) r8
            android.content.Context r5 = r8.requireContext()
            X.0eM r3 = r8.A0D
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            X.0hq r3 = r8.mFragmentManager
            if (r3 == 0) goto L_0x16c0
            X.UdT r7 = new X.UdT
            r7.<init>(r5, r3, r4)
            r2.setAdapter(r7)
            X.DbY.A16(r8, r2)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            android.content.Context r3 = r8.getContext()
            if (r3 == 0) goto L_0x09a0
            android.content.res.Resources r4 = r3.getResources()
            if (r4 == 0) goto L_0x09a0
            r3 = 2131238259(0x7f081d73, float:1.8092792E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r3)
        L_0x0947:
            X.VMY r3 = new X.VMY
            r3.<init>(r4)
            java.util.List r6 = r7.A00
            r6.add(r3)
            android.content.Context r4 = r8.requireContext()
            r3 = 2131970564(0x7f134a04, float:1.9578083E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r4, r3)
            X.VRj r3 = new X.VRj
            r3.<init>(r4, r5)
            r6.add(r3)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            android.content.Context r4 = r8.requireContext()
            r3 = 2131970563(0x7f134a03, float:1.957808E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r4, r3)
            X.VRj r3 = new X.VRj
            r3.<init>(r4, r5)
            r6.add(r3)
            r7.A01()
        L_0x097c:
            java.util.List r7 = r1.A01
            if (r7 == 0) goto L_0x0037
            java.lang.Object r6 = r0.A04
            X.E4h r6 = (X.C47482E4h) r6
            java.lang.Object r3 = r0.A03
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            java.util.Iterator r1 = r7.iterator()
        L_0x098d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x09a6
            java.lang.Object r0 = r1.next()
            X.Hqn r0 = (X.C55982Hqn) r0
            java.util.List r0 = r0.A04
            int r4 = X.DbT.A01(r0, r4)
            goto L_0x098d
        L_0x09a0:
            r4 = 0
            goto L_0x0947
        L_0x09a2:
            X.3uy r3 = X.C255943uy.SUCCESS
            goto L_0x090e
        L_0x09a6:
            if (r4 != 0) goto L_0x0a0f
            android.content.Context r3 = r6.requireContext()
            X.0eM r0 = r6.A0D
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0hq r0 = r6.mFragmentManager
            if (r0 == 0) goto L_0x16ac
            X.UdT r4 = new X.UdT
            r4.<init>(r3, r0, r1)
            r2.setAdapter(r4)
            X.DbY.A16(r6, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x0a0d
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0a0d
            r0 = 2131238537(0x7f081e89, float:1.8093356E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
        L_0x09d6:
            X.VMY r0 = new X.VMY
            r0.<init>(r1)
            java.util.List r3 = r4.A00
            r3.add(r0)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131970562(0x7f134a02, float:1.9578079E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            X.VRj r0 = new X.VRj
            r0.<init>(r1, r2)
            r3.add(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            android.content.Context r1 = r6.requireContext()
            r0 = 2131970561(0x7f134a01, float:1.9578077E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            X.VRj r0 = new X.VRj
            r0.<init>(r1, r2)
            r3.add(r0)
            r4.A01()
            goto L_0x0037
        L_0x0a0d:
            r1 = 0
            goto L_0x09d6
        L_0x0a0f:
            int r5 = r7.size()
            X.0eM r0 = r6.A0D
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r12 = r6.requireContext()
            boolean r10 = r6.A09
            boolean r9 = r6.A07
            java.util.ArrayList r4 = X.DbS.A0v(r5)
            r1 = 0
        L_0x0a26:
            if (r1 >= r5) goto L_0x0a33
            X.ITx r0 = new X.ITx
            r0.<init>(r6, r1)
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x0a26
        L_0x0a33:
            X.Hht r0 = new X.Hht
            r0.<init>(r6)
            r8 = 9
            X.H3v r5 = new X.H3v
            r11 = r5
            r13 = r0
            r14 = r6
            r16 = r4
            r17 = r10
            r18 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r2.setAdapter(r5)
            android.content.Context r4 = r6.requireContext()
            r0 = 3
            com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager r1 = new com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager
            r1.<init>(r4, r0)
            r10 = 0
            X.Ghx r0 = new X.Ghx
            r0.<init>(r5, r10)
            r1.A01 = r0
            r2.setLayoutManager(r1)
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0ae5
            android.content.res.Resources r1 = X.DbV.A05(r6)
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.content.Context r0 = r6.requireContext()
            int r0 = X.AnonymousClass7TG.A02(r0)
            int r1 = r1 + r0
            X.0nA.A0X(r2, r1)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r7.iterator()
        L_0x0a83:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0aad
            java.lang.Object r9 = r11.next()
            X.Hqn r9 = (X.C55982Hqn) r9
            java.lang.String r0 = r9.A01
            if (r0 == 0) goto L_0x0a83
            X.EX0 r0 = r9.A00()
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0aa8
            if (r1 != r10) goto L_0x16b1
            java.lang.String r1 = r9.A01
            X.EX0 r0 = X.EX0.ORGANIC
        L_0x0aa4:
            X.AnonymousClass7TF.A1I(r1, r0, r4)
            goto L_0x0a83
        L_0x0aa8:
            java.lang.String r1 = r9.A01
            X.EX0 r0 = X.EX0.PROMOTION
            goto L_0x0aa4
        L_0x0aad:
            int r1 = r4.size()
            int r0 = r6.A00
            if (r1 <= r0) goto L_0x0ada
            X.UzE r1 = X.C16678UzE.ONBOARDING_CHECKLIST
            X.Vw9 r0 = new X.Vw9
            r0.<init>(r3, r1)
            r0.A01()
            r6.A04 = r0
            int r3 = r6.A00
            java.lang.Object r0 = r4.get(r3)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r4.get(r3)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            X.EX0 r0 = (X.EX0) r0
            X.C47482E4h.A01(r0, r6, r1)
        L_0x0ada:
            r1 = 2
            X.GiU r0 = new X.GiU
            r0.<init>(r1, r5, r4, r6)
            r6.A01 = r0
            r2.A15(r0)
        L_0x0ae5:
            android.content.Context r16 = r6.requireContext()
            r9 = 1
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.A08
            r4.set(r9)
            r5.clear()
            int r15 = r7.size()
            r3 = 0
        L_0x0af7:
            if (r3 >= r15) goto L_0x0b92
            java.lang.Object r0 = r7.get(r3)
            X.Hqn r0 = (X.C55982Hqn) r0
            X.EX0 r1 = r0.A00()
            X.EX0 r0 = X.EX0.PROMOTION
            if (r1 != r0) goto L_0x0b0e
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x0b0e
        L_0x0b0b:
            int r3 = r3 + 1
            goto L_0x0af7
        L_0x0b0e:
            java.lang.Object r0 = r7.get(r3)
            X.Hqn r0 = (X.C55982Hqn) r0
            java.util.List r0 = r0.A04
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0b0b
            java.lang.Object r12 = r7.get(r3)
            X.Hqn r12 = (X.C55982Hqn) r12
            java.lang.String r2 = r12.A03
            if (r2 == 0) goto L_0x0b32
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.VRj r1 = new X.VRj
            r1.<init>(r2, r0)
            X.Udu r0 = r5.A03
            r5.addModel(r1, r0)
        L_0x0b32:
            java.lang.String r2 = r12.A02
            if (r2 == 0) goto L_0x0b42
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.VRj r1 = new X.VRj
            r1.<init>(r2, r0)
            X.Udu r0 = r5.A03
            r5.addModel(r1, r0)
        L_0x0b42:
            boolean r11 = r5.A09
            if (r11 != 0) goto L_0x0b5b
            java.lang.String r13 = r12.A01
            if (r13 == 0) goto L_0x0b5b
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.ID2 r0 = new X.ID2
            r0.<init>((int) r9, (java.lang.Object) r12, (java.lang.Object) r5)
            X.VVS r1 = new X.VVS
            r1.<init>(r0, r13, r2)
            X.Udw r0 = r5.A04
            r5.addModel(r1, r0)
        L_0x0b5b:
            java.util.List r0 = r12.A04
            int r14 = r0.size()
            r13 = 0
        L_0x0b62:
            if (r13 >= r14) goto L_0x0c1a
            int r0 = r5.A00
            int r18 = r13 / r0
            int r2 = r13 % r0
            java.util.List r1 = r12.A04
            java.lang.Object r1 = r1.get(r13)
            if (r13 >= r8) goto L_0x0b8f
            int r0 = r0 - r9
            boolean r22 = X.AnonymousClass7TF.A1T(r2, r0)
            X.VZV r0 = new X.VZV
            r19 = r2
            r20 = r13
            r21 = r10
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            java.util.List r2 = r5.A07
            java.lang.Object r2 = r2.get(r3)
            X.2s0 r2 = (X.C231642s0) r2
            r5.addModel(r1, r0, r2)
        L_0x0b8f:
            int r13 = r13 + 1
            goto L_0x0b62
        L_0x0b92:
            r5.notifyDataSetChangedSmart()
            r4.set(r10)
            java.lang.String r11 = r6.A06
            if (r11 == 0) goto L_0x0037
            int r10 = r7.size()
            r9 = 0
        L_0x0ba1:
            if (r9 >= r10) goto L_0x0037
            java.lang.Object r0 = r7.get(r9)
            X.Hqn r0 = (X.C55982Hqn) r0
            java.util.List r0 = r0.A04
            int r8 = r0.size()
            r5 = 0
        L_0x0bb0:
            if (r5 >= r8) goto L_0x0c17
            java.lang.Object r0 = r7.get(r9)
            X.Hqn r0 = (X.C55982Hqn) r0
            java.util.List r0 = r0.A04
            X.1Xj r4 = X.DbZ.A0T(r0, r5)
            java.lang.String r1 = r4.getId()
            if (r1 == 0) goto L_0x16bb
            r0 = 95
            java.lang.String r0 = X.00l.A0J(r1, r1, r0)
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x0c14
            java.lang.Object r0 = r7.get(r9)
            X.Hqn r0 = (X.C55982Hqn) r0
            java.util.List r0 = r0.A04
            int r1 = r0.size()
            int r1 = r1 * r9
            int r1 = r1 + r5
            X.Xzn r12 = r6.A03
            if (r12 != 0) goto L_0x0be6
            java.lang.String r0 = "logger"
            goto L_0x0c79
        L_0x0be6:
            java.lang.Object r0 = r7.get(r9)
            X.Hqn r0 = (X.C55982Hqn) r0
            X.EX0 r0 = r0.A00()
            java.lang.String r3 = r0.toString()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "pro_inspiration_hscroll"
            java.lang.String r0 = "hscroll_tile"
            r12.A06(r1, r0, r3, r2)
            java.lang.Object r0 = r7.get(r9)
            X.Hqn r0 = (X.C55982Hqn) r0
            X.EX0 r1 = r0.A00()
            java.lang.Object r0 = r7.get(r9)
            X.Hqn r0 = (X.C55982Hqn) r0
            java.lang.String r0 = r0.A01
            X.C47482E4h.A00(r1, r6, r4, r0, r9)
        L_0x0c14:
            int r5 = r5 + 1
            goto L_0x0bb0
        L_0x0c17:
            int r9 = r9 + 1
            goto L_0x0ba1
        L_0x0c1a:
            java.util.List r0 = r12.A04
            int r0 = r0.size()
            r21 = 0
            if (r0 <= r8) goto L_0x0c4c
            if (r11 == 0) goto L_0x0c85
            X.EX0 r0 = r12.A00()
            int r0 = r0.ordinal()
            if (r0 == r9) goto L_0x0c81
            if (r0 != r10) goto L_0x16b6
            r1 = 2131970752(0x7f134ac0, float:1.9578464E38)
        L_0x0c35:
            r0 = r16
            java.lang.String r11 = r0.getString(r1)
        L_0x0c3b:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.IBj r0 = new X.IBj
            r0.<init>(r3, r10, r12, r5)
            X.VVS r1 = new X.VVS
            r1.<init>(r0, r11, r2)
            X.Udw r0 = r5.A04
            r5.addModel(r1, r0)
        L_0x0c4c:
            X.Xzn r2 = r5.A02
            X.EX0 r0 = r12.A00()
            java.lang.String r1 = r0.toString()
            r0 = 352(0x160, float:4.93E-43)
            java.lang.String r18 = X.AnonymousClass000.A00(r0)
            r0 = 1394(0x572, float:1.953E-42)
            java.lang.String r20 = X.AnonymousClass000.A00(r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            java.util.LinkedHashMap r11 = X.AnonymousClass7TE.A1H()
            r0 = 1792(0x700, float:2.511E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11.put(r0, r1)
            java.lang.String r1 = r2.A00
            if (r1 != 0) goto L_0x0c88
            java.lang.String r0 = "entryPoint"
        L_0x0c79:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c81:
            r1 = 2131970750(0x7f134abe, float:1.957846E38)
            goto L_0x0c35
        L_0x0c85:
            r11 = r21
            goto L_0x0c3b
        L_0x0c88:
            X.Xtl r0 = new X.Xtl
            r22 = r21
            r23 = r21
            r24 = r11
            r25 = r21
            r17 = r0
            r19 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r2.ClC(r0)
            goto L_0x0b0b
        L_0x0c9e:
            X.62f r1 = (X.C3022462f) r1
            r14 = 0
            X.0qQ.A0B(r1, r14)
            long r2 = r1.A02
            int r4 = X.C51965G9l.A04(r2)
            float r5 = (float) r4
            X.62d r13 = r1.A03
            float r4 = r13.A01
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            boolean r4 = X.C51970G9q.A1T(r4)
            r12 = 1
            if (r4 != 0) goto L_0x0d05
            boolean r4 = r13.A06
            if (r4 != 0) goto L_0x0d05
            int r2 = X.C289005cr.A00(r2)
            float r3 = (float) r2
            float r2 = r13.A00
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0d05
            r11 = 0
        L_0x0cc8:
            X.62Y r2 = r1.A04
            X.5Tq r2 = r2.A03
            java.util.List r2 = r2.A03
            if (r2 != 0) goto L_0x0cd2
            X.0sn r2 = X.0sn.A00
        L_0x0cd2:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r2.iterator()
        L_0x0cda:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0d11
            java.lang.Object r5 = r10.next()
            r9 = r5
            X.62b r9 = (X.C3022062b) r9
            java.lang.Object r2 = r9.A02
            X.5ZB r2 = (X.AnonymousClass5ZB) r2
            X.5ZA r2 = r2.A0C
            long r7 = r2.Aoz()
            long r3 = X.AnonymousClass5RW.A07
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0cda
            if (r11 == 0) goto L_0x0d01
            int r3 = r9.A01
            int r2 = r11.intValue()
            if (r3 >= r2) goto L_0x0cda
        L_0x0d01:
            r6.add(r5)
            goto L_0x0cda
        L_0x0d05:
            int r2 = r13.A02
            int r2 = r2 - r12
            int r2 = r13.A07(r2, r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            goto L_0x0cc8
        L_0x0d11:
            java.lang.Object r9 = r0.A02
            X.5Oz r9 = (X.C284945Oz) r9
            java.util.Iterator r10 = r6.iterator()
            r8 = 0
            r7 = r8
        L_0x0d1b:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0d45
            java.lang.Object r2 = r10.next()
            X.62b r2 = (X.C3022062b) r2
            int r3 = r2.A01
            int r2 = r2.A00
            X.60e r4 = r1.A07(r3, r2)
            if (r7 == 0) goto L_0x0d43
            r2 = 0
            android.graphics.Path r5 = r7.A03
            android.graphics.Path r4 = r4.A03
            float r3 = X.C289295dM.A01(r2)
            float r2 = java.lang.Float.intBitsToFloat(r14)
            r5.addPath(r4, r3, r2)
            goto L_0x0d1b
        L_0x0d43:
            r7 = r4
            goto L_0x0d1b
        L_0x0d45:
            if (r7 == 0) goto L_0x0d4b
            X.5VN r8 = r7.AhZ()
        L_0x0d4b:
            r9.Epw(r8)
            java.lang.Object r11 = r0.A03
            X.Hn3 r11 = (X.C55768Hn3) r11
            if (r11 == 0) goto L_0x0037
            java.lang.Object r10 = r0.A01
            X.4cd r10 = (X.C268024cd) r10
            java.lang.Object r9 = r0.A04
            X.5Z4 r9 = (X.AnonymousClass5Z4) r9
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r19 = r6.iterator()
        L_0x0d64:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0e01
            java.lang.Object r0 = r19.next()
            X.62b r0 = (X.C3022062b) r0
            int r7 = r0.A01
            int r3 = r13.A06(r7)
            int r6 = r0.A00
            int r2 = r13.A06(r6)
            int r5 = r13.A02
            if (r2 <= r5) goto L_0x0d86
            X.0sn r4 = X.0sn.A00
        L_0x0d82:
            X.018.A16(r4, r8)
            goto L_0x0d64
        L_0x0d86:
            X.2HY r0 = new X.2HY
            r0.<init>(r3, r2)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r18 = r0.iterator()
        L_0x0d93:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0d82
            r0 = r18
            X.0sh r0 = (X.0sh) r0
            int r3 = r0.A00()
            if (r3 < 0) goto L_0x0d93
            if (r3 >= r5) goto L_0x0d93
            int r2 = r1.A03(r3)
            r0 = r7
            if (r7 >= r2) goto L_0x0dad
            r0 = r2
        L_0x0dad:
            float r2 = r1.A02(r0, r12)
            int r0 = r13.A07(r3, r14)
            if (r6 < r0) goto L_0x0dfc
            float r0 = r1.A01(r3)
        L_0x0dbb:
            if (r3 != 0) goto L_0x0de3
            float r3 = r13.A04(r14)
        L_0x0dc1:
            float r2 = r10.Ezv(r2)
            X.5d0 r2 = X.C51965G9l.A0T(r2)
            float r0 = r10.Ezv(r0)
            X.5d0 r0 = X.C51965G9l.A0T(r0)
            X.IkI r15 = new X.IkI
            r15.<init>(r2, r0)
            float r2 = r10.Ezv(r3)
            X.HkJ r0 = new X.HkJ
            r0.<init>(r15, r2)
            r4.add(r0)
            goto L_0x0d93
        L_0x0de3:
            X.5ZC r15 = r9.A00
            long r15 = r15.A04
            float r17 = X.AnonymousClass5Z5.A00(r15)
            X.5ZB r15 = r9.A02
            long r15 = r15.A01
            float r15 = X.AnonymousClass5Z5.A00(r15)
            float r17 = r17 - r15
            float r3 = r13.A04(r3)
            float r3 = r3 + r17
            goto L_0x0dc1
        L_0x0dfc:
            float r0 = r1.A02(r6, r12)
            goto L_0x0dbb
        L_0x0e01:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r8.iterator()
        L_0x0e09:
            boolean r0 = r10.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x0e7a
            java.lang.Object r8 = r10.next()
            X.HkJ r8 = (X.C55599HkJ) r8
            X.2Ha r1 = r8.A01
            java.lang.Comparable r0 = r1.B1S()
            X.5d0 r0 = (X.C289095d0) r0
            float r3 = r0.A00
            java.lang.Comparable r0 = r1.Byc()
            X.5d0 r0 = (X.C289095d0) r0
            float r2 = r0.A00
            float r1 = r3 - r2
            r0 = 1103626240(0x41c80000, float:25.0)
            float r1 = r1 / r0
            int r5 = X.AnonymousClass1GB.A01(r1)
            r0 = 2
            if (r5 >= r0) goto L_0x0e35
            r5 = 2
        L_0x0e35:
            r0 = 1088421888(0x40e00000, float:7.0)
            float r2 = r2 + r0
            X.5d0 r1 = X.C51965G9l.A0T(r2)
            float r3 = r3 - r0
            X.5d0 r0 = X.C51965G9l.A0T(r3)
            X.IkI r4 = new X.IkI
            r4.<init>(r1, r0)
        L_0x0e46:
            float r2 = (float) r7
            int r0 = r5 + -1
            float r0 = (float) r0
            float r2 = r2 / r0
            float r9 = X.I42.A01(r4, r2)
            r3 = 1082130432(0x40800000, float:4.0)
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r0
            float r3 = r3 * r2
            r2 = 1097859072(0x41700000, float:15.0)
            float r2 = r2 / r1
            float r0 = r9 - r2
            X.5d0 r1 = X.C51965G9l.A0T(r0)
            float r9 = r9 + r2
            X.5d0 r0 = X.C51965G9l.A0T(r9)
            X.IkI r2 = new X.IkI
            r2.<init>(r1, r0)
            float r1 = r8.A00
            X.Hn2 r0 = new X.Hn2
            r0.<init>(r2, r1, r3)
            r6.add(r0)
            int r7 = r7 + 1
            if (r7 >= r5) goto L_0x0e09
            goto L_0x0e46
        L_0x0e7a:
            java.util.Iterator r5 = r6.iterator()
        L_0x0e7e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0ebf
            java.lang.Object r4 = r5.next()
            int r3 = r7 + 1
            if (r7 >= 0) goto L_0x0e94
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0e94:
            X.Hn2 r4 = (X.C55767Hn2) r4
            java.util.List r0 = r11.A00
            java.lang.Object r0 = X.00k.A0O(r0, r7)
            X.Hn2 r0 = (X.C55767Hn2) r0
            if (r0 == 0) goto L_0x0ea6
            float r2 = r0.A00
        L_0x0ea2:
            r4.A00 = r2
            r7 = r3
            goto L_0x0e7e
        L_0x0ea6:
            X.5PZ r0 = r11.A01
            float r2 = r0.B6X()
            X.Pxc r0 = X.I42.A00
            java.lang.Comparable r0 = r0.B1S()
            float r1 = X.AnonymousClass7TE.A04(r0)
            X.2SP r0 = X.2SP.A01
            float r0 = r0.A02()
            float r1 = r1 * r0
            float r2 = r2 + r1
            goto L_0x0ea2
        L_0x0ebf:
            r11.A00 = r6
            goto L_0x0037
        L_0x0ec3:
            X.5dM r1 = (X.C289295dM) r1
            long r2 = r1.A00
            java.lang.Object r1 = r0.A04
            X.DbS.A1U(r1)
            java.lang.Object r4 = r0.A02
            X.0sP r4 = (X.0sP) r4
            float r3 = X.C289295dM.A01(r2)
            java.lang.Object r1 = r0.A01
            X.6FR r1 = (X.AnonymousClass6FR) r1
            X.6FP r1 = (X.AnonymousClass6FP) r1
            long r1 = r1.A00
            int r1 = X.C51965G9l.A04(r1)
            float r1 = (float) r1
            float r3 = r3 / r1
            X.C51967G9n.A1Q(r4, r3)
            java.lang.Object r0 = r0.A03
            goto L_0x0f03
        L_0x0ee8:
            java.lang.Object r5 = r0.A01
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r4 = r0.A03
            r3 = 0
            r2 = 46
            X.MFS r1 = new X.MFS
            r1.<init>(r4, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r5)
            java.lang.Object r2 = r0.A04
            X.5Oz r2 = (X.C284945Oz) r2
            r1 = 1
            X.C51967G9n.A16(r2, r1)
            java.lang.Object r0 = r0.A02
        L_0x0f03:
            X.DbS.A1U(r0)
            goto L_0x0037
        L_0x0f08:
            X.SUj r1 = (X.SUj) r1
            java.lang.Object r3 = r0.A04
            X.Std r3 = (X.C12404Std) r3
            java.lang.Object r2 = r0.A03
            X.SJ1 r2 = (X.SJ1) r2
            X.0qQ.A0A(r1)
            r3.A0B(r2, r1)
            boolean r1 = X.SUj.A0T(r1)
            if (r1 != 0) goto L_0x0037
            java.lang.Object r1 = r0.A01
            X.2gB r1 = (X.AnonymousClass2gB) r1
            java.lang.Object r0 = r0.A02
            X.2Fk r0 = (X.2Fk) r0
            r1.A0D(r0)
            goto L_0x0037
        L_0x0f2b:
            X.2WE r6 = X.C51968G9o.A0f(r1)
            X.0gF r17 = X.C60340gF.A00
            java.lang.Object[] r2 = new java.lang.Object[]{r17}
            java.lang.Object r11 = r0.A02
            java.lang.Object r12 = r0.A03
            X.GbF r12 = (X.C52703GbF) r12
            r1 = 28
            X.JGF.A01(r6, r11, r12, r2, r1)
            java.lang.CharSequence r1 = r12.A08
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r10 = 33
            X.JGF.A01(r6, r11, r12, r1, r10)
            java.lang.Integer r1 = r12.A0G
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r9 = 34
            X.JGF.A01(r6, r11, r12, r1, r9)
            r16 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r16}
            r8 = 35
            X.JGF.A01(r6, r11, r12, r1, r8)
            java.lang.Integer r1 = r12.A0F
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r7 = 36
            X.JGF.A01(r6, r11, r12, r1, r7)
            android.graphics.Rect r1 = r12.A00
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r5 = 37
            X.JGF.A01(r6, r11, r12, r1, r5)
            X.GbN r1 = r12.A03
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 39
            X.C59344JFw.A00(r6, r12, r1, r2)
            X.GbH r1 = r12.A07
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r4 = 38
            X.JGF.A01(r6, r11, r12, r1, r4)
            java.lang.Integer r1 = r12.A0I
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            X.JGF.A01(r6, r11, r12, r1, r2)
            java.lang.Integer r1 = r12.A0J
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r3 = 32
            X.C59344JFw.A00(r6, r12, r1, r3)
            java.lang.Float r1 = r12.A0C
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            r1 = 23
            X.JGF.A01(r6, r11, r12, r2, r1)
            java.lang.Float r2 = r12.A0B
            java.lang.Float r1 = r12.A0A
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r1}
            r1 = 24
            X.JGF.A01(r6, r11, r12, r2, r1)
            java.lang.Integer r1 = r12.A0E
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            r1 = 25
            X.JGF.A01(r6, r11, r12, r2, r1)
            java.lang.Integer r1 = r12.A0D
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            r1 = 26
            X.JGF.A01(r6, r11, r12, r2, r1)
            X.Gbl r1 = r12.A05
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            r1 = 27
            X.JGF.A01(r6, r11, r12, r2, r1)
            X.GbD r15 = r12.A06
            X.GbS r14 = r12.A04
            boolean r1 = r12.A0R
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r1)
            java.lang.String r13 = r12.A0K
            boolean r1 = r12.A0Q
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r12.A0T
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r1)
            android.graphics.Typeface r2 = r12.A01
            r1 = 6
            r18 = r15
            r19 = r14
            r21 = r13
            r24 = r2
            java.lang.Object[] r14 = new java.lang.Object[]{r18, r19, r20, r21, r22, r23, r24}
            java.lang.Object r13 = r0.A01
            r2 = 5
            X.JG3 r2 = X.JG3.A00(r13, r12, r11, r2)
            r6.A02(r2, r14)
            X.0sa r13 = r12.A0M
            X.0sa r2 = r12.A0N
            java.lang.Object[] r2 = new java.lang.Object[]{r13, r2}
            X.C59344JFw.A00(r6, r12, r2, r10)
            android.widget.TextView$OnEditorActionListener r2 = r12.A02
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            X.C59344JFw.A00(r6, r12, r2, r9)
            X.0sL r2 = r12.A0P
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            X.C59344JFw.A00(r6, r12, r2, r8)
            java.lang.Integer r2 = r12.A0H
            java.lang.Object[] r8 = new java.lang.Object[]{r2}
            r2 = 29
            X.JGF.A01(r6, r11, r12, r8, r2)
            boolean r2 = r12.A0S
            java.lang.Object[] r2 = X.C51968G9o.A1b(r2)
            java.lang.Object r0 = r0.A04
            X.JG3 r0 = X.JG3.A00(r11, r0, r12, r1)
            r6.A02(r0, r2)
            java.lang.String r0 = r12.A0L
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            r0 = 31
            X.JGF.A01(r6, r11, r12, r1, r0)
            X.0sa r0 = r12.A0O
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            X.JGF.A01(r6, r11, r12, r0, r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r16}
            X.C59344JFw.A00(r6, r12, r0, r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r17}
            X.C59344JFw.A00(r6, r11, r0, r5)
            java.lang.Object[] r1 = X.C51970G9q.A1b()
            X.JFw r7 = new X.JFw
            r7.<init>(r11, r4)
        L_0x106d:
            r6.A02(r7, r1)
            goto L_0x0037
        L_0x1072:
            X.Hlt r1 = (X.C55696Hlt) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r4 = r0.A02
            com.facebook.msys.mca.MessageSyncService r4 = (com.facebook.msys.mca.MessageSyncService) r4
            monitor-enter(r4)
            com.facebook.msys.mci.AccountSession r10 = r4.mAccountSession     // Catch:{ all -> 0x16c5 }
            monitor-exit(r4)
            X.62u r2 = new X.62u
            r2.<init>(r10)
            X.632 r9 = new X.632
            r9.<init>(r2)
            java.lang.Object r3 = r0.A04
            X.Oan r3 = (X.C71068Oan) r3
            X.638 r2 = X.AnonymousClass638.$redex_init_class
            X.636 r8 = r1.A01
            X.637 r7 = r1.A00
            java.lang.Object r2 = r0.A01
            X.68F r2 = (X.AnonymousClass68F) r2
            X.692 r2 = r2.A00
            X.5wg r2 = r2.A01
            android.content.Context r6 = r2.A01
            com.facebook.msys.mci.NotificationCenter r11 = X.C300465xE.A00()
            java.lang.String r14 = r1.A02
            r12 = 0
            X.638 r5 = new X.638
            r13 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3.A02 = r5
            com.google.common.util.concurrent.SettableFuture r5 = r5.A02()
            java.lang.Object r2 = r0.A03
            r0 = 1
            X.OrO r1 = new X.OrO
            r1.<init>(r0, r2, r4, r3)
            X.1Lf r0 = X.1Lf.A01
            X.C255183ti.A04(r1, r5, r0)
            goto L_0x0037
        L_0x10c0:
            android.graphics.Canvas r1 = (android.graphics.Canvas) r1
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r2 = r0.A04
            X.2i8 r2 = (X.AnonymousClass2i8) r2
            android.graphics.drawable.Drawable r5 = r2.A02
            int r4 = r2.A01
            int r3 = r2.A00
            r5.setBounds(r6, r6, r4, r3)
            r2 = 0
            r5.setColorFilter(r2)
            android.graphics.Bitmap r6 = X.AnonymousClass7TF.A0B(r4, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r6)
            r5.draw(r2)
            java.lang.Object r5 = r0.A02
            android.graphics.Paint r5 = (android.graphics.Paint) r5
            java.lang.Object r4 = r0.A01
            android.graphics.Matrix r4 = (android.graphics.Matrix) r4
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r2 = new android.graphics.BitmapShader
            r2.<init>(r6, r3, r3)
            r5.setShader(r2)
            android.graphics.Shader r2 = r5.getShader()
            r2.setLocalMatrix(r4)
            java.lang.Object r0 = r0.A03
            X.3OI r0 = (X.AnonymousClass3OI) r0
            r0.A00(r1, r5)
            goto L_0x0037
        L_0x1105:
            android.graphics.Canvas r1 = (android.graphics.Canvas) r1
            r5 = 0
            X.0qQ.A0B(r1, r5)
            java.lang.Object r4 = r0.A04
            X.2i8 r4 = (X.AnonymousClass2i8) r4
            int r3 = r4.A01
            if (r3 <= 0) goto L_0x113a
            int r2 = r4.A00
            if (r2 <= 0) goto L_0x113a
            android.graphics.drawable.Drawable r7 = r4.A02
            r7.setBounds(r5, r5, r3, r2)
            java.lang.Object r2 = r0.A01
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            r1.concat(r2)
        L_0x1123:
            java.lang.Object r2 = r0.A02
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            android.graphics.ColorFilter r0 = r2.getColorFilter()
            r7.setColorFilter(r0)
            int r0 = r2.getAlpha()
            r7.setAlpha(r0)
            r7.draw(r1)
            goto L_0x0037
        L_0x113a:
            android.graphics.drawable.Drawable r7 = r4.A02
            java.lang.Object r2 = r0.A03
            X.3OI r2 = (X.AnonymousClass3OI) r2
            X.3OL r2 = (X.AnonymousClass3OL) r2
            android.graphics.RectF r6 = r2.A00
            float r2 = r6.left
            int r5 = (int) r2
            float r2 = r6.top
            int r4 = (int) r2
            float r2 = r6.right
            int r3 = (int) r2
            float r2 = r6.bottom
            int r2 = (int) r2
            r7.setBounds(r5, r4, r3, r2)
            goto L_0x1123
        L_0x1154:
            X.S21 r1 = (X.S21) r1
            if (r1 == 0) goto L_0x0037
            X.SUj r3 = r1.A00()
            X.RDz r1 = r3.A00
            if (r1 != 0) goto L_0x11b2
            r1 = -1
        L_0x1161:
            r7 = 1
            r2 = 2
            if (r1 == r2) goto L_0x0037
            java.lang.String r4 = "VAULT_PHASE_ONE_USE_FAIL"
            if (r1 == r7) goto L_0x11b7
            r5 = 0
            if (r1 != r5) goto L_0x16c8
            java.lang.Object r6 = r3.A01
            com.fbpay.w3c.W3CCardDetail r6 = (com.fbpay.w3c.W3CCardDetail) r6
            java.lang.Object r1 = r0.A01
            X.4gR r1 = (X.C270254gR) r1
            if (r6 != 0) goto L_0x1197
            X.SJq r3 = r1.A01
            java.lang.String r2 = "VAULT_GET_ENCRYPTED_PAN_FAILURE_REASON"
            java.lang.String r1 = "NULL_W3C_CARD_DETAIL_WITH_PAN"
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r2, r1)
            java.lang.Object r1 = r0.A04
            android.os.Bundle r1 = (android.os.Bundle) r1
            r3.A05(r1, r4, r2)
            java.lang.Object r2 = r0.A03
            X.S0E r2 = (X.S0E) r2
            java.lang.Object r0 = r0.A02
            X.Jw4 r1 = new X.Jw4
            r1.<init>((java.lang.Object) r0, (int) r5, (boolean) r5, (boolean) r5)
        L_0x1192:
            r2.A00(r1)
            goto L_0x0037
        L_0x1197:
            X.SJq r4 = r1.A01
            X.0sm r3 = X.0Yt.A0E()
            java.lang.Object r2 = r0.A04
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r1 = "VAULT_PHASE_ONE_USE_SUCCESS"
            r4.A05(r2, r1, r3)
            java.lang.Object r2 = r0.A03
            X.S0E r2 = (X.S0E) r2
            com.fbpay.w3c.CardDetails r0 = r6.A00
            X.Jw4 r1 = new X.Jw4
            r1.<init>((java.lang.Object) r0, (int) r5, (boolean) r7, (boolean) r5)
            goto L_0x1192
        L_0x11b2:
            int r1 = r1.ordinal()
            goto L_0x1161
        L_0x11b7:
            java.lang.Throwable r1 = r3.A02
            if (r1 == 0) goto L_0x11d6
            java.lang.String r2 = r1.getMessage()
            if (r2 == 0) goto L_0x11d6
            java.lang.String r1 = "VAULT_GET_ENCRYPTED_PAN_ERROR"
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r1, r2)
        L_0x11c7:
            java.lang.Object r1 = r0.A01
            X.4gR r1 = (X.C270254gR) r1
            X.SJq r1 = r1.A01
            java.lang.Object r0 = r0.A04
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.A05(r0, r4, r2)
            goto L_0x0037
        L_0x11d6:
            X.0sm r2 = X.0Yt.A0E()
            goto L_0x11c7
        L_0x11db:
            X.64v r1 = (X.C3026764v) r1
            X.5Oz r4 = r1.A06
            float r6 = X.C51972G9s.A02(r4)
            java.lang.Object r3 = r0.A01
            X.0rh r3 = (X.0rh) r3
            float r2 = r3.A00
            float r6 = r6 - r2
            java.lang.Object r2 = r0.A02
            X.6H1 r2 = (X.AnonymousClass6H1) r2
            float r5 = r2.EKW(r6)
            float r2 = X.C51972G9s.A02(r4)
            r3.A00 = r2
            java.lang.Object r4 = r0.A03
            X.0rh r4 = (X.0rh) r4
            X.5an r2 = r1.A04
            X.5am r2 = (X.C287795am) r2
            X.0sP r3 = r2.A00
            X.5af r2 = r1.A02
            java.lang.Object r2 = r3.invoke(r2)
            float r2 = X.AnonymousClass7TE.A04(r2)
            r4.A00 = r2
            float r3 = X.AnonymousClass7TE.A00(r6, r5)
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x121b
            r1.A00()
        L_0x121b:
            java.lang.Object r1 = r0.A04
            X.6IU r1 = (X.AnonymousClass6IU) r1
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            goto L_0x0037
        L_0x1227:
            float r5 = X.AnonymousClass7TE.A04(r1)
            java.lang.Object r2 = r0.A04
            X.6IZ r2 = (X.AnonymousClass6IZ) r2
            boolean r1 = r2.A05
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x1237
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x1237:
            float r1 = r4 * r5
            androidx.compose.foundation.gestures.ScrollingLogic r8 = r2.A09
            java.lang.Object r6 = r0.A01
            X.6IX r6 = (X.AnonymousClass6IX) r6
            long r2 = r8.A02(r1)
            boolean r1 = r8.A07
            if (r1 == 0) goto L_0x124d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            long r2 = X.C289295dM.A05(r1, r2)
        L_0x124d:
            r7 = 1
            X.6IW r6 = (X.AnonymousClass6IW) r6
            androidx.compose.foundation.gestures.ScrollingLogic r6 = r6.A00
            X.6H1 r1 = r6.A04
            long r2 = androidx.compose.foundation.gestures.ScrollingLogic.A00(r1, r6, r7, r2)
            boolean r1 = r8.A07
            if (r1 == 0) goto L_0x1262
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            long r2 = X.C289295dM.A05(r1, r2)
        L_0x1262:
            float r1 = r8.A01(r2)
            float r4 = r4 * r1
            float r2 = java.lang.Math.abs(r4)
            float r1 = java.lang.Math.abs(r5)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0037
            java.lang.Object r3 = r0.A02
            X.4Co r3 = (X.C262204Co) r3
            java.lang.String r2 = "Scroll animation cancelled because scroll was not consumed ("
            java.lang.String r1 = " < "
            r0 = 41
            java.lang.String r2 = X.002.A0U(r2, r1, r0, r4, r5)
            r1 = 0
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r2)
            r0.initCause(r1)
            r3.AG7(r0)
            goto L_0x0037
        L_0x128f:
            long r4 = X.AnonymousClass7TE.A0R(r1)
            java.lang.Object r1 = r0.A03
            java.lang.Object r1 = X.C51966G9m.A17(r1)
            X.4gU r1 = (X.C270284gU) r1
            if (r1 == 0) goto L_0x1316
            java.lang.Object r1 = r1.getValue()
            long r2 = X.AnonymousClass7TE.A0R(r1)
        L_0x12a5:
            java.lang.Object r8 = r0.A04
            X.GRI r8 = (X.GRI) r8
            long r6 = r8.A00
            r10 = -9223372036854775808
            r9 = 0
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x12ed
            java.lang.Object r1 = r0.A02
            X.0rh r1 = (X.0rh) r1
            float r7 = r1.A00
            java.lang.Object r6 = r0.A01
            X.4Cq r6 = (X.C262224Cq) r6
            X.4Cc r6 = r6.ArX()
            float r6 = androidx.compose.animation.core.SuspendAnimationKt.A00(r6)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x12ed
        L_0x12c8:
            float r4 = r1.A00
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x1318
            X.5Pl r0 = r8.A03
            int r4 = r0.A00
            if (r4 <= 0) goto L_0x0037
            java.lang.Object[] r3 = r0.A02
        L_0x12d7:
            r2 = r3[r9]
            X.GRG r2 = (X.GRG) r2
            X.64f r0 = r2.A02
            java.lang.Object r1 = r0.A05
            X.5Oz r0 = r2.A08
            r0.Epw(r1)
            r0 = 1
            r2.A06 = r0
            int r9 = r9 + 1
            if (r9 < r4) goto L_0x12d7
            goto L_0x0037
        L_0x12ed:
            r8.A00 = r4
            X.5Pl r1 = r8.A03
            int r7 = r1.A00
            if (r7 <= 0) goto L_0x1303
            java.lang.Object[] r6 = r1.A02
            r5 = 0
        L_0x12f8:
            r4 = r6[r5]
            X.GRG r4 = (X.GRG) r4
            r1 = 1
            r4.A06 = r1
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x12f8
        L_0x1303:
            java.lang.Object r1 = r0.A02
            X.0rh r1 = (X.0rh) r1
            java.lang.Object r0 = r0.A01
            X.4Cq r0 = (X.C262224Cq) r0
            X.4Cc r0 = r0.ArX()
            float r0 = androidx.compose.animation.core.SuspendAnimationKt.A00(r0)
            r1.A00 = r0
            goto L_0x12c8
        L_0x1316:
            r2 = r4
            goto L_0x12a5
        L_0x1318:
            long r0 = r8.A00
            long r2 = r2 - r0
            float r0 = (float) r2
            float r0 = r0 / r4
            long r2 = (long) r0
            X.5Pl r0 = r8.A03
            int r10 = r0.A00
            if (r10 <= 0) goto L_0x1368
            java.lang.Object[] r7 = r0.A02
            r6 = 0
            r12 = 1
        L_0x1328:
            r11 = r7[r6]
            X.GRG r11 = (X.GRG) r11
            boolean r0 = r11.A05
            if (r0 != 0) goto L_0x1356
            X.GRI r0 = r11.A09
            X.5Oz r0 = r0.A02
            X.C51967G9n.A16(r0, r9)
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x133f
            r11.A06 = r9
            r11.A00 = r2
        L_0x133f:
            long r0 = r11.A00
            long r4 = r2 - r0
            X.64f r0 = r11.A02
            java.lang.Object r1 = r0.CDQ(r4)
            X.5Oz r0 = r11.A08
            r0.Epw(r1)
            X.64f r0 = r11.A02
            boolean r0 = r0.CTe(r4)
            r11.A05 = r0
        L_0x1356:
            boolean r0 = r11.A05
            if (r0 != 0) goto L_0x135b
            r12 = 0
        L_0x135b:
            int r6 = r6 + 1
            if (r6 < r10) goto L_0x1328
        L_0x135f:
            r1 = r12 ^ 1
            X.5Oz r0 = r8.A01
            X.C51967G9n.A16(r0, r1)
            goto L_0x0037
        L_0x1368:
            r12 = 1
            goto L_0x135f
        L_0x136a:
            X.KgM r2 = X.C62471KgM.OTHER     // Catch:{ all -> 0x13de }
            r5 = 0
            if (r1 != r2) goto L_0x13a9
            java.lang.Object r4 = r0.A04     // Catch:{ all -> 0x13de }
            X.QBz r4 = (X.C7415QBz) r4     // Catch:{ all -> 0x13de }
            X.0eM r2 = r4.A01     // Catch:{ all -> 0x13de }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x13de }
            X.Jfk r2 = (X.C60104Jfk) r2     // Catch:{ all -> 0x13de }
            java.lang.Boolean r2 = r2.A01     // Catch:{ all -> 0x13de }
            boolean r2 = X.AnonymousClass7TF.A1Y(r2, r5)     // Catch:{ all -> 0x13de }
            if (r2 == 0) goto L_0x13a9
            java.lang.Object r2 = r0.A02     // Catch:{ all -> 0x13de }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ all -> 0x13de }
            r1 = 2131976216(0x7f136018, float:1.9589546E38)
            r2.setText(r1)     // Catch:{ all -> 0x13de }
            java.lang.Object r2 = r0.A03     // Catch:{ all -> 0x13de }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ all -> 0x13de }
            r1 = 2131966689(0x7f133ae1, float:1.9570223E38)
            r2.setText(r1)     // Catch:{ all -> 0x13de }
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x13de }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x13de }
            r1.setVisibility(r5)     // Catch:{ all -> 0x13de }
            java.lang.Integer r3 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x13de }
            java.lang.Integer r2 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x13de }
            X.0eP[] r1 = new X.0eP[r5]     // Catch:{ all -> 0x13de }
            X.C7415QBz.A00(r4, r3, r2, r1)     // Catch:{ all -> 0x13de }
            goto L_0x0037
        L_0x13a9:
            X.KgM r2 = X.C62471KgM.NONE     // Catch:{ all -> 0x13de }
            if (r1 != r2) goto L_0x13d7
            java.lang.Object r2 = r0.A02     // Catch:{ all -> 0x13de }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ all -> 0x13de }
            r1 = 2131968260(0x7f134104, float:1.957341E38)
            r2.setText(r1)     // Catch:{ all -> 0x13de }
            java.lang.Object r2 = r0.A03     // Catch:{ all -> 0x13de }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ all -> 0x13de }
            r1 = 2131968263(0x7f134107, float:1.9573416E38)
            r2.setText(r1)     // Catch:{ all -> 0x13de }
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x13de }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x13de }
            r1.setVisibility(r5)     // Catch:{ all -> 0x13de }
            java.lang.Object r4 = r0.A04     // Catch:{ all -> 0x13de }
            X.QBz r4 = (X.C7415QBz) r4     // Catch:{ all -> 0x13de }
            java.lang.Integer r3 = X.AnonymousClass05K.A05     // Catch:{ all -> 0x13de }
            java.lang.Integer r2 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x13de }
            X.0eP[] r1 = new X.0eP[r5]     // Catch:{ all -> 0x13de }
            X.C7415QBz.A00(r4, r3, r2, r1)     // Catch:{ all -> 0x13de }
            goto L_0x0037
        L_0x13d7:
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x13de }
            X.C51969G9p.A1M(r1)     // Catch:{ all -> 0x13de }
            goto L_0x0037
        L_0x13de:
            r2 = move-exception
            java.lang.Object r1 = r0.A04
            X.QBz r1 = (X.C7415QBz) r1
            X.0eM r0 = r1.A01
            X.C51976G9y.A0T(r1, r2, r0)
            goto L_0x0037
        L_0x13ea:
            X.Hhe r1 = (X.C55434Hhe) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A01
            X.GMQ r2 = (X.GMQ) r2
            java.lang.Object r3 = r2.A05
            X.3Zt r3 = (X.C243673Zt) r3
            android.view.View r1 = r1.A00
            r3.A00(r1)
            java.lang.Object r2 = r0.A04
            X.GOK r2 = (X.GOK) r2
            java.lang.Object r1 = r0.A03
            android.content.Context r1 = X.C51966G9m.A0Q(r1)
            java.lang.Object r0 = r0.A02
            X.2Wa r0 = (X.2Wa) r0
            boolean r0 = X.GOK.A05(r1, r3, r0, r2)
            goto L_0x1433
        L_0x1410:
            X.Hhe r1 = (X.C55434Hhe) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A01
            X.GMQ r2 = (X.GMQ) r2
            java.lang.Object r3 = r2.A05
            X.3Zt r3 = (X.C243673Zt) r3
            android.view.View r1 = r1.A00
            r3.A00(r1)
            java.lang.Object r2 = r0.A04
            X.GMs r2 = (X.C52302GMs) r2
            java.lang.Object r1 = r0.A03
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            java.lang.Object r0 = r0.A02
            X.2Wa r0 = (X.2Wa) r0
            X.C52302GMs.A04(r3, r1, r0, r2)
            r0 = 1
        L_0x1433:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x1438:
            X.1Ln r1 = (X.1Ln) r1
            X.GkN r4 = new X.GkN
            r4.<init>()
            java.lang.String r3 = "incentive"
            java.lang.String r2 = "view_name"
            r4.A06(r2, r3)
            r2 = 262(0x106, float:3.67E-43)
            java.lang.String r3 = X.Pxd.A00(r2)
            goto L_0x1497
        L_0x144d:
            X.1Ln r1 = (X.1Ln) r1
            X.GkK r4 = new X.GkK
            r4.<init>()
            java.lang.Object r3 = r0.A04
            com.facebookpay.logging.LoggingContext r3 = (com.facebookpay.logging.LoggingContext) r3
            X.C51971G9r.A1B(r4, r3)
            java.lang.Object r2 = r0.A02
            X.C51975G9x.A19(r4, r2)
            X.GkD r3 = X.SQ1.A00(r3)
            java.lang.String r2 = "logging_policy"
            r4.A02(r3, r2)
            java.lang.String r3 = "checkout"
            java.lang.String r2 = "view_name"
            r4.A06(r2, r3)
            java.lang.Object r3 = r0.A01
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L_0x147b
            java.lang.String r2 = "credential_id"
            r4.A05(r2, r3)
        L_0x147b:
            java.lang.String r2 = "event_payload"
            r1.A0N(r4, r2)
            java.lang.Object r0 = r0.A03
            goto L_0x14cd
        L_0x1483:
            X.1Ln r1 = (X.1Ln) r1
            X.GkN r4 = new X.GkN
            r4.<init>()
            java.lang.String r3 = "incentive"
            java.lang.String r2 = "view_name"
            r4.A06(r2, r3)
            r2 = 640(0x280, float:8.97E-43)
            java.lang.String r3 = X.C66579MXk.A00(r2)
        L_0x1497:
            java.lang.String r2 = "target_name"
            r4.A06(r2, r3)
            java.lang.Object r3 = r0.A03
            java.util.List r3 = (java.util.List) r3
            r2 = 909(0x38d, float:1.274E-42)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r4.A07(r2, r3)
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            r2 = 666(0x29a, float:9.33E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r4.A07(r2, r3)
            java.lang.Object r2 = r0.A04
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r4, r2)
            X.GkD r3 = X.SQ1.A00(r2)
            java.lang.String r2 = "logging_policy"
            r4.A02(r3, r2)
            java.lang.String r2 = "event_payload"
            r1.A0N(r4, r2)
            java.lang.Object r0 = r0.A02
        L_0x14cd:
            X.C51969G9p.A1G(r1, r0)
            return r1
        L_0x14d1:
            java.util.List r1 = (java.util.List) r1
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
            r5 = 0
            if (r1 == 0) goto L_0x15d4
            java.util.Iterator r18 = r1.iterator()
            r6 = 0
        L_0x14e3:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x15dc
            java.lang.Object r1 = r18.next()
            com.google.common.collect.ImmutableMap r1 = (com.google.common.collect.ImmutableMap) r1
            X.0qQ.A0A(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r17 = r1.iterator()
        L_0x14fa:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x14e3
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r17)
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            X.GYy r1 = (X.C52599GYy) r1
            android.graphics.Bitmap r11 = r1.A00
            r4.put(r12, r11)
            java.lang.String r1 = r1.A01
            r7.add(r1)
            int r1 = r11.getByteCount()
            int r6 = r6 + r1
            java.lang.Object r2 = r0.A01
            X.Q1l r2 = (X.Q1l) r2
            X.0qQ.A0A(r12)
            java.lang.Object r1 = r0.A04
            X.Q1o r1 = (X.C7264Q1o) r1
            int r10 = r1.A00
            java.lang.Object r9 = r0.A03
            X.Q2X r9 = (X.Q2X) r9
            X.0qQ.A0B(r2, r5)
            X.C51972G9s.A1B(r12, r9)
            com.google.common.collect.ImmutableMap$Builder r8 = new com.google.common.collect.ImmutableMap$Builder
            r8.<init>()
            java.util.List r2 = r2.A04
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x14fa
            boolean r1 = r11.isRecycled()
            if (r1 != 0) goto L_0x14fa
            java.util.Iterator r16 = r2.iterator()
        L_0x154d:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x14fa
            java.lang.Object r1 = r16.next()
            X.GVl r1 = (X.C52508GVl) r1
            com.instagram.model.showreelnative.IgShowreelNativeAsset r3 = r1.A00
            java.lang.Integer r15 = r3.CGY()
            java.lang.Integer r14 = r3.BCu()
            java.lang.String r1 = r3.getUrl()
            if (r1 != 0) goto L_0x156b
            java.lang.String r1 = ""
        L_0x156b:
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto L_0x154d
            if (r15 == 0) goto L_0x154d
            if (r14 == 0) goto L_0x154d
            int r2 = r11.getWidth()
            int r13 = r11.getHeight()
            int r1 = r15.intValue()
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            if (r1 > r10) goto L_0x1593
            int r1 = r14.intValue()
            int r1 = r1 - r13
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r10) goto L_0x154d
        L_0x1593:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "act_w"
            r8.put(r1, r2)
            java.lang.String r2 = java.lang.String.valueOf(r13)
            java.lang.String r1 = "act_h"
            r8.put(r1, r2)
            java.lang.String r2 = r15.toString()
            java.lang.String r1 = "orig_w"
            r8.put(r1, r2)
            java.lang.String r2 = r14.toString()
            java.lang.String r1 = "orig_h"
            r8.put(r1, r2)
            java.lang.String r2 = r3.getUrl()
            if (r2 != 0) goto L_0x15bf
            java.lang.String r2 = ""
        L_0x15bf:
            java.lang.String r1 = "url"
            r8.put(r1, r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            com.google.common.collect.ImmutableMap r2 = r8.build()
            X.0qQ.A07(r2)
            java.lang.String r1 = ""
            r9.Dlm(r2, r3, r1)
            goto L_0x154d
        L_0x15d4:
            java.lang.String r2 = "IgShowreelNativeImageFetcher"
            java.lang.String r1 = "Image list is null"
            X.0KC.A0D(r2, r1)
            r6 = 0
        L_0x15dc:
            java.lang.Object r3 = r0.A02
            X.Q1n r3 = (X.C7263Q1n) r3
            com.google.common.collect.ImmutableList r1 = r3.A01
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x15f7
            java.lang.Object r2 = r0.A03
            X.Q2X r2 = (X.Q2X) r2
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x1611
            java.lang.String r0 = "unknown"
        L_0x15f4:
            r2.CwA(r0, r6)
        L_0x15f7:
            java.lang.String r6 = r3.A04
            byte[] r9 = new byte[r5]
            com.google.common.collect.ImmutableMap r8 = com.google.common.collect.ImmutableMap.copyOf(r4)
            X.0qQ.A07(r8)
            com.google.common.collect.ImmutableList r7 = r3.A02
            X.JwI r5 = r3.A00
            X.Mqd r4 = new X.Mqd
            r4.<init>(r5, r6, r7, r8, r9)
            X.1Ks r1 = new X.1Ks
            r1.<init>(r4)
            return r1
        L_0x1611:
            int r1 = r7.size()
            r0 = 1
            if (r1 != r0) goto L_0x1621
            java.util.Iterator r0 = r7.iterator()
            java.lang.String r0 = X.AnonymousClass7TE.A18(r0)
            goto L_0x15f4
        L_0x1621:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r7)
            java.lang.String r0 = "disk"
            r1.remove(r0)
            java.lang.String r0 = "memory"
            r1.remove(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x1639
            java.lang.String r0 = "cache"
            goto L_0x15f4
        L_0x1639:
            java.lang.String r0 = "mixed"
            goto L_0x15f4
        L_0x163c:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r6 = r0.A04
            X.PeW r6 = (X.C73540PeW) r6
            X.0eM r2 = r6.A04
            java.lang.Object r5 = r2.getValue()
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            java.lang.Object r4 = r0.A01
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.A03
            X.0sP r2 = (X.0sP) r2
            X.Pbc r0 = new X.Pbc
            r7 = r0
            r8 = r6
            r9 = r1
            r10 = r3
            r11 = r4
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            r5.execute(r0)
            return r1
        L_0x1667:
            java.lang.Object r4 = r0.A02
            X.Gc7 r4 = (X.C52754Gc7) r4
            X.5Oz r1 = r4.A0A
            boolean r1 = X.C51971G9r.A1W(r1)
            if (r1 == 0) goto L_0x1684
            java.lang.Object r3 = r0.A03
            X.5Ui r3 = (X.C286205Ui) r3
            java.lang.Object r2 = r0.A04
            X.5Tl r2 = (X.C285975Tl) r2
            X.Hpp r1 = r4.A0M
            java.lang.Object r0 = r0.A01
            X.5Uc r0 = (X.C286145Uc) r0
            X.C52754Gc7.A01(r4, r0, r2, r3, r1)
        L_0x1684:
            r0 = 1
            X.Gc5 r1 = new X.Gc5
            r1.<init>(r0)
            return r1
        L_0x168b:
            java.lang.Object r4 = r0.A03
            X.6H8 r4 = (X.AnonymousClass6H8) r4
            java.lang.Object r3 = r0.A02
            X.6I5 r3 = (X.AnonymousClass6I5) r3
            java.lang.Object r2 = r0.A04
            X.6I8 r2 = (X.AnonymousClass6I8) r2
            java.lang.Object r1 = r0.A01
            X.6IA r1 = (X.AnonymousClass6IA) r1
            X.6Io r0 = new X.6Io
            r0.<init>(r3, r1, r2)
            r4.A00 = r0
            r0 = 4
            X.GP2 r1 = new X.GP2
            r1.<init>(r4, r0)
            return r1
        L_0x16a9:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x16ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x16b1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x16b6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x16bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x16c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x16c5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x16c8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58769IxG.invoke(java.lang.Object):java.lang.Object");
    }
}
