package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FVC implements AnonymousClass0iw, C51920G7o {
    public static final String __redex_internal_original_name = "ArAdsEffectTestLinkUrlHandler";

    public final Bundle AFW(AnonymousClass0wW r2, String str) {
        return null;
    }

    public final void CI1(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0wW r13) {
        Integer num;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass7TG.A1T(bundle, fragmentActivity, r13);
        UserSession A00 = 0Gl.A00(r13);
        String A0m = DbS.A0m(bundle);
        if (!(A0m == null || A0m.length() == 0)) {
            Uri A09 = DbT.A09(A0m);
            if (0qQ.A0K(A09.getHost(), "ar_commerce")) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            String string = bundle.getString("effect_id_key");
            String queryParameter = A09.getQueryParameter("encoded_token");
            String string2 = bundle.getString("ch_key");
            if (!(string == null || string.length() == 0 || queryParameter == null || queryParameter.length() == 0)) {
                C17943ViY A01 = C297725sE.A00().A01(fragmentActivity2, 28D.A0P, A00, num, string, string2, queryParameter);
                A01.A02 = "back";
                A01.A00();
                return;
            }
        }
        fragmentActivity.finish();
    }

    public final boolean EHn() {
        return false;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }
}
