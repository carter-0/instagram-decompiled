package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FiT  reason: case insensitive filesystem */
public final class C50787FiT implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        User user;
        UserSession userSession = this.A01;
        AccountFamily A09 = Dba.A09(AnonymousClass9BG.A01(userSession), userSession);
        if (A09 == null || (user = A09.A01) == null || user.A03.BBn() != HasPasswordState.FALSE) {
            F2W f2w = new F2W(userSession);
            if (!(A09 == null || A09.A04.size() == 0)) {
                String A0q = DbS.A0q(A09.A04.get(0));
                UserSession userSession2 = f2w.A04;
                1NY A0N = DbU.A0N(userSession2);
                A0N.A0A("multiple_accounts/unlink_from_main_accounts/");
                A0N.A0R(1XP.class, 1XY.class);
                1ES.A06(DbT.A0T(A0N, "main_account_ids", A0q), 245, false);
                AnonymousClass9BE.A00(userSession2).A01();
            }
            DbS.A0M(this.A00, userSession).A0G((String) null, 0);
            return;
        }
        Bundle A092 = DbY.A09(userSession);
        A092.putBoolean("is_interstitial", true);
        E4W e4w = new E4W();
        e4w.setArguments(A092);
        DbZ.A18(e4w, this.A00, userSession);
    }

    public C50787FiT(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
