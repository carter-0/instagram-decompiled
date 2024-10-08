package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.Set;

public final class GGM extends C247303g7 {
    public static final Set A0B = 0sc.A06(new GJ2[]{GJ2.CONTENT_APPRECIATION, GJ2.SEE_MORE_PROMPTS, GJ2.CREATOR_PICK, GJ2.STICKER_RESULT});
    public final GJ0 A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final SearchContext A03;
    public final GGP A04;
    public final C52193GIk A05;
    public final GGN A06;
    public final GGO A07;
    public final AnonymousClass93T A08;
    public final C55684Hlh A09;
    public final String A0A;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02f4, code lost:
        if (r1 == null) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02f6, code lost:
        r2 = new X.C52255GKw(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0309, code lost:
        if (r11 != null) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x030b, code lost:
        r11 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0380, code lost:
        r2 = X.JUH.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03ba, code lost:
        r10 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03bc, code lost:
        r2 = new X.GKO(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03cf, code lost:
        if (r2 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03d1, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0145, code lost:
        if (r1 == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d2, code lost:
        r2 = new X.C52255GKw(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d7, code lost:
        r33 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01db, code lost:
        if (r3 != X.GJ2.EFFECT) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01dd, code lost:
        r33 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01df, code lost:
        r6.add(new X.GK5(r20, r2, r15, r7, r24, r3, r0, r4, r28, r29, r0, r31, r32, r33, !A0B.contains(r3)));
        r2 = r17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A05(X.C267324bN r36, X.1Xj r37, X.AnonymousClass3W1 r38) {
        /*
            r35 = this;
            r8 = r35
            X.GIk r1 = r8.A05
            com.instagram.common.session.UserSession r15 = r8.A01
            X.0wX r0 = r15.A03
            android.content.Context r2 = r0.A06()
            r24 = r38
            r0 = r24
            boolean r0 = r0.A1q
            r20 = r36
            r7 = r37
            r3 = r20
            r4 = r15
            r5 = r7
            r6 = r0
            java.util.List r2 = r1.A02(r2, r3, r4, r5, r6)
            r1 = 9
            X.Ijv r0 = new X.Ijv
            r0.<init>(r1)
            java.util.List r2 = X.00k.A0g(r2, r0)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36326129015469591(0x810e6c00083617, double:3.0361284907392247E-306)
            boolean r0 = X.182.A06(r9, r15, r0)
            if (r0 == 0) goto L_0x0049
            r0 = 36317221253223277(0x8106520007136d, double:3.030495186025976E-306)
            boolean r0 = X.182.A06(r9, r15, r0)
            if (r0 != 0) goto L_0x0049
            java.util.Set r1 = A0B
            X.GJ2 r0 = X.GJ2.TEMPLATE
            r1.add(r0)
        L_0x0049:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0059
            X.GIl r0 = X.C52194GIl.A00
            java.util.List r6 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r6)
        L_0x0058:
            return r6
        L_0x0059:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5 = 1
            java.util.List r1 = X.00k.A0c(r2, r5)
            boolean r0 = r1 instanceof java.util.Collection
            r31 = 0
            if (r0 == 0) goto L_0x0417
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0417
        L_0x006f:
            X.GJ2 r0 = X.GJ2.RAY_BAN_STORIES
            boolean r3 = r2.contains(r0)
            java.lang.String r1 = r7.getId()
            X.1Xy r0 = r7.A0C
            X.JSO r0 = r0.CGF()
            if (r0 == 0) goto L_0x0414
            com.instagram.api.schemas.WearablesAppAttributionType r0 = r0.AdB()
        L_0x0085:
            if (r3 == 0) goto L_0x0410
            if (r1 == 0) goto L_0x0410
            if (r0 != 0) goto L_0x008d
            com.instagram.api.schemas.WearablesAppAttributionType r0 = com.instagram.api.schemas.WearablesAppAttributionType.UNRECOGNIZED
        L_0x008d:
            X.Ie5 r4 = new X.Ie5
            r4.<init>(r0, r1)
        L_0x0092:
            X.JMk r4 = (X.C59512JMk) r4
            java.util.Iterator r18 = r2.iterator()
            r2 = 0
        L_0x0099:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r3 = r18.next()
            int r17 = r2 + 1
            if (r2 >= 0) goto L_0x00af
            X.0sr.A1T()
        L_0x00aa:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00af:
            X.GJ2 r3 = (X.GJ2) r3
            X.GJ2 r0 = X.GJ2.META_VERIFIED_LINK
            r32 = 0
            if (r3 != r0) goto L_0x00b9
            r32 = 1
        L_0x00b9:
            X.GK4 r16 = new X.GK4
            r1 = r24
            r0 = r16
            r0.<init>(r7, r1, r3)
            int r29 = r2 + 1
            X.GGN r1 = r8.A06
            r10 = 0
            X.0qQ.A0B(r3, r10)
            int r2 = r3.ordinal()
            switch(r2) {
                case 0: goto L_0x014b;
                case 1: goto L_0x014f;
                case 2: goto L_0x0153;
                case 3: goto L_0x0157;
                case 4: goto L_0x00d7;
                case 5: goto L_0x015b;
                case 6: goto L_0x015b;
                case 7: goto L_0x015f;
                case 8: goto L_0x0163;
                case 9: goto L_0x0167;
                case 10: goto L_0x016b;
                case 11: goto L_0x016f;
                case 12: goto L_0x0173;
                case 13: goto L_0x0177;
                case 14: goto L_0x0117;
                case 15: goto L_0x017b;
                case 16: goto L_0x017f;
                case 17: goto L_0x0183;
                case 18: goto L_0x015b;
                case 19: goto L_0x0190;
                case 20: goto L_0x0194;
                case 21: goto L_0x0153;
                case 22: goto L_0x0153;
                case 23: goto L_0x0198;
                case 24: goto L_0x0157;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00d7:
            X.1Xy r0 = r7.A0C
            com.instagram.feed.media.CreativeConfigIntf r12 = r0.AsO()
            r0 = 0
            if (r12 == 0) goto L_0x019b
            com.instagram.common.session.UserSession r11 = r1.A00
            X.0wX r1 = r11.A03
            android.content.Context r1 = r1.A06()
            java.util.List r1 = X.C284745Nt.A07(r1, r12)
            java.lang.Object r1 = X.00k.A0J(r1)
            X.GNW r1 = (X.GNW) r1
            if (r1 == 0) goto L_0x00f8
            int r0 = r1.A00
            goto L_0x019b
        L_0x00f8:
            java.util.List r1 = r12.B02()
            if (r1 == 0) goto L_0x019b
            java.lang.Object r1 = X.00k.A0J(r1)
            if (r1 == 0) goto L_0x019b
            r0 = 36321808277841694(0x810a7e0000271e, double:3.0333960388651287E-306)
            boolean r1 = X.182.A06(r9, r11, r0)
            r0 = 2131238820(0x7f081fa4, float:1.809393E38)
            if (r1 == 0) goto L_0x019b
            r0 = 2131238248(0x7f081d68, float:1.809277E38)
            goto L_0x019b
        L_0x0117:
            X.1Xy r0 = r7.A0C
            java.util.List r0 = r0.Av3()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r0 = X.00k.A0J(r0)
            X.5DY r0 = (X.AnonymousClass5DY) r0
            if (r0 == 0) goto L_0x0147
            java.lang.Boolean r11 = r0.Cdc()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 == 0) goto L_0x0147
            com.instagram.common.session.UserSession r12 = r1.A00
            X.0Tu r11 = X.0Tu.A06
            r0 = 36323805437898263(0x810c4f00042e17, double:3.034659050926821E-306)
            boolean r1 = X.182.A06(r11, r12, r0)
            r0 = 2131237925(0x7f081c25, float:1.8092114E38)
            if (r1 != 0) goto L_0x019b
        L_0x0147:
            r0 = 2131238742(0x7f081f56, float:1.8093771E38)
            goto L_0x019b
        L_0x014b:
            r0 = 2131238953(0x7f082029, float:1.80942E38)
            goto L_0x019b
        L_0x014f:
            r0 = 2131238782(0x7f081f7e, float:1.8093852E38)
            goto L_0x019b
        L_0x0153:
            r0 = 2131238501(0x7f081e65, float:1.8093282E38)
            goto L_0x019b
        L_0x0157:
            r0 = 2131238876(0x7f081fdc, float:1.8094043E38)
            goto L_0x019b
        L_0x015b:
            r0 = 2131237876(0x7f081bf4, float:1.8092015E38)
            goto L_0x019b
        L_0x015f:
            r0 = 2131238331(0x7f081dbb, float:1.8092938E38)
            goto L_0x019b
        L_0x0163:
            r0 = 2131238264(0x7f081d78, float:1.8092802E38)
            goto L_0x019b
        L_0x0167:
            r0 = 2131238657(0x7f081f01, float:1.8093599E38)
            goto L_0x019b
        L_0x016b:
            r0 = 2131238012(0x7f081c7c, float:1.809229E38)
            goto L_0x019b
        L_0x016f:
            r0 = 2131238856(0x7f081fc8, float:1.8094003E38)
            goto L_0x019b
        L_0x0173:
            r0 = 2131238325(0x7f081db5, float:1.8092926E38)
            goto L_0x019b
        L_0x0177:
            r0 = 2131238320(0x7f081db0, float:1.8092915E38)
            goto L_0x019b
        L_0x017b:
            r0 = 2131238495(0x7f081e5f, float:1.809327E38)
            goto L_0x019b
        L_0x017f:
            r0 = 2131238067(0x7f081cb3, float:1.8092402E38)
            goto L_0x019b
        L_0x0183:
            com.instagram.common.session.UserSession r0 = r1.A00
            boolean r1 = X.JUL.A01(r0)
            r0 = 2131238907(0x7f081ffb, float:1.8094106E38)
            if (r1 == 0) goto L_0x019b
            r0 = 0
            goto L_0x019b
        L_0x0190:
            r0 = 2131238644(0x7f081ef4, float:1.8093573E38)
            goto L_0x019b
        L_0x0194:
            r0 = 2131238684(0x7f081f1c, float:1.8093654E38)
            goto L_0x019b
        L_0x0198:
            r0 = 2131238662(0x7f081f06, float:1.809361E38)
        L_0x019b:
            X.GGP r12 = r8.A04
            if (r2 == r10) goto L_0x03de
            r1 = 10
            if (r2 != r1) goto L_0x03da
            com.instagram.common.session.UserSession r11 = r12.A00
            com.instagram.user.model.UpcomingEvent r12 = r7.A27(r11)
            if (r12 == 0) goto L_0x03da
            X.0nE r1 = X.C61410nE.A00
            X.Vkq r12 = X.C17116VIm.A00(r11, r1, r12)
            X.0wX r1 = r11.A03
            android.content.Context r11 = r1.A06()
            X.Uy1 r1 = X.Uy1.A0D
            java.lang.String r28 = r12.A00(r11, r1)
        L_0x01bd:
            X.GGO r11 = r8.A07
            java.lang.String r1 = ""
            switch(r2) {
                case 0: goto L_0x03d4;
                case 1: goto L_0x02df;
                case 2: goto L_0x03c3;
                case 3: goto L_0x02a9;
                case 4: goto L_0x0327;
                case 5: goto L_0x01c4;
                case 6: goto L_0x01c4;
                case 7: goto L_0x01c4;
                case 8: goto L_0x02fd;
                case 9: goto L_0x03b7;
                case 10: goto L_0x0279;
                case 11: goto L_0x025d;
                case 12: goto L_0x0203;
                case 13: goto L_0x03b3;
                case 14: goto L_0x03af;
                case 15: goto L_0x0295;
                case 16: goto L_0x03ab;
                case 17: goto L_0x024d;
                case 18: goto L_0x01c4;
                case 19: goto L_0x03a7;
                case 20: goto L_0x03a3;
                case 21: goto L_0x01c4;
                case 22: goto L_0x01c4;
                case 23: goto L_0x039f;
                case 24: goto L_0x039b;
                default: goto L_0x01c4;
            }
        L_0x01c4:
            X.1Xy r1 = r7.A0C
            X.JSO r1 = r1.CGF()
            if (r1 == 0) goto L_0x0438
            java.lang.String r1 = r1.getAttributionTitle()
            if (r1 == 0) goto L_0x0438
        L_0x01d2:
            X.GKw r2 = new X.GKw
            r2.<init>(r1)
        L_0x01d7:
            X.GJ2 r1 = X.GJ2.EFFECT
            r33 = 0
            if (r3 != r1) goto L_0x01df
            r33 = 1
        L_0x01df:
            java.util.Set r1 = A0B
            boolean r1 = r1.contains(r3)
            r34 = r1 ^ 1
            X.GK5 r1 = new X.GK5
            r23 = r7
            r25 = r3
            r26 = r16
            r27 = r4
            r30 = r0
            r19 = r1
            r21 = r2
            r22 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r6.add(r1)
            r2 = r17
            goto L_0x0099
        L_0x0203:
            X.1s2 r1 = r7.A1M()
            if (r1 == 0) goto L_0x0232
            X.3cs r1 = r1.B21()
            if (r1 == 0) goto L_0x0232
            java.lang.String r11 = "appreciation"
            X.3cq r1 = r1.BcP()
            if (r1 == 0) goto L_0x0232
            com.instagram.api.schemas.OnboardingEntryActionType r1 = r1.AYX()
            if (r1 == 0) goto L_0x0232
            int r2 = r1.ordinal()
            r1 = 3
            if (r2 == r1) goto L_0x023e
            r1 = 2
            if (r2 == r1) goto L_0x023a
            if (r2 == r5) goto L_0x023a
            if (r2 != r10) goto L_0x0440
            X.0kg r1 = X.0kg.A03
            java.lang.String r0 = "UNRECOGNIZED action type doesn't have pill title"
            X.0wb.A01(r1, r11, r0)
        L_0x0232:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x023a:
            r1 = 2131963079(0x7f132cc7, float:1.9562901E38)
            goto L_0x0241
        L_0x023e:
            r1 = 2131963080(0x7f132cc8, float:1.9562903E38)
        L_0x0241:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0232
            int r1 = r1.intValue()
            goto L_0x03ba
        L_0x024d:
            com.instagram.common.session.UserSession r1 = r11.A01
            boolean r2 = X.JUL.A01(r1)
            r1 = 2131963013(0x7f132c85, float:1.9562767E38)
            if (r2 == 0) goto L_0x03ba
            r1 = 2131963014(0x7f132c86, float:1.956277E38)
            goto L_0x03ba
        L_0x025d:
            X.1Xy r2 = r7.A0C
            X.50l r2 = r2.BDc()
            if (r2 == 0) goto L_0x01d2
            java.util.List r2 = r2.AZX()
            if (r2 == 0) goto L_0x01d2
            java.lang.Object r2 = X.00k.A0J(r2)
            X.50j r2 = (X.C2801550j) r2
            if (r2 == 0) goto L_0x01d2
            java.lang.String r2 = r2.getTitle()
            goto L_0x03cf
        L_0x0279:
            com.instagram.common.session.UserSession r2 = r11.A01
            com.instagram.user.model.UpcomingEvent r10 = r7.A27(r2)
            if (r10 == 0) goto L_0x0380
            X.0nE r1 = X.C61410nE.A00
            X.Vkq r10 = X.C17116VIm.A00(r2, r1, r10)
            X.0wX r1 = r2.A03
            android.content.Context r2 = r1.A06()
            X.Uy1 r1 = X.Uy1.A0D
            java.lang.String r1 = r10.A00(r2, r1)
            goto L_0x0380
        L_0x0295:
            X.1Xy r2 = r7.A0C
            java.lang.String r10 = r2.BVF()
            if (r10 == 0) goto L_0x0380
            int r2 = r10.length()
            if (r2 <= 0) goto L_0x0380
            java.lang.String r1 = X.GJK.A00(r10)
            goto L_0x0380
        L_0x02a9:
            com.instagram.common.session.UserSession r2 = r11.A01
            boolean r11 = r7.A59()
            if (r11 == 0) goto L_0x02c3
            r11 = 36319433160924568(0x81085500001d98, double:3.03189400536291E-306)
            boolean r2 = X.182.A06(r9, r2, r11)
            if (r2 == 0) goto L_0x02c3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r1 = 2131953200(0x7f130630, float:1.9542864E38)
            goto L_0x03bc
        L_0x02c3:
            X.4gw r2 = r7.A1P()
            if (r2 == 0) goto L_0x02d5
            X.4yi r2 = r2.Ad4()
            if (r2 == 0) goto L_0x02d5
            java.lang.String r2 = r2.getOwnerUsername()
            if (r2 != 0) goto L_0x02d6
        L_0x02d5:
            r2 = r1
        L_0x02d6:
            java.lang.Object[] r10 = new java.lang.Object[]{r2}
            r1 = 2131975063(0x7f135b97, float:1.9587208E38)
            goto L_0x03bc
        L_0x02df:
            java.util.List r2 = X.C243233Xy.A01(r7)
            r11 = r1
            if (r2 == 0) goto L_0x0380
            int r1 = r2.size()
            if (r1 != r5) goto L_0x030d
            java.lang.Object r1 = r2.get(r10)
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            java.lang.String r1 = r1.A0J
            if (r1 != 0) goto L_0x030b
        L_0x02f6:
            X.GKw r2 = new X.GKw
            r2.<init>(r11)
            goto L_0x01d7
        L_0x02fd:
            X.1Xy r2 = r7.A0C
            X.DUF r2 = r2.Anr()
            if (r2 == 0) goto L_0x030b
            java.lang.String r11 = r2.getAttributionAppName()
            if (r11 != 0) goto L_0x02f6
        L_0x030b:
            r11 = r1
            goto L_0x02f6
        L_0x030d:
            int r10 = r2.size()
            int r1 = r2.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r11 = new java.lang.Object[]{r1}
            r1 = 2131820863(0x7f11013f, float:1.9274453E38)
            X.H6w r2 = new X.H6w
            r2.<init>(r11, r1, r10)
            goto L_0x01d7
        L_0x0327:
            com.instagram.common.session.UserSession r2 = r11.A01
            X.0wX r12 = r2.A03
            android.content.Context r2 = r12.A06()
            android.content.res.Resources r11 = r2.getResources()
            X.1Xy r2 = r7.A0C
            com.instagram.feed.media.CreativeConfigIntf r10 = r2.AsO()
            r13 = 0
            if (r10 == 0) goto L_0x0399
            java.util.List r13 = r10.B02()
            android.content.Context r2 = r12.A06()
            java.util.List r10 = X.C284745Nt.A07(r2, r10)
            if (r10 == 0) goto L_0x038a
            java.lang.Object r2 = X.00k.A0J(r10)
            X.GNW r2 = (X.GNW) r2
            if (r2 == 0) goto L_0x038a
            int r1 = r2.A01
            java.lang.String r1 = r11.getString(r1)
        L_0x0358:
            r12 = 0
            if (r13 == 0) goto L_0x0388
            int r2 = r13.size()
        L_0x035f:
            if (r10 == 0) goto L_0x0386
            int r10 = r10.size()
        L_0x0365:
            int r2 = r2 + r10
            com.instagram.model.venue.Venue r10 = r7.A23()
            if (r10 == 0) goto L_0x036d
            r12 = 1
        L_0x036d:
            int r2 = r2 + r12
            if (r2 <= r5) goto L_0x0380
            r10 = 2131967738(0x7f133efa, float:1.957235E38)
            int r2 = r2 - r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r1 = r11.getString(r10, r1)
        L_0x0380:
            X.GKw r2 = X.JUH.A00(r1)
            goto L_0x01d7
        L_0x0386:
            r10 = 0
            goto L_0x0365
        L_0x0388:
            r2 = 0
            goto L_0x035f
        L_0x038a:
            if (r13 == 0) goto L_0x0358
            java.lang.Object r2 = X.00k.A0J(r13)
            com.instagram.feed.media.EffectPreviewIntf r2 = (com.instagram.feed.media.EffectPreviewIntf) r2
            if (r2 == 0) goto L_0x0358
            java.lang.String r1 = r2.getName()
            goto L_0x0358
        L_0x0399:
            r10 = r13
            goto L_0x0358
        L_0x039b:
            r1 = 2131956136(0x7f1311a8, float:1.954882E38)
            goto L_0x03ba
        L_0x039f:
            r1 = 2131969496(0x7f1345d8, float:1.9575916E38)
            goto L_0x03ba
        L_0x03a3:
            r1 = 2131956126(0x7f13119e, float:1.9548799E38)
            goto L_0x03ba
        L_0x03a7:
            r1 = 2131956109(0x7f13118d, float:1.9548764E38)
            goto L_0x03ba
        L_0x03ab:
            r1 = 2131964555(0x7f13328b, float:1.9565895E38)
            goto L_0x03ba
        L_0x03af:
            r1 = 2131957290(0x7f13162a, float:1.955116E38)
            goto L_0x03ba
        L_0x03b3:
            r1 = 2131975272(0x7f135c68, float:1.9587632E38)
            goto L_0x03ba
        L_0x03b7:
            r1 = 2131972365(0x7f13510d, float:1.9581736E38)
        L_0x03ba:
            java.lang.Object[] r10 = new java.lang.Object[r10]
        L_0x03bc:
            X.GKO r2 = new X.GKO
            r2.<init>(r10, r1)
            goto L_0x01d7
        L_0x03c3:
            com.instagram.model.venue.Venue r2 = r7.A23()
            if (r2 == 0) goto L_0x01d2
            com.instagram.model.venue.LocationDictIntf r2 = r2.A00
            java.lang.String r2 = r2.getName()
        L_0x03cf:
            if (r2 == 0) goto L_0x01d2
            r1 = r2
            goto L_0x01d2
        L_0x03d4:
            X.4Yx r2 = r11.A00(r7)
            goto L_0x01d7
        L_0x03da:
            java.lang.String r28 = ""
            goto L_0x01bd
        L_0x03de:
            com.instagram.common.session.UserSession r1 = r12.A00
            X.0wX r1 = r1.A03
            android.content.Context r1 = r1.A06()
            android.content.res.Resources r11 = r1.getResources()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r14 = 2131820978(0x7f1101b2, float:1.9274686E38)
            int r13 = r7.A0z()
            java.lang.String r13 = r11.getQuantityString(r14, r13)
            r1.append(r13)
            X.GGO r12 = r12.A01
            X.4Yx r12 = r12.A00(r7)
            java.lang.CharSequence r11 = r12.A00(r11)
            r1.append(r11)
            java.lang.String r28 = r1.toString()
            goto L_0x01bd
        L_0x0410:
            X.GKR r4 = X.GKR.A00
            goto L_0x0092
        L_0x0414:
            r0 = 0
            goto L_0x0085
        L_0x0417:
            java.util.Iterator r3 = r1.iterator()
        L_0x041b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r1 = r3.next()
            java.util.Set r0 = A0B
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x041b
            int r31 = r31 + 1
            if (r31 >= 0) goto L_0x041b
            X.0sr.A1S()
            goto L_0x00aa
        L_0x0438:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0440:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGM.A05(X.4bN, X.1Xj, X.3W1):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.GIk] */
    public /* synthetic */ GGM(UserSession userSession, AnonymousClass4DU r9, SearchContext searchContext, C55684Hlh hlh, String str) {
        AnonymousClass93T A002 = AnonymousClass93S.A00(userSession);
        ? obj = new Object();
        GGN ggn = new GGN(userSession);
        GGO ggo = new GGO(userSession);
        GGP ggp = new GGP(userSession, ggo);
        GJ0 A003 = GGQ.A00(userSession);
        DbW.A1O(searchContext, 3, A002);
        0qQ.A0B(A003, 11);
        this.A02 = r9;
        this.A01 = userSession;
        this.A03 = searchContext;
        this.A0A = str;
        this.A09 = hlh;
        this.A08 = A002;
        this.A05 = obj;
        this.A06 = ggn;
        this.A07 = ggo;
        this.A04 = ggp;
        this.A00 = A003;
    }
}
