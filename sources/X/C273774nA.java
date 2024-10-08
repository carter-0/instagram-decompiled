package X;

import java.io.IOException;

/* renamed from: X.4nA  reason: invalid class name and case insensitive filesystem */
public abstract class C273774nA {
    public static C273784nB parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C273784nB r0 = new C273784nB();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("beforeRenderBitrate".equals(A0q)) {
                    r0.A01 = r3.A1D();
                } else if ("afterRenderBitrate".equals(A0q)) {
                    r0.A00 = r3.A1D();
                }
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
