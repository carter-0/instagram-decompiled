package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ChB  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44577ChB {
    public static Map A00(DT5 dt5) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dt5.getCommentId() != null) {
            A1H.put("comment_id", dt5.getCommentId());
        }
        if (dt5.getCommenterUsername() != null) {
            A1H.put("commenter_username", dt5.getCommenterUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
