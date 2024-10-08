package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CVf  reason: case insensitive filesystem */
public abstract class C44088CVf {
    public static BEA parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            IntentAwareAdsInfo intentAwareAdsInfo = null;
            ArrayList arrayList = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("intent_aware_ads_info".equals(A17)) {
                    intentAwareAdsInfo = C56211Hue.parseFromJson(r8);
                } else if ("multi_ads_media_items".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            XET parseFromJson = C41915B6n.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            if (intentAwareAdsInfo == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("intent_aware_ads_info", r8, "ClipsMultiAdsResponseItem");
            } else if (arrayList != null || !(r8 instanceof 0c9)) {
                return new BEA(intentAwareAdsInfo, arrayList);
            } else {
                AnonymousClass7TF.A1L("multi_ads_media_items", r8, "ClipsMultiAdsResponseItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
