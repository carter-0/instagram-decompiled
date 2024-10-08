package X;

import java.io.IOException;

public abstract class V7Q {
    public static UN5 parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            Integer num = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("bottom_right_x_pct".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("bottom_right_y_pct".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r6);
                } else if ("top_left_x_pct".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r6);
                } else {
                    num4 = C41847B3o.A13(r6, num4, A17, "top_left_y_pct");
                }
                r6.A0z();
            }
            return new UN5(num, num2, num3, num4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
