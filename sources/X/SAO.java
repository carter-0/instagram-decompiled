package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

public final class SAO {
    public static C8744R7i parseFromJson(16F r8) {
        String str;
        String str2;
        JsonElement jsonElement;
        0qQ.A0B(r8, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                String A00 = AnonymousClass000.A00(167);
                if (A00.equals(A17)) {
                    C10293Rpr rpr = new C10293Rpr();
                    if (r8.A11() == 16L.A0J && 0qQ.A0K(r8.A0q(), A00)) {
                        C250873mC r7 = C250863mB.A03;
                        String A1Q = r8.A1Q();
                        0qQ.A07(A1Q);
                        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
                        JsonObject A03 = C271114hv.A03((JsonElement) r7.A00(A1Q, jsonElementSerializer));
                        JsonElement jsonElement2 = (JsonElement) A03.get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
                        if (jsonElement2 != null) {
                            C271114hv.A06(jsonElement2);
                        }
                        JsonElement jsonElement3 = (JsonElement) A03.get(TraceFieldType.StatusCode);
                        if (jsonElement3 == null || (str = C271114hv.A06(jsonElement3).A00()) == null) {
                            str = "";
                        }
                        rpr.A00 = str;
                        Object obj = A03.get("content");
                        if (obj == null || (str2 = obj.toString()) == null) {
                            str2 = "";
                        }
                        if (str2.length() > 0 && (jsonElement = (JsonElement) C271114hv.A03((JsonElement) r7.A00(str2, jsonElementSerializer)).get(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)) != null) {
                            C271114hv.A06(jsonElement);
                        }
                    }
                    r1.A00 = rpr;
                } else {
                    1XY.A01(r8, r1, A17);
                }
                r8.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
