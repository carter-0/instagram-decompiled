package X;

import com.instagram.api.schemas.RingSpecPointImpl;
import java.io.IOException;

/* renamed from: X.Cd8  reason: case insensitive filesystem */
public abstract class C44326Cd8 {
    public static RingSpecPointImpl parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Float f = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Float f2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("x".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r7);
                } else if ("y".equals(A17)) {
                    f2 = AnonymousClass7TF.A0V(r7);
                }
                r7.A0z();
            }
            if (f == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("x", r7, "RingSpecPointImpl");
            } else if (f2 != null || !(r7 instanceof 0c9)) {
                return new RingSpecPointImpl(f.floatValue(), f2.floatValue());
            } else {
                AnonymousClass7TF.A1L("y", r7, "RingSpecPointImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
