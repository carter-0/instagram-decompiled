package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;

/* renamed from: X.Sdq  reason: case insensitive filesystem */
public final class C11648Sdq implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11648Sdq(2Fk r1, AnonymousClass2gO r2, int i) {
        this.A00 = i;
        switch (i) {
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
                this.A01 = r1;
                this.A02 = r2;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                this.A02 = r2;
                this.A01 = r1;
                break;
            default:
                this.A02 = r1;
                this.A01 = r2;
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v256, resolved type: android.widget.TextView} */
    /* JADX WARNING: type inference failed for: r24v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v130, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v139, types: [java.lang.Enum] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d9, code lost:
        X.Pxe.A1P(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02f3, code lost:
        if (X.SUj.A0V(r14) == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02f5, code lost:
        r1 = X.SUj.A0S(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f9, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02fb, code lost:
        X.Pxe.A1P(r0, r0.A01);
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0302, code lost:
        ((X.AnonymousClass2gO) r0).onChanged(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0307, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0361, code lost:
        r2 = "LOCKED".equalsIgnoreCase(((X.C10257RpH) r14).A00);
        r1 = (android.widget.TextView) r0.A02;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x036f, code lost:
        if (r2 == false) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0371, code lost:
        r1.setVisibility(0);
        r1.setText(2131962133);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x037b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03aa, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0881, code lost:
        r1.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0884, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0a41, code lost:
        r2.A01(r7, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0a44, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0a45, code lost:
        r7 = (X.STY) r0.A01;
        r3 = r7.A06("INVALID_CARD_FETCH_RESPONSE").A00();
        r2 = r7.A04.A02();
        r1 = r7.A0T;
        X.SUR.A0A(r2, r1, r3);
        r2 = r1.A02;
        r7 = (java.lang.Integer) r0.A02;
        r2.A03(r7, r8, "INVALID_CARD_FETCH_RESPONSE", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0dbd, code lost:
        if (r0 != null) goto L_0x0cf0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0ead, code lost:
        X.SUj.A0H(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0eb0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        r3.A0A(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:581:0x0d29  */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x0d3b  */
    /* JADX WARNING: Removed duplicated region for block: B:609:0x0dd3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r57) {
        /*
            r56 = this;
            r0 = r56
            r14 = r57
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0885;
                case 1: goto L_0x0a18;
                case 2: goto L_0x09f8;
                case 3: goto L_0x09d9;
                case 4: goto L_0x099a;
                case 5: goto L_0x07ec;
                case 6: goto L_0x0e05;
                case 7: goto L_0x0728;
                case 8: goto L_0x093b;
                case 9: goto L_0x0572;
                case 10: goto L_0x045e;
                case 11: goto L_0x043a;
                case 12: goto L_0x043a;
                case 13: goto L_0x090e;
                case 14: goto L_0x08db;
                case 15: goto L_0x037c;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03b0;
                case 18: goto L_0x08c9;
                case 19: goto L_0x0361;
                case 20: goto L_0x0355;
                case 21: goto L_0x0339;
                case 22: goto L_0x00d6;
                case 23: goto L_0x007f;
                case 24: goto L_0x031f;
                case 25: goto L_0x0308;
                case 26: goto L_0x02ed;
                case 27: goto L_0x02ea;
                case 28: goto L_0x02dd;
                case 29: goto L_0x02c2;
                case 30: goto L_0x08bc;
                case 31: goto L_0x0066;
                case 32: goto L_0x0042;
                case 33: goto L_0x0009;
                case 34: goto L_0x026a;
                case 35: goto L_0x0009;
                case 36: goto L_0x011b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0023
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0023
        L_0x0017:
            java.lang.Object r3 = r0.A01
            X.2Fk r3 = (X.2Fk) r3
            X.SUj r0 = X.SUj.A09(r4)
        L_0x001f:
            r3.A0A(r0)
        L_0x0022:
            return
        L_0x0023:
            java.util.Iterator r3 = r4.iterator()
        L_0x0027:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0017
            java.lang.Object r1 = r3.next()
            X.RtF r1 = (X.C10500RtF) r1
            X.2Fj r2 = r1.A00
            boolean r1 = X.SUj.A0Q(r2)
            if (r1 != 0) goto L_0x0027
            boolean r1 = X.SUj.A0P(r2)
            if (r1 == 0) goto L_0x0022
            goto L_0x0027
        L_0x0042:
            X.SUj r5 = X.Pxf.A0P(r14)
            java.lang.Object r4 = r0.A01
            org.chromium.IsReadyToPayServiceCallback r4 = (org.chromium.IsReadyToPayServiceCallback) r4
            boolean r1 = X.SUj.A0V(r5)
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r5.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x005f
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 != r2) goto L_0x005f
            r3 = 1
        L_0x005f:
            r4.CIm(r3)
            java.lang.Object r1 = r0.A02
            goto L_0x02d9
        L_0x0066:
            X.SUj r14 = X.Pxf.A0P(r14)
            boolean r1 = X.SUj.A0V(r14)
            if (r1 != 0) goto L_0x0076
            boolean r1 = X.SUj.A0S(r14)
            if (r1 == 0) goto L_0x007b
        L_0x0076:
            java.lang.Object r1 = r0.A02
            X.Pxe.A1P(r0, r1)
        L_0x007b:
            java.lang.Object r0 = r0.A01
            goto L_0x0302
        L_0x007f:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0T(r14)
            if (r1 != 0) goto L_0x00ca
            boolean r1 = X.SUj.A0V(r14)
            java.lang.Object r4 = r0.A01
            X.QnB r4 = (X.C8269QnB) r4
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r1 = r14.A01
            r1.getClass()
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r1 = (com.fbpay.hub.paymentmethods.api.FbPayShopPay) r1
            java.lang.String r2 = r1.A00
            com.facebookpay.logging.FBPayLoggerData r1 = r4.A04
            java.util.LinkedHashMap r3 = X.C2818159r.A06(r1)
            if (r2 == 0) goto L_0x00a5
            X.Pxj.A1N(r2, r3)
        L_0x00a5:
            X.Pxh.A1R(r3)
            X.2FO r2 = r4.A0E
            java.lang.String r1 = "client_add_credential_success"
        L_0x00ac:
            r2.Cgl(r1, r3)
            X.S2Q r2 = r4.A06
            java.util.Set r1 = r4.A0G
            r2.A00(r1)
            java.lang.Object r1 = r0.A02
            X.Pxe.A1P(r0, r1)
            return
        L_0x00bc:
            com.facebookpay.logging.FBPayLoggerData r1 = r4.A04
            java.util.LinkedHashMap r3 = X.C2818159r.A06(r1)
            X.Pxh.A1R(r3)
            X.2FO r2 = r4.A0E
            java.lang.String r1 = "client_add_credential_fail"
            goto L_0x00ac
        L_0x00ca:
            java.lang.Object r0 = r0.A01
            X.QD7 r0 = (X.QD7) r0
            X.2gB r1 = r0.A03
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            goto L_0x0881
        L_0x00d6:
            X.SUj r14 = (X.SUj) r14
            boolean r5 = X.SUj.A0T(r14)
            if (r5 != 0) goto L_0x010f
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x010a
            java.lang.Object r4 = r0.A01
            X.QnF r4 = (X.C8273QnF) r4
            java.lang.Object r1 = r14.A01
            r1.getClass()
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r1 = (com.fbpay.hub.paymentmethods.api.FbPayShopPay) r1
            r4.A02 = r1
            X.2gB r2 = r4.A03
            com.google.common.collect.ImmutableList r1 = X.C8273QnF.A00(r4)
            r2.A0B(r1)
            com.facebookpay.logging.FBPayLoggerData r1 = r4.A01
            java.util.LinkedHashMap r3 = X.C2818159r.A06(r1)
            X.C8273QnF.A01(r4, r3)
            X.2FO r2 = r4.A06
            java.lang.String r1 = "client_edit_credential_success"
            r2.Cgl(r1, r3)
        L_0x010a:
            java.lang.Object r1 = r0.A02
            X.Pxe.A1P(r0, r1)
        L_0x010f:
            java.lang.Object r0 = r0.A01
            X.QD7 r0 = (X.QD7) r0
            X.2gB r1 = r0.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L_0x0881
        L_0x011b:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r14.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0022
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x0135:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0152
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.RtF r1 = (X.C10500RtF) r1
            X.2Fj r1 = r1.A00
            X.SUj r1 = X.Pxe.A0W(r1)
            if (r1 == 0) goto L_0x0135
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x0135
            r5.add(r2)
            goto L_0x0135
        L_0x0152:
            java.util.Iterator r5 = r5.iterator()
        L_0x0156:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x017a
            java.lang.Object r1 = r5.next()
            X.RtF r1 = (X.C10500RtF) r1
            java.lang.String r3 = r1.A01
            X.2Fj r1 = r1.A00
            java.lang.Object r2 = r1.A02()
            java.lang.String r1 = "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<kotlin.Pair<kotlin.String, kotlin.String>>"
            X.0qQ.A0C(r2, r1)
            X.SUj r2 = (X.SUj) r2
            java.lang.Object r1 = X.SUj.A0D(r2)
            r4.put(r3, r1)
            goto L_0x0156
        L_0x017a:
            java.lang.Object r3 = r0.A02
            X.2Ld r3 = (X.2Ld) r3
            java.lang.Object r9 = r0.A01
            X.RtG r9 = (X.C10501RtG) r9
            X.0jg r6 = X.0jh.A04
            com.instagram.common.session.UserSession r5 = r3.A05
            X.0jh r0 = r6.A01(r5)
            X.19f r2 = X.19f.A1m
            X.19i r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0022
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            android.content.Context r7 = r3.A04
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "app_id"
            r10.put(r0, r1)
            X.0jh r0 = r6.A01(r5)
            X.19i r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0a68
            java.lang.String r5 = r0.A01
            if (r5 == 0) goto L_0x0a68
            r2 = 0
            r1 = 9
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r0 = X.AnonymousClass9NE.A01(r2, r1, r0)
            r10.put(r0, r5)
            java.lang.String r1 = r3.A03
            if (r1 != 0) goto L_0x01cd
            java.lang.String r0 = "deviceKeyPEM"
        L_0x01c5:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01cd:
            java.lang.String r0 = "public_key"
            r10.put(r0, r1)
            java.util.ArrayList r2 = X.JTQ.A0f(r4)
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r4)
        L_0x01db:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ed
            java.lang.Object r0 = X.C51971G9r.A0p(r1)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            r2.add(r0)
            goto L_0x01db
        L_0x01ed:
            java.lang.String r0 = "assoc_public_keys"
            r10.put(r0, r2)
            X.2Mg r2 = r3.A00
            if (r2 == 0) goto L_0x0266
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)
            byte[] r0 = r2.A03()
            r1.update(r0)
            byte[] r0 = r1.digest()
            X.0qQ.A07(r0)
            java.lang.String r1 = X.Pxg.A0z(r0)
            java.lang.String r0 = r7.getPackageName()
            java.util.LinkedHashMap r11 = X.C66582MXn.A0y(r1, r0)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r4)
        L_0x021a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0234
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            r11.put(r0, r1)
            goto L_0x021a
        L_0x0234:
            X.2Mg r8 = r3.A00
            if (r8 == 0) goto L_0x0266
            X.0sm r12 = X.0Yt.A0E()
            X.RyZ r6 = new X.RyZ
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.5A3 r5 = X.AnonymousClass2E0.A06()
            X.0qQ.A07(r5)
            X.SOC r2 = X.AnonymousClass2E0.A04()
            X.0qQ.A07(r2)
            X.TXx r1 = X.C13388TXx.A00
            X.QnM r0 = new X.QnM
            r0.<init>(r2, r5, r6, r1)
            X.QCn r6 = X.SSC.A03(r0)
            X.0qQ.A07(r6)
            r0 = 19
            X.Sds r5 = new X.Sds
            r5.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r9)
            goto L_0x0ead
        L_0x0266:
            java.lang.String r0 = "deviceKey"
            goto L_0x01c5
        L_0x026a:
            java.util.List r14 = (java.util.List) r14
            X.0qQ.A0A(r14)
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.A01
            X.2gB r5 = (X.AnonymousClass2gB) r5
            java.util.Iterator r6 = r14.iterator()
        L_0x027b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = r6.next()
            X.S2p r2 = (X.C10957S2p) r2
            X.2Fj r0 = r2.A02
            java.lang.Object r1 = r0.A02()
            if (r1 != 0) goto L_0x0291
            X.REb r1 = X.C8884REb.UNKNOWN
        L_0x0291:
            X.REb r0 = X.C8884REb.CONNECTED
            if (r1 != r0) goto L_0x027b
            java.lang.String r0 = r2.A03
            X.RtF r3 = new X.RtF
            r3.<init>(r0)
            com.meta.trusteddevice.base.TrustedDeviceServiceClient$CrossAppServiceConnection$getPublicKeyAndFingerprint$crossAppPubKeyCallback$1 r1 = new com.meta.trusteddevice.base.TrustedDeviceServiceClient$CrossAppServiceConnection$getPublicKeyAndFingerprint$crossAppPubKeyCallback$1
            r1.<init>(r2, r3)
            android.os.IBinder r0 = r2.A01     // Catch:{ Exception -> 0x02ab }
            com.trusteddevice.TrustedDeviceFoundationService r0 = com.meta.trusteddevice.service.TrustedDeviceFoundationServiceImpl$binder$1.A00(r0)     // Catch:{ Exception -> 0x02ab }
            r0.BYe(r1)     // Catch:{ Exception -> 0x02ab }
            goto L_0x02b2
        L_0x02ab:
            r2 = move-exception
            X.2Fj r1 = r3.A00
            r0 = 0
            X.SUj.A0M(r1, r0, r2)
        L_0x02b2:
            r4.add(r3)
            X.2Fj r2 = r3.A00
            r1 = 33
            X.Sdq r0 = new X.Sdq
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5)
            r5.A0E(r2, r0)
            goto L_0x027b
        L_0x02c2:
            X.SUj r14 = (X.SUj) r14
            java.lang.Object r1 = r0.A02
            X.2gO r1 = (X.AnonymousClass2gO) r1
            r1.onChanged(r14)
            boolean r1 = X.SUj.A0S(r14)
            if (r1 != 0) goto L_0x02d7
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x0022
        L_0x02d7:
            java.lang.Object r1 = r0.A01
        L_0x02d9:
            X.Pxe.A1P(r0, r1)
            return
        L_0x02dd:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0S(r14)
            if (r1 != 0) goto L_0x02fb
            boolean r1 = X.SUj.A0V(r14)
            goto L_0x02f9
        L_0x02ea:
            X.SUj r14 = (X.SUj) r14
            goto L_0x02f5
        L_0x02ed:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0V(r14)
            if (r1 != 0) goto L_0x02fb
        L_0x02f5:
            boolean r1 = X.SUj.A0S(r14)
        L_0x02f9:
            if (r1 == 0) goto L_0x0022
        L_0x02fb:
            java.lang.Object r1 = r0.A01
            X.Pxe.A1P(r0, r1)
            java.lang.Object r0 = r0.A02
        L_0x0302:
            X.2gO r0 = (X.AnonymousClass2gO) r0
            r0.onChanged(r14)
            return
        L_0x0308:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.A01
            X.Pxe.A1P(r0, r1)
            java.lang.Object r1 = r0.A02
            X.2gO r1 = (X.AnonymousClass2gO) r1
            java.lang.Object r0 = r14.A01
            r1.onChanged(r0)
            return
        L_0x031f:
            java.lang.Object r1 = r0.A01
            X.QCn r1 = (X.C7422QCn) r1
            X.SSC r1 = r1.A02
            java.lang.Object r0 = r0.A02
            X.SUj r0 = (X.SUj) r0
            X.SUj r2 = X.SUj.A06(r0, r14)
            X.QCn r1 = r1.A03
            java.lang.Object r0 = r1.A02()
            if (r0 == r2) goto L_0x0022
            r1.A0B(r2)
            return
        L_0x0339:
            java.lang.Object r5 = r0.A01
            X.2Fk[] r5 = (X.2Fk[]) r5
            r4 = 4
            r3 = 0
            r2 = 0
        L_0x0340:
            r1 = r5[r3]
            boolean r1 = X.SUj.A0R(r1)
            r2 = r2 | r1
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x0340
            java.lang.Object r3 = r0.A02
            X.2Fk r3 = (X.2Fk) r3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L_0x001f
        L_0x0355:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x0022
            java.lang.Object r14 = X.SUj.A0D(r14)
        L_0x0361:
            X.RpH r14 = (X.C10257RpH) r14
            java.lang.String r2 = r14.A00
            java.lang.String r1 = "LOCKED"
            boolean r2 = r1.equalsIgnoreCase(r2)
            java.lang.Object r1 = r0.A02
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r2 == 0) goto L_0x03aa
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131962133(0x7f132915, float:1.9560983E38)
            r1.setText(r0)
            return
        L_0x037c:
            java.lang.Object r3 = r0.A02
            X.2Fk r3 = (X.2Fk) r3
            java.lang.Object r2 = r0.A01
            X.QCU r2 = (X.QCU) r2
            X.QDF r0 = r2.A01
            X.2gB r0 = r0.A06
            java.lang.Object r1 = r0.A02()
            X.34S r0 = new X.34S
            r0.<init>(r14, r1)
            r3.A0A(r0)
            X.QDF r0 = r2.A01
            X.2gB r0 = r0.A04
            java.lang.Object r1 = r0.A02()
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0022
            X.Ryu r0 = r2.A00
            android.view.View r1 = r0.A01
        L_0x03aa:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x03b0:
            java.lang.Object r2 = r0.A01
            X.SSY r2 = (X.SSY) r2
            java.lang.Object r3 = r0.A02
            X.2Fk r3 = (X.2Fk) r3
            X.SUj r14 = (X.SUj) r14
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r14.A01
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "REPROCESS"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0022
            X.Sus r0 = r2.A00
            r0.getClass()
            X.RsH r0 = r0.A00
            if (r0 == 0) goto L_0x03dc
            X.Sus r1 = r2.A00
            r0 = 0
            r1.A00(r0)
            return
        L_0x03dc:
            java.lang.Object r0 = r3.A02()
            goto L_0x001f
        L_0x03e2:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x0422
            java.lang.Object r3 = r0.A01
            X.QDI r3 = (X.QDI) r3
            java.lang.Object r2 = r14.A01
            r2.getClass()
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "AUTH_FLOW_UTIL_PASSWORD_ENTERED"
            r4.putString(r1, r2)
            X.2gB r3 = r3.A06
            r2 = 0
            X.34S r1 = new X.34S
            r1.<init>(r2, r4)
            X.SUj r2 = X.SUj.A09(r1)
            X.SR4 r1 = new X.SR4
            r1.<init>(r2)
        L_0x040f:
            r3.A0A(r1)
        L_0x0412:
            java.lang.Object r0 = r0.A01
            X.QDI r0 = (X.QDI) r0
            X.2gB r3 = r0.A05
            boolean r0 = X.SUj.A0T(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x001f
        L_0x0422:
            boolean r1 = X.SUj.A0S(r14)
            if (r1 == 0) goto L_0x0412
            java.lang.Object r3 = r0.A01
            X.QDI r3 = (X.QDI) r3
            X.2gB r2 = r3.A06
            java.lang.Object r1 = r0.A02
            X.2Fk r1 = (X.2Fk) r1
            r2.A0D(r1)
            X.2gB r3 = r3.A07
            java.lang.Throwable r1 = r14.A02
            goto L_0x040f
        L_0x043a:
            X.SUj r2 = X.Pxf.A0P(r14)
            boolean r1 = X.SUj.A0T(r2)
            if (r1 != 0) goto L_0x0022
            boolean r1 = X.SUj.A0S(r2)
            if (r1 == 0) goto L_0x0456
            java.lang.Object r1 = r0.A01
            X.SJK r1 = (X.SJK) r1
            java.lang.String r1 = r1.A09
            boolean r1 = X.Re2.A00(r1)
            if (r1 != 0) goto L_0x0022
        L_0x0456:
            java.lang.Object r0 = r0.A02
            X.2Fk r0 = (X.2Fk) r0
            r0.A0B(r2)
            return
        L_0x045e:
            X.SUj r14 = (X.SUj) r14
            boolean r2 = X.SUj.A0V(r14)
            java.lang.String r9 = "Required value was null."
            r12 = 0
            r1 = 0
            if (r2 == 0) goto L_0x04f7
            java.lang.Object r5 = r14.A01
            X.QXJ r5 = (X.QXJ) r5
            if (r5 == 0) goto L_0x0a72
            X.QRm r7 = r5.A0E()
            if (r7 == 0) goto L_0x0a72
            java.lang.Class<X.QRl> r6 = X.C7644QRl.class
            r4 = 3
            java.lang.String r3 = "non_auth_step_up_error"
            r2 = -2119733934(0xffffffff81a76d52, float:-6.150298E-38)
            X.3lr r8 = r7.getOptionalTreeField(r4, r3, r6, r2)
            if (r8 == 0) goto L_0x0a72
            java.lang.Class<X.QRk> r7 = X.C7643QRk.class
            java.lang.String r6 = "step_up_requirements"
            r4 = -1385379362(0xffffffffad6cc9de, float:-1.345987E-11)
            com.google.common.collect.ImmutableList r2 = r8.getRequiredCompactedTreeListField(r12, r6, r7, r4)
            if (r2 == 0) goto L_0x0a72
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0a72
            X.Sto r13 = X.C51965G9l.A0g()
            java.lang.Object r2 = r0.A01
            X.Ryk r2 = (X.C10824Ryk) r2
            com.facebookpay.logging.LoggingContext r15 = r2.A02
            com.facebookpay.paymentmethod.model.PaymentMethod r3 = r2.A03
            java.lang.String r2 = r3.Asm()
            long r17 = java.lang.Long.parseLong(r2)
            X.XRm r14 = r3.Asn()
            java.lang.Object r0 = r0.A02
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x04f5
            X.SEB r5 = X.C11300SKk.A01(r0)
        L_0x04bb:
            com.google.common.collect.ImmutableList r0 = r8.getRequiredCompactedTreeListField(r12, r6, r7, r4)
            if (r0 == 0) goto L_0x0a6d
            java.lang.Object r4 = r0.get(r12)
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0a6d
            java.lang.Class<X.QTD> r3 = X.QTD.class
            java.lang.String r2 = "PAYFBPayMIBToCIBStepUp"
            r0 = -1229562524(0xffffffffb6b65d64, float:-5.434895E-6)
            X.3lr r2 = r4.reinterpretIfFulfillsType(r12, r2, r3, r0)
            if (r2 == 0) goto L_0x04df
            X.RGT r1 = X.RGT.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "step_up_type"
            java.lang.Enum r1 = r2.getOptionalEnumField(r12, r0, r1)
        L_0x04df:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.util.LinkedHashMap r1 = X.Pxj.A0x(r5)
            if (r2 == 0) goto L_0x04ef
            java.lang.String r0 = "non_auth_step_up_type"
            r1.put(r0, r2)
        L_0x04ef:
            r16 = r1
            r13.A0G(r14, r15, r16, r17)
            return
        L_0x04f5:
            r5 = r1
            goto L_0x04bb
        L_0x04f7:
            boolean r2 = X.SUj.A0S(r14)
            if (r2 == 0) goto L_0x0022
            java.lang.Throwable r2 = r14.A02
            boolean r3 = r2 instanceof X.C8284QnQ
            if (r3 == 0) goto L_0x0570
            r3 = r2
            X.QnQ r3 = (X.C8284QnQ) r3
            if (r3 == 0) goto L_0x0570
            X.S5g r3 = r3.A00
            if (r3 == 0) goto L_0x0570
            java.util.List<X.S6A> r4 = r3.A01
        L_0x050e:
            X.Sto r6 = X.C51965G9l.A0g()
            java.lang.Object r3 = r0.A01
            X.Ryk r3 = (X.C10824Ryk) r3
            com.facebookpay.logging.LoggingContext r8 = r3.A02
            com.facebookpay.paymentmethod.model.PaymentMethod r5 = r3.A03
            java.lang.String r3 = r5.Asm()
            long r10 = java.lang.Long.parseLong(r3)
            X.XRm r7 = r5.Asn()
            java.lang.Object r0 = r0.A02
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x056e
            X.SEB r3 = X.C11300SKk.A01(r0)
        L_0x0530:
            if (r4 == 0) goto L_0x055c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x055c
            java.lang.Object r0 = r4.get(r12)
            X.S6A r0 = (X.S6A) r0
            if (r0 == 0) goto L_0x055c
            java.util.List<X.S6f> r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x055c
            java.lang.Object r0 = r4.get(r12)
            X.S6A r0 = (X.S6A) r0
            if (r0 == 0) goto L_0x0af4
            java.util.List<X.S6f> r0 = r0.A00
            java.lang.Object r0 = r0.get(r12)
            X.S6f r0 = (X.C11027S6f) r0
            if (r0 == 0) goto L_0x0af4
            java.lang.String r1 = r0.A00
        L_0x055c:
            java.util.LinkedHashMap r9 = X.Pxj.A0x(r3)
            X.Pxj.A1Q(r2, r9)
            if (r1 == 0) goto L_0x056a
            java.lang.String r0 = "auth_step_up_type"
            r9.put(r0, r1)
        L_0x056a:
            r6.A0G(r7, r8, r9, r10)
            return
        L_0x056e:
            r3 = r1
            goto L_0x0530
        L_0x0570:
            r4 = r1
            goto L_0x050e
        L_0x0572:
            X.SUj r14 = (X.SUj) r14
            r11 = 0
            X.0qQ.A0B(r14, r11)
            java.lang.Object r10 = r0.A02
            com.facebookpay.offsite.base.CheckoutHandler r10 = (com.facebookpay.offsite.base.CheckoutHandler) r10
            r8 = 0
            r3 = 1
            r18 = r8
            java.lang.String r9 = r10.A0C(r8)
            java.util.concurrent.atomic.AtomicReference r2 = r10.A0W
            java.lang.String r1 = "0"
            r2.set(r1)
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x0659
            java.lang.Object r12 = r14.A01
            r12.getClass()
            r7 = r12
            X.QSx r7 = (X.C7682QSx) r7
            java.lang.Class<X.QSw> r4 = X.C7681QSw.class
            java.lang.String r2 = "handle_checkout_event(input:$input)"
            r1 = 891167727(0x351e23ef, float:5.8911877E-7)
            X.3lr r5 = r7.A03(r4, r2, r1)
            if (r5 == 0) goto L_0x0630
            java.lang.Class<X.QSv> r4 = X.C7680QSv.class
            java.lang.String r2 = "payment_details_updates"
            r1 = 1472614057(0x57c64ea9, float:4.3608229E14)
            com.google.common.collect.ImmutableList r4 = r5.A06(r4, r2, r1)
            if (r4 == 0) goto L_0x0630
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0630
            java.lang.Object r1 = r4.get(r11)
            if (r1 == 0) goto L_0x0630
            X.2Fj r6 = r10.A0R
            X.SUj r1 = X.Pxe.A0W(r6)
            if (r1 == 0) goto L_0x0630
            java.lang.Object r15 = r1.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r15 = (com.facebookpay.expresscheckout.models.TransactionInfo) r15
            if (r15 == 0) goto L_0x0630
            java.lang.Object r13 = r0.A01
            X.RzI r13 = (X.C10857RzI) r13
            java.lang.Object r14 = r4.get(r11)
            X.3lr r14 = (X.C250663lr) r14
            if (r14 == 0) goto L_0x064b
            java.lang.Class<X.QSt> r5 = X.C7678QSt.class
            java.lang.String r2 = "price_items"
            r1 = 1908452541(0x71c0acbd, float:1.9081584E30)
            com.google.common.collect.ImmutableList r1 = r14.getRequiredCompactedTreeListField(r3, r2, r5, r1)
            if (r1 == 0) goto L_0x064b
            boolean r1 = r1.isEmpty()
            if (r1 != r3) goto L_0x064b
        L_0x05ee:
            X.S7g r11 = com.facebookpay.offsite.base.CheckoutHandler.A00(r10)
            com.facebookpay.shippingaddress.model.ShippingAddress r14 = r13.A01
            com.facebookpay.shippingaddress.model.ShippingAddress r5 = r13.A00
            com.facebookpay.expresscheckout.models.ShippingOptions r1 = r15.A03
            if (r1 == 0) goto L_0x0649
            java.lang.String r4 = r1.A00
        L_0x05fc:
            com.facebookpay.expresscheckout.models.PromoCodeList r1 = r15.A02
            if (r1 == 0) goto L_0x0602
            java.util.List<java.lang.String> r8 = r1.A00
        L_0x0602:
            java.lang.String r3 = r13.A06
            java.lang.String r2 = r13.A09
            java.lang.String r1 = r13.A05
            java.lang.String r13 = r13.A08
            r19 = r4
            r20 = r3
            r21 = r2
            r22 = r1
            r23 = r13
            r24 = r8
            r16 = r14
            r17 = r5
            com.facebookpay.offsite.models.message.PaymentDetails r1 = X.C11090S9p.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r11.A01 = r1
            r12.getClass()
            X.QnS r1 = X.SPz.A02(r7)
            if (r1 == 0) goto L_0x0644
            X.SUj r1 = X.SUj.A0A(r15, r1)
        L_0x062d:
            r6.A0B(r1)
        L_0x0630:
            X.REu r3 = X.C8902REu.CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_SUCCESS
        L_0x0632:
            java.lang.Object r2 = r0.A01
            X.RzI r2 = (X.C10857RzI) r2
            java.lang.String r1 = com.facebookpay.offsite.base.CheckoutHandler.A02(r10)
            java.util.Map r0 = r10.A0F
            java.util.LinkedHashMap r0 = X.C11418SSt.A01(r2, r1, r9, r0)
            r10.A0H(r3, r0)
            return
        L_0x0644:
            X.SUj r1 = X.SUj.A09(r15)
            goto L_0x062d
        L_0x0649:
            r4 = r8
            goto L_0x05fc
        L_0x064b:
            java.lang.Object r1 = r4.get(r11)
            X.0qQ.A07(r1)
            X.QSv r1 = (X.C7680QSv) r1
            com.facebookpay.expresscheckout.models.TransactionInfo r15 = X.C11432SUd.A0B(r1, r15)
            goto L_0x05ee
        L_0x0659:
            boolean r1 = X.SUj.A0S(r14)
            if (r1 == 0) goto L_0x0022
            X.2Fj r12 = r10.A0R
            X.SUj r1 = X.Pxe.A0W(r12)
            if (r1 == 0) goto L_0x0725
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x0725
            java.lang.Throwable r4 = r14.A02
            if (r4 == 0) goto L_0x0718
            boolean r1 = r4 instanceof X.C8286QnS
            if (r1 == 0) goto L_0x0718
            java.lang.String r3 = "null cannot be cast to non-null type com.fbpay.util.exceptions.PaymentsUserFacingException"
            r13 = r4
            X.QnS r13 = (X.C8286QnS) r13
            X.0qQ.A0B(r13, r11)
            int r1 = r13.A00
            switch(r1) {
                case 4447003: goto L_0x0714;
                case 4447004: goto L_0x0681;
                case 4447005: goto L_0x0714;
                case 4447006: goto L_0x0714;
                default: goto L_0x0681;
            }
        L_0x0681:
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
        L_0x0683:
            java.lang.String r7 = r13.A04
            X.RuX r1 = new X.RuX
            r1.<init>(r8, r2, r7)
            java.util.List r6 = X.AnonymousClass7TE.A1I(r1)
            java.lang.Object r1 = X.00k.A0J(r6)
            X.RuX r1 = (X.C10577RuX) r1
            if (r1 == 0) goto L_0x0712
            java.lang.Integer r2 = r1.A00
        L_0x0698:
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            if (r2 != r1) goto L_0x06f6
            X.0qQ.A0C(r4, r3)
            java.lang.String r5 = com.facebookpay.offsite.base.CheckoutHandler.A02(r10)
            X.Q6J r4 = r10.A04
            if (r4 == 0) goto L_0x06f6
            X.SPB r1 = X.AnonymousClass2E0.A0A()
            android.graphics.drawable.Drawable r16 = r1.A04(r4)
            java.lang.String r1 = r13.A05
            r21 = r1
            X.RuV r2 = r13.A01
            java.lang.String r1 = r2.A01
            r18 = r1
            X.RGf r3 = r2.A00
            X.RGf r1 = X.C8937RGf.DISMISS_AND_CLOSE
            boolean r27 = X.AnonymousClass7TF.A1W(r3, r1)
            java.lang.String r1 = r2.A02
            r17 = r1
            X.RuV r1 = r13.A02
            if (r1 == 0) goto L_0x070e
            java.lang.String r15 = r1.A01
            X.RGf r14 = r1.A00
            java.lang.String r2 = r1.A02
        L_0x06cf:
            X.Sva r1 = new X.Sva
            r1.<init>(r10, r13, r9, r5)
            X.SvX r5 = new X.SvX
            r5.<init>(r4, r11)
            r22 = r7
            r23 = r18
            r24 = r17
            r25 = r15
            r26 = r2
            r17 = r3
            r18 = r14
            r19 = r5
            r20 = r1
            X.SOk r2 = X.SA0.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.SIG r1 = X.AnonymousClass2E0.A0H()
            X.SIG.A00(r4, r2, r1)
        L_0x06f6:
            X.TQn r2 = new X.TQn
            r2.<init>(r6)
            X.SUj r1 = X.Pxe.A0W(r12)
            if (r1 == 0) goto L_0x0703
            java.lang.Object r8 = r1.A01
        L_0x0703:
            X.SUj r1 = X.SUj.A0A(r8, r2)
        L_0x0707:
            r12.A0B(r1)
            X.REu r3 = X.C8902REu.CLIENT_LOAD_OFFSITEPAYMENTDETAILSCHANGED_FAIL
            goto L_0x0632
        L_0x070e:
            r15 = r8
            r14 = r8
            r2 = r8
            goto L_0x06cf
        L_0x0712:
            r2 = r8
            goto L_0x0698
        L_0x0714:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x0683
        L_0x0718:
            X.SUj r1 = X.Pxe.A0W(r12)
            if (r1 == 0) goto L_0x0720
            java.lang.Object r8 = r1.A01
        L_0x0720:
            X.SUj r1 = X.SUj.A09(r8)
            goto L_0x0707
        L_0x0725:
            java.lang.Throwable r2 = r14.A02
            goto L_0x0703
        L_0x0728:
            X.SUj r14 = (X.SUj) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.Object r1 = r0.A02
            X.QDN r1 = (X.QDN) r1
            java.lang.Object r5 = r0.A01
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r5 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r5
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x0783
            X.SUj r0 = r1.A0N
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            if (r0 == 0) goto L_0x0781
            com.facebookpay.paymentmethod.model.PaymentMethod r10 = r0.A01
        L_0x0746:
            java.lang.String r22 = "Required value was null."
            if (r10 == 0) goto L_0x0dfb
            java.lang.Object r3 = r14.A01
            X.QXJ r3 = (X.QXJ) r3
            if (r3 == 0) goto L_0x0af9
            X.QRm r7 = r3.A0E()
            if (r7 == 0) goto L_0x0af9
            java.lang.Class<X.QRi> r6 = X.C7641QRi.class
            java.lang.String r4 = "container_list"
            r0 = -811815526(0xffffffffcf9cad9a, float:-5.2572457E9)
            com.google.common.collect.ImmutableList r4 = r7.getRequiredCompactedTreeListField(r2, r4, r6, r0)
            if (r4 == 0) goto L_0x0af9
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r4.iterator()
        L_0x076b:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0afa
            X.3lr r6 = X.C41845B3m.A0V(r7)
            java.lang.String r4 = "container_id"
            java.lang.String r4 = r6.A0B(r4)
            if (r4 == 0) goto L_0x076b
            r0.add(r4)
            goto L_0x076b
        L_0x0781:
            r10 = 0
            goto L_0x0746
        L_0x0783:
            boolean r0 = X.SUj.A0S(r14)
            if (r0 == 0) goto L_0x0022
            java.lang.Throwable r3 = r14.A02
            boolean r0 = r3 instanceof X.C8286QnS
            if (r0 == 0) goto L_0x07ac
            X.2Fj r2 = r1.A0t
            java.lang.String r0 = "null cannot be cast to non-null type com.fbpay.util.exceptions.PaymentsUserFacingException"
            X.0qQ.A0C(r3, r0)
            X.QnS r3 = (X.C8286QnS) r3
            X.SR4 r0 = X.SPz.A00(r3)
            r2.A0B(r0)
            X.2gB r1 = r1.A0r
            X.ScW r0 = X.C11571ScW.A00
        L_0x07a4:
            X.1MD r0 = (X.1MD) r0
            X.SUj r0 = X.SUj.A03(r0, r14)
            goto L_0x0881
        L_0x07ac:
            boolean r0 = r3 instanceof X.TQV
            if (r0 == 0) goto L_0x07b5
            X.2gB r1 = r1.A0r
            X.ScX r0 = X.C11572ScX.A00
            goto L_0x07a4
        L_0x07b5:
            boolean r0 = r3 instanceof X.TQY
            if (r0 != 0) goto L_0x07e7
            boolean r0 = r3 instanceof X.C8284QnQ
            if (r0 != 0) goto L_0x07e7
            boolean r0 = r3 instanceof X.C13223TQo
            if (r0 != 0) goto L_0x07e7
            X.2Fj r2 = r1.A0t
            r5 = 0
            r0 = 2131961294(0x7f1325ce, float:1.955928E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 2131961291(0x7f1325cb, float:1.9559275E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            X.RFe r4 = X.C8911RFe.A04
            com.facebookpay.common.models.ErrorDialogContent r3 = new com.facebookpay.common.models.ErrorDialogContent
            r6 = r5
            r7 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.SR4.A01(r2, r3)
            X.2gB r1 = r1.A0r
            X.ScY r0 = X.C11573ScY.A00
            goto L_0x07a4
        L_0x07e7:
            X.2gB r1 = r1.A0r
            X.ScZ r0 = X.C11574ScZ.A00
            goto L_0x07a4
        L_0x07ec:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x0863
            java.lang.Object r10 = r14.A01
            if (r10 == 0) goto L_0x0863
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.0eK r1 = r1.A0I
            java.lang.Object r1 = r1.get()
            X.0qQ.A07(r1)
            java.lang.String r3 = "https://www.instagram.com/payments/paypal_close/"
            java.lang.Object r2 = r0.A02
            X.QDM r2 = (X.QDM) r2
            X.2Fj r1 = r2.A0H
            java.lang.Object r9 = r1.A02()
            java.lang.String r1 = "Required value was null."
            if (r9 == 0) goto L_0x0e00
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r9 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r9
            com.facebookpay.logging.LoggingContext r2 = r2.A0R
            java.lang.String r10 = (java.lang.String) r10
            r5 = 1
            r4 = 0
            java.lang.String[] r8 = new java.lang.String[]{r3}
            java.lang.String r7 = "nuxFormContentRequestKey"
            X.RFs r6 = X.C8924RFs.A0c
            X.DbY.A1S(r9, r10)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "ECP_LAUNCH_PARAMS"
            r3.putParcelable(r1, r9)
            java.lang.String r1 = "logging_context"
            r3.putParcelable(r1, r2)
            java.lang.String r1 = "ECP_PAYPAL_BA_LOADING_URL"
            r3.putString(r1, r10)
            java.lang.String r2 = "ECP_CONTAINER_FRAGMENT_TYPE"
            java.lang.String r1 = "web_view_fragment"
            r3.putString(r2, r1)
            java.lang.String r2 = "ECP_CONTAINER_FRAGMENT_TITLE"
            r1 = 0
            r3.putString(r2, r1)
            java.lang.String r1 = "ECP_CONTENT_FRAGMENT_REQUEST_KEY"
            r3.putString(r1, r7)
            java.lang.String r1 = "ECP_PAYPAL_BA_ALLOWED_INTERCEPT_URL"
            r3.putStringArray(r1, r8)
            java.lang.String r1 = "ECP_CONTAINER_FRAGMENT_NAV_BAR_STYLE"
            r3.putSerializable(r1, r6)
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = "ecp_container_fragment"
            X.C11336SNr.A00(r3, r1, r0, r5, r4)
            return
        L_0x0863:
            boolean r1 = X.SUj.A0S(r14)
            if (r1 == 0) goto L_0x0022
            java.lang.Object r2 = r0.A02
            X.QDM r2 = (X.QDM) r2
            X.2Fj r1 = r2.A0I
            r0 = 0
            X.SUj.A0I(r1, r14, r0)
            X.2gB r1 = r2.A09
            int r0 = X.QDM.A00(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.SUj r0 = X.SUj.A09(r0)
        L_0x0881:
            r1.A0B(r0)
            return
        L_0x0885:
            X.SEH r14 = (X.SEH) r14
            if (r14 == 0) goto L_0x0022
            java.lang.Object r1 = r0.A02
            X.Pxe.A1P(r0, r1)
            java.lang.Object r4 = r0.A01
            X.STY r4 = (X.STY) r4
            X.QLA r3 = r4.A07
            if (r3 == 0) goto L_0x0022
            java.lang.Throwable r0 = r14.A01
            boolean r2 = X.DbW.A1a(r0)
            r1 = 0
            X.QKv r0 = r4.A04
            if (r2 == 0) goto L_0x08ab
            r0.A0G(r3)
            boolean r0 = r4.A0R
            if (r0 == 0) goto L_0x0022
        L_0x08a8:
            r4.A0R = r1
            return
        L_0x08ab:
            r0.A0F(r3)
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x08a8
            int r0 = r4.A00
            if (r0 != 0) goto L_0x0022
            r0 = 1
            r4.A0R = r0
            r4.A00 = r0
            return
        L_0x08bc:
            java.lang.Object r1 = r0.A01
            X.Pxe.A1P(r0, r1)
            java.lang.Object r0 = r0.A02
            X.2gO r0 = (X.AnonymousClass2gO) r0
            r0.onChanged(r14)
            return
        L_0x08c9:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r14.booleanValue()
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            return
        L_0x08db:
            X.Rws r14 = (X.C10714Rws) r14
            java.lang.Object r1 = r0.A02
            X.Pxe.A1P(r0, r1)
            java.lang.Object r2 = r0.A01
            X.TKZ r2 = (X.TKZ) r2
            X.QDE r3 = r2.A02
            X.Tg7 r1 = r2.A03
            X.SR5 r13 = r2.A00
            X.SNj r0 = r2.A05
            X.RsH r2 = r2.A04
            X.QAV r12 = new X.QAV
            r12.<init>(r3, r1, r2, r0)
            X.2Fj r1 = r3.A05
            X.5A3 r0 = r3.A09
            X.2E5 r0 = r0.A00
            java.util.concurrent.Executor r0 = r0.A03
            r14.getClass()
            r15 = 0
            X.S4v r11 = new X.S4v
            r16 = r2
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.SR4.A02(r1, r11)
            return
        L_0x090e:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0S(r14)
            if (r1 != 0) goto L_0x091c
            boolean r1 = X.SUj.A0V(r14)
            if (r1 == 0) goto L_0x092d
        L_0x091c:
            java.lang.Object r1 = r0.A01
            X.Suq r1 = (X.C12458Suq) r1
            java.lang.Object r1 = r1.A01
            X.QDE r1 = (X.QDE) r1
            X.2gB r2 = r1.A03
            java.lang.Object r1 = r0.A02
            X.2Fk r1 = (X.2Fk) r1
            r2.A0D(r1)
        L_0x092d:
            java.lang.Object r0 = r0.A01
            X.Suq r0 = (X.C12458Suq) r0
            java.lang.Object r0 = r0.A01
            X.QDE r0 = (X.QDE) r0
            X.2gB r0 = r0.A03
            r0.A0A(r14)
            return
        L_0x093b:
            X.SUj r14 = (X.SUj) r14
            java.lang.Object r3 = r0.A01
            X.S6h r3 = (X.C11029S6h) r3
            X.SOC r1 = r3.A01
            X.SFZ r2 = r1.A02
            java.lang.Object r1 = r0.A02
            java.util.Map r0 = r2.A03
            r0.remove(r1)
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x0968
            java.lang.Object r0 = X.SUj.A0D(r14)
            X.RvG r5 = r3.A02
            X.4uI r2 = r5.A02
            X.6Tl r1 = X.DbU.A0T(r0)
        L_0x095e:
            X.6Tm r1 = r1.A00()
            X.6Rx r0 = r5.A00
            X.C299275ur.A00(r0, r1, r2)
            return
        L_0x0968:
            X.RvG r5 = r3.A02
            if (r14 == 0) goto L_0x0970
            java.lang.Throwable r1 = r14.A02
            if (r1 != 0) goto L_0x0977
        L_0x0970:
            java.lang.String r0 = "An unknown error was thrown during the authorization process"
            X.RJf r1 = new X.RJf
            r1.<init>(r0)
        L_0x0977:
            r4 = 0
            r3 = 0
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "exception"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "remaining_attempts"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r4)
            java.lang.String r0 = "auth_factor_expired"
            java.util.LinkedHashMap r0 = X.DbY.A0q(r0, r4, r2, r1)
            X.4uI r2 = r5.A01
            X.6Tl r1 = X.DbS.A0P()
            r1.A03(r0, r3)
            goto L_0x095e
        L_0x099a:
            X.TaB r14 = (X.C13425TaB) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.Object r4 = r0.A01
            X.0r1 r4 = (X.0r1) r4
            boolean r1 = r4.A00
            r3 = 1
            if (r1 != 0) goto L_0x09c0
            boolean r1 = r14 instanceof X.C7626QQs
            if (r1 == 0) goto L_0x09cd
            X.Ta9 r14 = (X.C13423Ta9) r14
            X.SoN r14 = (X.C12172SoN) r14
            X.S4u r2 = r14.A00
            X.S1A r1 = r2.A03
            X.TC2 r0 = new X.TC2
            r0.<init>(r2)
            r1.A00(r0)
            r4.A00 = r3
            return
        L_0x09c0:
            boolean r1 = r14 instanceof X.C13941Tln
            if (r1 == 0) goto L_0x09cd
            java.lang.Object r1 = r0.A02
            X.Jfk r1 = (X.C60104Jfk) r1
            X.Tln r14 = (X.C13941Tln) r14
            X.C60104Jfk.A00(r1, r14, r3)
        L_0x09cd:
            java.lang.Object r1 = r0.A02
            X.Jfk r1 = (X.C60104Jfk) r1
            r1.A02 = r2
            X.2Fk r1 = r1.A07
            r1.A08(r0)
            return
        L_0x09d9:
            X.SEH r14 = (X.SEH) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.Throwable r1 = r14.A01
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            if (r1 != 0) goto L_0x09f6
            java.lang.Object r1 = r14.A00
        L_0x09e9:
            r2.invoke(r1)
            java.lang.Object r1 = r0.A01
            X.2Fk r1 = (X.2Fk) r1
            X.Pxm r0 = X.Pxm.A08
            r1.A05(r0)
            return
        L_0x09f6:
            r1 = 0
            goto L_0x09e9
        L_0x09f8:
            r6 = 0
            java.lang.String r8 = "FETCH_RESULT"
            r5 = 772805399(0x2e101317, float:3.2758764E-11)
            if (r57 == 0) goto L_0x0a45
            java.lang.Object r1 = r0.A01
            X.STY r1 = (X.STY) r1
            X.4gR r1 = r1.A0T
            X.SJh r2 = r1.A02
            java.lang.Object r7 = r0.A02
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.String r0 = "VALID_CARD_FETCH_RESPONSE"
            r2.A03(r7, r8, r0, r5)
            X.RzL r0 = r1.A00
            X.JwI r0 = r0.A0D
            r0.A00 = r14
            goto L_0x0a41
        L_0x0a18:
            X.SUj r14 = (X.SUj) r14
            boolean r1 = X.SUj.A0S(r14)
            r6 = 0
            java.lang.String r8 = "FETCH_RESULT"
            r5 = 772805399(0x2e101317, float:3.2758764E-11)
            if (r1 != 0) goto L_0x0a45
            java.lang.Object r3 = r14.A01
            if (r3 == 0) goto L_0x0a45
            java.lang.Object r1 = r0.A01
            X.STY r1 = (X.STY) r1
            X.4gR r1 = r1.A0T
            X.SJh r2 = r1.A02
            java.lang.Object r7 = r0.A02
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.String r0 = "VALID_CARD_FETCH_RESPONSE"
            r2.A03(r7, r8, r0, r5)
            X.RzL r0 = r1.A00
            X.JwI r0 = r0.A0D
            r0.A00 = r3
        L_0x0a41:
            r2.A01(r7, r6, r5)
            return
        L_0x0a45:
            java.lang.Object r7 = r0.A01
            X.STY r7 = (X.STY) r7
            java.lang.String r4 = "INVALID_CARD_FETCH_RESPONSE"
            X.RRP r1 = r7.A06(r4)
            X.SHz r3 = r1.A00()
            X.QKv r1 = r7.A04
            android.os.Bundle r2 = r1.A02()
            X.4gR r1 = r7.A0T
            X.SUR.A0A(r2, r1, r3)
            X.SJh r2 = r1.A02
            java.lang.Object r7 = r0.A02
            java.lang.Integer r7 = (java.lang.Integer) r7
            r2.A03(r7, r8, r4, r5)
            goto L_0x0a41
        L_0x0a68:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a6d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0a72:
            X.Sto r2 = X.C51965G9l.A0g()
            java.lang.Object r3 = r0.A01
            X.Ryk r3 = (X.C10824Ryk) r3
            com.facebookpay.logging.LoggingContext r8 = r3.A02
            com.facebookpay.paymentmethod.model.PaymentMethod r4 = r3.A03
            java.lang.String r3 = r4.Asm()
            long r13 = java.lang.Long.parseLong(r3)
            X.XRm r7 = r4.Asn()
            if (r5 == 0) goto L_0x0abd
            X.QRm r6 = r5.A0E()
            if (r6 == 0) goto L_0x0abd
            java.lang.Class<X.QRi> r5 = X.C7641QRi.class
            java.lang.String r4 = "container_list"
            r3 = -811815526(0xffffffffcf9cad9a, float:-5.2572457E9)
            com.google.common.collect.ImmutableList r3 = r6.getRequiredCompactedTreeListField(r12, r4, r5, r3)
            if (r3 == 0) goto L_0x0abd
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r3.iterator()
        L_0x0aa7:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0abf
            X.3lr r4 = X.C41845B3m.A0V(r5)
            java.lang.String r3 = "container_id"
            java.lang.String r3 = r4.A0B(r3)
            if (r3 == 0) goto L_0x0aa7
            r9.add(r3)
            goto L_0x0aa7
        L_0x0abd:
            X.0sn r9 = X.0sn.A00
        L_0x0abf:
            java.lang.Object r0 = r0.A02
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x0ac9
            X.SEB r1 = X.C11300SKk.A01(r0)
        L_0x0ac9:
            java.util.LinkedHashMap r10 = X.Pxj.A0x(r1)
            java.lang.String r11 = "checkout"
            r0 = 2
            X.0qQ.A0B(r7, r0)
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "client_add_ecppaymentcontainer_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 20
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            X.Ixl r6 = new X.Ixl
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.C12411Sto.A03(r0, r8, r6)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r2.A01
            r1 = 223884226(0xd5833c2, float:6.662244E-31)
            java.lang.String r0 = "CONTAINER_CREATION_WITHOUT_NONAUTH_ERROR_SUCCESS"
            r2.markerPoint(r1, r0)
            return
        L_0x0af4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0af9:
            r0 = 0
        L_0x0afa:
            X.Sto r31 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r4 = r1.A1P
            java.lang.String r6 = r10.Asm()
            long r38 = java.lang.Long.parseLong(r6)
            X.XRm r32 = r10.Asn()
            X.QDL r8 = r1.A1O
            java.util.List r35 = r8.A06()
            X.QDH r6 = r1.A1Q
            r40 = r6
            X.SEB r7 = r40.A03()
            r20 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r29 = 0
            r30 = 0
            r21 = 0
            r6 = 0
            r16 = 0
            java.util.LinkedHashMap r37 = X.SUU.A07(r7)
            java.lang.String r34 = "checkout"
            r33 = r4
            r36 = r0
            r31.A0E(r32, r33, r34, r35, r36, r37, r38)
            if (r3 == 0) goto L_0x0df6
            X.QRm r7 = r3.A0E()
            if (r7 == 0) goto L_0x0df6
            java.lang.Class<X.QRi> r4 = X.C7641QRi.class
            java.lang.String r3 = "container_list"
            r0 = -811815526(0xffffffffcf9cad9a, float:-5.2572457E9)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r2, r3, r4, r0)
            if (r0 == 0) goto L_0x0df6
            java.lang.Object r3 = r0.get(r2)
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x0df6
            X.S5z r4 = X.QDN.A01(r1)
            boolean r0 = X.QDN.A0d(r1)
            if (r0 == 0) goto L_0x0b64
            if (r4 == 0) goto L_0x0b64
            java.lang.String r0 = r4.A02
            r20 = r0
        L_0x0b64:
            boolean r0 = X.QDN.A0c(r1)
            if (r0 == 0) goto L_0x0b72
            if (r4 == 0) goto L_0x0b72
            X.S6Z r0 = r4.A00
            if (r0 == 0) goto L_0x0b72
            java.lang.String r15 = r0.A02
        L_0x0b72:
            boolean r0 = X.QDN.A0e(r1)
            if (r0 == 0) goto L_0x0b80
            if (r4 == 0) goto L_0x0b80
            X.S6V r0 = r4.A01
            if (r0 == 0) goto L_0x0b80
            java.lang.String r14 = r0.A03
        L_0x0b80:
            java.util.List r4 = r1.A0l()
            X.5tb r0 = X.C298525tb.PICKUP_CONTACT_INFO
            boolean r0 = X.SQ0.A03(r0, r4)
            if (r0 == 0) goto L_0x0c72
            boolean r0 = X.QDN.A0g(r1)
            if (r0 != 0) goto L_0x0b9e
            boolean r0 = X.QDN.A0h(r1)
            if (r0 != 0) goto L_0x0b9e
            boolean r0 = X.QDN.A0f(r1)
            if (r0 == 0) goto L_0x0c72
        L_0x0b9e:
            r0 = 1
        L_0x0b9f:
            r4 = 0
            if (r0 == 0) goto L_0x0bb6
            X.QDQ r0 = r1.A1T
            X.2Fj r0 = r0.A06
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0bb6
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x0bb6
            java.lang.Object r4 = r0.A01
            com.facebookpay.expresscheckout.models.PickupInfo r4 = (com.facebookpay.expresscheckout.models.PickupInfo) r4
        L_0x0bb6:
            boolean r0 = X.QDN.A0g(r1)
            if (r0 == 0) goto L_0x0bc0
            if (r4 == 0) goto L_0x0bc0
            java.lang.String r13 = r4.A01
        L_0x0bc0:
            boolean r0 = X.QDN.A0f(r1)
            if (r0 == 0) goto L_0x0bca
            if (r4 == 0) goto L_0x0bca
            java.lang.String r12 = r4.A00
        L_0x0bca:
            boolean r0 = X.QDN.A0h(r1)
            if (r0 == 0) goto L_0x0bd4
            if (r4 == 0) goto L_0x0bd4
            java.lang.String r11 = r4.A03
        L_0x0bd4:
            boolean r0 = X.QDN.A0i(r1)
            if (r0 == 0) goto L_0x0bde
            com.facebookpay.shippingaddress.model.ShippingAddress r29 = X.QDN.A04(r1)
        L_0x0bde:
            X.2Fj r0 = r1.A11
            r31 = r0
            java.lang.Object r0 = r31.A02()
            if (r0 == 0) goto L_0x0df1
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0c00
            boolean r0 = X.Pxi.A1T(r0)
            if (r0 == 0) goto L_0x0c00
            X.QDT r0 = r1.A1R
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0c6d
            com.facebookpay.shippingaddress.model.ShippingAddress r30 = X.QDN.A04(r1)
        L_0x0c00:
            X.QDR r7 = r1.A1N
            X.2gB r0 = r7.A03
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0c6b
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x0c6b
            java.lang.Object r0 = r0.A01
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            if (r0 == 0) goto L_0x0c6b
            java.lang.String r0 = r0.A02()
        L_0x0c1a:
            X.2Fj r8 = r8.A0A
            java.util.List r8 = X.SRl.A02(r8)
            java.util.ArrayList r19 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r18 = r8.iterator()
        L_0x0c28:
            boolean r8 = r18.hasNext()
            if (r8 == 0) goto L_0x0c75
            java.lang.Object r8 = r18.next()
            com.facebookpay.incentives.model.ECPIncentive r8 = (com.facebookpay.incentives.model.ECPIncentive) r8
            java.lang.String r24 = r8.getId()
            java.lang.String r25 = r8.getTitle()
            java.lang.String r26 = r8.getSubtitle()
            java.lang.String r17 = ""
            if (r26 != 0) goto L_0x0c46
            r26 = r17
        L_0x0c46:
            boolean r9 = r8 instanceof com.facebookpay.incentives.model.ECPOffsiteOffer
            if (r9 == 0) goto L_0x0c68
            r9 = r8
            com.facebookpay.incentives.model.ECPOffsiteOffer r9 = (com.facebookpay.incentives.model.ECPOffsiteOffer) r9
            if (r9 == 0) goto L_0x0c68
            java.lang.String r9 = r9.A01
        L_0x0c51:
            java.lang.String r28 = r8.B2h()
            if (r28 != 0) goto L_0x0c59
            r28 = r17
        L_0x0c59:
            com.facebookpay.expresscheckout.models.ECPOffer r8 = new com.facebookpay.expresscheckout.models.ECPOffer
            r27 = r9
            r23 = r8
            r23.<init>(r24, r25, r26, r27, r28)
            r9 = r19
            r9.add(r8)
            goto L_0x0c28
        L_0x0c68:
            r9 = r17
            goto L_0x0c51
        L_0x0c6b:
            r0 = 0
            goto L_0x0c1a
        L_0x0c6d:
            com.facebookpay.shippingaddress.model.ShippingAddress r30 = X.QDN.A03(r1)
            goto L_0x0c00
        L_0x0c72:
            r0 = 0
            goto L_0x0b9f
        L_0x0c75:
            java.lang.Object r8 = r31.A02()
            if (r8 == 0) goto L_0x0dec
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r8 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r8
            java.lang.String r8 = r8.A0A
            r32 = r8
            int r8 = r5.A00
            r54 = r8
            java.lang.String r8 = r5.A09
            r23 = r8
            java.lang.String r8 = "container_external_id"
            java.lang.String r34 = r3.getOptionalStringField(r2, r8)
            if (r34 == 0) goto L_0x0de7
            java.lang.String r2 = "container_id"
            java.lang.String r35 = r3.A0B(r2)
            if (r35 == 0) goto L_0x0de2
            java.lang.String r2 = "description"
            java.lang.String r36 = r3.A08(r2)
            if (r36 == 0) goto L_0x0ddd
            java.lang.String r2 = "container_data"
            java.lang.String r37 = r3.A09(r2)
            X.RGA r9 = X.RGA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r8 = 3
            java.lang.String r2 = "payment_mode"
            java.lang.Enum r2 = r3.getOptionalEnumField(r8, r2, r9)
            if (r2 == 0) goto L_0x0dd8
            java.lang.String r38 = X.DbT.A10(r2)
            if (r4 == 0) goto L_0x0dc1
            java.lang.String r9 = r4.A02
        L_0x0cbb:
            if (r0 == 0) goto L_0x0dbc
            com.facebookpay.expresscheckout.models.TransactionInfo r2 = X.SUj.A01(r1)
            if (r2 == 0) goto L_0x0dbc
            com.facebookpay.expresscheckout.models.ShippingOptions r8 = r2.A03
            if (r8 == 0) goto L_0x0dbc
            java.lang.Integer r4 = r7.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r4 == r2) goto L_0x0cd3
            boolean r2 = X.QDN.A0i(r1)
            if (r2 == 0) goto L_0x0dbc
        L_0x0cd3:
            java.util.ArrayList<com.facebookpay.expresscheckout.models.ShippingOption> r2 = r8.A01
            java.util.Iterator r6 = r2.iterator()
        L_0x0cd9:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0db9
            java.lang.Object r2 = r6.next()
            r4 = r2
            com.facebookpay.expresscheckout.models.ShippingOption r4 = (com.facebookpay.expresscheckout.models.ShippingOption) r4
            java.lang.String r4 = r4.A03
            boolean r4 = X.0qQ.A0K(r4, r0)
            if (r4 == 0) goto L_0x0cd9
        L_0x0cee:
            com.facebookpay.expresscheckout.models.ShippingOption r2 = (com.facebookpay.expresscheckout.models.ShippingOption) r2
        L_0x0cf0:
            com.facebookpay.expresscheckout.models.TransactionInfo r4 = X.SUj.A01(r1)
            if (r4 == 0) goto L_0x0db6
            com.facebookpay.expresscheckout.models.FulfillmentOptions r6 = r4.A00
            if (r6 == 0) goto L_0x0db6
            java.lang.Integer r7 = r7.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r7 == r4) goto L_0x0d06
            boolean r4 = X.QDN.A0i(r1)
            if (r4 == 0) goto L_0x0db6
        L_0x0d06:
            java.util.ArrayList<com.facebookpay.expresscheckout.models.FulfillmentOption> r4 = r6.A01
            java.util.Iterator r7 = r4.iterator()
        L_0x0d0c:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0db3
            java.lang.Object r6 = r7.next()
            r4 = r6
            com.facebookpay.expresscheckout.models.FulfillmentOption r4 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r4
            java.lang.String r4 = r4.A00()
            boolean r4 = X.0qQ.A0K(r4, r0)
            if (r4 == 0) goto L_0x0d0c
        L_0x0d23:
            com.facebookpay.expresscheckout.models.FulfillmentOption r6 = (com.facebookpay.expresscheckout.models.FulfillmentOption) r6
        L_0x0d25:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r5.A01
            if (r0 == 0) goto L_0x0d2d
            java.util.Set<X.REi> r0 = r0.A0I
            r16 = r0
        L_0x0d2d:
            X.2Fj r0 = r1.A01
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x0dd3
            java.lang.Object r0 = r0.A01
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0dd3
            java.lang.String r7 = r1.A0V
            if (r7 == 0) goto L_0x0dce
            java.lang.String r4 = r1.A0W
            r18 = r4
            java.lang.String r4 = r5.A08
            r17 = r4
            r8 = 1
            r5 = r40
            r4 = r21
            com.facebookpay.otc.models.OtcInput r28 = r5.A02(r4, r8)
            X.SUj r4 = r1.A0S
            java.lang.Object r4 = r4.A01
            if (r4 == 0) goto L_0x0dc9
            com.facebookpay.expresscheckout.models.TransactionInfo r4 = (com.facebookpay.expresscheckout.models.TransactionInfo) r4
            java.lang.String r5 = "container_type"
            java.lang.String r50 = r3.A0C(r5)
            X.SUj r3 = r1.A09
            java.lang.Object r3 = r3.A01
            com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem r3 = (com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem) r3
            if (r3 == 0) goto L_0x0db1
            boolean r5 = r3.A00
        L_0x0d68:
            X.XRm r27 = r10.Asn()
            java.lang.String r3 = r10.Asm()
            java.lang.Long r31 = X.DbV.A0q(r3)
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r3 = new com.facebookpay.expresscheckout.models.ECPPaymentResponseParams
            r24 = r6
            r25 = r2
            r26 = r4
            r33 = r23
            r39 = r20
            r40 = r15
            r41 = r14
            r42 = r13
            r43 = r12
            r44 = r11
            r45 = r9
            r46 = r0
            r47 = r7
            r48 = r18
            r49 = r17
            r51 = r21
            r52 = r19
            r53 = r16
            r55 = r5
            r23 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r1.A05
            if (r0 == 0) goto L_0x0dc4
            X.2Fj r6 = r0.CJ4(r3)
            r0 = 6
            X.Sdq r5 = new X.Sdq
            r5.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r3)
            goto L_0x0ead
        L_0x0db1:
            r5 = 0
            goto L_0x0d68
        L_0x0db3:
            r6 = 0
            goto L_0x0d23
        L_0x0db6:
            r6 = 0
            goto L_0x0d25
        L_0x0db9:
            r2 = 0
            goto L_0x0cee
        L_0x0dbc:
            r2 = 0
            if (r0 == 0) goto L_0x0d25
            goto L_0x0cf0
        L_0x0dc1:
            r9 = 0
            goto L_0x0cbb
        L_0x0dc4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0dc9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0dce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0dd3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0dd8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0ddd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0de2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0de7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0dec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0df1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0df6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0dfb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r22)
            throw r0
        L_0x0e00:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0e05:
            X.SUj r14 = (X.SUj) r14
            java.lang.Object r3 = r0.A02
            X.QDN r3 = (X.QDN) r3
            X.0qQ.A0A(r14)
            java.lang.Object r4 = r0.A01
            com.facebookpay.expresscheckout.models.ECPPaymentResponseParams r4 = (com.facebookpay.expresscheckout.models.ECPPaymentResponseParams) r4
            r0 = 44
            X.TYA r2 = new X.TYA
            r2.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r4)
            boolean r0 = X.SUj.A0S(r14)
            if (r0 == 0) goto L_0x0e34
            java.lang.Throwable r5 = r14.A02
            boolean r0 = r5 instanceof X.C13221TQm
            if (r0 == 0) goto L_0x0eb1
            java.lang.String r0 = "null cannot be cast to non-null type com.fbpay.util.exceptions.ECPErrorDialogException"
            X.0qQ.A0C(r5, r0)
            X.TQm r5 = (X.C13221TQm) r5
            X.2Fj r1 = r3.A0t
            com.facebookpay.common.models.ErrorDialogContent r0 = r5.A00
            X.SR4.A01(r1, r0)
        L_0x0e34:
            boolean r0 = X.SUj.A0V(r14)
            if (r0 == 0) goto L_0x0ebf
            java.lang.Object r1 = r14.A01
            boolean r0 = r1 instanceof com.facebookpay.expresscheckout.models.PaymentHandledResponseData
            if (r0 == 0) goto L_0x0ebf
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.PaymentHandledResponseData"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.expresscheckout.models.PaymentHandledResponseData r1 = (com.facebookpay.expresscheckout.models.PaymentHandledResponseData) r1
            X.SUj r0 = r3.A0N
            java.lang.Object r5 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r5 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r5
            r0 = 0
            if (r5 == 0) goto L_0x0e53
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r5.A01
        L_0x0e53:
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x0eba
            X.Sto r6 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r8 = r3.A1P
            java.lang.String r0 = r0.Asm()
            long r13 = java.lang.Long.parseLong(r0)
            X.SUj r0 = r3.A0N
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            if (r0 == 0) goto L_0x0eb5
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r0.A01
            if (r0 == 0) goto L_0x0eb5
            X.XRm r7 = r0.Asn()
            java.lang.String r0 = r4.A0B
            java.util.List r11 = X.AnonymousClass7TE.A1I(r0)
            X.QDL r0 = r3.A1O
            java.util.List r10 = r0.A06()
            java.util.LinkedHashMap r12 = X.C66584MXp.A0f(r3)
            java.lang.String r9 = "payment_authorization"
            r6.A0E(r7, r8, r9, r10, r11, r12, r13)
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.SIP r7 = r0.A0E
            java.lang.String r0 = r1.A00
            X.QNI r6 = X.C11432SUd.A00(r4, r0)
            X.5A3 r5 = X.AnonymousClass2E0.A06()
            r0 = 7
            X.Sc3 r1 = new X.Sc3
            r1.<init>(r0, r6, r7)
            X.Scs r0 = X.C11593Scs.A00
            X.QCn r6 = X.SSC.A02(r5, r0, r1)
            r0 = 6
            X.Sds r5 = new X.Sds
            r5.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r2)
        L_0x0ead:
            X.SUj.A0H(r6, r5)
            return
        L_0x0eb1:
            X.QDN.A0P(r3, r5)
            goto L_0x0e34
        L_0x0eb5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0eba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0ebf:
            r2.invoke(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11648Sdq.onChanged(java.lang.Object):void");
    }

    public C11648Sdq(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
