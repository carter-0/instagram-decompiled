package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mc0  reason: case insensitive filesystem */
public final class C66755Mc0 extends C392289uY {
    public C331157Pu A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final UserSession A03;

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r4, boolean z) {
        0qQ.A0B(puH, 1);
        puH.onFailure();
    }

    public final void A04(boolean z) {
        if (!this.A01) {
            C331127Pr A0W = DbS.A0W(this.A03);
            ERX erx = new ERX();
            FragmentActivity fragmentActivity = this.A02;
            A0W.A0g = fragmentActivity.getString(2131969716);
            A0W.A1J = true;
            A0W.A0K = new C71402Ok1((Object) this, 18);
            A0W.A0h = fragmentActivity.getString(2131960296);
            A0W.A1N = true;
            A0W.A0L = new C71402Ok1((Object) this, 19);
            A0W.A0b = fragmentActivity.getString(2131969717);
            A0W.A0U = new C72959PQr(this, 18);
            A0W.A1P = true;
            C331157Pu A002 = A0W.A00();
            this.A00 = A002;
            A002.A02(fragmentActivity, erx);
            C331157Pu r0 = this.A00;
            if (r0 != null && r0.A0S()) {
                this.A01 = true;
            }
        }
    }

    public final boolean A05() {
        return this.A01;
    }

    public C66755Mc0(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A02 = fragmentActivity;
        this.A03 = userSession;
    }

    public final View A06(Context context) {
        return C66584MXp.A09(context);
    }
}
