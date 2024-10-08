package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Chl  reason: case insensitive filesystem */
public abstract class C44613Chl {
    public static C61062Jw0 parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            String str2 = null;
            User user = null;
            String str3 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("image".equals(A17)) {
                    simpleImageUrl = 16h.A00(r13);
                } else if ("media_count_info".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("profile".equals(A17)) {
                    user = C41845B3m.A0a(r13, false);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DevServerEntity.COLUMN_DESCRIPTION, r13, "AttributionPivotPageResponse.AttributionPivotPageHeader");
            } else if (user == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("profile", r13, "AttributionPivotPageResponse.AttributionPivotPageHeader");
            } else if (str3 != null || !(r13 instanceof 0c9)) {
                return new C61062Jw0((ImageUrl) simpleImageUrl, user, str, str2, str3);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r13, "AttributionPivotPageResponse.AttributionPivotPageHeader");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
