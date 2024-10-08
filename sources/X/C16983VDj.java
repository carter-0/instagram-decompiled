package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.VDj  reason: case insensitive filesystem */
public abstract class C16983VDj {
    public static VSV parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VSV vsv = new VSV();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("customized_token".equals(A17)) {
                    vsv.A00 = AnonymousClass7TG.A0l(r3);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    vsv.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vsv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
