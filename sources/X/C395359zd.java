package X;

import java.io.IOException;

/* renamed from: X.9zd  reason: invalid class name and case insensitive filesystem */
public abstract class C395359zd {
    public static AnonymousClass1jz parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1jz r0 = new AnonymousClass1jz();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("note_reply".equals(A17)) {
                    C39798A9t parseFromJson = C39825AAw.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
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
