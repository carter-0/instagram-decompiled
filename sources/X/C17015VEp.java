package X;

import com.instagram.api.schemas.IGAdsRrFormatEnum;
import java.io.IOException;

/* renamed from: X.VEp  reason: case insensitive filesystem */
public abstract class C17015VEp {
    public static C2804251u parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            UN3 un3 = null;
            UOA uoa = null;
            IGAdsRrFormatEnum iGAdsRrFormatEnum = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("core_rating_info".equals(A17)) {
                    un3 = V7M.parseFromJson(r6);
                } else if (C273654mx.A00(895).equals(A17)) {
                    uoa = C17017VEr.parseFromJson(r6);
                } else if ("rr_format".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    iGAdsRrFormatEnum = (IGAdsRrFormatEnum) IGAdsRrFormatEnum.A01.get(str);
                    if (iGAdsRrFormatEnum == null) {
                        iGAdsRrFormatEnum = IGAdsRrFormatEnum.UNRECOGNIZED;
                    }
                }
                r6.A0z();
            }
            return new C2804251u(un3, iGAdsRrFormatEnum, uoa);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
