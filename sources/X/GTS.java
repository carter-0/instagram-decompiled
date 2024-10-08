package X;

import java.io.IOException;

public abstract class GTS {
    public static GTT parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            GTT gtt = new GTT();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("split_time".equals(A0q)) {
                    gtt.A00 = r3.A1D();
                } else if ("is_split_point_at_start".equals(A0q)) {
                    gtt.A02 = r3.A0d();
                } else if ("trimmed_duration_after_split".equals(A0q)) {
                    gtt.A01 = r3.A1D();
                }
                r3.A0z();
            }
            return gtt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
