package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

public final class WNN implements C267664bz {
    public int A00 = -1;
    public long A01;
    public DialogInterface.OnDismissListener A02;
    public RankingInfo A03;
    public 1Xj A04;
    public ProductTileMedia A05;
    public C255783ui A06;
    public C310206ab A07;
    public C59631JQz A08;
    public C16560UxC A09 = C16560UxC.PRODUCT_DETAILS_PAGE;
    public ShoppingSearchLoggingInfo A0A;
    public 2EG A0B;
    public Integer A0C = -1;
    public Integer A0D = -1;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final FragmentActivity A0c;
    public final ProductReviewStatus A0d;
    public final UserSession A0e;
    public final AnonymousClass4DU A0f;
    public final AnonymousClass37D A0g;
    public final Product A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;

    public final void A8T(0xI r3) {
        0qQ.A0B(r3, 0);
        r3.A0C("entity_id", this.A0k);
        r3.A0C("merchant_id", this.A0j);
        Product product = this.A0h;
        if (product != null) {
            r3.A0C(AnonymousClass000.A00(1166), DbX.A0t(product.A01.A00));
        }
        1Xj r0 = this.A04;
        if (r0 != null) {
            r3.A0C("media_id", r0.A30());
            UserSession userSession = this.A0e;
            1Xj r02 = this.A04;
            0qQ.A0A(r02);
            r3.A0C("tracking_token", C231122qu.A0F(userSession, r02));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0281, code lost:
        if (r3.intValue() <= 0) goto L_0x0283;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.WNN r65) {
        /*
            r0 = r65
            boolean r1 = r0.A0X
            if (r1 == 0) goto L_0x0068
            java.lang.String r14 = r0.A0k
            java.lang.String r15 = r0.A0j
            com.instagram.user.model.Product r7 = r0.A0h
            X.1Xj r10 = r0.A04
            X.4DU r4 = r0.A0f
            java.lang.String r5 = r0.A0i
            java.lang.String r3 = r0.A0l
            java.lang.String r6 = r0.A0N
            java.lang.String r2 = r0.A0O
            boolean r1 = r0.A0V
            com.instagram.common.session.UserSession r9 = r0.A0e
            if (r7 == 0) goto L_0x0022
            boolean r1 = r7.A04()
        L_0x0022:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            r11 = 0
            if (r7 == 0) goto L_0x02e5
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r7.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r11 = r1.A0C
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r12 = r1.A0F
        L_0x002f:
            java.lang.String r8 = "viewer_entry"
            java.lang.String r7 = "instagram_shopping"
            java.lang.String r1 = "_"
            java.lang.String r1 = X.002.A0g(r7, r1, r8)
            X.3sc r8 = new X.3sc
            r8.<init>(r4, r1)
            r8.A0G(r9, r10)
            r8.A6S = r6
            r8.A6T = r2
            r8.A5C = r5
            java.lang.String r1 = "shopping"
            r8.A4J = r1
            r8.A5K = r5
            java.lang.String r1 = X.C231122qu.A0F(r9, r10)
            r8.A7J = r1
            r8.A0H(r9, r10, r11, r12, r13, r14, r15)
            X.0jB r2 = new X.0jB
            r2.<init>()
            java.lang.String r1 = "shopping_session_id"
            if (r3 == 0) goto L_0x0062
            r2.A0A(r1, r3)
        L_0x0062:
            r8.A0E(r2)
            X.C18694Vws.A00(r9, r8, r10, r4)
        L_0x0068:
            com.instagram.user.model.Product r2 = r0.A0h
            if (r2 == 0) goto L_0x02c4
            com.instagram.common.session.UserSession r1 = r0.A0e
            X.ULx r6 = X.C294165ly.A03(r1, r2)
        L_0x0072:
            com.instagram.common.session.UserSession r1 = r0.A0e
            X.4DU r3 = r0.A0f
            r23 = r3
            X.0wc r4 = X.AnonymousClass0kN.A01(r3, r1)
            java.lang.String r3 = "instagram_commerce_viewer_entry"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r4, r3)
            X.C15054ULx.A02(r5, r6)
            java.lang.String r4 = r0.A0T
            r22 = 0
            if (r4 == 0) goto L_0x02c0
            int r3 = r4.length()
            if (r3 <= 0) goto L_0x02c0
        L_0x0091:
            java.lang.String r3 = "submodule"
            r5.AAJ(r3, r4)
            java.lang.String r4 = r0.A0S
            java.lang.String r3 = "shops_first_entry_point"
            r5.AAJ(r3, r4)
            java.lang.String r4 = "v0.1"
            java.lang.String r3 = "central_pdp_version"
            r5.AAJ(r3, r4)
            java.lang.String r4 = r0.A0F
            if (r4 == 0) goto L_0x00b7
            int r3 = r4.length()
            if (r3 == 0) goto L_0x00b7
            X.4Ny r4 = X.C263944Ny.A00(r4)
            java.lang.String r3 = "marketer_id"
            r5.AAE(r4, r3)
        L_0x00b7:
            java.lang.Boolean r4 = r6.A04
            java.lang.String r3 = "is_checkout_enabled"
            r5.A7p(r3, r4)
            java.lang.Long r4 = r6.A07
            r3 = 366(0x16e, float:5.13E-43)
            java.lang.String r3 = X.C273654mx.A00(r3)
            r5.A9F(r3, r4)
            java.lang.Long r4 = r6.A06
            java.lang.String r3 = "drops_launch_date"
            r5.A9F(r3, r4)
            java.lang.Boolean r4 = r6.A03
            java.lang.String r3 = "has_drops_launched"
            r5.A7p(r3, r4)
            java.lang.String r4 = r0.A0N
            java.lang.String r21 = "prior_module"
            r3 = r21
            r5.AAJ(r3, r4)
            java.lang.String r4 = r0.A0O
            java.lang.String r3 = "prior_submodule"
            r5.AAJ(r3, r4)
            java.lang.String r3 = r0.A0i
            r49 = r3
            java.lang.String r15 = "entry_point"
            r5.AAJ(r15, r3)
            java.lang.String r4 = r23.getModuleName()
            java.lang.String r3 = "source_of_action"
            r5.AAJ(r3, r4)
            java.lang.String r3 = r0.A0l
            r56 = r3
            java.lang.String r4 = "shopping_session_id"
            X.C51973G9u.A14(r5, r4, r3)
            X.1Xj r6 = r0.A04
            if (r6 == 0) goto L_0x01b2
            java.lang.Integer r4 = r0.A0E
            java.lang.String r3 = r0.A0k
            X.UKi r6 = X.C294165ly.A07(r6, r4, r3)
            if (r6 == 0) goto L_0x01b2
            java.lang.String r3 = r6.A05
            X.C51965G9l.A1I(r5, r3)
            long r3 = r6.A00
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "m_t"
            r5.A9F(r3, r4)
            java.lang.String r3 = r6.A06
            X.C51965G9l.A1L(r5, r3)
            X.9Iz r7 = r6.A01
            if (r7 == 0) goto L_0x02bc
            java.lang.Object r4 = r7.A00
            java.lang.Long r4 = (java.lang.Long) r4
        L_0x012d:
            java.lang.String r3 = "carousel_index"
            r5.A9F(r3, r4)
            if (r7 == 0) goto L_0x02b8
            java.lang.String r4 = r7.A02
        L_0x0136:
            java.lang.String r3 = "carousel_media_id"
            r5.AAJ(r3, r4)
            if (r7 == 0) goto L_0x02b4
            java.lang.Object r4 = r7.A01
            java.lang.Long r4 = (java.lang.Long) r4
        L_0x0141:
            r3 = 2142(0x85e, float:3.002E-42)
            java.lang.String r3 = X.C273654mx.A00(r3)
            r5.A9F(r3, r4)
            X.5lz r7 = r6.A03
            if (r7 == 0) goto L_0x02b0
            java.util.List r4 = r7.A03
        L_0x0150:
            java.lang.String r3 = "product_ids"
            r5.AAe(r3, r4)
            if (r7 == 0) goto L_0x02ac
            java.util.Map r4 = r7.A08
        L_0x0159:
            java.lang.String r3 = "product_merchant_ids"
            r5.A9H(r3, r4)
            if (r7 == 0) goto L_0x02a8
            java.util.List r4 = r7.A02
        L_0x0162:
            java.lang.String r3 = "drops_product_ids"
            r5.AAe(r3, r4)
            if (r7 == 0) goto L_0x02a4
            java.util.List r4 = r7.A04
        L_0x016b:
            java.lang.String r3 = "tagged_user_ids"
            r5.AAe(r3, r4)
            X.Jw8 r7 = r6.A02
            if (r7 == 0) goto L_0x02a0
            java.lang.String r4 = r7.A03
        L_0x0176:
            r3 = 3160(0xc58, float:4.428E-42)
            java.lang.String r3 = X.C273654mx.A00(r3)
            r5.AAJ(r3, r4)
            if (r7 == 0) goto L_0x029c
            java.lang.Object r4 = r7.A02
            java.util.List r4 = (java.util.List) r4
        L_0x0185:
            r3 = 395(0x18b, float:5.54E-43)
            java.lang.String r3 = X.C273654mx.A00(r3)
            r5.AAe(r3, r4)
            if (r7 == 0) goto L_0x0298
            java.lang.Object r4 = r7.A01
            java.util.List r4 = (java.util.List) r4
        L_0x0194:
            java.lang.String r3 = "shared_product_ids"
            r5.AAe(r3, r4)
            if (r7 == 0) goto L_0x0294
            java.lang.Object r4 = r7.A00
            java.util.Map r4 = (java.util.Map) r4
        L_0x019f:
            java.lang.String r3 = "profile_shop_link"
            r5.A9H(r3, r4)
            java.lang.String r4 = "broadcast_id"
            r3 = r22
            r5.A9F(r4, r3)
            java.lang.String r4 = r6.A04
            java.lang.String r3 = "ranking_info_token"
            r5.AAJ(r3, r4)
        L_0x01b2:
            r3 = r23
            boolean r3 = r3 instanceof X.C232682uF
            r20 = r3
            r4 = 0
            if (r3 == 0) goto L_0x01c5
            r3 = r23
            X.2uF r3 = (X.C232682uF) r3
            if (r3 == 0) goto L_0x01c5
            X.0jB r4 = r3.E4k()
        L_0x01c5:
            X.9JL r6 = X.C294165ly.A01(r4)
            if (r6 == 0) goto L_0x01e8
            java.lang.String r4 = r6.A04
            java.lang.String r3 = "parent_m_pk"
            r5.AAJ(r3, r4)
            java.lang.String r4 = r6.A03
            java.lang.String r3 = "chaining_session_id"
            r5.AAJ(r3, r4)
            java.lang.Object r3 = r6.A01
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x0290
            java.lang.Long r4 = X.C51969G9p.A0r(r3)
        L_0x01e3:
            java.lang.String r3 = "chaining_position"
            r5.A9F(r3, r4)
        L_0x01e8:
            r19 = 0
            r5.Cgf()
            X.UxC r4 = r0.A09
            X.UxC r3 = X.C16560UxC.PRODUCT_DETAILS_PAGE
            r18 = 1
            r35 = 0
            if (r4 != r3) goto L_0x0304
            r13 = 9
            X.WxP r3 = new X.WxP
            r3.<init>(r1, r13)
            java.lang.Class<X.VTZ> r12 = X.VTZ.class
            java.lang.Object r4 = r1.A01(r12, r3)
            X.VTZ r4 = (X.VTZ) r4
            java.lang.String r3 = r0.A0k
            r24 = r3
            boolean r17 = X.AnonymousClass7TF.A1V(r2)
            java.lang.String r11 = r23.getModuleName()
            X.1Xj r3 = r0.A04
            if (r3 == 0) goto L_0x028d
            java.lang.String r10 = X.C231122qu.A07(r1, r3)
        L_0x021a:
            r9 = 2
            int[] r8 = new int[r9]
            r8 = {37355522, 37355521} // fill-array
            X.02m r7 = X.02m.A0p
            r6 = 0
        L_0x0223:
            r5 = r8[r6]
            monitor-enter(r4)
            java.util.Set r14 = r4.A00     // Catch:{ all -> 0x0300 }
            java.lang.Integer r3 = X.C13990Tnq.A0Z(r14, r5)     // Catch:{ all -> 0x0300 }
            r14.add(r3)     // Catch:{ all -> 0x0300 }
            monitor-exit(r4)
            r7.markerStart(r5)
            java.lang.String r14 = "initial_product_id"
            r3 = r24
            r7.markerAnnotate(r5, r14, r3)
            r3 = r49
            r7.markerAnnotate(r5, r15, r3)
            if (r11 == 0) goto L_0x0246
            r3 = r21
            r7.markerAnnotate(r5, r3, r11)
        L_0x0246:
            if (r10 == 0) goto L_0x024d
            java.lang.String r3 = "ad_id"
            r7.markerAnnotate(r5, r3, r10)
        L_0x024d:
            r3 = 37355521(0x23a0001, float:1.3665123E-37)
            if (r5 != r3) goto L_0x0261
            java.lang.String r16 = "load_source"
            if (r17 == 0) goto L_0x0286
            r3 = 3168(0xc60, float:4.44E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r3)
        L_0x025c:
            r3 = r16
            r7.markerAnnotate(r5, r3, r14)
        L_0x0261:
            int r6 = r6 + 1
            if (r6 < r9) goto L_0x0223
            X.WxP r3 = new X.WxP
            r3.<init>(r1, r13)
            java.lang.Object r4 = r1.A01(r12, r3)
            X.VTZ r4 = (X.VTZ) r4
            if (r2 == 0) goto L_0x0283
            com.instagram.user.model.ProductDetailsProductItemDict r3 = r2.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r3 = r3.A0C
            if (r3 == 0) goto L_0x0283
            java.lang.Integer r3 = r3.A0C
            if (r3 == 0) goto L_0x0283
            int r3 = r3.intValue()
            r8 = 1
            if (r3 > 0) goto L_0x0284
        L_0x0283:
            r8 = 0
        L_0x0284:
            monitor-enter(r4)
            goto L_0x02e8
        L_0x0286:
            r3 = 1377(0x561, float:1.93E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r3)
            goto L_0x025c
        L_0x028d:
            r10 = r22
            goto L_0x021a
        L_0x0290:
            r4 = r22
            goto L_0x01e3
        L_0x0294:
            r4 = r22
            goto L_0x019f
        L_0x0298:
            r4 = r22
            goto L_0x0194
        L_0x029c:
            r4 = r22
            goto L_0x0185
        L_0x02a0:
            r4 = r22
            goto L_0x0176
        L_0x02a4:
            r4 = r22
            goto L_0x016b
        L_0x02a8:
            r4 = r22
            goto L_0x0162
        L_0x02ac:
            r4 = r22
            goto L_0x0159
        L_0x02b0:
            r4 = r22
            goto L_0x0150
        L_0x02b4:
            r4 = r22
            goto L_0x0141
        L_0x02b8:
            r4 = r22
            goto L_0x0136
        L_0x02bc:
            r4 = r22
            goto L_0x012d
        L_0x02c0:
            java.lang.String r4 = r0.A0i
            goto L_0x0091
        L_0x02c4:
            java.lang.String r4 = r0.A0k
            java.lang.String r3 = r0.A0j
            r1 = 0
            X.0qQ.A0B(r4, r1)
            long r14 = X.DbZ.A07(r4)
            if (r3 != 0) goto L_0x02d4
            java.lang.String r3 = "0"
        L_0x02d4:
            X.4Ny r7 = X.C263944Ny.A00(r3)
            r8 = 0
            X.ULx r6 = new X.ULx
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0072
        L_0x02e5:
            r12 = r11
            goto L_0x002f
        L_0x02e8:
            java.util.Set r3 = r4.A00     // Catch:{ all -> 0x0300 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x0300 }
        L_0x02ee:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x0300 }
            if (r3 == 0) goto L_0x0303
            int r6 = X.AnonymousClass7TG.A0F(r7)     // Catch:{ all -> 0x0300 }
            X.02m r5 = X.02m.A0p     // Catch:{ all -> 0x0300 }
            java.lang.String r3 = "is_inventory_available_on_pdp_entry"
            r5.markerAnnotate(r6, r3, r8)     // Catch:{ all -> 0x0300 }
            goto L_0x02ee
        L_0x0300:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0303:
            monitor-exit(r4)
        L_0x0304:
            X.1Xj r3 = r0.A04
            if (r3 == 0) goto L_0x04d7
            java.lang.String r34 = X.C231122qu.A07(r1, r3)
        L_0x030c:
            X.1Xj r3 = r0.A04
            if (r3 == 0) goto L_0x0316
            if (r34 == 0) goto L_0x0316
            java.lang.String r22 = X.C231122qu.A0F(r1, r3)
        L_0x0316:
            X.1Xj r3 = r0.A04
            if (r3 == 0) goto L_0x0320
            if (r34 == 0) goto L_0x0320
            java.lang.String r35 = r3.getId()
        L_0x0320:
            org.json.JSONObject r59 = X.C278474ww.A04(r1)
            r10 = 0
            r6 = 0
            r5 = 0
            r51 = 0
            r4 = 0
            r3 = 0
            X.1Xj r7 = r0.A04
            if (r7 != 0) goto L_0x04d1
            r47 = 0
        L_0x0331:
            java.lang.Integer r7 = r0.A0E
            r32 = r7
            boolean r7 = r0.A0Y
            r63 = r7
            com.instagram.model.shopping.productfeed.ProductTileMedia r7 = r0.A05
            r26 = r7
            java.lang.String r7 = r0.A0L
            r45 = r7
            java.lang.String r7 = r0.A0G
            r38 = r7
            java.lang.String r7 = r0.A0H
            r39 = r7
            java.lang.Integer r7 = r0.A0D
            r31 = r7
            java.lang.Integer r7 = r0.A0C
            r30 = r7
            java.lang.String r7 = r0.A0R
            r55 = r7
            com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo r7 = r0.A0A
            r27 = r7
            boolean r7 = r0.A0U
            r64 = r7
            boolean r7 = r0.A0a
            r65 = r7
            java.lang.String r7 = r0.A0J
            r43 = r7
            java.lang.String r7 = r0.A0S
            r57 = r7
            long r7 = r0.A01
            java.lang.Long r33 = java.lang.Long.valueOf(r7)
            com.instagram.api.schemas.RankingInfo r7 = r0.A03
            r25 = r7
            java.lang.String r7 = r0.A0I
            r24 = r7
            java.lang.String r7 = r0.A0F
            r21 = r7
            java.lang.String r7 = r0.A0P
            r17 = r7
            java.lang.String r15 = r0.A0Q
            boolean r14 = r0.A0W
            java.lang.String r13 = r0.A0K
            java.util.TimeZone r7 = java.util.TimeZone.getDefault()
            java.lang.String r58 = r7.getID()
            java.lang.String r12 = r0.A0M
            java.lang.String r7 = r0.A0T
            if (r7 == 0) goto L_0x0395
            r51 = r7
        L_0x0395:
            if (r2 == 0) goto L_0x04bd
            r4 = r2
        L_0x0398:
            java.lang.String r50 = r23.getModuleName()
            r50.getClass()
            if (r20 == 0) goto L_0x03bd
            X.To7 r8 = new X.To7
            r8.<init>()
            X.1Xj r7 = r0.A04
            if (r7 == 0) goto L_0x04b3
            r9 = r23
            X.2uF r9 = (X.C232682uF) r9
            X.0jB r7 = r9.E4l(r7)
        L_0x03b2:
            r8.A02(r7)
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r8.A01(r10)
        L_0x03bd:
            boolean r11 = r0.A0X
            androidx.fragment.app.FragmentActivity r8 = r0.A0c
            r7 = 2131973751(0x7f135677, float:1.9584547E38)
            java.lang.String r48 = r8.getString(r7)
            X.UxC r7 = r0.A09
            X.UxC r9 = X.C16560UxC.IN_APP_BROWSER
            if (r7 == r9) goto L_0x0497
            X.UxC r9 = X.C16560UxC.SHOPLESS_IN_APP_BROWSER
            if (r7 == r9) goto L_0x0497
            X.UxC r2 = X.C16560UxC.ADS_PRODUCT_PAGE
            if (r7 != r2) goto L_0x0425
            X.37D r2 = r0.A0g
            if (r2 == 0) goto L_0x04db
            X.37F r2 = (X.AnonymousClass37F) r2
            boolean r7 = r2.A0g
            r2 = r18
            if (r7 != r2) goto L_0x04db
            java.lang.Class<com.instagram.modal.ModalActivity> r16 = com.instagram.modal.ModalActivity.class
            X.C18266Vog.A01(r4, r6, r5, r3)
            r60 = -1
            r28 = r19
            r29 = r4
            r36 = r22
            r37 = r21
            r40 = r24
            r41 = r6
            r42 = r5
            r44 = r13
            r46 = r12
            r52 = r17
            r53 = r15
            r54 = r3
            r61 = r14
            r62 = r11
            r24 = r10
            android.os.Bundle r14 = X.C18266Vog.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            r2 = 1439(0x59f, float:2.016E-42)
            java.lang.String r17 = X.C273654mx.A00(r2)
        L_0x0411:
            X.6W8 r12 = new X.6W8
            r13 = r8
            r15 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r1 = r23
            r12.A02 = r1
            r12.A01 = r0
            r12.A07()
            r12.A0C(r8)
        L_0x0424:
            return
        L_0x0425:
            boolean r2 = r0.A0U
            if (r2 == 0) goto L_0x045a
            X.2EG r2 = r0.A0B
            int r0 = r0.A00
            X.C18266Vog.A01(r4, r6, r5, r3)
            r28 = r2
            r29 = r4
            r36 = r22
            r37 = r21
            r40 = r24
            r41 = r6
            r42 = r5
            r44 = r13
            r46 = r12
            r52 = r17
            r53 = r15
            r54 = r3
            r60 = r0
            r61 = r14
            r62 = r11
            r24 = r10
            android.os.Bundle r2 = X.C18266Vog.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            java.lang.String r0 = "product_details_page"
            X.VG2.A00(r2, r8, r1, r0)
            return
        L_0x045a:
            boolean r2 = r0.A0Z
            if (r2 != 0) goto L_0x046a
            X.37D r2 = r0.A0g
            if (r2 == 0) goto L_0x051e
            X.37F r2 = (X.AnonymousClass37F) r2
            boolean r7 = r2.A0g
            r2 = r18
            if (r7 != r2) goto L_0x051e
        L_0x046a:
            java.lang.Class<com.instagram.modal.ModalActivity> r16 = com.instagram.modal.ModalActivity.class
            X.C18266Vog.A01(r4, r6, r5, r3)
            r60 = -1
            r28 = r19
            r29 = r4
            r36 = r22
            r37 = r21
            r40 = r24
            r41 = r6
            r42 = r5
            r44 = r13
            r46 = r12
            r52 = r17
            r53 = r15
            r54 = r3
            r61 = r14
            r62 = r11
            r24 = r10
            android.os.Bundle r14 = X.C18266Vog.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            java.lang.String r17 = "shopping_viewer"
            goto L_0x0411
        L_0x0497:
            r7 = 0
            if (r2 == 0) goto L_0x0424
            java.lang.String r3 = r2.A0F
            if (r3 == 0) goto L_0x0424
            X.1Xj r0 = r0.A04
            if (r0 == 0) goto L_0x04a6
            java.lang.String r7 = r0.getId()
        L_0x04a6:
            java.lang.String r9 = r23.getModuleName()
            r4 = r8
            r5 = r1
            r6 = r2
            r8 = r56
            X.FH7.A0A(r4, r5, r6, r7, r8, r9)
            return
        L_0x04b3:
            r7 = r23
            X.2uF r7 = (X.C232682uF) r7
            X.0jB r7 = r7.E4k()
            goto L_0x03b2
        L_0x04bd:
            java.lang.String r3 = r0.A0k
            r3.getClass()
            java.lang.String r6 = r0.A0j
            r6.getClass()
            java.lang.String r7 = r0.A0m
            if (r7 == 0) goto L_0x0398
            r6.getClass()
            r5 = r7
            goto L_0x0398
        L_0x04d1:
            java.lang.String r47 = r7.getId()
            goto L_0x0331
        L_0x04d7:
            r34 = r22
            goto L_0x030c
        L_0x04db:
            X.6Yo r1 = X.DbU.A0Q(r8, r1)
            X.3kF r2 = X.C249713kF.A00
            r2.A0T()
            X.C18266Vog.A01(r4, r6, r5, r3)
            r60 = -1
            r28 = r19
            r29 = r4
            r36 = r22
            r37 = r21
            r40 = r24
            r41 = r6
            r42 = r5
            r44 = r13
            r46 = r12
            r52 = r17
            r53 = r15
            r54 = r3
            r61 = r14
            r62 = r11
            r24 = r10
            android.os.Bundle r2 = X.C18266Vog.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r3 = new com.instagram.shopping.fragment.pdp.AdsProductPageFragment
            r3.<init>()
            r3.setArguments(r2)
            r2 = r19
            r1.A0B(r2, r3)
            r1.A07 = r0
            r1.A04()
            return
        L_0x051e:
            X.6Yo r2 = X.DbU.A0Q(r8, r1)
            X.3kF r7 = X.C249713kF.A00
            X.W3Y r7 = r7.A0T()
            X.C18266Vog.A01(r4, r6, r5, r3)
            r60 = -1
            r28 = r19
            r29 = r4
            r36 = r22
            r37 = r21
            r40 = r24
            r41 = r6
            r42 = r5
            r44 = r13
            r46 = r12
            r52 = r17
            r53 = r15
            r54 = r3
            r61 = r14
            r62 = r11
            r24 = r10
            android.os.Bundle r3 = X.C18266Vog.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
            androidx.fragment.app.Fragment r3 = r7.A0A(r3, r1)
            r1 = r19
            r2.A0B(r1, r3)
            r2.A07 = r0
            r2.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WNN.A00(X.WNN):void");
    }

    public static final void A01(WNN wnn) {
        C255783ui r0;
        Product product;
        Integer num;
        String A0b2;
        WNN wnn2 = wnn;
        1Xj r13 = wnn2.A04;
        if (!(!wnn2.A0b || r13 == null || wnn2.A0j == null)) {
            UserSession userSession = wnn2.A0e;
            if (C55152Hd0.A00(userSession, r13, wnn2.A0k) && (product = wnn2.A0h) != null) {
                FragmentActivity fragmentActivity = wnn2.A0c;
                WB0 wb0 = new WB0(wnn2, 5);
                C59631JQz jQz = wnn2.A08;
                0gy A002 = AnonymousClass07i.A00(fragmentActivity);
                AnonymousClass4DU r02 = wnn2.A0f;
                String str = product.A0H;
                User user = product.A0B;
                String str2 = null;
                if (user != null) {
                    str2 = AnonymousClass3ZA.A00(user);
                }
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                String str4 = product.A0J;
                if (str4 == null) {
                    str4 = str3;
                }
                if (!(user == null || (A0b2 = C13988Tno.A0b(user)) == null)) {
                    str3 = A0b2;
                }
                boolean A042 = product.A04();
                AnonymousClass7TF.A1C(str, 1, str4);
                if (r13.A5v()) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                I00 i00 = new I00(userSession, r13, r02, str, str2, A042);
                C46498Dg1 dg1 = new C46498Dg1(fragmentActivity, userSession);
                dg1.A08(fragmentActivity.getResources().getString(2131973774, new Object[]{str4, str3}));
                dg1.A04(new ID2(51, (Object) i00, (Object) wb0), 2131973777);
                int i = 2131973776;
                if (num.intValue() != 0) {
                    i = 2131973775;
                }
                UserSession userSession2 = userSession;
                dg1.A02(new C56784ICh(fragmentActivity, num, A002, userSession2, jQz, i00, r13, str2, str, 0), i);
                if (jQz != null) {
                    dg1.A03 = new IVE(jQz, 5);
                }
                0Aj A0e2 = AnonymousClass7TE.A0e(i00.A01, "instagram_shopping_merchant_product_action_sheet_opened");
                A0e2.A9F("product_id", Long.valueOf(i00.A00));
                C13988Tno.A1A(A0e2, i00.A03);
                A0e2.A7p("is_checkout_enabled", Boolean.valueOf(i00.A04));
                1Xj r4 = i00.A02;
                C51974G9v.A0p(A0e2, r4, "m_pk", r4.getId());
                A0e2.Cgf();
                AnonymousClass37D A022 = AnonymousClass37D.A00.A02(fragmentActivity);
                if (A022 != null) {
                    AnonymousClass37F r2 = (AnonymousClass37F) A022;
                    if (r2.A0g) {
                        A022.A0B();
                        r2.A0H = new C19688Wdq(1, fragmentActivity, dg1);
                        return;
                    }
                }
                C13988Tno.A0r(fragmentActivity, dg1);
                return;
            }
        }
        ProductReviewStatus productReviewStatus = wnn2.A0d;
        if (productReviewStatus != ProductReviewStatus.APPROVED || ((r0 = wnn2.A06) != null && r0.A07() == TextReviewStatus.REJECTED)) {
            C249713kF r7 = C249713kF.A00;
            FragmentActivity fragmentActivity2 = wnn2.A0c;
            AnonymousClass4DU r14 = wnn2.A0f;
            UserSession userSession3 = wnn2.A0e;
            boolean z = wnn2.A0Z;
            String str5 = wnn2.A0k;
            String str6 = str5;
            r7.A1K(wnn2.A02, (DialogInterface.OnShowListener) null, fragmentActivity2, productReviewStatus, userSession3, r13, r14, wnn2.A07, str6, wnn2.A0i, z);
            return;
        }
        A00(wnn2);
    }

    public final void A02(1Xj r1, Integer num) {
        this.A04 = r1;
        this.A0E = num;
    }

    public WNN(FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, AnonymousClass4DU r6, String str, String str2, String str3, String str4, String str5) {
        this.A0c = fragmentActivity;
        this.A0h = null;
        this.A0k = str;
        this.A0d = productReviewStatus;
        this.A0j = str2;
        this.A0m = str3;
        this.A0e = userSession;
        this.A0f = r6;
        this.A0i = str4;
        this.A0l = str5;
        this.A0g = DbT.A0i(fragmentActivity);
    }

    public WNN(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r6, Product product, String str, String str2) {
        String str3;
        this.A0c = fragmentActivity;
        this.A0h = product;
        this.A0k = product.A0H;
        this.A0d = product.A05;
        User user = product.A0B;
        String str4 = null;
        if (user != null) {
            str3 = AnonymousClass3ZA.A00(user);
        } else {
            str3 = null;
        }
        0qQ.A0A(str3);
        this.A0j = str3;
        this.A0m = user != null ? C13988Tno.A0b(user) : str4;
        this.A0e = userSession;
        this.A0f = r6;
        this.A0i = str;
        this.A0l = str2;
        this.A0g = DbT.A0i(fragmentActivity);
    }
}
