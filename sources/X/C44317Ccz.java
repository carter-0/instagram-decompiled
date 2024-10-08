package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Ccz  reason: case insensitive filesystem */
public abstract class C44317Ccz {
    public static C59721JVf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            GSY gsy = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            BB7 bb7 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("action".equals(A17)) {
                    gsy = C44073CUq.parseFromJson(r4);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    bb7 = C44316Ccy.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C59721JVf(16, (Object) bb7, (Object) gsy);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
