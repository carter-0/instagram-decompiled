package X;

import java.io.IOException;

public abstract class VD8 {
    public static C17236VNo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17236VNo vNo = new C17236VNo();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("top_posts".equals(AnonymousClass7TE.A17(r3))) {
                    vNo.A00 = VD7.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
