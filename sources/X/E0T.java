package X;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E0T extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AltTextInfoBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "alt_text_info_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-493532842);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.alt_text_info_bottomsheet, viewGroup, false);
        0qQ.A0C(inflate, AnonymousClass000.A00(0));
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.alt_text_bottom_sheet_text_view);
        TextView A0d2 = AnonymousClass7TE.A0d(inflate, R.id.alt_text_bottom_sheet_learn_more_text);
        StringBuilder sb = new StringBuilder(DbV.A05(this).getString(2131952924));
        sb.append("\n\n");
        Dba.A0s(requireContext(), "\n\n", sb, 2131952928);
        sb.append(requireContext().getString(2131952925));
        sb.append("\n");
        Dba.A0s(requireContext(), "\n", sb, 2131952926);
        Dba.A0s(requireContext(), "\n\n", sb, 2131952927);
        sb.append(requireContext().getString(2131952923));
        sb.append(" ");
        sb.append(Html.fromHtml(DbV.A05(this).getString(2131952933)));
        String A0m = DbU.A0m(this, 2131952934);
        SpannableStringBuilder A0C = DbS.A0C(A0m);
        AnonymousClass7AV.A05(A0C, new ESx(this, Dbb.A04(this)), A0m);
        A0d2.setMovementMethod(AnonymousClass6LK.A00);
        A0d2.setText(A0C);
        FP5.A01(A0d2, 58, this);
        A0d.setText(sb);
        AnonymousClass0fD.A09(732354658, A02);
        return inflate;
    }
}
