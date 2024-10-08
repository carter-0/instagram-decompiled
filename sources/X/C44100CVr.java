package X;

import com.instagram.api.schemas.ClipsTrialDictImpl;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.CVr  reason: case insensitive filesystem */
public abstract class C44100CVr {
    public static ClipsTrialDictImpl parseFromJson(16F r7) {
        String str;
        String str2;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool = null;
            MediaTrialGraduationStrategy mediaTrialGraduationStrategy = null;
            Boolean bool2 = null;
            MediaTrialStatus mediaTrialStatus = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("can_update_graduation_strategy".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if ("graduation_strategy".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                    mediaTrialGraduationStrategy = (MediaTrialGraduationStrategy) MediaTrialGraduationStrategy.A01.get(str2);
                    if (mediaTrialGraduationStrategy == null) {
                        mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.UNRECOGNIZED;
                    }
                } else if ("is_revealed".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r7);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    mediaTrialStatus = (MediaTrialStatus) MediaTrialStatus.A01.get(str);
                    if (mediaTrialStatus == null) {
                        mediaTrialStatus = MediaTrialStatus.UNRECOGNIZED;
                    }
                }
                r7.A0z();
            }
            return new ClipsTrialDictImpl(mediaTrialGraduationStrategy, mediaTrialStatus, bool, bool2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
