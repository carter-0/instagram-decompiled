package X;

import java.io.IOException;

/* renamed from: X.Nzg  reason: case insensitive filesystem */
public abstract class C70250Nzg {
    public static C66341mG parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66341mG r0 = new C66341mG();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C66580MXl.A1Z(A17)) {
                    r0.A01 = C66580MXl.A0h(r4);
                } else if ("nudge".equals(A17)) {
                    AnonymousClass9IM parseFromJson = AnonymousClass3U6.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else {
                    C66670Mad.A01(r4, r0, A17);
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
