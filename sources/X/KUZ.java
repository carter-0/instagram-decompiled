package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.appreciation.analytics.LoggingData;

public final class KUZ extends C47480E4f {
    public static final String __redex_internal_original_name = "AppreciationCreatorSettingsFragment";
    public Dialog A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(MMK.A00(this, 31));
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131956604);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHH(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 7), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final UserMonetizationProductType A04() {
        return UserMonetizationProductType.CONTENT_APPRECIATION;
    }

    public final C48182EaO A06() {
        return new EN3("com.instagram.content_appreciation.navigation_handler");
    }

    public final void A09() {
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHH(07U.A05, this, viewLifecycleOwner, (AnonymousClass4D7) null, 6), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final void A0A() {
        C60307Jj6 jj6 = (C60307Jj6) this.A02.getValue();
        if (DbX.A1b(jj6.A0A)) {
            jj6.A04(true);
        } else {
            MHA.A03(jj6, C318116oQ.A00(jj6), 27);
        }
    }

    public final void A0C(String str) {
        if (str != null) {
            Bundle requireArguments = requireArguments();
            String str2 = C63033KqO.A00(requireArguments()).A00;
            0qQ.A0B(str2, 1);
            requireArguments.putParcelable("appreciation_logging_data", new LoggingData(str, str2));
        }
    }

    public final void A0D(boolean z) {
        AnonymousClass7TF.A1O(((C60307Jj6) this.A02.getValue()).A0C, z);
    }

    public KUZ() {
        MMK A002 = MMK.A00(this, 35);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMK.A00(MMK.A00(this, 32), 33));
        this.A02 = DbS.A0I(MMK.A00(A003, 34), A002, new MMZ(24, (Object) null, (Object) A003), DbS.A0z(C60307Jj6.class));
    }

    public final String A07() {
        return C63033KqO.A00(requireArguments()).A01;
    }

    public final boolean A0E() {
        if (!requireArguments().getBoolean("arg_start_onboarding", false)) {
            C60307Jj6 jj6 = (C60307Jj6) this.A02.getValue();
            if (!jj6.A02.A03(jj6.A03, AnonymousClass05K.A0C, true)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1766948337);
        super.onCreate(bundle);
        if (!A0E()) {
            A0D(false);
            C60307Jj6 jj6 = (C60307Jj6) this.A02.getValue();
            if (DbX.A1b(jj6.A0A)) {
                jj6.A04(true);
            } else {
                MHA.A03(jj6, C318116oQ.A00(jj6), 27);
            }
        }
        AnonymousClass0fD.A09(553755506, A022);
    }
}
