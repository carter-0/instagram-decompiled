package X;

import java.io.IOException;

/* renamed from: X.Ktz  reason: case insensitive filesystem */
public abstract class C63254Ktz {
    public static 1kF parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1kF r0 = new 1kF();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("note_reply".equals(A17)) {
                    C45416Cvw parseFromJson = C44651CiV.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A01 = parseFromJson;
                } else if ("avatar_sticker".equals(A17)) {
                    C317966o8 parseFromJson2 = C369258u7.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    r0.A00 = parseFromJson2;
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
