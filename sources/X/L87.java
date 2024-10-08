package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class L87 {
    public final MediaCommentListRepository A00;
    public final String A01;
    public final Map A02 = AnonymousClass7TE.A1H();
    public final UserSession A03;

    public L87(MediaCommentListRepository mediaCommentListRepository, UserSession userSession, String str) {
        this.A03 = userSession;
        this.A01 = str;
        this.A00 = mediaCommentListRepository;
    }
}
