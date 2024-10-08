package X;

import java.io.IOException;

/* renamed from: X.8vt  reason: invalid class name and case insensitive filesystem */
public abstract class C370138vt {
    public static C366638pQ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C366638pQ r0 = new C366638pQ();
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
