package X;

/* renamed from: X.9Ly  reason: invalid class name and case insensitive filesystem */
public final class C377469Ly extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377469Ly(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03a7, code lost:
        r1.markerStart(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04ca, code lost:
        r17 = 0;
        r16 = 0.0f;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04ff, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x050d, code lost:
        r0 = (X.0sP) r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0511, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x053d, code lost:
        r13.A09(r14, r15, r16, r17, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0626, code lost:
        return X.AnonymousClass9IV.A00(X.C376459Ib.A00(r3, r2, (java.util.List) r1.A02), (X.C335907dj) r13.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06d9, code lost:
        return ((X.C250663lr) r4.A02).parseEnumList(r13, (java.lang.Enum) r4.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r0.invoke(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017a, code lost:
        r16 = 0.0f;
        r17 = r2;
        r18 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0740  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r4 = r19
            r13 = r20
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0551;
                case 1: goto L_0x0542;
                case 2: goto L_0x0515;
                case 3: goto L_0x07ad;
                case 4: goto L_0x0502;
                case 5: goto L_0x04e3;
                case 6: goto L_0x04d1;
                case 7: goto L_0x0793;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x04be;
                case 11: goto L_0x04b1;
                case 12: goto L_0x047b;
                case 13: goto L_0x077c;
                case 14: goto L_0x0765;
                case 15: goto L_0x0752;
                case 16: goto L_0x046a;
                case 17: goto L_0x0425;
                case 18: goto L_0x06da;
                case 19: goto L_0x0415;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03e0;
                case 22: goto L_0x03cd;
                case 23: goto L_0x03bf;
                case 24: goto L_0x03ac;
                case 25: goto L_0x06c1;
                case 26: goto L_0x06c7;
                case 27: goto L_0x0395;
                case 28: goto L_0x0366;
                case 29: goto L_0x0696;
                case 30: goto L_0x034b;
                case 31: goto L_0x02d1;
                case 32: goto L_0x0673;
                case 33: goto L_0x064b;
                case 34: goto L_0x05ca;
                case 35: goto L_0x0570;
                case 36: goto L_0x0278;
                case 37: goto L_0x0250;
                case 38: goto L_0x022a;
                case 39: goto L_0x0202;
                case 40: goto L_0x01ee;
                case 41: goto L_0x01dd;
                case 42: goto L_0x019b;
                case 43: goto L_0x0191;
                case 44: goto L_0x0182;
                case 45: goto L_0x0167;
                case 46: goto L_0x0156;
                case 47: goto L_0x00e4;
                case 48: goto L_0x00c6;
                case 49: goto L_0x001a;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r4.A02
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r13)
            java.lang.Object r0 = r4.A01
            X.0sP r0 = (X.0sP) r0
        L_0x0014:
            r0.invoke(r13)
        L_0x0017:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x001a:
            X.8ve r13 = (X.C369988ve) r13
            r3 = 0
            if (r13 == 0) goto L_0x0068
            X.8ka r0 = r13.A00()
            if (r0 == 0) goto L_0x0068
            X.8nd r0 = r0.A02
            if (r0 == 0) goto L_0x0068
            int r0 = r0.ordinal()
        L_0x002d:
            r1 = 1
            java.lang.String r2 = "Required value was null."
            if (r0 == r1) goto L_0x0084
            r1 = 0
            if (r0 == r1) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "onStoryDraftTapped() media type is not recognized mediaInfo: "
            r1.append(r0)
            if (r13 == 0) goto L_0x0066
            X.8ka r0 = r13.A00()
        L_0x0045:
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "GalleryGridDraftController"
            X.0kD.A07(r0, r1, r3)
            java.lang.Object r0 = r4.A02
            X.8hA r0 = (X.C361998hA) r0
            com.instagram.common.session.UserSession r0 = r0.A0F
            X.8nu r1 = X.C365918nt.A00(r0)
            java.lang.String r0 = "Unknown media type"
            r1.A01(r0)
            goto L_0x0017
        L_0x0066:
            r0 = r3
            goto L_0x0045
        L_0x0068:
            r0 = -1
            goto L_0x002d
        L_0x006a:
            java.lang.Object r5 = r4.A02
            X.8hA r5 = (X.C361998hA) r5
            X.8ka r0 = r13.A00()
            if (r0 == 0) goto L_0x07bf
            X.8Cl r0 = r0.A03
            if (r0 == 0) goto L_0x07bf
            X.8Cl r1 = r0.A02()
            java.lang.Object r0 = r4.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r5.A00(r0, r13, r1)
            goto L_0x009d
        L_0x0084:
            java.lang.Object r5 = r4.A02
            X.8hA r5 = (X.C361998hA) r5
            X.8ka r0 = r13.A00()
            if (r0 == 0) goto L_0x07c5
            X.7zv r0 = r0.A04
            if (r0 == 0) goto L_0x07c5
            X.7zv r1 = r0.A03()
            java.lang.Object r0 = r4.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r5.A01(r0, r13, r1)
        L_0x009d:
            com.instagram.common.session.UserSession r3 = r5.A0F
            boolean r0 = X.C3505585e.A01(r3)
            if (r0 != 0) goto L_0x0017
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320253499678855(0x81091400002087, double:3.03241279089436E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0017
            X.8hG r1 = r5.A05
            if (r1 != 0) goto L_0x00c0
            java.lang.String r0 = "delegate"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c0:
            r0 = 0
            r1.A0g(r0)
            goto L_0x0017
        L_0x00c6:
            com.instagram.common.recyclerview.ViewModelListUpdate r13 = (com.instagram.common.recyclerview.ViewModelListUpdate) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r2 = r4.A01
            X.2tB r2 = (X.AnonymousClass2tB) r2
            java.lang.Object r1 = r4.A02
            X.8hz r1 = (X.C362488hz) r1
            java.util.List r0 = X.C362488hz.A0H
            X.2t9 r0 = r1.A06
            if (r2 == 0) goto L_0x00df
            r0.A06(r13, r2)
            goto L_0x0017
        L_0x00df:
            r0.A05(r13)
            goto L_0x0017
        L_0x00e4:
            com.instagram.common.gallery.Medium r13 = (com.instagram.common.gallery.Medium) r13
            if (r13 == 0) goto L_0x0133
            X.A80 r8 = X.C394249xm.A00()
            r2 = 1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 15000(0x3a98, float:2.102E-41)
            X.A6d r7 = new X.A6d
            r7.<init>(r13, r1, r0, r2)
            java.lang.Object r6 = r4.A02
            X.87i r6 = (X.C3510387i) r6
            android.content.Context r5 = r6.A0F
            java.lang.Object r4 = r4.A01
            X.87s r4 = (X.C3511387s) r4
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r3 = r6.A0T
            android.widget.FrameLayout$LayoutParams r0 = r8.A06
            r3.setLayoutParams(r0)
            X.C3510387i.A04(r6, r8)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r6.A0U
            r2 = 0
            r0.setVisibility(r2)
            r3.setVisibility(r2)
            android.view.TextureView r0 = r6.A0G
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.A0I
            r0.setVisibility(r1)
            android.view.View r1 = r6.A0H
            boolean r0 = r4.A0M()
            if (r0 != 0) goto L_0x0129
            r2 = 8
        L_0x0129:
            r1.setVisibility(r2)
            X.87n r0 = r6.A0P
            r0.A03(r5, r7, r3)
            goto L_0x0017
        L_0x0133:
            java.lang.Object r0 = r4.A01
            X.87s r0 = (X.C3511387s) r0
            X.4gw r0 = r0.A04
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r4.A02
            X.87i r0 = (X.C3510387i) r0
            X.87n r2 = r0.A0P
            java.lang.String r1 = "hide"
            X.4M3 r0 = r2.A01
            if (r0 == 0) goto L_0x014a
            r0.E21(r1)
        L_0x014a:
            X.4M3 r0 = r2.A01
            if (r0 == 0) goto L_0x0151
            r0.ECP(r1)
        L_0x0151:
            r0 = 0
            r2.A01 = r0
            goto L_0x0017
        L_0x0156:
            X.4cl r13 = (X.C268104cl) r13
            r2 = 0
            X.0qQ.A0B(r13, r2)
            java.lang.Object r14 = r4.A01
            X.4cY r14 = (X.C267974cY) r14
            java.lang.Object r0 = r4.A02
            X.5WL r0 = (X.AnonymousClass5WL) r0
            X.0sP r15 = r0.A0F
            goto L_0x017a
        L_0x0167:
            X.4cl r13 = (X.C268104cl) r13
            r2 = 0
            X.0qQ.A0B(r13, r2)
            java.lang.Object r14 = r4.A01
            X.4cY r14 = (X.C267974cY) r14
            java.lang.Object r1 = r4.A02
            r0 = 43
            X.J6I r15 = new X.J6I
            r15.<init>(r1, r0)
        L_0x017a:
            r16 = 0
            r17 = r2
            r18 = r2
            goto L_0x053d
        L_0x0182:
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r4.A01
            X.5Oz r0 = (X.C284945Oz) r0
            r0.Epw(r13)
            java.lang.Object r0 = r4.A02
            goto L_0x0249
        L_0x0191:
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r4.A02
            X.5Oz r0 = (X.C284945Oz) r0
            goto L_0x050a
        L_0x019b:
            X.5SW r13 = (X.AnonymousClass5SW) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r1 = r4.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r4.A01
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x01b6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d6
            java.lang.Object r3 = r4.next()
            X.62b r3 = (X.C3022062b) r3
            java.lang.Object r2 = r3.A02
            java.lang.String r2 = (java.lang.String) r2
            r0 = 13
            X.GNG r1 = new X.GNG
            r1.<init>(r0, r3, r6)
            X.6Eq r0 = new X.6Eq
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x01b6
        L_0x01d6:
            X.5Sb r0 = X.C290125en.A03
            r13.ENH(r0, r5)
            goto L_0x0017
        L_0x01dd:
            java.lang.Object r2 = r4.A02
            X.1GP r2 = (X.1GP) r2
            java.lang.Object r1 = r4.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.concurrent.CopyOnWriteArraySet r0 = r2.A04
            r0.remove(r1)
            goto L_0x0017
        L_0x01ee:
            java.lang.Number r13 = (java.lang.Number) r13
            int r2 = r13.intValue()
            java.lang.Object r0 = r4.A02
            com.instagram.common.api.base.CacheBehaviorLogger r0 = (com.instagram.common.api.base.CacheBehaviorLogger) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r1 = r0.logger
            java.lang.Object r0 = r4.A01
            X.1QS r0 = (X.1QS) r0
            int r0 = r0.A04
            goto L_0x03a7
        L_0x0202:
            X.2WE r13 = (X.2WE) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r6 = r4.A02
            X.7eh r6 = (X.C336487eh) r6
            X.6nL r5 = r6.A03
            int r0 = r6.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.instagram.common.session.UserSession r1 = r6.A02
            X.0iw r0 = r6.A01
            java.lang.Object r3 = r4.A01
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r2, r1, r0, r3}
            r1 = 22
            X.JG1 r0 = new X.JG1
            r0.<init>(r1, r3, r6)
            r13.A02(r0, r2)
            goto L_0x0017
        L_0x022a:
            java.lang.Object r0 = r4.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r1 = r0.A05
            r0 = 2131430533(0x7f0b0c85, float:1.848277E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.view.View r13 = r1.A03(r0)
            if (r13 == 0) goto L_0x0017
            java.lang.Object r0 = r4.A02
            X.7g3 r0 = (X.AnonymousClass7g3) r0
            X.9IQ r0 = r0.A00
            java.lang.Object r0 = r0.A00
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A01
        L_0x0249:
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r13)
            goto L_0x0017
        L_0x0250:
            java.lang.Object r5 = r4.A01
            X.3Y5 r5 = (X.AnonymousClass3Y5) r5
            X.2V1 r3 = r5.A05
            r0 = 1772(0x6ec, float:2.483E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.Object r2 = r4.A02
            X.7hK r2 = (X.C338047hK) r2
            X.7dj r0 = r2.A00
            java.lang.String r0 = r0.A0K
            java.lang.String r0 = X.002.A0R(r1, r0)
            android.view.View r1 = r3.A03(r0)
            if (r1 == 0) goto L_0x0017
            X.Aom r0 = new X.Aom
            r0.<init>(r1, r5, r2)
            r1.post(r0)
            goto L_0x0017
        L_0x0278:
            java.lang.Object r1 = r4.A01
            X.2Wa r1 = (X.2Wa) r1
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01(r0)
            java.lang.Object r0 = r4.A02
            X.7fI r0 = (X.C336857fI) r0
            X.GgO r2 = r0.A01
            if (r2 == 0) goto L_0x0017
            X.0iw r1 = r0.A02
            r0 = 2
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.7a5 r0 = r2.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x02cf
            X.1Xj r5 = r0.BPf()
        L_0x02a0:
            X.GmL r4 = r2.A08
            java.lang.Integer r3 = r4.A04
            if (r5 == 0) goto L_0x0017
            X.7a0 r2 = r2.A0C
            java.lang.Integer r1 = r4.A06
            java.lang.Integer r0 = r4.A05
            java.lang.String r9 = r4.A0A
            java.lang.String r10 = r4.A0D
            com.instagram.common.session.UserSession r4 = r2.A02
            X.4DU r6 = r2.A03
            if (r3 == 0) goto L_0x02cd
            int r11 = r3.intValue()
        L_0x02ba:
            int r0 = X.C333717a0.A00(r1, r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 2140(0x85c, float:2.999E-42)
            java.lang.String r8 = X.C273654mx.A00(r0)
            X.C233822wX.A0S(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0017
        L_0x02cd:
            r11 = -1
            goto L_0x02ba
        L_0x02cf:
            r5 = 0
            goto L_0x02a0
        L_0x02d1:
            X.1Xl r13 = (X.1Xl) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r4.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r0
            com.instagram.common.session.UserSession r2 = r0.A0B
            X.1Ng r6 = X.AnonymousClass1Nd.A00(r2)
            X.1Xj r5 = r13.BPf()
            java.lang.Object r4 = r4.A01
            java.util.Set r4 = (java.util.Set) r4
            r0 = 10
            int r0 = X.0Yv.A1E(r4, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r7 = r4.iterator()
        L_0x02f8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0322
            java.lang.Object r3 = r7.next()
            java.lang.String r3 = (java.lang.String) r3
            X.1Xj r1 = r13.BPf()
            X.3pr r0 = X.C252883pr.Deleted
            r1.A43(r0, r3)
            X.D9g r0 = X.C65211bM.A00
            X.DDf r0 = r0.A00()
            r0.A0r = r3
            X.1bK r1 = r0.A02()
            X.3gp r0 = new X.3gp
            r0.<init>(r1)
            r8.add(r0)
            goto L_0x02f8
        L_0x0322:
            java.util.Set r1 = X.00k.A0k(r8)
            X.Lfv r0 = new X.Lfv
            r0.<init>(r5, r1)
            r6.A00(r0)
            X.1Xj r1 = r13.BPf()
            int r0 = r4.size()
            r1.A3t(r0)
            X.1Xj r0 = r13.BPf()
            X.1i5 r0 = r0.A0d
            r0.A01()
            X.1Xj r0 = r13.BPf()
            r0.AE7(r2)
            goto L_0x0017
        L_0x034b:
            X.0xY r13 = (X.0xY) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r4.A02
            X.9F8 r0 = (X.AnonymousClass9F8) r0
            java.lang.String r3 = "whatsapp_business_info"
            X.3mB r2 = r0.A01
            java.lang.Object r1 = r4.A01
            X.9Gf r0 = X.C376019Gf.A00
            java.lang.String r0 = r2.A02(r1, r0)
            r13.E5g(r3, r0)
            goto L_0x0017
        L_0x0366:
            android.content.Intent r13 = (android.content.Intent) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.String r1 = r13.getAction()
            r0 = 129(0x81, float:1.81E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0017
            r0 = 503(0x1f7, float:7.05E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r13.hasCategory(r0)
            if (r0 == 0) goto L_0x0017
            java.lang.Object r1 = r4.A01
            X.1KS r1 = (X.1KS) r1
            java.lang.Object r0 = r4.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r1.A04(r0)
            goto L_0x0017
        L_0x0395:
            java.lang.Number r13 = (java.lang.Number) r13
            int r2 = r13.intValue()
            java.lang.Object r0 = r4.A02
            com.instagram.api.tigon.IGTigonQuickPerformanceLogger r0 = (com.instagram.api.tigon.IGTigonQuickPerformanceLogger) r0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r1 = r0.logger
            java.lang.Object r0 = r4.A01
            int r0 = r0.hashCode()
        L_0x03a7:
            r1.markerStart(r2, r0)
            goto L_0x0017
        L_0x03ac:
            X.2WY r13 = (X.AnonymousClass2WY) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r1 = r4.A02
            X.2V1 r1 = (X.2V1) r1
            java.lang.Object r0 = r4.A01
            X.2TC r0 = (X.2TC) r0
            r13.ABy(r0, r1)
            goto L_0x0017
        L_0x03bf:
            java.lang.Object r0 = r4.A02
            X.3XH r0 = (X.AnonymousClass3XH) r0
            java.util.concurrent.atomic.AtomicReference r2 = r0.A04
            java.lang.Object r1 = r4.A01
            r0 = 0
            X.1FH.A00(r1, r0, r2)
            goto L_0x0017
        L_0x03cd:
            java.lang.Object r0 = r4.A01
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
            if (r0 == 0) goto L_0x03d6
            r0.cancel()
        L_0x03d6:
            java.lang.Object r1 = r4.A02
            X.4Co r1 = (X.C262204Co) r1
            r0 = 0
            r1.AG7(r0)
            goto L_0x0017
        L_0x03e0:
            java.lang.Object r1 = r4.A01
            X.2Fk r1 = (X.2Fk) r1
            java.lang.Object r0 = r4.A02
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r13)
            r1.A0B(r0)
            goto L_0x0017
        L_0x03f1:
            java.lang.Object r3 = r4.A02
            X.2Fk r3 = (X.2Fk) r3
            java.lang.Object r2 = r3.A02()
            java.lang.Object r1 = r4.A01
            X.0r1 r1 = (X.0r1) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x040d
            if (r2 != 0) goto L_0x0407
            if (r20 != 0) goto L_0x040d
            goto L_0x0017
        L_0x0407:
            boolean r0 = r2.equals(r13)
            if (r0 != 0) goto L_0x0017
        L_0x040d:
            r0 = 0
            r1.A00 = r0
            r3.A0B(r13)
            goto L_0x0017
        L_0x0415:
            java.lang.Object r0 = r4.A02
            X.5Uw r0 = (X.C286325Uw) r0
            X.5Ux r2 = r0.A01
            java.lang.Object r1 = r4.A01
            monitor-enter(r2)
            X.5Uy r0 = r0.A00     // Catch:{ all -> 0x07d8 }
            r0.A02(r1, r13)     // Catch:{ all -> 0x07d8 }
            goto L_0x04ff
        L_0x0425:
            X.5XH r13 = (X.AnonymousClass5XH) r13
            java.lang.Object r5 = r4.A02
            X.5XC r5 = (X.AnonymousClass5XC) r5
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0017
            X.07Z r0 = r13.A00
            X.07V r1 = r0.getLifecycle()
            java.lang.Object r4 = r4.A01
            X.0sL r4 = (X.0sL) r4
            r5.A01 = r4
            X.07V r0 = r5.A00
            if (r0 != 0) goto L_0x0446
            r5.A00 = r1
            r1.A09(r5)
            goto L_0x0017
        L_0x0446:
            X.07U r1 = r1.A07()
            X.07U r0 = X.07U.A01
            int r1 = r1.compareTo(r0)
            r0 = 0
            if (r1 < 0) goto L_0x0454
            r0 = 1
        L_0x0454:
            if (r0 == 0) goto L_0x0017
            X.5Pk r3 = r5.A03
            r2 = -2000640158(0xffffffff88c0a762, float:-1.1594931E-33)
            r1 = 7
            X.JGF r0 = new X.JGF
            r0.<init>(r1, r4, r5)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r0, r2)
            r3.ESi(r0)
            goto L_0x0017
        L_0x046a:
            java.lang.Object r0 = r4.A02
            X.5PM r0 = (X.AnonymousClass5PM) r0
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r0.A08
            monitor-enter(r1)
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x07cb }
            r0.remove(r2)     // Catch:{ all -> 0x07cb }
            monitor-exit(r1)
            goto L_0x0017
        L_0x047b:
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            int r0 = r13.getActionMasked()
            if (r0 != 0) goto L_0x04a4
            java.lang.Object r1 = r4.A01
            X.5bm r1 = (X.C288355bm) r1
            java.lang.Object r0 = r4.A02
            X.5bk r0 = (X.C288335bk) r0
            X.0sP r0 = r0.A01
            if (r0 == 0) goto L_0x07ce
            java.lang.Object r0 = r0.invoke(r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04a1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x049d:
            r1.A01 = r0
            goto L_0x0017
        L_0x04a1:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x049d
        L_0x04a4:
            java.lang.Object r0 = r4.A02
            X.5bk r0 = (X.C288335bk) r0
            X.0sP r0 = r0.A01
            if (r0 == 0) goto L_0x07ce
            r0.invoke(r13)
            goto L_0x0017
        L_0x04b1:
            X.4cl r13 = (X.C268104cl) r13
            java.lang.Object r14 = r4.A01
            X.4cY r14 = (X.C267974cY) r14
            java.lang.Object r0 = r4.A02
            X.4dP r0 = (X.C268444dP) r0
            X.0sP r15 = r0.A09
            goto L_0x04ca
        L_0x04be:
            X.4cl r13 = (X.C268104cl) r13
            java.lang.Object r14 = r4.A01
            X.4cY r14 = (X.C267974cY) r14
            java.lang.Object r0 = r4.A02
            X.4dN r0 = (X.C268424dN) r0
            X.0sP r15 = r0.A00
        L_0x04ca:
            r17 = 0
            r16 = 0
            r18 = r17
            goto L_0x053d
        L_0x04d1:
            java.lang.Object r0 = r4.A01
            X.5Pj r0 = (X.C285025Pj) r0
            r0.EAz(r13)
            java.lang.Object r0 = r4.A02
            X.0vq r0 = (X.0vq) r0
            if (r0 == 0) goto L_0x0017
            r0.A09(r13)
            goto L_0x0017
        L_0x04e3:
            java.lang.Object r3 = r4.A02
            X.5Pi r3 = (X.C285015Pi) r3
            java.lang.Object r2 = r3.A04
            java.lang.Object r1 = r4.A01
            monitor-enter(r2)
            java.util.List r0 = r3.A01     // Catch:{ all -> 0x07d8 }
            r0.remove(r1)     // Catch:{ all -> 0x07d8 }
            java.util.List r0 = r3.A01     // Catch:{ all -> 0x07d8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x07d8 }
            if (r0 == 0) goto L_0x04ff
            X.4dV r1 = r3.A03     // Catch:{ all -> 0x07d8 }
            r0 = 0
            r1.set(r0)     // Catch:{ all -> 0x07d8 }
        L_0x04ff:
            monitor-exit(r2)
            goto L_0x0017
        L_0x0502:
            java.lang.Object r0 = r4.A02
            X.I0h r0 = (X.I0h) r0
            if (r0 == 0) goto L_0x050d
            X.5Oz r0 = r0.A01
        L_0x050a:
            r0.Epw(r13)
        L_0x050d:
            java.lang.Object r0 = r4.A01
            X.0sP r0 = (X.0sP) r0
            if (r0 == 0) goto L_0x0017
            goto L_0x0014
        L_0x0515:
            X.4cl r13 = (X.C268104cl) r13
            java.lang.Object r14 = r4.A01
            X.4cY r14 = (X.C267974cY) r14
            java.lang.Object r2 = r4.A02
            X.5WU r2 = (X.AnonymousClass5WU) r2
            X.5b4 r0 = r2.A05
            X.5b5 r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r1 = -r0
            float r0 = X.AnonymousClass5WU.A00(r2)
            float r1 = r1 * r0
            int r17 = X.AnonymousClass1GB.A01(r1)
            r18 = 0
            r16 = 0
            X.0sP r15 = X.AnonymousClass5SD.A01
        L_0x053d:
            r13.A09(r14, r15, r16, r17, r18)
            goto L_0x0017
        L_0x0542:
            java.lang.Object r0 = r4.A02
            X.5aT r0 = (X.C287605aT) r0
            java.lang.Object r1 = r4.A01
            X.5aS r0 = (X.AnonymousClass5aS) r0
            X.0V2 r0 = r0.A00
            r0.FIA(r1)
            goto L_0x0017
        L_0x0551:
            X.64v r13 = (X.C3026764v) r13
            java.lang.Object r3 = r4.A01
            X.0sL r3 = (X.0sL) r3
            X.5Oz r0 = r13.A06
            java.lang.Object r2 = r0.getValue()
            java.lang.Object r0 = r4.A02
            X.5an r0 = (X.C287805an) r0
            X.5am r0 = (X.C287795am) r0
            X.0sP r1 = r0.A00
            X.5af r0 = r13.A02
            java.lang.Object r0 = r1.invoke(r0)
            r3.invoke(r2, r0)
            goto L_0x0017
        L_0x0570:
            X.9IV r13 = (X.AnonymousClass9IV) r13
            r5 = 0
            X.0qQ.A0B(r13, r5)
            java.lang.Object r1 = r13.A00
            X.9Ib r1 = (X.C376459Ib) r1
            java.lang.Object r0 = r1.A00
            X.7dk r0 = (X.C335917dk) r0
            java.lang.Object r2 = r4.A01
            java.lang.Number r2 = (java.lang.Number) r2
            int r3 = r2.intValue()
            if (r3 == r5) goto L_0x05b1
            r2 = 1
            if (r3 != r2) goto L_0x05c4
            java.lang.Object r4 = r4.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            boolean r10 = r0.A08
            int r8 = r0.A01
            java.lang.String r6 = r0.A04
            boolean r11 = r0.A07
            int r9 = r0.A00
            java.lang.String r7 = r0.A05
            java.lang.Integer r5 = r0.A02
        L_0x059d:
            boolean r12 = r0.A06
            r0 = 3
            X.0qQ.A0B(r4, r0)
            r0 = 7
            X.0qQ.A0B(r5, r0)
            X.7dk r3 = new X.7dk
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r1.A01
            java.util.List r2 = (java.util.List) r2
            goto L_0x0616
        L_0x05b1:
            java.lang.Object r5 = r4.A02
            java.lang.Integer r5 = (java.lang.Integer) r5
            boolean r10 = r0.A08
            int r8 = r0.A01
            java.lang.String r6 = r0.A04
            java.lang.Integer r4 = r0.A03
            boolean r11 = r0.A07
            int r9 = r0.A00
            java.lang.String r7 = r0.A05
            goto L_0x059d
        L_0x05c4:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x05ca:
            X.9IV r13 = (X.AnonymousClass9IV) r13
            r2 = 0
            X.0qQ.A0B(r13, r2)
            java.lang.Object r1 = r13.A00
            X.9Ib r1 = (X.C376459Ib) r1
            java.lang.Object r0 = r4.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            r5 = 1
            if (r6 == r5) goto L_0x063a
            if (r6 != r2) goto L_0x0645
            java.lang.Object r2 = r1.A01
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r3 = r4.A02
            X.9bi r3 = (X.C381409bi) r3
            java.util.List r0 = r3.A01
        L_0x05eb:
            java.util.ArrayList r2 = X.00k.A0S(r0, r2)
            X.7dk r3 = r3.A00
            java.lang.Object r0 = r1.A00
            X.7dk r0 = (X.C335917dk) r0
            if (r6 == r5) goto L_0x0627
            boolean r11 = r3.A07
            java.lang.String r7 = r3.A05
            int r9 = r3.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            boolean r12 = r3.A06
            boolean r10 = r0.A08
            int r8 = r0.A01
            java.lang.String r6 = r0.A04
            java.lang.Integer r4 = r0.A03
        L_0x0609:
            r0 = 3
            X.0qQ.A0B(r4, r0)
            r0 = 7
            X.0qQ.A0B(r5, r0)
            X.7dk r3 = new X.7dk
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0616:
            java.lang.Object r0 = r1.A02
            java.util.List r0 = (java.util.List) r0
            X.9Ib r1 = X.C376459Ib.A00(r3, r2, r0)
            java.lang.Object r0 = r13.A01
            X.7dj r0 = (X.C335907dj) r0
            X.9IV r4 = X.AnonymousClass9IV.A00(r1, r0)
            return r4
        L_0x0627:
            boolean r10 = r3.A08
            java.lang.String r6 = r3.A04
            int r8 = r3.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            boolean r12 = r3.A06
            boolean r11 = r0.A07
            int r9 = r0.A00
            java.lang.String r7 = r0.A05
            java.lang.Integer r5 = r0.A02
            goto L_0x0609
        L_0x063a:
            java.lang.Object r3 = r4.A02
            X.9bi r3 = (X.C381409bi) r3
            java.util.List r2 = r3.A01
            java.lang.Object r0 = r1.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            goto L_0x05eb
        L_0x0645:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x064b:
            X.7aH r13 = (X.C333867aH) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r5 = r4.A02
            java.lang.Object r0 = r4.A01
            X.GnY r0 = (X.C53401GnY) r0
            java.lang.String r3 = r0.A04
            java.lang.Object r2 = r0.A00
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r0 = 2
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            r1 = 34
            X.9Ly r0 = new X.9Ly
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r2)
            X.7aH r4 = X.C335067cK.A08(r13, r3, r0)
            return r4
        L_0x0673:
            X.7aH r13 = (X.C333867aH) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r2 = r4.A02
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r1 = r4.A01
            java.util.Set r1 = (java.util.Set) r1
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r13.A06
            java.util.List r1 = X.C335067cK.A0B(r0, r2, r1)
            r0 = 8190(0x1ffe, float:1.1477E-41)
            X.7aH r4 = X.C333867aH.A00((X.C61081JwJ) null, (X.C333847aF) null, (X.C333817aC) null, r13, r1, (java.util.List) null, 0, r0, false, false)
            return r4
        L_0x0696:
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r0 = r4.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != 0) goto L_0x06bc
            java.lang.Object r1 = r4.A02
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = r13.getId()
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L_0x06bc
            r2 = 0
        L_0x06bc:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L_0x06c1:
            com.google.common.collect.ImmutableList r13 = (com.google.common.collect.ImmutableList) r13
            if (r13 != 0) goto L_0x06cd
            r4 = 0
            return r4
        L_0x06c7:
            com.google.common.collect.ImmutableList r13 = (com.google.common.collect.ImmutableList) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
        L_0x06cd:
            java.lang.Object r1 = r4.A02
            X.3lr r1 = (X.C250663lr) r1
            java.lang.Object r0 = r4.A01
            java.lang.Enum r0 = (java.lang.Enum) r0
            com.google.common.collect.ImmutableList r4 = r1.parseEnumList(r13, r0)
            return r4
        L_0x06da:
            java.lang.Object r2 = r4.A01
            X.5i5 r2 = (X.C291915i5) r2
            X.4dQ r1 = r2.A02
            if (r1 == 0) goto L_0x0723
            boolean r0 = r1 instanceof X.C268464dR
            if (r0 != 0) goto L_0x0723
            boolean r0 = r1 instanceof X.C268484dT
            if (r0 == 0) goto L_0x070f
            X.4dT r1 = (X.C268484dT) r1
            X.5ZD r5 = r2.A03
            int r4 = r2.A00
            java.lang.String r2 = r1.A00
            r1 = 0
            r0 = 0
            if (r4 != r1) goto L_0x06f7
            r0 = 1
        L_0x06f7:
            if (r0 == 0) goto L_0x0736
            X.5ZD r0 = X.AnonymousClass5ZD.A04
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0736
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0736
        L_0x0707:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
        L_0x0709:
            X.4gV r4 = new X.4gV
            r4.<init>(r0)
            return r4
        L_0x070f:
            boolean r0 = r1 instanceof X.C303986Bo
            if (r0 == 0) goto L_0x0746
            X.6Bo r1 = (X.C303986Bo) r1
            X.6Bn r1 = r1.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface"
            X.0qQ.A0C(r1, r0)
            X.6Bm r1 = (X.C303966Bm) r1
            X.6Bl r1 = (X.C303956Bl) r1
            android.graphics.Typeface r0 = r1.A00
            goto L_0x0709
        L_0x0723:
            X.5ZD r5 = r2.A03
            int r4 = r2.A00
            r0 = 0
            if (r4 != r0) goto L_0x0733
            X.5ZD r0 = X.AnonymousClass5ZD.A04
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 == 0) goto L_0x0733
            goto L_0x0707
        L_0x0733:
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
            goto L_0x073a
        L_0x0736:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r2, r1)
        L_0x073a:
            int r2 = r5.A00
            r1 = 1
            r0 = 0
            if (r4 != r1) goto L_0x0741
            r0 = 1
        L_0x0741:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r2, r0)
            goto L_0x0709
        L_0x0746:
            r0 = 1225(0x4c9, float:1.717E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0752:
            java.lang.Object r3 = r4.A01
            X.JLO r3 = (X.JLO) r3
            java.lang.Object r2 = r4.A02
            r1 = 49
            X.Ivr r0 = new X.Ivr
            r0.<init>(r2, r1)
            X.Hnb r4 = new X.Hnb
            r4.<init>(r3, r0)
            return r4
        L_0x0765:
            java.lang.Object r2 = r4.A02
            android.content.Context r2 = (android.content.Context) r2
            android.content.Context r0 = r2.getApplicationContext()
            java.lang.Object r1 = r4.A01
            X.5Y9 r1 = (X.AnonymousClass5Y9) r1
            r0.registerComponentCallbacks(r1)
            r0 = 10
            X.GOz r4 = new X.GOz
            r4.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r1)
            return r4
        L_0x077c:
            java.lang.Object r2 = r4.A02
            android.content.Context r2 = (android.content.Context) r2
            android.content.Context r0 = r2.getApplicationContext()
            java.lang.Object r1 = r4.A01
            X.5Y7 r1 = (X.AnonymousClass5Y7) r1
            r0.registerComponentCallbacks(r1)
            r0 = 9
            X.GOz r4 = new X.GOz
            r4.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r1)
            return r4
        L_0x0793:
            X.5P8 r13 = (X.AnonymousClass5P8) r13
            java.lang.Object r1 = X.AnonymousClass5P3.A07
            monitor-enter(r1)
            int r2 = X.AnonymousClass5P3.A00     // Catch:{ all -> 0x07cb }
            int r0 = r2 + 1
            X.AnonymousClass5P3.A00 = r0     // Catch:{ all -> 0x07cb }
            monitor-exit(r1)
            java.lang.Object r1 = r4.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r4.A02
            X.0sP r0 = (X.0sP) r0
            X.5PD r4 = new X.5PD
            r4.<init>(r13, r1, r0, r2)
            return r4
        L_0x07ad:
            java.lang.Object r2 = r4.A02
            X.6Hz r2 = (X.C305436Hz) r2
            java.util.Set r0 = r2.A02
            java.lang.Object r1 = r4.A01
            r0.remove(r1)
            r0 = 5
            X.GOz r4 = new X.GOz
            r4.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r1)
            return r4
        L_0x07bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x07c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x07cb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x07ce:
            java.lang.String r0 = "onTouchEvent"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x07d8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377469Ly.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377469Ly(0sP r2, 0sP r3, int i) {
        super(1);
        this.A00 = i;
        if (7 - i != 0) {
            this.A02 = r2;
            this.A01 = r3;
        } else {
            this.A01 = r2;
            this.A02 = r3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377469Ly(C284945Oz r2, 0sP r3, int i) {
        super(1);
        this.A00 = i;
        if (43 - i != 0) {
            this.A01 = r2;
            this.A02 = r3;
        } else {
            this.A02 = r2;
            this.A01 = r3;
        }
    }
}
