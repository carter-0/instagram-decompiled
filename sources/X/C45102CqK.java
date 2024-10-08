package X;

import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl;
import com.instagram.sponsored.signals.model.AdsCTATrustInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CqK  reason: case insensitive filesystem */
public abstract class C45102CqK {
    public static AdsCTATrustInfo parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            AdsBizBadgeInfoImpl adsBizBadgeInfoImpl = null;
            ArrayList arrayList = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("info_data".equals(A17)) {
                    adsBizBadgeInfoImpl = C45100CqI.parseFromJson(r5);
                } else if ("info_type_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            if (r5.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r5.A1P();
                            }
                            IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum = (IGAdsTrustInfoTypeEnum) IGAdsTrustInfoTypeEnum.A01.get(str);
                            if (iGAdsTrustInfoTypeEnum == null) {
                                iGAdsTrustInfoTypeEnum = IGAdsTrustInfoTypeEnum.UNRECOGNIZED;
                            }
                            arrayList.add(iGAdsTrustInfoTypeEnum);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r5.A0z();
            }
            return new AdsCTATrustInfo(adsBizBadgeInfoImpl, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
