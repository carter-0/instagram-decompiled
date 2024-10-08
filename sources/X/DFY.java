package X;

public final class DFY implements AnonymousClass2Kv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ OGZ A02;
    public final /* synthetic */ C71002OVz A03;
    public final /* synthetic */ boolean A04;

    public DFY(OGZ ogz, C71002OVz oVz, int i, int i2, boolean z) {
        this.A03 = oVz;
        this.A02 = ogz;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        if (r13 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0211, code lost:
        if (r11 != null) goto L_0x01cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r26) {
        /*
            r25 = this;
            r2 = r25
            X.OVz r0 = r2.A03
            X.OGZ r3 = r2.A02
            X.OVz r1 = r3.A00
            boolean r1 = X.0qQ.A0K(r0, r1)
            if (r1 == 0) goto L_0x021b
            int r15 = r2.A01
            int r14 = r2.A00
            boolean r13 = r2.A04
            if (r26 == 0) goto L_0x0214
            X.3lr r6 = X.C41845B3m.A0U(r26)
            if (r6 == 0) goto L_0x0214
            java.lang.Class<X.Bhm> r5 = X.C42751Bhm.class
            r1 = 0
            java.lang.String r4 = "xfb_saved_stickers_for_eimu(search_query:$search_query)"
            r2 = 917081230(0x36a98c8e, float:5.052955E-6)
            com.google.common.collect.ImmutableList r4 = r6.getRequiredCompactedTreeListField(r1, r4, r5, r2)
            if (r4 == 0) goto L_0x0214
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r4.iterator()
        L_0x0032:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x0216
            java.lang.Object r8 = r16.next()
            X.3lr r8 = (X.C250663lr) r8
            java.lang.Class<X.Bhl> r7 = X.C42750Bhl.class
            java.lang.String r6 = "XFBSticker"
            r5 = -371009357(0xffffffffe9e2d8b3, float:-3.428007E25)
            X.3lr r4 = r8.reinterpretIfFulfillsType(r1, r6, r7, r5)
            if (r4 == 0) goto L_0x0087
            X.3lr r6 = r8.reinterpretIfFulfillsType(r1, r6, r7, r5)
            r4 = 0
            if (r6 == 0) goto L_0x005a
            java.lang.String r5 = "strong_id__"
            java.lang.String r7 = r6.A08(r5)
            if (r7 != 0) goto L_0x005c
        L_0x005a:
            java.lang.String r7 = ""
        L_0x005c:
            java.lang.String r8 = r0.A00
            if (r6 == 0) goto L_0x0066
            java.lang.String r4 = "url"
            java.lang.String r4 = r6.A09(r4)
        L_0x0066:
            com.instagram.common.typedurl.SimpleImageUrl r6 = new com.instagram.common.typedurl.SimpleImageUrl
            r6.<init>(r4)
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = r9
            r11 = r9
            X.6o8 r7 = X.C317966o8.A00(r6, r7, r8, r9, r10, r11)
            java.lang.String r6 = r0.A01
            X.0qQ.A06(r6)
            r5 = 7
            X.JwF r4 = new X.JwF
            r4.<init>((X.C317966o8) r7, (java.lang.String) r6, (int) r5)
            X.N41 r7 = new X.N41
            r7.<init>(r4, r1)
        L_0x0083:
            r2.add(r7)
            goto L_0x0032
        L_0x0087:
            java.lang.Class<X.Bhk> r7 = X.C42749Bhk.class
            r9 = 2
            java.lang.String r6 = "XFBIGStoreStickerLoggedOutView"
            r5 = 1600708447(0x5f68df5f, float:1.6780235E19)
            X.3lr r4 = r8.reinterpretIfFulfillsType(r9, r6, r7, r5)
            if (r4 == 0) goto L_0x0117
            X.3lr r10 = r8.reinterpretIfFulfillsType(r9, r6, r7, r5)
            r23 = 0
            if (r10 == 0) goto L_0x0032
            java.lang.Class<X.Bhj> r7 = X.C42748Bhj.class
            r6 = 5
            java.lang.String r5 = "sticker_pack"
            r4 = -1267391759(0xffffffffb47522f1, float:-2.2830115E-7)
            X.3lr r5 = r10.getOptionalTreeField(r6, r5, r7, r4)
            if (r5 == 0) goto L_0x0032
            java.lang.String r4 = "strong_id__"
            java.lang.String r21 = r5.getOptionalStringField(r1, r4)
            if (r21 == 0) goto L_0x0032
            java.lang.String r20 = r10.A08(r4)
            if (r20 == 0) goto L_0x0032
            java.lang.String r4 = "preview_image(height:$sticker_full_size,width:$sticker_full_size)"
            java.lang.String r12 = r10.A0B(r4)
            r11 = 8
            java.lang.String r8 = "original_aspect_ratio"
            double r4 = r10.getCoercedDoubleField(r11, r8)
            java.lang.Double r7 = java.lang.Double.valueOf(r4)
            r6 = 7
            java.lang.String r5 = "is_animated"
            boolean r4 = r10.getCoercedBooleanField(r6, r5)
            com.instagram.model.direct.stickerstore.TypedImageUrl r19 = X.C45892D9v.A02(r7, r12, r14, r4)
            if (r19 == 0) goto L_0x0032
            boolean r4 = r10.getCoercedBooleanField(r6, r5)
            if (r4 == 0) goto L_0x00e1
            r6 = 1
            if (r13 == 0) goto L_0x00e2
        L_0x00e1:
            r6 = 0
        L_0x00e2:
            r4 = 3
            java.lang.String r5 = "preview_image(force_static_image:$sticker_preview_force_static_image,height:$sticker_preview_size,width:$sticker_preview_size)"
            java.lang.String r5 = r10.getOptionalStringField(r4, r5)
            double r7 = r10.getCoercedDoubleField(r11, r8)
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            com.instagram.model.direct.stickerstore.TypedImageUrl r18 = X.C45892D9v.A02(r7, r5, r15, r6)
            if (r18 == 0) goto L_0x0032
            java.lang.String r5 = "accessibility_label"
            java.lang.String r22 = r10.getOptionalStringField(r9, r5)
            com.instagram.model.direct.stickerstore.DirectStoreSticker r6 = new com.instagram.model.direct.stickerstore.DirectStoreSticker
            r17 = r6
            r24 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r7 = r0.A01
            X.0qQ.A06(r7)
            X.JwF r5 = new X.JwF
            r5.<init>((com.instagram.model.direct.stickerstore.DirectStoreSticker) r6, (java.lang.String) r7)
            X.N41 r7 = new X.N41
            r7.<init>(r5, r4)
            goto L_0x0083
        L_0x0117:
            java.lang.Class<X.Bhf> r10 = X.C42744Bhf.class
            r6 = 4
            java.lang.String r7 = "XFBCutoutStickerViewForFavourites"
            r5 = 610873401(0x24693039, float:5.0564667E-17)
            X.3lr r4 = r8.reinterpretIfFulfillsType(r6, r7, r10, r5)
            if (r4 == 0) goto L_0x0181
            X.3lr r5 = r8.reinterpretIfFulfillsType(r6, r7, r10, r5)
            if (r5 == 0) goto L_0x0032
            java.lang.String r4 = "sticker_id"
            java.lang.String r8 = r5.A09(r4)
            if (r8 == 0) goto L_0x0032
            java.lang.String r9 = r0.A00
            java.lang.String r4 = "image_url"
            java.lang.String r4 = r5.getOptionalStringField(r6, r4)
            com.instagram.common.typedurl.SimpleImageUrl r7 = new com.instagram.common.typedurl.SimpleImageUrl
            r7.<init>(r4)
            r6 = 5
            java.lang.String r4 = "image_width"
            int r4 = r5.getCoercedIntField(r6, r4)
            float r10 = (float) r4
            r6 = 3
            java.lang.String r4 = "image_height"
            int r4 = r5.getCoercedIntField(r6, r4)
            float r11 = (float) r4
            r12 = 1065353216(0x3f800000, float:1.0)
            X.6o8 r7 = X.C317966o8.A00(r7, r8, r9, r10, r11, r12)
            r6 = 6
            java.lang.String r4 = "type"
            java.lang.String r5 = r5.getOptionalStringField(r6, r4)
            if (r5 == 0) goto L_0x017e
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r4 = r5.toLowerCase(r4)
            X.0qQ.A07(r4)
        L_0x0168:
            r7.A0h = r4
            java.lang.String r5 = r0.A01
            X.0qQ.A06(r5)
            r4 = 8
            X.JwF r6 = new X.JwF
            r6.<init>((X.C317966o8) r7, (java.lang.String) r5, (int) r4)
            r4 = 1
        L_0x0177:
            X.N41 r7 = new X.N41
            r7.<init>(r6, r4)
            goto L_0x0083
        L_0x017e:
            java.lang.String r4 = "image"
            goto L_0x0168
        L_0x0181:
            java.lang.Class<X.Bhh> r7 = X.C42746Bhh.class
            r6 = 1
            java.lang.String r5 = "XFBGiphySticker"
            r4 = -1719944876(0xffffffff997bb954, float:-1.30138226E-23)
            X.3lr r11 = r8.reinterpretIfFulfillsType(r6, r5, r7, r4)
            r22 = 0
            if (r11 == 0) goto L_0x0197
            java.lang.String r4 = "giphy_id"
            java.lang.String r22 = r11.getOptionalStringField(r6, r4)
        L_0x0197:
            java.lang.String r7 = ""
            if (r22 != 0) goto L_0x019d
            r22 = r7
        L_0x019d:
            if (r11 == 0) goto L_0x01b6
            java.lang.Class<X.Bhg> r8 = X.C42745Bhg.class
            r6 = 3
            java.lang.String r5 = "giphy_original_image"
            r4 = -218214485(0xfffffffff2fe4fab, float:-1.00743047E31)
            X.3lr r5 = r11.getOptionalTreeField(r6, r5, r8, r4)
            if (r5 == 0) goto L_0x01b6
            java.lang.String r4 = "url"
            java.lang.String r4 = r5.getOptionalStringField(r1, r4)
            if (r4 == 0) goto L_0x01b6
            r7 = r4
        L_0x01b6:
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x020f
            java.lang.Class<X.Bhg> r8 = X.C42745Bhg.class
            r6 = 3
            java.lang.String r5 = "giphy_original_image"
            r4 = -218214485(0xfffffffff2fe4fab, float:-1.00743047E31)
            X.3lr r5 = r11.getOptionalTreeField(r6, r5, r8, r4)
            if (r5 == 0) goto L_0x020f
            java.lang.String r4 = "width"
            int r4 = r5.getCoercedIntField(r9, r4)
            float r8 = (float) r4
        L_0x01cf:
            java.lang.Class<X.Bhg> r9 = X.C42745Bhg.class
            r6 = 3
            java.lang.String r5 = "giphy_original_image"
            r4 = -218214485(0xfffffffff2fe4fab, float:-1.00743047E31)
            X.3lr r6 = r11.getOptionalTreeField(r6, r5, r9, r4)
            if (r6 == 0) goto L_0x01e5
            r5 = 1
            java.lang.String r4 = "height"
            int r4 = r6.getCoercedIntField(r5, r4)
            float r10 = (float) r4
        L_0x01e5:
            com.instagram.model.mediasize.GifUrlImpl r5 = new com.instagram.model.mediasize.GifUrlImpl
            r5.<init>(r7, r8, r10)
            r18 = 0
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r1)
            r23 = 1
            com.instagram.model.direct.gifs.DirectAnimatedMedia r4 = new com.instagram.model.direct.gifs.DirectAnimatedMedia
            r17 = r4
            r19 = r5
            r21 = r20
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.N2b r5 = new X.N2b
            r5.<init>(r4, r4, r1)
            java.lang.String r4 = r0.A00
            X.0qQ.A06(r4)
            X.JwF r6 = new X.JwF
            r6.<init>((X.C68137N2b) r5, (java.lang.String) r4)
            r4 = 2
            goto L_0x0177
        L_0x020f:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x01e5
            goto L_0x01cf
        L_0x0214:
            X.0sn r2 = X.0sn.A00
        L_0x0216:
            X.0sL r1 = r3.A04
            r1.invoke(r2, r0)
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFY.invoke(X.3JD):void");
    }
}
