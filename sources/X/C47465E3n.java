package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.E3n  reason: case insensitive filesystem */
public final class C47465E3n extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "UnderAgeRegBlockingFragment";
    public AnonymousClass0wW A00;
    public RegFlowExtras A01;

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public static void A00(C47465E3n e3n) {
        RegFlowExtras regFlowExtras;
        G8D activity = e3n.getActivity();
        if (!(activity instanceof G8D) || e3n.mFragmentManager == null) {
            Bundle bundle = e3n.mArguments;
            if ((bundle == null || !bundle.getBoolean("SHOULD_START_AT_SAC_REG_FLOW", false)) && ((regFlowExtras = e3n.A01) == null || regFlowExtras.A01() == null || regFlowExtras.A01() != EXD.SAC)) {
                0hq r2 = e3n.mFragmentManager;
                if (r2 != null) {
                    r2.A19("reg_gdpr_entrance", 1);
                    return;
                }
                return;
            }
            DbT.A1K(e3n);
        } else if (!activity.CHx()) {
            e3n.mFragmentManager.A13();
        }
    }

    public final String getModuleName() {
        return getClass().getSimpleName();
    }

    public final boolean onBackPressed() {
        Bundle A06 = DbU.A06(requireActivity());
        if (A06 == null || !A06.containsKey("caa_registration_redirection_to_native")) {
            A00(this);
            return true;
        }
        DbT.A1K(this);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(181637578);
        C47465E3n.super.onCreate(bundle);
        17k.A07(this.mArguments, "Arguments must contain MainSession token and Registration extras");
        this.A00 = DbX.A0T(this);
        this.A01 = (RegFlowExtras) this.mArguments.getParcelable("RegFlowExtras.EXTRA_KEY");
        AnonymousClass0fD.A09(-671450039, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1089794762);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.under_age_reg_blocking_fragment);
        FPD.A00(A0C.requireViewById(R.id.ok_button), 22, this);
        AnonymousClass0fD.A09(2054787410, A02);
        return A0C;
    }
}
