package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.GraphQLFollowRequestApiKt;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.5mt  reason: invalid class name and case insensitive filesystem */
public final class C294705mt {
    public String A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass4D6 A03 = 1ES.A01();
    public final Map A04 = new HashMap();
    public final boolean A05;

    public C294705mt(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        Context context = C60960kU.A00;
        0qQ.A07(context);
        this.A01 = context;
        this.A05 = 182.A06(0Tu.A05, userSession, 36328216369708111L);
    }

    public final 1OC A05(EWA ewa, User user) {
        String str;
        Integer B70;
        User user2 = user;
        0qQ.A0B(user2, 0);
        EWA ewa2 = ewa;
        0qQ.A0B(ewa2, 1);
        Map map = this.A04;
        synchronized (map) {
            String id = user2.getId();
            str = ewa2.A00;
            map.put(id, str);
        }
        UserSession userSession = this.A02;
        User A022 = 17h.A00(userSession).A02(userSession.A06);
        if (A022 != null && (B70 = A022.A03.B70()) != null && B70.intValue() >= 2000 && (ewa2 == EWA.UserActionFollow || ewa2 == EWA.UserActionUnfollow)) {
            182.A06(0Tu.A05, userSession, 36323530560908533L);
        }
        return C320126ro.A00(this.A01, userSession, (1Xj) null, (AnonymousClass3W1) null, (SearchContext) null, (Boolean) null, (Boolean) null, user2.getId(), str, A00(), (String) null, (String) null, (String) null, (String) null, (JSONObject) null);
    }

