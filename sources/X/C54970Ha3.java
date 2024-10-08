package X;

import java.io.IOException;

/* renamed from: X.Ha3  reason: case insensitive filesystem */
public abstract class C54970Ha3 {
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.5tx] */
    public static C298745tx parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1Xj r1 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "media")) {
                    r1 = 1Xj.A00(r5);
                }
                r5.A0z();
            }
            if (r1 != null || !(r5 instanceof 0c9)) {
                0qQ.A0B(r1, 1);
                ? obj = new Object();
                obj.A00 = r1;
                return obj;
            }
            AnonymousClass7TF.A1L("media", r5, "IGTVMedia");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
