package X;

import java.io.IOException;

public abstract class A0F {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.A7n] */
    public static C39747A7n parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("fixed_height".equals(A17)) {
                    obj.A00 = LJ2.parseFromJson(r3);
                } else if ("fixed_height_still".equals(A17)) {
                    obj.A06 = LJ2.parseFromJson(r3);
                } else if ("fixed_height_downsampled".equals(A17)) {
                    obj.A01 = LJ2.parseFromJson(r3);
                } else if ("downsized".equals(A17)) {
                    obj.A02 = LJ2.parseFromJson(r3);
                } else if ("downsized_medium".equals(A17)) {
                    obj.A04 = LJ2.parseFromJson(r3);
                } else if ("downsized_large".equals(A17)) {
                    obj.A03 = LJ2.parseFromJson(r3);
                } else if ("original".equals(A17)) {
                    obj.A05 = LJ2.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
