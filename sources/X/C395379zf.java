package X;

import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* renamed from: X.9zf  reason: invalid class name and case insensitive filesystem */
public abstract class C395379zf {
    public static C66311lu parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66311lu r1 = new C66311lu();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A01 = parseFromJson;
                } else if ("message_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A04 = A0l;
                } else if (AnonymousClass000.A00(3706).equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A02 = A0l2;
                } else if ("edited_text".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r1.A03 = A0l3;
                } else if ("edit_count".equals(A17)) {
                    r1.A00 = r4.A1D();
                } else if ("is_ae".equals(A17)) {
                    r1.A06 = r4.A0d();
                } else if ("is_ae_open_eb".equals(A17)) {
                    r1.A05 = r4.A0d();
                } else {
                    C66670Mad.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
