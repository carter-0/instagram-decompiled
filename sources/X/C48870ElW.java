package X;

import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* renamed from: X.ElW  reason: case insensitive filesystem */
public abstract class C48870ElW {
    public static C65891hh parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C65891hh r0 = new C65891hh();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else if ("session_id_from_call".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r0.A01 = str;
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
