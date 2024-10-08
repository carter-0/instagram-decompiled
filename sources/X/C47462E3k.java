package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.E3k  reason: case insensitive filesystem */
public final class C47462E3k extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "CheckoutUpsellValuePropFragment";
    public UserSession A00;
    public boolean A01;

    public final String getModuleName() {
        return "CHECKOUT_VALUE_PROP_FRAGMENT";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-148226158);
        C47462E3k.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            UserSession A0U = DbS.A0U(bundle2);
            this.A00 = A0U;
            if (A0U != null) {
                C229382nI A0L = DbY.A0L(requireActivity(), A0U, "CHECKOUT_VALUE_PROP_FRAGMENT");
                UserSession userSession = this.A00;
                if (userSession != null) {
                    Bundle bundle3 = this.mArguments;
                    if (bundle3 != null) {
                        String string = bundle3.getString("waterfall_id");
                        String string2 = bundle3.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        String string3 = bundle3.getString("prior_module");
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
                        C360678ey A05 = C359988do.A05(userSession, "com.bloks.www.bloks.commerce.onboarding.open.checkout.value.prop.async", DbZ.A0r(r1, r2));
                        E86.A01(A05, A0L, this, 22);
                        schedule(A05);
                        AnonymousClass0fD.A09(-744600687, A02);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
            DbS.A14();
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-804566667, A02);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-594326132);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        AnonymousClass0fD.A09(1147924109, A02);
        return inflate;
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(643714986);
        super.onResume();
        if (this.A01) {
            DbT.A1I(this);
        }
        AnonymousClass0fD.A09(-1071377151, A02);
    }
}
