package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.CiC  reason: case insensitive filesystem */
public abstract class C44634CiC {
    public static JV7 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            N49 n49 = null;
            String str = null;
            String str2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if (C41845B3m.A1Q(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("themed_image_url".equals(A17)) {
                    n49 = C44643CiN.parseFromJson(r9);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (n49 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("themed_image_url", r9, "CoverComponent");
            } else if (str != null || !(r9 instanceof 0c9)) {
                return new JV7(n49, str2, str);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r9, "CoverComponent");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
