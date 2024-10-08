package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Chn  reason: case insensitive filesystem */
public abstract class C44615Chn {
    public static C45270CtZ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            IntentAwareAdsInfo intentAwareAdsInfo = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("multi_ads_media_items".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41938B7p parseFromJson = C41939B7q.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("intent_aware_ads_info".equals(A17)) {
                    intentAwareAdsInfo = C56211Hue.parseFromJson(r5);
                }
                r5.A0z();
            }
            C45270CtZ ctZ = new C45270CtZ();
            if (arrayList != null) {
                ctZ.A01 = arrayList;
            }
            if (intentAwareAdsInfo != null) {
                ctZ.A00 = intentAwareAdsInfo;
            }
            return ctZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
