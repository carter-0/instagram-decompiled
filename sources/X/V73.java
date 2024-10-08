package X;

import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.IGAIAgentType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V73 {
    public static Map A00(AiAgentMetadataDict aiAgentMetadataDict) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aiAgentMetadataDict.AaN() != null) {
            linkedHashMap.put("ai_agent_ent_fbid", aiAgentMetadataDict.AaN());
        }
        if (aiAgentMetadataDict.AaT() != null) {
            linkedHashMap.put("ai_agent_persona_fbid", aiAgentMetadataDict.AaT());
        }
        if (aiAgentMetadataDict.AaX() != null) {
            IGAIAgentType AaX = aiAgentMetadataDict.AaX();
            if (AaX != null) {
                str = AaX.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("ai_agent_type", str);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
