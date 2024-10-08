package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

public abstract class VC0 {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VY0, java.lang.Object] */
    public static VY0 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1A(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3680).equals(A17)) {
                    obj.A00 = r3.A1D();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
