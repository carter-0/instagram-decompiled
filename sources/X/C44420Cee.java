package X;

import com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cee  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44420Cee {
    public static Map A00(StoryPromptFailureTooltipDictIntf storyPromptFailureTooltipDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (storyPromptFailureTooltipDictIntf.B28() != null) {
            A1H.put("error_message_body", storyPromptFailureTooltipDictIntf.B28());
        }
        if (storyPromptFailureTooltipDictIntf.B29() != null) {
            A1H.put("error_message_title", storyPromptFailureTooltipDictIntf.B29());
        }
        return 0Yt.A0B(A1H);
    }
}
