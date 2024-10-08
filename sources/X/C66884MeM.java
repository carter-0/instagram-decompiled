package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.MeM  reason: case insensitive filesystem */
public final class C66884MeM implements C74410PuQ {
    public final /* synthetic */ C66870Me6 A00;

    public final String AUf(UserSession userSession) {
        return "message is from creator ai";
    }

    public C66884MeM(C66870Me6 me6) {
        this.A00 = me6;
    }

    public final /* bridge */ /* synthetic */ boolean ASy(UserSession userSession, Object obj) {
        2Eq r1;
        User CCf;
        C66871Me7 me7 = (C66871Me7) obj;
        AnonymousClass7TG.A1N(me7, userSession);
        String str = me7.A06;
        if (str == null || (r1 = (2Eq) this.A00.A02.invoke(userSession, str)) == null || (CCf = r1.CCf(me7.A05)) == null || CCf.A03.AaX() != IGAIAgentType.A04) {
            return true;
        }
        return false;
    }
}
