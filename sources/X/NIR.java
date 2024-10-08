package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NIR extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "EmptyReportBottomSheetFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "empty_report_bottom_sheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-83957582);
        NIR.super.onCreate(bundle);
        this.A00 = DbS.A0U(requireArguments());
        AnonymousClass0fD.A09(-74167630, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1818876928);
        0qQ.A0B(layoutInflater, 0);
        NIR.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.frx_report_empty_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-430267834, A02);
        return inflate;
    }
}
