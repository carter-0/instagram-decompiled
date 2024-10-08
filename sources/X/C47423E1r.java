package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E1r  reason: case insensitive filesystem */
public final class C47423E1r extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectOutcomeUpsellFragment";
    public boolean A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "outcome_upsell_sheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.headline);
        int i = 2131960562;
        if (this.A00) {
            i = 2131960563;
        }
        A0R.setText(i);
        A00(AnonymousClass7TF.A0G(view, R.id.first_row), 2131960559, 2131960556, R.drawable.instagram_ads_pano_outline_24);
        A00(AnonymousClass7TF.A0G(view, R.id.second_row), 2131960560, 2131960557, R.drawable.instagram_promote_pano_outline_24);
        A00(AnonymousClass7TF.A0G(view, R.id.third_row), 2131960561, 2131960558, R.drawable.instagram_shield_star_pano_outline_24);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public static final void A00(View view, int i, int i2, int i3) {
        DbU.A0F(view, R.id.icon).setImageResource(i3);
        Dba.A06(view).setText(i);
        DbU.A0G(view, R.id.content).setText(i2);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-115433912);
        C47423E1r.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("open_from_first_banner", false);
        }
        this.A00 = z;
        AnonymousClass0fD.A09(-1633605583, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-897951967);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.outcome_upsell_sheet_container, viewGroup, false);
        AnonymousClass0fD.A09(-1651135932, A02);
        return inflate;
    }
}
