package X;

import java.io.IOException;

/* renamed from: X.VEb  reason: case insensitive filesystem */
public abstract class C17001VEb {
    public static VOU parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            VOU vou = new VOU();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("after_media_id".equals(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vou.A00 = str;
                }
                r3.A0z();
            }
            return vou;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
