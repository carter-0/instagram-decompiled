package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ToW  reason: case insensitive filesystem */
public final class C14030ToW extends GAR implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ProfileContextualFeedController";
    public 1Xj A00;
    public User A01;
    public final Bundle A02 = new Bundle();
    public final Fragment A03;
    public final UserSession A04;
    public final JRI A05;
    public final ContextualFeedNetworkConfig A06;
    public final C321656uX A07;
    public final String A08;
    public final List A09 = new ArrayList();
    public final 1wn A0A = new WQU(this, 11);
    public final C321636uV A0B;
    public final boolean A0C;

    public C14030ToW(Fragment fragment, UserSession userSession, AnonymousClass4D6 r13, JRI jri, ContextualFeedNetworkConfig contextualFeedNetworkConfig, 1Xl r16, String str, boolean z) {
        1Xj r0;
        0qQ.A0B(contextualFeedNetworkConfig, 1);
        this.A06 = contextualFeedNetworkConfig;
        UserSession userSession2 = userSession;
        this.A04 = userSession;
        this.A08 = str;
        this.A03 = fragment;
        this.A0C = z;
        this.A05 = jri;
        C14217Trx trx = new C14217Trx(this);
        this.A0B = trx;
        if (r16 != null) {
            r0 = r16.BPf();
        } else {
            r0 = null;
        }
        this.A00 = r0;
        String str2 = contextualFeedNetworkConfig.A01;
        C321656uX r02 = new C321656uX(fragment.requireContext(), userSession2, r13, (C228312lJ) null, trx, C14204Trj.A00(this.A06.A00), (Dda) null, str2, AnonymousClass7TF.A1V(str2));
        this.A07 = r02;
        String str3 = contextualFeedNetworkConfig.A03;
        C324366zA r1 = r02.A03.A03;
        r1.A09 = str3;
        r1.A08 = contextualFeedNetworkConfig.A02;
    }

    public final C54620HLd A05() {
        return null;
    }

    public final List A08() {
        return null;
    }

    public final void A0D() {
    }

    public final void A0H(AnonymousClass1qK r1) {
    }

    public final void A0I(AnonymousClass1qK r1) {
    }

    public final void A0L(C2362232x r4) {
        0qQ.A0B(r4, 0);
        String str = this.A08;
        if ((0qQ.A0K(str, "feed_contextual_self_profile") || 0qQ.A0K(str, "feed_contextual_group_profile")) && C14204Trj.A00(this.A06.A00) == C294265mA.MAIN_GRID) {
            r4.A0c = true;
            r4.A0L = new WZT(this);
            AnonymousClass1Nd.A00(this.A04).A01(this.A0A, C321786uk.class);
        }
    }

    public final void A0M(User user) {
    }

    public final void A0N(User user) {
    }

    public final void A0O(String str) {
    }

    public final void A0P(List list) {
    }

    public final boolean A0Z() {
        return false;
    }

    public final boolean A0a() {
        return false;
    }

    public final boolean A0b() {
        return true;
    }

    public final boolean A0c() {
        return true;
    }

    public final boolean A0g() {
        return false;
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final 1sy A06() {
        return 1sy.A0I;
    }

    public final Integer A07() {
        return AnonymousClass05K.A01;
    }

    public final void A09() {
        this.A07.A00((1FR) null, new C46323Dbr(this.A06.A04), false, false, false, false);
    }

    public final void A0A() {
        List list = this.A09;
        if (AnonymousClass7TE.A1b(list)) {
            UserSession userSession = this.A04;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36320008687984508L)) {
                Bundle bundle = this.A02;
                bundle.putInt("arg_user_feed_source", C14204Trj.A00(this.A06.A00).A00);
                bundle.putString("arg_user_feed_source_next_max_id", this.A07.A03.A03.A07);
                bundle.putStringArray("arg_user_feed_pending_media_ids", DbU.A1b(list, 0));
                this.A03.getParentFragmentManager().A0z(AnonymousClass000.A00(3885), bundle);
            }
        }
    }

    public final void A0B() {
        String str = this.A06.A04;
        UserSession userSession = this.A04;
        User A0j = DbV.A0j(userSession, str);
        this.A01 = A0j;
        if (A0j == null) {
            1NY A0b = AnonymousClass7TG.A0b(userSession);
            A0b.A0Q(C3727892k.class, C3727992l.class);
            A0b.A0A("users/{user_id}/info/");
            A0b.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
            1OC A0T = DbT.A0T(A0b, "from_module", this.A08);
            C15622Ufo.A00(A0T, this, 19);
            Dbb.A15(this.A03, A0T);
        }
    }

    public final void A0C() {
        AnonymousClass1Nd.A00(this.A04).A02(this.A0A, C321786uk.class);
    }

    public final void A0F(2da r6) {
        FollowStatus followStatus;
        User user;
        int i = this.A06.A00;
        if ((C14204Trj.A00(i) == C294265mA.PHOTOS_OF_YOU || C14204Trj.A00(i) == C294265mA.PENDING_PHOTOS_OF_YOU) && AnonymousClass0t1.A01.A01(this.A04).equals(this.A01) && this.A0C) {
            AnonymousClass3JR r2 = new AnonymousClass3JR();
            r2.A0K = this.A03.getString(2131952191);
            DbX.A19(new WB0(this, 65), r2, r6);
        }
        UserSession userSession = this.A04;
        if (2R8.A05(userSession, DbX.A0r(this.A01)) || (user = this.A01) == null) {
            followStatus = FollowStatus.A08;
        } else {
            followStatus = user.B6o();
        }
        if (followStatus == FollowStatus.A06 && 182.A06(0Tu.A05, userSession, 36312488198800515L)) {
            User user2 = this.A01;
            WBE wbe = new WBE(46, (Object) user2, (Object) this);
            AnonymousClass3JR r1 = new AnonymousClass3JR();
            r1.A0A = R.layout.fade_in_follow_overflow_switcher;
            r1.A05 = 2131962530;
            r1.A0G = wbe;
            View AA5 = r6.AA5(new AnonymousClass3Jb(r1));
            0qQ.A0C(AA5, "null cannot be cast to non-null type com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton");
            FadeInFollowButton fadeInFollowButton = (FadeInFollowButton) AA5;
            fadeInFollowButton.A04(true, userSession);
            if (user2 != null) {
                C267154b3.A02(fadeInFollowButton, userSession, user2.getId());
            }
        }
    }

    public final void A0Q(boolean z, boolean z2) {
        this.A07.A00(new 1FR(AnonymousClass05K.A00), new C46323Dbr(this.A06.A04), true, true, false, false);
    }

    public final boolean A0S() {
        return this.A07.A03.A05();
    }

    public final boolean A0T() {
        return 182.A06(0Tu.A05, this.A04, 36319626434846249L);
    }

    public final boolean A0U() {
        return this.A07.A01();
    }

    public final boolean A0W() {
        return this.A07.A02();
    }

    public final boolean A0X() {
        return AnonymousClass7TF.A1W(C14204Trj.A00(this.A06.A00), C294265mA.REPOSTS_MEDIA_GRID);
    }

    public final boolean A0Y() {
        UserSession userSession = this.A04;
        return 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36317560555836756L);
    }

    public final boolean A0d() {
        String str;
        UserSession userSession = this.A04;
        User user = this.A01;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        if (!2R8.A05(userSession, str) || C14204Trj.A00(this.A06.A00) != C294265mA.REPOSTS_MEDIA_GRID) {
            return false;
        }
        return true;
    }

    public final boolean A0e() {
        UserSession userSession = this.A04;
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        if (!182.A06(A0H, userSession, 36317560555836756L) || !182.A06(A0H, userSession, 36317560556426588L)) {
            return false;
        }
        return true;
    }

    public final boolean A0f() {
        return AnonymousClass7TF.A1W(C14204Trj.A00(this.A06.A00), C294265mA.PHOTOS_OF_YOU);
    }

    public final boolean A0h(1Xj r7) {
        String str;
        UserSession userSession = this.A04;
        User user = this.A01;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        boolean A052 = 2R8.A05(userSession, str);
        int i = this.A06.A00;
        boolean z = false;
        if (C14204Trj.A00(i) == C294265mA.MAIN_GRID) {
            z = true;
        }
        boolean z2 = false;
        if (C14204Trj.A00(i) == C294265mA.REPOSTS_MEDIA_GRID) {
            z2 = true;
        }
        if (!r7.A5G() || !A052 || !z2 || !z || r7.A64()) {
            return true;
        }
        return false;
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final boolean isSponsoredEligible() {
        return 182.A06(0Tu.A05, this.A04, 36315829683555900L);
    }

    public final int A04(Context context) {
        if (A0Y()) {
            return AnonymousClass3D4.A00(context);
        }
        return 0;
    }
}
