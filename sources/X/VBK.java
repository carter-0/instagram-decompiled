package X;

import java.io.IOException;

public abstract class VBK {
    public static UVC parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("start_position".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if ("length".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r6);
                } else if ("image_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new UVC(num, num2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
