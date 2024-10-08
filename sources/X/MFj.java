package X;

public final class MFj extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFj(Object obj, Object obj2, String str, String str2, AnonymousClass4D7 r6, int i, boolean z) {
        super(2, r6);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A06 = z;
        this.A04 = str2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.MFj, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r2 = new X.MFj(r3, r4, r5, r6, r7, r8);
        r2.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        return new X.MFj(r2, r3, r4, r5, r6, r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A02
            r6 = r11
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x002e;
                case 2: goto L_0x0018;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r3 = r9.A03
            java.lang.String r4 = r9.A05
            boolean r8 = r9.A06
            java.lang.String r5 = r9.A04
            r7 = 3
        L_0x000f:
            X.MFj r1 = new X.MFj
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.A01 = r10
            return r1
        L_0x0018:
            java.lang.Object r3 = r9.A03
            java.lang.String r4 = r9.A05
            java.lang.String r5 = r9.A04
            boolean r8 = r9.A06
            r7 = 2
            goto L_0x000f
        L_0x0022:
            java.lang.Object r2 = r9.A01
            java.lang.Object r3 = r9.A03
            java.lang.String r4 = r9.A05
            boolean r8 = r9.A06
            java.lang.String r5 = r9.A04
            r7 = 0
            goto L_0x0039
        L_0x002e:
            java.lang.Object r3 = r9.A03
            java.lang.String r4 = r9.A05
            java.lang.String r5 = r9.A04
            boolean r8 = r9.A06
            java.lang.Object r2 = r9.A01
            r7 = 1
        L_0x0039:
            X.MFj r1 = new X.MFj
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFj.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.MFj, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.ME4, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0390, code lost:
        if (r2 == r5) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f1, code lost:
        X.0eS.A00(r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03fd, code lost:
        if (r0.A06 != false) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0401, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r0 != r5) goto L_0x03ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03e1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            int r2 = r0.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            switch(r2) {
                case 0: goto L_0x0242;
                case 1: goto L_0x021e;
                case 2: goto L_0x0034;
                default: goto L_0x000b;
            }
        L_0x000b:
            r6 = 1
            if (r1 != 0) goto L_0x03f1
            X.0eS.A00(r27)
            java.lang.Object r4 = r0.A01
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r7 = r0.A03
            X.LQd r7 = (X.C64141LQd) r7
            java.util.HashMap r3 = r7.A05
            java.lang.String r8 = r0.A05
            java.lang.Object r2 = r3.get(r8)
            X.4Co r2 = (X.C262204Co) r2
            if (r2 == 0) goto L_0x0402
            boolean r1 = r2.isActive()
            if (r1 != r6) goto L_0x03f5
            r0.A00 = r6
            java.lang.Object r0 = r2.CfH(r0)
        L_0x0031:
            if (r0 != r5) goto L_0x03ff
        L_0x0033:
            return r5
        L_0x0034:
            r17 = 1
            if (r1 != 0) goto L_0x03f1
            X.0eS.A00(r27)
            java.lang.Object r1 = r0.A01
            r18 = r1
            java.lang.Object r7 = r0.A03
            X.LQd r7 = (X.C64141LQd) r7
            com.instagram.common.session.UserSession r1 = r7.A02
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r10 = r7.A04
            java.lang.String r6 = r0.A05
            java.lang.String r8 = r0.A04
            r9 = 2
            X.0qQ.A0B(r6, r9)
            r4 = 0
            X.1NY r3 = X.DbU.A0M(r1)
            java.lang.String r1 = "commerce/product_tagging/tagging_feed/"
            r3.A0A(r1)
            r3.A05()
            java.lang.Class<X.K1Y> r2 = X.K1Y.class
            java.lang.Class<X.LJv> r1 = X.C64031LJv.class
            r3.A0Q(r2, r1)
            r1 = 904(0x388, float:1.267E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.A9m(r1, r6)
            X.Uxb r1 = r10.A03
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "usage"
            r3.A9m(r1, r2)
            java.lang.String r2 = r10.A0B
            java.lang.String r1 = "prior_module"
            r3.A9m(r1, r2)
            java.lang.String r2 = r10.A0G
            java.lang.String r1 = "waterfall_id"
            r3.A9m(r1, r2)
            java.lang.String r2 = r10.A0F
            java.lang.String r1 = X.AnonymousClass9NF.A01()
            r3.A9m(r1, r2)
            long r1 = X.1G0.A00()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "timezone_offset"
            r3.A9m(r1, r2)
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState r13 = r10.A04
            java.io.StringWriter r12 = X.JTO.A0v()
            X.17W r11 = X.AnonymousClass7TF.A0K(r12)
            java.util.List r1 = r13.A05
            if (r1 == 0) goto L_0x00e0
            r1 = 801(0x321, float:1.122E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.16P.A03(r11, r1)
            java.util.List r1 = r13.A05
            java.util.Iterator r15 = r1.iterator()
        L_0x00b6:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r14 = r15.next()
            com.instagram.model.shopping.CompoundProductId r14 = (com.instagram.model.shopping.CompoundProductId) r14
            if (r14 == 0) goto L_0x00b6
            r11.A0c()
            java.lang.String r2 = r14.A01
            if (r2 == 0) goto L_0x00d0
            java.lang.String r1 = "product_id"
            r11.A0R(r1, r2)
        L_0x00d0:
            java.lang.String r2 = r14.A00
            if (r2 == 0) goto L_0x00d9
            java.lang.String r1 = "merchant_id"
            r11.A0R(r1, r2)
        L_0x00d9:
            r11.A0Z()
            goto L_0x00b6
        L_0x00dd:
            r11.A0Y()
        L_0x00e0:
            java.util.List r1 = r13.A03
            if (r1 == 0) goto L_0x00fc
            java.lang.String r1 = "tagged_collections"
            X.16P.A03(r11, r1)
            java.util.List r1 = r13.A03
            java.util.Iterator r2 = r1.iterator()
        L_0x00ef:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00f9
            X.C41846B3n.A18(r11, r2)
            goto L_0x00ef
        L_0x00f9:
            r11.A0Y()
        L_0x00fc:
            java.util.List r1 = r13.A04
            if (r1 == 0) goto L_0x0118
            java.lang.String r1 = "tagged_merchants"
            X.16P.A03(r11, r1)
            java.util.List r1 = r13.A04
            java.util.Iterator r2 = r1.iterator()
        L_0x010b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0115
            X.C41846B3n.A18(r11, r2)
            goto L_0x010b
        L_0x0115:
            r11.A0Y()
        L_0x0118:
            java.util.List r1 = r13.A00
            if (r1 == 0) goto L_0x0134
            java.lang.String r1 = "branded_content_partners"
            X.16P.A03(r11, r1)
            java.util.List r1 = r13.A00
            java.util.Iterator r2 = r1.iterator()
        L_0x0127:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0131
            X.C41846B3n.A18(r11, r2)
            goto L_0x0127
        L_0x0131:
            r11.A0Y()
        L_0x0134:
            java.util.List r1 = r13.A06
            if (r1 == 0) goto L_0x0150
            java.lang.String r1 = "tagged_users"
            X.16P.A03(r11, r1)
            java.util.List r1 = r13.A06
            java.util.Iterator r2 = r1.iterator()
        L_0x0143:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x014d
            X.C41846B3n.A18(r11, r2)
            goto L_0x0143
        L_0x014d:
            r11.A0Y()
        L_0x0150:
            java.util.List r1 = r13.A02
            if (r1 == 0) goto L_0x0185
            java.lang.String r1 = "suggested_products"
            X.16P.A03(r11, r1)
            java.util.List r1 = r13.A02
            java.util.Iterator r16 = r1.iterator()
        L_0x015f:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0182
            java.lang.Object r15 = r16.next()
            com.instagram.api.schemas.VisualSearchSuggestedProductContainer r15 = (com.instagram.api.schemas.VisualSearchSuggestedProductContainer) r15
            if (r15 == 0) goto L_0x015f
            r11.A0c()
            long r1 = r15.A00
            java.lang.String r14 = "merchant_id"
            r11.A0Q(r14, r1)
            long r1 = r15.A01
            java.lang.String r14 = "product_id"
            r11.A0Q(r14, r1)
            r11.A0Z()
            goto L_0x015f
        L_0x0182:
            r11.A0Y()
        L_0x0185:
            java.util.List r1 = r13.A01
            if (r1 == 0) goto L_0x01a1
            java.lang.String r1 = "mentioned_merchants"
            X.16P.A03(r11, r1)
            java.util.List r1 = r13.A01
            java.util.Iterator r2 = r1.iterator()
        L_0x0194:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x019e
            X.C41846B3n.A18(r11, r2)
            goto L_0x0194
        L_0x019e:
            r11.A0Y()
        L_0x01a1:
            java.lang.String r2 = X.AnonymousClass7TG.A0k(r11, r12)
            java.lang.String r1 = "client_state"
            r3.A9m(r1, r2)
            java.util.List r2 = r10.A0H
            if (r2 == 0) goto L_0x021c
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x021c
            java.lang.String r2 = X.C51970G9q.A0k(r2)
        L_0x01b8:
            java.lang.String r1 = "shopnet_recommended_product_ids"
            r3.A0G(r1, r2)
            java.lang.String r2 = r10.A0D
            java.lang.String r1 = "source_type"
            r3.A0G(r1, r2)
            java.lang.String r2 = r10.A0C
            java.lang.String r1 = "source_id"
            r3.A0G(r1, r2)
            java.lang.String r1 = "max_id"
            r3.A0G(r1, r8)
            X.1OC r2 = r3.A0M()
            r1 = 302247775(0x1203ef5f, float:4.163136E-28)
            r10 = 3
            X.032 r3 = r2.A05(r1, r10)
            r2 = 31
            X.MFx r1 = new X.MFx
            r1.<init>(r2, r4)
            X.MCA r8 = X.JUM.A01(r1, r3)
            boolean r3 = r0.A06
            r2 = 7
            X.Phl r1 = new X.Phl
            r1.<init>(r7, r6, r2, r3)
            X.0pz r1 = X.JUM.A02(r1, r8)
            X.MFc r11 = new X.MFc
            r15 = r9
            r16 = r3
            r12 = r7
            r13 = r6
            r14 = r4
            r11.<init>((java.lang.Object) r12, (java.lang.String) r13, (X.AnonymousClass4D7) r14, (int) r15, (boolean) r16)
            X.0pz r2 = X.JUM.A04(r11, r1)
            X.MFd r1 = new X.MFd
            r11 = r1
            r13 = r18
            r14 = r6
            r15 = r4
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            X.0pz r2 = X.JUM.A03(r1, r2)
            r1 = r17
            r0.A00 = r1
            java.lang.Object r0 = X.AnonymousClass11O.A01(r0, r2)
            goto L_0x0031
        L_0x021c:
            r2 = r4
            goto L_0x01b8
        L_0x021e:
            r2 = 1
            if (r1 != 0) goto L_0x03f1
            X.0eS.A00(r27)
            java.lang.Object r1 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r1
            java.lang.String r8 = r0.A05
            java.lang.String r9 = r0.A04
            boolean r11 = r0.A06
            java.lang.Object r7 = r0.A01
            r0.A00 = r2
            r10 = 2
            X.IxK r6 = new X.IxK
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r1, r0, r6)
            if (r0 == r5) goto L_0x0033
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0031
        L_0x0242:
            r10 = 1
            if (r1 == 0) goto L_0x0271
            X.0eS.A00(r27)
        L_0x0248:
            java.lang.Object r2 = r0.A03
            X.JjC r2 = (X.C60311JjC) r2
            X.LRN r6 = r2.A02
            boolean r1 = r0.A06
            r1 = r1 ^ 1
            java.lang.String r12 = r0.A05
            java.lang.String r13 = r0.A04
            java.lang.Long r11 = r2.A03()
            X.AnonymousClass7TF.A1B(r12, r10, r13)
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            if (r1 == 0) goto L_0x026f
            java.lang.Integer r10 = X.AnonymousClass05K.A00
        L_0x0263:
            r7 = 0
            r8 = r7
            r14 = r7
            X.Jr6 r0 = X.LRN.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.LRO.A01(r0, r6)
            goto L_0x03ff
        L_0x026f:
            r10 = r9
            goto L_0x0263
        L_0x0271:
            X.0eS.A00(r27)
            java.lang.Object r1 = r0.A03
            X.JjC r1 = (X.C60311JjC) r1
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository r14 = r1.A06
            java.lang.String r13 = r0.A05
            r0.A00 = r10
            X.JvW r12 = com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository.A00(r14)
            if (r12 == 0) goto L_0x03dd
            X.05G r11 = r14.A06
            java.lang.Object r9 = r12.A03
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r2 = r9.iterator()
            r8 = 0
        L_0x028f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0369
            java.lang.Object r1 = r2.next()
            X.JuJ r1 = (X.C60961JuJ) r1
            java.lang.String r1 = r1.A06
            boolean r1 = X.0qQ.A0K(r1, r13)
            if (r1 == 0) goto L_0x0365
            if (r8 < 0) goto L_0x0369
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r9)
            java.lang.Object r6 = r7.get(r8)
            X.JuJ r6 = (X.C60961JuJ) r6
            java.lang.Object r1 = r7.get(r8)
            X.JuJ r1 = (X.C60961JuJ) r1
            boolean r1 = r1.A08
            r24 = r1 ^ 1
            java.lang.String r4 = r6.A06
            java.lang.Object r3 = r6.A05
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            long r1 = r6.A02
            r17 = r1
            java.lang.Object r2 = r6.A03
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            int r1 = r6.A01
            r16 = r1
            java.lang.Object r1 = r6.A04
            com.instagram.model.reels.Reel r1 = (com.instagram.model.reels.Reel) r1
            boolean r15 = r6.A07
            r6 = 0
            X.0qQ.A0B(r4, r6)
            X.AnonymousClass7TF.A1C(r3, r10, r2)
            X.JuJ r6 = new X.JuJ
            r19 = r4
            r20 = r16
            r21 = r10
            r22 = r17
            r25 = r15
            r15 = r6
            r16 = r2
            r17 = r1
            r18 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r24, r25)
            r7.set(r8, r6)
        L_0x02f1:
            r2 = 0
            java.lang.Object r6 = r12.A02
            java.util.List r6 = (java.util.List) r6
            boolean r1 = r12.A05
            r16 = r1
            java.lang.String r1 = r12.A04
            r17 = r1
            boolean r15 = r12.A06
            boolean r8 = r12.A09
            boolean r4 = r12.A08
            boolean r3 = r12.A07
            java.lang.Object r12 = r12.A01
            java.lang.Long r12 = (java.lang.Long) r12
            X.0qQ.A0B(r6, r10)
            X.JvW r1 = new X.JvW
            r23 = r4
            r24 = r3
            r25 = r2
            r19 = r6
            r20 = r16
            r21 = r15
            r22 = r8
            r16 = r12
            r18 = r7
            r15 = r1
            r15.<init>((java.lang.Long) r16, (java.lang.String) r17, (java.util.List) r18, (java.util.List) r19, (boolean) r20, (boolean) r21, (boolean) r22, (boolean) r23, (boolean) r24, (boolean) r25)
            X.C41847B3o.A1T(r1, r11, r10)
            java.util.Iterator r4 = r9.iterator()
            r3 = 0
        L_0x032d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x03dd
            java.lang.Object r1 = r4.next()
            X.JuJ r1 = (X.C60961JuJ) r1
            java.lang.String r1 = r1.A06
            boolean r1 = X.0qQ.A0K(r1, r13)
            if (r1 == 0) goto L_0x0362
            if (r3 < 0) goto L_0x03dd
            java.lang.Object r1 = r9.get(r3)
            X.JuJ r1 = (X.C60961JuJ) r1
            boolean r1 = r1.A08
            r6 = r1 ^ 1
            r1 = 2
            X.0qQ.A0B(r13, r1)
            com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedDataSource r4 = r14.A02
            java.lang.String r7 = r14.A05
            boolean r1 = X.ME4.A03(r2, r0)
            if (r1 == 0) goto L_0x036b
            java.lang.String r0 = "i2"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0362:
            int r3 = r3 + 1
            goto L_0x032d
        L_0x0365:
            int r8 = r8 + 1
            goto L_0x028f
        L_0x0369:
            r7 = r9
            goto L_0x02f1
        L_0x036b:
            X.ME4 r3 = X.ME4.A00(r4, r0, r2)
            java.lang.Object r2 = r3.A01
            int r1 = r3.A00
            if (r1 == 0) goto L_0x0393
            if (r1 != r10) goto L_0x03ec
            X.0eS.A00(r2)
        L_0x037a:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0388
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 == 0) goto L_0x03e7
            X.5sO r2 = X.JTU.A0R(r2)
        L_0x0388:
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x03dd
            boolean r1 = r2 instanceof X.C297815sO
            if (r1 == 0) goto L_0x03e2
            if (r2 != r5) goto L_0x03dd
            goto L_0x03df
        L_0x0393:
            X.0eS.A00(r2)
            com.instagram.common.session.UserSession r1 = r4.A00
            X.1NY r4 = X.AnonymousClass7TG.A0a(r1)
            r4.A02()
            java.lang.String r1 = "api/v1/creators/content_appreciation/async_update_gift_transfer_like_status/"
            r4.A0A(r1)
            java.lang.Class<X.CCt> r2 = X.C43775CCt.class
            java.lang.Class<X.CyG> r1 = X.C45542CyG.class
            r4.A0Q(r2, r1)
            java.lang.String r1 = X.AnonymousClass9NF.A01()
            r4.A9m(r1, r7)
            r1 = 44
            java.lang.String r1 = X.Pxd.A00(r1)
            r4.A9m(r1, r13)
            r1 = 3441(0xd71, float:4.822E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A0H(r1, r6)
            X.1OC r2 = r4.A0M()
            r1 = 8
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            r3.A00 = r10
            r1 = 151397138(0x9062312, float:1.6146153E-33)
            java.lang.Object r2 = r2.A00(r1, r3)
            if (r2 != r5) goto L_0x037a
            return r5
        L_0x03dd:
            X.0gF r2 = X.C60340gF.A00
        L_0x03df:
            if (r2 != r5) goto L_0x0248
            return r5
        L_0x03e2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03e7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03f1:
            X.0eS.A00(r27)
            goto L_0x03ff
        L_0x03f5:
            boolean r1 = r2.CQL()
            if (r1 != r6) goto L_0x0402
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x0402
        L_0x03ff:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0402:
            r10 = 0
            java.lang.String r9 = r0.A04
            boolean r12 = r0.A06
            r11 = 2
            X.MFj r6 = new X.MFj
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.1Er r0 = X.C51966G9m.A1L(r6, r4)
            r3.put(r8, r0)
            goto L_0x03ff
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFj) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFj(Object obj, String str, String str2, AnonymousClass4D7 r5, int i, boolean z) {
        super(2, r5);
        this.A02 = i;
        this.A03 = obj;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = z;
    }
}
