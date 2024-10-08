package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NIp  reason: case insensitive filesystem */
public final class C68451NIp extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BcPartnershipMessageRequestInformationFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131953748);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbU.A0G(view, R.id.opt_out_instructions).setText(2131957102);
        DbU.A0G(view, R.id.message_request_information).setText(2131957103);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-864289269);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bc_partnership_message_request_information, viewGroup, false);
        AnonymousClass0fD.A09(-1756531292, A02);
        return inflate;
    }
}
