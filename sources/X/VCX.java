package X;

import java.io.IOException;

public abstract class VCX {
    public static VNS parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VNS vns = new VNS();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("has_ig_avatar".equals(AnonymousClass7TE.A17(r3))) {
                    vns.A00 = r3.A0d();
                }
                r3.A0z();
            }
            return vns;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
