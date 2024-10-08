package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.K3s  reason: case insensitive filesystem */
public final class C61350K3s extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UserPayEstimatedEarningsDefinitionBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(107574790);
        0qQ.A0B(layoutInflater, 0);
        C61350K3s.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_estimated_earnings_definition_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(254058123, A02);
        return inflate;
    }
}
