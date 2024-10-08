package X;

import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VEX {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse, java.lang.Object] */
    public static LocationPageInfoPageOperationHourResponse parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("schedule".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            LocationPageInfoPageOperationHour parseFromJson = VEY.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A04 = arrayList;
                } else if ("current_status".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("hours_today".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("is_open".equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0S(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
