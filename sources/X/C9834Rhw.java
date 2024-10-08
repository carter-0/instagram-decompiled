package X;

import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.Rhw  reason: case insensitive filesystem */
public abstract class C9834Rhw {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Rq7] */
    public static C10309Rq7 parseFromJson(16F r4) {
        Integer num;
        String str;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C66579MXk.A00(1184).equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE.equals(A17)) {
                    switch (r4.A0i()) {
                        case 1:
                            num = AnonymousClass05K.A01;
                            break;
                        case 2:
                            num = AnonymousClass05K.A0C;
                            break;
                        case 3:
                            num = AnonymousClass05K.A0N;
                            break;
                        case 4:
                            num = AnonymousClass05K.A0Y;
                            break;
                        case 5:
                            num = AnonymousClass05K.A0j;
                            break;
                        case 6:
                            num = AnonymousClass05K.A0u;
                            break;
                        case 7:
                            num = AnonymousClass05K.A15;
                            break;
                        case 8:
                            num = AnonymousClass05K.A1F;
                            break;
                        case 9:
                            num = AnonymousClass05K.A1I;
                            break;
                        case 10:
                            num = AnonymousClass05K.A02;
                            break;
                        case 11:
                            num = AnonymousClass05K.A03;
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            num = AnonymousClass05K.A04;
                            break;
                        default:
                            num = AnonymousClass05K.A00;
                            break;
                    }
                    0qQ.A0B(num, 0);
                    obj.A00 = num;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