    public final void A08(Activity activity, 1P0 r21, UserSession userSession, User user) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        User user2 = user;
        0qQ.A0B(user2, 2);
        A01(activity, new EC3(r21, userSession2, this, user2), (1Xj) null, (AnonymousClass3W1) null, (SearchContext) null, this, EWA.UserActionRemoveFollower, user2, (Boolean) null, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (JSONObject) null, true);
    }

    public final void A0B(AnonymousClass07Z r11, String str, 0sP r13) {
        0qQ.A0B(r11, 0);
        AnonymousClass0xx A002 = C71772f0.A00(r11.getLifecycle());
        C376969Ka r3 = new C376969Ka((Object) null, r13, this, str, (AnonymousClass4D7) null, 1);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A002);
    }

    public final void A0C(C320136rp r5, User user, String str) {
        0qQ.A0B(user, 0);
        0qQ.A0B(r5, 1);
        user.A12(r5.A0E);
        user.A1H(r5.A0F);
        Boolean bool = r5.A02;
        if (bool != null) {
            user.A13(bool.booleanValue());
        }
        Boolean bool2 = r5.A07;
        if (bool2 != null) {
            user.A19(bool2.booleanValue());
        }
        Boolean bool3 = r5.A0A;
        if (bool3 != null) {
            user.A0p(bool3);
        }
        Boolean bool4 = r5.A00;
        if (bool4 != null) {
            user.A0y(bool4.booleanValue());
        }
        Boolean bool5 = r5.A01;
        if (bool5 != null) {
            user.A0z(bool5.booleanValue());
        }
        Boolean bool6 = r5.A05;
        if (bool6 != null) {
            user.A17(bool6.booleanValue());
        }
        Boolean bool7 = r5.A06;
        if (bool7 != null) {
            user.A18(bool7.booleanValue());
        }
        Boolean bool8 = r5.A04;
        if (bool8 != null) {
            user.A16(bool8.booleanValue());
        }
        Boolean bool9 = r5.A03;
        if (bool9 != null) {
            user.A14(bool9.booleanValue());
        }
        Boolean bool10 = r5.A0B;
        if (bool10 != null) {
            user.A1I(bool10.booleanValue());
        }
        Boolean bool11 = r5.A09;
        if (bool11 != null) {
            user.A10(bool11.booleanValue());
        }
        Boolean bool12 = r5.A0C;
        if (bool12 != null) {
            user.A1G(bool12.booleanValue());
        }
        Boolean bool13 = r5.A08;
        if (bool13 != null) {
            C262184Cl r2 = user.A03;
            17N r0 = new 17N(r2.B8F());
            r0.A04 = bool13;
            r2.EXD(r0.A00());
        }
        Boolean bool14 = r5.A0D;
        if (bool14 != null) {
            C262184Cl r22 = user.A03;
            17N r02 = new 17N(r22.B8F());
            r02.A0N = bool14;
            r22.EXD(r02.A00());
        }
        A0F(user, str, r5.A0E, r5.A0F);
    }

    public final void A0D(FollowStatus followStatus, User user, boolean z) {
        0qQ.A0B(user, 0);
        A04(AnonymousClass2f1.A00(this.A02).A0N(user), followStatus, user, z);
    }

    public final void A0E(User user) {
        0qQ.A0B(user, 0);
        user.A0G();
        A0D(user.A0G(), user, false);
        user.A03.Eal((FollowStatus) null);
    }

    public final void A0F(User user, String str, boolean z, boolean z2) {
        FollowStatus followStatus;
        if (z2) {
            followStatus = FollowStatus.A07;
        } else if (z) {
            followStatus = FollowStatus.A05;
        } else {
            followStatus = FollowStatus.A06;
        }
        Map map = this.A04;
        synchronized (map) {
            String str2 = (String) map.get(user.getId());
            if (str2 == null || str2.equals(str)) {
                map.remove(user.getId());
                A04(user.B6o(), followStatus, user, false);
            } else {
                user.A03.Eal(followStatus);
            }
        }
    }

    public final void A0G(User user, boolean z) {
        0qQ.A0B(user, 0);
        UserSession userSession = this.A02;
        if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A08) {
            A0D(FollowStatus.A04, user, false);
        }
        1OC A022 = C320126ro.A02(userSession, user.getId(), z);
        A022.A00 = new C318456oy(this, user);
        A03(A022, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.length() == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String A00() {
        /*
            r3 = this;
            java.lang.String r2 = r3.A00
            if (r2 == 0) goto L_0x000b
            int r0 = r2.length()
            r1 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            java.lang.String r0 = "follow_unknown"
            if (r1 != 0) goto L_0x0013
            if (r2 == 0) goto L_0x0026
            return r2
        L_0x0013:
            X.1Rm r2 = X.1Rm.A00()
            X.0qQ.A07(r2)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0026
            java.lang.String r0 = r2.A00
            X.0qQ.A07(r0)
            return r0
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294705mt.A00():java.lang.String");
    }

    public static final void A01(Context context, 1P0 r38, 1Xj r39, AnonymousClass3W1 r40, SearchContext searchContext, C294705mt r42, EWA ewa, User user, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        boolean z2;
        EWA ewa2;
        User user2;
        C267094ax r9;
        Integer B70;
        C294705mt r10 = r42;
        Map map = r10.A04;
        synchronized (map) {
            z2 = z;
            ewa2 = ewa;
            user2 = user;
            if (z) {
                map.put(user2.getId(), ewa2.A00);
            }
        }
        Context context2 = context;
        if (C294695ms.A02(ewa2)) {
            r9 = AnonymousClass2f1.A00(r10.A02).A0L(ewa2, user2, C61970qY.A09(context2));
        } else {
            r9 = null;
        }
        UserSession userSession = r10.A02;
        User A022 = 17h.A00(userSession).A02(userSession.A06);
        if (A022 != null && (B70 = A022.A03.B70()) != null && B70.intValue() >= 2000 && (ewa2 == EWA.UserActionFollow || ewa2 == EWA.UserActionUnfollow)) {
            182.A06(0Tu.A05, userSession, 36323530560908533L);
        }
        String id = user2.getId();
        String str5 = ewa2.A00;
        String str6 = str2;
        String str7 = str;
        AnonymousClass3W1 r7 = r40;
        JSONObject jSONObject2 = jSONObject;
        1Xj r6 = r39;
        String str8 = str4;
        String str9 = str3;
        SearchContext searchContext2 = searchContext;
        Boolean bool3 = bool;
        Context context3 = context2;
        UserSession userSession2 = userSession;
        1Xj r25 = r6;
        AnonymousClass3W1 r26 = r7;
        SearchContext searchContext3 = searchContext2;
        Boolean bool4 = bool3;
        1OC A002 = C320126ro.A00(context3, userSession2, r25, r26, searchContext3, bool4, bool2, id, str5, r10.A00(), str7, str6, str9, str8, jSONObject2);
        1P0 r4 = r38;
        A002.A00 = new EUF(context2, r4, userSession, r6, r7, searchContext2, r9, r10, ewa2, user2, bool3, num, str7, str6, str9, str8, str5, r10.A00(), jSONObject2, z2);
        A03(A002, r10);
    }

    public static final void A02(Context context, 1P0 r6, DwR dwR, C294705mt r8) {
        C358248ab r3 = new C358248ab(context);
        r3.A0r(true);
        r3.A0s(true);
        r3.A05 = dwR.A04;
        r3.A0q(dwR.A03);
        r3.A0I((DialogInterface.OnClickListener) null, 2131954722);
        String string = context.getString(2131965818);
        0qQ.A07(string);
        r3.A0b(new FIY(context, r6, dwR, r8), string);
        String string2 = context.getString(2131954722);
        0qQ.A07(string2);
        r3.A0X(C71247OgC.A00, C358278ae.BLUE_BOLD, string2, true);
        r3.A0B(new FHW(r6, dwR));
        AnonymousClass0fN.A00(r3.A02());
    }

    public static final void A03(1OC r5, C294705mt r6) {
        1OC r2 = r5;
        if (r6.A05) {
            r6.A03.schedule(r2, r5.A04.runnableId, 3, true, false);
        } else {
            r6.A03.schedule(r5);
        }
    }

    private final void A04(FollowStatus followStatus, FollowStatus followStatus2, User user, boolean z) {
        FollowStatus followStatus3;
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A02;
        User A012 = r0.A01(userSession);
        if (followStatus2 != null) {
            int ordinal = followStatus2.ordinal();
            if (ordinal != 3) {
                if (ordinal == 4 && (((user.A0G() == (followStatus3 = FollowStatus.A06) && followStatus == FollowStatus.A04 && user.A28()) || followStatus == FollowStatus.A07 || followStatus == followStatus3) && z)) {
                    user.A0g(userSession);
                    A012.A0h(userSession);
                }
            } else if (followStatus == FollowStatus.A05 && z) {
                user.A0e(userSession);
                A012.A0f(userSession);
            }
        }
        user.A03.Eal(followStatus);
        user.A0n(followStatus2);
        if (followStatus2 != FollowStatus.A08) {
            AnonymousClass1Nd.A00(userSession).A00(new C2370836g(user, z));
        }
    }

    public final Object A06(String str, String str2, AnonymousClass4D7 r23) {
        this.A00 = str2;
        UserSession userSession = this.A02;
        String str3 = str;
        AnonymousClass4D7 r4 = r23;
        if (182.A06(0Tu.A05, userSession, 36330819119235864L)) {
            return GraphQLFollowRequestApiKt.A02(userSession, str3, C61970qY.A09(this.A01), r4);
        }
        return C320126ro.A00(this.A01, userSession, (1Xj) null, (AnonymousClass3W1) null, (SearchContext) null, (Boolean) null, (Boolean) null, str3, "ignore", A00(), (String) null, (String) null, (String) null, (String) null, (JSONObject) null).A02(r4, 414639935, 3, false);
    }

    public final Object A07(String str, AnonymousClass4D7 r22) {
        UserSession userSession = this.A02;
        String str2 = str;
        AnonymousClass4D7 r4 = r22;
        if (182.A06(0Tu.A05, userSession, 36330819119235864L)) {
            return GraphQLFollowRequestApiKt.A01(userSession, str2, C61970qY.A09(this.A01), r4);
        }
        return C320126ro.A00(this.A01, userSession, (1Xj) null, (AnonymousClass3W1) null, (SearchContext) null, (Boolean) null, (Boolean) null, str2, "approve", A00(), (String) null, (String) null, (String) null, (String) null, (JSONObject) null).A02(r4, 1712513969, 3, false);
    }

    public final void A0A(AnonymousClass07Z r12, String str, String str2, 0sP r15, 0sP r16) {
        AnonymousClass0xx A002 = AnonymousClass07a.A00(r12);
        0sP r6 = r15;
        0sP r5 = r16;
        C376999Kd r3 = new C376999Kd(this, r5, r6, str2, str, (AnonymousClass4D7) null, 3);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A002);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(android.content.Context r34, X.0xF r35, X.1P0 r36, X.1Xj r37, X.AnonymousClass3W1 r38, com.instagram.profile.intf.UserDetailEntryInfo r39, com.instagram.search.common.analytics.SearchContext r40, X.C243943aO r41, com.instagram.user.model.User r42, java.lang.Boolean r43, java.lang.Double r44, java.lang.Integer r45, java.lang.Long r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, org.json.JSONObject r55) {
        /*
            r33 = this;
            r14 = r45
            r16 = 0
            r2 = 1
            r4 = 3
            r11 = r42
            X.0qQ.A0B(r11, r2)
            r9 = r33
            com.instagram.common.session.UserSession r1 = r9.A02
            X.2f1 r0 = X.AnonymousClass2f1.A00(r1)
            com.instagram.user.model.FollowStatus r0 = r0.A0N(r11)
            int r3 = r0.ordinal()
            if (r3 == r4) goto L_0x00dd
            r0 = 4
            if (r3 == r0) goto L_0x00d7
            r0 = 5
            if (r3 != r0) goto L_0x0089
            X.EWA r10 = X.EWA.UserActionCancelRequest
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
        L_0x0027:
            java.lang.Integer r25 = X.GTO.A00(r0)
            r9.A0D(r0, r11, r2)
            r3 = r48
            if (r45 != 0) goto L_0x003c
            if (r48 == 0) goto L_0x003b
            int r0 = r3.hashCode()
            switch(r0) {
                case -1976461320: goto L_0x008a;
                case -1889499345: goto L_0x0095;
                case -1731123548: goto L_0x0098;
                case -1562467946: goto L_0x00a3;
                case -992232263: goto L_0x00ae;
                case -258680882: goto L_0x00b9;
                case -104895172: goto L_0x00bc;
                case 1538409704: goto L_0x00bf;
                case 1782099846: goto L_0x00cb;
                default: goto L_0x003b;
            }
        L_0x003b:
            r14 = 0
        L_0x003c:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            r12 = r43
            r8 = r40
            r7 = r38
            r6 = r37
            r5 = r36
            r19 = r55
            r18 = r53
            r17 = r52
            r15 = r51
            r4 = r34
            r20 = r2
            A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r24 = r44
            r21 = r41
            r19 = r39
            r26 = r46
            r29 = r49
            r32 = r54
            r30 = r50
            r16 = r35
            r27 = r47
            r17 = r1
            r18 = r6
            r20 = r8
            r22 = r10
            r23 = r11
            r28 = r3
            r31 = r15
            X.C294695ms.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.EWA r0 = X.EWA.UserActionFollow
            if (r10 != r0) goto L_0x0089
            java.lang.String r2 = r11.getId()
            java.lang.String r0 = "follow_button_tapped"
            X.AnonymousClass59S.A02(r1, r2, r0)
        L_0x0089:
            return
        L_0x008a:
            java.lang.String r0 = "search_navigate_to_user"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r14 = X.AnonymousClass05K.A0N
            goto L_0x003c
        L_0x0095:
            java.lang.String r0 = "recommended_user"
            goto L_0x00c1
        L_0x0098:
            java.lang.String r0 = "likes_list_user_row"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            goto L_0x003c
        L_0x00a3:
            java.lang.String r0 = "clips_follow_prompt"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            goto L_0x003c
        L_0x00ae:
            java.lang.String r0 = "following_list_user_row"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            goto L_0x003c
        L_0x00b9:
            java.lang.String r0 = "reel_viewer_netego_suggested_user"
            goto L_0x00c1
        L_0x00bc:
            java.lang.String r0 = "profile_user_row"
            goto L_0x00c1
        L_0x00bf:
            java.lang.String r0 = "suggested_user_card"
        L_0x00c1:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r14 = X.AnonymousClass05K.A0Y
            goto L_0x003c
        L_0x00cb:
            java.lang.String r0 = "follower_list_user_row"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            goto L_0x003c
        L_0x00d7:
            X.EWA r10 = X.EWA.UserActionUnfollow
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            goto L_0x0027
        L_0x00dd:
            X.EWA r10 = X.EWA.UserActionFollow
            java.lang.Integer r3 = r11.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r3 == r0) goto L_0x00fd
            java.lang.Integer r3 = r11.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 == r0) goto L_0x00fd
            boolean r0 = r11.A28()
            if (r0 == 0) goto L_0x00f9
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A04
            goto L_0x0027
        L_0x00f9:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            goto L_0x0027
        L_0x00fd:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294705mt.A09(android.content.Context, X.0xF, X.1P0, X.1Xj, X.3W1, com.instagram.profile.intf.UserDetailEntryInfo, com.instagram.search.common.analytics.SearchContext, X.3aO, com.instagram.user.model.User, java.lang.Boolean, java.lang.Double, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }
}
