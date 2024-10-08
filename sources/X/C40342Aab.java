package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Aab  reason: case insensitive filesystem */
public final class C40342Aab implements C358538b4 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C387549mO A01;

    public final /* synthetic */ void DIL() {
    }

    public final /* synthetic */ void DIN(C387339m3 r1) {
    }

    public final /* synthetic */ void DLf() {
    }

    public final void DRH(User user, int i) {
        User user2 = user;
        boolean A2G = user.A2G();
        C387549mO r0 = this.A01;
        if (!A2G) {
            FGc.A03(r0.A07, r0.A09, user, (C336187eD) null, "story");
            UserSession userSession = this.A00;
            C49241Erk.A00(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), userSession, user2, "story", "click", AnonymousClass000.A00(84));
            return;
        }
        C387549mO.A02(r0, user);
    }

    public C40342Aab(UserSession userSession, C387549mO r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }
}
