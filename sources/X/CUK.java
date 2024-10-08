package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

public abstract class CUK {
    public static C53427GoJ parseFromJson(16F r10) {
        String A00;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r8 = 16L.A09;
                A00 = AnonymousClass000.A00(3271);
                if (A1J == r8) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if (A00.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("subtitle".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "AboutAchievementsComponentImpl");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("subtitle", r10, "AboutAchievementsComponentImpl");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new C53427GoJ(str, str2, str3);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r10, "AboutAchievementsComponentImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
