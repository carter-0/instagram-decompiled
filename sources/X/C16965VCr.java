package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.VCr  reason: case insensitive filesystem */
public abstract class C16965VCr {
    public static C17224VNc parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17224VNc vNc = new C17224VNc();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(AnonymousClass7TE.A17(r3))) {
                    vNc.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return vNc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
