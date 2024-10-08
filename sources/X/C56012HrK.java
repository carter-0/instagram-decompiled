package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.List;

/* renamed from: X.HrK  reason: case insensitive filesystem */
public final class C56012HrK {
    public C270594gz A00;
    public 1Xj A01;
    public AnonymousClass3W1 A02;
    public AndroidLink A03;
    public C16560UxC A04;
    public C273414mX A05;
    public C262944Gp A06;
    public Integer A07 = AnonymousClass05K.A00;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;
    public final C55655HlE A0D;
    public final FragmentActivity A0E;
    public final UserSession A0F;
    public final AnonymousClass4DU A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0145, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36328289383496901L) == false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015f, code lost:
        if (r9 == X.C16560UxC.A07) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0181, code lost:
        if (X.C51968G9o.A1W(r4, r8) != false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019a, code lost:
        if (r13 == X.C16560UxC.A07) goto L_0x019c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r32 = this;
            r5 = r32
            com.instagram.common.session.UserSession r4 = r5.A0F
            X.7Pr r3 = X.DbS.A0W(r4)
            X.4mX r0 = r5.A05
            r3.A0U = r0
            X.4Gp r0 = r5.A06
            r3.A0X = r0
            java.lang.Integer r0 = r5.A07
            int r2 = r0.intValue()
            r1 = 0
            if (r2 == r1) goto L_0x03af
            r0 = 1
            if (r2 != r0) goto L_0x002e
            r0 = 1061158912(0x3f400000, float:0.75)
            r3.A03 = r0
            X.1Xj r0 = r5.A01
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.A6X(r4)
            if (r0 != 0) goto L_0x002b
            r1 = 1
        L_0x002b:
            X.DbS.A1S(r3, r1)
        L_0x002e:
            X.1Xj r6 = r5.A01
            if (r6 == 0) goto L_0x00db
            X.1Xj r0 = r6.A1e(r4)
            java.util.ArrayList r1 = r0.A3A()
            if (r1 == 0) goto L_0x00db
            com.instagram.user.model.UpcomingEvent r2 = r6.A27(r4)
            boolean r0 = X.C51968G9o.A1W(r4, r6)
            if (r0 == 0) goto L_0x00db
            int r1 = r1.size()
            r0 = 1
            if (r1 != r0) goto L_0x00db
            int r0 = r6.A0z()
            if (r0 != 0) goto L_0x00db
            if (r2 != 0) goto L_0x00db
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326790439909345(0x810f06000037e1, double:3.0365467782182675E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00db
            X.1Xj r12 = r5.A01
            if (r12 == 0) goto L_0x00bc
            X.3W1 r13 = r5.A02
            androidx.fragment.app.FragmentActivity r2 = r5.A0E
            java.lang.String r6 = r5.A08
            com.instagram.model.androidlink.AndroidLink r11 = r5.A03
            X.4gz r7 = r5.A00
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            X.UcC r10 = new X.UcC
            r10.<init>()
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r12.getId()
            java.lang.String r0 = "media_id"
            r5.putString(r0, r1)
            r10.setArguments(r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.shopping.fragment.pdp.minipdp.MiniPDPFragment"
            X.0qQ.A0C(r10, r0)
            r5 = 0
            if (r11 != 0) goto L_0x00bd
            X.1Xy r0 = r12.A0C
            java.lang.String r0 = r0.BMq()
            if (r0 == 0) goto L_0x00a0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00bd
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A03 = r0
            X.DbS.A1S(r3, r5)
            r3.A0T = r10
            if (r6 != 0) goto L_0x00b0
            java.lang.String r6 = X.LTZ.A03(r2, r12)
        L_0x00b0:
            r3.A0d = r6
            X.7Pu r0 = r3.A00()
            r0.A0Q(r1)
            r0.A02(r2, r10)
        L_0x00bc:
            return
        L_0x00bd:
            r1 = 1
            if (r11 == 0) goto L_0x00c6
            java.lang.String r0 = r11.Awc()
            if (r0 != 0) goto L_0x00cc
        L_0x00c6:
            X.1Xy r0 = r12.A0C
            java.lang.String r0 = r0.BMq()
        L_0x00cc:
            r3.A0g = r0
            r9 = 6
            X.FOW r8 = new X.FOW
            r14 = r4
            r15 = r10
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r3.A0K = r8
            goto L_0x00a1
        L_0x00db:
            X.4DU r0 = r5.A0G
            r31 = r0
            X.1Xj r8 = r5.A01
            X.3W1 r12 = r5.A02
            androidx.fragment.app.FragmentActivity r7 = r5.A0E
            java.lang.String r0 = r5.A0B
            r17 = r0
            java.lang.String r6 = r5.A08
            com.instagram.model.androidlink.AndroidLink r11 = r5.A03
            X.4gz r0 = r5.A00
            r30 = r0
            java.lang.String r15 = r5.A0A
            java.lang.String r14 = r5.A09
            java.util.List r9 = r5.A0C
            X.UxC r1 = r5.A04
            X.3kF r0 = X.C249713kF.A00
            X.W3Y r18 = r0.A0T()
            r13 = 0
            if (r12 == 0) goto L_0x03aa
            X.1sy r0 = r12.A0o
            int r2 = r12.A03
            java.lang.Integer r25 = java.lang.Integer.valueOf(r2)
        L_0x010a:
            r2 = 0
            r26 = r6
            r27 = r17
            r28 = r15
            r29 = r9
            r20 = r8
            r21 = r31
            r22 = r0
            r23 = r13
            r24 = r1
            r19 = r4
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment r10 = r18.A0F(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment"
            X.0qQ.A0C(r10, r0)
            if (r8 == 0) goto L_0x0147
            boolean r0 = r8.A63()
            if (r0 == 0) goto L_0x0134
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A03 = r0
        L_0x0134:
            boolean r0 = X.C51968G9o.A1W(r4, r8)
            if (r0 == 0) goto L_0x0147
            X.0Tu r9 = X.0Tu.A05
            r0 = 36328289383496901(0x81106300003cc5, double:3.0374947161787993E-306)
            boolean r0 = X.182.A06(r9, r4, r0)
            if (r0 == 0) goto L_0x03a4
        L_0x0147:
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0150
            X.DbS.A1S(r3, r2)
        L_0x0150:
            if (r8 != 0) goto L_0x03a4
            r1 = r13
        L_0x0153:
            X.UxC r0 = X.C16560UxC.ADS_PRODUCT_PAGE
            if (r1 == r0) goto L_0x0161
            if (r8 == 0) goto L_0x03a1
            X.UxC r9 = r8.A25()
        L_0x015d:
            X.UxC r1 = X.C16560UxC.SHOPLESS_IN_APP_BROWSER
            if (r9 != r1) goto L_0x0164
        L_0x0161:
            X.DbS.A1S(r3, r2)
        L_0x0164:
            r9 = 1
            if (r8 == 0) goto L_0x0183
            com.instagram.model.shopping.reels.ReelMultiProductLinkIntf r1 = r8.A20()
            if (r1 != 0) goto L_0x0183
            X.1Xy r1 = r8.A0C
            java.lang.String r1 = r1.BMq()
            if (r1 == 0) goto L_0x0183
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0183
            boolean r1 = X.C51968G9o.A1W(r4, r8)
            r16 = 1
            if (r1 != 0) goto L_0x0185
        L_0x0183:
            r16 = 0
        L_0x0185:
            if (r11 != 0) goto L_0x0189
            if (r16 == 0) goto L_0x018a
        L_0x0189:
            r2 = 1
        L_0x018a:
            if (r8 == 0) goto L_0x0196
            X.UxC r1 = r8.A25()
            if (r1 == r0) goto L_0x019c
            X.UxC r13 = r8.A25()
        L_0x0196:
            X.UxC r0 = X.C16560UxC.SHOPLESS_IN_APP_BROWSER
            r16 = 0
            if (r13 != r0) goto L_0x019e
        L_0x019c:
            r16 = 1
        L_0x019e:
            java.lang.String r0 = r5.A0A
            boolean r0 = X.C55146Hcu.A00(r0)
            if (r0 == 0) goto L_0x036e
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.A03 = r0
            X.DbS.A1S(r3, r9)
            r3.A1G = r9
            r16 = 1
            r2 = 0
        L_0x01b2:
            X.0Tu r11 = X.0Tu.A05
            r0 = 36311835363771167(0x81016c0000031f, double:3.027089127849226E-306)
            boolean r0 = X.182.A06(r11, r4, r0)
            if (r0 == 0) goto L_0x036a
            if (r16 != 0) goto L_0x036a
            r25 = 1
            X.3kF r0 = X.C249713kF.A00
            java.lang.Integer r1 = r0.A0Y(r4)
            r24 = 4
            X.FOD r0 = new X.FOD
            r18 = r0
            r19 = r4
            r20 = r8
            r21 = r7
            r22 = r31
            r23 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.7Pt r0 = X.C55149Hcx.A00(r7, r0, r1)
            r3.A07(r0)
        L_0x01e3:
            r3.A0T = r10
            if (r6 != 0) goto L_0x01eb
            java.lang.String r6 = X.LTZ.A03(r7, r8)
        L_0x01eb:
            r3.A0d = r6
            X.7Pu r1 = r3.A00()
            r1.A0Q(r2)
            X.IXh r0 = new X.IXh
            r18 = r0
            r19 = r7
            r20 = r4
            r21 = r8
            r22 = r31
            r23 = r1
            r24 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r10.A07 = r0
            r1.A02(r7, r10)
            if (r8 == 0) goto L_0x00bc
            X.HlE r7 = r5.A0D
            boolean r0 = r8.A5G()
            r2 = 0
            if (r0 == 0) goto L_0x0363
            X.1sQ r0 = X.C51966G9m.A0n(r8)
            if (r0 == 0) goto L_0x0360
            com.instagram.model.shopping.clips.ClipsShoppingInfoIntf r0 = r0.Btl()
            if (r0 == 0) goto L_0x0360
            java.util.List r1 = X.C17023VEx.A00(r0)
        L_0x0227:
            X.1sQ r0 = X.C51966G9m.A0n(r8)
            if (r0 == 0) goto L_0x0367
            com.instagram.model.shopping.clips.ClipsShoppingInfoIntf r0 = r0.Btl()
            if (r0 == 0) goto L_0x0367
            com.instagram.user.model.ProductCollection r9 = r0.Aoo()
        L_0x0237:
            X.0wc r4 = r7.A00
            X.1Ln r6 = X.1Ln.A02(r4)
            boolean r0 = X.DbT.A1Y(r6)
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x02ca
            r3 = r17
            if (r17 != 0) goto L_0x024a
            r3 = r5
        L_0x024a:
            java.lang.String r0 = "shopping_session_id"
            r6.A0R(r0, r3)
            X.V1Y r3 = X.V1Y.BOTTOM_SHEET
            java.lang.String r0 = "analytics_module"
            r6.A0M(r3, r0)
            java.lang.String r3 = "instagram_shopping_bottom_sheet_impression"
            java.lang.String r0 = "legacy_event_name"
            r6.A0R(r0, r3)
            r3 = r14
            if (r14 != 0) goto L_0x0261
            r3 = r5
        L_0x0261:
            java.lang.String r0 = "legacy_referral_surface"
            r6.A0R(r0, r3)
            r3 = r15
            if (r15 != 0) goto L_0x026a
            r3 = r5
        L_0x026a:
            r0 = 1548(0x60c, float:2.169E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R(r0, r3)
            X.4DU r0 = r7.A01
            java.lang.String r3 = r0.getModuleName()
            r0 = 800(0x320, float:1.121E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0R(r0, r3)
            java.lang.String r0 = r8.getId()
            r6.A0m(r0)
            if (r9 == 0) goto L_0x035d
            com.instagram.api.schemas.ProductCollectionV2Type r0 = r9.Aou()
            if (r0 == 0) goto L_0x035d
            java.lang.String r3 = r0.toString()
        L_0x0295:
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A0R(r0, r3)
            if (r1 == 0) goto L_0x035a
            java.util.Map r0 = X.C294165ly.A0D(r1)
        L_0x02a4:
            r6.A0y(r0)
            if (r1 == 0) goto L_0x0357
            java.lang.Boolean r3 = X.C294165ly.A08(r1)
        L_0x02ad:
            java.lang.String r0 = "is_checkout_enabled"
            r6.A0O(r0, r3)
            if (r9 == 0) goto L_0x02c7
            java.lang.String r3 = r9.Aoi()
            if (r3 == 0) goto L_0x02c7
            r0 = 88
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r3)
            r6.A0x(r0)
        L_0x02c7:
            r6.Cgf()
        L_0x02ca:
            java.lang.String r0 = "instagram_shopping_bottom_sheet_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r4, r0)
            java.lang.String r0 = r8.getId()
            if (r0 != 0) goto L_0x02d7
            r0 = r5
        L_0x02d7:
            X.C51965G9l.A1I(r3, r0)
            X.327 r6 = new X.327
            r6.<init>()
            r0 = 365(0x16d, float:5.11E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A06(r0, r15)
            java.lang.String r0 = "prior_module"
            r6.A06(r0, r14)
            java.lang.String r4 = "shopping_session_id"
            r0 = r17
            r6.A06(r4, r0)
            java.lang.String r4 = X.DbS.A0k()
            java.lang.String r0 = "nav_chain"
            r6.A06(r0, r4)
            java.lang.String r0 = "navigation_info"
            r3.AAK(r6, r0)
            X.C51972G9s.A14(r3, r8)
            if (r1 == 0) goto L_0x0355
            java.util.Map r4 = X.C294165ly.A0D(r1)
        L_0x030b:
            java.lang.String r0 = "product_merchant_ids"
            r3.A9H(r0, r4)
            if (r1 == 0) goto L_0x0353
            java.lang.Boolean r1 = X.C294165ly.A08(r1)
        L_0x0316:
            java.lang.String r0 = "is_checkout_enabled"
            r3.A7p(r0, r1)
            if (r9 == 0) goto L_0x0346
            X.3sW r1 = new X.3sW
            r1.<init>()
            java.lang.String r0 = r9.Aoi()
            if (r0 == 0) goto L_0x0329
            r5 = r0
        L_0x0329:
            r0 = 88
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A06(r0, r5)
            com.instagram.api.schemas.ProductCollectionV2Type r0 = r9.Aou()
            if (r0 == 0) goto L_0x033c
            java.lang.String r2 = r0.toString()
        L_0x033c:
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A06(r0, r2)
            r2 = r1
        L_0x0346:
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.AAK(r2, r0)
            r3.Cgf()
            return
        L_0x0353:
            r1 = r2
            goto L_0x0316
        L_0x0355:
            r4 = r2
            goto L_0x030b
        L_0x0357:
            r3 = r2
            goto L_0x02ad
        L_0x035a:
            r0 = r2
            goto L_0x02a4
        L_0x035d:
            r3 = r2
            goto L_0x0295
        L_0x0360:
            r1 = r2
            goto L_0x0227
        L_0x0363:
            java.util.ArrayList r1 = r8.A3K(r9)
        L_0x0367:
            r9 = r2
            goto L_0x0237
        L_0x036a:
            r25 = 0
            goto L_0x01e3
        L_0x036e:
            if (r2 == 0) goto L_0x01b2
            if (r11 == 0) goto L_0x0378
            java.lang.String r0 = r11.Awc()
            if (r0 != 0) goto L_0x0381
        L_0x0378:
            X.0qQ.A0A(r8)
            X.1Xy r0 = r8.A0C
            java.lang.String r0 = r0.BMq()
        L_0x0381:
            r3.A0g = r0
            X.0qQ.A0A(r8)
            r19 = 6
            X.FOW r0 = new X.FOW
            r21 = r11
            r22 = r8
            r23 = r12
            r24 = r4
            r25 = r10
            r26 = r30
            r18 = r0
            r20 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r3.A0K = r0
            goto L_0x01b2
        L_0x03a1:
            r9 = r13
            goto L_0x015d
        L_0x03a4:
            X.UxC r1 = r8.A25()
            goto L_0x0153
        L_0x03aa:
            r0 = r13
            r25 = r13
            goto L_0x010a
        L_0x03af:
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A03 = r0
            X.1Xj r0 = r5.A01
            if (r0 == 0) goto L_0x03be
            boolean r0 = r0.A6X(r4)
            if (r0 != 0) goto L_0x03be
            r1 = 1
        L_0x03be:
            X.DbS.A1S(r3, r1)
            r0 = 1
            r3.A1B = r0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56012HrK.A00():void");
    }

    public C56012HrK(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r4) {
        this.A0E = fragmentActivity;
        this.A0G = r4;
        this.A0F = userSession;
        this.A0D = new C55655HlE(userSession, r4);
    }
}
