package X;

import com.instagram.api.schemas.FanClubStatusSyncInfoImpl;
import java.io.IOException;

/* renamed from: X.3rP  reason: invalid class name and case insensitive filesystem */
public abstract class C253783rP {
    public static FanClubStatusSyncInfoImpl parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            Boolean bool = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool2 = null;
            Long l = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("eligible_to_subscribe".equals(A0q)) {
                    bool = Boolean.valueOf(r8.A0d());
                } else if ("subscribed".equals(A0q)) {
                    bool2 = Boolean.valueOf(r8.A0d());
                } else if (AnonymousClass000.A00(4067).equals(A0q)) {
                    l = Long.valueOf(r8.A0y());
                }
                r8.A0z();
            }
            if (bool == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("eligible_to_subscribe", "FanClubStatusSyncInfoImpl");
            } else if (bool2 != null || !(r8 instanceof 0c9)) {
                return new FanClubStatusSyncInfoImpl(l, bool.booleanValue(), bool2.booleanValue());
            } else {
                ((0c9) r8).A03.A00("subscribed", "FanClubStatusSyncInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
