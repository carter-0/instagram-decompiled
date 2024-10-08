package X;

import java.io.IOException;

/* renamed from: X.VGg  reason: case insensitive filesystem */
public abstract class C17058VGg {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VTa, java.lang.Object] */
    public static C17373VTa parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("continue_shopping_row".equals(A17)) {
                    obj.A01 = VF0.parseFromJson(r3);
                } else if ("brand_tile_hscroll".equals(A17)) {
                    obj.A00 = CnC.parseFromJson(r3);
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
