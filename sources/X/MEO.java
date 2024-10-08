package X;

import com.instagram.genai.imageservice.service.GenAIImageService;

public final class MEO extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEO(0nV r2, LBC lbc, MV5 mv5, AnonymousClass4D7 r5) {
        super(1, r5);
        this.A03 = 2;
        this.A01 = mv5;
        this.A05 = lbc;
        this.A04 = r2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.MEO] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MEO] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.4D7, X.MEO] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r11) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        AnonymousClass4D7 r8 = r11;
        switch (this.A03) {
            case 0:
                obj2 = this.A02;
                obj = this.A05;
                obj4 = this.A04;
                obj3 = this.A01;
                i = 0;
                break;
            case 1:
                obj = this.A05;
                obj2 = this.A02;
                obj3 = this.A01;
                obj4 = this.A04;
                i = 1;
                break;
            case 2:
                LBC lbc = (LBC) this.A05;
                return new MEO((0nV) this.A04, lbc, (MV5) this.A01, r11);
            case 3:
                return new MEO((GenAIImageService) this.A02, (LG0) this.A04, (C60966JuO) this.A05, r11);
            default:
                obj2 = this.A02;
                obj4 = this.A04;
                obj3 = this.A01;
                obj = this.A05;
                i = 4;
                break;
        }
        return new MEO(obj2, obj, obj4, obj3, r8, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MEO) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.4D7, X.MEO] */
    /* JADX WARNING: type inference failed for: r23v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r25v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r24v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r22v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015e, code lost:
        if (r1 != r0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0160, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        X.0eS.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fd, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r15 = r27
            r5 = r28
            int r0 = r15.A03
            switch(r0) {
                case 0: goto L_0x01b5;
                case 1: goto L_0x0114;
                case 2: goto L_0x00b4;
                case 3: goto L_0x026a;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r15.A00
            r6 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 == r6) goto L_0x01b1
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.0eS.A00(r5)
            X.0r1 r23 = new X.0r1
            r23.<init>()
            X.0r1 r25 = new X.0r1
            r25.<init>()
            X.0r1 r24 = new X.0r1
            r24.<init>()
            X.0r1 r22 = new X.0r1
            r22.<init>()
            X.0rm r26 = X.C51965G9l.A11()
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()
            java.lang.Object r4 = r15.A02
            X.Ocm r4 = (X.C71108Ocm) r4
            java.lang.Object r5 = r15.A04
            X.L9y r5 = (X.C63869L9y) r5
            java.lang.Object r2 = r15.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r3 = r15.A05
            X.Hop r3 = (X.C55868Hop) r3
            X.OrP r1 = new X.OrP
            r16 = r1
            r17 = r3
            r18 = r5
            r19 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r15.A00 = r6
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            java.lang.String r4 = r5.A03
            java.lang.String r3 = "query"
            r7.A04(r3, r4)
            java.lang.String r4 = r5.A02
            java.lang.String r3 = "search_session_id"
            r7.A04(r3, r4)
            java.lang.String r4 = r5.A00
            java.lang.String r3 = "entrypoint"
            X.1vR r8 = X.DbU.A0J(r7, r3, r4)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.C4Y> r12 = X.C4Y.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "MetaHCMQuery"
            r13 = 0
            java.lang.String r17 = "xdt_fbsearch__meta_ai_hcm_stream"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r5 = X.1vm.A01(r2)
            r2 = 15
            X.LbE r4 = new X.LbE
            r4.<init>(r1, r2)
            r2 = 17
            X.LbB r3 = new X.LbB
            r3.<init>(r1, r2)
            r2 = 1264243604(0x4b5ad394, float:1.4341012E7)
            X.0nX r1 = new X.0nX
            r1.<init>(r2)
            r5.ATM(r3, r4, r7, r1)
            X.0gF r1 = X.C60340gF.A00
            goto L_0x015e
        L_0x00b4:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r15.A00
            r4 = 1
            if (r1 == 0) goto L_0x00c3
            if (r1 != r4) goto L_0x00be
            goto L_0x00db
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00c3:
            X.0eS.A00(r5)
            X.LS1 r3 = X.LS1.A00
            java.lang.Object r2 = r15.A05
            X.LBC r2 = (X.LBC) r2
            java.lang.Object r1 = r15.A04
            X.0nV r1 = (X.0nV) r1
            r15.A02 = r3     // Catch:{ all -> 0x00e1 }
            r15.A00 = r4     // Catch:{ all -> 0x00e1 }
            java.lang.Object r5 = X.C394579yL.A00(r1, r2, r15)     // Catch:{ all -> 0x00e1 }
            if (r5 != r0) goto L_0x00de
            return r0
        L_0x00db:
            X.0eS.A00(r5)     // Catch:{ all -> 0x00e1 }
        L_0x00de:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00e1 }
            goto L_0x00e6
        L_0x00e1:
            r0 = move-exception
            X.0eQ r5 = X.JTO.A1B(r0)
        L_0x00e6:
            java.lang.Object r2 = r15.A01
            X.MV5 r2 = (X.MV5) r2
            boolean r0 = r5 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00fb
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            X.M6m r0 = new X.M6m
            r0.<init>(r2, r1)
            X.11Z.A02(r0)
        L_0x00fb:
            java.lang.Throwable r1 = X.0eR.A00(r5)
            if (r1 == 0) goto L_0x01fb
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x0113
            boolean r0 = r1 instanceof java.lang.Exception
            if (r0 == 0) goto L_0x01fb
            X.M6n r0 = new X.M6n
            r0.<init>(r2, r1)
            X.11Z.A02(r0)
            goto L_0x01fb
        L_0x0113:
            throw r1
        L_0x0114:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r15.A00
            r4 = 3
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0176
            if (r1 != r2) goto L_0x01b1
            X.0eS.A00(r5)
        L_0x0122:
            X.7dm r5 = (X.C335937dm) r5
            X.7ap r9 = X.C334197ap.A00
            java.lang.Object r6 = r15.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r6
            com.instagram.common.session.UserSession r1 = r6.A0B
            java.lang.Object r8 = r15.A04
            X.7al r8 = (X.C334157al) r8
            r7 = 0
            r9.A01(r1, r8, r7)
            X.7dn r1 = X.C335947dn.A00
            boolean r1 = X.0qQ.A0K(r5, r1)
            if (r1 != 0) goto L_0x01fb
            X.7do r1 = X.C335957do.A00
            boolean r1 = X.0qQ.A0K(r5, r1)
            if (r1 == 0) goto L_0x0161
            r9.A02(r8, r7)
            X.7al r1 = X.C334157al.INITIAL_LOADING
            if (r8 != r1) goto L_0x01fb
            X.GyO r1 = r6.A03
            if (r1 == 0) goto L_0x0156
            X.34p r1 = r1.A00
            if (r1 == 0) goto L_0x0156
            r1.A01()
        L_0x0156:
            r15.A00 = r3
            X.Ayy r1 = X.C41707Ayy.A00
            java.lang.Object r1 = X.JTQ.A0X(r6, r0, r15, r1)
        L_0x015e:
            if (r1 != r0) goto L_0x01fb
            return r0
        L_0x0161:
            boolean r1 = r5 instanceof X.C335927dl
            if (r1 == 0) goto L_0x01a8
            r9.A03(r8, r7)
            X.7dl r5 = (X.C335927dl) r5
            X.7al r1 = X.C334157al.INITIAL_LOADING
            if (r8 == r1) goto L_0x016f
            r2 = 0
        L_0x016f:
            r15.A00 = r4
            java.lang.Object r1 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A04(r6, r5, r15, r2)
            goto L_0x015e
        L_0x0176:
            X.0eS.A00(r5)
            java.lang.Object r10 = r15.A05
            X.7aC r10 = (X.C333817aC) r10
            java.lang.Object r5 = r15.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            com.instagram.common.session.UserSession r11 = r5.A0B
            X.7a5 r1 = r5.A05
            X.1Xl r1 = r1.A00
            if (r1 == 0) goto L_0x01a6
            X.1Xj r12 = r1.BPf()
        L_0x018d:
            X.GmL r1 = r5.A04
            boolean r5 = r1.A0e
            java.lang.String r13 = r1.A0E
            java.lang.String r14 = r1.A0J
            java.lang.Object r1 = r15.A01
            X.0sa r1 = (X.C62320sa) r1
            r15.A00 = r2
            r16 = r1
            r17 = r5
            java.lang.Object r5 = com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt.A01(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r5 != r0) goto L_0x0122
            return r0
        L_0x01a6:
            r12 = 0
            goto L_0x018d
        L_0x01a8:
            boolean r0 = r5 instanceof X.C338027hI
            if (r0 != 0) goto L_0x01fb
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01b1:
            X.0eS.A00(r5)
            goto L_0x01fb
        L_0x01b5:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r15.A00
            r4 = 1
            if (r1 == 0) goto L_0x022f
            if (r1 != r4) goto L_0x0265
            X.0eS.A00(r5)
        L_0x01c1:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r3 = r15.A02
            X.L5s r3 = (X.C63760L5s) r3
            X.Kzi r2 = r3.A00
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r1 = r5.A00
            X.JV7 r1 = (X.JV7) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.5Oz r0 = r2.A00
            r0.Epw(r1)
            java.lang.Object r0 = r15.A05
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r6 = r1.A01
            java.lang.Object r1 = r15.A04
            X.0iw r1 = (X.AnonymousClass0iw) r1
            com.instagram.common.session.UserSession r2 = r3.A02
            java.lang.String r5 = "system_share_sheet"
            X.0qQ.A0B(r1, r4)
            X.C51972G9s.A1C(r0, r6)
            java.lang.String r3 = r0.getId()
            if (r3 == 0) goto L_0x0256
            java.lang.String r4 = "direct_share_sheet"
            X.C22031Xty.A0J(r1, r2, r3, r4, r5, r6)
        L_0x01fb:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x01fe:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0260
            java.lang.Object r3 = r15.A02
            X.L5s r3 = (X.C63760L5s) r3
            java.lang.Object r2 = r15.A05
            X.1Xj r2 = (X.1Xj) r2
            X.4dm r1 = X.JTP.A0N(r5)
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x022d
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r10 = r1.A00
        L_0x0216:
            java.lang.Object r5 = r15.A04
            X.0iw r5 = (X.AnonymousClass0iw) r5
            com.instagram.common.session.UserSession r6 = r3.A02
            java.lang.String r9 = "system_share_sheet"
            X.AnonymousClass7TF.A1B(r5, r4, r2)
            java.lang.String r7 = r2.getId()
            if (r7 == 0) goto L_0x025b
            java.lang.String r8 = "direct_share_sheet"
            X.C22031Xty.A0H(r5, r6, r7, r8, r9, r10)
            goto L_0x01fb
        L_0x022d:
            r10 = 0
            goto L_0x0216
        L_0x022f:
            X.0eS.A00(r5)
            java.lang.Object r1 = r15.A02
            X.L5s r1 = (X.C63760L5s) r1
            com.instagram.common.session.UserSession r1 = r1.A02
            com.instagram.barcelona.share.data.PermalinkRepository r5 = new com.instagram.barcelona.share.data.PermalinkRepository
            r5.<init>(r1)
            java.lang.Object r3 = r15.A05
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r15.A04
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r1 = r15.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x024d
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
        L_0x024d:
            r15.A00 = r4
            java.lang.Object r5 = r5.A00(r2, r3, r1, r15)
            if (r5 != r0) goto L_0x01c1
            return r0
        L_0x0256:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x025b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0260:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0265:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x026a:
            X.1Hj r0 = X.1Hj.A02
            int r2 = r15.A00
            r1 = 1
            if (r2 == 0) goto L_0x0281
            if (r2 != r1) goto L_0x02d1
            X.0eS.A00(r5)
        L_0x0276:
            X.3Ii r5 = (X.C239803Ii) r5
            java.lang.Object r0 = r15.A04
            X.LG0 r0 = (X.LG0) r0
            X.3Ii r0 = com.instagram.genai.imageservice.service.GenAIImageService.A00(r0, r5)
            return r0
        L_0x0281:
            X.0eS.A00(r5)
            java.lang.Object r4 = r15.A02
            com.instagram.genai.imageservice.service.GenAIImageService r4 = (com.instagram.genai.imageservice.service.GenAIImageService) r4
            com.instagram.genai.imageservice.api.GenAIImageQueryGraphQLApi r6 = com.instagram.genai.imageservice.api.GenAIImageQueryGraphQLApi.A00
            com.instagram.common.session.UserSession r7 = r4.A03
            java.lang.Object r5 = r15.A05
            X.JuO r5 = (X.C60966JuO) r5
            java.lang.Integer r3 = r5.A02
            r2 = 0
            int r2 = X.C51967G9n.A03(r3, r2)
            java.lang.String r8 = "IMAGINE"
            switch(r2) {
                case 0: goto L_0x02a1;
                case 1: goto L_0x02a4;
                case 2: goto L_0x02a7;
                case 3: goto L_0x02aa;
                case 4: goto L_0x02ad;
                case 5: goto L_0x02b2;
                case 6: goto L_0x02b2;
                case 7: goto L_0x02b0;
                default: goto L_0x029c;
            }
        L_0x029c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02a1:
            java.lang.String r8 = "BACKDROP"
            goto L_0x02b2
        L_0x02a4:
            java.lang.String r8 = "EXPANDER"
            goto L_0x02b2
        L_0x02a7:
            java.lang.String r8 = "STYLIZATION"
            goto L_0x02b2
        L_0x02aa:
            java.lang.String r8 = "SAM_MASK_GEN"
            goto L_0x02b2
        L_0x02ad:
            java.lang.String r8 = "SEMANTIC_SEGMENTATION"
            goto L_0x02b2
        L_0x02b0:
            java.lang.String r8 = "IMAGINE_ME"
        L_0x02b2:
            int r3 = r5.A01
            int r2 = r5.A00
            java.lang.String r9 = r5.A03
            java.lang.String r10 = r5.A06
            java.lang.String r11 = r5.A07
            java.lang.String r12 = r5.A08
            java.lang.String r14 = r5.A05
            java.lang.String r13 = r5.A04
            r15.A01 = r4
            r15.A00 = r1
            r16 = r3
            r17 = r2
            java.lang.Object r5 = r6.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r5 != r0) goto L_0x0276
            return r0
        L_0x02d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEO(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i) {
        super(1, r6);
        this.A03 = i;
        this.A02 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A01 = obj4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEO(GenAIImageService genAIImageService, LG0 lg0, C60966JuO juO, AnonymousClass4D7 r5) {
        super(1, r5);
        this.A03 = 3;
        this.A02 = genAIImageService;
        this.A05 = juO;
        this.A04 = lg0;
    }
}
