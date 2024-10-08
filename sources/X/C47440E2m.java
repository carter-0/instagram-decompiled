package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.E2m  reason: case insensitive filesystem */
public final class C47440E2m extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorToolsMonetizationFragment";
    public final AnonymousClass0eM A00 = Dbl.A00(this, 15);
    public final AnonymousClass0eM A01 = Dbl.A00(this, 16);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = DbS.A0I(new Dbl(this, 17), new Dbl(this, 18), new C73664Phd(17, this, (Object) null), DbS.A0z(C46791DlQ.class));

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131957147);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r6 = this.A03;
        AnonymousClass0eM r1 = this.A00;
        ((C46791DlQ) r6.getValue()).A00 = DbS.A0t(r1);
        if (0qQ.A0K(r1.getValue(), "pro_home")) {
            C46791DlQ dlQ = (C46791DlQ) r6.getValue();
            FragmentActivity requireActivity = requireActivity();
            AnonymousClass7TF.A1O(dlQ.A0D, true);
            C318136oS A002 = C318116oQ.A00(dlQ);
            C58104ImQ imQ = new C58104ImQ(requireActivity, dlQ, (AnonymousClass4D7) null, 29);
            19B r4 = 19B.A00;
            1Eo.A05(r4, imQ, A002);
            A00(view);
            Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r6.getValue()).A01, new C74191PqX(17, (Object) view, (Object) this), 21);
            1Eo.A05(r4, new MFR(this, (AnonymousClass4D7) null, 12), DbV.A0J(this));
        } else {
            AnonymousClass7TE.A0b(view, R.id.megaphone_header_content).setVisibility(0);
            AnonymousClass7TE.A0b(view, R.id.headline_bottom_divider).setVisibility(0);
            DbU.A13(requireContext(), DbS.A0G(view, R.id.megaphone_header_icon), R.drawable.ig_illustrations_qp_circle_dollar_refresh);
            DbU.A1G(AnonymousClass7TE.A0d(view, R.id.megaphone_header_title), this, 2131957146);
            DbU.A1G(AnonymousClass7TE.A0d(view, R.id.megaphone_header_body), this, 2131957145);
            C46791DlQ dlQ2 = (C46791DlQ) r6.getValue();
            FragmentActivity requireActivity2 = requireActivity();
            AnonymousClass7TF.A1O(dlQ2.A0D, true);
            AnonymousClass7TE.A1Z(new C58104ImQ(requireActivity2, dlQ2, (AnonymousClass4D7) null, 28), C318116oQ.A00(dlQ2));
            A00(view);
        }
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) r6.getValue()).A03, new C74191PqX(16, (Object) view, (Object) this), 21);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    private final void A00(View view) {
        Dba.A17(DbZ.A0F(view, R.id.monetization_product_list_recycler_view), this.A01);
        Dba.A15(getViewLifecycleOwner(), ((C46791DlQ) this.A03.getValue()).A04, new MP9(this, 46), 21);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1194602745);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_tools_monetization_screen, viewGroup, false);
        AnonymousClass0fD.A09(712119988, A022);
        return inflate;
    }
}
