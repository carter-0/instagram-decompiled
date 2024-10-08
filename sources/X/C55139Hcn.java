package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Hcn  reason: case insensitive filesystem */
public abstract class C55139Hcn {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.HjD, java.lang.Object] */
    public static C55531HjD parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("keyword_recommendations".equals(A17)) {
                    obj.A00 = O1C.parseFromJson(r3);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    C41846B3n.A1A(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
