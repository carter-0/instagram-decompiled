package X;

import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Eci  reason: case insensitive filesystem */
public abstract class C48325Eci {
    public static C53401GnY parseFromJson(16F r15) {
        String str;
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            User user = null;
            String str2 = null;
            String str3 = null;
            FanClubCategoryType fanClubCategoryType = null;
            User user2 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("back_subscriber".equals(A17)) {
                    user = C41845B3m.A0a(r15, false);
                } else if ("category_context".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("category_name".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("category_type".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    fanClubCategoryType = (FanClubCategoryType) FanClubCategoryType.A01.get(str);
                    if (fanClubCategoryType == null) {
                        fanClubCategoryType = FanClubCategoryType.UNRECOGNIZED;
                    }
                } else if ("front_subscriber".equals(A17)) {
                    user2 = C41845B3m.A0a(r15, false);
                }
                r15.A0z();
            }
            if (user == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("back_subscriber", r15, "FanClubCategoryMetadata");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("category_context", r15, "FanClubCategoryMetadata");
            } else if (str3 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("category_name", r15, "FanClubCategoryMetadata");
            } else if (fanClubCategoryType == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("category_type", r15, "FanClubCategoryMetadata");
            } else if (user2 != null || !(r15 instanceof 0c9)) {
                return new C53401GnY(fanClubCategoryType, user, user2, str2, str3);
            } else {
                AnonymousClass7TF.A1L("front_subscriber", r15, "FanClubCategoryMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
