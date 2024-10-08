package X;

import java.io.IOException;

/* renamed from: X.CrP  reason: case insensitive filesystem */
public abstract class C45162CrP {
    public static C45326CuU parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45326CuU cuU = new C45326CuU();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("music_canonical_id".equals(A17)) {
                    r3.A0y();
                } else if ("music_info".equals(A17)) {
                    cuU.A00 = 1dj.parseFromJson(r3);
                } else if ("original_sound_info".equals(A17)) {
                    cuU.A01 = 1dk.parseFromJson(r3);
                }
                r3.A0z();
            }
            return cuU;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
