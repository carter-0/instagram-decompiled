package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;

public final class FdY implements AnonymousClass70R {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass70R A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ boolean A05;

    public final void Cj4(C51954G8x g8x) {
    }

    public FdY(AnonymousClass4DH r1, AnonymousClass0iw r2, UserSession userSession, AnonymousClass70R r4, User user, boolean z) {
        this.A00 = r1;
        this.A02 = userSession;
        this.A01 = r2;
        this.A05 = z;
        this.A04 = user;
        this.A03 = r4;
    }

    public final void DLB(View view, C61082JwK jwK, boolean z) {
        String B6N;
        AnonymousClass70R r0 = this.A03;
        if (r0 != null) {
            r0.DLB(view, jwK, z);
        }
        C51954G8x g8x = (C51954G8x) jwK.A00;
        if (g8x != null && (B6N = g8x.B6N()) != null) {
            UserSession userSession = this.A02;
            AnonymousClass0iw r02 = this.A01;
            AnonymousClass708.A05(new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r02, userSession), "ig_bio_interests_profile_events"), 192), userSession, AnonymousClass7TE.A10(B6N), "pill_impression", AnonymousClass708.A00(B6N, this.A04.A0S()), this.A05);
        }
    }

    public final void DLC(C61082JwK jwK) {
        String B6N;
        if (jwK == null) {
            C46447Df9.A03().A02(this.A00.requireActivity(), this.A02, "self_profile");
            return;
        }
        C51954G8x g8x = (C51954G8x) jwK.A00;
        if (g8x != null && (B6N = g8x.B6N()) != null) {
            UserSession userSession = this.A02;
            AnonymousClass0iw r0 = this.A01;
            boolean z = this.A05;
            User user = this.A04;
            AnonymousClass4DH r3 = this.A00;
            AnonymousClass708.A05(new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), "ig_bio_interests_profile_events"), 192), userSession, AnonymousClass7TE.A10(B6N), "tap", AnonymousClass708.A00(B6N, user.A0S()), z);
            C360678ey A052 = C359988do.A05(userSession, "com.instagram.connections.youth_experiences.bio_interests_bottomsheet", Dbb.A0e(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId(), AnonymousClass7TE.A1L(C273654mx.A00(1533), B6N)));
            E86.A01(A052, r3, userSession, 12);
            1ES.A03(A052);
        }
    }
}
