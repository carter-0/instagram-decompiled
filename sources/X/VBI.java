package X;

import java.io.IOException;

public abstract class VBI {
    public static GSY parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            GSY gsy = new GSY();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("media_id".equals(A17)) {
                    gsy.A03 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3326).equals(A17)) {
                    gsy.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("editable".equals(A17)) {
                    gsy.A01 = AnonymousClass7TF.A0S(r3);
                } else if ("animatable".equals(A17)) {
                    gsy.A00 = AnonymousClass7TF.A0S(r3);
                }
                r3.A0z();
            }
            return gsy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
