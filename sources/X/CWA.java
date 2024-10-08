package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CWA {
    public static Map A00(DU7 du7) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        User BZ1 = du7.BZ1();
        if (BZ1 != null) {
            A1H.put("original_comment_author", BZ1.A08());
        }
        if (du7.getOriginalCommentId() != null) {
            A1H.put("original_comment_id", du7.getOriginalCommentId());
        }
        if (du7.getOriginalCommentText() != null) {
            A1H.put("original_comment_text", du7.getOriginalCommentText());
        }
        if (du7.getOriginalMediaId() != null) {
            A1H.put("original_media_id", du7.getOriginalMediaId());
        }
        return 0Yt.A0B(A1H);
    }
}
