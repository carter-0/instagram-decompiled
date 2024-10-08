package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NIU extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AiAgentAssistantBrazilUkNuxBottomsheetFragment";
    public final AnonymousClass0eM A00 = DbW.A0p(this, 15);
    public final AnonymousClass0eM A01 = DbW.A0p(this, 16);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C331157Pu A0f = C66582MXn.A0f(this);
        int color = requireContext().getColor(R.color.meta_ai_invocation_brazil_nux_default_color);
        if (A0f != null) {
            A0f.A03.A0S(color);
        }
        AnonymousClass0eM r11 = this.A02;
        C55964HqV hqV = new C55964HqV(requireContext(), AnonymousClass7TE.A0l(r11), new P32(0, A0f, view2));
        0lg A0X = DbT.A0X(r11);
        0Tu r5 = 0Tu.A05;
        hqV.A00(182.A04(r5, A0X, 36887781889147660L), true);
        0nA.A0N(view2);
        String string = DbV.A05(this).getString(2131966296);
        String string2 = Dbb.A09(this, string).getString(2131966294);
        String string3 = Dbb.A09(this, string2).getString(2131966295);
        String string4 = Dbb.A09(this, string3).getString(2131966292);
        String A0d = AnonymousClass7TF.A0d(Dbb.A09(this, string4), 2131966293);
        String A04 = 182.A04(r5, DbT.A0X(r11), 36883388139373055L);
        String A042 = 182.A04(r5, DbT.A0X(r11), 36883388139307518L);
        String A043 = 182.A04(r5, DbT.A0X(r11), 36883388139241981L);
        String A044 = 182.A04(r5, DbT.A0X(r11), 36883388139176444L);
        String A045 = 182.A04(r5, DbT.A0X(r11), 36883388139504128L);
        SpannableStringBuilder A0C = DbS.A0C(DbV.A05(this).getString(2131952594, new Object[]{string, string2, string3, A0d}));
        SpannableStringBuilder A0C2 = DbS.A0C(AnonymousClass7TF.A0e(DbV.A05(this), string4, 2131952563));
        AnonymousClass7AV.A03(A0C, new C69198Ngw(this, A04, DbZ.A01(this), 0), string);
        AnonymousClass7AV.A03(A0C, new C69198Ngw(this, A042, DbZ.A01(this), 1), string2);
        AnonymousClass7AV.A03(A0C, new C69198Ngw(this, A044, DbZ.A01(this), 2), string3);
        AnonymousClass7AV.A03(A0C, new C69198Ngw(this, A045, DbZ.A01(this), 3), A0d);
        AnonymousClass7AV.A03(A0C2, new C69198Ngw(this, A043, DbZ.A01(this), 4), string4);
        TextView A0d2 = AnonymousClass7TE.A0d(view2, R.id.footer_text_1);
        DbT.A1H(A0d2);
        A0d2.setText(A0C);
        TextView A0d3 = AnonymousClass7TE.A0d(view2, R.id.footer_text_2);
        DbT.A1H(A0d3);
        A0d3.setText(A0C2);
        ((C3021461u) view2.findViewById(R.id.interstitial_bottom_button_layout)).setPrimaryAction(DbV.A05(this).getString(2131952566), new C71403Ok2(this, 39));
        ((AnonymousClass7I3) this.A00.getValue()).A07((C69503Nml) this.A01.getValue());
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1433936359);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_ai_agent_assistant_disclaimer_interstitial_brazil, false);
        AnonymousClass0fD.A09(-1681011846, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-614326777);
        super.onDestroyView();
        if (!C331227Qb.A02(AnonymousClass7TE.A0l(this.A02))) {
            ((AnonymousClass7I3) this.A00.getValue()).A06((C69503Nml) this.A01.getValue());
        }
        AnonymousClass0fD.A09(20457820, A022);
    }
}
