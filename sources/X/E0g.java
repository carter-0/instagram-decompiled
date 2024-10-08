package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E0g extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MediaPickerSortMethodInfoBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "media_picker_info_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbU.A1G(AnonymousClass7TG.A0R(view, R.id.bottom_sheet_reach_text_overview), this, 2131965956);
        DbU.A1G(AnonymousClass7TG.A0R(view, R.id.accounts_center_accounts_reached_title), this, 2131965953);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.accounts_center_accounts_reached_body);
        DbT.A1H(A0d);
        String A0m = DbU.A0m(this, 2131965952);
        String A0m2 = DbU.A0m(this, 2131965954);
        String A0m3 = DbU.A0m(this, 2131965961);
        SpannableStringBuilder A0C = DbS.A0C(A0m);
        AnonymousClass7AV.A05(A0C, new C48052ESv(this, "https://business.facebook.com/business/help/283579896000936", Dbb.A04(this)), A0m2);
        String A002 = AnonymousClass000.A00(630);
        AnonymousClass7AV.A05(A0C, new C48052ESv(this, A002, Dbb.A04(this)), A0m3);
        A0d.setText(A0C);
        DbU.A1G(AnonymousClass7TG.A0R(view, R.id.accounts_reached_title), this, 2131965955);
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.accounts_reached_body);
        DbT.A1H(A0d2);
        String A0m4 = DbU.A0m(this, 2131965952);
        String A0m5 = DbU.A0m(this, 2131965961);
        SpannableStringBuilder A0C2 = DbS.A0C(A0m4);
        AnonymousClass7AV.A05(A0C2, new C48052ESv(this, A002, Dbb.A04(this)), A0m5);
        A0d2.setText(A0C2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-162944861);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_media_picker_sort_method_header_info_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(213708567, A02);
        return inflate;
    }
}
