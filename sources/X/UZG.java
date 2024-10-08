package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;

public final class UZG extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteAdsManagerErrorFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eom(2131970691);
        0hq r0 = this.mFragmentManager;
        if (r0 != null) {
            r2.Eu4(AnonymousClass7TF.A1R(r0.A0M()));
        }
    }

    public final String getModuleName() {
        return "promote_simple_error";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString(TraceFieldType.Error)) == null) {
            str = AnonymousClass7TE.A16(requireContext(), 2131970133);
        }
        View A0F = DbY.A0F(view, R.id.promote_empty_view_stub);
        if (A0F != null) {
            TextView A0R = AnonymousClass7TG.A0R(A0F, R.id.promote_empty_view_title);
            TextView A0R2 = AnonymousClass7TG.A0R(A0F, R.id.promote_empty_view_description);
            A0R.setText(2131970134);
            A0R2.setText(str);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1188904828);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_ads_manager_error_view, false);
        AnonymousClass0fD.A09(103002230, A02);
        return A0D;
    }
}
