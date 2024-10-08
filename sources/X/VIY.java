package X;

import java.io.IOException;

public abstract class VIY {
    public static C19473WaL parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C19473WaL waL = new C19473WaL();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("sticker_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    waL.A04 = A0l;
                } else if ("image_file_path".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    waL.A05 = A0l2;
                } else if ("rect_left".equals(A17)) {
                    waL.A01 = r4.A1D();
                } else if ("rect_top".equals(A17)) {
                    waL.A03 = r4.A1D();
                } else if ("rect_right".equals(A17)) {
                    waL.A02 = r4.A1D();
                } else if ("rect_bottom".equals(A17)) {
                    waL.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return waL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
