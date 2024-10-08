package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.444  reason: invalid class name */
public final class AnonymousClass444 implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass444(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r7, AnonymousClass653 r8, List list, Map map, 0sL r11, 0sL r12, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(r8, 2);
        0qQ.A0B(r11, 5);
        Object obj = map.get(RealtimeProtocol.THREAD_ID);
        if (obj == null || !0qQ.A0K(r8.A00, "replace")) {
            return AnonymousClass6BO.A00;
        }
        2Eq r4 = (2Eq) r11.invoke(obj, r7);
        if (r4 == null) {
            return C21215XPd.A00;
        }
        try {
            0c5 r1 = 0c9.A04;
            UserSession userSession = this.A00;
            String str = r8.A02;
            0qQ.A06(str);
            DirectThreadThemeInfo A002 = AnonymousClass3T6.A00(r1.A01(userSession, str));
            if (A002 == null) {
                return new AnonymousClass6BQ(new Exception("Invalid DirectThreadThemeInfo payload"), "invalid_thread_theme_info_payload", "Invalid DirectThreadThemeInfo payload");
            }
            if (182.A06(0Tu.A06, userSession, 36314575552973497L)) {
                String str2 = A002.A0o;
                DirectThreadThemeInfo directThreadThemeInfo = AnonymousClass6BI.A0D;
                if (0qQ.A0K(str2, directThreadThemeInfo.A0o)) {
                    this.A01.FLv(directThreadThemeInfo, r4.BJy(), z);
                }
            } else {
                this.A01.FLv(A002, r4.BJy(), z);
            }
            return AnonymousClass6BL.A00;
        } catch (IOException e) {
            0wb.A05("invalid_thread_theme_info_format", "Invalid DirectThreadThemeInfo format", 1, e);
            return new AnonymousClass6BQ(e, "invalid_thread_theme_info_format", "Invalid DirectThreadThemeInfo format");
        }
    }
}
