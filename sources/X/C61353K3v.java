package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.K3v  reason: case insensitive filesystem */
public final class C61353K3v extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BoostPackageBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "boost_package_bottom_sheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        TextView A0d;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("boost_packages_badge_description")) != null && (A0d = AnonymousClass7TE.A0d(view, R.id.body)) != null) {
            A0d.setText(string);
            A0d.setVisibility(0);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-50536699);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.boost_package_bottom_sheet_content_view, viewGroup, false);
        AnonymousClass0fD.A09(962251201, A02);
        return inflate;
    }
}
