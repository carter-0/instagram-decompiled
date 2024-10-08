package X;

import com.instagram.direct.model.comments.DirectMessageComments;
import java.io.IOException;

/* renamed from: X.4wc  reason: invalid class name and case insensitive filesystem */
public abstract class C278284wc {
    public static DirectMessageComments parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            DirectMessageComments directMessageComments = new DirectMessageComments();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("comment_count".equals(A0q)) {
                    directMessageComments.A00 = r4.A1D();
                } else if ("facade_media_id".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    directMessageComments.A01 = str;
                }
                r4.A0z();
            }
            return directMessageComments;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
