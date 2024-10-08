package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.fbpay.shoppay.IGShopPayCustomTabsActivity;

public abstract class RRM {
    public final void A02(Fragment fragment, String str, int i) {
        0qQ.A0B(str, 1);
        while (fragment.mParentFragment != null && !(fragment instanceof R8b)) {
            fragment = fragment.mParentFragment;
            if (fragment == null) {
                return;
            }
        }
        Intent A0A = C66580MXl.A0A(fragment.requireContext(), IGShopPayCustomTabsActivity.class);
        A0A.putExtra("extra_url", str);
        0kR.A05(fragment, A0A, i);
    }

    public final void A00(Context context, String str) {
        AnonymousClass7TG.A1N(context, str);
        C8298Qne qne = (C8298Qne) this;
        if (str.startsWith(C66579MXk.A00(64))) {
            UserSession userSession = qne.A00;
            0qQ.A0C(userSession, AnonymousClass000.A00(2));
            FFC.A03(userSession, context, str);
            return;
        }
        Intent A09 = DbX.A09(str);
        if (!0b6.A00().A06().A0G(context, A09)) {
            AnonymousClass0b5.A03(context, A09);
        }
    }

    public final void A01(Context context, String str) {
        AnonymousClass7TG.A1N(context, str);
        try {
            Uri A09 = DbT.A09(str);
            if ("https".equals(A09.getScheme())) {
                new SO4().A01().A00(context, A09);
            }
        } catch (SecurityException e) {
            0KC.A0F("FBPayUrlLauncher", "Encounter security exception when parsing url!", e);
        }
    }
}
