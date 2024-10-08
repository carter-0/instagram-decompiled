package X;

import com.instagram.common.session.UserSession;

public final class MeI implements C74410PuQ {
    public final /* synthetic */ C66870Me6 A00;

    public final String AUf(UserSession userSession) {
        return "thread system folder is pending";
    }

    public MeI(C66870Me6 me6) {
        this.A00 = me6;
    }

    public final /* bridge */ /* synthetic */ boolean ASy(UserSession userSession, Object obj) {
        2EN r2;
        AnonymousClass2Es r0;
        C66871Me7 me7 = (C66871Me7) obj;
        AnonymousClass7TG.A1N(me7, userSession);
        String str = me7.A06;
        if (str == null || (r0 = (AnonymousClass2Es) this.A00.A02.invoke(userSession, str)) == null) {
            r2 = null;
        } else {
            r2 = r0.C3d();
        }
        if (r2 == null || (r2 != 2EN.A06 && r2 != 2EN.A07)) {
            return true;
        }
        return false;
    }
}
