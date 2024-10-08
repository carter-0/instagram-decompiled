package X;

import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

/* renamed from: X.9za  reason: invalid class name and case insensitive filesystem */
public abstract class C395329za {
    public static AnonymousClass1kZ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1kZ r1 = new AnonymousClass1kZ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("thread_key".equals(A17)) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A00 = parseFromJson;
                } else if (AnonymousClass000.A00(72).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A02 = A0l;
                } else if (AnonymousClass000.A00(1738).equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A05 = A0l2;
                } else if (AnonymousClass000.A00(1184).equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r1.A01 = A0l3;
                } else if (AnonymousClass000.A00(753).equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("message_id".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
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
