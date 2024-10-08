package X;

import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eom  reason: case insensitive filesystem */
public abstract class C49068Eom {
    public static final void A00(Fragment fragment, UserSession userSession) {
        long A01 = 182.A01(DbS.A0J(userSession, 1), userSession, 36595831486417164L);
        1Am A012 = 1Al.A01(userSession);
        1An r3 = 1An.A2s;
        0xa A03 = A012.A03(r3);
        if (A01 == -1 || ((long) A03.getInt("product_tagging_for_everyone_tagged_seller_dialog_impressions", 0)) < A01) {
            C358248ab A0U = DbW.A0U(fragment);
            DbU.A16(fragment.requireContext(), A0U, R.drawable.ig_illustrations_illo_business_heart_refresh);
            A0U.A0I(FJQ.A00, 2131974970);
            A0U.A0G(C50025FJk.A00(fragment, userSession, 43), 2131974968);
            A0U.A09(2131974971);
            A0U.A08(2131974969);
            DbT.A1V(A0U);
        }
        AnonymousClass7TG.A0g(1Al.A01(userSession).A03(r3), "product_tagging_for_everyone_tagged_seller_dialog_impressions").apply();
    }
}
