package X;

public abstract class VAF {
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x034d, code lost:
        if (r11.A0v == com.instagram.business.promote.model.PromoteLaunchOrigin.MEDIA_PICKER) goto L_0x034f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(androidx.fragment.app.FragmentActivity r22, X.C16678UzE r23, X.C15254UXo r24, com.instagram.business.promote.model.PromoteData r25, com.instagram.business.promote.model.PromoteState r26, com.instagram.common.session.UserSession r27) {
        /*
            r9 = 0
            r11 = r25
            r10 = r27
            boolean r8 = X.AnonymousClass7TF.A1U(r9, r10, r11)
            r7 = 2
            r14 = r26
            X.0qQ.A0B(r14, r7)
            r12 = r24
            X.VdF r6 = r12.A03
            if (r6 == 0) goto L_0x03c4
            java.lang.String r0 = r6.A0P
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "0"
        L_0x001b:
            r11.A1L = r0
            java.lang.String r0 = r6.A0T
            r11.A1Q = r0
            java.lang.String r0 = r6.A0U
            r11.A1R = r0
            com.instagram.common.typedurl.ImageUrl r0 = r6.A0G
            r11.A10 = r0
            java.lang.String r1 = r6.A0S
            r5 = 0
            if (r1 == 0) goto L_0x0185
            java.util.Map r0 = com.instagram.model.mediatype.ProductType.A01
            java.lang.Object r0 = r0.get(r1)
            com.instagram.model.mediatype.ProductType r0 = (com.instagram.model.mediatype.ProductType) r0
        L_0x0036:
            r11.A17 = r0
            java.lang.String r0 = r6.A0M
            r11.A1B = r0
            java.lang.String r0 = r6.A0O
            java.util.Currency r0 = java.util.Currency.getInstance(r0)
            r11.A1j = r0
            int r0 = r6.A00
            r11.A06 = r0
            java.util.List r0 = r6.A0a
            r11.A1n = r0
            boolean r0 = r6.A0m
            r11.A2n = r0
            java.lang.Boolean r0 = r6.A0L
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r11.A33 = r0
            com.instagram.api.schemas.XIGIGBoostCallToAction r3 = r6.A09
            r11.A0b = r3
            java.lang.String r2 = r6.A0X
            r11.A1I = r2
            boolean r0 = r6.A0n
            r11.A32 = r0
            boolean r0 = r6.A0p
            r11.A2s = r0
            boolean r0 = r6.A0j
            r11.A2j = r0
            boolean r0 = r6.A0k
            r11.A2k = r0
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r6.A0C
            r11.A0g = r1
            r11.A1W = r2
            r11.A0c = r3
            java.lang.String r0 = r6.A0W
            r11.A1X = r0
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r6.A0E
            r11.A0h = r0
            com.instagram.api.schemas.DestinationRecommendationReason r0 = r6.A07
            r11.A0S = r0
            java.lang.String r0 = r6.A0Q
            r11.A1V = r0
            boolean r0 = X.DbW.A1a(r1)
            r11.A2f = r0
            int r0 = r6.A01
            r11.A08 = r0
            int r0 = r6.A02
            r11.A09 = r0
            boolean r0 = r6.A0i
            r11.A2q = r0
            r11.A2r = r8
            java.lang.Boolean r0 = r6.A0J
            if (r0 != 0) goto L_0x017f
            r0 = 0
        L_0x00a1:
            r11.A2Z = r0
            com.instagram.api.schemas.DEPProgramLevelContentResponse r0 = r6.A06
            r11.A0R = r0
            boolean r0 = r6.A0f
            r11.A2F = r0
            boolean r0 = r6.A0h
            r11.A2V = r0
            boolean r0 = r6.A0o
            r11.A2p = r0
            java.lang.String r0 = r6.A0N
            r11.A1G = r0
            java.lang.Boolean r0 = r6.A0I
            boolean r0 = r0.booleanValue()
            r11.A29 = r0
            java.lang.Boolean r0 = r6.A0K
            boolean r0 = r0.booleanValue()
            r11.A2b = r0
            com.instagram.leadgen.core.api.LeadForm r0 = r6.A0H
            r11.A16 = r0
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r6.A0A
            r11.A0d = r0
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r6.A0B
            r11.A0e = r0
            com.instagram.api.schemas.PaymentInfo r0 = r12.A00
            r11.A0X = r0
            boolean r0 = r6.A0l
            r11.A2c = r0
            boolean r0 = r6.A0g
            r11.A2T = r0
            X.Dgg r1 = r6.A04
            if (r1 == 0) goto L_0x00ef
            boolean r0 = r1.A03
            r11.A2E = r0
            java.lang.String r0 = r1.A01
            r11.A1C = r0
            java.lang.String r0 = r1.A02
            r11.A1D = r0
        L_0x00ef:
            java.util.List r0 = r6.A0d
            if (r0 == 0) goto L_0x00f5
            r11.A1r = r0
        L_0x00f5:
            java.util.List r0 = r6.A0e
            if (r0 == 0) goto L_0x00fb
            r11.A1x = r0
        L_0x00fb:
            java.util.List r1 = r6.A0c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r11.A1p = r0
            java.lang.String r0 = r11.A1V
            r14.A09(r11, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r6.A0F
            r11.A11 = r0
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r11.A0i
            if (r1 != 0) goto L_0x0171
            boolean r0 = r11.A2h
            if (r0 != 0) goto L_0x0171
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r11.A0f
            if (r0 == 0) goto L_0x0171
            r14.A04(r0, r11)
        L_0x011c:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r6.A0D
            if (r0 == 0) goto L_0x0124
            r14.A07 = r8
            r11.A0j = r0
        L_0x0124:
            X.UNC r0 = r6.A08
            r11.A0V = r0
            boolean r0 = r11.A2n
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = r6.A0V
            r11.A1U = r0
        L_0x0130:
            X.JVf r1 = r6.A03
            if (r1 == 0) goto L_0x018a
            java.lang.Object r0 = r1.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            X.0qQ.A0B(r0, r9)
            java.util.List r0 = X.00k.A0d(r0, r8)
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r11.A1q = r0
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            X.0qQ.A0B(r0, r8)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0155:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r1 = r2.next()
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r1 = (com.instagram.api.schemas.InstagramProfileCallToActionDestinations) r1
            boolean r0 = X.W3E.A00(r1, r11)
            if (r0 != 0) goto L_0x016d
            boolean r0 = X.W3E.A08(r11, r9)
            if (r0 == 0) goto L_0x0155
        L_0x016d:
            r3.add(r1)
            goto L_0x0155
        L_0x0171:
            if (r1 != 0) goto L_0x011c
            boolean r0 = r11.A2h
            if (r0 != 0) goto L_0x011c
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r11.A0g
            if (r0 == 0) goto L_0x011c
            r14.A04(r0, r11)
            goto L_0x011c
        L_0x017f:
            boolean r0 = r0.booleanValue()
            goto L_0x00a1
        L_0x0185:
            r0 = r5
            goto L_0x0036
        L_0x0188:
            r11.A24 = r3
        L_0x018a:
            java.util.List r1 = r6.A0Y
            if (r1 == 0) goto L_0x0302
            com.instagram.api.schemas.PublisherPlatform r0 = com.instagram.api.schemas.PublisherPlatform.FACEBOOK
            boolean r0 = r1.contains(r0)
            boolean r0 = X.C66581MXm.A1a(r0)
        L_0x0198:
            r11.A2d = r0
            java.util.List r1 = r6.A0Z
            if (r1 == 0) goto L_0x02ff
            com.instagram.api.schemas.PublisherPlatform r0 = com.instagram.api.schemas.PublisherPlatform.FACEBOOK
            boolean r0 = r1.contains(r0)
            boolean r0 = X.C66581MXm.A1a(r0)
        L_0x01a8:
            r11.A2e = r0
            r11.A28 = r9
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = r11.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r13 = com.instagram.business.promote.model.PromoteLaunchOrigin.AB_TESTING_PICKER
            if (r0 == r13) goto L_0x0360
            X.Vd7 r4 = r12.A05
            if (r4 == 0) goto L_0x0360
            r11.A28 = r8
            com.instagram.api.schemas.BoostedActionStatus r3 = r6.A05
            X.0qQ.A06(r3)
            r2 = 12
            java.lang.String r0 = r4.A0B
            r11.A1J = r0
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r0 = r4.A08
            if (r0 == 0) goto L_0x01c9
            r11.A0m = r0
        L_0x01c9:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r4.A06
            r14.A04(r0, r11)
            java.util.List r1 = r4.A0I
            int r0 = r1.size()
            if (r0 != r8) goto L_0x02fc
            java.lang.Object r0 = X.00k.A0I(r1)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = (com.instagram.api.schemas.XIGIGBoostDestination) r0
        L_0x01dc:
            r11.A0j = r0
            r11.A20 = r1
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            r14.A07 = r0
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r11.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            if (r1 == r0) goto L_0x02f8
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            if (r1 == r0) goto L_0x02f8
            r0 = r5
        L_0x01f1:
            r11.A0b = r0
            java.lang.String r0 = r4.A0A
            r11.A1I = r0
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r4.A06
            if (r1 == 0) goto L_0x024f
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            if (r1 != r0) goto L_0x024f
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r4.A05
            r11.A0d = r0
            com.instagram.leadgen.core.api.LeadForm r1 = r11.A16
            if (r1 == 0) goto L_0x024f
            java.lang.String r15 = r4.A0C
            if (r15 == 0) goto L_0x022b
            com.instagram.common.typedurl.ImageUrl r0 = r1.A00
            r21 = r0
            java.lang.String r0 = r1.A02
            r17 = r0
            java.util.List r0 = r1.A05
            r16 = r0
            java.lang.Boolean r0 = r1.A01
            java.lang.String r1 = r1.A04
            r19 = r1
            r20 = r16
            r16 = r0
            r18 = r15
            r15 = r21
            com.instagram.leadgen.core.api.LeadForm r1 = X.VEO.A00(r15, r16, r17, r18, r19, r20)
            r11.A16 = r1
        L_0x022b:
            java.lang.String r15 = r4.A0D
            if (r15 == 0) goto L_0x024f
            com.instagram.common.typedurl.ImageUrl r0 = r1.A00
            r21 = r0
            java.lang.String r0 = r1.A03
            r18 = r0
            java.util.List r0 = r1.A05
            r16 = r0
            java.lang.Boolean r0 = r1.A01
            java.lang.String r1 = r1.A04
            r19 = r1
            r20 = r16
            r16 = r0
            r17 = r15
            r15 = r21
            com.instagram.leadgen.core.api.LeadForm r0 = X.VEO.A00(r15, r16, r17, r18, r19, r20)
            r11.A16 = r0
        L_0x024f:
            com.instagram.api.schemas.XIGIGBoostCallToAction r15 = r4.A05
            if (r15 == 0) goto L_0x0263
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r4.A06
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            if (r1 == r0) goto L_0x0261
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            if (r1 == r0) goto L_0x0261
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r1 != r0) goto L_0x0263
        L_0x0261:
            r11.A0e = r15
        L_0x0263:
            com.instagram.business.promote.model.PromoteAudience r15 = r4.A09
            if (r15 == 0) goto L_0x02a8
            boolean r0 = X.W3x.A0P(r15)
            if (r0 == 0) goto L_0x02e8
            X.C13990Tnq.A1H(r11, r14)
            com.instagram.business.promote.model.PromoteAudience r1 = com.instagram.business.promote.model.PromoteAudience.A0E
            int r0 = r15.A00
            if (r0 == 0) goto L_0x0278
            r1.A00 = r0
        L_0x0278:
            int r0 = r15.A01
            if (r0 == 0) goto L_0x027e
            r1.A01 = r0
        L_0x027e:
            java.lang.String r0 = r15.A07
            if (r0 == 0) goto L_0x0284
            r1.A07 = r0
        L_0x0284:
            com.instagram.api.schemas.TargetingRelaxationConstants r0 = r15.A04
            if (r0 == 0) goto L_0x028a
            r1.A04 = r0
        L_0x028a:
            boolean r0 = r15.A0C
            r1.A0C = r0
            java.util.List r0 = r15.A08
            r1.A08 = r0
            java.util.List r0 = r15.A09
            r1.A09 = r0
            java.util.List r0 = r15.A0B
            r1.A0B = r0
            java.lang.String r0 = r15.A06
            r1.A06 = r0
            java.util.Map r15 = r11.A22
            X.0qQ.A06(r15)
            java.lang.String r0 = r11.A1Z
            r15.put(r0, r1)
        L_0x02a8:
            com.instagram.business.promote.model.PromoteAudience r0 = r4.A09
            if (r0 != 0) goto L_0x02af
            r14.A09(r11, r5)
        L_0x02af:
            java.lang.String r0 = r11.A1Z
            if (r0 == 0) goto L_0x02e6
            boolean r0 = X.W3x.A0S(r11, r0)
        L_0x02b7:
            r14.A0D(r0)
            int r0 = r4.A00
            r11.A08 = r0
            int r0 = r4.A01
            r11.A09 = r0
            r11.A2r = r9
            r11.A2c = r9
            java.util.List r0 = r4.A0G
            java.util.Iterator r1 = r0.iterator()
        L_0x02cc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0305
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.AdsAPIInstagramPosition r0 = (com.instagram.api.schemas.AdsAPIInstagramPosition) r0
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x02e3
            if (r0 != r7) goto L_0x02cc
            r11.A2c = r8
            goto L_0x02cc
        L_0x02e3:
            r11.A2r = r8
            goto L_0x02cc
        L_0x02e6:
            r0 = 0
            goto L_0x02b7
        L_0x02e8:
            java.lang.String r0 = r15.A05
            r14.A09(r11, r0)
            java.util.Map r1 = r11.A22
            X.0qQ.A06(r1)
            java.lang.String r0 = r11.A1Z
            r1.put(r0, r15)
            goto L_0x02a8
        L_0x02f8:
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r4.A05
            goto L_0x01f1
        L_0x02fc:
            r0 = 0
            goto L_0x01dc
        L_0x02ff:
            r0 = 0
            goto L_0x01a8
        L_0x0302:
            r0 = 0
            goto L_0x0198
        L_0x0305:
            java.util.List r1 = r11.A21
            r1.clear()
            java.util.List r0 = r4.A0H
            r1.addAll(r0)
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r0 = r4.A07
            if (r0 == 0) goto L_0x0315
            r11.A0k = r0
        L_0x0315:
            java.lang.String r0 = r4.A0E
            if (r0 == 0) goto L_0x031b
            r11.A1a = r0
        L_0x031b:
            java.util.List r1 = r4.A0F
            com.instagram.api.schemas.PublisherPlatform r0 = com.instagram.api.schemas.PublisherPlatform.FACEBOOK
            boolean r0 = r1.contains(r0)
            r11.A2e = r0
            com.instagram.api.schemas.BoostedActionStatus r0 = com.instagram.api.schemas.BoostedActionStatus.EXTENDABLE
            r4 = 1
            if (r3 == r0) goto L_0x032e
            com.instagram.api.schemas.BoostedActionStatus r0 = com.instagram.api.schemas.BoostedActionStatus.FINISHED
            if (r3 != r0) goto L_0x034f
        L_0x032e:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r11.A0i
            if (r0 == 0) goto L_0x034f
            java.lang.String r1 = r11.A1Z
            if (r1 == 0) goto L_0x034f
            java.util.Map r0 = r11.A22
            if (r0 == 0) goto L_0x034f
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x034f
            int r0 = r11.A08
            if (r0 <= 0) goto L_0x034f
            int r0 = r11.A09
            if (r0 <= 0) goto L_0x034f
            com.instagram.business.promote.model.PromoteLaunchOrigin r2 = r11.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.MEDIA_PICKER
            r1 = 1
            if (r2 != r0) goto L_0x0350
        L_0x034f:
            r1 = 0
        L_0x0350:
            com.instagram.api.schemas.BoostedActionStatus r0 = com.instagram.api.schemas.BoostedActionStatus.DRAFT
            if (r3 != r0) goto L_0x04a6
            java.lang.String r0 = r11.A1J
            if (r0 == 0) goto L_0x04a6
        L_0x0358:
            com.instagram.business.boost.model.BoostFlowType r2 = com.instagram.business.boost.model.BoostFlowType.ORIGINAL
            if (r4 == 0) goto L_0x0482
            com.instagram.business.boost.model.BoostFlowType r2 = com.instagram.business.boost.model.BoostFlowType.DRAFT
        L_0x035e:
            r11.A0l = r2
        L_0x0360:
            X.Vd7 r3 = r12.A05
            com.instagram.common.session.UserSession r4 = r11.A0y
            X.0qQ.A06(r4)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36320743125951277(0x8109860000232d, double:3.0327224325206065E-306)
            boolean r0 = X.DbY.A1Z(r2, r4, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0383
            com.instagram.business.boost.model.BoostFlowType r0 = r11.A0l
            if (r0 == 0) goto L_0x0383
            int r0 = r0.ordinal()
            if (r0 == r9) goto L_0x047e
            if (r0 == r8) goto L_0x0471
            if (r0 == r7) goto L_0x0471
        L_0x0383:
            r11.A0a = r2
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r9 = r12.A02
            r4 = r22
            r3 = r23
            if (r9 == 0) goto L_0x039d
            com.instagram.model.coupon.PromoteCouponType r0 = r9.A05
            com.instagram.model.coupon.PromoteCouponType r2 = com.instagram.model.coupon.PromoteCouponType.HERES_X
            if (r0 != r2) goto L_0x03c5
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = r9.A00()
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.ACTIVE_IMPRESSION
            if (r1 != r0) goto L_0x03c5
            r11.A0t = r9
        L_0x039d:
            java.lang.String r0 = r6.A0R
            if (r0 == 0) goto L_0x03c4
            X.WGU r1 = X.WGU.A00(r10)
            java.lang.String r0 = "igtv_link_alert"
            r1.A0H(r3, r0)
            X.8ab r1 = new X.8ab
            r1.<init>((android.app.Activity) r4)
            r0 = 2131970560(0x7f134a00, float:1.9578075E38)
            r1.A09(r0)
            r0 = 2131970559(0x7f1349ff, float:1.9578073E38)
            r1.A08(r0)
            r0 = 2131956164(0x7f1311c4, float:1.9548876E38)
            r1.A0G(r5, r0)
            X.DbT.A1V(r1)
        L_0x03c4:
            return
        L_0x03c5:
            com.instagram.model.coupon.PromoteCouponType r0 = r9.A05
            if (r0 != r2) goto L_0x03d1
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = r9.A00()
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.HAS_ENROLLED
            if (r1 == r0) goto L_0x03df
        L_0x03d1:
            com.instagram.model.coupon.PromoteCouponType r1 = r9.A05
            com.instagram.model.coupon.PromoteCouponType r0 = com.instagram.model.coupon.PromoteCouponType.RECREATE_MIN_SPEND_X_TO_GET_Y
            if (r1 != r0) goto L_0x03e4
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = r9.A00()
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.HAS_CLAIMED
            if (r1 != r0) goto L_0x03e4
        L_0x03df:
            r11.A2D = r8
            r11.A0t = r9
            goto L_0x039d
        L_0x03e4:
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = r9.A00()
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.HAS_FAILED
            if (r1 != r0) goto L_0x039d
            java.lang.String r8 = r9.A08
            if (r8 != 0) goto L_0x03f2
            java.lang.String r8 = ""
        L_0x03f2:
            X.WGU r11 = X.WGU.A00(r10)
            java.lang.String r7 = "coupon_enroll_failure_alert"
            X.UGS r2 = new X.UGS
            r2.<init>()
            X.C13990Tnq.A18(r2, r11)
            if (r8 == 0) goto L_0x0407
            java.lang.String r0 = "coupon_enroll_failure_reason"
            r2.A06(r0, r8)
        L_0x0407:
            X.0wc r1 = r11.A05
            java.lang.String r0 = "promoted_posts_view_component"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "component"
            r1.AAJ(r0, r7)
            X.C13990Tnq.A10(r1, r11, r3)
            X.C13988Tno.A18(r1, r2)
            X.8ab r7 = new X.8ab
            r7.<init>((android.app.Activity) r4)
            java.lang.String r1 = r9.A07
            if (r1 == 0) goto L_0x0443
            r0 = 2131970522(0x7f1349da, float:1.9577997E38)
            r7.A09(r0)
            r7.A0q(r1)
            r2 = 2131964884(0x7f1333d4, float:1.9566562E38)
            r1 = 6
            X.W4v r0 = new X.W4v
            r0.<init>(r1, r4, r10)
            r7.A0I(r0, r2)
        L_0x0438:
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            r7.A0G(r5, r0)
            X.DbT.A1V(r7)
            goto L_0x039d
        L_0x0443:
            java.lang.String r0 = "OFFER_ALREADY_CLAIMED"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0458
            r0 = 2131970520(0x7f1349d8, float:1.9577993E38)
            r7.A09(r0)
            r0 = 2131970519(0x7f1349d7, float:1.9577991E38)
            r7.A08(r0)
            goto L_0x0438
        L_0x0458:
            r0 = 2131970522(0x7f1349da, float:1.9577997E38)
            r7.A09(r0)
            r0 = 2131970521(0x7f1349d9, float:1.9577995E38)
            r7.A08(r0)
            r2 = 2131964884(0x7f1333d4, float:1.9566562E38)
            r1 = 7
            X.W4v r0 = new X.W4v
            r0.<init>(r1, r4, r10)
            r7.A0I(r0, r2)
            goto L_0x0438
        L_0x0471:
            if (r3 == 0) goto L_0x0383
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r1 = r3.A04
            if (r1 == 0) goto L_0x0383
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r0 = com.instagram.api.schemas.XFBCTXWelcomeMessageStatus.WELCOME_MESSAGE_INELIGIBLE
            if (r1 == r0) goto L_0x0383
            r2 = r1
            goto L_0x0383
        L_0x047e:
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r2 = com.instagram.api.schemas.XFBCTXWelcomeMessageStatus.DEFAULT_WELCOME_MESSAGE_OPTED_IN
            goto L_0x0383
        L_0x0482:
            if (r1 == 0) goto L_0x0488
            com.instagram.business.boost.model.BoostFlowType r2 = com.instagram.business.boost.model.BoostFlowType.BOOST_AGAIN
            goto L_0x035e
        L_0x0488:
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = r11.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.MEDIA_PICKER
            if (r1 != r0) goto L_0x0492
            com.instagram.business.boost.model.BoostFlowType r2 = com.instagram.business.boost.model.BoostFlowType.MEDIA_PICKER
            goto L_0x035e
        L_0x0492:
            if (r1 != r13) goto L_0x0498
            com.instagram.business.boost.model.BoostFlowType r2 = com.instagram.business.boost.model.BoostFlowType.AB_TESTING_PICKER
            goto L_0x035e
        L_0x0498:
            java.lang.String r1 = r11.A1K
            java.lang.String r0 = "post_sharesheet"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x035e
            com.instagram.business.boost.model.BoostFlowType r2 = com.instagram.business.boost.model.BoostFlowType.SHARESHEET
            goto L_0x035e
        L_0x04a6:
            r4 = 0
            goto L_0x0358
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAF.A00(androidx.fragment.app.FragmentActivity, X.UzE, X.UXo, com.instagram.business.promote.model.PromoteData, com.instagram.business.promote.model.PromoteState, com.instagram.common.session.UserSession):void");
    }
}
