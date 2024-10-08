package X;

import java.io.IOException;

/* renamed from: X.Kvl  reason: case insensitive filesystem */
public abstract class C63364Kvl {
    public static LM7 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Boolean bool = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "is_optimistic_upload")) {
                    bool = AnonymousClass7TF.A0S(r5);
                }
                r5.A0z();
            }
            if (bool != null || !(r5 instanceof 0c9)) {
                return new LM7(bool.booleanValue());
            }
            AnonymousClass7TF.A1L("is_optimistic_upload", r5, "DirectPendingMediaUploadParams");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
