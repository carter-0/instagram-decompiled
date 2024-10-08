package X;

public final class TWX extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;
    public final String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWX(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, String str2, String str3, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj4;
        this.A08 = str;
        this.A02 = obj3;
        this.A06 = obj;
        this.A04 = obj5;
        this.A09 = str2;
        this.A05 = obj6;
        this.A03 = obj2;
        this.A07 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0198, code lost:
        if (r5 != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019d, code lost:
        if (r5 != null) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r5 = r19
            int r1 = r0.A00
            if (r1 == 0) goto L_0x0076
            boolean r17 = X.AnonymousClass7TE.A1a(r5)
            java.lang.Object r13 = r0.A06
            X.8Hw r13 = (X.C353498Hw) r13
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r13.A1n
            X.2gB r1 = r1.A0F
            java.lang.Object r1 = r1.A02()
            X.831 r1 = (X.AnonymousClass831) r1
            if (r1 == 0) goto L_0x0074
            java.util.List r1 = r1.A01
            int r10 = r1.size()
        L_0x0022:
            com.instagram.common.session.UserSession r1 = r13.A1D
            X.27r r1 = X.27p.A01(r1)
            X.29f r2 = r1.A0A
            X.8fP r4 = X.C360948fP.VIDEO_LAYOUT
            int r1 = X.C353498Hw.A00(r13)
            int r1 = r1 / 1000
            long r11 = (long) r1
            java.lang.String r5 = r0.A07
            java.lang.String r6 = r0.A08
            r7 = 0
            java.lang.String r9 = r0.A09
            X.9tJ r3 = r13.Aje()
            r8 = r7
            r2.A0X(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r17 == 0) goto L_0x004c
            X.AkC r1 = new X.AkC
            r1.<init>(r13)
            X.11Z.A02(r1)
        L_0x004c:
            java.lang.Object r1 = r0.A03
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r15 = r0.A04
            java.io.File r15 = (java.io.File) r15
            java.lang.Object r12 = r0.A01
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r12 = (com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec) r12
            java.lang.Object r14 = r0.A05
            X.RyY r14 = (X.C10812RyY) r14
            java.lang.Object r11 = r0.A02
            X.1NW r11 = (X.1NW) r11
            X.Aqr r10 = new X.Aqr
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            if (r17 == 0) goto L_0x0071
            r0 = 500(0x1f4, double:2.47E-321)
        L_0x006b:
            X.11Z.A04(r10, r0)
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0071:
            r0 = 0
            goto L_0x006b
        L_0x0074:
            r10 = 0
            goto L_0x0022
        L_0x0076:
            X.SUj r5 = (X.SUj) r5
            boolean r1 = X.SUj.A0U(r5)
            if (r1 != 0) goto L_0x018f
            r9 = 0
            if (r5 == 0) goto L_0x0197
            java.lang.Object r1 = r5.A01
            X.QXI r1 = (X.QXI) r1
            if (r1 == 0) goto L_0x0197
            X.QXk r1 = r1.A0E()
            if (r1 == 0) goto L_0x0197
            X.QXF r1 = r1.A0F()
            if (r1 == 0) goto L_0x0197
            X.QXN r2 = r1.A0E()
        L_0x0097:
            java.lang.Object r1 = r5.A01
            X.QXI r1 = (X.QXI) r1
            if (r1 == 0) goto L_0x019c
            X.QXk r1 = r1.A0E()
            if (r1 == 0) goto L_0x019c
            X.QXH r1 = r1.A0H()
            if (r1 == 0) goto L_0x019c
            X.QXb r1 = r1.A0E()
        L_0x00ad:
            java.lang.Object r3 = r5.A01
            X.QXI r3 = (X.QXI) r3
            if (r3 == 0) goto L_0x01a1
            X.QXk r3 = r3.A0E()
            if (r3 == 0) goto L_0x01a1
            X.QXG r3 = r3.A0G()
            if (r3 == 0) goto L_0x01a1
            X.QXW r4 = r3.A0E()
        L_0x00c3:
            if (r2 == 0) goto L_0x00cd
            java.lang.Enum r7 = X.Pxj.A0f(r2)
            X.HNF r7 = (X.HNF) r7
            if (r7 != 0) goto L_0x00df
        L_0x00cd:
            if (r1 == 0) goto L_0x00d7
            java.lang.Enum r7 = X.Pxj.A0f(r1)
            X.HNF r7 = (X.HNF) r7
            if (r7 != 0) goto L_0x00df
        L_0x00d7:
            if (r4 == 0) goto L_0x0193
            java.lang.Enum r7 = X.Pxj.A0f(r4)
            X.HNF r7 = (X.HNF) r7
        L_0x00df:
            if (r7 == 0) goto L_0x0194
            X.HNF r3 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r7 == r3) goto L_0x0194
            java.lang.Throwable r3 = r5.A02
            X.SUj r10 = X.SUj.A0A(r9, r3)
        L_0x00eb:
            X.SUU r6 = X.C9962RkH.A00
            java.lang.Object r8 = r0.A01
            com.facebookpay.logging.LoggingContext r8 = (com.facebookpay.logging.LoggingContext) r8
            X.0qQ.A0A(r10)
            java.lang.String r11 = r0.A08
            r14 = 0
            java.lang.Object r15 = r0.A02
            X.Std r15 = (X.C12404Std) r15
            java.lang.Object r3 = r0.A06
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            java.util.ArrayList r13 = X.C12404Std.A00(r3, r11)
            java.lang.String r12 = "pux_checkout"
            java.lang.Object r3 = r0.A04
            com.facebookpay.otc.models.OtcInput r3 = (com.facebookpay.otc.models.OtcInput) r3
            if (r3 == 0) goto L_0x0110
            X.SEB r9 = X.C11300SKk.A01(r3)
        L_0x0110:
            r6.A0F(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r3 = X.SUj.A0V(r5)
            if (r3 == 0) goto L_0x018e
            java.lang.String r6 = r0.A09
            java.lang.Object r3 = r0.A05
            com.facebookpay.otc.models.OtcInput r3 = (com.facebookpay.otc.models.OtcInput) r3
            X.SJ1 r5 = new X.SJ1
            r5.<init>(r3, r6)
            if (r4 == 0) goto L_0x015c
            java.lang.Object r7 = r0.A03
            X.2Fk r7 = (X.2Fk) r7
            X.0qQ.A0A(r7)
            r6 = 47
            X.PqL r3 = new X.PqL
            r3.<init>(r4, r6)
            X.2gB r14 = X.AnonymousClass72Y.A01(r7, r3)
            X.2gB r6 = r15.A06(r5)
            java.lang.String r3 = "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>"
            X.0qQ.A0C(r6, r3)
            java.lang.String r3 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.expresscheckout.api.PayerNameResponse>>"
            X.0qQ.A0C(r14, r3)
            r13 = 13
            X.IxG r12 = new X.IxG
            r16 = r5
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r4 = 3
            X.LZv r3 = new X.LZv
            r3.<init>(r12, r4)
            r6.A0E(r14, r3)
        L_0x015c:
            if (r2 == 0) goto L_0x0175
            java.lang.Object r7 = r0.A03
            X.2Fk r7 = (X.2Fk) r7
            java.lang.String r6 = r0.A07
            X.0qQ.A0A(r7)
            r4 = 48
            X.PqL r3 = new X.PqL
            r3.<init>(r2, r4)
            X.2gB r2 = X.AnonymousClass72Y.A01(r7, r3)
            X.C12404Std.A01(r2, r5, r15, r11, r6)
        L_0x0175:
            if (r1 == 0) goto L_0x018e
            java.lang.Object r4 = r0.A03
            X.2Fk r4 = (X.2Fk) r4
            java.lang.String r3 = r0.A07
            X.0qQ.A0A(r4)
            r2 = 49
            X.PqL r0 = new X.PqL
            r0.<init>(r1, r2)
            X.2gB r0 = X.AnonymousClass72Y.A01(r4, r0)
            X.C12404Std.A02(r0, r5, r15, r11, r3)
        L_0x018e:
            r5 = r10
        L_0x018f:
            X.0qQ.A0A(r5)
            return r5
        L_0x0193:
            r7 = r9
        L_0x0194:
            r10 = r5
            goto L_0x00eb
        L_0x0197:
            r2 = r9
            if (r5 == 0) goto L_0x019c
            goto L_0x0097
        L_0x019c:
            r1 = r9
            if (r5 == 0) goto L_0x01a1
            goto L_0x00ad
        L_0x01a1:
            r4 = r9
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWX.invoke(java.lang.Object):java.lang.Object");
    }
}
