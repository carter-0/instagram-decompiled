package X;

import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* renamed from: X.CjU  reason: case insensitive filesystem */
public abstract class C44702CjU {
    public static C65621em parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65621em r1 = new C65621em();
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
                } else if ("comment_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A02 = A0l;
                } else if (C41845B3m.A1A(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("pending_xma".equals(A17)) {
                    r1.A00 = Cm3.parseFromJson(r4);
                } else if (AnonymousClass000.A00(699).equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A18(A17)) {
                    r1.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("media_code".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("send_as_quoted_reply".equals(A17)) {
                    r1.A07 = r4.A0d();
                } else {
                    C66893Meb.A01(r4, r1, A17);
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
