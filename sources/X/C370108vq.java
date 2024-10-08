package X;

import java.io.IOException;

/* renamed from: X.8vq  reason: invalid class name and case insensitive filesystem */
public abstract class C370108vq {
    public static AnonymousClass9IE parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass9IE r0 = new AnonymousClass9IE(6);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("reel_more_options_model".equals(A0q)) {
                    r0.A00 = C370118vr.parseFromJson(r3);
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
