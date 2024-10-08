package X;

/* renamed from: X.UfR  reason: case insensitive filesystem */
public final class C15599UfR extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C15599UfR(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj4;
    }

    public final void onFail(C268654dm r8) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass7TG.A0D(r8, 649122615);
                Throwable A012 = r8.A01();
                if (A012 != null) {
                    ((WO0) this.A04).A02.A01((AnonymousClass9F2) this.A01, A012.getMessage());
                    ((AnonymousClass9FE) this.A02).onError(A012);
                }
                i2 = 908216994;
                break;
            case 1:
                i = AnonymousClass7TG.A0D(r8, 1499310245);
                Throwable A013 = r8.A01();
                if (A013 != null) {
                    ((WO1) this.A04).A02.A01((AnonymousClass9F2) this.A01, A013.getMessage());
                    ((AnonymousClass9FE) this.A02).onError(A013);
                }
                i2 = 1484144389;
                break;
            case 2:
                i = AnonymousClass7TG.A0D(r8, 220363170);
                Throwable A014 = r8.A01();
                if (A014 != null) {
                    ((C14248TsV) this.A04).A02.A01((AnonymousClass9F2) this.A01, A014.getMessage());
                    ((AnonymousClass9FE) this.A02).onError(A014);
                }
                i2 = -1497225894;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r8, 87904811);
                Throwable A015 = r8.A01();
                if (A015 != null) {
                    ((VZF) this.A04).A01.A02((AnonymousClass9F2) this.A01, AnonymousClass05K.A00, A015.getMessage());
                    ((AnonymousClass9FE) this.A02).onError(A015);
                }
                i2 = -1047113546;
                break;
            default:
                C15599UfR.super.onFail(r8);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0115, code lost:
        if (r10 == null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0132, code lost:
        if (r12 != null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013a, code lost:
        if (r18 == null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013c, code lost:
        r18 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013e, code lost:
        if (r10 == null) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0140, code lost:
        r16 = r10.A08(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0146, code lost:
        if (r16 != null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0148, code lost:
        r16 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014a, code lost:
        if (r10 == null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014c, code lost:
        r17 = r10.getOptionalStringField(0, "strong_id__");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0152, code lost:
        if (r17 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0154, code lost:
        r17 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0156, code lost:
        r8 = r9.A03(r7, "xfb_one_link_monoschema(input:$input)", 2065835488);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015d, code lost:
        if (r8 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015f, code lost:
        r7 = r8.A03(X.C42294BYl.class, "page_info", 12626092);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016a, code lost:
        if (r7 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016c, code lost:
        r19 = r7.getCoercedBooleanField(3, X.AnonymousClass000.A00(668));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0177, code lost:
        r13 = new com.instagram.business.onelink.cache.FBPageCacheInfo(r14, r15, r16, r17, r18, r19);
        r8 = r4.A00;
        X.0xW.A09(r8.A00, new X.C59101J6j(18, (java.lang.Object) r8, (java.lang.Object) r13));
        r4.A03.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0190, code lost:
        r19 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r21) {
        /*
            r20 = this;
            r3 = r20
            r1 = r21
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x03bf;
                case 1: goto L_0x02dc;
                case 2: goto L_0x01a4;
                case 3: goto L_0x0049;
                case 4: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C15599UfR.super.onSuccess(r1)
            return
        L_0x000d:
            r0 = -928851721(0xffffffffc8a2d8f7, float:-333511.72)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 1643985431(0x61fd3a17, float:5.839015E20)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r3.A03
            X.0px r1 = (X.0px) r1
            java.lang.Object r0 = r3.A02
            X.Cv2 r0 = (X.C45360Cv2) r0
            java.lang.String r0 = r0.A01
            r1.A0B(r0)
            java.lang.Object r0 = r3.A04
            X.WWM r0 = (X.WWM) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Object r1 = r3.A01
            X.WaO r1 = (X.C19476WaO) r1
            X.WQE r0 = new X.WQE
            r0.<init>(r1)
            r4.A00(r0)
            r0 = 602526040(0x23e9d158, float:2.5350571E-17)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1004019725(0x3bd8200d, float:0.0065956176)
            goto L_0x0477
        L_0x0049:
            r0 = 1938537204(0x738bbaf4, float:2.2141148E31)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.3JC r1 = (X.AnonymousClass3JC) r1
            r0 = -137954328(0xfffffffff7c6fbe8, float:-8.0717503E33)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r1, r8)
            java.lang.Object r4 = r3.A04
            X.VZF r4 = (X.VZF) r4
            java.lang.Object r10 = r3.A03
            X.9JK r10 = (X.AnonymousClass9JK) r10
            java.lang.Object r7 = r3.A01
            X.9F2 r7 = (X.AnonymousClass9F2) r7
            java.lang.Object r6 = r3.A02
            X.9FE r6 = (X.AnonymousClass9FE) r6
            java.lang.Object r9 = r1.A01
            X.3lr r9 = (X.C250663lr) r9
            if (r9 != 0) goto L_0x0088
            X.AH0 r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.AnonymousClass7TF.A1H(r10, r7)
            X.AH0.A01(r10, r1, r7, r0)
        L_0x007d:
            r0 = -1541653196(0xffffffffa41c3d34, float:-3.387895E-17)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1439154829(0xffffffffaa383d73, float:-1.6363802E-13)
            goto L_0x0477
        L_0x0088:
            java.lang.Class<X.UPf> r7 = X.UPf.class
            java.lang.String r3 = "xfb_one_link_monoschema(input:$input)"
            r0 = 2065835488(0x7b2225e0, float:8.419203E35)
            X.3lr r11 = r9.A03(r7, r3, r0)
            if (r11 == 0) goto L_0x019c
            java.lang.Class<X.BYl> r10 = X.C42294BYl.class
            java.lang.String r1 = "page_info"
            r0 = 12626092(0xc0a8ac, float:1.7692923E-38)
            X.3lr r11 = r11.A03(r10, r1, r0)
            if (r11 == 0) goto L_0x019c
            java.lang.Class<X.BYj> r10 = X.C42292BYj.class
            java.lang.String r1 = "bpl_page"
            r0 = 1014413782(0x3c76b9d6, float:0.015058955)
            X.3lr r12 = r11.getOptionalTreeField(r8, r1, r10, r0)
            if (r12 == 0) goto L_0x019c
            java.lang.String r0 = "strong_id__"
            java.lang.String r1 = r12.getOptionalStringField(r8, r0)
            if (r1 == 0) goto L_0x0199
            X.0sP r0 = r4.A04
            java.lang.Object r11 = r0.invoke(r1)
            X.9Gd r11 = (X.C375999Gd) r11
        L_0x00bf:
            java.lang.String r0 = "name"
            java.lang.String r10 = r12.A08(r0)
            java.lang.String r0 = "profile_pic_uri"
            java.lang.String r0 = r12.A09(r0)
            X.Vs7 r1 = new X.Vs7
            r1.<init>(r11, r10, r0)
        L_0x00d0:
            r0 = 2065835488(0x7b2225e0, float:8.419203E35)
            X.3lr r12 = r9.A03(r7, r3, r0)
            r14 = 0
            if (r12 == 0) goto L_0x0196
            java.lang.Class<X.BYl> r11 = X.C42294BYl.class
            java.lang.String r10 = "page_info"
            r0 = 12626092(0xc0a8ac, float:1.7692923E-38)
            X.3lr r12 = r12.A03(r11, r10, r0)
            if (r12 == 0) goto L_0x0196
            java.lang.Class<X.BYj> r11 = X.C42292BYj.class
            java.lang.String r10 = "bpl_page"
            r0 = 1014413782(0x3c76b9d6, float:0.015058955)
            X.3lr r12 = r12.getOptionalTreeField(r8, r10, r11, r0)
        L_0x00f2:
            r0 = 2065835488(0x7b2225e0, float:8.419203E35)
            X.3lr r13 = r9.A03(r7, r3, r0)
            if (r13 == 0) goto L_0x0193
            java.lang.Class<X.BYl> r11 = X.C42294BYl.class
            java.lang.String r10 = "page_info"
            r0 = 12626092(0xc0a8ac, float:1.7692923E-38)
            X.3lr r13 = r13.A03(r11, r10, r0)
            if (r13 == 0) goto L_0x0193
            java.lang.Class<X.BYi> r11 = X.C42291BYi.class
            java.lang.String r10 = "ads_page"
            r0 = 698245130(0x299e600a, float:7.0332696E-14)
            X.3lr r10 = r13.A02(r11, r10, r0)
        L_0x0113:
            if (r12 != 0) goto L_0x011c
            if (r10 != 0) goto L_0x0122
        L_0x0117:
            r6.onSuccess(r1)
            goto L_0x007d
        L_0x011c:
            java.lang.String r0 = "name"
            java.lang.String r14 = r12.A08(r0)
        L_0x0122:
            java.lang.String r11 = ""
            if (r14 != 0) goto L_0x0127
            r14 = r11
        L_0x0127:
            if (r12 == 0) goto L_0x0131
            java.lang.String r0 = "strong_id__"
            java.lang.String r15 = r12.getOptionalStringField(r8, r0)
            if (r15 != 0) goto L_0x0134
        L_0x0131:
            r15 = r11
            if (r12 == 0) goto L_0x013c
        L_0x0134:
            java.lang.String r0 = "profile_pic_uri"
            java.lang.String r18 = r12.A09(r0)
            if (r18 != 0) goto L_0x013e
        L_0x013c:
            r18 = r11
        L_0x013e:
            if (r10 == 0) goto L_0x0148
            java.lang.String r0 = "name"
            java.lang.String r16 = r10.A08(r0)
            if (r16 != 0) goto L_0x014c
        L_0x0148:
            r16 = r11
            if (r10 == 0) goto L_0x0154
        L_0x014c:
            java.lang.String r0 = "strong_id__"
            java.lang.String r17 = r10.getOptionalStringField(r8, r0)
            if (r17 != 0) goto L_0x0156
        L_0x0154:
            r17 = r11
        L_0x0156:
            r0 = 2065835488(0x7b2225e0, float:8.419203E35)
            X.3lr r8 = r9.A03(r7, r3, r0)
            if (r8 == 0) goto L_0x0190
            java.lang.Class<X.BYl> r7 = X.C42294BYl.class
            java.lang.String r3 = "page_info"
            r0 = 12626092(0xc0a8ac, float:1.7692923E-38)
            X.3lr r7 = r8.A03(r7, r3, r0)
            if (r7 == 0) goto L_0x0190
            r3 = 3
            r0 = 668(0x29c, float:9.36E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r19 = r7.getCoercedBooleanField(r3, r0)
        L_0x0177:
            com.instagram.business.onelink.cache.FBPageCacheInfo r13 = new com.instagram.business.onelink.cache.FBPageCacheInfo
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.Rsz r8 = r4.A00
            X.0xa r7 = r8.A00
            r3 = 18
            X.J6j r0 = new X.J6j
            r0.<init>((int) r3, (java.lang.Object) r8, (java.lang.Object) r13)
            X.0xW.A09(r7, r0)
            X.0sa r0 = r4.A03
            r0.invoke()
            goto L_0x0117
        L_0x0190:
            r19 = 0
            goto L_0x0177
        L_0x0193:
            r10 = r14
            goto L_0x0113
        L_0x0196:
            r12 = r14
            goto L_0x00f2
        L_0x0199:
            r11 = 0
            goto L_0x00bf
        L_0x019c:
            r0 = 0
            X.Vs7 r1 = new X.Vs7
            r1.<init>(r0, r0, r0)
            goto L_0x00d0
        L_0x01a4:
            r0 = 1282168959(0x4c6c587f, float:6.1956604E7)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.3JC r1 = (X.AnonymousClass3JC) r1
            r0 = 48816171(0x2e8e02b, float:3.4218002E-37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r1, r8)
            java.lang.Object r7 = r3.A04
            X.TsV r7 = (X.C14248TsV) r7
            java.lang.Object r4 = r3.A01
            X.9F2 r4 = (X.AnonymousClass9F2) r4
            java.lang.Object r10 = r3.A03
            X.9JK r10 = (X.AnonymousClass9JK) r10
            java.lang.Object r6 = r3.A02
            X.9FE r6 = (X.AnonymousClass9FE) r6
            r0 = 0
            java.lang.Object r11 = r1.Bny()
            X.3lr r11 = (X.C250663lr) r11
            if (r11 == 0) goto L_0x02b1
            java.lang.Class<X.Tt0> r9 = X.Tt0.class
            java.lang.String r3 = "xfb_one_link_monoschema(input:$input)"
            r1 = 1717090077(0x6658b71d, float:2.5585225E23)
            X.3lr r9 = r11.getOptionalTreeField(r8, r3, r9, r1)
            X.Tt0 r9 = (X.Tt0) r9
            if (r9 == 0) goto L_0x02b1
            X.B6s r11 = r9.A0E()
            if (r11 == 0) goto L_0x02ae
            java.lang.Class<X.B81> r10 = X.B81.class
            java.lang.String r3 = "bpl_page"
            r1 = 1730852086(0x672ab4f6, float:8.0614044E23)
            X.3lr r3 = r11.getOptionalTreeField(r8, r3, r10, r1)
            if (r3 == 0) goto L_0x02ae
            java.lang.String r1 = "name"
            java.lang.String r13 = r3.A08(r1)
        L_0x01f9:
            X.B6s r11 = r9.A0E()
            if (r11 == 0) goto L_0x02ab
            java.lang.Class<X.B81> r10 = X.B81.class
            java.lang.String r3 = "bpl_page"
            r1 = 1730852086(0x672ab4f6, float:8.0614044E23)
            X.3lr r3 = r11.getOptionalTreeField(r8, r3, r10, r1)
            if (r3 == 0) goto L_0x02ab
            java.lang.String r1 = "strong_id__"
            java.lang.String r14 = r3.getOptionalStringField(r8, r1)
        L_0x0212:
            X.B6s r12 = r9.A0E()
            if (r12 == 0) goto L_0x02a9
            java.lang.Class<X.B82> r11 = X.B82.class
            r10 = 1
            java.lang.String r3 = "ads_page"
            r1 = 495170485(0x1d83b3b5, float:3.4861224E-21)
            X.3lr r3 = r12.getOptionalTreeField(r10, r3, r11, r1)
            if (r3 == 0) goto L_0x02a9
            java.lang.String r1 = "name"
            java.lang.String r15 = r3.getOptionalStringField(r10, r1)
        L_0x022c:
            X.B6s r11 = r9.A0E()
            if (r11 == 0) goto L_0x02a6
            java.lang.Class<X.B82> r10 = X.B82.class
            java.lang.String r3 = "ads_page"
            r1 = 495170485(0x1d83b3b5, float:3.4861224E-21)
            X.3lr r3 = r11.A02(r10, r3, r1)
            if (r3 == 0) goto L_0x02a6
            java.lang.String r1 = "strong_id__"
            java.lang.String r16 = r3.getOptionalStringField(r8, r1)
        L_0x0245:
            X.B6s r10 = r9.A0E()
            if (r10 == 0) goto L_0x02a3
            r3 = 3
            r1 = 668(0x29c, float:9.36E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r18 = r10.getCoercedBooleanField(r3, r1)
        L_0x0256:
            X.B6s r10 = r9.A0E()
            if (r10 == 0) goto L_0x026f
            java.lang.Class<X.B81> r9 = X.B81.class
            java.lang.String r3 = "bpl_page"
            r1 = 1730852086(0x672ab4f6, float:8.0614044E23)
            X.3lr r1 = r10.getOptionalTreeField(r8, r3, r9, r1)
            if (r1 == 0) goto L_0x026f
            java.lang.String r0 = "profile_pic_uri"
            java.lang.String r0 = r1.A09(r0)
        L_0x026f:
            com.instagram.business.onelink.cache.FBPageCacheInfo r12 = new com.instagram.business.onelink.cache.FBPageCacheInfo
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.Dfh r8 = X.C14248TsV.A00(r12)
            boolean r0 = r4 instanceof X.AnonymousClass9F1
            if (r0 == 0) goto L_0x0295
            r7.A00 = r8
            X.Rsz r4 = r7.A01
            X.0xa r3 = r4.A00
            r1 = 18
            X.J6j r0 = new X.J6j
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r12)
            X.0xW.A09(r3, r0)
            X.1Ng r1 = r7.A03
            X.WQS r0 = X.WQS.A00
            r1.A00(r0)
        L_0x0295:
            r6.onSuccess(r8)
        L_0x0298:
            r0 = -1674359171(0xffffffff9c334e7d, float:-5.9327576E-22)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1071135463(0xffffffffc027c519, float:-2.621405)
            goto L_0x0477
        L_0x02a3:
            r18 = 0
            goto L_0x0256
        L_0x02a6:
            r16 = r0
            goto L_0x0245
        L_0x02a9:
            r15 = r0
            goto L_0x022c
        L_0x02ab:
            r14 = r0
            goto L_0x0212
        L_0x02ae:
            r13 = r0
            goto L_0x01f9
        L_0x02b1:
            boolean r1 = r4 instanceof X.AnonymousClass9F1
            if (r1 == 0) goto L_0x02cc
            r7.A00 = r0
            X.Rsz r8 = r7.A01
            X.0xa r3 = r8.A00
            r1 = 40
            X.Iwb r0 = new X.Iwb
            r0.<init>(r8, r1)
            X.0xW.A09(r3, r0)
            X.1Ng r1 = r7.A03
            X.WQS r0 = X.WQS.A00
            r1.A00(r0)
        L_0x02cc:
            X.9F5 r0 = r7.A02
            r0.A00(r10, r4)
            java.lang.String r1 = "FB Page response is null."
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            r6.onError(r0)
            goto L_0x0298
        L_0x02dc:
            r0 = 1633399676(0x615bb37c, float:2.5329814E20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.3JC r1 = (X.AnonymousClass3JC) r1
            r0 = 852049489(0x32c93e51, float:2.3427818E-8)
            int r8 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r9 = r3.A04
            X.WO1 r9 = (X.WO1) r9
            java.lang.Object r10 = r3.A01
            X.9F2 r10 = (X.AnonymousClass9F2) r10
            java.lang.Object r4 = r3.A03
            X.9JK r4 = (X.AnonymousClass9JK) r4
            java.lang.Object r7 = r3.A02
            X.9FE r7 = (X.AnonymousClass9FE) r7
            r0 = 0
            java.lang.Object r11 = r1.Bny()
            X.3lr r11 = (X.C250663lr) r11
            if (r11 == 0) goto L_0x0394
            java.lang.Class<X.UPd> r5 = X.UPd.class
            java.lang.String r3 = "xfb_one_link_monoschema(input:$input)"
            r1 = -406010358(0xffffffffe7ccc60a, float:-1.9340319E24)
            X.3lr r12 = r11.getOptionalTreeField(r6, r3, r5, r1)
            if (r12 == 0) goto L_0x0394
            java.lang.Class<X.UPc> r5 = X.UPc.class
            java.lang.String r4 = "business_info"
            r1 = -558890911(0xffffffffdeb00061, float:-6.3411216E18)
            X.3lr r13 = r12.getOptionalTreeField(r6, r4, r5, r1)
            if (r13 == 0) goto L_0x0392
            java.lang.Class<X.UPb> r11 = X.UPb.class
            java.lang.String r3 = "business"
            r1 = -930669244(0xffffffffc8871d44, float:-276714.12)
            X.3lr r3 = r13.getOptionalTreeField(r6, r3, r11, r1)
            if (r3 == 0) goto L_0x0392
            java.lang.String r1 = "strong_id__"
            java.lang.String r11 = r3.getOptionalStringField(r6, r1)
        L_0x0336:
            r1 = -558890911(0xffffffffdeb00061, float:-6.3411216E18)
            X.3lr r5 = r12.getOptionalTreeField(r6, r4, r5, r1)
            if (r5 == 0) goto L_0x0352
            java.lang.Class<X.UPb> r4 = X.UPb.class
            java.lang.String r3 = "business"
            r1 = -930669244(0xffffffffc8871d44, float:-276714.12)
            X.3lr r1 = r5.getOptionalTreeField(r6, r3, r4, r1)
            if (r1 == 0) goto L_0x0352
            java.lang.String r0 = "name"
            java.lang.String r0 = r1.A08(r0)
        L_0x0352:
            com.instagram.business.onelink.cache.BusinessAccountCacheInfo r6 = new com.instagram.business.onelink.cache.BusinessAccountCacheInfo
            r6.<init>(r0, r11)
            java.lang.String r3 = r6.A01
            java.lang.String r1 = r6.A00
            if (r1 == 0) goto L_0x0390
            X.9Gd r0 = new X.9Gd
            r0.<init>(r1)
        L_0x0362:
            X.VRZ r5 = new X.VRZ
            r5.<init>(r0, r3)
            boolean r0 = r10 instanceof X.AnonymousClass9F1
            if (r0 == 0) goto L_0x0382
            r9.A00 = r5
            X.Rsy r4 = r9.A01
            X.0xa r3 = r4.A00
            r1 = 17
            X.J6j r0 = new X.J6j
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r6)
            X.0xW.A09(r3, r0)
            X.1Ng r1 = r9.A03
            X.WQR r0 = X.WQR.A00
            r1.A00(r0)
        L_0x0382:
            r7.onSuccess(r5)
        L_0x0385:
            r0 = 316031562(0x12d6424a, float:1.352164E-27)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -355234701(0xffffffffead38c73, float:-1.278733E26)
            goto L_0x0477
        L_0x0390:
            r0 = 0
            goto L_0x0362
        L_0x0392:
            r11 = r0
            goto L_0x0336
        L_0x0394:
            boolean r1 = r10 instanceof X.AnonymousClass9F1
            if (r1 == 0) goto L_0x03af
            r9.A00 = r0
            X.Rsy r5 = r9.A01
            X.0xa r3 = r5.A00
            r1 = 39
            X.Iwb r0 = new X.Iwb
            r0.<init>(r5, r1)
            X.0xW.A09(r3, r0)
            X.1Ng r1 = r9.A03
            X.WQR r0 = X.WQR.A00
            r1.A00(r0)
        L_0x03af:
            X.9F5 r0 = r9.A02
            r0.A00(r4, r10)
            java.lang.String r1 = "Business Account response is null."
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            r7.onError(r0)
            goto L_0x0385
        L_0x03bf:
            r0 = 948293035(0x3885cdab, float:6.380243E-5)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.3JC r1 = (X.AnonymousClass3JC) r1
            r0 = -477608842(0xffffffffe3884476, float:-5.0273806E21)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r13 = 0
            X.0qQ.A0B(r1, r13)
            java.lang.Object r9 = r3.A04
            X.WO0 r9 = (X.WO0) r9
            java.lang.Object r10 = r3.A01
            X.9F2 r10 = (X.AnonymousClass9F2) r10
            java.lang.Object r5 = r3.A03
            X.9JK r5 = (X.AnonymousClass9JK) r5
            java.lang.Object r6 = r3.A02
            X.9FE r6 = (X.AnonymousClass9FE) r6
            r0 = 0
            java.lang.Object r8 = r1.Bny()
            X.3lr r8 = (X.C250663lr) r8
            if (r8 == 0) goto L_0x0481
            java.lang.Class<X.UPZ> r4 = X.UPZ.class
            java.lang.String r3 = "xfb_one_link_monoschema(input:$input)"
            r1 = 2102256207(0x7d4de24f, float:1.7104175E37)
            X.3lr r8 = r8.getOptionalTreeField(r13, r3, r4, r1)
            if (r8 == 0) goto L_0x0481
            java.lang.Class<X.UPY> r4 = X.UPY.class
            java.lang.String r3 = "ad_account_info"
            r1 = -2057548236(0xffffffff855c4e34, float:-1.0358714E-35)
            X.3lr r12 = r8.getOptionalTreeField(r13, r3, r4, r1)
            if (r12 == 0) goto L_0x0481
            java.lang.Class<X.UPX> r11 = X.UPX.class
            java.lang.String r8 = "default_ad_account"
            r5 = -560938661(0xffffffffde90c15b, float:-5.2153591E18)
            X.3lr r3 = r12.getOptionalTreeField(r13, r8, r11, r5)
            if (r3 == 0) goto L_0x047f
            java.lang.String r1 = "strong_id__"
            java.lang.String r4 = r3.getOptionalStringField(r13, r1)
        L_0x0419:
            X.3lr r3 = r12.getOptionalTreeField(r13, r8, r11, r5)
            if (r3 == 0) goto L_0x047d
            java.lang.String r1 = "name"
            java.lang.String r3 = r3.A08(r1)
        L_0x0425:
            X.3lr r1 = r12.getOptionalTreeField(r13, r8, r11, r5)
            if (r1 == 0) goto L_0x0431
            java.lang.String r0 = "legacy_account_id"
            java.lang.String r0 = r1.A09(r0)
        L_0x0431:
            com.instagram.business.onelink.cache.AdAccountCacheInfo r8 = new com.instagram.business.onelink.cache.AdAccountCacheInfo
            r8.<init>(r3, r4, r0)
            java.lang.String r4 = r8.A01
            java.lang.String r0 = r8.A00
            r3 = 0
            if (r0 == 0) goto L_0x047b
            X.9Gd r1 = new X.9Gd
            r1.<init>(r0)
        L_0x0442:
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x044b
            X.9Gd r3 = new X.9Gd
            r3.<init>(r0)
        L_0x044b:
            X.VVL r5 = new X.VVL
            r5.<init>(r1, r3, r4)
            boolean r0 = r10 instanceof X.AnonymousClass9F1
            if (r0 == 0) goto L_0x046b
            r9.A00 = r5
            X.Rsx r4 = r9.A01
            X.0xa r3 = r4.A00
            r1 = 16
            X.J6j r0 = new X.J6j
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r8)
            X.0xW.A09(r3, r0)
            X.1Ng r1 = r9.A03
            X.WQQ r0 = X.WQQ.A00
            r1.A00(r0)
        L_0x046b:
            r6.onSuccess(r5)
        L_0x046e:
            r0 = -1250382825(0xffffffffb578ac17, float:-9.2637623E-7)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -1688171417(0xffffffff9b608c67, float:-1.8574212E-22)
        L_0x0477:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x047b:
            r1 = r3
            goto L_0x0442
        L_0x047d:
            r3 = r0
            goto L_0x0425
        L_0x047f:
            r4 = r0
            goto L_0x0419
        L_0x0481:
            boolean r1 = r10 instanceof X.AnonymousClass9F1
            if (r1 == 0) goto L_0x049c
            r9.A00 = r0
            X.Rsx r4 = r9.A01
            X.0xa r3 = r4.A00
            r1 = 38
            X.Iwb r0 = new X.Iwb
            r0.<init>(r4, r1)
            X.0xW.A09(r3, r0)
            X.1Ng r1 = r9.A03
            X.WQQ r0 = X.WQQ.A00
            r1.A00(r0)
        L_0x049c:
            X.9F5 r0 = r9.A02
            r0.A00(r5, r10)
            java.lang.String r1 = "Ad Account response is null."
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            r6.onError(r0)
            goto L_0x046e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15599UfR.onSuccess(java.lang.Object):void");
    }
}
