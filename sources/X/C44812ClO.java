package X;

import java.io.IOException;

/* renamed from: X.ClO  reason: case insensitive filesystem */
public abstract class C44812ClO {
    public static C61078JwG parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C61078JwG jwG = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "body")) {
                    jwG = C44811ClN.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (jwG != null || !(r5 instanceof 0c9)) {
                return new C61078JwG(jwG, 29);
            }
            AnonymousClass7TF.A1L("body", r5, "MwcRtcAppMessages");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
