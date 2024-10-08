package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Me8  reason: case insensitive filesystem */
public final class C66872Me8 implements C74410PuQ {
    public final /* synthetic */ C66870Me6 A00;

    public final String AUf(UserSession userSession) {
        return "sender is restricted";
    }

    public C66872Me8(C66870Me6 me6) {
        this.A00 = me6;
    }

    public final /* bridge */ /* synthetic */ boolean ASy(UserSession userSession, Object obj) {
        2Eq r1;
        User CCf;
        C66871Me7 me7 = (C66871Me7) obj;
        AnonymousClass7TG.A1N(me7, userSession);
        String str = me7.A06;
        if (str == null || (r1 = (2Eq) this.A00.A02.invoke(userSession, str)) == null || (CCf = r1.CCf(me7.A05)) == null || !CCf.isRestricted()) {
            return true;
        }
        return false;
    }
}
