package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.E3l  reason: case insensitive filesystem */
public final class C47463E3l extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "OffsiteOnboardingFragment";
    public boolean A00;
    public UserSession A01;

    public final String getModuleName() {
        return "OFFSITE_ONBOARDING_FRAGMENT";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-558747248);
        C47463E3l.super.onCreate(bundle);
        UserSession A0U = DbX.A0U(this);
        this.A01 = A0U;
        if (A0U != null) {
            C229382nI A0N = DbT.A0N(requireActivity(), new FUR(), A0U);
            UserSession userSession = this.A01;
            if (userSession != null) {
                Bundle requireArguments = requireArguments();
                String string = requireArguments.getString("waterfall_id");
                String string2 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                String string3 = requireArguments.getString("prior_module");
                String string4 = requireArguments.getString("presentation_style");
                C269474fB r2 = C269474fB.A00;
                C268194cw r1 = new C268194cw(r2);
                if (string2 == null) {
                    string2 = "";
                }
                r1.A0E(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string2);
                if (string == null) {
                    string = "";
                }
                r1.A0E("waterfall_id", string);
                if (string3 == null) {
                    string3 = "";
                }
                r1.A0E("prior_module", string3);
                if (string4 == null) {
                    string4 = "";
                }
                r1.A0E("presentation_style", string4);
                C360678ey A05 = C359988do.A05(userSession, "com.bloks.www.bloks.commerce.offsite.onboarding.start.async", DbZ.A0r(r1, r2));
                E86.A01(A05, A0N, this, 23);
                schedule(A05);
                AnonymousClass0fD.A09(-1416812703, A02);
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-77411302);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        AnonymousClass0fD.A09(-182221466, A02);
        return inflate;
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(-1340294721);
        super.onResume();
        if (this.A00) {
            DbT.A1I(this);
        }
        AnonymousClass0fD.A09(677783267, A02);
    }
}
