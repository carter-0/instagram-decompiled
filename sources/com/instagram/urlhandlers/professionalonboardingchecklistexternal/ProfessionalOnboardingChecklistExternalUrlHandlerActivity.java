package com.instagram.urlhandlers.professionalonboardingchecklistexternal;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbX;
import X.DbY;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class ProfessionalOnboardingChecklistExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.professionalonboardingchecklistexternal.ProfessionalOnboardingChecklistExternalUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(245879421);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        08y r0 = 09i.A0A;
        0qQ.A0A(A0A);
        UserSession A04 = r0.A04(A0A);
        0qQ.A0B(A04, 0);
        this.A00 = A04;
        if (!(A04 instanceof UserSession)) {
            FFQ.A01(this, A0A, A04);
        } else {
            UserSession userSession = A04;
            DbY.A0s();
            DbS.A1Z(userSession);
            DbU.A1D(A0A, userSession);
            A0A.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "deep_link");
            DbU.A0v();
            OnboardingCheckListFragment onboardingCheckListFragment = new OnboardingCheckListFragment();
            onboardingCheckListFragment.setArguments(A0A);
            onboardingCheckListFragment.setArguments(A0A);
            C309516Yo A0M = DbV.A0M(onboardingCheckListFragment, this, userSession);
            A0M.A0D = false;
            A0M.A04();
        }
        AnonymousClass0fD.A07(-1651149157, A002);
    }
}
