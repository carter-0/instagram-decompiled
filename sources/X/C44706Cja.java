package X;

import java.io.IOException;

/* renamed from: X.Cja  reason: case insensitive filesystem */
public abstract class C44706Cja {
    public static 1dq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1dq r0 = new 1dq();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("direct_media_share".equals(A17)) {
                    AnonymousClass9JI parseFromJson = C45673D0y.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else {
                    C66893Meb.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
