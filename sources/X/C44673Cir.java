package X;

import java.io.IOException;

/* renamed from: X.Cir  reason: case insensitive filesystem */
public abstract class C44673Cir {
    public static C45212CsP parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            A5L a5l = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "nicknames")) {
                    a5l = C44670Cio.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (a5l != null || !(r5 instanceof 0c9)) {
                return new C45212CsP(a5l);
            }
            AnonymousClass7TF.A1L("nicknames", r5, "DirectNicknameUpdate");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
