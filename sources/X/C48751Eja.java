package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eja  reason: case insensitive filesystem */
public abstract class C48751Eja {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        1Av A00 = 1Au.A00(userSession);
        if (!A00.A01.getBoolean("has_seen_messaging_hub_afterparty_dialog", false)) {
            C358248ab A0X = DbS.A0X(fragmentActivity);
            A0X.A0j(fragmentActivity.getDrawable(R.drawable.ig_illustrations_qp_messages_refresh));
            A0X.A09(2131966275);
            A0X.A08(2131966274);
            A0X.A0J(C50025FJk.A00(fragmentActivity, userSession, 8), 2131966273);
            A0X.A0G(C50023FJi.A00(fragmentActivity, 24), 2131968513);
            A0X.A0g(new C50038FJx(A00, 0));
            DbT.A1V(A0X);
            return;
        }
        fragmentActivity.onBackPressed();
    }
}
