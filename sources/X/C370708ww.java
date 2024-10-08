package X;

import java.io.IOException;

/* renamed from: X.8ww  reason: invalid class name and case insensitive filesystem */
public abstract class C370708ww {
    public static C376579In parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C376579In r0 = new C376579In();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("ad_ig_media_id".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r0.A00 = str;
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
