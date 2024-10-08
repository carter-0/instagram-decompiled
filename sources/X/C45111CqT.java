package X;

import java.io.IOException;

/* renamed from: X.CqT  reason: case insensitive filesystem */
public abstract class C45111CqT {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.CU3, java.lang.Object] */
    public static CU3 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CU0 cu0 = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C45107CqP cqP = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("giphy_gifs".equals(A17)) {
                    cu0 = C45109CqR.parseFromJson(r4);
                } else if ("cutout_stickers".equals(A17)) {
                    cqP = C45108CqQ.parseFromJson(r4);
                }
                r4.A0z();
            }
            ? obj = new Object();
            obj.A01 = cu0;
            obj.A00 = cqP;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
