package X;

import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;

/* renamed from: X.O2a  reason: case insensitive filesystem */
public abstract class C70322O2a {
    public static C69160Nfj parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C69160Nfj nfj = new C69160Nfj();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("hashtag".equals(A17)) {
                    HashtagImpl parseFromJson = C279594yt.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    nfj.A00 = parseFromJson;
                } else {
                    C66941Mfa.A01(r4, nfj, A17);
                }
                r4.A0z();
            }
            return nfj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
