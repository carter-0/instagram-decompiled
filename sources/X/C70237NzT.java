package X;

import java.io.IOException;

/* renamed from: X.NzT  reason: case insensitive filesystem */
public abstract class C70237NzT {
    public static C65951iP parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65951iP r0 = new C65951iP();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("thead_key".equals(A17)) {
                    r0.A01 = C254733sx.parseFromJson(r3);
                } else if ("message_id".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("selected_option_index".equals(A17)) {
                    r0.A00 = r3.A1D();
                } else if ("client_context".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else {
                    C66670Mad.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
