package X;

import java.io.IOException;

/* renamed from: X.VHd  reason: case insensitive filesystem */
public abstract class C17081VHd {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VHc, java.lang.Object] */
    public static C17080VHc parseFromJson(16F r3) {
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
