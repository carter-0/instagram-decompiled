package X;

import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* renamed from: X.CjR  reason: case insensitive filesystem */
public abstract class C44699CjR {
    public static C65401c9 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65401c9 r0 = new C65401c9();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A01 = parseFromJson;
                } else if ("clip".equals(A17)) {
                    AnonymousClass77X parseFromJson2 = C45671D0w.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    r0.A00 = parseFromJson2;
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
