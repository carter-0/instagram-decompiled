package X;

import java.io.IOException;

/* renamed from: X.VCa  reason: case insensitive filesystem */
public abstract class C16948VCa {
    public static VNU parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            VNU vnu = new VNU();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("uri".equals(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vnu.A00 = str;
                }
                r3.A0z();
            }
            return vnu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
