package X;

import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;
import java.io.IOException;

public abstract class V8S {
    public static C15063UNg parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("discussion_info".equals(A17)) {
                    textAppSearchDiscussionTopicImpl = C274304o3.parseFromJson(r7);
                } else if (C273654mx.A00(933).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if (C273654mx.A00(934).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("trending_keyword".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new C15063UNg(textAppSearchDiscussionTopicImpl, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
