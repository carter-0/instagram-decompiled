package X;

import java.io.IOException;

/* renamed from: X.CkI  reason: case insensitive filesystem */
public abstract class C44749CkI {
    public static BIT parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Integer num = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "shape")) {
                    num = AnonymousClass7TF.A0X(r5);
                }
                r5.A0z();
            }
            if (num != null || !(r5 instanceof 0c9)) {
                return new BIT(num.intValue());
            }
            AnonymousClass7TF.A1L("shape", r5, "PotatoItemMediaInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
