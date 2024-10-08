package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

public abstract class VDE {
    public static VSJ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VSJ vsj = new VSJ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("__typename".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    vsj.A00 = r3.A1D();
                } else if (C41845B3m.A19(A17)) {
                    vsj.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vsj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
