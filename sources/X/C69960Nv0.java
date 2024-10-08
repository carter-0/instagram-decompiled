package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Nv0  reason: case insensitive filesystem */
public abstract class C69960Nv0 {
    public static final boolean A00(UserSession userSession, AnonymousClass2Ep r4) {
        IGAIAgentType iGAIAgentType;
        IGAIAgentType iGAIAgentType2;
        0Tu r2;
        long j;
        0qQ.A0B(userSession, 1);
        if (r4.CXW()) {
            r2 = 0Tu.A05;
            j = 36325742468609207L;
        } else {
            User BZK = r4.BZK();
            if (BZK != null) {
                iGAIAgentType = BZK.A03.AaX();
            } else {
                iGAIAgentType = null;
            }
            if (iGAIAgentType == IGAIAgentType.A05) {
                r2 = 0Tu.A05;
                j = 36325742468674744L;
            } else {
                User BZK2 = r4.BZK();
                if (BZK2 != null) {
                    iGAIAgentType2 = BZK2.A03.AaX();
                } else {
                    iGAIAgentType2 = null;
                }
                if (iGAIAgentType2 != IGAIAgentType.A08) {
                    return true;
                }
                r2 = 0Tu.A05;
                j = 36325742468740281L;
            }
        }
        return 182.A06(r2, userSession, j);
    }
}
