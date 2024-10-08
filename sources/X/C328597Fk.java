package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.user.model.User;

/* renamed from: X.7Fk  reason: invalid class name and case insensitive filesystem */
public abstract class C328597Fk {
    public static final String A00(AnonymousClass7LQ r3) {
        IGAIAgentType iGAIAgentType;
        User user;
        User user2 = r3.A0K;
        if (user2 == null || user2.A03.AaX() == null) {
            return null;
        }
        User user3 = r3.A0K;
        if (user3 != null) {
            iGAIAgentType = user3.A03.AaX();
        } else {
            iGAIAgentType = null;
        }
        if (iGAIAgentType == IGAIAgentType.A07 || (user = r3.A0K) == null) {
            return null;
        }
        return AnonymousClass3ZA.A00(user);
    }
}
