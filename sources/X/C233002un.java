package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.io.StringWriter;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2un  reason: invalid class name and case insensitive filesystem */
public final class C233002un implements C233012uo {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public 1Xj A04;
    public AnonymousClass3W1 A05;
    public AnonymousClass3DY A06;
    public AnonymousClass2rI A07;
    public C54077Gz1 A08;
    public C233042ur A09 = new C233032uq();
    public C233072uu A0A;
    public C233212vI A0B;
    public Integer A0C = AnonymousClass05K.A00;
    public Map A0D;
    public boolean A0E;
    public 1OC A0F;
    public final Context A0G;
    public final AnonymousClass1O8 A0H = new AnonymousClass1O8();
    public final UserSession A0I;
    public final C233082uv A0J;
    public final C230282pK A0K;
    public final Integer A0L;

    public C233002un(Context context, UserSession userSession, C230282pK r10, ContextualFeedFragment contextualFeedFragment, Integer num) {
        0qQ.A0B(userSession, 2);
        this.A0G = context;
        this.A0I = userSession;
        this.A0K = r10;
        this.A0L = num;
        int A0L2 = 0se.A0L(r5);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (C233052us put : C233052us.values()) {
            linkedHashMap.put(put, 0);
        }
        this.A0D = new EnumMap(linkedHashMap);
        this.A0J = new C233082uv(this.A0I, new C233062ut(this), this.A0K, contextualFeedFragment, this.A0L);
    }

    public final void A05(1Xj r13, AnonymousClass3W1 r14, AnonymousClass3DY r15, int i) {
        C230282pK r0;
        String str;
        String str2;
        this.A0D = 0Yt.A03(I52.A02(this.A07));
        UserSession userSession = this.A0I;
        1Xj r7 = r13;
        AnonymousClass3DY r3 = r15;
        if (I52.A03(userSession, C55045HbG.A00(userSession, r13, r15), this.A0D)) {
            this.A0K.A0B(r7, (Long) null, (Long) null, r15.A00, AnonymousClass000.A00(339));
            return;
        }
        AnonymousClass2rI r1 = this.A07;
        String str3 = null;
        if (r1 != null) {
            int i2 = i;
            1Xg A042 = r1.A04(i + 1);
            if (A042 != null) {
                if (AnonymousClass3VP.A01(A042)) {
                    r0 = this.A0K;
                    str = r15.A00;
                    str2 = "gap_zero_next_item_is_sponsored";
                    r0.A0B(r13, (Long) null, (Long) null, str, str2);
                }
                int A002 = I52.A00(userSession, C233052us.FEED_POST_ORGANIC_ENGAGEMENT_MULTI_ADS, this.A0D);
                this.A0K.A0A(r13, (Integer) null, r15.A00, A002);
                this.A03 = i2;
                this.A04 = r13;
                this.A05 = r14;
                this.A0E = false;
                this.A08 = null;
                this.A06 = r15;
                String A2n = r13.A2n();
                User A2A = r13.A2A(userSession);
                if (A2A != null) {
                    str3 = A2A.getId();
                }
                A03(A00(r3, this, A2n, str3, r13.A0C.BIl(), i2, A002), this);
                return;
            }
        }
        r0 = this.A0K;
        str = r15.A00;
        str2 = "gap_zero_next_position_invalid";
        r0.A0B(r13, (Long) null, (Long) null, str, str2);
    }

