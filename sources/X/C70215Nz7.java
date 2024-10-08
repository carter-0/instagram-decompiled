package X;

import java.io.IOException;

/* renamed from: X.Nz7  reason: case insensitive filesystem */
public abstract class C70215Nz7 {
    public static C66151k7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66151k7 r0 = new C66151k7();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("direct_voice_media".equals(A17)) {
                    C2609947v parseFromJson = C2609847u.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A00 = parseFromJson;
                } else if ("note_reply".equals(A17)) {
                    N2G parseFromJson2 = C70264Nzu.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    r0.A01 = parseFromJson2;
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
