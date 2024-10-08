package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

public abstract class I52 {
    public static final boolean A03(UserSession userSession, Integer num, Map map) {
        long A07;
        0Tu r2;
        long j;
        boolean A1Y = DbW.A1Y(num);
        int intValue = num.intValue();
        if (intValue == 0) {
            A07 = (long) C51973G9u.A07(C233052us.FEED_POST_AD_CLICK_MULTI_ADS, map);
            r2 = 0Tu.A06;
            j = 36594362611009207L;
        } else if (intValue != A1Y) {
            A07 = (long) C51973G9u.A07(C233052us.FEED_POST_ORGANIC_ENGAGEMENT_MULTI_ADS, map);
            r2 = 0Tu.A06;
            j = 36594362611336888L;
        } else {
            A07 = (long) C51973G9u.A07(C233052us.FEED_POST_AD_CLICK_SINGLE_AD, map);
            r2 = 0Tu.A06;
            j = 36594362612909755L;
        }
        if (A07 < 182.A01(r2, userSession, j)) {
            return false;
        }
        return true;
    }

    public static final int A00(UserSession userSession, C233052us r4, Map map) {
        if (182.A06(0Tu.A06, userSession, 36312887635805594L)) {
            return C51973G9u.A07(C233052us.FEED_POST_AD_CLICK_MULTI_ADS, map) + C51973G9u.A07(C233052us.FEED_POST_ORGANIC_ENGAGEMENT_MULTI_ADS, map) + C51967G9n.A04(C51966G9m.A14(C233052us.FEED_POST_AD_CLICK_SINGLE_AD, map), 0);
        }
        return C51967G9n.A04(C51966G9m.A14(r4, map), 0);
    }

    public static final C55643Hl2 A01(AnonymousClass2rI r4, int i) {
        C55643Hl2 hl2;
        String str;
        if (r4 != null) {
            Iterator it = 00k.A0p(r4.A08()).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                0k0 r0 = (0k0) next;
                int i3 = r0.A00;
                1Xg r02 = (1Xg) r0.A01;
                if (i3 <= i || !AnonymousClass3VP.A01(r02)) {
                    i2++;
                } else {
                    1UQ r1 = null;
                    1Xg A04 = r4.A04(i2);
                    if (A04 != null) {
                        r1 = A04.A06;
                    }
                    if (r1 == 1UQ.A0T || AnonymousClass3VP.A03(A04)) {
                        hl2 = new C55643Hl2();
                        hl2.A00 = -1;
                        str = "next_sponsored_item_is_non_ad_item";
                    } else {
                        C55643Hl2 hl22 = new C55643Hl2();
                        hl22.A00 = i2;
                        return hl22;
                    }
                }
            }
        }
        hl2 = new C55643Hl2();
        hl2.A00 = -1;
        str = "invalid_next_sponsored_item_position";
        hl2.A01 = str;
        return hl2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r1 = r3.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashMap A02(X.AnonymousClass2rI r7) {
        /*
            X.2us[] r6 = X.C233052us.values()
            int r5 = r6.length
            int r0 = X.AnonymousClass7TG.A01(r5)
            java.util.LinkedHashMap r4 = X.DbS.A0x(r0)
            r3 = 0
            r2 = 0
        L_0x000f:
            if (r2 >= r5) goto L_0x001d
            r1 = r6[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.put(r1, r0)
            int r2 = r2 + 1
            goto L_0x000f
        L_0x001d:
            java.util.LinkedHashMap r2 = X.0Yt.A03(r4)
            if (r7 == 0) goto L_0x00d6
            java.util.List r0 = r7.A08()
            java.util.Iterator r7 = r0.iterator()
        L_0x002b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r3 = r7.next()
            X.1Xg r3 = (X.1Xg) r3
            X.1UQ r1 = r3.A06
            X.1UQ r0 = X.1UQ.A0T
            if (r1 != r0) goto L_0x0058
            X.Gz1 r0 = r3.A01()
            int r6 = r0.A00
            r0 = 20
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)
            int r3 = r5.length
            r1 = 0
        L_0x004b:
            if (r1 >= r3) goto L_0x007c
            r4 = r5[r1]
            int r0 = X.AnonymousClass59V.A00(r4)
            if (r0 == r6) goto L_0x007e
            int r1 = r1 + 1
            goto L_0x004b
        L_0x0058:
            X.1UQ r0 = X.1UQ.A0Y
            if (r1 != r0) goto L_0x002b
            X.1Xn r1 = r3.A05
            X.1Xj r0 = X.1Xi.A02(r1)
            if (r0 == 0) goto L_0x002b
            X.Gku r0 = r0.A0B
            if (r0 == 0) goto L_0x002b
            X.1Xj r0 = X.1Xi.A02(r1)
            if (r0 == 0) goto L_0x00d1
            X.Gku r0 = r0.A0B
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0079
            X.2us r1 = X.C233052us.FEED_POST_AD_CLICK_SINGLE_AD
            goto L_0x0094
        L_0x0079:
            X.2us r1 = X.C233052us.FEED_POST_ORGANIC_ENGAGEMENT_MULTI_ADS
            goto L_0x0094
        L_0x007c:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x007e:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4I5 r3 = X.AnonymousClass59V.A00
            int r0 = X.AnonymousClass59V.A00(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r3.A02(r1)
            if (r0 == 0) goto L_0x00a6
            X.2us r1 = X.C233052us.FEED_STANDALONE_MULTI_ADS
        L_0x0094:
            java.lang.Object r0 = X.0Yt.A01(r1, r2)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
            goto L_0x002b
        L_0x00a6:
            boolean r0 = r3.A01(r1)
            if (r0 == 0) goto L_0x00af
            X.2us r1 = X.C233052us.FEED_POST_AD_CLICK_MULTI_ADS
            goto L_0x0094
        L_0x00af:
            int r0 = r4.intValue()
            switch(r0) {
                case 1: goto L_0x00b9;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00bc;
                case 5: goto L_0x0079;
                case 6: goto L_0x00bf;
                case 7: goto L_0x00c2;
                case 8: goto L_0x00c5;
                case 9: goto L_0x00c8;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00ce;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            X.2us r1 = X.C233052us.UNDEFINED
            goto L_0x0094
        L_0x00b9:
            X.2us r1 = X.C233052us.NONE
            goto L_0x0094
        L_0x00bc:
            X.2us r1 = X.C233052us.DEMO_MULTI_ADS
            goto L_0x0094
        L_0x00bf:
            X.2us r1 = X.C233052us.STORIES_POST_AD_ENGAGEMENT_MULTI_ADS
            goto L_0x0094
        L_0x00c2:
            X.2us r1 = X.C233052us.REELS_POST_AD_ENGAGEMENT_MULTI_ADS
            goto L_0x0094
        L_0x00c5:
            X.2us r1 = X.C233052us.REELS_STANDALONE_MULTI_ADS
            goto L_0x0094
        L_0x00c8:
            X.2us r1 = X.C233052us.STORIES_STANDALONE_MULTI_ADVERTISER_CAROUSEL
            goto L_0x0094
        L_0x00cb:
            X.2us r1 = X.C233052us.STORIES_POST_AD_ENGAGEMENT_MULTI_ADVERTISER_CAROUSEL
            goto L_0x0094
        L_0x00ce:
            X.2us r1 = X.C233052us.REELS_POST_AD_ENGAGEMENT_SINGLE_AD
            goto L_0x0094
        L_0x00d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I52.A02(X.2rI):java.util.LinkedHashMap");
    }
}
