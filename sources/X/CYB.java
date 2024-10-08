package X;

import com.instagram.api.schemas.GoalsToastInfoImpl;
import com.instagram.api.schemas.GoalsToastType;
import java.io.IOException;

public abstract class CYB {
    public static GoalsToastInfoImpl parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            GoalsToastType goalsToastType = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("button_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("deeplink_url".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("goal_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if ("title_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                } else if ("toast_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    goalsToastType = (GoalsToastType) GoalsToastType.A01.get(str);
                    if (goalsToastType == null) {
                        goalsToastType = GoalsToastType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            return new GoalsToastInfoImpl(goalsToastType, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
