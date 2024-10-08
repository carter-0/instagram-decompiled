package com.instagram.debug.devoptions.api;

import X.16F;
import X.16L;
import X.16P;
import X.1XQ;
import X.1XY;
import X.AnonymousClass1FD;
import X.AnonymousClass7TE;

public final class BundledActivityFeedExperienceResponse__JsonHelper {
    public static BundledActivityFeedExperienceResponse parseFromJson(16F r1) {
        return (BundledActivityFeedExperienceResponse) 16P.A01(r1, new AnonymousClass1FD() {
            public BundledActivityFeedExperienceResponse invoke(16F r2) {
                return BundledActivityFeedExperienceResponse__JsonHelper.unsafeParseFromJson(r2);
            }
        });
    }

    public static boolean processSingleField(BundledActivityFeedExperienceResponse bundledActivityFeedExperienceResponse, String str, 16F r4) {
        String A1P;
        if (!"setting".equals(str)) {
            return 1XY.A01(r4, bundledActivityFeedExperienceResponse, str);
        }
        if (r4.A11() == 16L.A0G) {
            A1P = null;
        } else {
            A1P = r4.A1P();
        }
        bundledActivityFeedExperienceResponse.experience = A1P;
        return true;
    }

    public static BundledActivityFeedExperienceResponse unsafeParseFromJson(16F r3) {
        1XQ r2 = new 1XQ();
        if (r3.A11() != 16L.A0D) {
            r3.A0z();
            return null;
        }
        while (r3.A1J() != 16L.A09) {
            processSingleField(r2, AnonymousClass7TE.A17(r3), r3);
            r3.A0z();
        }
        return r2;
    }

    public static BundledActivityFeedExperienceResponse parseFromJson(String str) {
        return parseFromJson(16P.A00(str));
    }
}
