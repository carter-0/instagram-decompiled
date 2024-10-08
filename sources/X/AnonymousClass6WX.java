package X;

/* renamed from: X.6WX  reason: invalid class name */
public abstract class AnonymousClass6WX {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r0 != 5) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        if (r5.equals(r0) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        r4 = r10.A02;
        r7 = new X.C389739q7(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if (r5.equals(r0) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b7, code lost:
        r4 = r10.A02;
        r7 = new X.C69057Ndu(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d1, code lost:
        if (r5 == com.instagram.api.schemas.TextReviewStatus.REJECTED) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        if (r5 == com.instagram.api.schemas.TextReviewStatus.REJECTED) goto L_0x00d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C255773uh r9, X.C316896mO r10, X.C317686nf r11) {
        /*
            java.util.List r1 = r9.A0b()
            X.3WT r0 = X.AnonymousClass3WT.PRODUCT
            X.3ui r3 = X.C289745e8.A00(r0, r1)
            if (r3 != 0) goto L_0x0014
            android.view.ViewStub r1 = r10.A04
            r0 = 8
            r1.setVisibility(r0)
        L_0x0013:
            return
        L_0x0014:
            com.instagram.user.model.Product r6 = r3.A0I()
            com.instagram.api.schemas.ProductReviewStatus r4 = r6.A05
            com.instagram.api.schemas.ProductReviewStatus r0 = com.instagram.api.schemas.ProductReviewStatus.APPROVED
            r2 = 1
            if (r4 != r0) goto L_0x0027
            com.instagram.api.schemas.TextReviewStatus r1 = r3.A07()
            com.instagram.api.schemas.TextReviewStatus r0 = com.instagram.api.schemas.TextReviewStatus.APPROVED
            if (r1 == r0) goto L_0x003f
        L_0x0027:
            android.content.Context r7 = r10.A02
            com.instagram.api.schemas.TextReviewStatus r5 = r3.A07()
            X.0qQ.A0B(r7, r2)
            if (r4 != 0) goto L_0x00e4
            r0 = -1
        L_0x0033:
            java.lang.String r1 = ""
            if (r0 == r2) goto L_0x00d4
            r4 = 4
            if (r0 == r4) goto L_0x00cc
            r4 = 5
            if (r0 == r4) goto L_0x00d8
        L_0x003d:
            r3.A1R = r1
        L_0x003f:
            java.lang.String r5 = r3.A0K()
            boolean r0 = r9.A1Y()
            if (r0 == 0) goto L_0x00bf
            com.instagram.common.session.UserSession r0 = r10.A05
            java.lang.String r1 = r0.A06
            com.instagram.user.model.User r0 = r6.A0B
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            boolean r0 = r1.equals(r0)
            r8 = r0 ^ 1
        L_0x0059:
            java.lang.String r1 = "product_item_text_sticker_vibrant"
            if (r5 == 0) goto L_0x0066
            int r4 = r5.hashCode()
            java.lang.String r0 = "product_item_tile_sticker_black_white"
            switch(r4) {
                case -1913155942: goto L_0x0078;
                case 584812081: goto L_0x008b;
                case 761099283: goto L_0x008e;
                case 1080478002: goto L_0x009e;
                case 1221159847: goto L_0x00af;
                case 1408761647: goto L_0x00ac;
                case 2091518821: goto L_0x0088;
                default: goto L_0x0066;
            }
        L_0x0066:
            android.content.Context r4 = r10.A02
            X.9q7 r7 = new X.9q7
            r7.<init>(r4, r1)
        L_0x006d:
            com.instagram.model.shopping.reels.ProductSticker r0 = r3.A0q
            r0.getClass()
            java.lang.String r0 = r0.A0D
            r1 = -1
            if (r0 == 0) goto L_0x00ee
            goto L_0x00ea
        L_0x0078:
            java.lang.String r0 = "product_item_visual_sticker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0066
            android.content.Context r4 = r10.A02
            X.Upx r7 = new X.Upx
            r7.<init>(r4, r8)
            goto L_0x006d
        L_0x0088:
            java.lang.String r0 = "product_item_text_sticker_subtle"
            goto L_0x0090
        L_0x008b:
            java.lang.String r0 = "product_item_text_sticker_black_white"
            goto L_0x0090
        L_0x008e:
            java.lang.String r0 = "product_item_text_sticker_media_primary_color"
        L_0x0090:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0066
            android.content.Context r4 = r10.A02
            X.9q7 r7 = new X.9q7
            r7.<init>(r4, r5)
            goto L_0x006d
        L_0x009e:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0066
            android.content.Context r4 = r10.A02
            X.9q6 r7 = new X.9q6
            r7.<init>(r4)
            goto L_0x006d
        L_0x00ac:
            java.lang.String r0 = "product_item_list_cell_sticker_black_white"
            goto L_0x00b1
        L_0x00af:
            java.lang.String r0 = "product_item_list_cell_sticker_subtle"
        L_0x00b1:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0066
            android.content.Context r4 = r10.A02
            X.Ndu r7 = new X.Ndu
            r7.<init>(r4, r5)
            goto L_0x006d
        L_0x00bf:
            X.1Xj r1 = r9.A0b
            if (r1 == 0) goto L_0x00ca
            com.instagram.common.session.UserSession r0 = r10.A05
            boolean r8 = r1.A6X(r0)
            goto L_0x0059
        L_0x00ca:
            r8 = 0
            goto L_0x0059
        L_0x00cc:
            com.instagram.api.schemas.TextReviewStatus r1 = com.instagram.api.schemas.TextReviewStatus.REJECTED
            r0 = 2131969853(0x7f13473d, float:1.957664E38)
            if (r5 != r1) goto L_0x00db
            goto L_0x00d8
        L_0x00d4:
            com.instagram.api.schemas.TextReviewStatus r0 = com.instagram.api.schemas.TextReviewStatus.REJECTED
            if (r5 != r0) goto L_0x003d
        L_0x00d8:
            r0 = 2131969856(0x7f134740, float:1.9576647E38)
        L_0x00db:
            java.lang.String r1 = r7.getString(r0)
            X.0qQ.A0A(r1)
            goto L_0x003d
        L_0x00e4:
            int r0 = r4.ordinal()
            goto L_0x0033
        L_0x00ea:
            int r1 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x00ee }
        L_0x00ee:
            java.lang.String r0 = r3.A0L()
            r5 = 0
            r7.A05(r6, r0, r1, r5)
            boolean r0 = r7 instanceof X.C389739q7
            if (r0 == 0) goto L_0x0104
            r0 = r7
            X.9q7 r0 = (X.C389739q7) r0
            X.9Wl r0 = r0.A04
            r0.A02 = r1
            r0.invalidateSelf()
        L_0x0104:
            boolean r0 = r7 instanceof X.B2E
            if (r0 == 0) goto L_0x0119
            r1 = r7
            X.B2E r1 = (X.B2E) r1
            com.instagram.model.shopping.reels.ProductSticker r0 = r3.A0q
            r0.getClass()
            java.lang.String r0 = r0.A0B
            X.8bb r0 = X.C358878bc.A00(r0)
            r1.setTextFormat(r0)
        L_0x0119:
            android.view.View r1 = X.C316896mO.A00(r10)
            r0 = 2131438317(0x7f0b2aed, float:1.8498557E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r7)
            android.view.View r0 = X.C316896mO.A00(r10)
            r0.setFocusable(r2)
            android.view.View r2 = X.C316896mO.A00(r10)
            r1 = 2131973828(0x7f1356c4, float:1.9584703E38)
            java.lang.String r0 = r6.A0J
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r4.getString(r1, r0)
            r2.setContentDescription(r0)
            android.view.View r0 = X.C316896mO.A00(r10)
            r0.setVisibility(r5)
            android.view.View r0 = X.C316896mO.A00(r10)
            r0.requestLayout()
            android.view.View r1 = X.C316896mO.A00(r10)
            X.Ij9 r0 = new X.Ij9
            r0.<init>(r9, r3, r10, r11)
            X.0nA.A0q(r1, r0)
            boolean r0 = r9.CcK()
            if (r0 != 0) goto L_0x0013
            com.instagram.common.session.UserSession r3 = r10.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312187553842153(0x8101be002a03e9, double:3.027311854268273E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0013
            X.3yT r0 = r10.A00
            if (r0 != 0) goto L_0x017e
            X.3yT r0 = new X.3yT
            r0.<init>(r3)
            r10.A00 = r0
        L_0x017e:
            r0.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WX.A00(X.3uh, X.6mO, X.6nf):void");
    }
}
