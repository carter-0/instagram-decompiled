package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

public abstract class CUG {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.CTx] */
    public static C44054CTx parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            if (str != null || !(r6 instanceof 0c9)) {
                ? obj = new Object();
                obj.A00 = str;
                return obj;
            }
            AnonymousClass7TF.A1L(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r6, "AuthorizationHeader");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
