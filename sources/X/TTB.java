package X;

import com.instagram.common.session.UserSession;

public final class TTB extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTB(UserSession userSession, String str, String str2, String str3, String str4, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A02 = 1;
        this.A03 = userSession;
        this.A04 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A05 = str4;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.TTB, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.TTB, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        AnonymousClass4D7 r8 = r12;
        switch (this.A02) {
            case 0:
                str2 = this.A07;
                str4 = this.A05;
                str = this.A06;
                str3 = this.A04;
                obj2 = this.A03;
                obj3 = this.A01;
                i = 0;
                break;
            case 1:
                ? ttb = new TTB((UserSession) this.A03, this.A04, this.A06, this.A07, this.A05, r12);
                ttb.A01 = obj;
                return ttb;
            case 2:
                obj2 = this.A03;
                obj3 = this.A01;
                str = this.A06;
                str2 = this.A07;
                str3 = this.A04;
                str4 = this.A05;
                i = 2;
                break;
            default:
                obj3 = this.A01;
                str3 = this.A04;
                str = this.A06;
                str2 = this.A07;
                str4 = this.A05;
                obj2 = this.A03;
                i = 3;
                break;
        }
        return new TTB(obj2, obj3, str, str2, str3, str4, r8, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.3lr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: X.3lr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.3lr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: X.3lr} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.TTB, X.4D7] */
    /* JADX WARNING: type inference failed for: r17v4, types: [X.3lr] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b2, code lost:
        if (r0 != r2) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b4, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b5, code lost:
        X.0eS.A00(r5);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            r43 = this;
            r0 = r43
            r5 = r44
            int r1 = r0.A02
            X.1Hj r2 = X.1Hj.A02
            switch(r1) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x016b;
                case 2: goto L_0x0149;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x0126
            X.0eS.A00(r5)
        L_0x0013:
            X.3Ii r5 = (X.C239803Ii) r5
            r8 = 0
            boolean r1 = r5 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x00f1
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r3 = r5.A00
            r8 = r3
            r4 = r3
            com.instagram.camera.effect.models.CameraAREffect r4 = (com.instagram.camera.effect.models.CameraAREffect) r4
            boolean r1 = r4.A0M()
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = r0.A06
            if (r1 != 0) goto L_0x00bd
            java.lang.Object r9 = r0.A01
            X.LEN r9 = (X.LEN) r9
            X.OJz r1 = r9.A0C
            boolean r1 = r1.A00()
            if (r1 != 0) goto L_0x00d2
            r8 = 0
        L_0x0039:
            X.OK0 r3 = r9.A00
            if (r3 == 0) goto L_0x005d
            java.lang.String r1 = r0.A04
            long r1 = java.lang.Long.parseLong(r1)
            com.instagram.camera.effect.models.CameraAREffect r8 = (com.instagram.camera.effect.models.CameraAREffect) r8
            java.lang.String r4 = r0.A05
            java.lang.Object r5 = r0.A03
            java.lang.Integer r5 = (java.lang.Integer) r5
            r0 = 3
            X.0qQ.A0B(r5, r0)
            X.NfJ r3 = r3.A00
            if (r8 != 0) goto L_0x0060
            X.ONG r0 = r3.A0R
            r0.A00(r1)
            X.OK1 r0 = r3.A0N
            r0.A00()
        L_0x005d:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0060:
            X.N9P r0 = X.C69138NfJ.A00(r3)
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A05
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x005d
            X.05G r0 = r3.A0X
            java.lang.Object r1 = r0.getValue()
            X.Nir r0 = X.C69291Nir.ON
            if (r1 == r0) goto L_0x0086
            X.Nir r0 = X.C69291Nir.PENDING
            if (r1 == r0) goto L_0x0086
            X.05G r0 = r3.A0Y
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x008e
        L_0x0086:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r5 == r0) goto L_0x00b7
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r5 == r0) goto L_0x00b7
        L_0x008e:
            r7 = 1
        L_0x008f:
            X.N9P r6 = X.C69138NfJ.A00(r3)
            X.LEN r0 = r3.A0L
            java.util.List r2 = r0.A02
            r1 = 0
            java.util.List r0 = r0.A01
            X.N9P r0 = X.N9P.A00((com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution) null, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (X.C69378NkI) null, r6, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r2, (java.util.List) null, r0, (java.util.List) null, (java.util.List) null, 0.0f, -34, false, false, false, false, false, false, false, false, false, false, false, false, false)
            X.C69138NfJ.A0A(r3, r0)
            if (r7 == 0) goto L_0x005d
            X.87G r0 = X.C348367yK.A00(r8)
            X.0qQ.A07(r0)
            X.C69138NfJ.A08(r0, r3)
            boolean r0 = X.O2B.A00(r8)
            if (r0 == 0) goto L_0x00b9
            X.C69138NfJ.A04(r8, r3, r5, r4)
            goto L_0x005d
        L_0x00b7:
            r7 = 0
            goto L_0x008f
        L_0x00b9:
            X.C69138NfJ.A05(r8, r3, r5, r1, r1)
            goto L_0x005d
        L_0x00bd:
            java.lang.Object r9 = r0.A01
            X.LEN r9 = (X.LEN) r9
            java.util.List r2 = r9.A02
            java.util.List r1 = X.AnonymousClass7TE.A1I(r4)
            java.util.ArrayList r1 = X.00k.A0S(r2, r1)
            java.util.List r1 = X.00k.A0W(r1)
            r9.A02 = r1
            goto L_0x00e2
        L_0x00d2:
            java.util.List r2 = r9.A01
            java.util.List r1 = X.AnonymousClass7TE.A1I(r4)
            java.util.ArrayList r1 = X.00k.A0S(r2, r1)
            java.util.List r1 = X.00k.A0W(r1)
            r9.A01 = r1
        L_0x00e2:
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r0.A06
            if (r3 == 0) goto L_0x0039
            java.util.Map r2 = r9.A0E
            java.lang.String r1 = r4.A0K
            r2.put(r1, r3)
            goto L_0x0039
        L_0x00f1:
            boolean r1 = r5 instanceof X.C297815sO
            if (r1 == 0) goto L_0x04ce
            java.lang.Object r9 = r0.A01
            X.LEN r9 = (X.LEN) r9
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r7 = r5.A00
            X.KlC r7 = (X.C62712KlC) r7
            java.lang.String r6 = r0.A04
            java.lang.String r5 = X.C51968G9o.A16(r7)
            boolean r1 = r7 instanceof X.C8753R7r
            if (r1 == 0) goto L_0x0117
            java.lang.String r4 = " failure reason:"
            X.R7r r7 = (X.C8753R7r) r7
            java.lang.String r3 = r7.A01
            java.lang.String r2 = "Failure code:"
            java.lang.String r1 = r7.A00
            java.lang.String r5 = X.002.A11(r5, r4, r3, r2, r1)
        L_0x0117:
            java.lang.String r2 = "Failed fetching effect id "
            java.lang.String r1 = " due to: "
            java.lang.String r2 = X.002.A0u(r2, r6, r1, r5)
            java.lang.String r1 = "RtcArEffectsManager"
            X.0wb.A03(r1, r2)
            goto L_0x0039
        L_0x0126:
            X.0eS.A00(r5)
            java.lang.Object r1 = r0.A01
            X.LEN r1 = (X.LEN) r1
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = r1.A09
            java.lang.String r7 = r0.A04
            X.8cI r6 = X.C359218cI.A0C
            java.lang.String r3 = r0.A06
            java.lang.String r1 = r0.A07
            X.0qQ.A0B(r7, r4)
            r0.A00 = r4
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            r8 = r3
            r9 = r1
            r10 = r0
            java.lang.Object r5 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r5, r6, r7, r8, r9, r10, r11)
            if (r5 != r2) goto L_0x0013
            return r2
        L_0x0149:
            int r1 = r0.A00
            r4 = 1
            if (r1 != 0) goto L_0x01b5
            X.0eS.A00(r5)
            java.lang.Object r5 = r0.A03
            android.app.Application r5 = (android.app.Application) r5
            java.lang.Object r6 = r0.A01
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.String r7 = r0.A06
            java.lang.String r8 = r0.A07
            java.lang.String r3 = r0.A04
            java.lang.String r1 = r0.A05
            r0.A00 = r4
            r9 = r3
            r10 = r1
            r11 = r0
            java.lang.Object r0 = com.instagram.creation.genai.imagine.integrity.ImagineNativeIntegrityUtilKt.A00(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01b2
        L_0x016b:
            int r1 = r0.A00
            r6 = 1
            if (r1 != 0) goto L_0x01b5
            X.0eS.A00(r5)
            java.lang.Object r5 = r0.A01
            X.3pV r5 = (X.C252683pV) r5
            java.lang.Object r9 = r0.A03
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.String r10 = r0.A04
            if (r10 != 0) goto L_0x0181
            java.lang.String r10 = ""
        L_0x0181:
            java.lang.String r11 = r0.A06
            java.lang.String r12 = r0.A07
            X.WGU r1 = X.WGU.A00(r9)
            java.lang.String r13 = r1.A03
            java.lang.String r14 = r0.A05
            r15 = 0
            X.1OC r8 = X.W2V.A04(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r1 = "/api/v1/ads/promote/init_promote_v2/"
            java.lang.String r7 = X.W2x.A01(r1)
            X.WGU r4 = X.WGU.A00(r9)
            r3 = 0
            X.UcZ r1 = new X.UcZ
            r1.<init>(r4, r5, r7, r3)
            r8.A00 = r1
            r1 = 1041998071(0x3e1ba0f7, float:0.15198122)
            X.1ES.A05(r8, r1, r6, r6, r6)
            X.TVN r1 = X.TVN.A00
            r0.A00 = r6
            java.lang.Object r0 = X.C239083Et.A00(r0, r1, r5)
        L_0x01b2:
            if (r0 != r2) goto L_0x005d
            return r2
        L_0x01b5:
            X.0eS.A00(r5)
            goto L_0x005d
        L_0x01ba:
            int r3 = r0.A00
            r1 = 1
            if (r3 == 0) goto L_0x0345
            X.0eS.A00(r5)
        L_0x01c2:
            X.SUj r5 = (X.SUj) r5
            boolean r2 = X.SUj.A0V(r5)
            if (r2 == 0) goto L_0x0497
            java.lang.Object r2 = r5.A01
            r26 = r2
            r2 = r26
            X.QXD r2 = (X.QXD) r2
            r25 = r2
            r24 = 0
            if (r2 == 0) goto L_0x0341
            X.QXl r4 = r25.A0E()
        L_0x01dc:
            java.lang.String r23 = "Required value was null."
            if (r4 == 0) goto L_0x0514
            java.lang.String r2 = r0.A07
            r42 = r2
            java.lang.String r2 = r0.A05
            r41 = r2
            java.lang.String r2 = r0.A06
            r40 = r2
            r17 = 0
            r15 = 0
            r9 = 0
            java.lang.Object r6 = r0.A03
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r6 = (com.facebookpay.expresscheckout.models.EcpUIConfiguration) r6
            java.lang.String r22 = X.AnonymousClass7TF.A0c()
            r3 = 0
            r7 = r42
            r5 = r22
            r2 = r41
            X.DbZ.A0t(r1, r7, r5, r2)
            r2 = 5
            X.0qQ.A0B(r6, r2)
            X.QRL r7 = r4.A0E()
            if (r7 == 0) goto L_0x050f
            java.lang.Class<X.QXO> r21 = X.QXO.class
            r5 = -1333706087(0xffffffffb0814299, float:-9.404914E-10)
            r2 = r21
            X.3lr r2 = r7.A01(r2, r5)
            X.QXO r2 = (X.QXO) r2
            X.0qQ.A07(r2)
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r28 = X.C11432SUd.A07(r2, r3)
            X.QRU r7 = r4.A0J()
            if (r7 == 0) goto L_0x050a
            java.lang.Class<X.QTR> r20 = X.QTR.class
            r5 = 819094042(0x30d2621a, float:1.5307393E-9)
            r2 = r20
            X.3lr r2 = r7.A01(r2, r5)
            X.QTR r2 = (X.QTR) r2
            X.0qQ.A07(r2)
            com.facebookpay.expresscheckout.models.TransactionInfo r8 = X.C11432SUd.A0C(r2)
            X.QRT r7 = r4.A0H()
            if (r7 == 0) goto L_0x0505
            java.lang.Class<X.QTG> r19 = X.QTG.class
            r5 = 1367251747(0x517e9b23, float:6.8345278E10)
            r2 = r19
            X.3lr r7 = r7.A01(r2, r5)
            X.QTG r7 = (X.QTG) r7
            X.0qQ.A07(r7)
            java.lang.String r2 = "order_id"
            java.lang.String r5 = r4.getOptionalStringField(r3, r2)
            if (r5 == 0) goto L_0x0500
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r30 = X.C11432SUd.A0A(r7, r8, r5)
            X.QRS r10 = r4.A0G()
            r7 = 0
            if (r10 == 0) goto L_0x033d
            java.lang.Class<X.QT9> r8 = X.QT9.class
            r5 = -1503034778(0xffffffffa6698266, float:-8.1014837E-16)
            X.3lr r5 = r10.A01(r8, r5)
            X.QT9 r5 = (X.QT9) r5
            if (r5 == 0) goto L_0x033d
            com.facebookpay.logging.LoggingPolicy r33 = X.C11432SUd.A0E(r5)
        L_0x0275:
            X.QXC r5 = r4.A0I()
            if (r5 == 0) goto L_0x033a
            X.QTJ r8 = r5.A0E()
            if (r8 == 0) goto L_0x033a
            java.lang.String r5 = "strong_id__"
            java.lang.String r12 = r8.getOptionalStringField(r3, r5)
        L_0x0288:
            X.QXC r5 = r4.A0I()
            if (r5 == 0) goto L_0x0337
            X.QTJ r8 = r5.A0E()
            if (r8 == 0) goto L_0x0337
            java.lang.String r5 = "name"
            java.lang.String r11 = r8.getOptionalStringField(r1, r5)
        L_0x029b:
            X.QXC r5 = r4.A0I()
            if (r5 == 0) goto L_0x0334
            X.QTJ r8 = r5.A0E()
            if (r8 == 0) goto L_0x0334
            java.lang.String r5 = "image"
            java.lang.String r10 = r8.A09(r5)
        L_0x02ad:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r18 = new com.facebookpay.expresscheckout.models.PaymentReceiverInfo
            r8 = r18
            r8.<init>(r12, r11, r10, r15)
            java.lang.Class<X.QRM> r11 = X.QRM.class
            r10 = 6
            java.lang.String r8 = "confirmation_section"
            r5 = 1314008345(0x4e522d19, float:8.8154272E8)
            X.3lr r10 = r4.getOptionalTreeField(r10, r8, r11, r5)
            if (r10 == 0) goto L_0x0332
            java.lang.Class<X.QSi> r8 = X.C7667QSi.class
            r5 = 172983857(0xa4f8631, float:9.991926E-33)
            X.3lr r5 = r10.reinterpretRequired(r3, r8, r5)
        L_0x02cb:
            r8 = 0
            if (r5 == 0) goto L_0x037c
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.lang.Class<X.QSh> r11 = X.C7666QSh.class
            r13 = 2
            java.lang.String r10 = "upsell_actions"
            r8 = -74729298(0xfffffffffb8bb8ae, float:-1.45095E36)
            com.google.common.collect.ImmutableList r8 = r5.getRequiredCompactedTreeListField(r13, r10, r11, r8)
            if (r8 == 0) goto L_0x04e7
            X.3kO r16 = X.C66580MXl.A0J(r8)
        L_0x02e5:
            boolean r8 = r16.hasNext()
            if (r8 == 0) goto L_0x0361
            X.3lr r8 = X.C41845B3m.A0V(r16)
            X.RFx r11 = X.C8929RFx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r10 = "type"
            java.lang.Enum r12 = r8.getOptionalEnumField(r3, r10, r11)
            X.RFx r12 = (X.C8929RFx) r12
            if (r12 == 0) goto L_0x04e2
            java.lang.String r35 = r12.name()
            if (r35 == 0) goto L_0x04e2
            java.lang.Enum r10 = r8.getOptionalEnumField(r3, r10, r11)
            X.RFx r10 = (X.C8929RFx) r10
            if (r10 == 0) goto L_0x04dd
            java.lang.String r36 = r10.name()
            if (r36 == 0) goto L_0x04dd
            java.lang.String r10 = "icon_name"
            java.lang.String r37 = r8.getOptionalStringField(r13, r10)
            if (r37 == 0) goto L_0x04d8
            java.lang.String r10 = "title"
            java.lang.String r38 = r8.getOptionalStringField(r1, r10)
            if (r38 == 0) goto L_0x04d3
            java.lang.String r10 = "link_uri"
            java.lang.String r39 = r8.A0A(r10)
            com.facebookpay.confirmation.model.ECPConfirmationUpsellAction r8 = new com.facebookpay.confirmation.model.ECPConfirmationUpsellAction
            r34 = r8
            r34.<init>(r35, r36, r37, r38, r39)
            r14.add(r8)
            goto L_0x02e5
        L_0x0332:
            r5 = r7
            goto L_0x02cb
        L_0x0334:
            r10 = r7
            goto L_0x02ad
        L_0x0337:
            r11 = r7
            goto L_0x029b
        L_0x033a:
            r12 = r7
            goto L_0x0288
        L_0x033d:
            r33 = r7
            goto L_0x0275
        L_0x0341:
            r4 = r24
            goto L_0x01dc
        L_0x0345:
            X.0eS.A00(r5)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = X.C11353SOm.A01()
            java.lang.String r5 = r0.A07
            java.lang.String r6 = r0.A05
            r4 = 0
            java.lang.String r7 = r0.A06
            java.lang.String r8 = r0.A04
            r0.A00 = r1
            r9 = r4
            r10 = r4
            r11 = r0
            java.lang.Object r5 = com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r5 != r2) goto L_0x01c2
            return r2
        L_0x0361:
            java.lang.String r8 = "upsell_section_title"
            java.lang.String r8 = r5.getOptionalStringField(r1, r8)
            if (r8 == 0) goto L_0x04fb
            com.facebookpay.confirmation.model.ECPConfirmationUpsellSection r10 = new com.facebookpay.confirmation.model.ECPConfirmationUpsellSection
            r10.<init>(r8, r14)
            java.lang.String r8 = "cta_type"
            java.lang.String r5 = r5.getOptionalStringField(r3, r8)
            if (r5 == 0) goto L_0x04f6
            com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r8 = new com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration
            r8.<init>(r10, r5)
        L_0x037c:
            java.lang.Class<X.QRO> r12 = X.QRO.class
            r11 = 11
            java.lang.String r10 = "ecp_custom_fields"
            r5 = 516679119(0x1ecbe5cf, float:2.1588508E-20)
            com.google.common.collect.ImmutableList r5 = X.C41845B3m.A0X(r4, r12, r10, r11, r5)
            java.util.Iterator r13 = r5.iterator()
        L_0x038d:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x03a7
            java.lang.Object r12 = r13.next()
            r11 = r12
            X.3lr r11 = (X.C250663lr) r11
            X.RGa r10 = X.C8932RGa.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r5 = "key"
            java.lang.Enum r10 = r11.getOptionalEnumField(r3, r5, r10)
            X.RGa r5 = X.C8932RGa.DEVELOPER_TOS_URI
            if (r10 != r5) goto L_0x038d
            r7 = r12
        L_0x03a7:
            X.3lr r7 = (X.C250663lr) r7
            if (r7 == 0) goto L_0x03b8
            java.lang.String r5 = "value"
            java.lang.String r5 = r7.getOptionalStringField(r1, r5)
            if (r5 == 0) goto L_0x03b8
            com.facebookpay.expresscheckout.models.ItemDetails r1 = r6.A09
            r1.A00 = r5
        L_0x03b8:
            java.lang.String r37 = r4.getOptionalStringField(r3, r2)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = new com.facebookpay.expresscheckout.models.ECPPaymentRequest
            r27 = r1
            r29 = r8
            r31 = r6
            r32 = r18
            r34 = r42
            r35 = r41
            r36 = r22
            r38 = r3
            r39 = r3
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.QRU r7 = r4.A0J()
            if (r7 == 0) goto L_0x04f1
            r6 = 819094042(0x30d2621a, float:1.5307393E-9)
            r5 = r20
            X.3lr r5 = r7.A01(r5, r6)
            X.QTR r5 = (X.QTR) r5
            if (r5 == 0) goto L_0x04f1
            com.facebookpay.expresscheckout.models.TransactionInfo r6 = X.C11432SUd.A0C(r5)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r10 = X.C11353SOm.A01()
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r5 = r1.A01
            if (r5 == 0) goto L_0x0492
            java.util.Set<X.REn> r8 = r5.A0H
            java.util.Set<X.REi> r7 = r5.A0I
        L_0x03f6:
            r5 = r41
            boolean r10 = r10.A07(r5, r8, r7)
            if (r26 == 0) goto L_0x04ec
            boolean r20 = X.C11432SUd.A0M(r25)
            X.QXC r5 = r4.A0I()
            if (r5 == 0) goto L_0x048e
            X.QTJ r18 = r5.A0E()
        L_0x040c:
            X.QRN r8 = r4.A0F()
            if (r8 == 0) goto L_0x0421
            java.lang.Class<X.QSl> r7 = X.C7670QSl.class
            r5 = -633919572(0xffffffffda3727ac, float:-1.28883851E16)
            X.3lr r17 = r8.A01(r7, r5)
            r5 = r17
            X.QSl r5 = (X.C7670QSl) r5
            r17 = r5
        L_0x0421:
            X.QRL r8 = r4.A0E()
            if (r8 == 0) goto L_0x0432
            r7 = -1333706087(0xffffffffb0814299, float:-9.404914E-10)
            r5 = r21
            X.3lr r15 = r8.A01(r5, r7)
            X.QXO r15 = (X.QXO) r15
        L_0x0432:
            X.QRT r8 = r4.A0H()
            if (r8 == 0) goto L_0x0443
            r7 = 1367251747(0x517e9b23, float:6.8345278E10)
            r5 = r19
            X.3lr r9 = r8.A01(r5, r7)
            X.QTG r9 = (X.QTG) r9
        L_0x0443:
            X.QRS r8 = r4.A0G()
            if (r8 == 0) goto L_0x048b
            java.lang.Class<X.QT9> r7 = X.QT9.class
            r5 = -1503034778(0xffffffffa6698266, float:-8.1014837E-16)
            X.3lr r5 = r8.A01(r7, r5)
            X.QT9 r5 = (X.QT9) r5
        L_0x0454:
            r4.getOptionalStringField(r3, r2)
            X.RxU r13 = new X.RxU
            r14 = r15
            r15 = r17
            r16 = r5
            r17 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            if (r10 == 0) goto L_0x0488
            java.lang.String r19 = "NUX"
        L_0x0467:
            r12 = r24
            r14 = r12
            r15 = r12
            r16 = r42
            r17 = r41
            r18 = r40
            java.util.ArrayList r2 = X.C11081S9b.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r10 == 0) goto L_0x04bf
            X.2gB r4 = X.SQB.A00(r2)
            java.lang.Object r3 = r0.A01
            r2 = 4
            X.Sds r0 = new X.Sds
            r0.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r1, (java.lang.Object) r6)
            X.SQB.A03(r4, r0)
            goto L_0x005d
        L_0x0488:
            java.lang.String r19 = "PUX"
            goto L_0x0467
        L_0x048b:
            r5 = r24
            goto L_0x0454
        L_0x048e:
            r18 = r15
            goto L_0x040c
        L_0x0492:
            X.0sl r8 = X.0sl.A00
            r7 = r8
            goto L_0x03f6
        L_0x0497:
            boolean r1 = X.SUj.A0S(r5)
            if (r1 == 0) goto L_0x005d
            java.lang.Throwable r2 = r5.A02
            if (r2 == 0) goto L_0x04b0
            boolean r1 = r2 instanceof X.C8286QnS
            if (r1 == 0) goto L_0x04b0
            java.lang.Object r0 = r0.A01
            X.QD6 r0 = (X.QD6) r0
            X.2Fj r0 = r0.A05
            X.SR4.A01(r0, r2)
            goto L_0x005d
        L_0x04b0:
            java.lang.Object r0 = r0.A01
            X.QD6 r0 = (X.QD6) r0
            X.2Fj r3 = r0.A05
            r2 = 0
            java.lang.String r1 = ""
            X.TQk r0 = new X.TQk
            r0.<init>(r2, r1, r1)
            goto L_0x04c9
        L_0x04bf:
            java.lang.Object r0 = r0.A01
            X.QD6 r0 = (X.QD6) r0
            X.2Fj r3 = r0.A06
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r6)
        L_0x04c9:
            X.SR4.A01(r3, r0)
            goto L_0x005d
        L_0x04ce:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x04d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x04d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x04dd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x04e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x04e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x04ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x04f1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x04f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x04fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x0500:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x0505:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x050a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x050f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        L_0x0514:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TTB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TTB) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTB(Object obj, Object obj2, String str, String str2, String str3, String str4, AnonymousClass4D7 r8, int i) {
        super(2, r8);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }
}
