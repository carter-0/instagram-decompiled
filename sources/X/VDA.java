package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

public abstract class VDA {
    public static C17238VNq parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17238VNq vNq = new C17238VNq();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(AnonymousClass7TE.A17(r3))) {
                    vNq.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return vNq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
