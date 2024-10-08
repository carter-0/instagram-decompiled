package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Map;

/* renamed from: X.91y  reason: invalid class name and case insensitive filesystem */
public final class C3726891y {
    public final AnonymousClass0iw A00;

    public final void A00(0lg r4, Integer num, Map map) {
        String str;
        String str2;
        if (!182.A06(0Tu.A05, r4, 2342162476734487975L) || (r4 instanceof UserSession)) {
            0qQ.A0A(r4);
            0wc A01 = AnonymousClass0kN.A01(this.A00, r4);
            0Aj A002 = A01.A00(A01.A00, "push_notification_setting");
            if (num == AnonymousClass05K.A00) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            A002.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
            if (map != null) {
                str2 = map.toString();
            } else {
                str2 = null;
            }
            A002.AAJ("extra_setting_data", str2);
            A002.Cgf();
        }
    }

    public C3726891y(AnonymousClass0iw r1) {
        this.A00 = r1;
    }
}
