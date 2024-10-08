package X;

import java.io.IOException;

/* renamed from: X.Nyh  reason: case insensitive filesystem */
public abstract class C70189Nyh {
    public static C66171kO parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66171kO r0 = new C66171kO();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("optimistic_admin_text".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("send_prompt_message_mutation".equals(A17)) {
                    r0.A01 = OQW.parseFromJson(r4);
                } else if ("prompt_text".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("button_text".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A02 = A0l;
                } else if ("contribution_count".equals(A17)) {
                    r0.A00 = r4.A1D();
                } else {
                    OQV.A01(r4, r0, A17);
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
