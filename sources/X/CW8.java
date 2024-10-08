package X;

import com.instagram.api.schemas.CommentPrompt;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CW8 {
    public static Map A00(CommentPrompt commentPrompt) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (commentPrompt.BaV() != null) {
            A1H.put("parent_comment_id", commentPrompt.BaV());
        }
        if (commentPrompt.BmI() != null) {
            A1H.put("reply_count", commentPrompt.BmI());
        }
        return 0Yt.A0B(A1H);
    }
}
