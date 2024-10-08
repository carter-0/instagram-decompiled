package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E11 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MemorializationBottomSheetFragment";
    public String A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "memorialization_info";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1218798024);
        E11.super.onCreate(bundle);
        this.A00 = C320236s2.A01(requireArguments(), "ARG_MEMORIALIZED_USER_NAME");
        AnonymousClass0fD.A09(-797782569, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1584629790);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.memorialized_tag_info_bottom_sheet, viewGroup, false);
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.memorialization_bottom_sheet_title_view);
        if (A0d != null) {
            DbX.A1F(A0d, this, this.A00, 2131965991);
        }
        TextView A0d2 = AnonymousClass7TE.A0d(inflate, R.id.memorialization_bottom_sheet_content_view);
        if (A0d2 != null) {
            AnonymousClass7AV.A07(new ESx(this, Dbb.A04(this)), A0d2, DbU.A0m(this, 2131965989), getString(2131965990));
        }
        AnonymousClass0fD.A09(1621109324, A02);
        return inflate;
    }
}
