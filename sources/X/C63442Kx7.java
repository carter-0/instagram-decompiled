package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Kx7  reason: case insensitive filesystem */
public abstract class C63442Kx7 {
    public static C61079JwH parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61079JwH jwH = new C61079JwH(29);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("selection_limit_type".equals(A17)) {
                    C62568Khy khy = (C62568Khy) C62568Khy.A01.get(AnonymousClass7TG.A0l(r3));
                    if (khy == null) {
                        khy = C62568Khy.UNKNOWN;
                    }
                    jwH.A00 = khy;
                } else if ("selection_limit_value".equals(A17)) {
                    jwH.A01 = AnonymousClass7TF.A0X(r3);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    jwH.A02 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return jwH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
