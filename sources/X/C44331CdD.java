package X;

import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import java.io.IOException;

/* renamed from: X.CdD  reason: case insensitive filesystem */
public abstract class C44331CdD {
    public static ScheduledLiveDiscountInfoImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (!"discount_id".equals(A17)) {
                    bool = C41847B3o.A0z(r5, bool, A17, "is_auto_tagged");
                } else if (r5.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r5.A1P();
                }
                r5.A0z();
            }
            return new ScheduledLiveDiscountInfoImpl(str, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
