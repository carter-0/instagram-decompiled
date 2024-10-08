package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9zs  reason: invalid class name and case insensitive filesystem */
public abstract class C395509zs {
    public static AnonymousClass1d1 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1d1 r1 = new AnonymousClass1d1();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("p2b_order".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C254873tC parseFromJson = C254863tB.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r1.A07 = arrayList;
                } else if ("order_id".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("merchant_id".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(1258).equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("currency_code".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(1084).equals(A17)) {
                    r1.A00 = AnonymousClass7TG.A0l(r4);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    r1.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("order_notes".equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r4);
                } else {
                    C66893Meb.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
