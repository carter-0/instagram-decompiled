package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.445  reason: invalid class name */
public final class AnonymousClass445 implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass445(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r8, AnonymousClass653 r9, List list, Map map, 0sL r12, 0sL r13, boolean z) {
        0qQ.A0B(map, 0);
        AnonymousClass651 r3 = r8;
        0qQ.A0B(r8, 1);
        AnonymousClass653 r4 = r9;
        0qQ.A0B(r9, 2);
        0sL r6 = r12;
        0qQ.A0B(r12, 5);
        String str = (String) map.get(RealtimeProtocol.THREAD_ID);
        if (str == null || !0qQ.A0K(r9.A00, "replace")) {
            return AnonymousClass6BO.A00;
        }
        return updateLoadableThreadTheme(str, r3, r4, z, r6);
    }

    public final AnonymousClass6BN updateLoadableThreadTheme(String str, AnonymousClass651 r8, AnonymousClass653 r9, boolean z, 0sL r11) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r11, 4);
        2Eq r5 = (2Eq) r11.invoke(str, r8);
        if (r5 == null) {
            return C21215XPd.A00;
        }
        UserSession userSession = this.A00;
        if (!182.A06(0Tu.A06, userSession, 36314575552973497L)) {
            return AnonymousClass6BL.A00;
        }
        try {
            0c5 r1 = 0c9.A04;
            String str2 = r9.A02;
            0qQ.A06(str2);
            C370688wu parseFromJson = C370638wn.parseFromJson(r1.A01(userSession, str2));
            if (parseFromJson == null) {
                return new AnonymousClass6BQ(new Exception("Invalid LoadableThreadThemeInfo payload"), "invalid_loadable_thread_theme_info_payload", "Invalid LoadableThreadThemeInfo payload");
            }
            this.A01.FLv(C370718wx.A00(parseFromJson), r5.BJy(), z);
            return AnonymousClass6BL.A00;
        } catch (IOException e) {
            0wb.A05("invalid_loadable_thread_theme_info_format", "Invalid LoadableThreadThemeInfo format", 1, e);
            return new AnonymousClass6BQ(e, "invalid_loadable_thread_theme_info_format", "Invalid LoadableThreadThemeInfo format");
        }
    }
}
