package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class W3C {
    public static final W3C A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.api.schemas.ProductTileBannerMetadataDecoration A01(com.instagram.common.session.UserSession r7, com.instagram.model.shopping.productfeed.ProductFeedItem r8) {
        /*
            r4 = 3
            com.instagram.model.shopping.productfeed.ProductTile r0 = r8.A02
            r6 = 0
            if (r0 == 0) goto L_0x0060
            com.instagram.api.schemas.ProductTileMetadataImpl r0 = r0.A01
            if (r0 == 0) goto L_0x0060
            com.instagram.api.schemas.ProductTileMetadataDecorations r0 = r0.A00
            if (r0 == 0) goto L_0x0060
            java.util.List r0 = r0.AfJ()
            if (r0 == 0) goto L_0x0060
            X.6xT r3 = X.C323426xT.A00(r7)
            X.0qQ.A07(r3)
            java.util.Iterator r5 = r0.iterator()
        L_0x001f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r2 = r5.next()
            com.instagram.api.schemas.ProductTileBannerMetadataDecoration r2 = (com.instagram.api.schemas.ProductTileBannerMetadataDecoration) r2
            com.instagram.api.schemas.ProductTileBannerType r0 = r2.AfH()
            int r0 = r0.ordinal()
            if (r0 != r4) goto L_0x005f
            com.instagram.user.model.Product r0 = r8.A02()
            if (r0 == 0) goto L_0x005f
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            if (r1 == 0) goto L_0x005f
            X.6xZ r0 = r3.A07
            java.util.Map r0 = r0.A0A
            java.lang.Object r1 = r0.get(r1)
            X.Uw5 r0 = X.C16508Uw5.LOADED
            if (r1 == r0) goto L_0x0055
            X.Uw5 r0 = X.C16508Uw5.FAILED
            if (r1 != r0) goto L_0x005f
        L_0x0055:
            com.instagram.user.model.Product r0 = r8.A02()
            boolean r0 = r3.A08(r0)
            if (r0 == 0) goto L_0x001f
        L_0x005f:
            return r2
        L_0x0060:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3C.A01(com.instagram.common.session.UserSession, com.instagram.model.shopping.productfeed.ProductFeedItem):com.instagram.api.schemas.ProductTileBannerMetadataDecoration");
    }

    public static final C15731Uhc A02(ProductFeedItem productFeedItem, boolean z, boolean z2) {
        String str;
        String str2;
        boolean A05;
        String str3;
        FBProductItemDetailsDict A01;
        FBProductItemDetailsDict A012;
        FBProductItemDetailsDict A013;
        FBProductItemDetailsDict A014;
        ArrayList arrayList = new ArrayList();
        ProductTile productTile = productFeedItem.A02;
        if (productTile == null || (A014 = C18768W0o.A01(productTile)) == null || (str = A014.BgN()) == null) {
            Product A02 = productFeedItem.A02();
            0qQ.A0A(A02);
            str = A02.A0J;
            0qQ.A0A(str);
        }
        arrayList.add(JUH.A00(str));
        if (!z2) {
            String A04 = A04(productFeedItem);
            ProductTile productTile2 = productFeedItem.A02;
            if (productTile2 == null || (A013 = C18768W0o.A01(productTile2)) == null || (str2 = A013.BNE()) == null) {
                Product A022 = productFeedItem.A02();
                0qQ.A0A(A022);
                str2 = A022.A0G;
                0qQ.A0A(str2);
            }
            arrayList.add(new GKO(new Object[]{A04, str2}, 2131969791));
            ProductTile productTile3 = productFeedItem.A02;
            if (productTile3 == null || (A012 = C18768W0o.A01(productTile3)) == null) {
                Product A023 = productFeedItem.A02();
                0qQ.A0A(A023);
                A05 = A023.A05();
            } else {
                A05 = C51966G9m.A1a(A012.BND(), A012.C1f());
            }
            if (A05) {
                ProductTile productTile4 = productFeedItem.A02;
                if (productTile4 == null || (A01 = C18768W0o.A01(productTile4)) == null || (str3 = C45683D1i.A01(A01)) == null) {
                    Product A024 = productFeedItem.A02();
                    0qQ.A0A(A024);
                    str3 = A024.A0L;
                    0qQ.A0A(str3);
                }
                arrayList.add(new GKO(new Object[]{str3}, 2131969792));
            }
            if (z) {
                arrayList.add(JUH.A00(" "));
                arrayList.add(new GKO(new Object[0], 2131962674));
            }
        }
        return new C15731Uhc("", arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a8, code lost:
        if (r39 != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r3 == com.instagram.api.schemas.ProductCardSubtitleType.ONE_LINE_PRODUCT_NAME_WITH_MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014a, code lost:
        if (r6.intValue() <= 0) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0eP A05(com.instagram.api.schemas.ProductCardSubtitleType r31, com.instagram.common.session.UserSession r32, com.instagram.model.shopping.productfeed.ProductFeedItem r33, X.C21003X9a r34, java.lang.Integer r35, java.lang.String r36, boolean r37, boolean r38, boolean r39) {
        /*
            r0 = 3
            r24 = r32
            X.Vu4 r1 = X.C18552Vu4.A00(r24)
            r2 = r35
            boolean r8 = r1.A01(r2)
            X.W3C r9 = A00
            r1 = r31
            r6 = r33
            com.instagram.api.schemas.ProductCardSubtitleType r3 = A00(r1, r6)
            r2 = 13
            X.WB5 r22 = new X.WB5
            r7 = r34
            r4 = r36
            r1 = r22
            r1.<init>((java.lang.Object) r7, (java.lang.Object) r6, (java.lang.String) r4, (int) r2)
            r15 = 21
            X.WBE r5 = new X.WBE
            r5.<init>((int) r15, (java.lang.Object) r7, (java.lang.Object) r6)
            r1 = 22
            X.WBE r4 = new X.WBE
            r4.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r6)
            r2 = 20
            X.WBE r21 = new X.WBE
            r1 = r21
            r1.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r6)
            if (r8 == 0) goto L_0x005c
            com.instagram.model.shopping.productfeed.ProductTile r1 = r6.A02
            if (r1 == 0) goto L_0x005c
            com.instagram.api.schemas.ProductTileMetadataImpl r1 = r1.A01
            if (r1 == 0) goto L_0x005c
            r10 = r22
            r11 = r5
            r12 = r4
            r13 = r21
            r14 = r24
            r15 = r6
            X.0eP r2 = r9.A06(r10, r11, r12, r13, r14, r15)
        L_0x0052:
            java.lang.Object r3 = r2.A00
            java.lang.Object r1 = r2.A01
            X.0eP r0 = new X.0eP
            r0.<init>(r3, r1)
            return r0
        L_0x005c:
            com.instagram.model.shopping.productfeed.ProductTile r1 = r6.A02
            if (r1 == 0) goto L_0x02cb
            com.instagram.api.schemas.FBProductItemDetailsDict r1 = X.C18768W0o.A01(r1)
            if (r1 == 0) goto L_0x02cb
            com.instagram.api.schemas.FBProductItemDetailsDictImpl r1 = r1.F2u()
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r1 = r1.A00
            if (r1 == 0) goto L_0x02cb
        L_0x006e:
            r2 = 0
            if (r1 == 0) goto L_0x0086
            java.lang.Boolean r1 = r1.BBC()
            if (r1 == 0) goto L_0x0086
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0086
            com.instagram.api.schemas.ProductCardSubtitleType r1 = com.instagram.api.schemas.ProductCardSubtitleType.MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING
            if (r3 == r1) goto L_0x0086
            com.instagram.api.schemas.ProductCardSubtitleType r1 = com.instagram.api.schemas.ProductCardSubtitleType.ONE_LINE_PRODUCT_NAME_WITH_MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING
            if (r3 == r1) goto L_0x0086
            r2 = 1
        L_0x0086:
            r8 = r39
            X.Uhc r20 = A02(r6, r2, r8)
            if (r38 == 0) goto L_0x0090
            if (r2 != 0) goto L_0x0095
        L_0x0090:
            com.instagram.api.schemas.ProductCardSubtitleType r1 = com.instagram.api.schemas.ProductCardSubtitleType.ONE_LINE_PRODUCT_NAME_WITH_MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING
            r12 = 0
            if (r3 != r1) goto L_0x0096
        L_0x0095:
            r12 = 1
        L_0x0096:
            com.instagram.user.model.Product r19 = r6.A02()
            com.instagram.model.shopping.productfeed.ProductTile r1 = r6.A02
            if (r1 == 0) goto L_0x00aa
            com.instagram.api.schemas.FBProductItemDetailsDict r1 = X.C18768W0o.A01(r1)
            if (r1 == 0) goto L_0x00aa
            java.lang.String r13 = r1.BgN()
            if (r13 != 0) goto L_0x00b6
        L_0x00aa:
            com.instagram.user.model.Product r1 = r6.A02()
            X.0qQ.A0A(r1)
            java.lang.String r13 = r1.A0J
            X.0qQ.A0A(r13)
        L_0x00b6:
            java.lang.String r9 = A04(r6)
            com.instagram.model.shopping.productfeed.ProductTile r1 = r6.A02
            if (r1 == 0) goto L_0x00ca
            com.instagram.api.schemas.FBProductItemDetailsDict r1 = X.C18768W0o.A01(r1)
            if (r1 == 0) goto L_0x00ca
            java.lang.String r5 = X.C45683D1i.A01(r1)
            if (r5 != 0) goto L_0x00d6
        L_0x00ca:
            com.instagram.user.model.Product r1 = r6.A02()
            X.0qQ.A0A(r1)
            java.lang.String r5 = r1.A0L
            X.0qQ.A0A(r5)
        L_0x00d6:
            com.instagram.model.shopping.productfeed.ProductTile r1 = r6.A02
            if (r1 == 0) goto L_0x00e6
            com.instagram.api.schemas.FBProductItemDetailsDict r1 = X.C18768W0o.A01(r1)
            if (r1 == 0) goto L_0x00e6
            java.lang.String r4 = r1.BNE()
            if (r4 != 0) goto L_0x00f2
        L_0x00e6:
            com.instagram.user.model.Product r1 = r6.A02()
            X.0qQ.A0A(r1)
            java.lang.String r4 = r1.A0G
            X.0qQ.A0A(r4)
        L_0x00f2:
            com.instagram.user.model.Product r1 = r6.A02()
            if (r1 == 0) goto L_0x02c8
            java.lang.String r1 = r1.A0K
        L_0x00fa:
            com.instagram.model.shopping.productfeed.ProductTile r7 = r6.A02
            if (r7 == 0) goto L_0x02bb
            com.instagram.api.schemas.FBProductItemDetailsDict r7 = X.C18768W0o.A01(r7)
            if (r7 == 0) goto L_0x02bb
            java.lang.String r10 = r7.BND()
            java.lang.String r7 = r7.C1f()
            boolean r11 = X.C51966G9m.A1a(r10, r7)
        L_0x0110:
            com.instagram.model.shopping.productfeed.ProductTile r7 = r6.A02
            if (r7 == 0) goto L_0x02ac
            com.instagram.api.schemas.FBProductItemDetailsDict r7 = X.C18768W0o.A01(r7)
            if (r7 == 0) goto L_0x02ac
            com.instagram.api.schemas.FBProductItemDetailsDictImpl r7 = r7.F2u()
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r10 = r7.A00
            if (r10 == 0) goto L_0x02ac
        L_0x0122:
            com.instagram.model.shopping.productfeed.ProductTile r7 = r6.A02
            if (r7 == 0) goto L_0x0299
            com.instagram.api.schemas.FBProductItemDetailsDict r7 = X.C18768W0o.A01(r7)
            if (r7 == 0) goto L_0x0299
        L_0x012c:
            r18 = 0
        L_0x012e:
            com.instagram.model.shopping.productfeed.ProductTile r7 = r6.A02
            if (r7 == 0) goto L_0x028c
            com.instagram.api.schemas.FBProductItemDetailsDict r7 = X.C18768W0o.A01(r7)
            if (r7 == 0) goto L_0x028c
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf r6 = r7.An5()
            if (r6 == 0) goto L_0x014c
            java.lang.Integer r6 = r6.BIk()
            if (r6 == 0) goto L_0x014c
            int r6 = r6.intValue()
            r17 = 1
            if (r6 > 0) goto L_0x014e
        L_0x014c:
            r17 = 0
        L_0x014e:
            r14 = 2
            if (r12 == 0) goto L_0x0152
            r14 = 1
        L_0x0152:
            r16 = 0
            X.C51973G9u.A0r(r0, r13, r9, r5)
            r7 = 6
            java.util.ArrayList r0 = X.AnonymousClass7TF.A0q(r4, r7)
            com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl r12 = new com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl
            r6 = r18
            r12.<init>(r14, r6)
            r32 = 0
            X.VkX r6 = X.C18770W0r.A01(r12, r13)
            r0.add(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.instagram.api.schemas.ProductCardSubtitleType r12 = com.instagram.api.schemas.ProductCardSubtitleType.IN_REVIEW
            if (r12 != r3) goto L_0x0284
            X.Wyd r33 = X.C20766Wyd.A00
        L_0x0177:
            X.Wyn r34 = X.C20776Wyn.A00
            X.Wyo r35 = X.C20777Wyo.A00
            r36 = 1
            X.VkX r12 = new X.VkX
            r31 = r12
            r31.<init>(r32, r33, r34, r35, r36)
            r6.add(r12)
        L_0x0187:
            boolean r12 = X.DbT.A1b(r6)
            if (r12 == 0) goto L_0x0199
            r0.addAll(r6)
        L_0x0190:
            X.0eP r2 = new X.0eP
            r1 = r20
            r2.<init>(r1, r0)
            goto L_0x0052
        L_0x0199:
            if (r39 != 0) goto L_0x01ff
            int r6 = r3.ordinal()
            switch(r6) {
                case 2: goto L_0x021a;
                case 3: goto L_0x01a2;
                case 4: goto L_0x021a;
                case 5: goto L_0x021a;
                case 6: goto L_0x01a2;
                case 7: goto L_0x021a;
                case 8: goto L_0x01a2;
                case 9: goto L_0x021a;
                case 10: goto L_0x021a;
                default: goto L_0x01a2;
            }
        L_0x01a2:
            com.instagram.api.schemas.ProductCardSubtitleType r6 = com.instagram.api.schemas.ProductCardSubtitleType.ONE_LINE_PRODUCT_NAME_WITH_MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING
            if (r6 == r3) goto L_0x021a
            com.instagram.api.schemas.ProductCardSubtitleType r6 = com.instagram.api.schemas.ProductCardSubtitleType.MERCHANT_NAME_AS_TEXT_AND_PRICE
            if (r6 == r3) goto L_0x021a
            X.Wxi r23 = new X.Wxi
            r27 = r4
            r28 = r5
            r29 = r16
            r30 = r11
            r31 = r18
            r25 = r3
            r26 = r10
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            X.Wyn r6 = X.C20776Wyn.A00
            X.Wyo r7 = X.C20777Wyo.A00
            r8 = 1
            X.VkX r3 = new X.VkX
            r5 = r23
            r4 = r32
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r3)
            if (r1 == 0) goto L_0x01ec
            X.0eM r3 = X.0mp.A09
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x01ec
            r5 = 4
            X.PmS r4 = new X.PmS
            r3 = r24
            r4.<init>(r3, r1, r5, r11)
            X.VkX r1 = new X.VkX
            r3 = r1
            r5 = r4
            r4 = r32
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r1)
        L_0x01ec:
            if (r2 == 0) goto L_0x01ff
            X.Wyc r3 = X.C20765Wyc.A00
            X.Wyn r4 = X.C20776Wyn.A00
            X.Wyo r5 = X.C20777Wyo.A00
            r6 = 1
            X.VkX r1 = new X.VkX
            r2 = r32
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x01fc:
            r0.add(r1)
        L_0x01ff:
            if (r37 == 0) goto L_0x0190
            r1 = r17
            boolean r1 = X.C17098VHu.A00(r10, r1)
            if (r1 == 0) goto L_0x0190
            r4 = r22
            r3 = r19
            r2 = r21
            r1 = r24
            X.VkX r1 = X.C18770W0r.A00(r4, r2, r1, r3)
            r0.add(r1)
            goto L_0x0190
        L_0x021a:
            X.Iwc r6 = new X.Iwc
            r6.<init>(r9, r7)
            X.Wye r34 = X.C20767Wye.A00
            X.GL4 r8 = new X.GL4
            r7 = r16
            r8.<init>(r7, r15)
            r36 = 1
            X.VkX r7 = new X.VkX
            r31 = r7
            r33 = r6
            r35 = r8
            r31.<init>(r32, r33, r34, r35, r36)
            r0.add(r7)
            com.instagram.api.schemas.ProductCardSubtitleType r6 = com.instagram.api.schemas.ProductCardSubtitleType.PRICE_WITH_MERCHANT_OVERLAY
            if (r6 == r3) goto L_0x0244
            com.instagram.api.schemas.ProductCardSubtitleType r6 = com.instagram.api.schemas.ProductCardSubtitleType.PRICE_WITH_MERCHANT_NO_OVERLAY
            if (r6 == r3) goto L_0x0244
            com.instagram.api.schemas.ProductCardSubtitleType r6 = com.instagram.api.schemas.ProductCardSubtitleType.ONE_LINE_PRODUCT_NAME_WITH_MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING
            if (r6 != r3) goto L_0x01ec
        L_0x0244:
            X.Wxi r23 = new X.Wxi
            r27 = r4
            r28 = r5
            r29 = r16
            r30 = r11
            r31 = r18
            r25 = r3
            r26 = r10
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            X.Wyn r34 = X.C20776Wyn.A00
            X.Wyo r35 = X.C20777Wyo.A00
            X.VkX r2 = new X.VkX
            r31 = r2
            r33 = r23
            r31.<init>(r32, r33, r34, r35, r36)
            r0.add(r2)
            if (r1 == 0) goto L_0x01ff
            X.0eM r2 = X.0mp.A09
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x01ff
            r4 = 4
            X.PmS r3 = new X.PmS
            r2 = r24
            r3.<init>(r2, r1, r4, r11)
            X.VkX r1 = new X.VkX
            r31 = r1
            r33 = r3
            r31.<init>(r32, r33, r34, r35, r36)
            goto L_0x01fc
        L_0x0284:
            com.instagram.api.schemas.ProductCardSubtitleType r12 = com.instagram.api.schemas.ProductCardSubtitleType.NOT_APPROVED
            if (r12 != r3) goto L_0x0187
            X.Wym r33 = X.C20775Wym.A00
            goto L_0x0177
        L_0x028c:
            com.instagram.user.model.Product r6 = r6.A02()
            X.0qQ.A0A(r6)
            boolean r6 = r6.A0P
            r17 = r6
            goto L_0x014e
        L_0x0299:
            com.instagram.user.model.Product r7 = r6.A02()
            X.0qQ.A0A(r7)
            boolean r7 = r7.A04()
            if (r7 == 0) goto L_0x012c
            r18 = 1
            if (r39 == 0) goto L_0x012e
            goto L_0x012c
        L_0x02ac:
            com.instagram.user.model.Product r7 = r6.A02()
            if (r7 == 0) goto L_0x02b8
            com.instagram.user.model.ProductDetailsProductItemDict r7 = r7.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r10 = r7.A0C
            goto L_0x0122
        L_0x02b8:
            r10 = 0
            goto L_0x0122
        L_0x02bb:
            com.instagram.user.model.Product r7 = r6.A02()
            X.0qQ.A0A(r7)
            boolean r11 = r7.A05()
            goto L_0x0110
        L_0x02c8:
            r1 = 0
            goto L_0x00fa
        L_0x02cb:
            com.instagram.user.model.Product r1 = r6.A02()
            if (r1 == 0) goto L_0x02d7
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r1.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r1 = r1.A0C
            goto L_0x006e
        L_0x02d7:
            r1 = 0
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3C.A05(com.instagram.api.schemas.ProductCardSubtitleType, com.instagram.common.session.UserSession, com.instagram.model.shopping.productfeed.ProductFeedItem, X.X9a, java.lang.Integer, java.lang.String, boolean, boolean, boolean):X.0eP");
    }

    public static final ProductCardSubtitleType A00(ProductCardSubtitleType productCardSubtitleType, ProductFeedItem productFeedItem) {
        ProductCardSubtitleType productCardSubtitleType2;
        ProductReviewStatus productReviewStatus;
        if (productCardSubtitleType == null) {
            Product A02 = productFeedItem.A02();
            if (!(A02 == null || (productReviewStatus = A02.A05) == null)) {
                int ordinal = productReviewStatus.ordinal();
                if (ordinal == 5) {
                    productCardSubtitleType = ProductCardSubtitleType.NOT_APPROVED;
                } else if (ordinal == 4) {
                    productCardSubtitleType = ProductCardSubtitleType.IN_REVIEW;
                }
            }
            productCardSubtitleType = ProductCardSubtitleType.PRICE_WITH_SOLD_OUT;
        }
        ProductTile productTile = productFeedItem.A02;
        if (productTile == null || (productCardSubtitleType2 = productTile.A00) == null || productCardSubtitleType2 == ProductCardSubtitleType.IN_REVIEW || productCardSubtitleType2 == ProductCardSubtitleType.NOT_APPROVED) {
            return productCardSubtitleType;
        }
        return productCardSubtitleType2;
    }

    public static final String A04(ProductFeedItem productFeedItem) {
        String str;
        FBProductItemDetailsDict A01;
        ProductTile productTile = productFeedItem.A02;
        if (productTile == null || (A01 = C18768W0o.A01(productTile)) == null) {
            Product A02 = productFeedItem.A02();
            0qQ.A0A(A02);
            User user = A02.A0B;
            if (user != null) {
                str = C13988Tno.A0b(user);
            } else {
                str = null;
            }
            0qQ.A0A(str);
            return str;
        }
        String BaI = A01.BaI();
        if (BaI == null) {
            return "";
        }
        return BaI;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r12v5, types: [com.instagram.api.schemas.ProductTilePriceLabelOptions, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v7, types: [com.instagram.api.schemas.ProductTileProductNameLabelOptions] */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0231, code lost:
        r6 = r6.A07;
        r17 = new X.C18049VkX((java.lang.String) null, new X.C58729Iwc(r7, 7), new X.C20785Wyw(r6, 32), new X.GL4(r9, 22), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0261, code lost:
        r0.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0179, code lost:
        r17 = new X.C18049VkX((java.lang.String) null, r8, X.C20776Wyn.A00, X.C20777Wyo.A00, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b0, code lost:
        r17 = new X.C18049VkX((java.lang.String) null, r8, X.C20776Wyn.A00, r7, 1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0eP A06(android.view.View.OnClickListener r24, android.view.View.OnClickListener r25, android.view.View.OnClickListener r26, android.view.View.OnClickListener r27, com.instagram.common.session.UserSession r28, com.instagram.model.shopping.productfeed.ProductFeedItem r29) {
        /*
            r23 = this;
            r1 = r29
            com.instagram.model.shopping.productfeed.ProductTile r0 = r1.A02
            X.0qQ.A0A(r0)
            com.instagram.api.schemas.ProductTileMetadataImpl r0 = r0.A01
            X.0qQ.A0A(r0)
            java.util.List r0 = r0.A01
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x0017:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.instagram.api.schemas.ProductTileLabel r0 = (com.instagram.api.schemas.ProductTileLabel) r0
            com.instagram.api.schemas.ProductTileLabelType r2 = r0.BKO()
            com.instagram.api.schemas.ProductTileLabelType r0 = com.instagram.api.schemas.ProductTileLabelType.FREE_SHIPPING
            if (r2 != r0) goto L_0x0017
            r5.add(r3)
            goto L_0x0017
        L_0x0030:
            boolean r0 = X.00k.A0t(r5)
            r3 = 0
            X.Uhc r4 = A02(r1, r0, r3)
            r2 = 1
            com.instagram.model.shopping.productfeed.ProductTile r0 = r1.A02
            if (r0 == 0) goto L_0x0296
            com.instagram.api.schemas.ProductTileMetadataImpl r0 = r0.A01
            if (r0 == 0) goto L_0x0296
            java.util.List r5 = r0.A01
            if (r5 == 0) goto L_0x0296
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r5.iterator()
        L_0x004f:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0298
            java.lang.Object r7 = r10.next()
            com.instagram.api.schemas.ProductTileLabel r7 = (com.instagram.api.schemas.ProductTileLabel) r7
            com.instagram.model.shopping.productfeed.ProductTile r6 = r1.A02
            X.0qQ.A0A(r6)
            com.instagram.api.schemas.ProductTileMetadataImpl r5 = r6.A01
            X.0qQ.A0A(r5)
            java.util.List r5 = r5.A01
            int r5 = r5.size()
            boolean r9 = X.AnonymousClass7TF.A1S(r5, r2)
            r18 = 0
            X.0qQ.A0B(r7, r3)
            r12 = 0
            com.instagram.api.schemas.ProductTileLabelType r5 = r7.BKO()
            int r5 = r5.ordinal()
            r13 = r28
            switch(r5) {
                case 1: goto L_0x0257;
                case 2: goto L_0x0082;
                case 3: goto L_0x01c1;
                case 4: goto L_0x0097;
                case 5: goto L_0x009b;
                case 6: goto L_0x0082;
                case 7: goto L_0x020c;
                case 8: goto L_0x022d;
                case 9: goto L_0x009f;
                case 10: goto L_0x015b;
                case 11: goto L_0x00df;
                case 12: goto L_0x00a5;
                case 13: goto L_0x00c9;
                case 14: goto L_0x0195;
                case 15: goto L_0x0082;
                case 16: goto L_0x008a;
                case 17: goto L_0x01a5;
                default: goto L_0x0082;
            }
        L_0x0082:
            java.lang.String r1 = "Unsupported label type."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008a:
            X.Wyi r8 = X.C20771Wyi.A00
            r5 = 36
            X.Wyw r7 = new X.Wyw
            r6 = r25
            r7.<init>(r6, r5)
            goto L_0x01b0
        L_0x0097:
            X.Wyc r8 = X.C20765Wyc.A00
            goto L_0x0179
        L_0x009b:
            X.Wyd r8 = X.C20766Wyd.A00
            goto L_0x0179
        L_0x009f:
            X.Wyf r8 = X.C20768Wyf.A00
            X.Wyg r7 = X.C20769Wyg.A00
            goto L_0x01b0
        L_0x00a5:
            com.instagram.api.schemas.FBProductItemDetailsDict r5 = X.C18768W0o.A01(r6)
            if (r5 == 0) goto L_0x00b1
            java.lang.String r8 = r5.BgN()
            if (r8 != 0) goto L_0x00b9
        L_0x00b1:
            com.instagram.user.model.Product r5 = r6.A07
            if (r5 == 0) goto L_0x0266
            java.lang.String r8 = r5.A0J
            if (r8 == 0) goto L_0x0266
        L_0x00b9:
            com.instagram.api.schemas.ProductTileLayoutContent r5 = r7.BLo()
            if (r5 == 0) goto L_0x00c3
            com.instagram.api.schemas.ProductTileProductNameLabelOptions r12 = r5.BgM()
        L_0x00c3:
            X.VkX r6 = X.C18770W0r.A01(r12, r8)
            goto L_0x0261
        L_0x00c9:
            com.instagram.api.schemas.FBProductItemDetailsDict r5 = X.C18768W0o.A01(r6)
            if (r5 == 0) goto L_0x00d5
            java.lang.String r7 = r5.BgN()
            if (r7 != 0) goto L_0x0231
        L_0x00d5:
            com.instagram.user.model.Product r5 = r6.A07
            if (r5 == 0) goto L_0x026e
            java.lang.String r7 = r5.A0J
            if (r7 == 0) goto L_0x026e
            goto L_0x0231
        L_0x00df:
            com.instagram.api.schemas.FBProductItemDetailsDict r5 = X.C18768W0o.A01(r6)
            if (r5 == 0) goto L_0x00eb
            java.lang.String r14 = X.C45683D1i.A01(r5)
            if (r14 != 0) goto L_0x00f3
        L_0x00eb:
            com.instagram.user.model.Product r5 = r6.A07
            if (r5 == 0) goto L_0x0286
            java.lang.String r14 = r5.A0L
            if (r14 == 0) goto L_0x0286
        L_0x00f3:
            com.instagram.api.schemas.FBProductItemDetailsDict r5 = X.C18768W0o.A01(r6)
            if (r5 == 0) goto L_0x00ff
            java.lang.String r15 = r5.BNE()
            if (r15 != 0) goto L_0x0107
        L_0x00ff:
            com.instagram.user.model.Product r5 = r6.A07
            if (r5 == 0) goto L_0x027e
            java.lang.String r15 = r5.A0G
            if (r15 == 0) goto L_0x027e
        L_0x0107:
            com.instagram.user.model.Product r5 = r6.A07
            if (r5 == 0) goto L_0x0158
            com.instagram.api.schemas.ProductAffiliateInformationDict r5 = r5.A04
            if (r5 == 0) goto L_0x0158
            java.lang.String r16 = r5.ApW()
        L_0x0113:
            com.instagram.api.schemas.FBProductItemDetailsDict r5 = X.C18768W0o.A01(r6)
            if (r5 == 0) goto L_0x014f
            java.lang.String r6 = r5.BND()
            java.lang.String r5 = r5.C1f()
            boolean r17 = X.C51966G9m.A1a(r6, r5)
        L_0x0125:
            com.instagram.api.schemas.ProductTileLayoutContent r5 = r7.BLo()
            if (r5 == 0) goto L_0x012f
            com.instagram.api.schemas.ProductTilePriceLabelOptions r12 = r5.BfJ()
        L_0x012f:
            X.0qQ.A0B(r14, r2)
            X.Wxe r11 = new X.Wxe
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r6 = 33
            X.Wyw r5 = new X.Wyw
            r5.<init>(r12, r6)
            X.Wyo r21 = X.C20777Wyo.A00
            X.VkX r6 = new X.VkX
            r19 = r11
            r20 = r5
            r22 = r2
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x0261
        L_0x014f:
            com.instagram.user.model.Product r5 = r6.A07
            if (r5 == 0) goto L_0x0276
            boolean r17 = r5.A05()
            goto L_0x0125
        L_0x0158:
            r16 = 0
            goto L_0x0113
        L_0x015b:
            com.instagram.user.model.Product r5 = r6.A07
            if (r5 == 0) goto L_0x0193
            java.lang.String r7 = r5.A0K
        L_0x0161:
            com.instagram.api.schemas.FBProductItemDetailsDict r5 = X.C18768W0o.A01(r6)
            if (r5 == 0) goto L_0x018a
            java.lang.String r6 = r5.BND()
            java.lang.String r5 = r5.C1f()
            boolean r6 = X.C51966G9m.A1a(r6, r5)
        L_0x0173:
            r5 = 3
            X.PmS r8 = new X.PmS
            r8.<init>(r13, r7, r5, r6)
        L_0x0179:
            X.Wyn r20 = X.C20776Wyn.A00
            X.Wyo r21 = X.C20777Wyo.A00
            X.VkX r6 = new X.VkX
            r19 = r8
            r22 = r2
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x0261
        L_0x018a:
            com.instagram.user.model.Product r5 = r6.A07
            if (r5 == 0) goto L_0x028e
            boolean r6 = r5.A05()
            goto L_0x0173
        L_0x0193:
            r7 = 0
            goto L_0x0161
        L_0x0195:
            com.instagram.user.model.Product r5 = r6.A07
            if (r5 == 0) goto L_0x019b
            com.instagram.api.schemas.CommerceReviewStatisticsDictIntf r12 = r5.A02
        L_0x019b:
            r5 = 35
            X.Wyw r8 = new X.Wyw
            r8.<init>(r12, r5)
            X.Wyh r7 = X.C20770Wyh.A00
            goto L_0x01b0
        L_0x01a5:
            X.Wyj r8 = X.C20772Wyj.A00
            r5 = 37
            X.Wyw r7 = new X.Wyw
            r6 = r26
            r7.<init>(r6, r5)
        L_0x01b0:
            X.Wyn r20 = X.C20776Wyn.A00
            X.VkX r6 = new X.VkX
            r19 = r8
            r21 = r7
            r22 = r2
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x0261
        L_0x01c1:
            com.instagram.api.schemas.ProductTileLayoutContent r5 = r7.BLo()
            if (r5 == 0) goto L_0x01d3
            com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptions r5 = r5.B4v()
            if (r5 == 0) goto L_0x01d3
            java.lang.String r6 = r5.BzQ()
            if (r6 != 0) goto L_0x01d5
        L_0x01d3:
            java.lang.String r6 = ""
        L_0x01d5:
            com.instagram.api.schemas.ProductTileLayoutContent r5 = r7.BLo()
            if (r5 == 0) goto L_0x01e5
            com.instagram.api.schemas.ProductTileFeaturedProductPermissionInfoLabelOptions r5 = r5.B4v()
            if (r5 == 0) goto L_0x01e5
            com.instagram.api.schemas.ProductTileTextStyleType r12 = r5.C28()
        L_0x01e5:
            com.instagram.api.schemas.ProductTileTextStyleType r5 = com.instagram.api.schemas.ProductTileTextStyleType.ERROR
            r8 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r12 != r5) goto L_0x01ef
            r8 = 2130970215(0x7f040667, float:1.7549134E38)
        L_0x01ef:
            r5 = 5
            X.Iwc r7 = new X.Iwc
            r7.<init>(r6, r5)
            r6 = 17
            X.GLV r5 = new X.GLV
            r5.<init>(r8, r6)
            X.Wyn r20 = X.C20776Wyn.A00
            X.VkX r6 = new X.VkX
            r19 = r7
            r21 = r5
            r22 = r2
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x0261
        L_0x020c:
            java.lang.String r6 = X.C18770W0r.A03(r6)
            r5 = 6
            X.Iwc r7 = new X.Iwc
            r7.<init>(r6, r5)
            X.Wye r20 = X.C20767Wye.A00
            r6 = 21
            X.GL4 r5 = new X.GL4
            r5.<init>(r9, r6)
            X.VkX r6 = new X.VkX
            r19 = r7
            r21 = r5
            r22 = r2
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x0261
        L_0x022d:
            java.lang.String r7 = X.C18770W0r.A03(r6)
        L_0x0231:
            com.instagram.user.model.Product r6 = r6.A07
            r5 = 7
            X.Iwc r8 = new X.Iwc
            r8.<init>(r7, r5)
            r5 = 32
            X.Wyw r7 = new X.Wyw
            r7.<init>(r6, r5)
            r6 = 22
            X.GL4 r5 = new X.GL4
            r5.<init>(r9, r6)
            X.VkX r6 = new X.VkX
            r19 = r8
            r20 = r7
            r21 = r5
            r22 = r2
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x0261
        L_0x0257:
            com.instagram.user.model.Product r5 = r6.A07
            r7 = r24
            r6 = r27
            X.VkX r6 = X.C18770W0r.A00(r7, r6, r13, r5)
        L_0x0261:
            r0.add(r6)
            goto L_0x004f
        L_0x0266:
            java.lang.String r1 = "This ProductFeedItem does not contain a product."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x026e:
            java.lang.String r1 = "This ProductFeedItem does not contain a product."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0276:
            java.lang.String r1 = "This ProductFeedItem does not contain a product."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x027e:
            java.lang.String r1 = "This ProductFeedItem does not contain a product."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0286:
            java.lang.String r1 = "This ProductFeedItem does not contain a product."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x028e:
            java.lang.String r1 = "This ProductFeedItem does not contain a product."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0296:
            X.0sn r0 = X.0sn.A00
        L_0x0298:
            X.0eP r1 = new X.0eP
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3C.A06(android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, com.instagram.common.session.UserSession, com.instagram.model.shopping.productfeed.ProductFeedItem):X.0eP");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        if (com.instagram.api.schemas.ProductCardSubtitleType.IN_REVIEW == r3) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        if (r2.Bvo() != true) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r3.Bvp() != true) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        if (r2.BvH() != true) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        if (r0.A05(r5) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0110, code lost:
        if (r2.BC0() != true) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e7, code lost:
        if (r73 == false) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C19276WSj A03(com.instagram.api.schemas.ProductCardSubtitleType r55, X.C19641Wd4 r56, X.AnonymousClass0iw r57, X.0xF r58, com.instagram.common.session.UserSession r59, com.instagram.common.typedurl.ImageUrl r60, X.C17969Vj5 r61, com.instagram.model.shopping.productfeed.ProductFeedItem r62, X.C21003X9a r63, X.Uw7 r64, java.lang.Integer r65, java.lang.Integer r66, java.lang.String r67, java.lang.String r68, int r69, int r70, boolean r71, boolean r72, boolean r73, boolean r74, boolean r75, boolean r76, boolean r77, boolean r78) {
        /*
            r40 = r74
            r1 = 1
            r10 = 2
            r14 = 3
            r0 = 19
            r12 = r63
            X.0qQ.A0B(r12, r0)
            r0 = r62
            com.instagram.model.shopping.productfeed.ProductTile r2 = r0.A02
            r31 = 0
            if (r2 == 0) goto L_0x0200
            com.instagram.api.schemas.ProductTileMetadataImpl r2 = r2.A01
            if (r2 == 0) goto L_0x0200
            com.instagram.api.schemas.ProductTileMetadataDecorations r2 = r2.A00
        L_0x001a:
            r7 = r55
            com.instagram.api.schemas.ProductCardSubtitleType r3 = A00(r7, r0)
            r5 = r59
            X.Vu4 r6 = X.C18552Vu4.A00(r5)
            r4 = r65
            boolean r13 = r6.A01(r4)
            com.instagram.model.shopping.productfeed.ProductTile r6 = r0.A02
            if (r6 == 0) goto L_0x01fc
            com.instagram.api.schemas.ProductTileMetadataImpl r6 = r6.A01
            if (r6 == 0) goto L_0x01fc
            com.instagram.api.schemas.ProductTileMetadataDecorations r6 = r6.A00
            if (r6 == 0) goto L_0x01fc
            java.lang.Boolean r6 = r6.CdM()
            boolean r44 = X.AnonymousClass7TF.A1Y(r6, r1)
        L_0x0040:
            r20 = r67
            r46 = r78
            r22 = r72
            r21 = r71
            r15 = r7
            r16 = r5
            r17 = r0
            r18 = r12
            r19 = r4
            r23 = r46
            X.0eP r6 = A05(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r9 = r6.A00
            X.4Yx r9 = (X.C266444Yx) r9
            java.lang.Object r7 = r6.A01
            java.util.List r7 = (java.util.List) r7
            com.instagram.model.shopping.productfeed.ProductTile r6 = r0.A02
            if (r6 == 0) goto L_0x01f1
            com.instagram.api.schemas.FBProductItemDetailsDict r6 = X.C18768W0o.A01(r6)
            if (r6 == 0) goto L_0x01f1
            java.lang.String r11 = X.C45683D1i.A00(r6)
        L_0x006d:
            r8 = 2131967982(0x7f133fee, float:1.9572846E38)
            java.lang.String r6 = r0.A03()
            if (r6 != 0) goto L_0x0078
            java.lang.String r6 = ""
        L_0x0078:
            X.HsR r16 = X.JTR.A0g(r6, r8)
            r8 = r60
            if (r60 == 0) goto L_0x01eb
            com.instagram.model.mediasize.ExtendedImageUrl r6 = new com.instagram.model.mediasize.ExtendedImageUrl
            r6.<init>(r8)
            java.util.List r27 = X.AnonymousClass7TE.A1I(r6)
            com.instagram.model.mediasize.ImageInfoImpl r19 = new com.instagram.model.mediasize.ImageInfoImpl
            r23 = r19
            r24 = r31
            r25 = r31
            r26 = r31
            r28 = r31
            r23.<init>(r24, r25, r26, r27, r28)
        L_0x0098:
            com.instagram.api.schemas.ProductCardSubtitleType r6 = com.instagram.api.schemas.ProductCardSubtitleType.NOT_APPROVED
            if (r6 == r3) goto L_0x00a2
            com.instagram.api.schemas.ProductCardSubtitleType r6 = com.instagram.api.schemas.ProductCardSubtitleType.IN_REVIEW
            r35 = 0
            if (r6 != r3) goto L_0x00a4
        L_0x00a2:
            r35 = 1
        L_0x00a4:
            r38 = 1
            if (r13 == 0) goto L_0x00b1
            if (r2 == 0) goto L_0x00b1
            boolean r3 = r2.Bvo()
            r6 = 1
            if (r3 == r1) goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            r36 = r73
            if (r73 != 0) goto L_0x01e5
            if (r6 == 0) goto L_0x01e5
        L_0x00b8:
            com.instagram.model.shopping.productfeed.ProductTile r3 = r0.A02
            if (r3 == 0) goto L_0x00cc
            com.instagram.api.schemas.ProductTileMetadataImpl r3 = r3.A01
            if (r3 == 0) goto L_0x00cc
            com.instagram.api.schemas.ProductTileMetadataDecorations r3 = r3.A00
            if (r3 == 0) goto L_0x00cc
            boolean r3 = r3.Bvp()
            r39 = 1
            if (r3 == r1) goto L_0x00ce
        L_0x00cc:
            r39 = 0
        L_0x00ce:
            if (r13 == 0) goto L_0x00dc
            if (r2 == 0) goto L_0x00da
            boolean r3 = r2.BvH()
            r40 = 1
            if (r3 == r1) goto L_0x00dc
        L_0x00da:
            r40 = 0
        L_0x00dc:
            if (r75 != 0) goto L_0x00e6
            boolean r3 = r0.A05(r5)
            r41 = 1
            if (r3 != 0) goto L_0x00e8
        L_0x00e6:
            r41 = 0
        L_0x00e8:
            if (r77 != 0) goto L_0x01e1
            X.Vu4 r3 = X.C18552Vu4.A00(r5)
            boolean r3 = r3.A01(r4)
            if (r3 == 0) goto L_0x00fc
            if (r2 == 0) goto L_0x00fc
            boolean r2 = r2.Bvt()
            if (r2 == 0) goto L_0x01e1
        L_0x00fc:
            r42 = 1
        L_0x00fe:
            com.instagram.model.shopping.productfeed.ProductTile r2 = r0.A02
            if (r2 == 0) goto L_0x0112
            com.instagram.api.schemas.ProductTileMetadataImpl r2 = r2.A01
            if (r2 == 0) goto L_0x0112
            com.instagram.api.schemas.ProductTileMetadataDecorations r2 = r2.A00
            if (r2 == 0) goto L_0x0112
            boolean r2 = r2.BC0()
            r43 = 1
            if (r2 == r1) goto L_0x0114
        L_0x0112:
            r43 = 0
        L_0x0114:
            if (r72 == 0) goto L_0x01dd
            java.lang.Integer r22 = java.lang.Integer.valueOf(r14)
        L_0x011a:
            com.instagram.api.schemas.ProductTileBannerMetadataDecoration r14 = A01(r5, r0)
            com.instagram.model.shopping.productfeed.ProductTile r2 = r0.A02
            if (r2 == 0) goto L_0x01c8
            com.instagram.api.schemas.FBProductItemDetailsDict r2 = X.C18768W0o.A01(r2)
            if (r2 == 0) goto L_0x01c8
            java.lang.String r2 = r2.BaK()
            if (r2 == 0) goto L_0x01c8
            com.instagram.common.typedurl.SimpleImageUrl r3 = new com.instagram.common.typedurl.SimpleImageUrl
            r3.<init>(r2)
        L_0x0133:
            java.lang.String r25 = A04(r0)
            r48 = r58
            r54 = r70
            r53 = r69
            r52 = r68
            if (r73 == 0) goto L_0x01b9
            r27 = r31
        L_0x0143:
            X.Wxh r29 = new X.Wxh
            r47 = r29
            r49 = r12
            r50 = r0
            r51 = r20
            r55 = r1
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55)
            if (r73 == 0) goto L_0x019c
            r33 = r31
            r13 = r31
        L_0x0158:
            X.JG0 r4 = new X.JG0
            r4.<init>(r10, r12, r0)
            r52 = 10
            X.J6Y r28 = new X.J6Y
            r47 = r28
            r48 = r12
            r49 = r53
            r51 = r54
            r47.<init>((java.lang.Object) r48, (int) r49, (java.lang.Object) r50, (int) r51, (int) r52)
            r1 = 39
            X.Wyw r2 = new X.Wyw
            r5 = r56
            r2.<init>(r5, r1)
            r52 = 38
            X.GSJ r34 = new X.GSJ
            r47 = r34
            r47.<init>(r48, r49, r50, r51, r52)
            X.WSj r12 = new X.WSj
            r23 = r66
            r21 = r64
            r20 = r61
            r45 = r76
            r15 = r57
            r26 = r7
            r30 = r2
            r32 = r4
            r37 = r36
            r18 = r3
            r24 = r11
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return r12
        L_0x019c:
            r55 = 7
            X.J8Y r33 = new X.J8Y
            r49 = r33
            r50 = r12
            r51 = r0
            r52 = r20
            r49.<init>(r50, r51, r52, r53, r54, r55)
            X.WBi r13 = new X.WBi
            r49 = r13
            r50 = r0
            r51 = r12
            r55 = r10
            r49.<init>(r50, r51, r52, r53, r54, r55)
            goto L_0x0158
        L_0x01b9:
            X.Wxf r27 = new X.Wxf
            r47 = r27
            r49 = r0
            r50 = r12
            r51 = r20
            r47.<init>(r48, r49, r50, r51, r52, r53, r54)
            goto L_0x0143
        L_0x01c8:
            com.instagram.user.model.Product r2 = r0.A02()
            if (r2 == 0) goto L_0x01da
            com.instagram.user.model.User r2 = r2.A0B
            if (r2 == 0) goto L_0x01da
            X.4Cl r2 = r2.A03
            com.instagram.common.typedurl.ImageUrl r3 = r2.Bh3()
            goto L_0x0133
        L_0x01da:
            r3 = 0
            goto L_0x0133
        L_0x01dd:
            r22 = r31
            goto L_0x011a
        L_0x01e1:
            r42 = 0
            goto L_0x00fe
        L_0x01e5:
            r38 = 0
            if (r73 != 0) goto L_0x00cc
            goto L_0x00b8
        L_0x01eb:
            com.instagram.model.mediasize.ImageInfo r19 = r0.A00()
            goto L_0x0098
        L_0x01f1:
            com.instagram.user.model.Product r6 = r0.A02()
            X.0qQ.A0A(r6)
            java.lang.String r11 = r6.A0H
            goto L_0x006d
        L_0x01fc:
            r44 = 0
            goto L_0x0040
        L_0x0200:
            r2 = r31
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3C.A03(com.instagram.api.schemas.ProductCardSubtitleType, X.Wd4, X.0iw, X.0xF, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, X.Vj5, com.instagram.model.shopping.productfeed.ProductFeedItem, X.X9a, X.Uw7, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.WSj");
    }
}
