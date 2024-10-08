package X;

import java.io.IOException;

/* renamed from: X.VnZ  reason: case insensitive filesystem */
public final class C18209VnZ {
    public static C15630Ufw parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C15630Ufw ufw = new C15630Ufw();
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
                    ufw.A01 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A19(A17)) {
                    if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                } else if ("survey_flow".equals(A17)) {
                    ufw.A00 = C18207VnX.parseFromJson(r3);
                }
                r3.A0z();
            }
            return ufw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
