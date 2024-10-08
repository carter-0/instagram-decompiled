package X;

import java.io.IOException;

public abstract class VCB {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VY2, java.lang.Object] */
    public static VY2 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("selection_text".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("first_option_text".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("second_option_text".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("skip_text".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
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
