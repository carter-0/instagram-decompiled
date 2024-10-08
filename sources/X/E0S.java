package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E0S extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CloudMediaMaxVideoLengthBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1360077531);
        0qQ.A0B(layoutInflater, 0);
        E0S.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.cloud_media_max_video_length_bottomsheet, viewGroup, false);
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.bottom_text);
        03v.A07(A0d);
        DbT.A1H(A0d);
        Context requireContext = requireContext();
        String A0m = DbU.A0m(this, 2131956205);
        String A0m2 = DbU.A0m(this, 2131956207);
        SpannableStringBuilder A0C = DbS.A0C(A0m);
        AnonymousClass7AV.A05(A0C, new C48053ESw(requireContext, this, DbV.A02(requireContext)), A0m2);
        A0d.setText(A0C);
        AnonymousClass0fD.A09(709838614, A02);
        return inflate;
    }
}
