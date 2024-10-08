package X;

import java.io.IOException;

public abstract class OQU {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.OCA, java.lang.Object] */
    public static OCA parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("post_link".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("comment_id".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, OCA oca) {
        r2.A0c();
        String str = oca.A01;
        if (str != null) {
            r2.A0R("post_link", str);
        }
        String str2 = oca.A00;
        if (str2 != null) {
            r2.A0R("comment_id", str2);
        }
        r2.A0Z();
    }
}
