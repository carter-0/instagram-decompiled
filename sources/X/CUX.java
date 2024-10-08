package X;

import com.instagram.api.schemas.AppInstallCTAInfo;
import java.io.IOException;

public abstract class CUX {
    public static AppInstallCTAInfo parseFromJson(16F r8) {
        String A00;
        String A002;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r6 = 16L.A09;
                A00 = AnonymousClass000.A00(1491);
                A002 = AnonymousClass000.A00(505);
                if (A1J == r6) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (A002.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r8, "AppInstallCTAInfo");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new AppInstallCTAInfo(str, str2);
            } else {
                AnonymousClass7TF.A1L(A00, r8, "AppInstallCTAInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
