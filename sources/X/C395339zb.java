package X;

import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* renamed from: X.9zb  reason: invalid class name and case insensitive filesystem */
public abstract class C395339zb {
    public static AnonymousClass1er parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1er r1 = new AnonymousClass1er();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(72).equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("media_id".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("response_id".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A01 = parseFromJson;
                } else if (AnonymousClass000.A00(4098).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A05 = A0l;
                } else if ("replied_to_message".equals(A17)) {
                    r1.A00 = C254933tI.A00(r4);
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
