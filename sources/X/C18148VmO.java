package X;

import java.io.IOException;

/* renamed from: X.VmO  reason: case insensitive filesystem */
public final class C18148VmO {
    public static UXS parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("edit_promoted_post_response_success".equals(A17)) {
                    r0.A01 = r3.A0d();
                } else if ("error".equals(A17)) {
                    r0.A00 = C44284CcS.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
