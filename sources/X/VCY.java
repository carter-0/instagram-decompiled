package X;

import java.io.IOException;

public abstract class VCY {
    public static VNT parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VNT vnt = new VNT();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("instagram".equals(AnonymousClass7TE.A17(r3))) {
                    vnt.A00 = VCX.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vnt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
