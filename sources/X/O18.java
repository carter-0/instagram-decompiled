package X;

import com.instagram.model.direct.HighlightRange;
import java.io.IOException;

public abstract class O18 {
    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.model.direct.HighlightRange, java.lang.Object] */
    public static HighlightRange parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Integer num = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("offset".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else {
                    num2 = C41847B3o.A13(r4, num2, A17, "length");
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (num != null) {
                obj.A02 = num.intValue();
            }
            if (num2 != null) {
                obj.A01 = num2.intValue();
            }
            obj.A00 = (obj.A02 + obj.A01) - 1;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
