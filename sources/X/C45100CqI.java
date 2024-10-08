package X;

import com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import java.io.IOException;

/* renamed from: X.CqI  reason: case insensitive filesystem */
public abstract class C45100CqI {
    public static AdsBizBadgeInfoImpl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AdsRatingInfo adsRatingInfo = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("rating_info".equals(AnonymousClass7TE.A17(r3))) {
                    adsRatingInfo = AnonymousClass5I9.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new AdsBizBadgeInfoImpl(adsRatingInfo);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
