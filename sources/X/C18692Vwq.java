package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Vwq  reason: case insensitive filesystem */
public abstract class C18692Vwq {
    public static final void A00(Context context, UserSession userSession, String str) {
        Context context2 = context;
        AnonymousClass7TG.A1N(context, userSession);
        0Tu r4 = 0Tu.A06;
        if (182.A06(r4, userSession, 36310899061096809L)) {
            C359638dF.A04(context2, new C359618dD(userSession), "com.bloks.www.bloks.commerce.shoppingcart", DbY.A0m("_PRELOAD_ID_KEY_", "GlobalCart"), C17076VGy.A00(userSession).longValue());
        }
        if (str != null) {
            C323426xT.A00(userSession).A07.A09(str);
            if (!182.A06(r4, userSession, 36310899061096809L)) {
                return;
            }
            if (182.A06(0Tu.A05, userSession, 36310899061686640L)) {
                HashMap A0m = DbY.A0m("params", 002.A0g("{\"client_input_params\":{\"merchant-id\":", str, "},\"server_params\":{\"prefetch_view_only\":1}}"));
                long longValue = C17076VGy.A00(userSession).longValue();
                C359638dF.A03(context2, new C359618dD(userSession), "com.bloks.www.bloks.commerce.shoppingcart.merchantview", 002.A0R("MerchantCart_", str), A0m, longValue);
                return;
            }
            C323486xZ r0 = C323426xT.A00(userSession).A07;
            0qQ.A07(r0);
            C359638dF.A04(context2, new C359618dD(userSession), "com.bloks.www.bloks.commerce.shoppingcart.merchantview", 0Yt.A02(JTQ.A1b("_PRELOAD_ID_KEY_", 002.A0R("MerchantCart_", str), new 0eP("shopping_cart_id", r0.A09(str)))), C17076VGy.A00(userSession).longValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r3.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r3.equals("bottom_sheet_pdp") != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x002a
            int r1 = r3.hashCode()
            r0 = -1885092824(0xffffffff8fa3c428, float:-1.6148598E-29)
            if (r1 == r0) goto L_0x001f
            r0 = -799490724(0xffffffffd058bd5c, float:-1.4545154E10)
            if (r1 == r0) goto L_0x0022
            r0 = 2121699592(0x7e769108, float:8.1935783E37)
            if (r1 != r0) goto L_0x002a
            java.lang.String r0 = "bottom_sheet_pdp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002a
        L_0x001e:
            return r2
        L_0x001f:
            java.lang.String r0 = "live_viewer_product_feed"
            goto L_0x0024
        L_0x0022:
            java.lang.String r0 = "igtv_viewer_product_feed"
        L_0x0024:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x001e
        L_0x002a:
            java.lang.String r0 = "igtv_product_feed"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "live_product_feed"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x001e
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18692Vwq.A02(java.lang.String, java.lang.String):boolean");
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        if (182.A06(0Tu.A05, userSession, 36310899061555567L)) {
            HashMap hashMap = null;
            if (str2 != null) {
                hashMap = new HashMap();
                hashMap.put("merchant_id", str2);
            }
            C229382nI A01 = C229382nI.A01((SparseArray) null, fragmentActivity, new 0xG(str), userSession);
            AnonymousClass4D6 r3 = A01.A07;
            C360678ey A05 = C359988do.A05(userSession, "com.bloks.www.bloks.commerce.cart.first.pivot.data.async", hashMap);
            A05.A00(new C15408UcK(A01, 2));
            r3.schedule(A05);
        }
    }
}
