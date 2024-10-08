package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.93Y  reason: invalid class name */
public abstract class AnonymousClass93Y {
    public static final void A00(UserSession userSession, Integer num, String str, String str2, int i, boolean z, boolean z2) {
        C3728893a A01 = AnonymousClass93Z.A01(userSession);
        if (A01 != null && !A01.A00) {
            if (num == AnonymousClass05K.A00) {
                C3728893a.A02(A01);
            }
            0XK r10 = new 0XK();
            boolean A06 = 182.A06(0Tu.A05, userSession, 36318509744658609L);
            r10.A00("analytics_module", str, 1);
            r10.A00("is_sync", String.valueOf(z), 8);
            r10.A00("delivery_context", AnonymousClass93b.A01(num), 1);
            r10.A00("existing_post_count", String.valueOf(i), 2);
            r10.A00("next_max_id", str2, 1);
            r10.A00("chaining_head_load_flag", String.valueOf(A06), 8);
            r10.A00("use_network_cache", String.valueOf(z2), 8);
            C3728893a.A00(A01).markerPoint(976032351, 0, 7, "fetch_organic_start", r10, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }
}
