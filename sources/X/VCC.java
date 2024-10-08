package X;

import java.io.IOException;

public abstract class VCC {
    public static C17431VVk parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17431VVk vVk = new C17431VVk();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("base_url".equals(A17)) {
                    vVk.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("logging_token".equals(A17)) {
                    vVk.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("sources".equals(A17)) {
                    vVk.A02 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vVk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
