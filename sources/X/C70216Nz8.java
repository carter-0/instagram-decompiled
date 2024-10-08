package X;

import java.io.IOException;

/* renamed from: X.Nz8  reason: case insensitive filesystem */
public abstract class C70216Nz8 {
    public static 1k3 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1k3 r0 = new 1k3();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("note_reply".equals(A17)) {
                    C55775HnA parseFromJson = C54950HZg.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else if ("direct_pending_media".equals(A17)) {
                    C300925yB parseFromJson2 = LJH.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    r0.A01 = parseFromJson2;
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
