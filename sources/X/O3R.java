package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

public abstract class O3R {
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.NpZ] */
    public static C69651NpZ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C70754OKa oKa = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (DialogModule.KEY_TITLE.equals(AnonymousClass7TE.A17(r5))) {
                    oKa = O3N.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (oKa != null || !(r5 instanceof 0c9)) {
                ? obj = new Object();
                obj.A00 = oKa;
                return obj;
            }
            AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r5, "PolicyFormattedText");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
