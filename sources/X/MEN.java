package X;

public final class MEN extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEN(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(1, r5);
        this.A03 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4D7, X.MEN] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.4D7, X.MEN] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r8) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        AnonymousClass4D7 r5 = r8;
        switch (this.A03) {
            case 0:
                obj3 = this.A02;
                obj = this.A04;
                obj2 = this.A01;
                i = 0;
                break;
            case 1:
                obj = this.A04;
                obj2 = this.A01;
                obj3 = this.A02;
                i = 1;
                break;
            case 2:
                return new MEN((C60207JhQ) this.A04, r8);
            case 3:
                obj = this.A04;
                obj2 = this.A01;
                obj3 = this.A02;
                i = 3;
                break;
            default:
                obj = this.A04;
                obj3 = this.A02;
                obj2 = this.A01;
                i = 4;
                break;
        }
        return new MEN(obj3, obj, obj2, r5, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MEN) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.MEN] */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0476, code lost:
        if (r0 != r3) goto L_0x04d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0478, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0482, code lost:
        X.0eS.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r30
            r6 = r31
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x03a7;
                case 1: goto L_0x0177;
                case 2: goto L_0x0032;
                case 3: goto L_0x0017;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r3 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x044f
            if (r1 == r4) goto L_0x0482
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            r3 = r6
            X.1Hj r4 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0368
            if (r1 == r7) goto L_0x002d
            if (r1 != r8) goto L_0x0028
            X.0eS.A00(r6)
            return r3
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002d:
            X.0eS.A00(r6)
            goto L_0x038b
        L_0x0032:
            X.1Hj r3 = X.1Hj.A02
            int r1 = r0.A00
            r11 = 1
            if (r1 == 0) goto L_0x0089
            if (r1 != r11) goto L_0x0172
            java.lang.Object r1 = r0.A02
            X.JzN r1 = (X.C61229JzN) r1
            java.lang.Object r2 = r0.A01
            X.JhQ r2 = (X.C60207JhQ) r2
            X.0eS.A00(r6)
        L_0x0046:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0169
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r3 = r6.A00
            X.MWU r3 = (X.MWU) r3
            X.Jxa r3 = (X.C61124Jxa) r3
            int r0 = r3.A00
            r2.A00 = r0
            java.util.List r0 = r3.A07
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0062:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r8.next()
            X.MWT r0 = (X.MWT) r0
            X.JxY r0 = (X.C61122JxY) r0
            java.lang.String r7 = r0.A01
            com.instagram.user.model.User r6 = r0.A00
            X.1Nr r4 = new X.1Nr
            r4.<init>(r6)
            com.instagram.common.session.UserSession r3 = r2.A04
            java.lang.String r0 = r3.A06
            boolean r0 = X.DbV.A1Z(r6, r0)
            com.instagram.model.reels.Reel r0 = X.JTS.A0T(r3, r4, r7, r0)
            r5.add(r0)
            goto L_0x0062
        L_0x0089:
            X.0eS.A00(r6)
            java.lang.Object r2 = r0.A04
            X.JhQ r2 = (X.C60207JhQ) r2
            java.util.List r8 = r2.A02
            if (r8 == 0) goto L_0x04d9
            int r4 = r2.A01
            int r1 = r8.size()
            if (r4 >= r1) goto L_0x04d9
            int r7 = r2.A01
            r4 = 2
            int r6 = r8.size()
            r16 = 0
            int r5 = r2.A01
            int r1 = r2.A00
            int r5 = r5 + r1
            int[] r1 = new int[]{r6, r5}
            r1 = r1[r16]
            if (r5 >= r1) goto L_0x00b3
            r1 = r5
        L_0x00b3:
            java.util.List r28 = r8.subList(r7, r1)
            int r5 = r2.A01
            int r1 = r2.A00
            int r5 = r5 + r1
            r2.A01 = r5
            int r1 = r8.size()
            if (r5 < r1) goto L_0x00c6
            r16 = 1
        L_0x00c6:
            X.05G r13 = r2.A08
            java.lang.Object r1 = r13.getValue()
            boolean r5 = r1 instanceof X.C61229JzN
            if (r5 == 0) goto L_0x04d9
            X.JzN r1 = (X.C61229JzN) r1
            if (r1 == 0) goto L_0x04d9
            java.util.List r6 = r1.A06
            X.LwZ r5 = X.C65599LwZ.A00
            java.util.ArrayList r12 = X.00k.A0T(r5, r6)
            r25 = 0
            X.JxW r15 = r1.A03
            com.instagram.api.schemas.MediaPromptPrefType r10 = r1.A01
            boolean r14 = r1.A07
            com.instagram.api.schemas.MediaPromptPrefType r9 = r1.A02
            X.JxX r8 = r1.A04
            boolean r7 = r1.A09
            int r6 = r1.A00
            java.lang.String r5 = r1.A05
            X.C51973G9u.A0r(r4, r10, r9, r8)
            r4 = 8
            X.AnonymousClass7TF.A1G(r12, r4, r5)
            X.JzN r4 = new X.JzN
            r24 = r6
            r26 = r14
            r27 = r7
            r22 = r5
            r23 = r12
            r20 = r15
            r21 = r8
            r18 = r10
            r19 = r9
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r13.Epw(r4)
            com.instagram.reels.prompt.mvvm.data.PromptStickerViewerRepository r5 = r2.A06
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r2.A05
            java.lang.String r26 = r4.A05()
            java.lang.String r4 = r4.A03
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r16)
            r0.A01 = r2
            r0.A02 = r1
            r0.A00 = r11
            r27 = r4
            r29 = r0
            r24 = r5
            java.lang.Object r6 = r24.A02(r25, r26, r27, r28, r29)
            if (r6 != r3) goto L_0x0046
            return r3
        L_0x0133:
            com.instagram.common.session.UserSession r0 = r2.A04
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            X.6g0 r0 = new X.6g0
            r0.<init>(r5)
            r3.A00(r0)
            X.05G r3 = r2.A08
            int r0 = r1.A00
            int r11 = X.DbT.A01(r5, r0)
            java.util.List r8 = r1.A06
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r6 = r5.iterator()
        L_0x0153:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0486
            java.lang.Object r5 = r6.next()
            com.instagram.model.reels.Reel r5 = (com.instagram.model.reels.Reel) r5
            r4 = 0
            X.JzM r0 = new X.JzM
            r0.<init>(r5, r4)
            r7.add(r0)
            goto L_0x0153
        L_0x0169:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x04ab
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0172:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0177:
            X.1Hj r3 = X.1Hj.A02
            int r1 = r0.A00
            r12 = 1
            if (r1 == 0) goto L_0x029a
            if (r1 != r12) goto L_0x03a2
            X.0eS.A00(r6)
        L_0x0183:
            r4 = r6
            X.3Ii r4 = (X.C239803Ii) r4
            java.lang.Object r3 = r0.A04
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository r3 = (com.instagram.opal.impl.data.OpalAudienceSelectorRepository) r3
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x030f
            X.3lr r5 = X.C41846B3n.A0R(r4)
            if (r5 == 0) goto L_0x028e
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl$XdtUpdateOpalAudience> r2 = com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -479904093(0xffffffffe3653ea3, float:-4.2288178E21)
            r6 = 0
            r0 = 1950(0x79e, float:2.733E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r4 = r5.getRequiredTreeField(r6, r0, r2, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience"
            X.0qQ.A0C(r4, r0)
            if (r4 == 0) goto L_0x028e
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl$XdtUpdateOpalAudience$Opal> r2 = com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience.Opal.class
            r1 = 1639981732(0x61c022a4, float:4.4303387E20)
            java.lang.String r0 = "opal"
            X.3lr r1 = r4.getOptionalTreeField(r12, r0, r2, r1)
            if (r1 == 0) goto L_0x028e
            java.lang.String r0 = "selected_audience_count"
            int r13 = r1.getRequiredIntField(r6, r0)
        L_0x01c0:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r9 = r3.A05
            X.4Cl r0 = X.DbS.A0h(r9, r0)
            X.4bl r0 = r0.BYD()
            if (r0 == 0) goto L_0x020b
            X.4bk r0 = r0.F72()
            java.lang.String r8 = r0.A01
            java.lang.String r7 = r0.A02
            boolean r6 = r0.A05
            boolean r4 = r0.A06
            boolean r2 = r0.A07
            java.lang.String r1 = r0.A03
            java.lang.String r0 = r0.A04
            X.4bk r14 = new X.4bk
            r18 = r1
            r19 = r0
            r20 = r6
            r21 = r4
            r22 = r2
            r15 = r13
            r16 = r8
            r17 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = r9.A06
            X.0qQ.A0B(r0, r12)
            X.17i r2 = X.17h.A00(r9)
            com.instagram.user.model.User r1 = r2.A02(r0)
            if (r1 == 0) goto L_0x020b
            X.4Cl r0 = r1.A03
            r0.Eef(r14)
            r2.A03(r1)
        L_0x020b:
            r4 = 0
            if (r5 == 0) goto L_0x0318
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl$XdtUpdateOpalAudience> r2 = com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -479904093(0xffffffffe3653ea3, float:-4.2288178E21)
            r6 = 0
            r0 = 1950(0x79e, float:2.733E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r5 = r5.getRequiredTreeField(r6, r0, r2, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience"
            X.0qQ.A0C(r5, r0)
            if (r5 == 0) goto L_0x0318
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl$XdtUpdateOpalAudience$Opal> r2 = com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience.Opal.class
            r1 = 1639981732(0x61c022a4, float:4.4303387E20)
            java.lang.String r0 = "opal"
            X.3lr r5 = r5.getOptionalTreeField(r12, r0, r2, r1)
            if (r5 == 0) goto L_0x0318
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl$XdtUpdateOpalAudience$Opal$Audience> r2 = com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience.Opal.Audience.class
            r1 = -682684757(0xffffffffd74f0eab, float:-2.27661905E14)
            r0 = 516(0x204, float:7.23E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r5 = r5.getOptionalTreeField(r12, r0, r2, r1)
            if (r5 == 0) goto L_0x0318
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl$XdtUpdateOpalAudience$Opal$Audience$Edges> r2 = com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience.Opal.Audience.Edges.class
            r1 = 760970486(0x2d5b7cf6, float:1.2476456E-11)
            java.lang.String r0 = "edges"
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r6, r0, r2, r1)
            if (r0 == 0) goto L_0x0318
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x025a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0318
            X.3lr r5 = X.C41845B3m.A0V(r7)
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl$XdtUpdateOpalAudience$Opal$Audience$Edges$Node> r2 = com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience.Opal.Audience.Edges.Node.class
            r1 = -298572088(0xffffffffee3426c8, float:-1.3938546E28)
            java.lang.String r0 = "node"
            X.3lr r2 = r5.getRequiredTreeField(r6, r0, r2, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.XdtUpdateOpalAudience.Opal.Audience.Edges.Node"
            X.0qQ.A0C(r2, r0)
            java.lang.String r0 = "strong_id__"
            java.lang.String r1 = r2.getOptionalStringField(r6, r0)
            java.lang.String r0 = X.AnonymousClass9NF.A00()
            java.lang.String r0 = r2.getOptionalStringField(r12, r0)
            if (r1 == 0) goto L_0x025a
            if (r0 == 0) goto L_0x025a
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r0 = X.JTT.A0c(r2, r1, r0, r12)
            r4.add(r0)
            goto L_0x025a
        L_0x028e:
            X.05G r0 = r3.A07
            java.lang.Object r0 = r0.getValue()
            X.Jvm r0 = (X.C61048Jvm) r0
            int r13 = r0.A01
            goto L_0x01c0
        L_0x029a:
            X.0eS.A00(r6)
            java.lang.Object r4 = r0.A04
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository r4 = (com.instagram.opal.impl.data.OpalAudienceSelectorRepository) r4
            X.05G r7 = r4.A07
        L_0x02a3:
            java.lang.Object r6 = r7.getValue()
            r5 = r6
            X.Jvm r5 = (X.C61048Jvm) r5
            r13 = 0
            r14 = 0
            X.KhB r2 = X.C62520KhB.Loading
            r1 = 191(0xbf, float:2.68E-43)
            X.Jvm r1 = X.C61048Jvm.A00(r5, r13, r2, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, r13, (java.util.List) null, 0, r1)
            boolean r1 = r7.AIY(r6, r1)
            if (r1 == 0) goto L_0x02a3
            X.2IV r7 = new X.2IV
            r7.<init>()
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "user_id_additions"
            r7.A05(r1, r2)
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = "user_id_removals"
            r7.A05(r1, r2)
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r1 = "input"
            r6.A00(r7, r1)
            r1 = 4
            java.lang.Integer r2 = X.JTO.A0w(r1)
            java.lang.String r1 = "audience_count"
            r6.A03(r1, r2)
            X.1vR r7 = X.C41845B3m.A05()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl> r11 = com.instagram.opal.impl.graphql.UpdateOpalAudienceMutationResponseImpl.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "UpdateOpalAudienceMutation"
            java.lang.String r16 = "xdt_update_opal_audience"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r1 = r4.A06
            r0.A00 = r12
            java.lang.Object r6 = r1.A04(r6, r0)
            if (r6 != r3) goto L_0x0183
            return r3
        L_0x030f:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x033c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0318:
            X.05G r2 = r3.A07
        L_0x031a:
            java.lang.Object r1 = r2.getValue()
            r5 = r1
            X.Jvm r5 = (X.C61048Jvm) r5
            X.KhB r7 = X.C62520KhB.Loaded
            if (r4 != 0) goto L_0x0361
            X.0sn r12 = X.0sn.A00
        L_0x0327:
            r6 = 0
            r14 = 59
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            X.Jvm r0 = X.C61048Jvm.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x031a
            X.3Ih r4 = X.C51967G9n.A0d()
        L_0x033c:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x03a1
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0363
            X.05G r5 = r3.A07
        L_0x0346:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.Jvm r3 = (X.C61048Jvm) r3
            r2 = 0
            X.KhB r1 = X.C62520KhB.Error
            r0 = 191(0xbf, float:2.68E-43)
            X.Jvm r0 = X.C61048Jvm.A00(r3, r2, r1, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, r2, (java.util.List) null, 0, r0)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0346
            X.5sO r4 = X.DbU.A0f()
            return r4
        L_0x0361:
            r12 = r4
            goto L_0x0327
        L_0x0363:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0368:
            X.0eS.A00(r6)
            java.lang.Object r5 = r0.A04
            com.instagram.repository.common.IgBaseRepository r5 = (com.instagram.repository.common.IgBaseRepository) r5
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A02
            X.MSl r1 = (X.C66457MSl) r1
            boolean r1 = r1.B99()
            if (r1 == 0) goto L_0x0385
            com.instagram.repository.common.MemoryCache r1 = r5.A01
            if (r1 == 0) goto L_0x0385
            java.lang.Object r3 = r1.A00(r2)
            if (r3 != 0) goto L_0x04db
        L_0x0385:
            r0.A00 = r7
            java.lang.Object r3 = com.instagram.repository.common.IgBaseRepository.A02(r5, r0)
        L_0x038b:
            if (r3 != 0) goto L_0x04db
            java.lang.Object r3 = r0.A04
            com.instagram.repository.common.IgBaseRepository r3 = (com.instagram.repository.common.IgBaseRepository) r3
            java.lang.Object r2 = r0.A01
            X.6zR r2 = (X.C324516zR) r2
            java.lang.Object r1 = r0.A02
            X.MSl r1 = (X.C66457MSl) r1
            r0.A00 = r8
            java.lang.Object r3 = com.instagram.repository.common.IgBaseRepository.A00(r3, r2, r1, r0)
            if (r3 != r4) goto L_0x04db
        L_0x03a1:
            return r4
        L_0x03a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03a7:
            X.1Hj r3 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 3
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L_0x03f7
            if (r1 != r4) goto L_0x0482
            X.0eS.A00(r6)
        L_0x03b5:
            X.7dm r6 = (X.C335937dm) r6
            X.7ap r10 = X.C334197ap.A00
            java.lang.Object r2 = r0.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r2 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r2
            com.instagram.common.session.UserSession r1 = r2.A0B
            java.lang.Object r9 = r0.A01
            X.7al r9 = (X.C334157al) r9
            r8 = 0
            r10.A01(r1, r9, r8)
            X.7dn r1 = X.C335947dn.A00
            boolean r1 = X.0qQ.A0K(r6, r1)
            if (r1 != 0) goto L_0x04d9
            X.7do r1 = X.C335957do.A00
            boolean r1 = X.0qQ.A0K(r6, r1)
            if (r1 == 0) goto L_0x043a
            r10.A02(r9, r8)
            X.7al r1 = X.C334157al.INITIAL_LOADING
            if (r9 != r1) goto L_0x04d9
            X.GyO r1 = r2.A03
            if (r1 == 0) goto L_0x03e9
            X.34p r1 = r1.A00
            if (r1 == 0) goto L_0x03e9
            r1.A01()
        L_0x03e9:
            r0.A00 = r5
            X.Ayy r1 = X.C41707Ayy.A00
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r2, r0, r1)
            if (r0 == r3) goto L_0x04db
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0476
        L_0x03f7:
            X.0eS.A00(r6)
            java.lang.Object r12 = r0.A02
            X.7aC r12 = (X.C333817aC) r12
            java.lang.Object r11 = r0.A04
            com.instagram.comments.mvvm.data.MediaCommentListRepository r11 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r11
            com.instagram.common.session.UserSession r13 = r11.A0B
            X.GmL r1 = r11.A04
            boolean r9 = r1.A0e
            java.lang.String r8 = r1.A0E
            java.lang.String r6 = r1.A0J
            java.lang.Object r10 = r0.A01
            r1 = 23
            X.J6j r2 = new X.J6j
            r2.<init>((int) r1, (java.lang.Object) r11, (java.lang.Object) r10)
            X.7a5 r1 = r11.A05
            X.1Xl r1 = r1.A00
            if (r1 == 0) goto L_0x0438
            X.1Xj r1 = r1.BPf()
            if (r1 == 0) goto L_0x0438
            X.1Xy r1 = r1.A0C
            X.DSk r11 = r1.Ba6()
        L_0x0427:
            r0.A00 = r4
            r14 = r8
            r15 = r6
            r16 = r0
            r17 = r2
            r18 = r9
            java.lang.Object r6 = com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt.A00(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r6 != r3) goto L_0x03b5
            return r3
        L_0x0438:
            r11 = 0
            goto L_0x0427
        L_0x043a:
            boolean r1 = r6 instanceof X.C335927dl
            if (r1 == 0) goto L_0x0479
            r10.A03(r9, r8)
            X.7dl r6 = (X.C335927dl) r6
            X.7al r1 = X.C334157al.INITIAL_LOADING
            if (r9 == r1) goto L_0x0448
            r4 = 0
        L_0x0448:
            r0.A00 = r7
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A04(r2, r6, r0, r4)
            goto L_0x0476
        L_0x044f:
            X.0eS.A00(r6)
            java.lang.Object r7 = r0.A04
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r7 = (com.meta.compose.material.bottomsheet.AnchoredDraggableState) r7
            java.lang.Object r2 = r0.A02
            X.5Oz r1 = r7.A06
            r1.Epw(r2)
            r2 = 30
            X.Ivv r1 = new X.Ivv
            r1.<init>(r7, r2)
            java.lang.Object r6 = r0.A01
            r8 = 0
            r9 = 36
            r10 = 42
            X.MHK r5 = new X.MHK
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r9, (int) r10)
            r0.A00 = r4
            java.lang.Object r0 = com.meta.compose.material.bottomsheet.AnchoredDraggableKt.A01(r0, r1, r5)
        L_0x0476:
            if (r0 != r3) goto L_0x04d9
            return r3
        L_0x0479:
            boolean r0 = r6 instanceof X.C338027hI
            if (r0 != 0) goto L_0x04d9
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0482:
            X.0eS.A00(r6)
            goto L_0x04d9
        L_0x0486:
            java.util.ArrayList r10 = X.00k.A0S(r7, r8)
            r12 = 0
            X.JxW r7 = r1.A03
            com.instagram.api.schemas.MediaPromptPrefType r5 = r1.A01
            boolean r13 = r1.A07
            com.instagram.api.schemas.MediaPromptPrefType r6 = r1.A02
            X.JxX r8 = r1.A04
            boolean r14 = r1.A09
            java.lang.String r9 = r1.A05
            r0 = 2
            X.C51973G9u.A0r(r0, r5, r6, r8)
            r0 = 8
            X.AnonymousClass7TF.A1G(r10, r0, r9)
            X.JzN r4 = new X.JzN
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.3Ih r6 = X.Dba.A0S(r4, r3)
        L_0x04ab:
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x04d9
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x04dc
            X.05G r2 = r2.A08
            r11 = 0
            X.JxW r6 = r1.A03
            com.instagram.api.schemas.MediaPromptPrefType r4 = r1.A01
            boolean r12 = r1.A07
            com.instagram.api.schemas.MediaPromptPrefType r5 = r1.A02
            X.JxX r7 = r1.A04
            boolean r13 = r1.A09
            int r10 = r1.A00
            java.util.List r9 = r1.A06
            java.lang.String r8 = r1.A05
            r0 = 2
            X.C51973G9u.A0r(r0, r4, r5, r7)
            r0 = 8
            X.AnonymousClass7TF.A1G(r9, r0, r8)
            X.JzN r3 = new X.JzN
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.Epw(r3)
        L_0x04d9:
            X.0gF r3 = X.C60340gF.A00
        L_0x04db:
            return r3
        L_0x04dc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEN(C60207JhQ jhQ, AnonymousClass4D7 r3) {
        super(1, r3);
        this.A03 = 2;
        this.A04 = jhQ;
    }
}
