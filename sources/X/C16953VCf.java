package X;

import java.io.IOException;

/* renamed from: X.VCf  reason: case insensitive filesystem */
public abstract class C16953VCf {
    public static VNW parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            VNW vnw = new VNW();
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
                    vnw.A00 = str;
                }
                r3.A0z();
            }
            return vnw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
