package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class IRA implements JQF {
    public String A00;
    public final Context A01;
    public final UserSession A02;
    public final DiscoveryChainingItem A03;
    public final AnonymousClass4DU A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final ExploreTopicCluster A08;
    public final C228232l0 A09;

    public static void A00(0Tu r3, 1Fa r4, 1Fa r5, UserSession userSession) {
        if (182.A06(r3, userSession, 36313725149382862L)) {
            boolean z = 2B0.A01.A07(userSession).getBoolean("HAS_USER_EVER_SET_BREAKS", false);
            r4.A0H("has_user_set_breaks", z);
            r5.A0H("has_user_set_breaks", z);
            int A0A = (int) 1Au.A00(userSession).A0A();
            r4.A0C("take_a_break_nudge_last_seen_time", A0A);
            r5.A0C("take_a_break_nudge_last_seen_time", A0A);
            int A0O = (int) 2Aq.A03(userSession).A0O();
            r4.A0C("session_time_spent", A0O);
            r5.A0C("session_time_spent", A0O);
        }
    }

    static {
        TimeUnit.HOURS.toMillis(4);
    }

    public static void A02(1Fa r2, 1Fa r3, IRA ira, DiscoveryChainingItem discoveryChainingItem) {
        String str = discoveryChainingItem.A0H;
        r2.A9m("post_trigger_eligibility_flags", str);
        r3.A9m("post_trigger_eligibility_flags", str);
        String str2 = discoveryChainingItem.A0G;
        r2.A9m("organic_seed_ad_media_id", str2);
        r3.A9m("organic_seed_ad_media_id", str2);
        String str3 = discoveryChainingItem.A0F;
        r2.A9m("organic_seed_ad_author_id", str3);
        r3.A9m("organic_seed_ad_author_id", str3);
        String str4 = discoveryChainingItem.A0C;
        r2.A0G("interest_id", str4);
        r3.A0G("interest_id", str4);
        String str5 = ira.A07;
        r2.A9m("surface", str5);
        r3.A9m("surface", str5);
        String str6 = ira.A05;
        r2.A9m("chaining_session_id", str6);
        r3.A9m("chaining_session_id", str6);
        String str7 = ira.A06;
        r2.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
        r3.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
        String str8 = ira.A00;
        String A002 = AnonymousClass000.A00(2776);
        r2.A9m(A002, str8);
        r3.A9m(A002, str8);
    }

    public final 1NY Bn7(C231312rP r11) {
        Context context = this.A01;
        UserSession userSession = this.A02;
        boolean A1Y = DbW.A1Y(userSession);
        1NY A0M = DbU.A0M(userSession);
        Class<D1E> cls = D1E.class;
        A0M.A0O((15p) null, CGN.class, cls, false);
        A0M.A9m("trigger", "tap");
        1FZ r4 = new 1FZ(userSession, 1056774691, A1Y, false);
        r4.A00 = C51973G9u.A0d(userSession, cls, A1Y, false);
        r4.A9m("trigger", "tap");
        C51968G9o.A1C(context, A0M, userSession);
        C54969HZz.A00(A0M, r11);
        DiscoveryChainingItem discoveryChainingItem = this.A03;
        C54664HMv hMv = discoveryChainingItem.A01;
        Integer num = hMv.A00;
        A0M.A08(num);
        String str = hMv.A01;
        A0M.A0A(str);
        r4.A08(num);
        A01(r4, A0M, userSession, discoveryChainingItem, str);
        A02(A0M, r4, this, discoveryChainingItem);
        C228232l0 r0 = this.A09;
        0qQ.A0B(str, A1Y ? 1 : 0);
        Map AUH = r0.AUH(str);
        if (!AUH.isEmpty()) {
            Iterator A0u = AnonymousClass7TF.A0u(AUH);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                String str2 = (String) A1J.getValue();
                A0M.A9m(A13, str2);
                r4.A9m(A13, str2);
            }
            A0M.A9m("join_id", C51972G9s.A0s(AUH));
            r4.A9m("join_id", C51972G9s.A0s(AUH));
        }
        ExploreTopicCluster exploreTopicCluster = this.A08;
        if (exploreTopicCluster != null) {
            String str3 = exploreTopicCluster.A06;
            A0M.A9m("topic_cluster_id", str3);
            r4.A9m("topic_cluster_id", str3);
        }
        0Tu r2 = 0Tu.A05;
        A00(r2, A0M, r4, userSession);
        if (182.A06(r2, userSession, 36314923445324701L)) {
            C54966HZw.A00(A0M, r4, C250563lf.A0I(userSession, AnonymousClass05K.A00));
        }
        if (182.A06(r2, userSession, 36322796120582571L)) {
            0xa A0q = AnonymousClass7TE.A0q(userSession);
            String A002 = AnonymousClass000.A00(1542);
            int A062 = (int) DbW.A06(A0q, A002);
            A0M.A0C(A002, A062);
            r4.A0C(A002, A062);
        }
        return A0M;
    }

    public final 1FZ C1c(C231312rP r11) {
        Context context = this.A01;
        UserSession userSession = this.A02;
        boolean A1Y = DbW.A1Y(userSession);
        1NY A0M = DbU.A0M(userSession);
        Class<D1E> cls = D1E.class;
        A0M.A0O((15p) null, CGN.class, cls, false);
        A0M.A9m("trigger", "tap");
        1FZ r4 = new 1FZ(userSession, 1056774691, A1Y, false);
        r4.A00 = C51973G9u.A0d(userSession, cls, A1Y, false);
        r4.A9m("trigger", "tap");
        C51968G9o.A1C(context, A0M, userSession);
        C54969HZz.A00(A0M, r11);
        DiscoveryChainingItem discoveryChainingItem = this.A03;
        C54664HMv hMv = discoveryChainingItem.A01;
        Integer num = hMv.A00;
        A0M.A08(num);
        String str = hMv.A01;
        A0M.A0A(str);
        r4.A08(num);
        A01(r4, A0M, userSession, discoveryChainingItem, str);
        A02(A0M, r4, this, discoveryChainingItem);
        C228232l0 r0 = this.A09;
        0qQ.A0B(str, A1Y ? 1 : 0);
        Map AUH = r0.AUH(str);
        if (!AUH.isEmpty()) {
            Iterator A0u = AnonymousClass7TF.A0u(AUH);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                String str2 = (String) A1J.getValue();
                A0M.A9m(A13, str2);
                r4.A9m(A13, str2);
            }
            A0M.A9m("join_id", C51972G9s.A0s(AUH));
            r4.A9m("join_id", C51972G9s.A0s(AUH));
        }
        ExploreTopicCluster exploreTopicCluster = this.A08;
        if (exploreTopicCluster != null) {
            String str3 = exploreTopicCluster.A06;
            A0M.A9m("topic_cluster_id", str3);
            r4.A9m("topic_cluster_id", str3);
        }
        0Tu r2 = 0Tu.A05;
        A00(r2, A0M, r4, userSession);
        if (182.A06(r2, userSession, 36314923445324701L)) {
            C54966HZw.A00(A0M, r4, C250563lf.A0I(userSession, AnonymousClass05K.A00));
        }
        if (182.A06(r2, userSession, 36322796120582571L)) {
            0xa A0q = AnonymousClass7TE.A0q(userSession);
            String A002 = AnonymousClass000.A00(1542);
            int A062 = (int) DbW.A06(A0q, A002);
            A0M.A0C(A002, A062);
            r4.A0C(A002, A062);
        }
        C51968G9o.A1C(context, r4, userSession);
        C54969HZz.A00(r4, r11);
        return r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        X.0qQ.A0C(r1, r0);
        r8.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        r8.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
        r9.addAll(X.C242613Ve.A00(r13.A01, r13.A04, r13.A02, r3, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        r5 = r5 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C55863Hok E1u(X.AnonymousClass1XT r14, int r15) {
        /*
            r13 = this;
            X.CGN r14 = (X.CGN) r14
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            X.0wj r2 = X.0wj.A01
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r14.A05
            if (r0 != 0) goto L_0x00a5
            r1 = 817903268(0x30c036a4, float:1.3985368E-9)
            java.lang.String r0 = "Received null FeedItem list from MediaFeedResponse payload on IG Explore Chain"
            X.DbT.A1Q(r2, r0, r1)
        L_0x0020:
            r0 = 0
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r4.removeAll(r0)
            r5 = 0
        L_0x0029:
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x00c2
            int r6 = r15 + r5
            java.lang.Object r3 = r4.get(r5)
            X.1Xg r3 = (X.1Xg) r3
            X.1UQ r0 = r3.A06
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x006e;
                case 1: goto L_0x006e;
                case 3: goto L_0x004f;
                case 5: goto L_0x004f;
                case 11: goto L_0x004f;
                case 33: goto L_0x0043;
                case 38: goto L_0x0059;
                case 44: goto L_0x0068;
                case 46: goto L_0x0068;
                case 47: goto L_0x0068;
                case 57: goto L_0x0054;
                default: goto L_0x0040;
            }
        L_0x0040:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0043:
            X.1Xn r1 = r3.A05
            r0 = 37
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            goto L_0x006a
        L_0x004f:
            X.1Xn r1 = r3.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedUsers"
            goto L_0x0061
        L_0x0054:
            X.1Xn r1 = r3.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.tifu.model.TifuNetegoItem"
            goto L_0x0061
        L_0x0059:
            X.1Xn r1 = r3.A05
            r0 = 5086(0x13de, float:7.127E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x0061:
            X.0qQ.A0C(r1, r0)
            r8.add(r1)
            goto L_0x0092
        L_0x0068:
            X.4gm r1 = r3.A00
        L_0x006a:
            r8.add(r1)
            goto L_0x0040
        L_0x006e:
            X.1UQ r1 = r3.A06
            X.1UQ r0 = X.1UQ.A04
            if (r1 != r0) goto L_0x00a0
            X.1Xn r1 = r3.A05
            r0 = 178(0xb2, float:2.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
        L_0x007f:
            r8.add(r1)
            X.1Xj r1 = X.C51965G9l.A0o(r3)
            r1.getClass()
            boolean r0 = r1.A4w()
            if (r0 == 0) goto L_0x0040
            r10.add(r1)
        L_0x0092:
            android.content.Context r2 = r13.A01
            com.instagram.common.session.UserSession r1 = r13.A02
            X.4DU r0 = r13.A04
            java.util.ArrayList r0 = X.C242613Ve.A00(r2, r0, r1, r3, r6)
            r9.addAll(r0)
            goto L_0x0040
        L_0x00a0:
            X.1Xj r1 = X.C51965G9l.A0o(r3)
            goto L_0x007f
        L_0x00a5:
            java.util.Iterator r3 = r0.iterator()
        L_0x00a9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r2 = r3.next()
            X.1Xg r2 = (X.1Xg) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r0 = 1
            X.1Xg r0 = X.1Xi.A00(r2, r1, r0)
            r4.add(r0)
            goto L_0x00a9
        L_0x00c2:
            java.lang.String r6 = r14.A01
            if (r6 == 0) goto L_0x00d9
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r0 = r13.A03
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x00d9
            r13.A00 = r6
            com.instagram.common.session.UserSession r0 = r13.A02
            X.IOm r0 = X.Ha0.A00(r0)
            java.util.Map r0 = r0.A00
            r0.put(r1, r6)
        L_0x00d9:
            java.util.Map r11 = java.util.Collections.emptyMap()
            X.0qQ.A07(r11)
            boolean r12 = r14.A07
            java.lang.String r7 = r14.A02
            java.util.List r5 = r14.A04
            if (r5 == 0) goto L_0x011b
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x011b
            r4 = 0
            java.lang.Object r0 = r5.get(r4)
            X.CsT r0 = (X.C45215CsT) r0
            java.util.List r0 = r0.A00
            int r3 = X.C51971G9r.A0I(r0, r4)
            r1 = 1
            java.lang.Object r0 = r5.get(r1)
            X.CsT r0 = (X.C45215CsT) r0
            java.util.List r0 = r0.A00
            int r2 = X.C51971G9r.A0I(r0, r1)
            java.lang.Object r0 = r5.get(r4)
            X.CsT r0 = (X.C45215CsT) r0
            java.util.List r0 = r0.A00
            int r1 = X.C51971G9r.A0I(r0, r1)
            X.1sV r0 = new X.1sV
            r0.<init>(r3, r2, r1)
            r14.A00 = r0
        L_0x011b:
            X.1sV r5 = r14.A00
            X.Hok r4 = new X.Hok
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IRA.E1u(X.1XT, int):X.Hok");
    }

    public IRA(Context context, UserSession userSession, DiscoveryChainingItem discoveryChainingItem, ExploreTopicCluster exploreTopicCluster, AnonymousClass4DU r6, C228232l0 r7, String str, String str2, String str3) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = discoveryChainingItem;
        this.A08 = exploreTopicCluster;
        this.A04 = r6;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A00 = discoveryChainingItem.A09;
        this.A09 = r7;
    }

    public static void A01(1Fa r3, 1Fa r4, UserSession userSession, DiscoveryChainingItem discoveryChainingItem, String str) {
        r3.A0A(str);
        String str2 = discoveryChainingItem.A0E;
        r4.A9m("media_id", str2);
        r3.A9m("media_id", str2);
        String valueOf = String.valueOf(discoveryChainingItem.A00);
        r4.A9m("media_type", valueOf);
        r3.A9m("media_type", valueOf);
        String str3 = discoveryChainingItem.A0D;
        r4.A9m("author_id", str3);
        r3.A9m("author_id", str3);
        String str4 = discoveryChainingItem.A05;
        r4.A9m("ad_id", str4);
        r3.A9m("ad_id", str4);
        String str5 = discoveryChainingItem.A06;
        r4.A9m("seed_ad_token", str5);
        r3.A9m("seed_ad_token", str5);
        String str6 = discoveryChainingItem.A07;
        r4.A9m("category_id", str6);
        r3.A9m("category_id", str6);
        String str7 = discoveryChainingItem.A0I;
        r4.A9m("explore_source_token", str7);
        r3.A9m("explore_source_token", str7);
        String str8 = discoveryChainingItem.A0A;
        r4.A9m("grid_pagination_token", str8);
        r3.A9m("grid_pagination_token", str8);
        String str9 = (String) C52550GXb.A00(userSession).A01.get(str2);
        String A002 = AnonymousClass000.A00(2777);
        r4.A9m(A002, str9);
        r3.A9m(A002, str9);
        Boolean bool = discoveryChainingItem.A03;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            String A003 = C273654mx.A00(322);
            r4.A0H(A003, booleanValue);
            r3.A0H(A003, booleanValue);
        }
    }
}
