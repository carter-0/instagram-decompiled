package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.api.schemas.CloseToEarningAchievementMedia;
import java.io.IOException;

/* renamed from: X.CVs  reason: case insensitive filesystem */
public abstract class C44101CVs {
    public static CloseToEarningAchievementMedia parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            String str2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("media_display_url".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if (!"media_id".equals(A17)) {
                    num = C41847B3o.A13(r9, num, A17, ReactProgressBarViewManager.PROP_PROGRESS);
                } else if (r9.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r9.A1P();
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_id", r9, "CloseToEarningAchievementMedia");
            } else if (num != null || !(r9 instanceof 0c9)) {
                return new CloseToEarningAchievementMedia(str2, str, num.intValue());
            } else {
                AnonymousClass7TF.A1L(ReactProgressBarViewManager.PROP_PROGRESS, r9, "CloseToEarningAchievementMedia");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
