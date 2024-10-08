package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.su.model.MiddleStateCardUser;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.71E  reason: invalid class name */
public final class AnonymousClass71E implements AnonymousClass71F {
    public final UserSession A00;
    public final UserDetailFragment A01;
    public final Dc6 A02;
    public final String A03;
    public final String A04;
    public final FragmentActivity A05;
    public final AnonymousClass4DU A06;
    public final C323246xB A07;
    public final UserDetailTabController A08;

    public AnonymousClass71E(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass4DU r4, UserDetailFragment userDetailFragment, C323246xB r6, UserDetailTabController userDetailTabController, Dc6 dc6, String str, String str2) {
        0qQ.A0B(r6, 4);
        this.A08 = userDetailTabController;
        this.A01 = userDetailFragment;
        this.A00 = userSession;
        this.A07 = r6;
        this.A05 = fragmentActivity;
        this.A06 = r4;
        this.A02 = dc6;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void DGM(User user, int i) {
        String str;
        0qQ.A0B(user, 0);
        FollowStatus A0G = user.A0G();
        if (A0G == FollowStatus.A05) {
            str = "unfollow";
        } else {
            str = "follow";
        }
        UserSession userSession = this.A00;
        UserDetailFragment userDetailFragment = this.A01;
        C319986rY A012 = C319976rX.A01(A0G);
        Dc6 dc6 = this.A02;
        String A032 = dc6.A03();
        String str2 = this.A03;
        String str3 = this.A04;
        UserDetailLaunchConfig userDetailLaunchConfig = dc6.A0B;
        C319976rX.A0A(userDetailFragment, userSession, A012, str, A032, str2, str3, userDetailLaunchConfig.A0D, userDetailLaunchConfig.A0E, "suggested_users_unit");
    }

    public final void DRX(User user) {
    }

    public final void Dkl(String str) {
        Fragment CrG;
        C323246xB r1;
        String str2;
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment.A15()) {
            UserSession userSession = this.A00;
            0Tu r2 = 0Tu.A06;
            if (182.A06(r2, userSession, 36312363645273147L) || 182.A06(r2, userSession, 36312363645338684L)) {
                if (!182.A06(r2, userSession, 36312363645076536L) || 182.A06(0Tu.A05, userSession, 36325312971158371L)) {
                    F79.A00(userDetailFragment, userSession, "profile", "discover_people_self_profile_entry", ((Boolean) this.A07.A04.getValue()).booleanValue());
                    return;
                } else {
                    F79.A01(userDetailFragment.getActivity(), userSession, "self_profile", ((Boolean) this.A07.A04.getValue()).booleanValue());
                    return;
                }
            }
        }
        User user = this.A08.A0P.A0J;
        if (user != null) {
            UserSession userSession2 = this.A00;
            String str3 = str;
            if (C324376zB.A02(userSession2, user)) {
                CrG = C46339Dch.A00().A00.CrR(userSession2, user, C46451DfE.A00(C46443Df5.SIMILAR, str3, (String) null, false), C324376zB.A00(user), A01(user), false);
                r1 = this.A07;
                str2 = "unified_follow_list";
            } else {
                CrG = C46339Dch.A00().A00.CrG(userSession2, str3, (String) null, C324376zB.A00(user), A01(user), false);
                r1 = this.A07;
                str2 = "similar_accounts";
            }
            r1.A03(CrG, str2, true);
            r1.A00();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DwV(User user, int i) {
        0qQ.A0B(user, 0);
        UserSession userSession = this.A00;
        C319976rX.A08(this.A01, userSession, A00(), "tap_suggested_user_profile", this.A02.A03(), this.A03, this.A04, "suggested_users_unit");
        Fragment A022 = C46447Df9.A03().A01.A02(userSession, C46548Dgp.A01(userSession, user.getId(), "profile_user_row", this.A06.getModuleName()).A04());
        C323246xB r2 = this.A07;
        r2.A03(A022, "profile", true);
        r2.A05("suggested_users");
        r2.A00();
    }

    public final void DwW(View view, User user, int i) {
        String str;
        String str2;
        User user2;
        boolean z;
        User user3 = user;
        0qQ.A0B(user3, 0);
        UserSession userSession = this.A00;
        UserDetailFragment userDetailFragment = this.A01;
        C319976rX.A08(userDetailFragment, userSession, A00(), "tap_suggested_user_profile", this.A02.A03(), this.A03, this.A04, "suggested_users_unit");
        ArrayList arrayList = new ArrayList();
        for (Object next : userDetailFragment.A30.A00) {
            String str3 = "";
            if (next instanceof User) {
                user2 = (User) next;
                str = user2.A0P();
                str2 = user2.A03.BxN();
                z = false;
            } else if (next instanceof AnonymousClass3UL) {
                AnonymousClass3UL r7 = (AnonymousClass3UL) next;
                User user4 = r7.A03;
                str = r7.A04;
                str3 = r7.A08;
                str2 = r7.A05;
                user2 = user4;
                z = true;
                if (user4 == null) {
                }
            }
            String A032 = userDetailFragment.A10.A03();
            String id = user2.getId();
            String username = user2.getUsername();
            String fullName = user2.getFullName();
            if (A032.equals("INVALID_USER_ID")) {
                A032 = null;
            }
            arrayList.add(new MiddleStateCardUser(id, username, fullName, str, str3, str2, (String) null, (String) null, (String) null, A032, z));
        }
        Fragment A022 = C46447Df9.A03().A01.A02(userSession, C46548Dgp.A01(userSession, user3.getId(), "profile_user_row", this.A06.getModuleName()).A04());
        C323246xB r2 = this.A07;
        r2.A03(A022, "profile", true);
        r2.A05("suggested_users");
        r2.A00();
    }

    private final C319986rY A00() {
        User user = this.A08.A0P.A0J;
        if (user != null) {
            UserSession userSession = this.A00;
            if (0qQ.A0K(userSession.A06, user.getId())) {
                return C319986rY.SELF;
            }
            if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A05) {
                return C319986rY.FOLLOWING;
            }
        }
        return C319986rY.NOT_FOLLOWING;
    }

    public static final HashMap A01(User user) {
        HashMap hashMap = new HashMap();
        List<User> Ama = user.A03.Ama();
        if (Ama != null) {
            for (User user2 : Ama) {
                hashMap.put(user2.getId(), user2.A0P());
            }
        }
        return hashMap;
    }

    public final void D1K() {
        UserDetailFragment userDetailFragment = this.A01;
        if (userDetailFragment.A15()) {
            userDetailFragment.A0z("chaining_button");
        }
    }

    public final void D5y(EX9 ex9) {
        String str;
        if (ex9 == EX9.PROFILE_DISCOVER_PEOPLE_CI_UPSELL) {
            str = "self_profile_su";
        } else {
            str = "profile";
        }
        new FGL(this.A01, new 0xG(str), this.A00, (C51950G8t) null, (C49498Ewd) null).A07(ex9);
    }

    public final void Dbx() {
        String str;
        Bundle bundle = new Bundle();
        User user = this.A08.A0P.A0J;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        bundle.putString("target_user_id", str);
        FragmentActivity fragmentActivity = this.A05;
        new AnonymousClass6W8(fragmentActivity, bundle, this.A00, ModalActivity.class, "recommend_accounts_sender").A0C(fragmentActivity);
    }

    public final void Dkk() {
        UserDetailTabController userDetailTabController = this.A08;
        userDetailTabController.A0L(C322496vv.Closed);
        userDetailTabController.A0F();
    }
}
