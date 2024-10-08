package X;

import java.io.IOException;

/* renamed from: X.VAl  reason: case insensitive filesystem */
public abstract class C16908VAl {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VMc, java.lang.Object] */
    public static C17198VMc parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("camera_effects_query".equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = VCY.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
