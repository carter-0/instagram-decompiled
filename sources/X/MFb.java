package X;

public final class MFb extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public final int A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFb(C56007HrE hrE, String str, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A02 = 3;
        this.A03 = hrE;
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, X.MFb] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.4D7, X.MFb] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        int i;
        int i2;
        String str;
        Object obj2;
        AnonymousClass4D7 r5 = r10;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                i2 = this.A00;
                str = this.A04;
                i = 0;
                break;
            case 1:
                obj2 = this.A03;
                str = this.A04;
                i2 = this.A00;
                i = 1;
                break;
            case 2:
                obj2 = this.A03;
                i2 = this.A00;
                str = this.A04;
                i = 2;
                break;
            default:
                return new MFb((C56007HrE) this.A03, this.A04, r10);
        }
        return new MFb(obj2, str, r5, i2, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.MFb] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ac, code lost:
        if (r0 != r4) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        X.0eS.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01dd, code lost:
        r7 = X.C42526Be7.class;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r5 = r21
            int r1 = r0.A02
            X.1Hj r4 = X.1Hj.A02
            switch(r1) {
                case 0: goto L_0x0055;
                case 1: goto L_0x00b4;
                case 2: goto L_0x0090;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r1 = r0.A01
            r7 = 1
            if (r1 == 0) goto L_0x0030
            int r6 = r0.A00
            X.0eS.A00(r5)
        L_0x0015:
            java.lang.Object r2 = r0.A03
            X.HrE r2 = (X.C56007HrE) r2
            X.HlS r0 = r2.A03
            java.util.concurrent.atomic.AtomicInteger r1 = r0.A00
            int r0 = r1.get()
            if (r6 <= r0) goto L_0x002d
            r1.set(r6)
            if (r5 == 0) goto L_0x002d
            X.05G r0 = r2.A06
            r0.Epw(r5)
        L_0x002d:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0030:
            X.0eS.A00(r5)
            java.lang.Object r2 = r0.A03
            X.HrE r2 = (X.C56007HrE) r2
            X.HlS r1 = r2.A03
            java.util.concurrent.atomic.AtomicInteger r1 = r1.A01
            int r6 = r1.incrementAndGet()
            com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository r5 = r2.A02
            java.lang.String r3 = r0.A04
            int r2 = r2.A00
            X.HsY r1 = new X.HsY
            r1.<init>(r3, r2)
            r0.A00 = r6
            r0.A01 = r7
            java.lang.Object r5 = r5.A00(r1, r0)
            if (r5 != r4) goto L_0x0015
            return r4
        L_0x0055:
            int r1 = r0.A01
            r6 = 1
            if (r1 != 0) goto L_0x00af
            X.0eS.A00(r5)
            java.lang.Object r7 = r0.A03
            com.instagram.appreciation.funding.AppreciationFundingViewModel r7 = (com.instagram.appreciation.funding.AppreciationFundingViewModel) r7
            X.LRg r5 = r7.A03
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            int r2 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.Jr7 r3 = X.C64165LRg.A00(r5, r3, r1)
            X.JTR.A1K(r3, r2)
            java.util.List r2 = r5.A00
            java.lang.String r1 = "star_package_options"
            r3.A07(r1, r2)
            X.LRb r2 = r5.A02
            com.instagram.appreciation.analytics.LoggingFanData r1 = r5.A01
            X.C64160LRb.A01(r3, r1, r2)
            X.3ju r5 = r7.A05
            java.lang.String r3 = r0.A04
            X.2EG r2 = X.2EG.A1P
            X.K2A r1 = new X.K2A
            r1.<init>(r2, r3)
            r0.A01 = r6
            java.lang.Object r0 = r5.ELH(r1, r0)
            goto L_0x00ac
        L_0x0090:
            int r1 = r0.A01
            r6 = 1
            if (r1 != 0) goto L_0x00af
            X.0eS.A00(r5)
            java.lang.Object r1 = r0.A03
            X.JgG r1 = (X.C60135JgG) r1
            com.instagram.direct.emojipong.data.EmojiPongRepository r5 = r1.A01
            com.instagram.common.session.UserSession r1 = r1.A00
            java.lang.String r3 = r1.A06
            int r2 = r0.A00
            java.lang.String r1 = r0.A04
            r0.A01 = r6
            java.lang.Object r0 = r5.A00(r3, r1, r0, r2)
        L_0x00ac:
            if (r0 != r4) goto L_0x002d
            return r4
        L_0x00af:
            X.0eS.A00(r5)
            goto L_0x002d
        L_0x00b4:
            int r2 = r0.A01
            r1 = 1
            if (r2 == 0) goto L_0x014d
            X.0eS.A00(r5)
        L_0x00bc:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r2 = r5 instanceof X.C239793Ih
            r11 = 0
            if (r2 == 0) goto L_0x0146
            X.3lr r10 = X.C41846B3n.A0R(r5)
            if (r10 == 0) goto L_0x00f5
            java.lang.Class<X.BeA> r9 = X.C42529BeA.class
            r8 = 0
            r2 = 1957(0x7a5, float:2.742E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r2)
            r6 = 989019767(0x3af33e77, float:0.0018558045)
            X.3lr r4 = r10.getOptionalTreeField(r8, r7, r9, r6)
            if (r4 == 0) goto L_0x00f9
            java.lang.Class<X.Be9> r3 = X.C42528Be9.class
            r2 = 462786158(0x1b958e6e, float:2.4742025E-22)
            X.3lr r3 = r4.reinterpretRequired(r8, r3, r2)
            if (r3 == 0) goto L_0x00f9
            java.lang.String r2 = "success"
            boolean r2 = r3.getCoercedBooleanField(r8, r2)
            if (r2 != r1) goto L_0x00f9
        L_0x00ee:
            java.lang.String r11 = r0.A04
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01b5
            return r5
        L_0x00f5:
            r5 = r11
        L_0x00f6:
            r8 = r11
            r2 = r11
            goto L_0x0127
        L_0x00f9:
            X.3lr r4 = r10.getOptionalTreeField(r8, r7, r9, r6)
            if (r4 == 0) goto L_0x00f5
            java.lang.Class<X.Be9> r3 = X.C42528Be9.class
            r2 = 462786158(0x1b958e6e, float:2.4742025E-22)
            X.3lr r6 = r4.reinterpretRequired(r8, r3, r2)
            if (r6 == 0) goto L_0x00f5
            java.lang.Class<X.UQ3> r5 = X.UQ3.class
            r4 = 5
            java.lang.String r3 = "error"
            r2 = -1214665369(0xffffffffb799ad67, float:-1.8319768E-5)
            X.3lr r5 = r6.getOptionalTreeField(r4, r3, r5, r2)
            if (r5 == 0) goto L_0x00f6
            java.lang.String r2 = "internal_error_message"
            java.lang.String r8 = r5.getOptionalStringField(r1, r2)
            X.Kic r4 = X.C62605Kic.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 2
            java.lang.String r2 = "type"
            java.lang.Enum r2 = r5.getOptionalEnumField(r3, r2, r4)
        L_0x0127:
            java.lang.String r9 = java.lang.String.valueOf(r2)
            if (r5 == 0) goto L_0x0144
            java.lang.String r2 = "ui_description"
            java.lang.String r10 = r5.A0A(r2)
            java.lang.String r2 = "ui_description_details"
            java.lang.String r11 = r5.A0B(r2)
        L_0x0139:
            r12 = 6
            X.QP5 r7 = new X.QP5
            r7.<init>(r8, r9, r10, r11, r12)
            X.5sO r5 = X.C41845B3m.A0c(r7)
            goto L_0x00ee
        L_0x0144:
            r10 = r11
            goto L_0x0139
        L_0x0146:
            java.lang.String r2 = "Network error"
            X.5sO r5 = X.JTU.A0S(r2)
            goto L_0x00ee
        L_0x014d:
            X.0eS.A00(r5)
            java.lang.Object r2 = r0.A03
            X.9qE r2 = (X.C389799qE) r2
            X.L0k r2 = r2.A00
            java.lang.String r6 = r0.A04
            int r9 = r0.A00
            r0.A01 = r1
            com.instagram.common.session.UserSession r2 = r2.A00
            X.1vn r3 = X.1vm.A01(r2)
            r15 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r2 = "prompt"
            X.0Df r6 = X.C41845B3m.A03(r5, r6, r2)
            java.lang.Integer r5 = X.JTO.A0w(r9)
            java.lang.String r2 = "variant_index"
            X.0Df.A00(r6, r5, r2)
            java.lang.Integer r5 = X.JTO.A0w(r1)
            java.lang.String r2 = "num_themes"
            X.0Df.A00(r6, r5, r2)
            java.lang.String r5 = "IGDIRECT"
            java.lang.String r2 = "caller"
            X.0Df.A00(r6, r5, r2)
            java.lang.String r2 = "input"
            X.1vR r9 = X.C41847B3o.A04(r6, r7, r2)
            java.util.Map r11 = r7.getParamsCopy()
            java.util.Map r12 = r8.getParamsCopy()
            java.lang.Class<X.BeB> r13 = X.C42530BeB.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "GenerateThemeImages"
            r14 = 0
            java.lang.String r18 = "xfb_generate_ai_theme_images_from_prompt"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r5 = r3.A04(r8, r0)
            if (r5 != r4) goto L_0x00bc
            return r4
        L_0x01b5:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x024a
            X.3lr r5 = X.C41846B3n.A0R(r5)
            r10 = 0
            if (r5 == 0) goto L_0x0243
            java.lang.Class<X.BeA> r3 = X.C42529BeA.class
            r4 = 0
            r0 = 1957(0x7a5, float:2.742E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 989019767(0x3af33e77, float:0.0018558045)
            X.3lr r3 = r5.getOptionalTreeField(r4, r2, r3, r0)
            if (r3 == 0) goto L_0x0243
            java.lang.Class<X.Be9> r2 = X.C42528Be9.class
            r0 = 462786158(0x1b958e6e, float:2.4742025E-22)
            X.3lr r3 = r3.reinterpretRequired(r4, r2, r0)
            if (r3 == 0) goto L_0x0243
            java.lang.Class<X.Be7> r7 = X.C42526Be7.class
            r0 = 3328(0xd00, float:4.664E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r5 = 132609587(0x7e77633, float:3.4826488E-34)
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r1, r6, r7, r5)
            if (r0 == 0) goto L_0x0243
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0243
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            com.google.common.collect.ImmutableList r0 = r3.getRequiredCompactedTreeListField(r1, r6, r7, r5)
            if (r0 != 0) goto L_0x0200
            X.0sn r0 = X.0sn.A00
        L_0x0200:
            java.util.Iterator r8 = r0.iterator()
        L_0x0204:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x023e
            X.3lr r5 = X.C41845B3m.A0V(r8)
            X.Kih r7 = X.C62610Kih.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r6 = 3
            java.lang.String r0 = "color"
            java.lang.Enum r0 = r3.getOptionalEnumField(r6, r0, r7)
            java.lang.String r12 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "request_id"
            java.lang.String r13 = r5.A09(r0)
            java.lang.String r0 = "response_id"
            java.lang.String r14 = r5.getOptionalStringField(r6, r0)
            java.lang.String r0 = "image_handle"
            java.lang.String r15 = r5.getOptionalStringField(r4, r0)
            java.lang.String r0 = "image_url"
            java.lang.String r16 = r5.getOptionalStringField(r1, r0)
            X.Jvj r9 = new X.Jvj
            r17 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r2.add(r9)
            goto L_0x0204
        L_0x023e:
            X.3Ih r4 = X.C41845B3m.A0d(r2)
            return r4
        L_0x0243:
            java.lang.String r0 = "No images generated"
            X.5sO r4 = X.JTU.A0S(r0)
            return r4
        L_0x024a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFb) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFb(Object obj, String str, AnonymousClass4D7 r4, int i, int i2) {
        super(2, r4);
        this.A02 = i2;
        this.A03 = obj;
        this.A00 = i;
        this.A04 = str;
    }
}
