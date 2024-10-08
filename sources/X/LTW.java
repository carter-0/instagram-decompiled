package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGUserThirdPartyDownloads;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.user.model.User;
import java.util.List;

public final class LTW {
    public static final LTW A00 = new Object();

    public static final void A00(Context context, Uri uri, 0hq r12, UserSession userSession, 1Xj r14, AnonymousClass4DU r15, AnonymousClass3W1 r16) {
        Context context2 = context;
        0qQ.A0B(context, 0);
        List A04 = r12.A0U.A04();
        0qQ.A07(A04);
        Fragment fragment = (Fragment) 00k.A0O(A04, 0);
        if (fragment instanceof AnonymousClass4D6) {
            C46395DeI.A0P(context2, uri, fragment, userSession, r14, r15, r16, (Runnable) null, AnonymousClass000.A00(4595));
        }
    }

    public static final void A03(Context context, UserSession userSession, 1Xj r6, String str, boolean z) {
        0qQ.A0B(str, 3);
        1Xj r3 = r6;
        1Xy r1 = r6.A0C;
        boolean z2 = z;
        r1.EoT(Boolean.valueOf(z));
        r3.AE7(userSession);
        String A2n = r3.A2n();
        if (A2n != null) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            C51968G9o.A1K(A0a, "clips/item/set_third_party_downloads_enabled/", A2n);
            A0a.A0H("third_party_downloads_enabled", z);
            DbX.A1M(A0a, "container_module", str);
            1OC A0M = A0a.A0M();
            A0M.A00 = new C61497KAc(5, r3, context, userSession, z2);
            1ES.A03(A0M);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A04(Context context, UserSession userSession, String str, boolean z) {
        AnonymousClass7TG.A1O(userSession, str);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        A0Q.A1J(z);
        A0Q.A0d(userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0Q(1XP.class, 1XY.class);
        A0a.A0A("clips/user/set_third_party_downloads_enabled/");
        A0a.A0H("third_party_downloads_enabled", z);
        1OC A0T = DbT.A0T(A0a, "container_module", str);
        A0T.A00 = new C61497KAc(4, A0Q, context, userSession, z);
        1ES.A03(A0T);
    }

    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r13, AnonymousClass4DU r14, AnonymousClass3W1 r15, LTW ltw, String str, String str2, boolean z) {
        int i;
        C52236GKd gKd;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0hq supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        0qQ.A07(supportFragmentManager);
        UserSession userSession2 = userSession;
        boolean z2 = z;
        C49705F2q f2q = new C49705F2q(fragmentActivity2, supportFragmentManager, userSession2, r13, r14, r15, new C63500KyB(), z2);
        if (!ltw.A0B(userSession2, r13)) {
            C59689JTv.A0F(fragmentActivity2, "server_based_download_eligibility_check_failed", 2131974097);
        } else if (2R8.A02(userSession2, r13)) {
            f2q.A00();
        } else {
            String A2n = r13.A2n();
            if (A2n != null) {
                1NY A0b = AnonymousClass7TG.A0b(userSession2);
                A0b.A0Q(K17.class, C63989LHh.class);
                C51968G9o.A1K(A0b, "clips/item/check_third_party_downloads_eligibility/", A2n);
                1OC A0M = A0b.A0M();
                C61499KAe.A00(A0M, fragmentActivity2, f2q, 19);
                1ES.A03(A0M);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (r15 != null) {
            i = r15.getPosition();
        } else {
            i = -1;
        }
        if (2R8.A02(userSession2, r13)) {
            gKd = C52236GKd.A13;
        } else {
            gKd = C52236GKd.A14;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r14, userSession2), "instagram_clips_save_to_camera_roll");
        A0e.A8M(gKd, "action");
        A0e.A8M(AnonymousClass5OC.MENU, "action_source");
        DbW.A16(A0e, r14);
        String id = r13.getId();
        if (id != null) {
            A0e.AAJ("media_compound_key", id);
            C51970G9q.A19(A0e, (long) i);
            C51965G9l.A1O(A0e, str);
            A0e.AAJ("mezql_token", r13.A0C.getMezqlToken());
            A0e.AAJ("ranking_info_token", r13.A0C.getLoggingInfoToken());
            A0e.AAJ(AnonymousClass000.A00(392), str2);
            A0e.A7p("is_audio_muted", DbT.A0l(z2));
            A0e.Cgf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final boolean A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!2R8.A06(AnonymousClass7TF.A0Q(userSession)) || DbX.A0m(userSession).C5y() != IGUserThirdPartyDownloads.A06 || 182.A06(0Tu.A05, userSession, 36317972872566485L) || !C63501KyC.A00(userSession).booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0B(UserSession userSession, 1Xj r6) {
        if (r6 == null || C263304Kd.A04(C51966G9m.A0n(r6)) || !A07(userSession, r6)) {
            return false;
        }
        if (2R8.A02(userSession, r6)) {
            return true;
        }
        0t0 A01 = AnonymousClass0eN.A01(new C58673Ivi(r6, 45));
        if (!AnonymousClass7TF.A1Y(r6.A0C.Cd9(), true) || !A09(C51966G9m.A11(r6)) || r6.A1t() != AnonymousClass3QO.DEFAULT || AnonymousClass7TE.A1a(A01.getValue()) || !C63501KyC.A00(userSession).booleanValue()) {
            return false;
        }
        return true;
    }

    public static final void A01(Context context, 0hq r13, UserSession userSession, AnonymousClass4DU r15, AnonymousClass3W1 r16, LEF lef, boolean z, boolean z2) {
        String str;
        LEF lef2 = lef;
        VideoUrlImpl A002 = C255583uN.A00(lef2.A07.CEL());
        if (A002 != null) {
            str = A002.A06;
        } else {
            str = null;
        }
        C64609Let let = new C64609Let(context, r13, userSession, r15, r16, lef2, lef2.A08, z, z2);
        1QU A003 = JTQ.A0E().A00();
        if (str != null) {
            14G.A03().A06(let, A003, AnonymousClass2hY.A09.E1h(str), userSession);
        }
    }

    public static final void A02(Context context, UserSession userSession, 1Xj r6, LEF lef) {
        1xC r3;
        C67841xE r1;
        if (182.A06(0Tu.A05, userSession, 36326459727558421L)) {
            LQT lqt = new LQT((C66536MVq) new Ls3(DbT.A05(context), r6, lef));
            r3 = 1xC.A01;
            r1 = new AnonymousClass3GT(lqt);
        } else {
            r3 = 1xC.A01;
            C310336ap A0W = DbV.A0W();
            A0W.A09 = r6.A1Q();
            A0W.A03();
            DbT.A1D(context.getResources(), A0W, 2131955160);
            r1 = new AnonymousClass3GP(A0W.A00());
        }
        r3.A00(r1);
    }

    public static final boolean A07(UserSession userSession, 1Xj r3) {
        0t0 A01 = AnonymousClass0eN.A01(new C58690Ivz(14, r3, userSession));
        if (!r3.A5G() || r3.CcK() || AnonymousClass7TE.A1a(A01.getValue())) {
            return false;
        }
        return true;
    }

    public static final boolean A08(UserSession userSession, boolean z) {
        if (!z || !182.A06(0Tu.A05, userSession, 36317972872435412L)) {
            return false;
        }
        return true;
    }

    public static final boolean A09(User user) {
        IGUserThirdPartyDownloads iGUserThirdPartyDownloads;
        if (user != null) {
            iGUserThirdPartyDownloads = user.A03.C5y();
        } else {
            iGUserThirdPartyDownloads = null;
        }
        if (iGUserThirdPartyDownloads != IGUserThirdPartyDownloads.A05 || !2R8.A06(user)) {
            return false;
        }
        return true;
    }

    public final void A0A(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r23, AnonymousClass4DU r24, AnonymousClass3W1 r25, String str, String str2, boolean z) {
        UserSession userSession2 = userSession;
        String str3 = str;
        AnonymousClass7TG.A1P(userSession2, str3);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        1Xj r4 = r23;
        AnonymousClass4DU r5 = r24;
        AnonymousClass3W1 r6 = r25;
        String str4 = str2;
        boolean z2 = z;
        if (Build.VERSION.SDK_INT >= 33 || 1DL.A07(fragmentActivity2, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            A05(fragmentActivity2, userSession2, r4, r5, r6, this, str3, str4, z2);
        } else {
            JTP.A11(fragmentActivity2, new C64735LhC(fragmentActivity2, userSession2, r4, r5, r6, str3, str4, z2), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}
