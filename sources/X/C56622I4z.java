package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.Map;

/* renamed from: X.I4z  reason: case insensitive filesystem */
public abstract class C56622I4z {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (X.C51968G9o.A1X(r8, r11) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r5 = X.AnonymousClass0xl.A00(X.C61170le.A00).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.app.Activity r27, android.content.Context r28, X.0jB r29, com.instagram.common.session.UserSession r30, X.JPO r31, X.C243363Yl r32, X.1Xj r33, X.GQ0 r34, X.AnonymousClass4DU r35, com.instagram.search.common.analytics.SearchContext r36, X.C249763kK r37, java.lang.Integer r38, java.lang.Long r39, java.lang.String r40, int r41, int r42, int r43, int r44, boolean r45) {
        /*
            r2 = 0
            r6 = r28
            X.0qQ.A0B(r6, r2)
            r4 = 1
            r0 = 11
            r8 = r30
            X.0qQ.A0B(r8, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r13 = r38
            r10 = r32
            if (r13 != r0) goto L_0x003e
            X.3Yl r0 = X.C243363Yl.LIKED
            if (r10 != r0) goto L_0x003e
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            X.0xa r5 = r0.A00
            java.lang.String r3 = "used_double_tap_hint_impressions"
            int r1 = r5.getInt(r3, r2)
            r0 = 3
            if (r1 >= r0) goto L_0x003e
            java.lang.String r0 = "used_double_tap"
            boolean r0 = r5.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x003e
            r0 = 2131961009(0x7f1324b1, float:1.9558703E38)
            X.C59689JTv.A06(r6, r0)
            int r0 = r1 + 1
            X.AnonymousClass7TG.A1M(r5, r3, r0)
        L_0x003e:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r13 != r3) goto L_0x0056
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "used_double_tap"
            r1.E5T(r0, r4)
            r1.apply()
        L_0x0056:
            r1 = 0
            r7 = r35
            boolean r0 = r7 instanceof X.AnonymousClass0j6
            if (r0 == 0) goto L_0x006a
            r0 = r7
            X.0j6 r0 = (X.AnonymousClass0j6) r0
            X.0jB r0 = r0.E4x()
            if (r0 == 0) goto L_0x006a
            java.util.HashMap r1 = r0.A02()
        L_0x006a:
            r4 = r34
            if (r34 == 0) goto L_0x0080
            if (r1 != 0) goto L_0x0074
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
        L_0x0074:
            int r0 = r13.intValue()
            switch(r0) {
                case 0: goto L_0x00e1;
                case 1: goto L_0x00de;
                default: goto L_0x007b;
            }
        L_0x007b:
            java.lang.String r0 = "peek_media"
        L_0x007d:
            X.GQ0.A00(r4, r0, r1)
        L_0x0080:
            r11 = r33
            if (r13 != r3) goto L_0x008c
            boolean r0 = X.C51968G9o.A1X(r8, r11)
            r26 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008c:
            r26 = 0
        L_0x008e:
            X.0q2 r0 = X.0q2.A00(r8)
            X.3Yl r0 = r0.A0L(r11)
            r12 = r36
            r24 = r43
            r23 = r41
            if (r0 == r10) goto L_0x00c6
            X.0q2 r0 = X.0q2.A00(r8)
            X.3Yl r0 = r0.A0L(r11)
            X.C54994HaR.A00(r8, r0, r10, r11)
            r18 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r23)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r42)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r24)
            r17 = r39
            r21 = r45
            r9 = r31
            r19 = r40
            r20 = r1
            r22 = r2
            A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x00c6:
            r21 = r37
            r25 = r44
            r14 = r27
            r15 = r29
            r16 = r8
            r17 = r10
            r18 = r11
            r19 = r7
            r20 = r12
            r22 = r13
            A02(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x00de:
            java.lang.String r0 = "double_tap_media"
            goto L_0x007d
        L_0x00e1:
            java.lang.String r0 = "button"
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56622I4z.A01(android.app.Activity, android.content.Context, X.0jB, com.instagram.common.session.UserSession, X.JPO, X.3Yl, X.1Xj, X.GQ0, X.4DU, com.instagram.search.common.analytics.SearchContext, X.3kK, java.lang.Integer, java.lang.Long, java.lang.String, int, int, int, int, boolean):void");
    }

    public static final void A03(Context context, AnonymousClass0iw r16, UserSession userSession, JPO jpo, C243363Yl r19, 1Xj r20, SearchContext searchContext, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, Map map, boolean z, boolean z2) {
        1Xj r4 = r20;
        AnonymousClass7TG.A1N(context, r4);
        Integer num5 = num;
        0qQ.A0B(num5, 4);
        UserSession userSession2 = userSession;
        0q2 A00 = 0q2.A00(userSession2);
        boolean A1W = AnonymousClass7TF.A1W(num5, AnonymousClass05K.A01);
        AnonymousClass0iw r8 = r16;
        0qQ.A0A(r8);
        Map map2 = map;
        C243363Yl r3 = r19;
        C45423Cw3 A0M = A00.A0M(r8, r3, r4, C61970qY.A09(context), map2, A1W);
        String moduleName = r8.getModuleName();
        Integer num6 = num4;
        Integer num7 = num3;
        String str3 = str2;
        SearchContext searchContext2 = searchContext;
        Integer num8 = num2;
        1OC A002 = A00(context, userSession2, r3, r4, searchContext2, num5, num8, num7, num6, l, str, moduleName, str3, map2, z, z2);
        A002.A00 = new H4N(2, jpo, r4, userSession2, A0M);
        1ES.A03(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0111, code lost:
        if (r16 != null) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1OC A00(android.content.Context r6, com.instagram.common.session.UserSession r7, X.C243363Yl r8, X.1Xj r9, com.instagram.search.common.analytics.SearchContext r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Long r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Map r19, boolean r20, boolean r21) {
        /*
            X.3Yl r0 = X.C243363Yl.LIKED
            if (r8 != r0) goto L_0x0135
            java.lang.String r1 = "like"
        L_0x0006:
            java.lang.String r4 = X.DbS.A0k()
            r5 = r17
            if (r17 == 0) goto L_0x0014
            int r0 = r5.length()
            if (r0 != 0) goto L_0x001b
        L_0x0014:
            java.lang.String r2 = "LikeUtil"
            java.lang.String r0 = "Attempted to create like task with null module name"
            X.0wb.A03(r2, r0)
        L_0x001b:
            X.1NY r2 = X.DbU.A0M(r7)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r2.A08(r3)
            java.lang.String r0 = r9.getId()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            r0 = 695(0x2b7, float:9.74E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0K(r0, r1)
            if (r11 != r3) goto L_0x0131
            java.lang.String r0 = "1"
        L_0x0039:
            java.lang.String r3 = "d"
            r2.A9m(r3, r0)
            java.lang.String r1 = r9.getId()
            java.lang.String r0 = "media_id"
            X.C51968G9o.A1L(r2, r0, r1, r5)
            java.lang.String r1 = X.C61970qY.A09(r6)
            java.lang.String r0 = "radio_type"
            r2.A9m(r0, r1)
            java.lang.String r0 = "is_carousel_bumped_post"
            r1 = r20
            r2.A0H(r0, r1)
            java.lang.Integer r0 = r9.A2L()
            java.lang.String r1 = X.C2606846q.A00(r0)
            java.lang.String r0 = "delivery_class"
            r2.A9m(r0, r1)
            java.lang.String r1 = X.C51965G9l.A0t(r9)
            java.lang.String r0 = "inventory_source"
            r2.A0G(r0, r1)
            X.1Xy r0 = r9.A0C
            java.lang.String r1 = r0.B2y()
            java.lang.String r0 = "explore_source_token"
            r2.A0G(r0, r1)
            java.lang.String r1 = X.DbT.A0x(r9)
            java.lang.String r0 = "logging_info_token"
            r2.A0G(r0, r1)
            java.lang.String r0 = "nav_chain"
            r2.A0G(r0, r4)
            r0 = 1513(0x5e9, float:2.12E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "false"
            r2.A9m(r1, r0)
            if (r11 == 0) goto L_0x00a1
            int r0 = r11.intValue()
            switch(r0) {
                case 1: goto L_0x0114;
                case 2: goto L_0x0117;
                case 3: goto L_0x011a;
                case 4: goto L_0x011d;
                case 5: goto L_0x0121;
                case 6: goto L_0x0125;
                case 7: goto L_0x0129;
                case 8: goto L_0x012d;
                default: goto L_0x009a;
            }
        L_0x009a:
            java.lang.String r1 = "button"
        L_0x009c:
            java.lang.String r0 = "tap_source"
            r2.A9m(r0, r1)
        L_0x00a1:
            if (r12 == 0) goto L_0x00ac
            java.lang.String r1 = r12.toString()
            java.lang.String r0 = "feed_position"
            r2.A9m(r0, r1)
        L_0x00ac:
            r4 = -1
            if (r13 == 0) goto L_0x00b5
            int r0 = r13.intValue()
            if (r0 == r4) goto L_0x00be
        L_0x00b5:
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "recs_ix"
            r2.A9m(r0, r1)
        L_0x00be:
            if (r14 == 0) goto L_0x00cf
            int r0 = r14.intValue()
            if (r0 == r4) goto L_0x00cf
            java.lang.String r1 = r14.toString()
            java.lang.String r0 = "carousel_index"
            r2.A9m(r0, r1)
        L_0x00cf:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r0 == r11) goto L_0x00d7
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r0 != r11) goto L_0x00de
        L_0x00d7:
            java.lang.String r1 = "carousel_media_like"
            java.lang.String r0 = "source_of_like"
            r2.A9m(r0, r1)
        L_0x00de:
            X.1Xy r0 = r9.A0C
            X.DUd r0 = r0.Bmy()
            java.lang.String r1 = "repost_id"
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = r0.Bmx()
        L_0x00ec:
            r2.A9m(r1, r0)
        L_0x00ef:
            if (r19 == 0) goto L_0x0139
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r19)
        L_0x00f5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0139
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r4)
            java.lang.String r1 = X.DbT.A13(r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00f5
            r2.A9m(r1, r0)
            goto L_0x00f5
        L_0x010f:
            r0 = r16
            if (r16 == 0) goto L_0x00ef
            goto L_0x00ec
        L_0x0114:
            java.lang.String r1 = "double_tap_media"
            goto L_0x009c
        L_0x0117:
            java.lang.String r1 = "peek_media"
            goto L_0x009c
        L_0x011a:
            java.lang.String r1 = "menu_option"
            goto L_0x009c
        L_0x011d:
            java.lang.String r1 = "visual_reply_thumbnail_button"
            goto L_0x009c
        L_0x0121:
            java.lang.String r1 = "visual_reply_thumbnail_double_tap"
            goto L_0x009c
        L_0x0125:
            java.lang.String r1 = "carousel_media_like"
            goto L_0x009c
        L_0x0129:
            java.lang.String r1 = "swipe"
            goto L_0x009c
        L_0x012d:
            java.lang.String r1 = "open_carousel_thank"
            goto L_0x009c
        L_0x0131:
            java.lang.String r0 = "0"
            goto L_0x0039
        L_0x0135:
            java.lang.String r1 = "unlike"
            goto L_0x0006
        L_0x0139:
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x0148
            java.lang.String r1 = r9.A2v()
            java.lang.String r0 = "tracking_token"
            r2.A0G(r0, r1)
        L_0x0148:
            if (r10 == 0) goto L_0x015f
            java.lang.String r1 = r10.A03
            java.lang.String r0 = "rank_token"
            r2.A0G(r0, r1)
            java.lang.String r1 = r10.A05
            java.lang.String r0 = "search_session_id"
            r2.A0G(r0, r1)
            java.lang.String r1 = r10.A02
            java.lang.String r0 = "query_text"
            r2.A0G(r0, r1)
        L_0x015f:
            if (r15 == 0) goto L_0x016a
            java.lang.String r1 = r15.toString()
            java.lang.String r0 = "starting_clips_media_id"
            r2.A9m(r0, r1)
        L_0x016a:
            r1 = r18
            if (r18 == 0) goto L_0x0173
            java.lang.String r0 = "starting_clips_ranking_info_token"
            r2.A9m(r0, r1)
        L_0x0173:
            if (r21 == 0) goto L_0x017c
            java.lang.String r1 = "X-IG-App-ID"
            java.lang.String r0 = "871865944585275"
            r2.A0F(r1, r0)
        L_0x017c:
            java.lang.Class<X.Gyr> r1 = X.C54068Gyr.class
            java.lang.Class<X.Hwc> r0 = X.C56325Hwc.class
            r2.A0Q(r1, r0)
            java.lang.String[] r0 = new java.lang.String[]{r3}
            r2.A0L(r0)
            X.1OC r0 = r2.A0M()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56622I4z.A00(android.content.Context, com.instagram.common.session.UserSession, X.3Yl, X.1Xj, com.instagram.search.common.analytics.SearchContext, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean):X.1OC");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r10.isSponsoredEligible() == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r10.isOrganicEligible() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r0 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r10.isSponsoredEligible() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        if (r1 != false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.app.Activity r5, X.0jB r6, com.instagram.common.session.UserSession r7, X.C243363Yl r8, X.1Xj r9, X.AnonymousClass4DU r10, com.instagram.search.common.analytics.SearchContext r11, X.C249763kK r12, java.lang.Integer r13, int r14, int r15, int r16, boolean r17) {
        /*
            java.lang.String r4 = "like"
            java.lang.String r3 = "unlike"
            java.lang.String r1 = "double_tap_on_liked"
            if (r17 == 0) goto L_0x00ab
            r2 = r1
        L_0x0009:
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L_0x0015
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x008b
        L_0x0015:
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x0022
            boolean r0 = r10.isSponsoredEligible()
            r4 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0022:
            r4 = 0
        L_0x0023:
            boolean r0 = r9.CYg()
            if (r0 == 0) goto L_0x0030
            boolean r1 = r10.isOrganicEligible()
            r0 = 1
            if (r1 != 0) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r4 != 0) goto L_0x0036
            if (r0 == 0) goto L_0x008b
        L_0x0035:
            r6 = 0
        L_0x0036:
            X.3sc r1 = X.C51967G9n.A0c(r7, r9, r10, r2)
            r1.A09(r14)
            java.lang.Long r0 = X.DbS.A0j(r16)
            r1.A3T = r0
            int r0 = r13.intValue()
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0088;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r0 = "peek_media"
        L_0x004c:
            r1.A6y = r0
            r1.A11 = r11
            X.1Xy r0 = r9.A0C
            java.lang.String r0 = r0.BjE()
            r1.A6Y = r0
            boolean r0 = X.AnonymousClass3WX.A02(r9, r10)
            if (r0 != 0) goto L_0x006b
            if (r5 == 0) goto L_0x0063
            r1.A0C(r5, r7)
        L_0x0063:
            if (r12 == 0) goto L_0x006b
            java.lang.String r0 = r12.getSessionId()
            r1.A6t = r0
        L_0x006b:
            if (r11 == 0) goto L_0x007f
            r1.A11 = r11
            java.lang.String r0 = r11.A05
            r1.A6r = r0
            java.lang.String r0 = r11.A06
            r1.A6s = r0
            java.lang.String r0 = r11.A02
            r1.A6W = r0
            java.lang.String r0 = r11.A03
            r1.A6Y = r0
        L_0x007f:
            r1.A0k = r6
            X.C233822wX.A0E(r7, r1, r9, r10, r15)
            return
        L_0x0085:
            java.lang.String r0 = "button"
            goto L_0x004c
        L_0x0088:
            java.lang.String r0 = "double_tap_media"
            goto L_0x004c
        L_0x008b:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0035
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x009e
            boolean r0 = r10.isSponsoredEligible()
            r1 = 1
            if (r0 != 0) goto L_0x009f
        L_0x009e:
            r1 = 0
        L_0x009f:
            boolean r0 = r9.CYg()
            if (r0 == 0) goto L_0x00a8
            r10.isOrganicEligible()
        L_0x00a8:
            if (r1 == 0) goto L_0x0035
            goto L_0x0036
        L_0x00ab:
            X.3Yl r0 = X.C243363Yl.LIKED
            r2 = r3
            if (r8 != r0) goto L_0x0009
            r2 = r4
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56622I4z.A02(android.app.Activity, X.0jB, com.instagram.common.session.UserSession, X.3Yl, X.1Xj, X.4DU, com.instagram.search.common.analytics.SearchContext, X.3kK, java.lang.Integer, int, int, int, boolean):void");
    }
}
