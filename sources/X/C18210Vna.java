package X;

import java.io.IOException;

/* renamed from: X.Vna  reason: case insensitive filesystem */
public final class C18210Vna {
    public static C15631Ufx parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C15631Ufx ufx = new C15631Ufx();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("__typename".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if (C41845B3m.A17(A17)) {
                    ufx.A01 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A19(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("survey_session".equals(A17)) {
                    ufx.A00 = VE4.parseFromJson(r3);
                }
                r3.A0z();
            }
            return ufx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
