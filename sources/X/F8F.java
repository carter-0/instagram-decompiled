package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class F8F {
    public static final void A00(Activity activity, UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        0qQ.A0B(userSession, 0);
        DbY.A0u(activity, C46447Df9.A02().A01(userSession, userDetailLaunchConfig), userSession, "profile");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.0rm, java.lang.Object] */
    public static final void A01(FragmentActivity fragmentActivity, AnonymousClass0iw r13, UserSession userSession, C273414mX r15, User user, String str, boolean z, boolean z2) {
        String username;
        String str2;
        UserSession userSession2 = userSession;
        User user2 = user;
        C319976rX.A05(r13, userSession, Dbb.A0O(userSession, user2), C273654mx.A00(985), user2.getId());
        ? obj = new Object();
        String str3 = str;
        if (z2) {
            SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = new SocialContextFollowListFragmentConfig(C46451DfE.A00(C46443Df5.FOLLOWERS, user2.getId(), (String) null, false), user2.getId());
            socialContextFollowListFragmentConfig.A01 = user2;
            socialContextFollowListFragmentConfig.A02 = true;
            socialContextFollowListFragmentConfig.A00 = AnonymousClass7TG.A0A(user2.A03.BVD());
            socialContextFollowListFragmentConfig.A03 = false;
            socialContextFollowListFragmentConfig.A05 = true;
            socialContextFollowListFragmentConfig.A04 = true;
            socialContextFollowListFragmentConfig.A06 = true;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putBoolean("FollowListFragment.IsBottomSheet", true);
            if (z && str != null) {
                A0a.putBoolean("FollowListFragment.AddAdUniversalCTAGap", true);
                A0a.putString("FollowListFragment.MediaId", str3);
            }
            obj.A00 = C46339Dch.A01().CrH(A0a, userSession, socialContextFollowListFragmentConfig);
            username = fragmentActivity.getApplicationContext().getString(2131967933);
        } else {
            Bundle ANE = C46339Dch.A01().ANE(userSession2, user2, C46451DfE.A00(C46443Df5.MUTUAL, user2.getId(), (String) null, false), (ArrayList) null, (HashMap) null, false);
            Bundle A0a2 = AnonymousClass7TE.A0a();
            A0a2.putBoolean("FollowListFragment.IsBottomSheet", true);
            if (z) {
                A0a2.putBoolean("FollowListFragment.AddAdUniversalCTAGap", true);
                ANE.putBoolean("UnifiedFollowFragment.EXTRA_SHOW_SECONDARY_CTA", true);
                ANE.putString("UnifiedFollowFragment.EXTRA_MEDIA_ID", str3);
            }
            ANE.putBundle("UnifiedFollowFragment.EXTRA_UNIFIED_SOCIAL_CONTEXT_OVERRIDES", A0a2);
            ANE.putBoolean("UnifiedFollowFragment.IS_BOTTOM_SHEET", true);
            ANE.putBoolean("UnifiedFollowFragment.EXTRA_SHOW_ACTION_BAR", false);
            ANE.putBoolean("UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_MUTUAL", true);
            ANE.putBoolean("UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_FOLLOWERS", true);
            ANE.putBoolean("UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_FOLLOWING", true);
            ANE.putBoolean("UnifiedFollowFragment.HAS_SIMILAR_ACCOUNTS", false);
            UnifiedFollowFragment unifiedFollowFragment = new UnifiedFollowFragment();
            unifiedFollowFragment.setArguments(ANE);
            obj.A00 = unifiedFollowFragment;
            username = user2.getUsername();
        }
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A1O = true;
        Object obj2 = obj.A00;
        if (obj2 == null) {
            str2 = "bottomSheetContentFragment";
        } else {
            C273494mf r3 = (Fragment) obj2;
            0qQ.A0C(r3, AnonymousClass000.A00(7));
            A0W.A0T = r3;
            DbS.A1S(A0W, true);
            A0W.A03 = 0.7f;
            if (username == null) {
                str2 = "bottomSheetTitle";
            } else {
                A0W.A0d = username;
                if (r15 != null) {
                    A0W.A0U = r15;
                }
                AnonymousClass7TF.A0D().post(new C51488Fuw(fragmentActivity, A0W, obj));
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
