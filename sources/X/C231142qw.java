package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.2qw  reason: invalid class name and case insensitive filesystem */
public final class C231142qw {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C231152qx A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final String A0F;
    public final String A0G;

    public final C18591Vui A01(1Xj r4, ProductTile productTile) {
        String str;
        0qQ.A0B(productTile, 0);
        FBProductItemDetailsDict A012 = C18768W0o.A01(productTile);
        if (A012 != null) {
            return new C18591Vui(A012, r4, this);
        }
        Product product = productTile.A07;
        if (product != null) {
            User user = product.A0B;
            if (user != null) {
                str = AnonymousClass3ZA.A00(user);
            } else {
                str = null;
            }
            return new C18591Vui(r4, this, product, str);
        }
        throw new Error("productTile must have a nonnull product");
    }

    public final C18591Vui A02(1Xj r2, Product product, String str) {
        0qQ.A0B(str, 1);
        return new C18591Vui(r2, this, product, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03d0, code lost:
        if (r9 != null) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0297, code lost:
        if (r9 != null) goto L_0x0299;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C243373Ym r38, X.C18591Vui r39, X.C231142qw r40) {
        /*
            r14 = r39
            X.X53 r0 = r14.A05
            r12 = r38
            if (r0 == 0) goto L_0x000b
            r0.DZt(r12)
        L_0x000b:
            X.Ufq r4 = new X.Ufq
            r13 = r40
            r4.<init>(r12, r14, r13)
            X.3ZL r11 = r14.A0D
            java.lang.String r10 = r14.A0F
            X.1Xj r0 = r14.A0B
            r23 = r0
            java.lang.String r0 = r14.A06
            r17 = r0
            java.lang.String r0 = r14.A08
            r16 = r0
            X.4DU r7 = r13.A03
            java.lang.String r6 = r13.A0F
            java.lang.String r5 = r13.A0G
            java.lang.String r3 = r13.A0B
            r9 = r3
            if (r3 != 0) goto L_0x002e
            r3 = 0
        L_0x002e:
            java.lang.String r2 = r13.A0C
            com.instagram.common.session.UserSession r0 = r13.A02
            r40 = r0
            android.content.Context r15 = r13.A00
            r8 = 0
            java.lang.String r1 = r14.A07
            java.lang.String r0 = r13.A08
            r22 = r0
            r24 = r15
            r25 = r4
            r26 = r40
            r27 = r23
            r28 = r7
            r29 = r11
            r30 = r12
            r31 = r10
            r32 = r17
            r33 = r16
            r34 = r6
            r35 = r5
            r36 = r3
            r37 = r2
            r38 = r1
            r39 = r0
            com.instagram.save.api.SaveApiUtil.A06(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            boolean r0 = r13.A0E
            if (r0 == 0) goto L_0x0139
            X.3Ym r0 = X.C243373Ym.SAVED
            if (r12 != r0) goto L_0x0139
            X.2qx r4 = r13.A04
            java.lang.String r15 = r11.BpP()
            X.0qQ.A07(r15)
            boolean r0 = r14.A0I
            r17 = r0
            java.lang.String r9 = r14.A07
            java.lang.String r3 = r14.A08
            X.JwH r6 = r14.A02
            java.lang.String r7 = r14.A0G
            java.lang.String r5 = r14.A0H
            long r0 = r14.A00
            X.0wc r14 = r4.A01
            java.lang.String r13 = "shops_product_save"
            X.0kJ r2 = r14.A00
            X.0Aj r13 = r14.A00(r2, r13)
            boolean r2 = r13.isSampled()
            if (r2 == 0) goto L_0x011a
            X.UGr r14 = new X.UGr
            r14.<init>()
            long r15 = java.lang.Long.parseLong(r15)
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            java.lang.String r2 = "product_id"
            r14.A05(r2, r15)
            if (r10 == 0) goto L_0x00a9
            X.4Ny r8 = X.C263944Ny.A00(r10)
        L_0x00a9:
            r14.A09(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r17)
            java.lang.String r2 = "is_checkout_enabled"
            r14.A03(r2, r8)
            java.lang.String r2 = "product_info"
            r13.AAK(r14, r2)
            X.327 r3 = X.C231152qx.A02(r4, r3)
            java.lang.String r2 = "navigation_info"
            r13.AAK(r3, r2)
            java.lang.String r2 = "position"
            r13.AAJ(r2, r9)
            java.lang.String r2 = "page_id"
            r13.AAJ(r2, r7)
            java.lang.String r2 = "redirect_app"
            r13.AAJ(r2, r5)
            if (r6 == 0) goto L_0x00dd
            X.3sW r3 = X.C231152qx.A01(r6)
            java.lang.String r2 = "collections_logging_info"
            r13.AAK(r3, r2)
        L_0x00dd:
            com.instagram.api.schemas.RankingInfo r2 = r4.A00
            if (r2 == 0) goto L_0x00ea
            X.UFv r3 = X.VF4.A00(r2)
            java.lang.String r2 = "ranking_logging_info"
            r13.AAK(r3, r2)
        L_0x00ea:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0106
            X.4Ny r1 = new X.4Ny
            r1.<init>(r5)
            r0 = 779(0x30b, float:1.092E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r13.AAE(r1, r0)
        L_0x0106:
            if (r22 == 0) goto L_0x0117
            int r0 = r22.length()
            if (r0 == 0) goto L_0x0117
            X.4Ny r1 = X.C263944Ny.A00(r22)
            java.lang.String r0 = "marketer_id"
            r13.AAE(r1, r0)
        L_0x0117:
            r13.Cgf()
        L_0x011a:
            boolean r0 = r11 instanceof com.instagram.user.model.Product
            if (r0 == 0) goto L_0x0138
            X.3Ym r0 = X.C243373Ym.NOT_SAVED
            com.instagram.user.model.Product r11 = (com.instagram.user.model.Product) r11
            r1 = 0
            if (r12 != r0) goto L_0x03da
            r0 = r40
            X.Lix r1 = X.C63446KxB.A00(r0, r1)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.UzF r0 = X.C16679UzF.WISH_LIST
            r1.A0I(r0, r11)
        L_0x0138:
            return
        L_0x0139:
            X.2qx r7 = r13.A04
            java.lang.String r16 = r11.BpP()
            X.0qQ.A07(r16)
            boolean r0 = r14.A0I
            r28 = r0
            java.lang.String r0 = r14.A07
            r27 = r0
            java.lang.String r0 = r14.A08
            r26 = r0
            java.lang.String r6 = r13.A0A
            java.lang.String r5 = r13.A07
            java.lang.String r0 = r13.A09
            r21 = r0
            X.JwH r0 = r14.A02
            r20 = r0
            X.9JL r0 = r14.A01
            r19 = r0
            X.ULa r4 = r14.A04
            java.lang.String r3 = r14.A0G
            java.lang.String r2 = r14.A0H
            long r0 = r14.A00
            r24 = r0
            java.lang.String r1 = r13.A06
            if (r9 != 0) goto L_0x016d
            r9 = 0
        L_0x016d:
            X.ULV r0 = r14.A03
            r18 = r0
            X.3Ym r0 = X.C243373Ym.SAVED
            X.0wc r14 = r7.A01
            if (r12 != r0) goto L_0x02bb
            java.lang.String r13 = "instagram_shopping_product_save"
            X.0kJ r0 = r14.A00
            X.0Aj r13 = r14.A00(r0, r13)
            boolean r0 = r13.isSampled()
            if (r0 == 0) goto L_0x011a
            X.UGr r15 = new X.UGr
            r15.<init>()
            long r16 = java.lang.Long.parseLong(r16)
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "product_id"
            r15.A05(r0, r14)
            if (r10 == 0) goto L_0x02b8
            X.4Ny r0 = X.C263944Ny.A00(r10)
        L_0x019d:
            r15.A09(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r28)
            java.lang.String r0 = "is_checkout_enabled"
            r15.A03(r0, r10)
            java.lang.String r0 = "product_info"
            r13.AAK(r15, r0)
            r0 = r26
            X.327 r10 = X.C231152qx.A02(r7, r0)
            java.lang.String r0 = "navigation_info"
            r13.AAK(r10, r0)
            java.lang.String r10 = "position"
            r0 = r27
            r13.AAJ(r10, r0)
            if (r6 == 0) goto L_0x02b5
            r0 = 10
            java.lang.Long r6 = X.00y.A0n(r0, r6)
        L_0x01c8:
            java.lang.String r0 = "pdp_product_id"
            r13.A9F(r0, r6)
            java.lang.String r0 = "broadcast_id"
            r13.A9F(r0, r8)
            java.lang.String r0 = "page_id"
            r13.AAJ(r0, r3)
            java.lang.String r0 = "redirect_app"
            r13.AAJ(r0, r2)
            if (r23 == 0) goto L_0x0200
            X.UFq r3 = new X.UFq
            r3.<init>()
            java.lang.String r2 = r23.getId()
            java.lang.String r0 = "m_pk"
            r3.A06(r0, r2)
            com.instagram.common.session.UserSession r2 = r7.A02
            java.lang.String r0 = r23.getId()
            java.lang.String r2 = X.C231122qu.A0I(r2, r0)
            java.lang.String r0 = "tracking_token"
            r3.A06(r0, r2)
            java.lang.String r0 = "feed_item_info"
            r13.AAK(r3, r0)
        L_0x0200:
            if (r20 == 0) goto L_0x020b
            X.3sW r2 = X.C231152qx.A01(r20)
            java.lang.String r0 = "collections_logging_info"
            r13.AAK(r2, r0)
        L_0x020b:
            if (r19 == 0) goto L_0x0216
            X.UFu r2 = X.C231152qx.A03(r19)
            java.lang.String r0 = "pivots_logging_info"
            r13.AAK(r2, r0)
        L_0x0216:
            if (r4 == 0) goto L_0x0221
            X.UFp r2 = X.C231152qx.A00(r4)
            java.lang.String r0 = "bag_logging_info"
            r13.AAK(r2, r0)
        L_0x0221:
            if (r5 == 0) goto L_0x0232
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r5)
            r0 = 308(0x134, float:4.32E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r13.A9F(r0, r2)
        L_0x0232:
            if (r21 == 0) goto L_0x023d
            X.4Ny r2 = X.C263944Ny.A00(r21)
            java.lang.String r0 = "pdp_merchant_id"
            r13.AAE(r2, r0)
        L_0x023d:
            java.lang.Long r6 = java.lang.Long.valueOf(r24)
            long r4 = r6.longValue()
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0259
            X.4Ny r2 = new X.4Ny
            r2.<init>(r6)
            r0 = 779(0x30b, float:1.092E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r13.AAE(r2, r0)
        L_0x0259:
            if (r22 == 0) goto L_0x026a
            int r0 = r22.length()
            if (r0 == 0) goto L_0x026a
            X.4Ny r2 = X.C263944Ny.A00(r22)
            java.lang.String r0 = "marketer_id"
            r13.AAE(r2, r0)
        L_0x026a:
            com.instagram.api.schemas.RankingInfo r0 = r7.A00
            if (r0 == 0) goto L_0x0277
            X.UFv r2 = X.VF4.A00(r0)
            java.lang.String r0 = "ranking_logging_info"
            r13.AAK(r2, r0)
        L_0x0277:
            if (r1 == 0) goto L_0x028a
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x028a
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
            java.lang.String r0 = "collection_page_id"
            r13.A9F(r0, r1)
        L_0x028a:
            boolean r0 = X.AnonymousClass1GD.A03()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_dark_mode"
            r13.A7p(r0, r1)
            if (r9 == 0) goto L_0x02ac
        L_0x0299:
            X.UFx r1 = new X.UFx
            r1.<init>()
            java.lang.String r0 = "search_session_id"
            r1.A06(r0, r9)
            r0 = 3983(0xf8f, float:5.581E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r13.AAK(r1, r0)
        L_0x02ac:
            if (r18 == 0) goto L_0x0117
            java.lang.String r0 = "channel_logging_info"
            r13.AAK(r8, r0)
            goto L_0x0117
        L_0x02b5:
            r6 = r8
            goto L_0x01c8
        L_0x02b8:
            r0 = r8
            goto L_0x019d
        L_0x02bb:
            java.lang.String r13 = "instagram_shopping_product_unsave"
            X.0kJ r0 = r14.A00
            X.0Aj r13 = r14.A00(r0, r13)
            boolean r0 = r13.isSampled()
            if (r0 == 0) goto L_0x011a
            X.UGr r15 = new X.UGr
            r15.<init>()
            long r16 = java.lang.Long.parseLong(r16)
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "product_id"
            r15.A05(r0, r14)
            if (r10 == 0) goto L_0x03d7
            X.4Ny r0 = X.C263944Ny.A00(r10)
        L_0x02e1:
            r15.A09(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r28)
            java.lang.String r0 = "is_checkout_enabled"
            r15.A03(r0, r10)
            java.lang.String r0 = "product_info"
            r13.AAK(r15, r0)
            r0 = r26
            X.327 r10 = X.C231152qx.A02(r7, r0)
            java.lang.String r0 = "navigation_info"
            r13.AAK(r10, r0)
            java.lang.String r10 = "position"
            r0 = r27
            r13.AAJ(r10, r0)
            if (r6 == 0) goto L_0x03d4
            r0 = 10
            java.lang.Long r6 = X.00y.A0n(r0, r6)
        L_0x030c:
            java.lang.String r0 = "pdp_product_id"
            r13.A9F(r0, r6)
            java.lang.String r0 = "broadcast_id"
            r13.A9F(r0, r8)
            java.lang.String r0 = "page_id"
            r13.AAJ(r0, r3)
            java.lang.String r0 = "redirect_app"
            r13.AAJ(r0, r2)
            if (r23 == 0) goto L_0x0344
            X.UFq r3 = new X.UFq
            r3.<init>()
            java.lang.String r2 = r23.getId()
            java.lang.String r0 = "m_pk"
            r3.A06(r0, r2)
            com.instagram.common.session.UserSession r2 = r7.A02
            java.lang.String r0 = r23.getId()
            java.lang.String r2 = X.C231122qu.A0I(r2, r0)
            java.lang.String r0 = "tracking_token"
            r3.A06(r0, r2)
            java.lang.String r0 = "feed_item_info"
            r13.AAK(r3, r0)
        L_0x0344:
            if (r20 == 0) goto L_0x034f
            X.3sW r2 = X.C231152qx.A01(r20)
            java.lang.String r0 = "collections_logging_info"
            r13.AAK(r2, r0)
        L_0x034f:
            if (r19 == 0) goto L_0x035a
            X.UFu r2 = X.C231152qx.A03(r19)
            java.lang.String r0 = "pivots_logging_info"
            r13.AAK(r2, r0)
        L_0x035a:
            if (r4 == 0) goto L_0x0365
            X.UFp r2 = X.C231152qx.A00(r4)
            java.lang.String r0 = "bag_logging_info"
            r13.AAK(r2, r0)
        L_0x0365:
            if (r5 == 0) goto L_0x0376
            r0 = 10
            java.lang.Long r2 = X.00y.A0n(r0, r5)
            r0 = 308(0x134, float:4.32E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r13.A9F(r0, r2)
        L_0x0376:
            if (r21 == 0) goto L_0x0381
            X.4Ny r2 = X.C263944Ny.A00(r21)
            java.lang.String r0 = "pdp_merchant_id"
            r13.AAE(r2, r0)
        L_0x0381:
            java.lang.Long r4 = java.lang.Long.valueOf(r24)
            r2 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x039f
            X.4Ny r2 = new X.4Ny
            r2.<init>(r4)
            r0 = 779(0x30b, float:1.092E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r13.AAE(r2, r0)
        L_0x039f:
            if (r22 == 0) goto L_0x03b0
            int r0 = r22.length()
            if (r0 == 0) goto L_0x03b0
            X.4Ny r2 = X.C263944Ny.A00(r22)
            java.lang.String r0 = "marketer_id"
            r13.AAE(r2, r0)
        L_0x03b0:
            com.instagram.api.schemas.RankingInfo r0 = r7.A00
            if (r0 == 0) goto L_0x03bd
            X.UFv r2 = X.VF4.A00(r0)
            java.lang.String r0 = "ranking_logging_info"
            r13.AAK(r2, r0)
        L_0x03bd:
            if (r1 == 0) goto L_0x03d0
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x03d0
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
            java.lang.String r0 = "collection_page_id"
            r13.A9F(r0, r1)
        L_0x03d0:
            if (r9 == 0) goto L_0x02ac
            goto L_0x0299
        L_0x03d4:
            r6 = r8
            goto L_0x030c
        L_0x03d7:
            r0 = r8
            goto L_0x02e1
        L_0x03da:
            r0 = r40
            X.Lix r1 = X.C63446KxB.A00(r0, r1)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.UzF r0 = X.C16679UzF.WISH_LIST
            r1.A0H(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231142qw.A00(X.3Ym, X.Vui, X.2qw):void");
    }

    public C231142qw(Context context, FragmentActivity fragmentActivity, RankingInfo rankingInfo, UserSession userSession, AnonymousClass4DU r12, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = r12;
        this.A0C = str;
        this.A0F = str2;
        String str10 = str3;
        this.A0G = str10;
        this.A0D = z;
        this.A0A = str4;
        this.A07 = str5;
        this.A09 = str6;
        this.A05 = num;
        this.A0E = z2;
        this.A06 = str7;
        this.A08 = str8;
        this.A0B = str9;
        RankingInfo rankingInfo2 = rankingInfo;
        this.A04 = new C231152qx(rankingInfo2, userSession, r12, str2, str10, str);
    }
}
