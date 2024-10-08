package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yL  reason: invalid class name and case insensitive filesystem */
public final class C234622yL extends C230372pW {
    public final Context A00;
    public final UserSession A01;
    public final C232852uY A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass2lU A04;
    public final AnonymousClass2yG A05;

    public C234622yL(Context context, 1Bk r3, UserSession userSession, C232852uY r5, AnonymousClass4DU r6, AnonymousClass2lU r7, AnonymousClass2yG r8) {
        super(r3, new C234632yM(userSession));
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r8;
        this.A04 = r7;
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [X.0iw, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        if (r11 == 2) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A03(java.lang.Object r32, java.lang.Object r33) {
        /*
            r31 = this;
            r6 = r33
            r5 = r32
            X.1Xj r5 = (X.1Xj) r5
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            r18 = 0
            r0 = r18
            X.0qQ.A0B(r5, r0)
            r7 = 1
            X.0qQ.A0B(r6, r7)
            boolean r0 = r6.A0p()
            if (r0 != 0) goto L_0x002c
            java.lang.String r1 = "position in media state is not set, media type is "
            X.1iA r0 = r5.BR7()
            java.lang.String r0 = r0.name()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "SponsoredImpressionEventAction:handleImpression"
            X.0wb.A03(r0, r1)
        L_0x002c:
            X.1sy r1 = r6.A0o
            X.1sy r0 = X.1sy.A0A
            r3 = r31
            if (r1 != r0) goto L_0x0047
            com.instagram.common.session.UserSession r0 = r3.A01
            java.lang.String r8 = X.C231122qu.A07(r0, r5)
            if (r8 == 0) goto L_0x0047
            X.2yG r4 = r3.A05
            X.2pg r2 = X.C230472pg.SPONSORED
            X.2v9 r1 = X.C233162v9.SEEN_STATE
            X.2pc r0 = X.C230432pc.EXPLORE
            r4.EGR(r2, r1, r0, r8)
        L_0x0047:
            com.instagram.common.session.UserSession r4 = r3.A01
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r4, r5)
            if (r0 == 0) goto L_0x00e8
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BTY()
            if (r0 == 0) goto L_0x00e8
            int r11 = X.AnonymousClass3ZO.A00(r0)
        L_0x0059:
            r17 = 3
            r1 = 1
            r16 = 0
            r0 = r17
            if (r11 != r0) goto L_0x00e3
            r16 = 1
        L_0x0064:
            r1 = 0
        L_0x0065:
            X.1Xy r0 = r5.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            r8 = 0
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r0.getId()
        L_0x0072:
            r2 = 766842320(0x2db515d0, float:2.0587004E-11)
            java.lang.String r13 = "messaging_destination"
            X.AnonymousClass59S.A04(r4, r0, r13, r2, r11)
            java.lang.String r10 = "FEED_AD_IMPRESSION"
            if (r16 != 0) goto L_0x0080
            if (r1 == 0) goto L_0x011f
        L_0x0080:
            java.lang.String r0 = r5.getId()
            r9 = 766847856(0x2db52b70, float:2.0596608E-11)
            X.AnonymousClass59S.A03(r4, r0, r10, r9)
            boolean r0 = r5.A5D()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_carousel"
            X.0eP r15 = new X.0eP
            r15.<init>(r0, r1)
            int r0 = r5.A0v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "number_of_likes"
            X.0eP r14 = new X.0eP
            r14.<init>(r0, r1)
            int r0 = r5.A0r()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "number_of_comments"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r12)
            X.0eP[] r0 = new X.0eP[]{r15, r14, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x00c3:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r14.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r12 = r0.A00
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = r0.A01
            java.lang.String r1 = r5.getId()
            java.lang.String r0 = r0.toString()
            X.AnonymousClass59S.A05(r4, r1, r12, r0, r9)
            goto L_0x00c3
        L_0x00e1:
            r0 = r8
            goto L_0x0072
        L_0x00e3:
            r0 = 2
            if (r11 != r0) goto L_0x0064
            goto L_0x0065
        L_0x00e8:
            r11 = -1
            goto L_0x0059
        L_0x00eb:
            java.lang.String r0 = r5.getId()
            X.AnonymousClass59S.A04(r4, r0, r13, r9, r11)
            boolean r0 = X.C247643gg.A07(r4, r5)
            if (r0 != 0) goto L_0x00fe
            boolean r0 = X.C247643gg.A0A(r4, r5)
            if (r0 == 0) goto L_0x0105
        L_0x00fe:
            java.lang.String r0 = r5.getId()
            X.AnonymousClass59S.A00(r4, r0, r9)
        L_0x0105:
            if (r16 == 0) goto L_0x011f
            X.AnonymousClass59S.A06(r10, r4, r5)
            boolean r0 = X.C247643gg.A07(r4, r5)
            if (r0 == 0) goto L_0x011f
            X.1Xy r0 = r5.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x011c
            java.lang.String r8 = r0.getId()
        L_0x011c:
            X.AnonymousClass59S.A00(r4, r8, r2)
        L_0x011f:
            X.2lU r1 = r3.A04
            if (r1 == 0) goto L_0x0130
            X.1sy r0 = r6.A0o
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0130
            int r0 = r6.A03
            r1.A06(r5, r0)
        L_0x0130:
            X.1sy r1 = r6.A0o
            X.1sy r0 = X.1sy.A0H
            if (r1 != r0) goto L_0x0172
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321546284836353(0x810a4100002601, double:3.03323035343359E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0172
            int r0 = r6.getPosition()
            if (r0 != 0) goto L_0x0150
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.AnonymousClass2yJ.A00(r0)
            X.C234602yI.A00 = r7
        L_0x0150:
            int r1 = r6.getPosition()
            r0 = 7
            if (r1 < r0) goto L_0x015c
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            X.AnonymousClass2yJ.A00(r0)
        L_0x015c:
            X.3Bb r2 = X.C238233Bb.A02
            X.0qQ.A07(r2)
            X.4ai r1 = X.C267004ai.AD
            int r0 = r6.getPosition()
            int r0 = r2.A00(r1, r0)
            if (r0 != 0) goto L_0x0172
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            X.AnonymousClass2yJ.A00(r0)
        L_0x0172:
            android.content.Context r10 = r3.A00
            X.4DU r11 = r3.A03
            X.2uY r1 = r3.A02
            r0 = 5
            X.0qQ.A0B(r1, r0)
            int r23 = r6.getPosition()
            java.lang.String r22 = "impression"
            r3 = 0
            r2 = -1
            r20 = r5
            r21 = r11
            r24 = r2
            r19 = r1
            X.3sc r7 = r19.A04(r20, r21, r22, r23, r24)
            if (r7 == 0) goto L_0x03af
            X.0Tu r8 = X.0Tu.A05
            r0 = 36311998572725080(0x81019200030358, double:3.02719234184887E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r7.A03()
            r7.A02()
            boolean r0 = r6.A2R
            r7.A8A = r0
            int r0 = r6.A08
            r7.A06(r0)
            r7.A1u = r1
            X.3sT r25 = X.C254433sT.A00
            java.util.HashMap r0 = X.C254453sV.A00(r4)
            r7.A89 = r0
            int r0 = r6.A0P
            r7.A0A(r0)
            boolean r0 = X.C231122qu.A0R(r4, r5)
            r7.A8B = r0
            X.3xf r0 = r5.A1F()
            r7.A0h = r0
            java.lang.String r0 = r6.A1P
            r7.A6M = r0
            java.lang.String r0 = r6.A1K
            r7.A5o = r0
            java.lang.String r0 = r6.A1I
            r7.A5Y = r0
            int r0 = r6.getPosition()
            r7.A08 = r0
            X.1Xy r0 = r5.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0458
            java.lang.Boolean r0 = r0.CRH()
            if (r0 == 0) goto L_0x0458
            boolean r0 = r0.booleanValue()
        L_0x01ef:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A1P = r0
            boolean r0 = r6.A3A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A1s = r0
            java.lang.String r0 = r6.A1C
            r7.A4M = r0
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x020b
            r7.A65 = r0
        L_0x020b:
            X.2vm r9 = r6.A0p
            if (r9 == 0) goto L_0x0245
            int r0 = r9.A01()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A3g = r0
            int r0 = r9.A02()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A3h = r0
            int r0 = r9.A03()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A3a = r0
            int r0 = r9.A06()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A3k = r0
            double r0 = r9.A00()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r7.A2Y = r0
        L_0x0245:
            X.2uZ r19 = X.C232852uY.A02
            java.lang.StringBuilder r24 = new java.lang.StringBuilder
            r24.<init>()
            r22 = r5
            r23 = r6
            r20 = r4
            r21 = r7
            r19.A03(r20, r21, r22, r23, r24)
            int r0 = r6.getPosition()
            X.C232832uW.A00(r7, r5, r11, r0)
            r26 = r4
            r27 = r7
            r28 = r5
            r29 = r11
            r30 = r6
            r25.A03(r26, r27, r28, r29, r30)
            X.C254433sT.A00(r10, r7, r6)
            X.0jB r9 = new X.0jB
            r9.<init>()
            r0 = 36313957077616968(0x81035a00000948, double:3.028430908228766E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x0287
            int r1 = r6.A0V
            if (r1 == 0) goto L_0x0287
            java.lang.String r0 = "pushdown_offset"
            r9.A09(r0, r1)
        L_0x0287:
            r7.A0E(r9)
            int r0 = r6.A0F
            if (r0 == r2) goto L_0x02b2
            r7.A0J = r0
            int r0 = r6.A0T
            r7.A0W = r0
            X.1sS r8 = r5.BJP()
            if (r8 == 0) goto L_0x02b2
            java.lang.Double r0 = r8.C7G()
            if (r0 == 0) goto L_0x02a6
            double r0 = r0.doubleValue()
            r7.A03 = r0
        L_0x02a6:
            java.lang.String r0 = r8.BiN()
            if (r0 == 0) goto L_0x02b2
            int r0 = java.lang.Integer.parseInt(r0)
            r7.A0Y = r0
        L_0x02b2:
            int r0 = r6.A0G
            if (r0 == r2) goto L_0x02c0
            r7.A0K = r0
            int r0 = r6.A0V
            r7.A0X = r0
            int r0 = r6.A0R
            r7.A0W = r0
        L_0x02c0:
            java.lang.Integer r0 = r6.A19
            r7.A34 = r0
            java.lang.String r0 = r6.A1T
            r7.A6R = r0
            X.1Xy r0 = r5.A0C
            java.util.List r0 = r0.BxO()
            r9 = 0
            if (r0 == 0) goto L_0x0455
            java.lang.Object r10 = X.00k.A0J(r0)
            X.3yf r10 = (X.C258223yf) r10
        L_0x02d7:
            boolean r0 = r5.CcK()
            if (r0 == 0) goto L_0x0323
            X.0jB r0 = r7.A0s
            if (r0 != 0) goto L_0x02e6
            X.0jB r0 = new X.0jB
            r0.<init>()
        L_0x02e6:
            r7.A0s = r0
            X.3Yy r0 = X.C243483Yy.A00
            java.util.List r0 = r0.A06(r4, r5)
            boolean r0 = r0.isEmpty()
            X.0jB r8 = r7.A0s
            if (r0 == 0) goto L_0x0436
            if (r8 == 0) goto L_0x030e
            X.0j9 r2 = X.C271774jZ.A85
            if (r10 == 0) goto L_0x0433
            com.instagram.api.schemas.SocialContextType r0 = r10.BxW()
            if (r0 == 0) goto L_0x0433
            int r0 = r0.ordinal()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x030b:
            r8.A04(r2, r0)
        L_0x030e:
            X.0jB r2 = r7.A0s
            if (r2 == 0) goto L_0x0323
            X.0j9 r1 = X.C271774jZ.A86
            if (r10 == 0) goto L_0x0320
            com.instagram.api.schemas.SocialContextType r0 = r10.BxW()
            if (r0 == 0) goto L_0x0320
            java.lang.String r9 = r0.name()
        L_0x0320:
            r2.A04(r1, r9)
        L_0x0323:
            X.1Xy r0 = r5.A0C
            X.41Z r0 = r0.BUC()
            r9 = 0
            if (r0 == 0) goto L_0x0430
            X.4hQ r0 = r0.At8()
            if (r0 == 0) goto L_0x0430
            com.instagram.api.schemas.MoreInfoType r8 = r0.BUD()
        L_0x0336:
            X.0jB r1 = r7.A0l
            if (r1 != 0) goto L_0x033f
            X.0jB r1 = new X.0jB
            r1.<init>()
        L_0x033f:
            r7.A0l = r1
            X.0j9 r0 = X.C271774jZ.A5q
            if (r8 == 0) goto L_0x0349
            java.lang.String r3 = r8.toString()
        L_0x0349:
            r1.A04(r0, r3)
            X.0jB r3 = r7.A0l
            if (r3 == 0) goto L_0x0360
            X.0j9 r2 = X.C271774jZ.A5p
            if (r8 == 0) goto L_0x035d
            int r0 = r8.ordinal()
            long r0 = (long) r0
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x035d:
            r3.A04(r2, r9)
        L_0x0360:
            boolean r0 = X.1sx.A0E(r4, r5, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x036c
            r7.A1R = r0
        L_0x036c:
            java.lang.String r0 = X.1sx.A0A(r5, r6)
            if (r0 == 0) goto L_0x0374
            r7.A54 = r0
        L_0x0374:
            boolean r0 = X.C247643gg.A0B(r4, r5)
            if (r0 == 0) goto L_0x037e
            java.lang.Integer r0 = r5.A0I
            r7.A2y = r0
        L_0x037e:
            boolean r0 = X.C228342lQ.A02(r4)
            if (r0 == 0) goto L_0x039c
            X.1Av r0 = X.1Au.A00(r4)
            X.1Az r0 = X.C228342lQ.A01(r0)
            java.lang.String r0 = r0.toString()
            r7.A4X = r0
            X.1Az r0 = X.C228342lQ.A00(r4)
            java.lang.String r0 = r0.toString()
            r7.A4Y = r0
        L_0x039c:
            java.lang.String r0 = X.C233832wY.A00(r4)
            r7.A4S = r0
            int r0 = r6.A03
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r8 = r5
            r9 = r11
            r11 = r0
            r12 = r18
            r6 = r4
            X.C233822wX.A0F(r6, r7, r8, r9, r10, r11, r12)
        L_0x03af:
            java.lang.String r8 = X.C231122qu.A07(r4, r5)
            if (r8 == 0) goto L_0x0422
            X.3lK r0 = X.C231122qu.A01(r4, r5)
            com.facebook.iabadscontext.IgPromoAdsExtension r0 = X.C2816959a.A01(r0, r4, r5)
            if (r0 == 0) goto L_0x0422
            java.util.List r1 = r0.A02
            r0 = r18
            java.lang.Object r0 = r1.get(r0)
            com.facebook.iabadscontext.IgPromoAdsPromoCode r0 = (com.facebook.iabadscontext.IgPromoAdsPromoCode) r0
            java.lang.String r7 = r0.A00
            r0 = r18
            java.lang.Object r0 = r1.get(r0)
            com.facebook.iabadscontext.IgPromoAdsPromoCode r0 = (com.facebook.iabadscontext.IgPromoAdsPromoCode) r0
            java.lang.String r6 = r0.A01
            java.lang.String r3 = r5.C9L()
            r0 = r17
            X.0qQ.A0B(r6, r0)
            X.T5u r0 = new X.T5u
            r0.<init>()
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r4)
            java.lang.String r1 = "ig_promo_ads_client_received_promo_ad"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0422
            long r0 = java.lang.Long.parseLong(r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ad_id"
            r2.A9F(r0, r1)
            if (r7 == 0) goto L_0x042e
            long r0 = java.lang.Long.parseLong(r7)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x040c:
            r0 = 253(0xfd, float:3.55E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.A9F(r0, r1)
            java.lang.String r0 = "promo_code"
            r2.AAJ(r0, r6)
            java.lang.String r0 = "tracking_token"
            r2.AAJ(r0, r3)
            r2.Cgf()
        L_0x0422:
            X.59c r1 = X.C2817059b.A00(r4)
            java.lang.String r0 = X.C231122qu.A07(r4, r5)
            r1.A02(r5, r0)
            return
        L_0x042e:
            r1 = 0
            goto L_0x040c
        L_0x0430:
            r8 = r3
            goto L_0x0336
        L_0x0433:
            r0 = r3
            goto L_0x030b
        L_0x0436:
            if (r8 == 0) goto L_0x0448
            X.0j9 r2 = X.C271774jZ.A85
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.LIKED_BY
            int r0 = r0.ordinal()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A04(r2, r0)
        L_0x0448:
            X.0jB r2 = r7.A0s
            if (r2 == 0) goto L_0x0323
            X.0j9 r1 = X.C271774jZ.A86
            java.lang.String r0 = "LIKED_BY"
            r2.A04(r1, r0)
            goto L_0x0323
        L_0x0455:
            r10 = r3
            goto L_0x02d7
        L_0x0458:
            r0 = 0
            goto L_0x01ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234622yL.A03(java.lang.Object, java.lang.Object):void");
    }
}
