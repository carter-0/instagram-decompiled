package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.VCv  reason: case insensitive filesystem */
public abstract class C16969VCv {
    public static VSG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VSG vsg = new VSG();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("__typename".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    vsg.A00 = r3.A1D();
                } else if (C41845B3m.A19(A17)) {
                    vsg.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vsg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
