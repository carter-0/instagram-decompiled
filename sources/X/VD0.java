package X;

import java.io.IOException;

public abstract class VD0 {
    public static C17232VNk parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17232VNk vNk = new C17232VNk();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("tray".equals(AnonymousClass7TE.A17(r3))) {
                    vNk.A00 = C16973VCz.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vNk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
