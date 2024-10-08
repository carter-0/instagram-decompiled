package X;

public abstract class VH0 {
    /* JADX WARNING: type inference failed for: r30v0, types: [X.Vj5, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0245, code lost:
        r1 = r1.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0261, code lost:
        if (r46 == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x039e, code lost:
        r3 = (X.C19276WSj) X.00k.A0J(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03a4, code lost:
        if (r3 == null) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03a6, code lost:
        r20.add(new X.WSQ(r3, (X.C19276WSj) X.00k.A0O(r15, 1), java.lang.String.valueOf(r57)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03ba, code lost:
        r57 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0127, code lost:
        if (com.instagram.api.schemas.ProductCardSubtitleType.IN_REVIEW == r3) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0136, code lost:
        if (r1.Bvo() != true) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014f, code lost:
        if (r2.Bvp() != true) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0175, code lost:
        if (r1.BC0() != true) goto L_0x0177;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.AnonymousClass0iw r70, com.instagram.common.session.UserSession r71, X.C16675UzB r72, X.C21003X9a r73, X.C20982X7x r74, java.lang.Integer r75, java.lang.String r76, java.lang.String r77, java.util.List r78, java.util.Set r79) {
        /*
            r21 = 0
            r14 = 0
            r1 = r78
            X.0qQ.A0B(r1, r14)
            r10 = 1
            r0 = 2
            java.util.ArrayList r0 = X.00k.A0Q(r1, r0)
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.Iterator r19 = r0.iterator()
            r57 = 0
        L_0x0019:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x03c6
            java.lang.Object r0 = r19.next()
            int r18 = r57 + 1
            if (r57 < 0) goto L_0x03be
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r17 = r0.iterator()
            r13 = 0
        L_0x0033:
            boolean r0 = r17.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x039e
            java.lang.Object r0 = r17.next()
            int r16 = r13 + 1
            if (r13 < 0) goto L_0x03be
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r0
            X.Uw7 r31 = X.Uw7.A02
            r3 = r79
            if (r79 == 0) goto L_0x039a
            com.instagram.user.model.Product r2 = r0.A02()
            if (r2 == 0) goto L_0x0052
            java.lang.String r1 = r2.A0H
        L_0x0052:
            boolean r46 = X.00k.A0u(r3, r1)
        L_0x0056:
            X.Vj5 r30 = new X.Vj5
            r30.<init>()
            X.0qQ.A0B(r0, r14)
            r69 = 5
            r49 = 6
            X.Wxh r41 = new X.Wxh
            r54 = r74
            r27 = r76
            r51 = r41
            r52 = r0
            r53 = r21
            r55 = r27
            r56 = r21
            r58 = r13
            r59 = r14
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59)
            com.instagram.model.shopping.productfeed.ProductTile r1 = r0.A02
            java.lang.String r2 = ""
            r22 = r2
            r25 = r70
            r12 = r71
            r4 = r73
            r62 = r77
            if (r1 == 0) goto L_0x0277
            com.instagram.api.schemas.ProductTileMetadataImpl r1 = r1.A01
            if (r1 == 0) goto L_0x0273
            com.instagram.api.schemas.ProductTileMetadataDecorations r1 = r1.A00
        L_0x008f:
            X.W3C r32 = X.W3C.A00
            r3 = r21
            com.instagram.api.schemas.ProductCardSubtitleType r3 = X.W3C.A00(r3, r0)
            X.Vu4 r5 = X.C18552Vu4.A00(r12)
            r11 = r75
            boolean r5 = r5.A01(r11)
            r52 = 1
            if (r5 == 0) goto L_0x00af
            if (r1 == 0) goto L_0x00af
            boolean r5 = r1.Bvt()
            if (r5 != 0) goto L_0x00af
            r52 = 0
        L_0x00af:
            r5 = 12
            X.WB5 r9 = new X.WB5
            r6 = r27
            r9.<init>((java.lang.Object) r4, (java.lang.Object) r0, (java.lang.String) r6, (int) r5)
            r6 = 11
            X.WBE r8 = new X.WBE
            r8.<init>((int) r6, (java.lang.Object) r4, (java.lang.Object) r0)
            X.WBE r7 = new X.WBE
            r7.<init>((int) r5, (java.lang.Object) r4, (java.lang.Object) r0)
            r5 = 10
            X.WBE r6 = new X.WBE
            r6.<init>((int) r5, (java.lang.Object) r4, (java.lang.Object) r0)
            X.Vu4 r5 = X.C18552Vu4.A00(r12)
            boolean r11 = r5.A01(r11)
            r33 = r9
            r34 = r8
            r35 = r7
            r36 = r6
            r37 = r12
            r38 = r0
            X.0eP r5 = r32.A06(r33, r34, r35, r36, r37, r38)
            java.lang.Object r7 = r5.A00
            X.4Yx r7 = (X.C266444Yx) r7
            java.lang.Object r6 = r5.A01
            java.util.List r6 = (java.util.List) r6
            com.instagram.model.shopping.productfeed.ProductTile r5 = r0.A02
            if (r5 == 0) goto L_0x026f
            com.instagram.api.schemas.ProductTileMetadataImpl r5 = r5.A01
            if (r5 == 0) goto L_0x026f
            com.instagram.api.schemas.ProductTileMetadataDecorations r5 = r5.A00
            if (r5 == 0) goto L_0x026f
            java.lang.Boolean r5 = r5.CdM()
            boolean r54 = X.AnonymousClass7TF.A1Y(r5, r10)
        L_0x00ff:
            com.instagram.model.shopping.productfeed.ProductTile r5 = r0.A02
            if (r5 == 0) goto L_0x0265
            com.instagram.api.schemas.FBProductItemDetailsDict r5 = X.C18768W0o.A01(r5)
            if (r5 == 0) goto L_0x0265
            java.lang.String r8 = X.C45683D1i.A00(r5)
        L_0x010d:
            r5 = 2131967982(0x7f133fee, float:1.9572846E38)
            java.lang.String r9 = r0.A03()
            if (r9 == 0) goto L_0x0117
            r2 = r9
        L_0x0117:
            X.HsR r26 = X.JTR.A0g(r2, r5)
            com.instagram.model.mediasize.ImageInfo r29 = r0.A00()
            com.instagram.api.schemas.ProductCardSubtitleType r2 = com.instagram.api.schemas.ProductCardSubtitleType.NOT_APPROVED
            if (r2 == r3) goto L_0x0129
            com.instagram.api.schemas.ProductCardSubtitleType r2 = com.instagram.api.schemas.ProductCardSubtitleType.IN_REVIEW
            r45 = 0
            if (r2 != r3) goto L_0x012b
        L_0x0129:
            r45 = 1
        L_0x012b:
            r48 = 1
            if (r11 == 0) goto L_0x0138
            if (r1 == 0) goto L_0x0138
            boolean r2 = r1.Bvo()
            r3 = 1
            if (r2 == r10) goto L_0x0139
        L_0x0138:
            r3 = 0
        L_0x0139:
            if (r46 != 0) goto L_0x025f
            if (r3 == 0) goto L_0x025f
        L_0x013d:
            com.instagram.model.shopping.productfeed.ProductTile r2 = r0.A02
            if (r2 == 0) goto L_0x0151
            com.instagram.api.schemas.ProductTileMetadataImpl r2 = r2.A01
            if (r2 == 0) goto L_0x0151
            com.instagram.api.schemas.ProductTileMetadataDecorations r2 = r2.A00
            if (r2 == 0) goto L_0x0151
            boolean r2 = r2.Bvp()
            r49 = 1
            if (r2 == r10) goto L_0x0153
        L_0x0151:
            r49 = 0
        L_0x0153:
            if (r11 == 0) goto L_0x0253
            if (r1 == 0) goto L_0x025b
            boolean r1 = r1.BvH()
            if (r1 != r10) goto L_0x025b
        L_0x015d:
            r50 = 1
        L_0x015f:
            boolean r51 = r0.A05(r12)
            com.instagram.model.shopping.productfeed.ProductTile r1 = r0.A02
            if (r1 == 0) goto L_0x0177
            com.instagram.api.schemas.ProductTileMetadataImpl r1 = r1.A01
            if (r1 == 0) goto L_0x0177
            com.instagram.api.schemas.ProductTileMetadataDecorations r1 = r1.A00
            if (r1 == 0) goto L_0x0177
            boolean r1 = r1.BC0()
            r53 = 1
            if (r1 == r10) goto L_0x0179
        L_0x0177:
            r53 = 0
        L_0x0179:
            com.instagram.api.schemas.ProductTileBannerMetadataDecoration r24 = X.W3C.A01(r12, r0)
            com.instagram.model.shopping.productfeed.ProductTile r1 = r0.A02
            if (r1 == 0) goto L_0x023f
            com.instagram.api.schemas.FBProductItemDetailsDict r1 = X.C18768W0o.A01(r1)
            if (r1 == 0) goto L_0x023f
            java.lang.String r1 = r1.BaK()
            if (r1 == 0) goto L_0x023f
            com.instagram.common.typedurl.SimpleImageUrl r2 = new com.instagram.common.typedurl.SimpleImageUrl
            r2.<init>(r1)
        L_0x0192:
            com.instagram.model.shopping.productfeed.ProductTile r1 = r0.A02
            if (r1 == 0) goto L_0x022b
            com.instagram.api.schemas.FBProductItemDetailsDict r1 = X.C18768W0o.A01(r1)
            if (r1 == 0) goto L_0x022b
            java.lang.String r35 = r1.BaI()
            if (r35 != 0) goto L_0x01a4
            r35 = r22
        L_0x01a4:
            if (r46 == 0) goto L_0x01f9
            r37 = r21
            r43 = r21
            r23 = r21
        L_0x01ac:
            X.JG0 r1 = new X.JG0
            r1.<init>(r14, r4, r0)
            r60 = 9
            X.J6Y r38 = new X.J6Y
            r55 = r38
            r56 = r4
            r58 = r0
            r59 = r13
            r55.<init>((java.lang.Object) r56, (int) r57, (java.lang.Object) r58, (int) r59, (int) r60)
            X.Wxg r39 = new X.Wxg
            r58 = r39
            r59 = r0
            r60 = r4
            r61 = r27
            r63 = r57
            r64 = r13
            r65 = r10
            r58.<init>(r59, r60, r61, r62, r63, r64, r65)
            X.WyU r40 = X.C20757WyU.A00
            X.Wz4 r44 = X.C20792Wz4.A00
            X.WSj r0 = new X.WSj
            r27 = r7
            r28 = r2
            r32 = r21
            r33 = r21
            r34 = r8
            r36 = r6
            r42 = r1
            r47 = r46
            r55 = r10
            r56 = r14
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
        L_0x01f2:
            r15.add(r0)
        L_0x01f5:
            r13 = r16
            goto L_0x0033
        L_0x01f9:
            X.Wxg r37 = new X.Wxg
            r58 = r37
            r59 = r0
            r60 = r4
            r61 = r27
            r63 = r57
            r64 = r13
            r65 = r14
            r58.<init>(r59, r60, r61, r62, r63, r64, r65)
            X.J8Y r43 = new X.J8Y
            r63 = r43
            r64 = r4
            r65 = r0
            r66 = r27
            r67 = r57
            r68 = r13
            r63.<init>(r64, r65, r66, r67, r68, r69)
            X.WBi r23 = new X.WBi
            r63 = r23
            r64 = r0
            r65 = r4
            r69 = r14
            r63.<init>(r64, r65, r66, r67, r68, r69)
            goto L_0x01ac
        L_0x022b:
            com.instagram.user.model.Product r1 = r0.A02()
            if (r1 == 0) goto L_0x023b
            com.instagram.user.model.User r1 = r1.A0B
            if (r1 == 0) goto L_0x023b
            java.lang.String r35 = r1.getUsername()
            goto L_0x01a4
        L_0x023b:
            r35 = r21
            goto L_0x01a4
        L_0x023f:
            com.instagram.user.model.Product r1 = r0.A02()
            if (r1 == 0) goto L_0x024f
            com.instagram.user.model.User r1 = r1.A0B
            if (r1 == 0) goto L_0x024f
            com.instagram.common.typedurl.ImageUrl r2 = r1.Bh3()
            goto L_0x0192
        L_0x024f:
            r2 = r21
            goto L_0x0192
        L_0x0253:
            X.UzB r1 = X.C16675UzB.RECENTLY_VIEWED
            r2 = r72
            if (r2 != r1) goto L_0x025b
            goto L_0x015d
        L_0x025b:
            r50 = 0
            goto L_0x015f
        L_0x025f:
            r48 = 0
            if (r46 != 0) goto L_0x0151
            goto L_0x013d
        L_0x0265:
            com.instagram.user.model.Product r5 = r0.A02()
            if (r5 == 0) goto L_0x01f5
            java.lang.String r8 = r5.A0H
            goto L_0x010d
        L_0x026f:
            r54 = 0
            goto L_0x00ff
        L_0x0273:
            r1 = r21
            goto L_0x008f
        L_0x0277:
            com.instagram.model.shopping.productfeed.ProductTileMedia r1 = r0.A01(r12)
            if (r1 == 0) goto L_0x01f5
            X.1E8 r3 = X.1E7.A00(r12)
            com.instagram.model.shopping.productfeed.ProductTileMedia r1 = r0.A01(r12)
            if (r1 == 0) goto L_0x0396
            java.lang.String r1 = r1.A02
        L_0x0289:
            X.1Xj r1 = r3.A02(r1)
            if (r1 == 0) goto L_0x01f5
            java.lang.String r34 = r0.getId()
            X.0qQ.A07(r34)
            X.1Xy r3 = r1.A0C
            java.lang.String r3 = r3.AXm()
            if (r3 != 0) goto L_0x029f
            r3 = r2
        L_0x029f:
            X.GKw r8 = new X.GKw
            r8.<init>(r3)
            r3 = 2131965936(0x7f1337f0, float:1.9568696E38)
            com.instagram.user.model.User r5 = X.C51966G9m.A11(r1)
            if (r5 == 0) goto L_0x02b1
            java.lang.String r2 = r5.B8Q()
        L_0x02b1:
            X.HsR r26 = X.JTR.A0g(r2, r3)
            com.instagram.model.mediasize.ImageInfo r29 = r1.A1p()
            boolean r51 = r1.CbC()
            r5 = 9
            X.WBE r2 = new X.WBE
            r2.<init>((int) r5, (java.lang.Object) r4, (java.lang.Object) r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.instagram.user.model.User r3 = X.C51966G9m.A11(r1)
            if (r3 == 0) goto L_0x02ec
            java.lang.String r3 = r3.B8Q()
            X.Iwc r6 = new X.Iwc
            r6.<init>(r3, r5)
            X.Wyk r39 = X.C20773Wyk.A00
            X.Wyn r38 = X.C20776Wyn.A00
            X.VkX r3 = new X.VkX
            r35 = r3
            r36 = r21
            r37 = r6
            r40 = r10
            r35.<init>(r36, r37, r38, r39, r40)
            r7.add(r3)
        L_0x02ec:
            boolean r3 = r1.A4u()
            if (r3 == 0) goto L_0x0317
            java.util.ArrayList r3 = r1.A3B()
            boolean r3 = X.DbT.A1b(r3)
            if (r3 == 0) goto L_0x0317
            X.Wyl r37 = X.C20774Wyl.A00
            r3 = 38
            X.Wyw r5 = new X.Wyw
            r5.<init>(r2, r3)
            X.Wyn r38 = X.C20776Wyn.A00
            X.VkX r2 = new X.VkX
            r35 = r2
            r36 = r21
            r39 = r5
            r40 = r10
            r35.<init>(r36, r37, r38, r39, r40)
            r7.add(r2)
        L_0x0317:
            com.instagram.api.schemas.ProductTileBannerMetadataDecoration r24 = X.W3C.A01(r12, r0)
            if (r46 == 0) goto L_0x0375
            r43 = r21
            r23 = r21
        L_0x0321:
            X.Wxd r37 = new X.Wxd
            r44 = r37
            r45 = r0
            r46 = r4
            r47 = r27
            r48 = r62
            r49 = r57
            r50 = r13
            r44.<init>(r45, r46, r47, r48, r49, r50)
            X.JG0 r3 = new X.JG0
            r3.<init>(r10, r4, r0)
            X.WyV r38 = X.C20758WyV.A00
            r0 = 12
            X.J6V r2 = new X.J6V
            r2.<init>((int) r13, (int) r0, (java.lang.Object) r4, (java.lang.Object) r1)
            X.WyW r40 = X.C20759WyW.A00
            X.Wz4 r44 = X.C20792Wz4.A00
            X.WSj r0 = new X.WSj
            r22 = r0
            r27 = r8
            r28 = r21
            r32 = r21
            r33 = r21
            r35 = r21
            r36 = r7
            r39 = r2
            r42 = r3
            r45 = r14
            r46 = r14
            r47 = r14
            r48 = r14
            r49 = r14
            r50 = r14
            r52 = r10
            r53 = r14
            r54 = r14
            r55 = r10
            r56 = r14
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            goto L_0x01f2
        L_0x0375:
            X.J8Y r43 = new X.J8Y
            r44 = r4
            r45 = r0
            r46 = r27
            r47 = r57
            r48 = r13
            r43.<init>(r44, r45, r46, r47, r48, r49)
            X.WBi r23 = new X.WBi
            r44 = r23
            r46 = r4
            r47 = r27
            r48 = r57
            r49 = r13
            r50 = r10
            r44.<init>(r45, r46, r47, r48, r49, r50)
            goto L_0x0321
        L_0x0396:
            r1 = r21
            goto L_0x0289
        L_0x039a:
            r46 = 0
            goto L_0x0056
        L_0x039e:
            java.lang.Object r3 = X.00k.A0J(r15)
            X.WSj r3 = (X.C19276WSj) r3
            if (r3 == 0) goto L_0x03ba
            java.lang.String r2 = java.lang.String.valueOf(r57)
            java.lang.Object r0 = X.00k.A0O(r15, r10)
            X.WSj r0 = (X.C19276WSj) r0
            X.WSQ r1 = new X.WSQ
            r1.<init>(r3, r0, r2)
            r0 = r20
            r0.add(r1)
        L_0x03ba:
            r57 = r18
            goto L_0x0019
        L_0x03be:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03c6:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VH0.A00(X.0iw, com.instagram.common.session.UserSession, X.UzB, X.X9a, X.X7x, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.util.Set):java.util.List");
    }
}
