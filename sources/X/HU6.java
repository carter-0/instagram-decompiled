package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HU6 {
    public static Map A00(TextAppSearchDiscussionTopic textAppSearchDiscussionTopic) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (textAppSearchDiscussionTopic.B4l() != null) {
            A1H.put("fbid", textAppSearchDiscussionTopic.B4l());
        }
        if (textAppSearchDiscussionTopic.BGL() != null) {
            A1H.put("image_url", textAppSearchDiscussionTopic.BGL());
        }
        if (textAppSearchDiscussionTopic.BSr() != null) {
            A1H.put(C273654mx.A00(3031), textAppSearchDiscussionTopic.BSr());
        }
        if (textAppSearchDiscussionTopic.BxS() != null) {
            A1H.put(C273654mx.A00(3357), textAppSearchDiscussionTopic.BxS());
        }
        if (textAppSearchDiscussionTopic.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, textAppSearchDiscussionTopic.getTitle());
        }
        return 0Yt.A0B(A1H);
    }
}
