package X;

import java.io.IOException;

public abstract class VD9 {
    public static C17237VNp parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17237VNp vNp = new C17237VNp();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("top_posts_unit".equals(AnonymousClass7TE.A17(r3))) {
                    vNp.A00 = VD8.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
