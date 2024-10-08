package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.api.schemas.FBBioLinkSocialContextType;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.FgX  reason: case insensitive filesystem */
public final class C50672FgX implements C3249370k {
    public final FragmentActivity A00;
    public final 0bY A01 = new C50186FSs(2);
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final UserDetailFragment A04;
    public final C323246xB A05;
    public final UserDetailTabController A06;
    public final Dc6 A07;
    public final String A08;
    public final String A09;
    public final C323206x7 A0A;
    public final String A0B;
    public final String A0C;

    public static final void A02(C253443qn r5, Map map) {
        IgUserBioLinkTypeEnum igUserBioLinkTypeEnum;
        String AyC;
        String str;
        String str2;
        FBBioLinkSocialContextType BxV;
        IgUserBioLinkTypeEnum igUserBioLinkTypeEnum2;
        Integer num = null;
        if (r5 != null) {
            igUserBioLinkTypeEnum = r5.BMt();
        } else {
            igUserBioLinkTypeEnum = null;
        }
        if (igUserBioLinkTypeEnum != IgUserBioLinkTypeEnum.FACEBOOK) {
            if (r5 != null) {
                igUserBioLinkTypeEnum2 = r5.BMt();
            } else {
                igUserBioLinkTypeEnum2 = null;
            }
            if (igUserBioLinkTypeEnum2 != IgUserBioLinkTypeEnum.FACEBOOK_PAGE) {
                return;
            }
        }
        C282085Bj B45 = r5.B45();
        if (B45 != null && (AyC = B45.AyC()) != null && AyC.length() > 0) {
            if (map == null) {
                map = AnonymousClass7TE.A1H();
            }
            if (r5.BMt() == IgUserBioLinkTypeEnum.FACEBOOK_PAGE) {
                str = "page";
            } else {
                str = "profile";
            }
            String A0g = 002.A0g("social_context_fb_", str, "_type");
            String A0g2 = 002.A0g("social_context_fb_", str, "_value");
            C282085Bj B452 = r5.B45();
            if (B452 == null || (BxV = B452.BxV()) == null || (str2 = BxV.A00) == null) {
                str2 = "";
            }
            map.put(A0g, str2);
            C282085Bj B453 = r5.B45();
            if (B453 != null) {
                num = Integer.valueOf(B453.BOo());
            }
            map.put(A0g2, String.valueOf(num));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.3qn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.AnonymousClass0iw r13, X.1Xj r14, X.C48096EVo r15, java.util.Map r16, boolean r17) {
        /*
            r12 = this;
            r7 = 0
            com.instagram.common.session.UserSession r8 = r12.A02
            X.Dc6 r5 = r12.A07
            java.lang.String r1 = r5.A03()
            X.6x7 r6 = r12.A0A
            r4 = 1
            android.os.Bundle r3 = X.DbV.A0B(r1, r4)
            X.E5V r2 = new X.E5V
            r2.<init>()
            X.DbU.A1D(r3, r8)
            java.lang.String r0 = "ProfileTabbedExplorerFragment.USER_ID"
            r3.putString(r0, r1)
            java.lang.String r1 = r15.name()
            r0 = 999(0x3e7, float:1.4E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putString(r0, r1)
            java.lang.String r0 = "ProfileTabbedExplorerFragment.ONLY_SHOW_SELECTED_TAB"
            r1 = r17
            r3.putBoolean(r0, r1)
            r2.setArguments(r3)
            r2.A02 = r6
            r2.A00 = r14
            X.7Pr r1 = X.DbX.A0e(r8, r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.A03 = r0
            r1.A1O = r4
            X.7Pu r1 = r1.A00()
            androidx.fragment.app.FragmentActivity r0 = r12.A00
            r1.A02(r0, r2)
            r6 = 0
            r0 = r16
            if (r16 == 0) goto L_0x00b9
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r0)
        L_0x0055:
            com.instagram.user.model.User r3 = r5.A03
            if (r3 == 0) goto L_0x00a6
            X.4Cl r0 = r3.A03
            java.util.List r0 = r0.Afp()
            if (r0 == 0) goto L_0x00b7
            java.util.Iterator r2 = r0.iterator()
        L_0x0065:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r4 = r2.next()
            r0 = r4
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            if (r1 != r0) goto L_0x0065
        L_0x007a:
            X.3qn r4 = (X.C253443qn) r4
        L_0x007c:
            X.4Cl r0 = r3.A03
            java.util.List r0 = r0.Afp()
            if (r0 == 0) goto L_0x00a0
            java.util.Iterator r3 = r0.iterator()
        L_0x0088:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            if (r1 != r0) goto L_0x0088
            r6 = r2
        L_0x009e:
            X.3qn r6 = (X.C253443qn) r6
        L_0x00a0:
            A02(r4, r11)
            A02(r6, r11)
        L_0x00a6:
            X.736 r6 = X.AnonymousClass736.A00
            java.lang.String r10 = r5.A03()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            r7 = r13
            r6.A0D(r7, r8, r9, r10, r11)
            return
        L_0x00b5:
            r4 = r6
            goto L_0x007a
        L_0x00b7:
            r4 = r6
            goto L_0x007c
        L_0x00b9:
            r11 = r6
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50672FgX.A08(X.0iw, X.1Xj, X.EVo, java.util.Map, boolean):void");
    }

    public C50672FgX(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r5, C323206x7 r6, UserDetailFragment userDetailFragment, C323246xB r8, UserDetailTabController userDetailTabController, Dc6 dc6, String str, String str2, String str3, String str4) {
        DbW.A1P(r8, 10, str4);
        this.A02 = userSession;
        this.A04 = userDetailFragment;
        this.A06 = userDetailTabController;
        this.A00 = fragmentActivity;
        this.A08 = str;
        this.A09 = str2;
        this.A0C = str3;
        this.A0A = r6;
        this.A03 = r5;
        this.A05 = r8;
        this.A07 = dc6;
        this.A0B = str4;
    }

    public static final void A01(Context context, C50672FgX fgX, User user, String str) {
        Boolean bool;
        UserSession userSession = fgX.A02;
        String str2 = fgX.A0B;
        String id = user.getId();
        String A062 = 1aC.A06(user.B6o());
        Dc6 dc6 = fgX.A07;
        User user2 = dc6.A03;
        if (user2 != null) {
            bool = Boolean.valueOf(user2.A1g());
        } else {
            bool = null;
        }
        C49749F4o.A01(userSession, bool, str2, "get_directions", "business_profile", id, A062);
        Integer num = AnonymousClass05K.A0N;
        UserDetailFragment userDetailFragment = fgX.A04;
        String str3 = fgX.A08;
        String str4 = fgX.A09;
        C48753Ejc.A00(userSession, userDetailFragment, user, num, str3, str4);
        C319976rX.A08(userDetailFragment, userSession, C319976rX.A00(userSession, dc6.A03), "tap_directions", dc6.A03(), str3, str4, str);
        FFS.A03(context, user.A03.AZg(), user.A03.AnQ(), user.A03.CHc());
    }

    public static void A03(UserSession userSession, UserDetailFragment userDetailFragment, Dc6 dc6, Object obj) {
        AnonymousClass736 r1 = AnonymousClass736.A00;
        UserDetailFragment userDetailFragment2 = userDetailFragment;
        if ("user_profile_link_bottom_sheet".equals(obj)) {
            r1.A0C(userDetailFragment.getContext(), userDetailFragment2, userSession, "external", dc6.A03(), (Map) null);
        } else if ("user_profile_header".equals(obj)) {
            r1.A0B(userDetailFragment.getContext(), userDetailFragment2, userSession, "external", dc6.A03(), (Map) null);
        }
    }

    private final void A04(1Xj r5, User user, String str) {
        UserDetailFragment userDetailFragment = this.A04;
        C254523sc r2 = new C254523sc(userDetailFragment, "bio_link_opened");
        r2.A7N = str;
        r2.A5v = this.A08;
        UserSession userSession = this.A02;
        r2.A4K = userSession.A06;
        r2.A7D = user.getId();
        if (r5 != null && r5.CcK() && !C231122qu.A0S(userSession, r5)) {
            r2.A5u = r5.getId();
            r2.A7J = C231122qu.A0F(userSession, r5);
        }
        String A0k = DbS.A0k();
        if (A0k != null) {
            r2.A65 = A0k;
        }
        C271764jY.A00(userSession, r2, userDetailFragment, AnonymousClass05K.A00);
    }

    public static final void A05(C50672FgX fgX, String str, String str2) {
        UserSession userSession = fgX.A02;
        UserDetailFragment userDetailFragment = fgX.A04;
        Dc6 dc6 = fgX.A07;
        C319976rX.A08(userDetailFragment, userSession, C319976rX.A00(userSession, dc6.A03), C273654mx.A00(3402), dc6.A03(), fgX.A08, fgX.A09, str2);
        FragmentActivity fragmentActivity = fgX.A00;
        Venue venue = new Venue();
        venue.A06(str);
        C16923VBa.A00(fragmentActivity, (C267664bz) null, (AnonymousClass0iw) null, userSession, venue, (String) null, "", (double[]) null, false);
    }

    public final void A06() {
        UserSession userSession = this.A02;
        UserDetailFragment userDetailFragment = this.A04;
        Dc6 dc6 = this.A07;
        C319976rX.A08(userDetailFragment, userSession, C319976rX.A00(userSession, dc6.A03), "tap_profile_bio_more", dc6.A03(), this.A08, this.A09, "user_profile_header");
        C322486vu r1 = this.A06.A0P;
        if (!r1.A0N) {
            r1.A0N = true;
            r1.A00();
        }
    }

    public final void A07(Context context, User user, String str) {
        String BHm = user.A03.BHm();
        if (BHm == null || BHm.length() == 0) {
            A01(context, this, user, str);
            return;
        }
        new C49693F2d(this.A00, this.A04, this.A02).A00(new C50680Fgf(context, this, user, str));
    }

    public final void A09(AnonymousClass0iw r5, User user, String str) {
        String A042 = 182.A04(0Tu.A05, this.A02, 36883070310089193L);
        if (!(!00l.A0W(A042))) {
            A042 = "xav_ig_profile_page";
        }
        A0A(r5, user, str, A042);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.3qn} */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.AnonymousClass0iw r22, com.instagram.user.model.User r23, java.lang.String r24, java.lang.String r25) {
        /*
            r21 = this;
            java.lang.String r3 = X.C10065Rm2.A01
            java.lang.String r2 = "?ref="
            r6 = r25
            java.lang.String r9 = X.002.A0g(r3, r2, r6)
            X.0rm r8 = new X.0rm
            r8.<init>()
            java.lang.String r0 = "https://facebook.com/?ref="
            java.lang.String r0 = X.002.A0R(r0, r6)
            r8.A00 = r0
            r5 = r23
            X.4Cl r0 = r5.A03
            X.3rB r0 = r0.BMx()
            if (r0 == 0) goto L_0x00e6
            X.4Cl r0 = r5.A03
            X.3rB r0 = r0.BMx()
            if (r0 == 0) goto L_0x00e6
            X.5Bm r0 = r0.BMy()
            if (r0 == 0) goto L_0x00e6
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L_0x00e6
            java.lang.String r0 = "page/"
            java.lang.String r9 = X.002.A11(r3, r0, r1, r2, r6)
            java.lang.String r0 = "https://facebook.com/"
            java.lang.String r0 = X.002.A0u(r0, r1, r2, r6)
            r8.A00 = r0
            r13 = 1
        L_0x0044:
            r4 = r21
            androidx.fragment.app.FragmentActivity r7 = r4.A00
            com.instagram.common.session.UserSession r3 = r4.A02
            boolean r0 = X.AnonymousClass5FF.A00(r7, r3, r9)
            if (r0 == 0) goto L_0x00bb
            X.FH7.A03(r7, r9)
        L_0x0053:
            r12 = 0
        L_0x0054:
            X.736 r14 = X.AnonymousClass736.A00
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = "banner_bottom_sheet"
            r8 = r24
            boolean r11 = r0.equals(r8)
            java.lang.String r7 = "banner"
            java.lang.String r10 = "1"
            if (r11 != 0) goto L_0x006e
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x0073
        L_0x006e:
            java.lang.String r0 = "is_from_banners"
            r1.put(r0, r10)
        L_0x0073:
            java.lang.String r9 = "0"
            r2 = r9
            if (r13 == 0) goto L_0x0079
            r2 = r10
        L_0x0079:
            java.lang.String r0 = "target_has_hardlink_info"
            r1.put(r0, r2)
            java.lang.String r0 = "ref_id"
            r1.put(r0, r6)
            if (r12 != 0) goto L_0x0086
            r10 = r9
        L_0x0086:
            java.lang.String r0 = "login_bypass_attempted"
            r1.put(r0, r10)
            java.lang.String r0 = "user_profile_link_bottom_sheet"
            boolean r0 = r0.equals(r8)
            r16 = r22
            if (r0 != 0) goto L_0x00e9
            if (r11 != 0) goto L_0x00e9
            java.lang.String r0 = "user_profile_header"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x00ba
        L_0x00a5:
            com.instagram.profile.fragment.UserDetailFragment r0 = r4.A04
            android.content.Context r15 = r0.getContext()
            X.Dc6 r0 = r4.A07
            java.lang.String r19 = r0.A03()
            java.lang.String r18 = "facebook_page"
            r20 = r1
            r17 = r3
            r14.A0B(r15, r16, r17, r18, r19, r20)
        L_0x00ba:
            return
        L_0x00bb:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325420345537484(0x810dc7000333cc, double:3.0356803250205754E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1 = 25
            X.MJ4 r0 = new X.MJ4
            r0.<init>(r1, r8, r4)
            X.C48917EmH.A00(r7, r2, r9, r0)
            r12 = 1
            goto L_0x0054
        L_0x00d7:
            com.instagram.profile.fragment.UserDetailFragment r0 = r4.A04
            android.content.Context r1 = r0.requireContext()
            java.lang.Object r0 = r8.A00
            java.lang.String r0 = (java.lang.String) r0
            X.FH7.A03(r1, r0)
            goto L_0x0053
        L_0x00e6:
            r13 = 0
            goto L_0x0044
        L_0x00e9:
            X.4Cl r0 = r5.A03
            java.util.List r0 = r0.Afp()
            r7 = 0
            if (r0 == 0) goto L_0x010e
            java.util.Iterator r6 = r0.iterator()
        L_0x00f6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r2 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            if (r2 != r0) goto L_0x00f6
            r7 = r5
        L_0x010c:
            X.3qn r7 = (X.C253443qn) r7
        L_0x010e:
            A02(r7, r1)
            com.instagram.profile.fragment.UserDetailFragment r0 = r4.A04
            android.content.Context r15 = r0.getContext()
            X.Dc6 r0 = r4.A07
            java.lang.String r19 = r0.A03()
            java.lang.String r18 = "facebook_page"
            r20 = r1
            r17 = r3
            r14.A0C(r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50672FgX.A0A(X.0iw, com.instagram.user.model.User, java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.3qn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass0iw r24, java.lang.String r25, java.lang.String r26) {
        /*
            r23 = this;
            r4 = r23
            X.Dc6 r3 = r4.A07
            com.instagram.user.model.User r5 = r3.A03
            if (r5 == 0) goto L_0x013f
            X.4Cl r0 = r5.A03
            X.3rB r0 = r0.BMx()
            r2 = r24
            r6 = r26
            if (r0 == 0) goto L_0x00fa
            com.instagram.common.session.UserSession r10 = r4.A02
            X.3rB r0 = X.FRP.A00(r10, r5)
            if (r0 == 0) goto L_0x00ec
            X.4EU r0 = r0.BMz()
            if (r0 == 0) goto L_0x00ec
            java.lang.String r7 = r0.BhK()
            if (r7 == 0) goto L_0x00ec
            r15 = 0
            com.instagram.profile.fragment.UserDetailFragment r9 = r4.A04
            android.content.Context r0 = r9.requireContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r0 = X.FFi.A00(r0)
            if (r0 != 0) goto L_0x00ef
            X.0Tu r8 = X.0Tu.A05
            r0 = 36325420345537484(0x810dc7000333cc, double:3.0356803250205754E-306)
            boolean r0 = X.182.A06(r8, r10, r0)
            if (r0 == 0) goto L_0x00ef
            androidx.fragment.app.FragmentActivity r9 = r4.A00
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            java.lang.String r1 = X.FEC.A00
            java.lang.String r0 = "https://www.facebook.com/profile.php?id="
            java.lang.String r1 = r7.replace(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = ""
        L_0x005a:
            java.lang.String r1 = X.002.A0R(r1, r0)
            r21 = 5
            X.MJD r0 = new X.MJD
            r16 = r0
            r17 = r2
            r18 = r4
            r19 = r7
            r20 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            X.C48917EmH.A00(r9, r8, r1, r0)
            r14 = 1
            r13 = 1
        L_0x0074:
            X.736 r16 = X.AnonymousClass736.A00
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = "banner_bottom_sheet"
            r8 = r25
            boolean r12 = r0.equals(r8)
            java.lang.String r7 = "banner"
            java.lang.String r10 = "1"
            if (r12 != 0) goto L_0x008e
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x0093
        L_0x008e:
            java.lang.String r0 = "is_from_banners"
            r1.put(r0, r10)
        L_0x0093:
            java.lang.String r11 = "0"
            r9 = r11
            if (r14 == 0) goto L_0x0099
            r9 = r10
        L_0x0099:
            java.lang.String r0 = "target_has_hardlink_info"
            r1.put(r0, r9)
            java.lang.String r0 = "ref_id"
            r1.put(r0, r6)
            r6 = r11
            if (r13 == 0) goto L_0x00a7
            r6 = r10
        L_0x00a7:
            java.lang.String r0 = "login_bypass_attempted"
            r1.put(r0, r6)
            if (r15 != 0) goto L_0x00af
            r10 = r11
        L_0x00af:
            java.lang.String r0 = "is_fb_profile_url_null"
            r1.put(r0, r10)
            java.lang.String r0 = "user_profile_link_bottom_sheet"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x00ff
            if (r12 != 0) goto L_0x00ff
            java.lang.String r0 = "user_profile_header"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x00e3
        L_0x00cc:
            com.instagram.profile.fragment.UserDetailFragment r0 = r4.A04
            android.content.Context r17 = r0.getContext()
            com.instagram.common.session.UserSession r0 = r4.A02
            java.lang.String r21 = r3.A03()
            java.lang.String r20 = "facebook"
            r22 = r1
            r18 = r2
            r19 = r0
            r16.A0B(r17, r18, r19, r20, r21, r22)
        L_0x00e3:
            return
        L_0x00e4:
            java.lang.String r0 = "?ref="
            java.lang.String r0 = X.002.A0R(r0, r6)
            goto L_0x005a
        L_0x00ec:
            r15 = 1
            r14 = 0
            goto L_0x00f7
        L_0x00ef:
            android.content.Context r0 = r9.requireContext()
            X.FEC.A01(r0, r2, r10, r7, r6)
            r14 = 1
        L_0x00f7:
            r13 = 0
            goto L_0x0074
        L_0x00fa:
            r14 = 0
            r13 = 0
            r15 = 1
            goto L_0x0074
        L_0x00ff:
            X.4Cl r0 = r5.A03
            java.util.List r0 = r0.Afp()
            r8 = 0
            if (r0 == 0) goto L_0x0124
            java.util.Iterator r7 = r0.iterator()
        L_0x010c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r6 = r7.next()
            r0 = r6
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r5 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            if (r5 != r0) goto L_0x010c
            r8 = r6
        L_0x0122:
            X.3qn r8 = (X.C253443qn) r8
        L_0x0124:
            A02(r8, r1)
            com.instagram.profile.fragment.UserDetailFragment r0 = r4.A04
            android.content.Context r17 = r0.getContext()
            com.instagram.common.session.UserSession r0 = r4.A02
            java.lang.String r21 = r3.A03()
            java.lang.String r20 = "facebook"
            r22 = r1
            r18 = r2
            r19 = r0
            r16.A0C(r17, r18, r19, r20, r21, r22)
            return
        L_0x013f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50672FgX.A0B(X.0iw, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.1Xj r21, com.instagram.user.model.User r22, java.lang.String r23) {
        /*
            r20 = this;
            java.lang.String r5 = "Unable to parse URI from: "
            r19 = 0
            r4 = r20
            com.instagram.common.session.UserSession r11 = r4.A02
            com.instagram.profile.fragment.UserDetailFragment r10 = r4.A04
            X.Dc6 r2 = r4.A07
            com.instagram.user.model.User r0 = r2.A03
            X.6rY r12 = X.C319976rX.A00(r11, r0)
            java.lang.String r14 = r2.A03()
            java.lang.String r15 = r4.A08
            java.lang.String r1 = r4.A09
            java.lang.String r0 = r4.A0C
            java.lang.String r13 = "tap_website"
            r3 = r23
            r17 = r0
            r18 = r3
            r16 = r1
            X.C319976rX.A09(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r6 = r22
            X.4Cl r0 = r6.A03
            java.lang.String r8 = r0.getExternalUrl()
            r7 = 0
            if (r8 == 0) goto L_0x004b
            X.0bY r0 = r4.A01     // Catch:{ IllegalArgumentException | SecurityException -> 0x003b }
            android.net.Uri r7 = X.0cp.A01(r0, r8)     // Catch:{ IllegalArgumentException | SecurityException -> 0x003b }
            goto L_0x004b
        L_0x003b:
            java.lang.Class<X.FgX> r0 = X.C50672FgX.class
            java.lang.String r1 = r0.getName()
            X.0qQ.A07(r1)
            java.lang.String r0 = X.002.A0R(r5, r8)
            X.0wb.A03(r1, r0)
        L_0x004b:
            boolean r0 = X.SS2.A00(r7)
            if (r0 == 0) goto L_0x0081
            androidx.fragment.app.FragmentActivity r1 = r4.A00
            X.4Cl r0 = r6.A03
            java.lang.String r0 = r0.getExternalUrl()
            boolean r0 = X.AnonymousClass5FF.A00(r1, r11, r0)
            if (r0 == 0) goto L_0x0081
            X.4Cl r0 = r6.A03
            java.lang.String r0 = r0.getExternalUrl()
            if (r0 == 0) goto L_0x006a
            X.FH7.A03(r1, r0)
        L_0x006a:
            X.4Cl r0 = r6.A03
            java.lang.String r0 = r0.B3B()
            if (r0 != 0) goto L_0x0078
            X.4Cl r0 = r6.A03
            java.lang.String r0 = r0.getExternalUrl()
        L_0x0078:
            r1 = r21
            r4.A04(r1, r6, r0)
            A03(r11, r10, r2, r3)
            return
        L_0x0081:
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.BYO()
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00a5
            android.content.Context r0 = r10.getContext()
            if (r0 == 0) goto L_0x00a5
            X.4Cl r0 = r6.A03
            java.lang.String r1 = r0.getExternalUrl()
            if (r1 == 0) goto L_0x006a
            android.content.Context r0 = r10.requireContext()
            X.FH7.A03(r0, r1)
            goto L_0x006a
        L_0x00a5:
            r1 = 0
            java.lang.String r9 = "android.intent.action.VIEW"
            X.4Cl r0 = r6.A03     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            java.lang.String r7 = r0.getExternalUrl()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            if (r7 == 0) goto L_0x00cc
            X.0bY r0 = r4.A01     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            r8 = 1
            android.net.Uri r0 = X.0cp.A01(r0, r7)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            r7.<init>(r9, r0)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            r0 = 3
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            android.content.Intent r7 = r7.putExtra(r0, r8)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.Intent r1 = r7.setFlags(r0)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            goto L_0x00f3
        L_0x00cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
            throw r0     // Catch:{ IllegalArgumentException | NullPointerException -> 0x00dd, IllegalStateException -> 0x00d1 }
        L_0x00d1:
            java.lang.Class<X.FgX> r0 = X.C50672FgX.class
            java.lang.String r7 = r0.getName()
            X.0qQ.A07(r7)
            java.lang.String r0 = "user.getExternalUrl is null"
            goto L_0x00f0
        L_0x00dd:
            java.lang.Class<X.FgX> r0 = X.C50672FgX.class
            java.lang.String r7 = r0.getName()
            X.0qQ.A07(r7)
            X.4Cl r0 = r6.A03
            java.lang.String r0 = r0.getExternalUrl()
            java.lang.String r0 = X.002.A0R(r5, r0)
        L_0x00f0:
            X.0wb.A03(r7, r0)
        L_0x00f3:
            android.content.Context r0 = r10.getContext()
            if (r1 == 0) goto L_0x0111
            if (r0 == 0) goto L_0x0111
            int r0 = X.0oI.A00(r0, r1)
            if (r0 != 0) goto L_0x0111
            android.content.Context r0 = r10.requireContext()
            java.lang.String r0 = r0.getPackageName()
            r1.setPackage(r0)
            X.0kR.A0G(r1, r10)
            goto L_0x006a
        L_0x0111:
            androidx.fragment.app.FragmentActivity r5 = r4.A00
            X.4Cl r0 = r6.A03
            java.lang.String r18 = r0.B3B()
            if (r18 != 0) goto L_0x0121
            X.4Cl r0 = r6.A03
            java.lang.String r18 = r0.getExternalUrl()
        L_0x0121:
            X.2EG r17 = X.2EG.A31
            X.SUL r1 = new X.SUL
            r14 = r1
            r15 = r5
            r16 = r11
            r14.<init>(r15, r16, r17, r18, r19)
            java.lang.String r0 = r6.getId()
            r1.A0E(r0)
            java.lang.String r0 = r10.getModuleName()
            r1.A0S = r0
            r1.A0A()
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50672FgX.A0C(X.1Xj, com.instagram.user.model.User, java.lang.String):void");
    }

    public final void A0D(1Xj r24, User user, String str, String str2, String str3, boolean z) {
        String str4 = str3;
        String str5 = str2;
        AnonymousClass7TF.A1D(str5, 3, str4);
        UserSession userSession = this.A02;
        UserDetailFragment userDetailFragment = this.A04;
        Dc6 dc6 = this.A07;
        C319986rY A002 = C319976rX.A00(userSession, dc6.A03);
        String A032 = dc6.A03();
        String str6 = this.A08;
        String str7 = str;
        C319976rX.A09(userDetailFragment, userSession, A002, "tap_website", A032, str6, this.A09, this.A0C, str7);
        Uri uri = null;
        try {
            uri = 0cp.A01(this.A01, str5);
        } catch (IllegalArgumentException | SecurityException unused) {
            String name = C50672FgX.class.getName();
            0qQ.A07(name);
            0wb.A03(name, 002.A0R("Unable to parse URI from: ", str5));
        }
        User user2 = user;
        if (SS2.A00(uri)) {
            FragmentActivity fragmentActivity = this.A00;
            if (AnonymousClass5FF.A00(fragmentActivity, userSession, str5)) {
                FH7.A03(fragmentActivity, str5);
                A04(r24, user2, str5);
                A03(userSession, userDetailFragment, dc6, str7);
            }
        }
        if ((SS2.A01(uri) || C46427Deo.A01(uri)) && 182.A06(0Tu.A05, userSession, 36318080246814566L)) {
            FH7.A03(this.A00, A00(str5));
            A04(r24, user2, str5);
            A03(userSession, userDetailFragment, dc6, str7);
        }
        if (SS2.A01(uri) || C46427Deo.A01(uri)) {
            str4 = A00(str4);
        }
        if (z || userDetailFragment.getContext() == null) {
            Intent intent = null;
            try {
                intent = new Intent("android.intent.action.VIEW", 0cp.A01(this.A01, str4)).putExtra(C66579MXk.A00(3), true).setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
            } catch (IllegalArgumentException | NullPointerException unused2) {
                String name2 = C50672FgX.class.getName();
                0qQ.A07(name2);
                0wb.A03(name2, 002.A0R("Unable to parse URI from: ", user2.A03.getExternalUrl()));
            }
            Context context = userDetailFragment.getContext();
            if (intent == null || context == null || 0oI.A00(context, intent) != 0) {
                17h.A00(userSession).A01(user2, true, false);
                FragmentActivity fragmentActivity2 = this.A00;
                2EG r18 = 2EG.A31;
                String moduleName = userDetailFragment.getModuleName();
                String id = user2.getId();
                0qQ.A0B(str4, 2);
                FH7.A09(fragmentActivity2, userSession, r18, str4, moduleName, str6, id);
            } else {
                intent.setPackage(userDetailFragment.requireContext().getPackageName());
                0kR.A0G(intent, userDetailFragment);
            }
            A04(r24, user2, str5);
            A03(userSession, userDetailFragment, dc6, str7);
        }
        FH7.A03(userDetailFragment.requireContext(), str4);
        A04(r24, user2, str5);
        A03(userSession, userDetailFragment, dc6, str7);
    }

    public final void A0E(User user, boolean z) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BitSet A0w = DbS.A0w(1);
        A1H.put("entrypoint", "profile_badge");
        A0w.set(0);
        A1H.put("from_profile_igid", user.A03.getPkId());
        if (A0w.nextClearBit(0) >= 1) {
            C11844ShW shW = new C11844ShW("com.bloks.www.ig.creator_connections.BloksIGOpenToCollabSurfaceScreenQuery", (String) null, (String) null, 0Yt.A0B(A1H), 0Yt.A0E(), 719983200, 60, true);
            WF5 wf5 = new WF5((C17668Vbz) null, (C277014uI) null, (Boolean) null, (Integer) null);
            C307506Qj A002 = C48721Ej6.A00(this.A02, false);
            if (z) {
                0qQ.A0B(A002, 2);
                shW.E3a(wf5, A002, (JPG) null, true);
                return;
            }
            Context requireContext = this.A04.requireContext();
            0qQ.A0B(A002, 1);
            shW.E0s(requireContext, wf5, A002);
            return;
        }
        throw DbT.A0n();
    }

    public final void A0F(String str, AnonymousClass0iw r7) {
        User user = this.A07.A03;
        if (user == null) {
            throw AnonymousClass7TE.A0y();
        } else if (user.A03.BMx() != null) {
            UserSession userSession = this.A02;
            0Tu r3 = 0Tu.A05;
            String A042 = 182.A04(r3, userSession, 36876967160643707L);
            String A043 = 182.A04(r3, userSession, 36883070310023656L);
            if (!00l.A0W(A043)) {
                A042 = A043;
            }
            A0B(r7, str, A042);
        }
    }

    public final void D1Q(C2609247o r10, AnonymousClass0iw r11, String str) {
        String valueOf;
        int i;
        FanClubInfoDict B3v;
        String fanClubId;
        0qQ.A0B(r10, 0);
        Integer C6b = r10.C6b();
        if (C6b == null || !AnonymousClass48O.A02(C6b.intValue())) {
            Integer C6b2 = r10.C6b();
            String str2 = null;
            if (C6b2 != null && C6b2.intValue() == 29) {
                User user = this.A07.A03;
                if (user != null) {
                    str2 = user.getId();
                }
                C2609047m AsV = r10.AsV();
                if (AsV != null) {
                    i = AsV.AdN();
                } else {
                    i = 1;
                }
                1as.A04.A03(this.A00, r11, this.A02, r10.C6E(), r10.BIn(), str2, "user_profile_header", i);
            } else if (r10.BIn() == null) {
                0wb.A03("UserDetailDelegate", "Invite link was not present on channel preview object.");
            } else {
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (r10.C6b() == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(r10.C6b());
                }
                User user2 = this.A07.A03;
                if (user2 != null) {
                    str2 = user2.getId();
                }
                DbU.A1W("s", "user_profile_header", A1C);
                DbU.A1W("st", valueOf, A1C);
                DbU.A1W("cid", str2, A1C);
                String BIn = r10.BIn();
                if (BIn != null) {
                    FH7.A0B(this.A00, this.A02, OXO.A01(BIn, A1C), "user_profile_header");
                }
            }
        } else {
            User user3 = this.A07.A03;
            if (user3 == null || (B3v = user3.A03.B3v()) == null || (fanClubId = B3v.getFanClubId()) == null) {
                FGM.A01(this.A00);
                return;
            }
            C331127Pr A0W = DbS.A0W(this.A02);
            C331157Pu A002 = A0W.A00();
            NKN A022 = C71045OaN.A02(C69318NjJ.PROFILE, new Fb2(1, this, A002, A0W), r10.C6E(), fanClubId, (String) null);
            AnonymousClass37E r0 = AnonymousClass37D.A00;
            FragmentActivity fragmentActivity = this.A00;
            AnonymousClass37D A012 = r0.A01(fragmentActivity);
            if (A012 != null) {
                AnonymousClass37F r2 = (AnonymousClass37F) A012;
                if (r2.A0g) {
                    r2.A0H = new FmM(4, A002, this, A022);
                    A012.A0B();
                    return;
                }
            }
            A002.A02(fragmentActivity, A022);
        }
    }

    private final String A00(String str) {
        Uri uri = null;
        if (!AnonymousClass7TF.A1Q(str.length())) {
            try {
                uri = 0cp.A03(str);
            } catch (IllegalArgumentException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        if (uri == null) {
            return str;
        }
        String A042 = 182.A04(0Tu.A06, this.A02, 36881030200951151L);
        if (A042.length() > 0) {
            uri = DbV.A08(uri.buildUpon(), "ref", A042);
        }
        return DbT.A10(uri);
    }
}
