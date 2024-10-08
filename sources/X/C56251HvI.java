package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.HvI  reason: case insensitive filesystem */
public final class C56251HvI {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.5u5, X.H2m] */
    public static C54192H2m parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? r0 = new C298815u5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (DialogModule.KEY_TITLE.equals(A17)) {
                    r0.A00 = HTZ.parseFromJson(r3);
                } else {
                    AnonymousClass93W.A00(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
