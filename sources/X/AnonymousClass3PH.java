package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3PH  reason: invalid class name */
public final class AnonymousClass3PH {
    public static final AnonymousClass3PH A00 = new Object();

    public final void A00(Context context, UserSession userSession, Integer num, String str, long j, boolean z) {
        long j2;
        String str2;
        String str3;
        0qQ.A0B(str, 3);
        int intValue = num.intValue();
        0Tu r2 = 0Tu.A05;
        if (intValue != 0) {
            j2 = 36323839797571134L;
        } else {
            j2 = 36323839797505597L;
        }
        if (182.A06(r2, userSession, j2)) {
            0wc A002 = new AnonymousClass0kM(userSession).A00();
            0Aj A003 = A002.A00(A002.A00, "ig_bg_prefetch_save");
            if (A003.isSampled()) {
                A003.AAJ(TraceFieldType.RequestID, str);
                if (intValue != 0) {
                    str2 = "STORIES";
                } else {
                    str2 = "FEED";
                }
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                0qQ.A07(lowerCase);
                A003.AAJ("product", lowerCase);
                A003.A9F("bg_prefetch_timestamp", Long.valueOf(System.currentTimeMillis()));
                if (z) {
                    str3 = RealtimeConstants.SEND_SUCCESS;
                } else {
                    str3 = "failure";
                }
                A003.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str3);
                A003.A9F("previous_bg_prefetch_timestamp", Long.valueOf(j));
                long j3 = C638918c.A00(context).getLong("last_app_start_timestamp", -1);
                if (j3 > 0) {
                    A003.A9F("previous_app_start_timestamp", Long.valueOf(j3));
                }
                A003.Cgf();
            }
        }
    }

    public final void A01(UserSession userSession, 1CS r7, Integer num, Long l, String str, List list) {
        long j;
        String str2;
        long j2;
        int intValue = num.intValue();
        0Tu r3 = 0Tu.A05;
        if (intValue != 0) {
            j = 36323839797571134L;
        } else {
            j = 36323839797505597L;
        }
        if (182.A06(r3, userSession, j)) {
            0wc A002 = new AnonymousClass0kM(userSession).A00();
            0Aj A003 = A002.A00(A002.A00, "ig_app_start");
            if (A003.isSampled()) {
                A003.AAJ("start_type", r7.name());
                if (intValue != 0) {
                    str2 = "STORIES";
                } else {
                    str2 = "FEED";
                }
                A003.AAJ("product", str2);
                AnonymousClass3PG r0 = (AnonymousClass3PG) 00k.A0L(list);
                if (r0 != null) {
                    j2 = (long) r0.ordinal();
                } else {
                    j2 = 0;
                }
                A003.A9F("delivery_method", Long.valueOf(j2));
                if (list.contains(AnonymousClass3PG.CACHED)) {
                    A003.AAJ("cache_fetch_reason", str);
                    A003.A9F("cache_referesh_timestamp", l);
                }
                A003.Cgf();
            }
        }
    }
}
