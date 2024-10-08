package X;

import com.instagram.api.schemas.AchievementButtonAction;
import com.instagram.api.schemas.AchievementButtonInfoImpl;
import java.io.IOException;

public abstract class CUL {
    public static AchievementButtonInfoImpl parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            AchievementButtonAction achievementButtonAction = null;
            String str2 = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("button_action".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    achievementButtonAction = (AchievementButtonAction) AchievementButtonAction.A01.get(str);
                    if (achievementButtonAction == null) {
                        achievementButtonAction = AchievementButtonAction.UNRECOGNIZED;
                    }
                } else if ("button_text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("deeplink_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (achievementButtonAction == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_action", r10, "AchievementButtonInfoImpl");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("button_text", r10, "AchievementButtonInfoImpl");
            } else if (str3 != null || !(r10 instanceof 0c9)) {
                return new AchievementButtonInfoImpl(achievementButtonAction, str2, str3);
            } else {
                AnonymousClass7TF.A1L("deeplink_url", r10, "AchievementButtonInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
