package X;

import java.io.IOException;

public abstract class VCP {
    public static C17433VVm parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17433VVm vVm = new C17433VVm();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    vVm.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("profile_pic_url".equals(A0q)) {
                    vVm.A01 = AnonymousClass7TG.A0l(r3);
                } else if (Dbq.A03().equals(A0q)) {
                    vVm.A02 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vVm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
