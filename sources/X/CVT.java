package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CVT {
    public static C47191Dsd parseFromJson(16F r14) {
        String A00;
        String A002;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r14.A1J();
                16L r2 = 16L.A09;
                A00 = AnonymousClass000.A00(798);
                A002 = AnonymousClass000.A00(4580);
                if (A1J == r2) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r14);
                if ("button_text".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if (A002.equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            C41847B3o.A1L(r14, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("deeplink_url".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("title_text".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_text", r14, "ChallengeToastInfoImpl");
            } else if (arrayList == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r14, "ChallengeToastInfoImpl");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deeplink_url", r14, "ChallengeToastInfoImpl");
            } else if (str3 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r14, "ChallengeToastInfoImpl");
            } else if (str4 != null || !(r14 instanceof 0c9)) {
                return new C47191Dsd(str, str2, str3, str4, arrayList);
            } else {
                AnonymousClass7TF.A1L("title_text", r14, "ChallengeToastInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
