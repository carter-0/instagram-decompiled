package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

public abstract class CjY {
    public static C66411mr parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66411mr r0 = new C66411mr();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A02 = parseFromJson;
                } else if ("generation_id".equals(A17)) {
                    r0.A00 = r4.A0y();
                } else if (C41845B3m.A1J(A17)) {
                    r0.A03 = AnonymousClass7TF.A0Z(r4);
                } else if ("preview_url".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r4);
                } else if (TraceFieldType.ContentType.equals(A17)) {
                    r0.A05 = AnonymousClass7TG.A0l(r4);
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
