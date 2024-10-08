package X;

import java.io.IOException;

public abstract class XWU {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.1ux, java.lang.Object] */
    public static 1ux parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                16P.A02(r3);
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
