package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fng  reason: case insensitive filesystem */
public final class C51050Fng implements G8B {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C307896Rx A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ C277014uI A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ String A07;

    public final void CyN() {
    }

    public final void Doy() {
    }

    public C51050Fng(Activity activity, AnonymousClass0iw r2, C307896Rx r3, C277014uI r4, C277014uI r5, UserSession userSession, User user, String str) {
        this.A05 = userSession;
        this.A01 = r2;
        this.A06 = user;
        this.A07 = str;
        this.A02 = r3;
        this.A04 = r4;
        this.A00 = activity;
        this.A03 = r5;
    }

    public final void D5S() {
        UserSession userSession = this.A05;
        C49815F8c.A00(this.A01, userSession, "block_confirm", userSession.A06, this.A06.getId(), this.A07);
    }

    public final void DED() {
        C277014uI r0;
        C307896Rx r1 = this.A02;
        if (r1 != null && (r0 = this.A03) != null) {
            DbS.A1Q(r1, r0);
        }
    }

    public final void onCancel() {
        UserSession userSession = this.A05;
        C49815F8c.A00(this.A01, userSession, "block_cancel", userSession.A06, this.A06.getId(), this.A07);
    }

    public final void onSuccess() {
        C277014uI r0;
        C307896Rx r1 = this.A02;
        if (r1 == null || (r0 = this.A04) == null) {
            if (this.A06.CPV()) {
                DbU.A0z(this.A00, 2131953900);
            }
            C49960FGs.A03(this.A00);
            return;
        }
        DbS.A1Q(r1, r0);
    }
}
