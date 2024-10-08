package X;

import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Cny  reason: case insensitive filesystem */
public abstract class C44964Cny {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.EbD] */
    public static C48232EbD parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            User user = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            HashtagImpl hashtagImpl = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C41845B3m.A1B(A17)) {
                    user = C41845B3m.A0a(r5, false);
                } else if ("hashtag".equals(A17)) {
                    hashtagImpl = C279594yt.parseFromJson(r5);
                }
                r5.A0z();
            }
            ? obj = new Object();
            obj.A01 = user;
            obj.A00 = hashtagImpl;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
