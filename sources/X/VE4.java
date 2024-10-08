package X;

import java.io.IOException;

public abstract class VE4 {
    public static C17444VVx parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17444VVx vVx = new C17444VVx();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("registered_event_data_json".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("session_blob".equals(A17)) {
                    vVx.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("survey".equals(A17)) {
                    vVx.A00 = VE1.parseFromJson(r3);
                } else if ("config".equals(A17)) {
                    vVx.A01 = VE5.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vVx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
