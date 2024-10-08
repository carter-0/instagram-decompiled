package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

public final class F1I {
    public final void A00(Fragment fragment, FragmentActivity fragmentActivity, EtT etT, String str, boolean z) {
        List A04 = fragmentActivity.getSupportFragmentManager().A0U.A04();
        if (A04 == null || !A04.contains(fragment)) {
            if (fragment.mArguments == null) {
                fragment.setArguments(AnonymousClass7TE.A0a());
            }
            if (TextUtils.isEmpty(fragment.requireArguments().getString("IgSessionManager.SESSION_TOKEN_KEY"))) {
                fragment.requireArguments().putString("IgSessionManager.SESSION_TOKEN_KEY", etT.A00.getToken());
            }
            C309516Yo A0M = DbS.A0M(fragmentActivity, etT.A00);
            A0M.A0G = true;
            if (z) {
                A0M.A09();
            }
            if (str != null) {
                A0M.A0A = str;
            }
            Dba.A13(fragment, A0M);
        }
    }
}
