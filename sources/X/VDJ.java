package X;

import java.io.IOException;

public abstract class VDJ {
    public static C17246VNy parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17246VNy vNy = new C17246VNy();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("share".equals(AnonymousClass7TE.A17(r3))) {
                    vNy.A00 = VDI.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
