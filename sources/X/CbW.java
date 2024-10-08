package X;

import java.io.IOException;

public abstract class CbW {
    public static C42059BFm parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C61111JxN jxN = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "playlist")) {
                    jxN = CbU.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (jxN != null || !(r5 instanceof 0c9)) {
                return new C42059BFm(jxN);
            }
            AnonymousClass7TF.A1L("playlist", r5, "Playlist");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
