package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class E0f extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AdCodeAfterMediaCreationFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        DU2 A1E;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        String string = requireArguments().getString("media_id");
        1Xj A02 = DbX.A0d(this.A00).A02(string);
        if (A02 == null || (A1E = A02.A1E()) == null) {
            str = null;
        } else {
            str = A1E.getAccessToken();
        }
        if (A02 == null) {
            0f9 AEf = 0wj.A01.AEf("missing_argument", 652421789);
            AEf.ERJ(AnonymousClass7TE.A0z(C273654mx.A00(810)));
            AEf.report();
        }
        if (str == null) {
            0f9 AEf2 = 0wj.A01.AEf("missing_argument", 652421789);
            AEf2.ERJ(AnonymousClass7TE.A0z("adcode is null"));
            AEf2.report();
        }
        if (A02 == null || str == null) {
            DbZ.A15(this);
            return;
        }
        ImageUrl A1Q = A02.A1Q();
        if (A1Q != null) {
            DbT.A0b(view, R.id.media_thumbnail).setUrl(A1Q, this);
        }
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.ad_code);
        A0R.setText(str);
        AnonymousClass0fU.A00(new C50105FOv(requireContext, this, str, string, 0), A0R);
        AnonymousClass0fU.A00(new C50105FOv(requireContext, this, str, string, 1), view.requireViewById(R.id.copy_button));
        AnonymousClass0fU.A00(new C50105FOv(requireContext, this, str, string, 2), view.requireViewById(R.id.share_button));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-4462008);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.pa_ad_code_after_media_creation, viewGroup, false);
        AnonymousClass0fD.A09(-210677934, A02);
        return inflate;
    }
}
