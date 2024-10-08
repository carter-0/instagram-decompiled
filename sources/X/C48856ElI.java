package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ElI  reason: case insensitive filesystem */
public abstract class C48856ElI {
    public static final void A00(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, String str, String str2) {
        DbY.A1S(userSession, fragment);
        0qQ.A0B(r4, 4);
        if (str == null || fragmentActivity == null) {
            Context requireContext = fragment.requireContext();
            0wb.A03("PartnershipThreadLauncher", "Unable create BC partnership thread");
            C59689JTv.A03(requireContext, requireContext.getString(2131968258), "network_error", 0);
            return;
        }
        JVF.A04(r4, userSession, AnonymousClass05K.A0Y, str, AnonymousClass7TF.A0w("surface", C273654mx.A00(422)));
        SQH.A02(fragmentActivity.getSupportFragmentManager());
        C69878Ntg.A00(userSession, new C50372FaX(fragmentActivity, r4, userSession, str2), AnonymousClass7TE.A1I(str), true);
    }
}
