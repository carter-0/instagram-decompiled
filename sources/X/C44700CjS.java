package X;

import java.io.IOException;

/* renamed from: X.CjS  reason: case insensitive filesystem */
public abstract class C44700CjS {
    public static AnonymousClass1e7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1e7 r1 = new AnonymousClass1e7();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("clip".equals(A17)) {
                    AnonymousClass77X parseFromJson = C45671D0w.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r1.A00 = parseFromJson;
                } else if ("emoji_reaction".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A01 = A0l;
                } else if (AnonymousClass000.A00(787).equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r4);
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