    public final void A06(1Xj r27, AnonymousClass3W1 r28, AnonymousClass3DY r29, Integer num, int i) {
        C233052us r0;
        Integer num2;
        String str;
        1Xg A042;
        1Xj A022;
        this.A0D = 0Yt.A03(I52.A02(this.A07));
        UserSession userSession = this.A0I;
        1Xj r15 = r27;
        AnonymousClass3DY r10 = r29;
        if (I52.A03(userSession, C55045HbG.A00(userSession, r15, r10), this.A0D)) {
            this.A0K.A0B(r15, (Long) null, (Long) null, r10.A00, AnonymousClass000.A00(339));
            return;
        }
        Map map = this.A0D;
        0Tu r3 = 0Tu.A06;
        if (182.A06(r3, userSession, 36312887633905033L) || 182.A06(r3, userSession, 36312887639999947L)) {
            r0 = C233052us.FEED_POST_AD_CLICK_SINGLE_AD;
        } else {
            r0 = C233052us.FEED_POST_AD_CLICK_MULTI_ADS;
        }
        int A002 = I52.A00(userSession, r0, map);
        String str2 = null;
        C230282pK r7 = this.A0K;
        String str3 = r10.A00;
        int i2 = i;
        if (num != null) {
            num2 = Integer.valueOf((i - num.intValue()) - 1);
        } else {
            num2 = null;
        }
        r7.A0A(r15, num2, str3, A002);
        this.A04 = r15;
        this.A05 = r28;
        this.A03 = i2;
        this.A01 = -1;
        this.A0E = false;
        this.A08 = null;
        this.A06 = r10;
        AnonymousClass2rI r6 = this.A07;
        if (r6 == null || (A042 = r6.A04(I52.A01(r6, i2).A00)) == null || (A022 = 1Xi.A02(A042.A05)) == null) {
            str = null;
        } else {
            str2 = C231122qu.A07(userSession, A022);
            str = C231122qu.A0F(userSession, A022);
        }
        Boolean valueOf = Boolean.valueOf(C231122qu.A0O(userSession, r15));
        String A072 = C231122qu.A07(userSession, r15);
        if (A072 != null) {
            String A0F2 = C231122qu.A0F(userSession, r15);
            if (A0F2 != null) {
                A07(r10, valueOf, Boolean.valueOf(r15.CeS()), Integer.valueOf(A002), Integer.valueOf(A01(r15).A0y()), Integer.valueOf(A01(r15).A0x()), A072, A0F2, r15.A0C.BIl(), str2, str, (String) null, (String) null, (String) null, i2, false);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A07(AnonymousClass3DY r23, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        String str9;
        UserSession userSession = this.A0I;
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A01);
        r2.A0A("discover/chaining_experience_contextual_ads/");
        r2.A0O((15p) null, C54077Gz1.class, D1T.class, false);
        r2.A00 = this.A0H.A00;
        r2.A9m("container_module", "feed_timeline");
        String str10 = str;
        r2.A9m("seed_ad_id", str10);
        r2.A9m(C273654mx.A00(3294), str2);
        r2.A0C("position", i);
        AnonymousClass3DY r1 = r23;
        r2.A9m("trigger_type", r1.A00);
        r2.A9m("inventory_source", C241323Ot.A02(str3));
        r2.A09(num, "num_multi_ads_in_feed");
        r2.A0G(C273654mx.A00(3056), str4);
        r2.A0G(C273654mx.A00(839), str5);
        r2.A9m("log_exposure_on_server", "true");
        r2.A0E(C273654mx.A00(2942), bool);
        r2.A0E("is_seed_video_ad", bool2);
        r2.A09(num2, "seed_media_width");
        r2.A09(num3, "seed_media_height");
        r2.A0G("multi_ad_individual_chain_ad_tracking_token", str6);
        r2.A0G("multi_ad_individual_chain_ad_ad_id", str7);
        if (r1 == AnonymousClass3DY.FEED_OF_ADS_PAGINATION) {
            r2.A0G(AnonymousClass000.A00(4591), str8);
            if (z) {
                str9 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str9 = "0";
            }
            r2.A0G("is_first_page", str9);
        }
        r2.A0R = true;
        Context context = this.A0G;
        1G2.A00(context, r2, userSession, new 1Cn(context), false);
        1OC A0M = r2.A0M();
        this.A09.DFK(new AnonymousClass4LN((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0sr.A1M(new String[]{str10}), false, false, false, false));
        A02(A0M, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r19 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r10.CeS() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r19 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r8 == X.16V.A05) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (r5.A2o == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(X.1Xj r16, X.AnonymousClass3W1 r17, X.AnonymousClass3DY r18, X.16V r19) {
        /*
            r15 = this;
            r2 = 0
            r3 = 1
            r4 = r18
            int r1 = r4.ordinal()
            r9 = 1
            r10 = r16
            r8 = r19
            r5 = r17
            if (r1 == r2) goto L_0x0065
            r0 = 4
            if (r1 == r0) goto L_0x004f
            r0 = 20
            if (r1 != r0) goto L_0x0033
            com.instagram.common.session.UserSession r7 = r15.A0I
            X.0Tu r6 = X.0Tu.A06
            r0 = 36312887635936667(0x810261004f059b, double:3.027754589003848E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0033
            X.16V r0 = X.16V.A05
            if (r8 == r0) goto L_0x002d
            if (r19 != 0) goto L_0x0033
        L_0x002d:
            boolean r0 = r10.CeS()
            if (r0 != 0) goto L_0x0079
        L_0x0033:
            r9 = 0
        L_0x0034:
            r6 = 0
            if (r9 == 0) goto L_0x00bb
            X.2pK r9 = r15.A0K
            r0 = 2
            X.0qQ.A0B(r9, r0)
            boolean r0 = r5.A2O
            if (r0 == 0) goto L_0x009b
            java.lang.String r13 = r4.A00
            r11 = 0
            r0 = 636(0x27c, float:8.91E-43)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            r12 = r11
            r9.A0B(r10, r11, r12, r13, r14)
            return r2
        L_0x004f:
            com.instagram.common.session.UserSession r7 = r15.A0I
            X.0Tu r6 = X.0Tu.A06
            r0 = 36312887636002204(0x8102610050059c, double:3.027754589045294E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0033
            X.16V r0 = X.16V.A05
            if (r8 == r0) goto L_0x0079
            if (r19 == 0) goto L_0x0079
            goto L_0x0033
        L_0x0065:
            com.instagram.common.session.UserSession r7 = r15.A0I
            X.0Tu r6 = X.0Tu.A06
            r0 = 36312887636067741(0x8102610051059d, double:3.0277545890867395E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0033
            X.16V r0 = X.16V.A05
            if (r8 == r0) goto L_0x0079
            goto L_0x0033
        L_0x0079:
            boolean r0 = r10.CcK()
            if (r0 != 0) goto L_0x0033
            X.1sy r1 = r5.A0o
            X.1sy r0 = X.1sy.A0H
            if (r1 != r0) goto L_0x0033
            r0 = 36311852543640352(0x81017000000320, double:3.027099992467676E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r15.CTb()
            if (r0 != 0) goto L_0x0033
            boolean r0 = r5.A2o
            if (r0 != 0) goto L_0x0033
            goto L_0x0034
        L_0x009b:
            r0 = 100
            X.2HY r1 = new X.2HY
            r1.<init>(r3, r0)
            X.2SQ r0 = X.2SP.A00
            int r0 = X.C229632nm.A04(r0, r1)
            double r3 = (double) r0
            com.instagram.common.session.UserSession r5 = r15.A0I
            X.0Tu r2 = X.0Tu.A06
            r0 = 37157312564690986(0x840261003a002a, double:3.5617723141743454E-306)
            double r1 = X.182.A00(r2, r5, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00bb
            r6 = 1
        L_0x00bb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233002un.A08(X.1Xj, X.3W1, X.3DY, X.16V):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01bc, code lost:
        if (r0 != false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01d5, code lost:
        if (r0 != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0204, code lost:
        if (X.C231122qu.A0O(r4, r2) == false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015b, code lost:
        if ((r12 + 1) == r1) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0170, code lost:
        if (r0 != r13) goto L_0x0172;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09(X.1Xj r18, X.AnonymousClass3W1 r19, X.AnonymousClass3DY r20, java.lang.Integer r21) {
        /*
            r17 = this;
            r9 = 1
            r5 = 0
            r11 = 2
            r7 = r17
            boolean r0 = r7.CTb()
            if (r0 != 0) goto L_0x007d
            r2 = r18
            boolean r0 = r2.CcK()
            if (r0 == 0) goto L_0x007d
            r8 = r19
            X.1sy r1 = r8.A0o
            X.1sy r0 = X.1sy.A0H
            if (r1 != r0) goto L_0x007d
            com.instagram.common.session.UserSession r4 = r7.A0I
            X.0Tu r3 = X.0Tu.A06
            r0 = 36311852543640352(0x81017000000320, double:3.027099992467676E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x007d
            boolean r0 = r8.A2o
            if (r0 != 0) goto L_0x007d
            X.2rI r6 = r7.A07
            r0 = 36326236389652113(0x810e8500083691, double:3.036196394604613E-306)
            boolean r1 = X.182.A06(r3, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x00f7
            boolean r0 = r2.CcK()
            if (r0 == 0) goto L_0x00f7
            r0 = 36314670042385143(0x81040000030af7, double:3.028881790019039E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00f7
            r0 = 36326236389127821(0x810e850000368d, double:3.0361963942730483E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x007e
            r0 = 36326236389193358(0x810e850001368e, double:3.036196394314494E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x007e
            X.1Xy r0 = r2.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x007e
            X.3l2 r0 = r0.AaH()
            if (r0 == 0) goto L_0x007e
            X.4fq r0 = r0.B5D()
            if (r0 == 0) goto L_0x007e
        L_0x007d:
            return r5
        L_0x007e:
            r0 = 36326236389127821(0x810e850000368d, double:3.0361963942730483E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00a9
            r0 = 36326236389455503(0x810e850005368f, double:3.036196394480276E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00a9
            X.1Xy r0 = r2.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x00a9
            X.3l2 r0 = r0.AaH()
            if (r0 == 0) goto L_0x00a9
            X.4fq r0 = r0.B5N()
            if (r0 == 0) goto L_0x00a9
            return r5
        L_0x00a9:
            r0 = 36323521969794287(0x810c0d00002cef, double:3.034479784556432E-306)
            boolean r1 = X.182.A06(r3, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x00d0
            X.1Xy r0 = r2.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x00d0
            X.3l2 r0 = r0.AaH()
            if (r0 == 0) goto L_0x00d0
            X.4fs r0 = r0.BIQ()
            if (r0 == 0) goto L_0x00d0
            return r5
        L_0x00d0:
            r0 = 36328736060161598(0x8110cb00013e3e, double:3.037777196300176E-306)
            boolean r1 = X.182.A06(r3, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x00f7
            X.1Xy r0 = r2.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x00f7
            X.3l2 r0 = r0.AaH()
            if (r0 == 0) goto L_0x00f7
            X.4fr r0 = r0.B5T()
            if (r0 == 0) goto L_0x00f7
            return r5
        L_0x00f7:
            r0 = 36312887633970570(0x8102610031058a, double:3.02775458776048E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r10 = r20
            if (r0 == 0) goto L_0x01be
            X.1Av r0 = X.1Au.A00(r4)
            boolean r0 = X.C228342lQ.A08(r4, r0)
            if (r0 != 0) goto L_0x0129
            X.0Tu r12 = X.0Tu.A05
            r0 = 36312879040824667(0x81025f0000055b, double:3.027749153420409E-306)
            boolean r0 = X.182.A06(r12, r4, r0)
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = r2.getId()
            if (r0 != 0) goto L_0x0130
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0129:
            java.lang.String r0 = r2.A2R()
            if (r0 != 0) goto L_0x0130
            return r5
        L_0x0130:
            if (r6 == 0) goto L_0x007d
            int r12 = r6.BJU(r0)
            r1 = -1
            java.util.List r0 = r6.A08()
            java.util.Iterator r15 = r0.iterator()
            r14 = 0
        L_0x0140:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r15.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1UQ r13 = r0.A06
            X.1UQ r0 = X.1UQ.A0F
            if (r13 != r0) goto L_0x01ae
            r1 = r14
        L_0x0153:
            X.3DY r0 = X.AnonymousClass3DY.END_OF_FEED
            if (r10 == r0) goto L_0x015d
            int r0 = r12 + 1
            r16 = 1
            if (r0 != r1) goto L_0x015f
        L_0x015d:
            r16 = 0
        L_0x015f:
            java.util.List r0 = r6.A08()
            int r13 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            int r0 = r12 + 1
            if (r1 == 0) goto L_0x0172
            r15 = 0
            if (r0 == r13) goto L_0x0173
        L_0x0172:
            r15 = 1
        L_0x0173:
            java.util.List r0 = r6.A08()
            X.0sj r0 = X.00k.A0p(r0)
            r6 = -1
            java.util.Iterator r14 = r0.iterator()
            r13 = 0
        L_0x0181:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r14.next()
            if (r13 >= 0) goto L_0x0195
            X.0sr.A1T()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0195:
            X.0k0 r0 = (X.0k0) r0
            int r1 = r0.A00
            java.lang.Object r0 = r0.A01
            X.1Xg r0 = (X.1Xg) r0
            if (r1 < r12) goto L_0x01ab
            X.1UQ r0 = r0.A06
            X.0qQ.A0B(r0, r5)
            int r0 = r0.ordinal()
            switch(r0) {
                case 5: goto L_0x01b1;
                case 18: goto L_0x01b1;
                case 20: goto L_0x01b1;
                case 21: goto L_0x01b1;
                case 34: goto L_0x01b1;
                case 35: goto L_0x01b1;
                case 36: goto L_0x01b1;
                case 38: goto L_0x01b1;
                case 53: goto L_0x01b1;
                case 54: goto L_0x01b1;
                case 55: goto L_0x01b1;
                case 59: goto L_0x01b1;
                default: goto L_0x01ab;
            }
        L_0x01ab:
            int r13 = r13 + 1
            goto L_0x0181
        L_0x01ae:
            int r14 = r14 + 1
            goto L_0x0140
        L_0x01b1:
            r6 = r13
        L_0x01b2:
            int r1 = r12 + 2
            r0 = 0
            if (r1 == r6) goto L_0x01b8
            r0 = 1
        L_0x01b8:
            if (r16 == 0) goto L_0x007d
            if (r15 == 0) goto L_0x007d
            if (r0 == 0) goto L_0x007d
        L_0x01be:
            int r0 = r21.intValue()
            if (r0 == r5) goto L_0x0207
            if (r0 == r9) goto L_0x01f5
            boolean r0 = X.C231122qu.A0O(r4, r2)
            if (r0 != 0) goto L_0x01d7
            r0 = 36312887635412373(0x81026100470595, double:3.027754588672282E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
        L_0x01d5:
            if (r0 == 0) goto L_0x007d
        L_0x01d7:
            X.2pK r3 = r7.A0K
            X.0qQ.A0B(r3, r11)
            boolean r0 = r8.A2O
            if (r0 == 0) goto L_0x01f3
            java.lang.String r1 = r10.A00
            r5 = 0
            r0 = 636(0x27c, float:8.91E-43)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            r6 = r5
            r7 = r1
            r4 = r2
            r3.A0B(r4, r5, r6, r7, r8)
            r0 = 1
        L_0x01f0:
            r0 = r0 ^ 1
            return r0
        L_0x01f3:
            r0 = 0
            goto L_0x01f0
        L_0x01f5:
            r0 = 36312887635412373(0x81026100470595, double:3.027754588672282E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x007d
            boolean r0 = X.C231122qu.A0O(r4, r2)
            if (r0 != 0) goto L_0x007d
            goto L_0x01d7
        L_0x0207:
            boolean r0 = X.C231122qu.A0O(r4, r2)
            goto L_0x01d5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233002un.A09(X.1Xj, X.3W1, X.3DY, java.lang.Integer):boolean");
    }

    public final boolean A7L(C233632w4 r2, C233042ur r3, C233072uu r4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        this.A0A = r4;
        this.A09 = r3;
        return true;
    }

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r1, C238523Ce r2, boolean z) {
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r2, C233632w4 r3, C238523Ce r4, String str, String str2, double d, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
    }

    public final void Cn9(int i) {
    }

    public final boolean D69(int i, int i2) {
        return false;
    }

    public final void DsJ(int i) {
    }

    public static final 1OC A00(AnonymousClass3DY r6, C233002un r7, String str, String str2, String str3, int i, int i2) {
        if (str == null || str2 == null) {
            0wb.A03(AnonymousClass000.A00(2329), 002.A0u("seedMediaId or mediaAuthorIgid is null for POE request.seedMediaId = ", str, ", mediaAuthorIgid = ", str2));
        }
        UserSession userSession = r7.A0I;
        1NY r3 = new 1NY(userSession, -2);
        r3.A04();
        r3.A0A("discover/chaining_experience_contextual_ads/");
        r3.A0Q(C54077Gz1.class, D1T.class);
        r3.A00 = r7.A0H.A00;
        r3.A9m("container_module", "feed_timeline");
        StringWriter stringWriter = new StringWriter();
        17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
        A0A2.A0c();
        if (str != null) {
            A0A2.A0R(AnonymousClass000.A00(1791), str);
        }
        if (str2 != null) {
            A0A2.A0R(AnonymousClass000.A00(3557), str2);
        }
        A0A2.A0Z();
        A0A2.close();
        String obj = stringWriter.toString();
        0qQ.A07(obj);
        r3.A9m(AnonymousClass000.A00(1656), obj);
        r3.A9m("trigger_type", r6.A00);
        r3.A0C("position", i);
        r3.A9m("inventory_source", C241323Ot.A02(str3));
        r3.A0C("num_multi_ads_in_feed", i2);
        Context context = r7.A0G;
        1G2.A00(context, r3, userSession, new 1Cn(context), false);
        return r3.A0M();
    }

    public static final void A02(1OC r3, C233002un r4) {
        r4.A0C = AnonymousClass05K.A01;
        C233082uv r1 = r4.A0J;
        r1.A03 = true;
        r3.A00 = new C54240H4j(r1);
        r4.A0F = r3;
        1ES.A05(r3, 332178420, 2, true, true);
    }

    public static final void A03(1OC r3, C233002un r4) {
        r4.A0C = AnonymousClass05K.A01;
        C233082uv r1 = r4.A0J;
        r1.A03 = true;
        r3.A00 = new C54240H4j(r1);
        r4.A0F = r3;
        1ES.A05(r3, 2028084327, 2, true, true);
    }

    public final void A04() {
        AnonymousClass3DY r0;
        if (this.A0C == AnonymousClass05K.A01) {
            Integer num = this.A0L;
            Integer num2 = AnonymousClass05K.A00;
            if (num == num2 && (r0 = this.A06) != null) {
                C230282pK r3 = this.A0K;
                1Xj r4 = this.A04;
                if (r4 == null) {
                    0qQ.A0F("seedMedia");
                    throw AnonymousClass00P.createAndThrow();
                }
                r3.A0B(r4, (Long) null, (Long) null, r0.A00, "cancel_fetch");
            }
            this.A0J.A03 = false;
            this.A0H.A00();
            this.A0C = num2;
        }
    }

    public final /* synthetic */ boolean AFi() {
        return false;
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final /* synthetic */ Set Bsw() {
        return new HashSet();
    }

    public final boolean CTb() {
        if (this.A0C != AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void Cmj(boolean z) {
        throw new UnsupportedOperationException(AnonymousClass000.A00(110));
    }

    public final void deactivate() {
        this.A0J.A03 = false;
        this.A0H.A00();
    }

    public static final 1Xj A01(1Xj r1) {
        1Xj A1c;
        if (r1.A5H()) {
            return r1.A1b();
        }
        if (!r1.A5D() || (A1c = r1.A1c(0)) == null) {
            return r1;
        }
        return A1c;
    }
}
