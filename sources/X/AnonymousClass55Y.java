package X;

import java.io.IOException;

/* renamed from: X.55Y  reason: invalid class name */
public abstract class AnonymousClass55Y {
    public static AnonymousClass55Z parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass55Z r1 = new AnonymousClass55Z();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("sub_share_id".equals(A0q)) {
                    r1.A00 = r3.A1D();
                } else if ("is_configured_in_server".equals(A0q)) {
                    r1.A03 = r3.A0d();
                } else if ("clips_share_preview_to_feed".equals(A0q)) {
                    r1.A05 = r3.A0d();
                } else if ("cover_photo_square_crop".equals(A0q)) {
                    r1.A01 = 1qm.parseFromJson(r3);
                } else if (AnonymousClass000.A00(621).equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r1.A02 = str;
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
