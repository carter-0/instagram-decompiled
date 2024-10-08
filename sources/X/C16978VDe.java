package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.VDe  reason: case insensitive filesystem */
public abstract class C16978VDe {
    public static C17693VcO parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C17693VcO vcO = new C17693VcO();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("page_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vcO.A0A = str;
                } else if ("app_signal_source".equals(A17)) {
                    vcO.A09 = (C16628UyO) EnumHelper.A00(r3.A1Q(), C16628UyO.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("business_category_signal".equals(A17)) {
                    vcO.A00 = VDV.parseFromJson(r3);
                } else if ("description_signal".equals(A17)) {
                    vcO.A01 = VDW.parseFromJson(r3);
                } else if ("fb_badge_signal".equals(A17)) {
                    vcO.A02 = VDX.parseFromJson(r3);
                } else if ("followers_signal".equals(A17)) {
                    vcO.A03 = VDY.parseFromJson(r3);
                } else if ("ig_badge_signal".equals(A17)) {
                    vcO.A04 = VDZ.parseFromJson(r3);
                } else if ("location_signal".equals(A17)) {
                    vcO.A05 = C16974VDa.parseFromJson(r3);
                } else if ("page_likes_signal".equals(A17)) {
                    vcO.A06 = C16975VDb.parseFromJson(r3);
                } else if ("price_range_signal".equals(A17)) {
                    vcO.A07 = C16976VDc.parseFromJson(r3);
                } else if ("rating_signal".equals(A17)) {
                    vcO.A08 = C16977VDd.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vcO;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
