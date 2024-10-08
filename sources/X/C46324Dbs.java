package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dbs  reason: case insensitive filesystem */
public final class C46324Dbs {
    public final long A01(UserSession userSession, 1QK r6, String str) {
        0Tu r2;
        long j;
        long j2;
        long A01;
        int A04;
        long j3;
        long A012;
        0qQ.A0B(userSession, 2);
        if (str == null || !00l.A0d(str, "clips_viewer", false) || !182.A06(0Tu.A05, userSession, 36320524085109298L)) {
            if (0qQ.A0K(str, "stories_precapture_camera")) {
                r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36320524084781615L)) {
                    j = 36601999060242846L;
                    A04 = DbS.A04(r2, userSession, j);
                    return TimeUnit.SECONDS.toMillis((long) A04);
                }
            }
            if (r6 != 1QK.A09) {
                if (r6 == 1QK.A0F) {
                    r2 = 0Tu.A05;
                    j = 36601999059521943L;
                } else if (r6 == 1QK.A0E || (0qQ.A0K(str, "profile") && 182.A06(0Tu.A05, userSession, 36320524084716078L))) {
                    r2 = 0Tu.A05;
                    j = 36601999059587480L;
                } else if (0qQ.A0K(str, "direct_inbox")) {
                    r2 = 0Tu.A05;
                    j = 36601999059653017L;
                } else {
                    boolean A0K = 0qQ.A0K(str, "feed_timeline");
                    r2 = 0Tu.A05;
                    if (A0K) {
                        if (182.A06(r2, userSession, 36320524082684444L)) {
                            boolean z = AnonymousClass1B0.A05;
                            if (AnonymousClass1B1.A00(userSession).A00(1B2.A0S)) {
                                j2 = 36601999059456406L;
                                A01 = 182.A01(r2, userSession, j2);
                                A04 = (int) A01;
                                return TimeUnit.SECONDS.toMillis((long) A04);
                            }
                        }
                        j2 = 36601999059325333L;
                        A01 = 182.A01(r2, userSession, j2);
                        A04 = (int) A01;
                        return TimeUnit.SECONDS.toMillis((long) A04);
                    }
                    j = 36601999061619106L;
                }
                A04 = DbS.A04(r2, userSession, j);
                return TimeUnit.SECONDS.toMillis((long) A04);
            }
        }
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36320524085371445L)) {
            j3 = 36601999062143397L;
        } else {
            0Tu r22 = 0Tu.A06;
            if (182.A06(r22, userSession, 36331089703289750L)) {
                A012 = 182.A01(r22, userSession, 36612564679924066L);
                A01 = Long.valueOf(A012).longValue();
                A04 = (int) A01;
                return TimeUnit.SECONDS.toMillis((long) A04);
            }
            j3 = 36601762836123982L;
        }
        A012 = 182.A01(r3, userSession, j3);
        A01 = Long.valueOf(A012).longValue();
        A04 = (int) A01;
        return TimeUnit.SECONDS.toMillis((long) A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r3.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        return "surface_common";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        if (r3.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        return "stories_subsurface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        X.02m.A0p.markerAnnotate(728440635, "AppEntryUnknownSurface", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (r3.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f2, code lost:
        return "main_feed_subsurface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        if (r3.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010c, code lost:
        return "explore_subsurface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0115, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012e, code lost:
        if (r3.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0130, code lost:
        return "direct_subsurface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013f, code lost:
        if (r3.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0141, code lost:
        return "profile_subsurface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014e, code lost:
        if (r3.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0150, code lost:
        return "reels_subsurface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return "surface_unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return "profile";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            java.lang.String r1 = "profile"
            switch(r0) {
                case -1992656117: goto L_0x0144;
                case -1823682428: goto L_0x0139;
                case -1672211929: goto L_0x0136;
                case -1038517703: goto L_0x0133;
                case -1028347126: goto L_0x0124;
                case -975990334: goto L_0x0119;
                case -815402058: goto L_0x010f;
                case -798881552: goto L_0x0104;
                case -633730979: goto L_0x00f5;
                case -496361507: goto L_0x00ea;
                case -490590566: goto L_0x00e7;
                case -359704388: goto L_0x00e4;
                case -309425751: goto L_0x00df;
                case -208594112: goto L_0x00d0;
                case -138905007: goto L_0x00cd;
                case -32305112: goto L_0x00be;
                case -13269627: goto L_0x00af;
                case 136678739: goto L_0x00a8;
                case 227128404: goto L_0x00a1;
                case 275218302: goto L_0x009e;
                case 339532540: goto L_0x0096;
                case 425838154: goto L_0x0087;
                case 656852906: goto L_0x007f;
                case 660917936: goto L_0x0074;
                case 705032657: goto L_0x0071;
                case 771409393: goto L_0x006a;
                case 877420756: goto L_0x0066;
                case 935219501: goto L_0x0057;
                case 954396989: goto L_0x0048;
                case 1058943669: goto L_0x0045;
                case 1242359051: goto L_0x0041;
                case 1306817302: goto L_0x003d;
                case 1397074194: goto L_0x0035;
                case 1805942339: goto L_0x002d;
                case 1837808251: goto L_0x0029;
                case 1923531785: goto L_0x0022;
                case 2025153904: goto L_0x001a;
                case 2038017669: goto L_0x0016;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.02m r2 = X.02m.A0p
            r1 = 728440635(0x2b6b1f3b, float:8.353211E-13)
            java.lang.String r0 = "AppEntryUnknownSurface"
            r2.markerAnnotate(r1, r0, r3)
            java.lang.String r1 = "surface_unknown"
        L_0x0015:
            return r1
        L_0x0016:
            java.lang.String r0 = "clips_viewer_explore_popular_default_unit"
            goto L_0x0106
        L_0x001a:
            r0 = 285(0x11d, float:4.0E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x013b
        L_0x0022:
            r0 = 2106(0x83a, float:2.951E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x004e
        L_0x0029:
            java.lang.String r0 = "clips_viewer_feed_timeline_explore_story"
            goto L_0x00ec
        L_0x002d:
            r0 = 3116(0xc2c, float:4.366E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x013b
        L_0x0035:
            r0 = 496(0x1f0, float:6.95E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x012a
        L_0x003d:
            java.lang.String r0 = "direct_reshare_sheet"
            goto L_0x012a
        L_0x0041:
            java.lang.String r0 = "clips_viewer_reel"
            goto L_0x014a
        L_0x0045:
            java.lang.String r0 = "stories_precapture_camera"
            goto L_0x008d
        L_0x0048:
            r0 = 985(0x3d9, float:1.38E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
        L_0x004e:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "surface_common"
            return r1
        L_0x0057:
            r0 = 1329(0x531, float:1.862E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "explore"
            return r1
        L_0x0066:
            java.lang.String r0 = "feed_contextual_chain"
            goto L_0x0106
        L_0x006a:
            r0 = 2815(0xaff, float:3.945E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x00ec
        L_0x0071:
            java.lang.String r0 = "newsfeed_you"
            goto L_0x00ec
        L_0x0074:
            java.lang.String r0 = "direct_inbox"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "direct"
            return r1
        L_0x007f:
            r0 = 501(0x1f5, float:7.02E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x012a
        L_0x0087:
            r0 = 4049(0xfd1, float:5.674E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x008d:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "stories_subsurface"
            return r1
        L_0x0096:
            r0 = 4773(0x12a5, float:6.688E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x013b
        L_0x009e:
            java.lang.String r0 = "clips_viewer_feed_timeline_mixed_unconnected"
            goto L_0x00ec
        L_0x00a1:
            r0 = 605(0x25d, float:8.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x00ec
        L_0x00a8:
            r0 = 23
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x012a
        L_0x00af:
            r0 = 2807(0xaf7, float:3.933E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "creation_subsurface"
            return r1
        L_0x00be:
            r0 = 1180(0x49c, float:1.654E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "reels"
            return r1
        L_0x00cd:
            java.lang.String r0 = "clips_viewer_explore_popular_minor_unit"
            goto L_0x0106
        L_0x00d0:
            r0 = 4776(0x12a8, float:6.693E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "creation"
            return r1
        L_0x00df:
            boolean r0 = r3.equals(r1)
            goto L_0x0115
        L_0x00e4:
            java.lang.String r0 = "clips_viewer_clips_profile"
            goto L_0x013b
        L_0x00e7:
            java.lang.String r0 = "clips_viewer_direct"
            goto L_0x012a
        L_0x00ea:
            java.lang.String r0 = "clips_viewer_clips_netego"
        L_0x00ec:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "main_feed_subsurface"
            return r1
        L_0x00f5:
            r0 = 362(0x16a, float:5.07E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "stories"
            return r1
        L_0x0104:
            java.lang.String r0 = "search_typeahead"
        L_0x0106:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "explore_subsurface"
            return r1
        L_0x010f:
            java.lang.String r0 = "self_profile"
            boolean r0 = r3.equals(r0)
        L_0x0115:
            if (r0 != 0) goto L_0x0015
            goto L_0x0009
        L_0x0119:
            java.lang.String r0 = "feed_timeline"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "main_feed"
            return r1
        L_0x0124:
            r0 = 3009(0xbc1, float:4.217E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x012a:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "direct_subsurface"
            return r1
        L_0x0133:
            java.lang.String r0 = "reel_highlight_profile"
            goto L_0x013b
        L_0x0136:
            java.lang.String r0 = "self_unified_follow_lists"
            goto L_0x013b
        L_0x0139:
            java.lang.String r0 = "reel_profile"
        L_0x013b:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "profile_subsurface"
            return r1
        L_0x0144:
            r0 = 2813(0xafd, float:3.942E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x014a:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.String r1 = "reels_subsurface"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46324Dbs.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        if (X.182.A06(r2, r7, 36320524086747706L) != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cc, code lost:
        r0 = 36601999059325333L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0142, code lost:
        if (r3.equals("reels") == false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0038 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(com.instagram.common.session.UserSession r7, java.lang.String r8, long r9) {
        /*
            r6 = this;
            java.lang.String r3 = A00(r8)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320524085895735(0x81095300322237, double:3.032583910707478E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x007f
            r0 = 36883474039374343(0x83095300330207, double:3.388595728104865E-306)
            java.lang.String r0 = X.182.A04(r2, r7, r0)
            java.lang.String r4 = ","
            java.util.List r0 = X.DbV.A18(r0, r4)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x003a
            r0 = 36601999062733222(0x820953003411a6, double:3.210589819468263E-306)
        L_0x002b:
            int r0 = X.DbS.A04(r2, r7, r0)
            long r4 = (long) r0
            long r4 = r4 - r9
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0039
            r0 = 1
        L_0x0039:
            return r0
        L_0x003a:
            r0 = 36883474039505416(0x83095300350208, double:3.388595728187756E-306)
            java.lang.String r0 = X.182.A04(r2, r7, r0)
            java.util.List r0 = X.DbV.A18(r0, r4)
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x00a4
            r0 = 36883474039636489(0x83095300370209, double:3.388595728270647E-306)
            java.lang.String r0 = X.182.A04(r2, r7, r0)
            java.util.List r0 = X.DbV.A18(r0, r4)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0066
            r0 = 36601999062995368(0x820953003811a8, double:3.210589819634045E-306)
            goto L_0x002b
        L_0x0066:
            r0 = 36883474039767562(0x8309530039020a, double:3.388595728353538E-306)
            java.lang.String r0 = X.182.A04(r2, r7, r0)
            java.util.List r0 = X.DbV.A18(r0, r4)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x007f
            r0 = 36601999063126441(0x820953003a11a9, double:3.210589819716936E-306)
            goto L_0x002b
        L_0x007f:
            java.lang.String r0 = "direct_inbox"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00aa
            r0 = 3
            X.MML r1 = new X.MML
            r1.<init>(r7, r0)
            java.lang.Class<X.L4j> r0 = X.C63725L4j.class
            java.lang.Object r0 = r7.A01(r0, r1)
            X.L4j r0 = (X.C63725L4j) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00aa
            r0 = 36320524086747706(0x810953003f223a, double:3.032583911246268E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00aa
        L_0x00a4:
            r0 = 36601999062864295(0x820953003611a7, double:3.210589819551154E-306)
            goto L_0x002b
        L_0x00aa:
            r1 = 0
            java.lang.String r0 = "clips_viewer"
            boolean r0 = X.00l.A0d(r3, r0, r1)
            if (r0 == 0) goto L_0x00c5
            r0 = 36320524085109298(0x81095300262232, double:3.0325839102101324E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00c5
        L_0x00be:
            r0 = 36601762836123982(0x82091c0000114e, double:3.210440428809371E-306)
            goto L_0x002b
        L_0x00c5:
            int r0 = r3.hashCode()
            switch(r0) {
                case -2004034611: goto L_0x00d3;
                case -1884266413: goto L_0x00e2;
                case -1331586071: goto L_0x00f1;
                case -1309148525: goto L_0x0100;
                case -363331901: goto L_0x010f;
                case -309425751: goto L_0x011e;
                case -143719293: goto L_0x012d;
                case 108390809: goto L_0x013c;
                case 771377363: goto L_0x0145;
                case 990492569: goto L_0x0154;
                case 1804537277: goto L_0x0163;
                case 1820421855: goto L_0x0172;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            r0 = 36601999059325333(0x82095300001195, double:3.2105898173131E-306)
            goto L_0x002b
        L_0x00d3:
            java.lang.String r0 = "creation_subsurface"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999060308383(0x820953000f119f, double:3.210589817934785E-306)
            goto L_0x002b
        L_0x00e2:
            java.lang.String r0 = "stories"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999060046235(0x820953000b119b, double:3.2105898177690014E-306)
            goto L_0x002b
        L_0x00f1:
            java.lang.String r0 = "direct"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999059653017(0x82095300051199, double:3.210589817520329E-306)
            goto L_0x002b
        L_0x0100:
            java.lang.String r0 = "explore"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999059521943(0x82095300031197, double:3.210589817437437E-306)
            goto L_0x002b
        L_0x010f:
            java.lang.String r0 = "profile_subsurface"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999059980698(0x820953000a119a, double:3.2105898177275556E-306)
            goto L_0x002b
        L_0x011e:
            java.lang.String r0 = "profile"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999059587480(0x82095300041198, double:3.210589817478883E-306)
            goto L_0x002b
        L_0x012d:
            java.lang.String r0 = "direct_subsurface"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999060177309(0x820953000d119d, double:3.210589817851893E-306)
            goto L_0x002b
        L_0x013c:
            java.lang.String r0 = "reels"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00be
            goto L_0x00cc
        L_0x0145:
            java.lang.String r0 = "reels_subsurface"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999060111772(0x820953000c119c, double:3.210589817810447E-306)
            goto L_0x002b
        L_0x0154:
            java.lang.String r0 = "explore_subsurface"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999060439457(0x820953001111a1, double:3.2105898180176766E-306)
            goto L_0x002b
        L_0x0163:
            java.lang.String r0 = "surface_common"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999060373920(0x820953001011a0, double:3.210589817976231E-306)
            goto L_0x002b
        L_0x0172:
            java.lang.String r0 = "creation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00cc
            r0 = 36601999060242846(0x820953000e119e, double:3.210589817893339E-306)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46324Dbs.A02(com.instagram.common.session.UserSession, java.lang.String, long):boolean");
    }
}
