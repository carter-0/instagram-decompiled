package X;

import java.io.IOException;

public abstract class VCG {
    public static VNP parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VNP vnp = new VNP();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("node".equals(AnonymousClass7TE.A17(r3))) {
                    vnp.A00 = VCF.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vnp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
