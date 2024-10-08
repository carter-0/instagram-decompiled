package X;

import com.instagram.api.schemas.CommentAudienceControlType;
import com.instagram.api.schemas.MediaCommentAudienceControlType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Chb  reason: case insensitive filesystem */
public abstract class C44603Chb {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String str;
        UserSession A0B = C308206Td.A0B(r7);
        List list = r8.A00;
        Object obj = list.get(0);
        Object obj2 = null;
        if (obj instanceof String) {
            obj2 = obj;
        }
        Object obj3 = list.get(1);
        if (!(obj3 instanceof String) || (str = (String) obj3) == null) {
            User A01 = AnonymousClass0t1.A01.A01(A0B);
            CommentAudienceControlType commentAudienceControlType = (CommentAudienceControlType) CommentAudienceControlType.A01.get(obj2);
            if (commentAudienceControlType == null) {
                commentAudienceControlType = CommentAudienceControlType.UNRECOGNIZED;
            }
            A01.A03.EOU(commentAudienceControlType);
            return null;
        }
        1Xj A02 = 1E7.A00(A0B).A02(002.A0T(str, A0B.A06, '_'));
        if (A02 != null) {
            MediaCommentAudienceControlType mediaCommentAudienceControlType = (MediaCommentAudienceControlType) MediaCommentAudienceControlType.A01.get(obj2);
            if (mediaCommentAudienceControlType == null) {
                mediaCommentAudienceControlType = MediaCommentAudienceControlType.UNRECOGNIZED;
            }
            A02.A0C.Ed6(mediaCommentAudienceControlType);
        }
        return null;
    }
}
