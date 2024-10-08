package X;

import com.instagram.api.schemas.AiAgentMetadataDictImpl;
import com.instagram.api.schemas.IGAIAgentType;
import java.io.IOException;

public abstract class V74 {
    public static AiAgentMetadataDictImpl parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            IGAIAgentType iGAIAgentType = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("ai_agent_ent_fbid".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("ai_agent_persona_fbid".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                } else if ("ai_agent_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    iGAIAgentType = C282205Ce.A00(str);
                }
                r6.A0z();
            }
            return new AiAgentMetadataDictImpl(iGAIAgentType, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
