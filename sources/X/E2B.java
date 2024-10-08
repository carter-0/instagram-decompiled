package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E2B extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PrivacyBundleNuxFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "privacy_bundle_nux_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C3021461u) AnonymousClass7TE.A0b(view, R.id.continue_button)).setPrimaryActionOnClickListener(FP8.A00(this, 47));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1J(r3);
        AnonymousClass3JR A0M = DbX.A0M();
        A0M.A05 = 2131954722;
        DbX.A1A(FP8.A00(this, 46), A0M, r3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-925501931);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.privacy_bundle_education_fragment, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(inflate, R.id.privacy_bundle_nux_title_textview);
        igdsHeadline.requestFocus();
        FGX A022 = FGX.A02(requireContext(), true);
        FGX.A03(A022, igdsHeadline, FGX.A00(this, A022, FGX.A00(this, A022, DbV.A05(this).getString(2131969745), DbV.A05(this).getString(2131969742), R.drawable.instagram_lock_pano_outline_24).getString(2131969746), DbV.A05(this).getString(2131969743), R.drawable.instagram_undo_pano_outline_24).getString(2131969747), DbV.A05(this).getString(2131969744), R.drawable.instagram_delete_pano_outline_24);
        AnonymousClass0fD.A09(-427511778, A02);
        return inflate;
    }
}
