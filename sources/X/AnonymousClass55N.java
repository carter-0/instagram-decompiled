package X;

import java.io.IOException;

/* renamed from: X.55N  reason: invalid class name */
public abstract class AnonymousClass55N {
    public static AnonymousClass55O parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass55O r0 = new AnonymousClass55O();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                16P.A02(r3);
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
