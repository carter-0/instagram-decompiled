package X;

/* renamed from: X.VHs  reason: case insensitive filesystem */
public abstract class C17096VHs {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ae, code lost:
        if (r0 == null) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r34, X.AnonymousClass0iw r35, com.instagram.common.session.UserSession r36, X.XC8 r37, X.C15075UNs r38, X.UE5 r39) {
        /*
            r9 = 0
            r13 = 1
            r10 = r34
            r25 = r35
            r24 = r37
            r1 = r25
            r0 = r24
            X.DbZ.A0t(r13, r10, r1, r0)
            r1 = 4
            r23 = r36
            r0 = r23
            X.0qQ.A0B(r0, r1)
            r6 = r38
            X.UKw r8 = r6.A00
            com.instagram.model.shopping.productfeed.ProductFeedItem r12 = r8.A04
            r3 = r39
            if (r12 != 0) goto L_0x0027
            android.view.View r0 = r3.A03
            r0.setVisibility(r1)
        L_0x0026:
            return
        L_0x0027:
            android.view.View r7 = r3.A03
            r7.setVisibility(r9)
            X.3oV r2 = r3.A05
            r1 = 8
            r2.setVisibility(r1)
            X.3oV r5 = r3.A06
            r5.setVisibility(r1)
            X.3oV r0 = r3.A04
            r0.setVisibility(r1)
            com.instagram.model.shopping.productfeed.MultiProductComponent r4 = r12.A01
            if (r4 == 0) goto L_0x00ce
            X.UEO r5 = r3.A00
            if (r5 != 0) goto L_0x0050
            android.view.View r0 = r0.getView()
            X.UEO r5 = new X.UEO
            r5.<init>(r0)
            r3.A00 = r5
        L_0x0050:
            X.UzB r1 = r8.A05
            X.UzB r0 = X.C16675UzB.SHOP_HOME
            boolean r12 = X.AnonymousClass7TF.A1W(r1, r0)
            int r11 = r8.A01
            int r6 = r8.A00
            com.instagram.model.shopping.productfeed.ProductFeedResponse r0 = r4.A03
            java.util.List r0 = r0.A03
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            X.0qQ.A0A(r0)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x006f:
            boolean r1 = r2.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r2.next()
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            com.instagram.user.model.Product r1 = r1.A02()
            if (r1 == 0) goto L_0x0084
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r1.A0A
        L_0x0084:
            r3.add(r0)
            goto L_0x006f
        L_0x0088:
            java.lang.String r2 = r4.A07
            java.lang.String r1 = r4.A08
            X.UzB r0 = r4.A04
            java.lang.String r18 = r0.toString()
            java.lang.String r19 = r4.A00()
            X.X9B r0 = r4.Aif()
            java.lang.String r20 = r0.Awg()
            if (r12 == 0) goto L_0x00b0
            X.Uz7 r0 = X.C16671Uz7.GRID_WITH_SINGLE_IMAGE_FALLBACK
            java.lang.String r12 = r0.toString()
            java.util.Map r0 = X.C16671Uz7.A01
            java.lang.Object r0 = r0.get(r12)
            X.Uz7 r0 = (X.C16671Uz7) r0
            if (r0 != 0) goto L_0x00b5
        L_0x00b0:
            X.Uz7 r0 = r4.A02
            X.0qQ.A07(r0)
        L_0x00b5:
            r12 = r10
            r13 = r25
            r14 = r0
            r15 = r24
            r16 = r2
            r17 = r1
            r21 = r3
            r22 = r11
            r23 = r6
            X.WSC r0 = X.C17094VHq.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.C18270Vok.A01(r5, r0, r9)
            goto L_0x0151
        L_0x00ce:
            com.instagram.model.shopping.productfeed.ProductTile r1 = r12.A02
            if (r1 == 0) goto L_0x0184
            com.instagram.user.model.Product r0 = r1.A07
            if (r0 != 0) goto L_0x00dc
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.C18768W0o.A01(r1)
            if (r0 == 0) goto L_0x0184
        L_0x00dc:
            X.VWz r0 = r6.A01
            X.Vj5 r11 = r0.A00
            if (r11 == 0) goto L_0x01b0
            com.instagram.api.schemas.ProductCardSubtitleType r6 = r8.A02
            if (r6 != 0) goto L_0x00e7
            r6 = 0
        L_0x00e7:
            boolean r1 = r8.A0D
            X.UEM r5 = r3.A01
            if (r5 != 0) goto L_0x00f8
            android.view.View r0 = r2.getView()
            X.UEM r5 = new X.UEM
            r5.<init>(r0, r1)
            r3.A01 = r5
        L_0x00f8:
            int r16 = X.JTR.A05(r10)
            java.lang.String r0 = r8.A0A
            r22 = r0
            X.0xF r0 = r8.A03
            r20 = r0
            java.lang.String r0 = r8.A08
            r19 = r0
            int r0 = r8.A01
            r18 = r0
            int r15 = r8.A00
            X.Uw7 r14 = r8.A06
            boolean r4 = r8.A0B
            boolean r3 = r8.A0C
            boolean r2 = r8.A0E
            boolean r1 = r8.A0F
            java.lang.Integer r0 = r8.A07
            r17 = 0
            java.lang.Integer r27 = java.lang.Integer.valueOf(r16)
            r21 = r17
            r26 = r0
            r28 = r22
            r29 = r19
            r30 = r18
            r31 = r15
            r32 = r4
            r33 = r3
            r34 = r2
            r35 = r1
            r36 = r9
            r37 = r13
            r38 = r9
            r39 = r9
            r16 = r6
            r18 = r25
            r19 = r20
            r20 = r23
            r22 = r11
            r23 = r12
            r25 = r14
            X.WSj r0 = X.W3C.A03(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.C17099VHv.A00(r5, r0)
        L_0x0151:
            boolean r0 = r8.A0D
            if (r0 != 0) goto L_0x0026
            android.content.res.Resources r0 = r10.getResources()
            r3 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r2 = r0.getDimensionPixelOffset(r3)
            android.content.res.Resources r0 = r10.getResources()
            int r1 = r0.getDimensionPixelOffset(r3)
            int r0 = r8.A00
            if (r0 != 0) goto L_0x017d
            X.0nA.A0d(r7, r2)
            X.0nA.A0U(r7, r1)
        L_0x0172:
            int r0 = X.AnonymousClass7TF.A02(r10, r3)
            X.0nA.A0e(r7, r0)
            X.0nA.A0T(r7, r0)
            return
        L_0x017d:
            X.0nA.A0d(r7, r1)
            X.0nA.A0U(r7, r2)
            goto L_0x0172
        L_0x0184:
            com.instagram.user.model.UnavailableProductImpl r0 = r12.A05
            if (r0 == 0) goto L_0x0151
            X.UDt r2 = r3.A02
            if (r2 != 0) goto L_0x0197
            android.view.View r0 = r5.getView()
            X.UDt r2 = new X.UDt
            r2.<init>(r0)
            r3.A02 = r2
        L_0x0197:
            int r1 = r8.A01
            int r0 = r8.A00
            r14 = r10
            r15 = r25
            r16 = r12
            r17 = r24
            r18 = r1
            r19 = r0
            r20 = r13
            X.WSR r0 = X.C17100VHw.A00(r14, r15, r16, r17, r18, r19, r20)
            X.C18387Vqn.A00(r2, r0)
            goto L_0x0151
        L_0x01b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17096VHs.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.XC8, X.UNs, X.UE5):void");
    }
}
