package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CUM {
    public static C47185DsX parseFromJson(16F r12) {
        String A00;
        String A002;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                16L A1J = r12.A1J();
                16L r10 = 16L.A09;
                A00 = AnonymousClass000.A00(798);
                A002 = AnonymousClass000.A00(2567);
                if (A1J == r10) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r12);
                if (A002.equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r12, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("button_text".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("title_text".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (arrayList == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r12, "AchievementToastInfoImpl");
            } else if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_text", r12, "AchievementToastInfoImpl");
            } else if (str2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r12, "AchievementToastInfoImpl");
            } else if (str3 != null || !(r12 instanceof 0c9)) {
                return new C47185DsX(str, str2, str3, arrayList);
            } else {
                AnonymousClass7TF.A1L("title_text", r12, "AchievementToastInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
