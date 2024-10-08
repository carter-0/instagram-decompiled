package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.70J  reason: invalid class name */
public final class AnonymousClass70J implements AnonymousClass70K {
    public boolean A00;
    public final FragmentActivity A01;
    public final 0wc A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C322456vr A05;
    public final C322296vZ A06;
    public final C323206x7 A07;
    public final UserDetailFragment A08;
    public final UserDetailTabController A09;
    public final Dc6 A0A;
    public final Dda A0B;
    public final C321586uQ A0C;
    public final String A0D;
    public final String A0E;
    public final Set A0F = new HashSet();
    public final C323246xB A0G;

    public final void A05(C46443Df5 df5) {
        String str;
        String str2;
        Dc6 dc6 = this.A0A;
        Fragment A002 = A00(C46451DfE.A00(df5, dc6.A03(), (String) null, false));
        if (A002 != null) {
            if (df5 == C46443Df5.FOLLOWERS) {
                str = "tap_followers";
            } else if (df5 == C46443Df5.FOLLOWING) {
                str = "tap_following";
            } else {
                str = "tap_follow_details";
            }
            UserSession userSession = this.A03;
            C319976rX.A08(this.A08, userSession, A01(this), str, dc6.A03(), this.A0D, this.A0E, "user_profile_header");
            User user = this.A09.A0P.A0J;
            if (user != null) {
                if (C324376zB.A02(userSession, user)) {
                    str2 = "unified_follow_list";
                } else {
                    str2 = "social_context_follow_list_fragment";
                }
                C323246xB r1 = this.A0G;
                r1.A03(A002, str2, true);
                r1.A00();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r12 != r3) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(android.view.MotionEvent r11, X.C46443Df5 r12) {
        /*
            r10 = this;
            r5 = 0
            r4 = 1
            X.0qQ.A0B(r11, r4)
            int r0 = r11.getAction()
            if (r0 != r4) goto L_0x0068
            com.instagram.common.session.UserSession r6 = r10.A03
            X.0Tu r8 = X.0Tu.A05
            r0 = 36329341650485309(0x8111580000403d, double:3.0381601740594076E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 == 0) goto L_0x0068
            X.Df5 r3 = X.C46443Df5.FOLLOWERS
            r2 = -1
            X.Dc6 r7 = r10.A0A
            com.instagram.user.model.User r0 = r7.A03
            if (r12 != r3) goto L_0x0072
            if (r0 == 0) goto L_0x007b
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B6v()
        L_0x002b:
            if (r0 == 0) goto L_0x007b
            int r9 = r0.intValue()
        L_0x0031:
            X.F2V r1 = X.C49189Equ.A00(r6)
            java.lang.String r0 = r7.A03()
            r1.A00(r12, r0, r9, r5)
            r0 = 36329341650550846(0x8111580001403e, double:3.0381601741008535E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            if (r0 == 0) goto L_0x0068
            com.instagram.user.model.User r0 = r7.A03
            if (r12 != r3) goto L_0x0069
            if (r0 == 0) goto L_0x005b
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B70()
        L_0x0053:
            if (r0 == 0) goto L_0x0059
            int r2 = r0.intValue()
        L_0x0059:
            if (r12 != r3) goto L_0x005d
        L_0x005b:
            X.Df5 r3 = X.C46443Df5.FOLLOWING
        L_0x005d:
            X.F2V r1 = X.C49189Equ.A00(r6)
            java.lang.String r0 = r7.A03()
            r1.A00(r3, r0, r2, r4)
        L_0x0068:
            return r5
        L_0x0069:
            if (r0 == 0) goto L_0x0059
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B6v()
            goto L_0x0053
        L_0x0072:
            if (r0 == 0) goto L_0x007b
            X.4Cl r0 = r0.A03
            java.lang.Integer r0 = r0.B70()
            goto L_0x002b
        L_0x007b:
            r9 = -1
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70J.A07(android.view.MotionEvent, X.Df5):boolean");
    }

    public AnonymousClass70J(FragmentActivity fragmentActivity, 0wc r3, UserSession userSession, AnonymousClass4DU r5, C322456vr r6, C322296vZ r7, C323206x7 r8, UserDetailFragment userDetailFragment, C323246xB r10, UserDetailTabController userDetailTabController, Dc6 dc6, Dda dda, C321586uQ r14, String str, String str2) {
        0qQ.A0B(r10, 8);
        0qQ.A0B(r14, 13);
        this.A03 = userSession;
        this.A08 = userDetailFragment;
        this.A01 = fragmentActivity;
        this.A09 = userDetailTabController;
        this.A0A = dc6;
        this.A0D = str;
        this.A0E = str2;
        this.A0G = r10;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r7;
        this.A0B = dda;
        this.A0C = r14;
        this.A07 = r8;
        this.A05 = r6;
    }

    private final Fragment A00(FollowListData followListData) {
        User user = this.A09.A0P.A0J;
        if (user != null) {
            UserSession userSession = this.A03;
            FollowListData followListData2 = followListData;
            if (C324376zB.A02(userSession, user)) {
                return C46339Dch.A00().A00.CrR(userSession, user, followListData2, C324376zB.A00(user), (HashMap) null, false);
            }
            if (followListData.A00 != C46443Df5.MUTUAL) {
                return null;
            }
            return C46339Dch.A00().A00.CrH((Bundle) null, userSession, new SocialContextFollowListFragmentConfig(followListData, user.getId()));
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C319986rY A01(AnonymousClass70J r4) {
        User user = r4.A09.A0P.A0J;
        if (user != null) {
            UserSession userSession = r4.A03;
            if (0qQ.A0K(userSession.A06, user.getId())) {
                return C319986rY.SELF;
            }
            if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A05) {
                return C319986rY.FOLLOWING;
            }
        }
        return C319986rY.NOT_FOLLOWING;
    }

    public final C50672FgX A02() {
        return (C50672FgX) this.A07.A0X.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.WNI, java.lang.Object, X.4bz] */
    public final void A03() {
        UserSession userSession = this.A03;
        UserDetailFragment userDetailFragment = this.A08;
        C319986rY r6 = C319986rY.SELF;
        Dc6 dc6 = this.A0A;
        C319976rX.A08(userDetailFragment, userSession, r6, "edit_profile", dc6.A03(), this.A0D, this.A0E, "name_and_bio_upsell");
        C46656Dib A042 = C46447Df9.A03().A01.A04("profile");
        C323246xB r2 = this.A0G;
        r2.A03(A042, "edit_profile", false);
        r2.A01();
        r2.A02();
        String A032 = dc6.A03();
        ? obj = new Object();
        obj.A00 = A032;
        r2.A04(obj);
        r2.A00();
    }

    public final void A04() {
        C46443Df5 df5 = C46443Df5.MUTUAL;
        Dc6 dc6 = this.A0A;
        Fragment A002 = A00(C46451DfE.A00(df5, dc6.A03(), (String) null, false));
        if (A002 != null) {
            C319976rX.A08(this.A08, this.A03, A01(this), "tap_followed_by", dc6.A03(), this.A0D, this.A0E, "user_profile_header");
            C323246xB r2 = this.A0G;
            r2.A03(A002, "social_context_follow_list_fragment", true);
            r2.A00();
        }
    }

    public final void A06(String str) {
        C319976rX.A08(this.A08, this.A03, A01(this), str, this.A0A.A03(), this.A0D, this.A0E, "user_profile_header");
    }

    public final void Ck8(User user, C48088EVg eVg, String str, String str2) {
        0qQ.A0B(eVg, 1);
        if (eVg.ordinal() != 7) {
            AnonymousClass73V.A0G(this.A02, "click", str2, user.getId());
        } else {
            AnonymousClass73V.A0E(this.A02, str2, user.getId());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.07Z, com.instagram.profile.fragment.UserDetailFragment] */
    public final void FJ9(User user, C48088EVg eVg) {
        String id = user.getId();
        1YZ r1 = 1YZ.A02;
        if (r1 != null) {
            r1.A02(this.A01, AnonymousClass07i.A00(this.A08), this.A03, new C51088FoI(this, id), id, this.A04.getModuleName());
        }
    }
}
