package X;

/* renamed from: X.NsJ  reason: case insensitive filesystem */
public abstract class C69796NsJ {
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0186, code lost:
        if (r3.size() != r7.size()) goto L_0x0188;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r29, X.AnonymousClass6Tm r30) {
        /*
            r0 = 0
            r12 = 1
            r4 = r30
            java.lang.Object r8 = r4.A03(r0)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r8, r2)
            java.lang.String r8 = (java.lang.String) r8
            java.util.List r3 = r4.A00
            java.lang.Object r7 = r3.get(r12)
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r4.A00()
            X.0qQ.A0C(r6, r2)
            java.lang.String r6 = (java.lang.String) r6
            r1 = 3
            java.lang.Object r9 = X.DbT.A0q(r4, r2, r1)
            java.lang.String r9 = (java.lang.String) r9
            r2 = 4
            java.lang.Object r5 = r3.get(r2)
            java.util.List r5 = (java.util.List) r5
            r2 = 5
            java.lang.Object r4 = r3.get(r2)
            java.util.List r4 = (java.util.List) r4
            r2 = 6
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            X.0lg r2 = X.C308206Td.A0B(r29)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r15 = 0
            if (r7 == 0) goto L_0x020b
            boolean r10 = r7.isEmpty()
            if (r10 != 0) goto L_0x020b
            int r10 = r7.size()
            if (r10 != r12) goto L_0x015f
            java.lang.String r7 = X.AnonymousClass7TE.A19(r7, r0)
            double r10 = java.lang.Double.parseDouble(r7)
            long r13 = (long) r10
            android.os.Parcelable$Creator r7 = com.instagram.user.model.User.CREATOR
            X.0eE r11 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r7 = r11.A01(r2)
            com.instagram.common.typedurl.ImageUrl r10 = r7.Bh3()
            java.lang.String r7 = X.DbU.A0n(r2, r11)
            com.instagram.user.model.User r18 = X.1aC.A03(r10, r8, r7)
            if (r5 == 0) goto L_0x015c
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x015c
            java.lang.Object r7 = r5.get(r0)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L_0x015c
            int r7 = r7.length()
            if (r7 == 0) goto L_0x015c
            com.instagram.model.mediasize.ImageInfoImpl r8 = new com.instagram.model.mediasize.ImageInfoImpl
            r19 = r8
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r19.<init>(r20, r21, r22, r23, r24)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.lang.Object r10 = r5.get(r0)
            X.0qQ.A0A(r10)
            java.lang.String r10 = (java.lang.String) r10
            com.instagram.model.mediasize.ExtendedImageUrl r5 = new com.instagram.model.mediasize.ExtendedImageUrl
            r5.<init>(r10, r12, r12)
            r7.add(r5)
            com.instagram.model.mediasize.ImageInfo r5 = X.1iI.A06(r8, r7)
            com.instagram.model.mediasize.ImageInfoImpl r7 = r5.FEa()
            com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl r5 = new com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl
            r5.<init>(r7, r15)
        L_0x00b7:
            java.lang.String r28 = ""
            if (r4 == 0) goto L_0x0158
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x0158
            java.lang.Object r7 = r4.get(r0)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L_0x0158
            int r7 = r7.length()
            if (r7 == 0) goto L_0x0158
            java.lang.String r29 = X.AnonymousClass7TE.A19(r4, r0)
        L_0x00d3:
            if (r3 == 0) goto L_0x0155
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0155
            java.lang.Object r4 = r3.get(r0)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0155
            int r4 = r4.length()
            if (r4 == 0) goto L_0x0155
            java.lang.String r25 = X.AnonymousClass7TE.A19(r3, r0)
            java.lang.String r28 = X.AnonymousClass7TE.A19(r3, r0)
        L_0x00f1:
            java.lang.String r30 = java.lang.String.valueOf(r13)
            r16 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r23 = r15
            r24 = r15
            r26 = r15
            r27 = r15
            r17 = r5
            com.instagram.user.model.Product r3 = X.W2E.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.AnonymousClass7TF.A1B(r2, r0, r6)
            X.0qQ.A0B(r9, r1)
            com.instagram.model.direct.DirectThreadKey r10 = new com.instagram.model.direct.DirectThreadKey
            r10.<init>(r6, r15)
            X.7Zi r1 = X.C333527Zh.A00(r2)
            com.instagram.common.session.UserSession r4 = r1.A03
            java.lang.Class<X.1f3> r6 = X.AnonymousClass1f3.class
            X.ODs r5 = X.OQO.A00(r4, r10)
            r7 = r9
            r8 = r15
            r9 = r0
            X.MaY r9 = X.C66669Mac.A04(r4, r5, r6, r7, r8, r9)
            java.lang.Long r11 = X.OQO.A01(r4, r10)
            long r12 = X.AnonymousClass7TG.A0H()
            X.1f3 r8 = new X.1f3
            r8.<init>(r9, r10, r11, r12)
            X.0qQ.A0B(r3, r0)
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r3.A01
            X.JwG r0 = new X.JwG
            r0.<init>((com.instagram.user.model.ProductDetailsProductItemDict) r1)
            r8.A00 = r0
            X.C66580MXl.A1P(r4, r8)
            X.2FW r2 = X.2FW.A1Y
            java.lang.String r1 = r8.A06()
            X.MaY r0 = r8.A02
            boolean r0 = r0.A09
            X.C3265677h.A0g(r4, r10, r2, r1, r0)
            return r15
        L_0x0155:
            r25 = r28
            goto L_0x00f1
        L_0x0158:
            r29 = r28
            goto L_0x00d3
        L_0x015c:
            r5 = r15
            goto L_0x00b7
        L_0x015f:
            if (r5 == 0) goto L_0x016b
            int r11 = r5.size()
            int r10 = r7.size()
            if (r11 == r10) goto L_0x016c
        L_0x016b:
            r5 = r15
        L_0x016c:
            if (r4 == 0) goto L_0x0178
            int r11 = r4.size()
            int r10 = r7.size()
            if (r11 == r10) goto L_0x0179
        L_0x0178:
            r4 = r15
        L_0x0179:
            if (r5 == 0) goto L_0x0188
            X.0qQ.A0A(r3)
            int r11 = r3.size()
            int r10 = r7.size()
            if (r11 == r10) goto L_0x0189
        L_0x0188:
            r3 = r15
        L_0x0189:
            X.AnonymousClass7TF.A1B(r2, r0, r8)
            X.AnonymousClass7TF.A1D(r6, r1, r9)
            com.instagram.model.direct.DirectThreadKey r1 = new com.instagram.model.direct.DirectThreadKey
            r1.<init>(r6, r15)
            X.7Zi r2 = X.C333527Zh.A00(r2)
            com.instagram.common.session.UserSession r2 = r2.A03
            java.lang.Class<X.1f3> r11 = X.AnonymousClass1f3.class
            X.ODs r10 = X.OQO.A00(r2, r1)
            r12 = r9
            r13 = r15
            r14 = r0
            r9 = r2
            X.MaY r10 = X.C66669Mac.A04(r9, r10, r11, r12, r13, r14)
            java.lang.Long r12 = X.OQO.A01(r2, r1)
            long r13 = X.AnonymousClass7TG.A0H()
            X.1fF r6 = new X.1fF
            r11 = r1
            r9 = r6
            r9.<init>(r10, r11, r12, r13)
            if (r5 == 0) goto L_0x01e6
            if (r4 == 0) goto L_0x01e6
            if (r3 == 0) goto L_0x01e6
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r6.A01 = r0
            r13 = 0
        L_0x01c4:
            int r0 = r7.size()
            if (r13 >= r0) goto L_0x01f6
            java.util.List r12 = r6.A01
            java.lang.String r11 = X.AnonymousClass7TE.A19(r7, r13)
            java.lang.String r10 = X.AnonymousClass7TE.A19(r5, r13)
            java.lang.String r9 = X.AnonymousClass7TE.A19(r4, r13)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r3, r13)
            X.3tC r0 = X.C71152OeO.A0K(r11, r8, r10, r9, r0)
            r12.add(r0)
            int r13 = r13 + 1
            goto L_0x01c4
        L_0x01e6:
            int r3 = r7.size()
            java.lang.String r0 = ""
            X.3tC r0 = X.C71152OeO.A0K(r0, r0, r0, r0, r0)
            java.util.List r0 = java.util.Collections.nCopies(r3, r0)
            r6.A01 = r0
        L_0x01f6:
            r6.A02 = r7
            r6.A00 = r8
            X.C66580MXl.A1P(r2, r6)
            X.2FW r4 = X.2FW.A0z
            java.lang.String r3 = r6.A06()
            X.MaY r0 = r6.A02
            boolean r0 = r0.A09
            X.C3265677h.A0g(r2, r1, r4, r3, r0)
            return r15
        L_0x020b:
            java.lang.String r1 = "IgBloksCustomNavigationExtensions"
            java.lang.String r0 = "Null or empty product list"
            X.1Kn.A02(r1, r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69796NsJ.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
