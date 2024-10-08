package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EQq  reason: case insensitive filesystem */
public final class C48007EQq extends C47469E3t {
    public static final String __redex_internal_original_name = "DataDownloadConfirmFragment";
    public String A00;

    public final String getModuleName() {
        return "data_download_confirm";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1781648070);
        super.onCreate(bundle);
        this.A00 = requireArguments().getString("email");
        AnonymousClass0fD.A09(194864849, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(759602529);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.data_download_confirm_fragment);
        DbU.A0G(A0C, R.id.header_text).setText(2131957391);
        int i = 2131957389;
        if (DbY.A1Y(0Tu.A05, this.A00, 36317822548186715L)) {
            i = 2131957390;
        }
        DbX.A1E(A0C, DbV.A0z(this, this.A00, i), R.id.body_text);
        DbU.A0F(A0C, R.id.header_icon).setImageDrawable(DbV.A05(this).getDrawable(R.drawable.checkmark_icon, (Resources.Theme) null));
        AnonymousClass0fU.A00(new FP9((Object) this, 70), A0C.requireViewById(R.id.download_request_button));
        AnonymousClass0fD.A09(1056499004, A02);
        return A0C;
    }
}
