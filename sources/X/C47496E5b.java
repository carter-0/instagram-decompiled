package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.E5b  reason: case insensitive filesystem */
public final class C47496E5b extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "WearableAttributionSheetFragment";
    public String A00;
    public UserSession A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.wearable_attribution_sheet_title);
        String str = this.A05;
        if (!(A0d == null || str == null)) {
            A0d.setText(str);
        }
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.wearable_attribution_sheet_subtitle);
        String str2 = this.A04;
        if (!(A0d2 == null || str2 == null)) {
            A0d2.setText(str2);
        }
        IgImageView findViewById = view.findViewById(R.id.wearable_attribution_sheet_icon);
        String str3 = this.A03;
        if (!(findViewById == null || str3 == null)) {
            DbV.A1P(this, findViewById, str3);
        }
        TextView A0d3 = AnonymousClass7TE.A0d(view, R.id.wearable_attribution_sheet_cta_button);
        String str4 = this.A02;
        if (A0d3 != null && str4 != null) {
            A0d3.setText(str4);
            C50109FOz.A00(A0d3, 34, this);
        }
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A0H;
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1370404553);
        C47496E5b.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0U(this);
        this.A05 = requireArguments.getString(C273654mx.A00(1480));
        this.A04 = requireArguments.getString(C273654mx.A00(1479));
        this.A03 = requireArguments.getString(C273654mx.A00(1478));
        this.A02 = requireArguments.getString(C273654mx.A00(1477));
        this.A00 = requireArguments.getString(C273654mx.A00(1476));
        AnonymousClass0fD.A09(2145928166, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1241515591);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.wearable_attribution_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-524848857, A022);
        return inflate;
    }
}
