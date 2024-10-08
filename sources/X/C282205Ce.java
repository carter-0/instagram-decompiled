package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.5Ce  reason: invalid class name and case insensitive filesystem */
public abstract class C282205Ce {
    public static final IGAIAgentType A00(String str) {
        IGAIAgentType iGAIAgentType = (IGAIAgentType) IGAIAgentType.A01.get(str);
        if (iGAIAgentType == null) {
            return IGAIAgentType.A07;
        }
        return iGAIAgentType;
    }
}
