package X;

import android.app.Activity;
import android.view.View;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.EkQ  reason: case insensitive filesystem */
public abstract class C48802EkQ {
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.0rk] */
    public static final void A00(Activity activity, View view, UserSession userSession) {
        int i;
        int i2;
        AnonymousClass9B9.A00();
        UserSession userSession2 = userSession;
        if (AnonymousClass9BA.A00(userSession2).A00() == AnonymousClass05K.A0N) {
            ? obj = new Object();
            1Av A00 = 1Au.A00(userSession2);
            0xa r11 = A00.A01;
            int i3 = r11.getInt("preference_ai_home_v2_tooltip_shown_count", 0);
            0Tu r7 = 0Tu.A05;
            int A04 = DbS.A04(r7, userSession2, 36606783653025262L);
            long j = r11.getLong("preference_ai_home_v2_tooltip_timestamp", 0);
            if (i3 < A04 && System.currentTimeMillis() - j > 86400000) {
                A00.A0z("preference_ai_home_v2_tooltip_shown_count", i3 + 1);
                A00.A11("preference_ai_home_v2_tooltip_timestamp", System.currentTimeMillis());
                AnonymousClass9B9.A00();
                i2 = 2131955085;
            } else if (182.A06(r7, userSession2, 36325308676715362L)) {
                1Av A002 = 1Au.A00(userSession2);
                0xa r112 = A002.A01;
                long j2 = r112.getLong("preference_ai_home_v2_tooltip_timestamp", 0);
                if (r112.getInt("preference_ai_home_v2_tooltip_shown_count", 0) >= DbS.A04(r7, userSession2, 36606783653025262L) && System.currentTimeMillis() - j2 > 86400000 && (i = r112.getInt("preference_ai_home_rediscovery_tooltip_show_count", 0)) < DbS.A04(r7, userSession2, 36606783653484016L)) {
                    A002.A0z("preference_ai_home_rediscovery_tooltip_show_count", i + 1);
                    AnonymousClass9B9.A00();
                    i2 = 2131952626;
                } else {
                    return;
                }
            } else {
                return;
            }
            obj.A00 = i2;
            View view2 = view;
            view2.postDelayed(new C51444FuE(activity, view2, obj), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
