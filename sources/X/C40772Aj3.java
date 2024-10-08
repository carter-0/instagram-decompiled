package X;

/* renamed from: X.Aj3  reason: case insensitive filesystem */
public final /* synthetic */ class C40772Aj3 implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;

    public /* synthetic */ C40772Aj3(AnonymousClass8BA r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0086, code lost:
        r2.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cd, code lost:
        r0 = X.C394049xS.A00(r16, r17, r18, r19, r20, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00dc, code lost:
        r0 = X.C394049xS.A00(r11, r12, r13, r14, 1, r16);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            X.8BA r1 = r0.A00
            com.instagram.shopping.model.share.ShopShareInfo r13 = r1.A0M
            r13.getClass()
            android.content.Context r11 = X.AnonymousClass7TE.A0T(r1)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r1.A0z
            int r0 = X.AnonymousClass81W.A00(r0)
            float r14 = (float) r0
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            float r14 = r14 * r10
            int r3 = java.lang.Math.round(r14)
            java.util.List r0 = r13.A07
            com.instagram.common.typedurl.ImageUrl r5 = r13.A00
            if (r0 != 0) goto L_0x00f5
            r4 = 0
        L_0x0023:
            X.6nz r0 = X.C317876nz.A0a
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r0 = 9
            if (r4 < r0) goto L_0x00e1
            java.lang.String r6 = "seller_collection_reshare_3x3_product_grid_sticker"
            float r8 = (float) r3
            r7 = r6
            r9 = r8
            X.6o8 r0 = X.C317966o8.A00(r5, r6, r7, r8, r9, r10)
            r2.add(r0)
        L_0x0039:
            java.lang.String r6 = "seller_collection_reshare_2x3_product_grid_sticker"
            float r8 = (float) r3
            r7 = r6
            r9 = r8
            X.6o8 r0 = X.C317966o8.A00(r5, r6, r7, r8, r9, r10)
            r2.add(r0)
        L_0x0045:
            java.lang.String r6 = "seller_collection_reshare_1x3_product_grid_sticker"
        L_0x0047:
            float r8 = (float) r3
            r7 = r6
            r9 = r8
            X.6o8 r0 = X.C317966o8.A00(r5, r6, r7, r8, r9, r10)
            r2.add(r0)
        L_0x0051:
            X.6oG r3 = X.C318046oG.SHOP_SHARE
            java.lang.String r0 = "storefront_reshare_sticker"
            X.6nz r4 = new X.6nz
            r4.<init>(r3, r0, r2)
            com.instagram.common.session.UserSession r12 = r1.A0v
            r15 = 1
            X.0qQ.A0B(r12, r15)
            r3 = 2
            X.0qQ.A0B(r11, r3)
            r21 = 3
            java.util.List r0 = r4.A0O
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0070:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r6.next()
            X.6o8 r0 = (X.C317966o8) r0
            java.lang.String r5 = r0.A0S
            int r0 = r5.hashCode()
            switch(r0) {
                case -1432864483: goto L_0x00d2;
                case -1348023271: goto L_0x00bb;
                case -1281016518: goto L_0x00a8;
                case -1214009765: goto L_0x0095;
                case 824046524: goto L_0x008a;
                default: goto L_0x0085;
            }
        L_0x0085:
            r0 = 0
        L_0x0086:
            r2.add(r0)
            goto L_0x0070
        L_0x008a:
            java.lang.String r0 = "seller_collection_reshare_1x2_product_grid_sticker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0085
            r16 = r3
            goto L_0x00dc
        L_0x0095:
            java.lang.String r0 = "seller_collection_reshare_1x3_product_grid_sticker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0085
            r16 = r11
            r17 = r12
            r18 = r13
            r19 = r14
            r20 = r15
            goto L_0x00cd
        L_0x00a8:
            java.lang.String r0 = "seller_collection_reshare_2x3_product_grid_sticker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0085
            r16 = r11
            r17 = r12
            r18 = r13
            r19 = r14
            r20 = r3
            goto L_0x00cd
        L_0x00bb:
            java.lang.String r0 = "seller_collection_reshare_3x3_product_grid_sticker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0085
            r16 = r11
            r17 = r12
            r18 = r13
            r19 = r14
            r20 = r21
        L_0x00cd:
            X.7w8 r0 = X.C394049xS.A00(r16, r17, r18, r19, r20, r21)
            goto L_0x0086
        L_0x00d2:
            java.lang.String r0 = "seller_collection_reshare_1x1_product_grid_sticker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0085
            r16 = r15
        L_0x00dc:
            X.7w8 r0 = X.C394049xS.A00(r11, r12, r13, r14, r15, r16)
            goto L_0x0086
        L_0x00e1:
            r0 = 6
            if (r4 >= r0) goto L_0x0039
            r0 = 3
            if (r4 >= r0) goto L_0x0045
            r0 = 2
            if (r4 != r0) goto L_0x00ee
            java.lang.String r6 = "seller_collection_reshare_1x2_product_grid_sticker"
            goto L_0x0047
        L_0x00ee:
            r0 = 1
            if (r4 != r0) goto L_0x0051
            java.lang.String r6 = "seller_collection_reshare_1x1_product_grid_sticker"
            goto L_0x0047
        L_0x00f5:
            int r4 = r0.size()
            goto L_0x0023
        L_0x00fb:
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x0111
            X.7w8 r3 = new X.7w8
            r3.<init>(r11, r12, r2)
            X.ADo r2 = X.C39890ADo.A00()
            r0 = 0
            r2.A0Q = r0
            X.AnonymousClass8BG.A00(r3, r4, r1, r2)
            return
        L_0x0111:
            java.lang.String r0 = "invalid static sticker configuration"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40772Aj3.run():void");
    }
}
