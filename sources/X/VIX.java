package X;

import java.io.IOException;

public abstract class VIX {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.6th, java.lang.Object] */
    public static C321176th parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("shadow_layer_radius".equals(A17)) {
                    obj.A02 = (float) r4.A0U();
                } else if ("shadow_layer_dx".equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("shadow_layer_dy".equals(A17)) {
                    obj.A01 = (float) r4.A0U();
                } else if ("shadow_layer_color".equals(A17)) {
                    obj.A03 = r4.A1D();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
