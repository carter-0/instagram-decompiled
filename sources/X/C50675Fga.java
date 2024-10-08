package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.profile.fragment.ProfileFollowRelationshipFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fga  reason: case insensitive filesystem */
public final class C50675Fga implements AnonymousClass710 {
    public final /* synthetic */ C50654FgF A00;

    public final boolean CnA() {
        return false;
    }

    public final void D1L(String str) {
    }

    public final void D2R(String str) {
    }

    public final void D2Y(FollowStatus followStatus, User user) {
    }

    public final void D2b(User user, String str, boolean z) {
    }

    public final void D2d(String str, String str2) {
    }

    public final void D2p(User user) {
    }

    public final void D39(User user) {
    }

    public final void DDw() {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final void DPC(1Xj r1, UserDetailEntryInfo userDetailEntryInfo, String str, String str2, String str3) {
    }

    public final boolean DPN(User user) {
        return false;
    }

    public final void DRZ(boolean z) {
    }

    public final void EHb() {
    }

    public final void EM4(String str) {
    }

    public final void Euj(View view) {
    }

    public C50675Fga(C50654FgF fgF) {
        this.A00 = fgF;
    }

    public final void D2a(1Xj r35, UserDetailEntryInfo userDetailEntryInfo, FollowButton followButton, String str, String str2, String str3, String str4) {
        String id;
        String str5 = str3;
        String str6 = str2;
        UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
        C50654FgF fgF = this.A00;
        LocationDetailFragment locationDetailFragment = fgF.A03;
        DbZ.A1a(locationDetailFragment.A02, Dba.A0F(locationDetailFragment), locationDetailFragment.A03, AnonymousClass000.A00(3371));
        UserSession userSession = fgF.A02;
        User user = fgF.A04;
        Fragment fragment = fgF.A01;
        Context context = fragment.getContext();
        context.getClass();
        FragmentActivity activity = fragment.getActivity();
        if (userDetailEntryInfo == null) {
            userDetailEntryInfo2 = new UserDetailEntryInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null);
        }
        if (str2 == null) {
            str6 = AnonymousClass000.A00(4334);
        }
        if (str3 == null) {
            str5 = "MAP_PROFILE_BUSINESS_ACTIONS";
        }
        FollowStatus A0i = DbV.A0i(userSession, user);
        FollowButton followButton2 = followButton;
        if (user.CPV()) {
            FH6.A02(activity, userSession, followButton2, (C243853aD) null, user, str5);
            return;
        }
        1Xj r25 = r35;
        if (A0i == FollowStatus.A05) {
            if (r35 == null) {
                id = null;
            } else {
                id = r25.getId();
            }
            C46447Df9.A03();
            0qQ.A0B(userSession, 0);
            Bundle A09 = DbY.A09(userSession);
            A09.putString(C273654mx.A00(493), user.getId());
            A09.putString(C273654mx.A00(492), (String) null);
            A09.putString(C273654mx.A00(1340), id);
            ProfileFollowRelationshipFragment profileFollowRelationshipFragment = new ProfileFollowRelationshipFragment();
            C331127Pr A0V = DbV.A0V(A09, profileFollowRelationshipFragment, userSession);
            A0V.A0T = profileFollowRelationshipFragment;
            DbS.A1S(A0V, false);
            A0V.A03 = 0.7f;
            A0V.A0d = user.getUsername();
            C331157Pu A002 = A0V.A00();
            Context context2 = context;
            UserSession userSession2 = userSession;
            C331157Pu r26 = A002;
            profileFollowRelationshipFragment.A00 = new C51028FnK(activity, context2, userSession2, r25, r26, (UserDetailTabController) null, userDetailEntryInfo2, user, (AnonymousClass71F) null, new C51106Foa(), str6, str5);
            A002.A02((Activity) context, profileFollowRelationshipFragment);
            return;
        }
        C267064at r1 = followButton2.A0J;
        0qQ.A0B(userSession, 0);
        r1.A04((0xF) null, userSession, r25, (AnonymousClass3W1) null, (SearchContext) null, (C243853aD) null, user, (C249763kK) null, (Double) null, (String) null);
    }

    public final void DRV(String str, boolean z) {
        C50654FgF fgF = this.A00;
        LocationDetailFragment locationDetailFragment = fgF.A03;
        DbZ.A1a(locationDetailFragment.A02, Dba.A0F(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_message");
        UserSession userSession = fgF.A02;
        User user = fgF.A04;
        C49841F9g.A00(fgF.A00, fgF.A01, userSession, user, str);
    }
}
