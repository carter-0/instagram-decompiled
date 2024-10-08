package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

public abstract class VGA {
    public static C17262VOp parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17262VOp vOp = new C17262VOp();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("thumbnail_uri".equals(AnonymousClass7TE.A17(r4))) {
                    SimpleImageUrl A00 = 16h.A00(r4);
                    0qQ.A0B(A00, 0);
                    vOp.A00 = A00;
                }
                r4.A0z();
            }
            return vOp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
