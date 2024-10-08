package X;

import com.instagram.api.schemas.GenAIMessagingData;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CY0 {
    public static Map A00(GenAIMessagingData genAIMessagingData) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (genAIMessagingData.AhB() != null) {
            A1H.put("bot_id", genAIMessagingData.AhB());
        }
        if (genAIMessagingData.C6C() != null) {
            A1H.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, genAIMessagingData.C6C());
        }
        return 0Yt.A0B(A1H);
    }
}
