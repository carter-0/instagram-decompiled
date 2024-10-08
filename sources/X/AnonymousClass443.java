package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.443  reason: invalid class name */
public final class AnonymousClass443 implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass443(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r12, AnonymousClass653 r13, List list, Map map, 0sL r16, 0sL r17, boolean z) {
        Boolean bool;
        0qQ.A0B(map, 0);
        0qQ.A0B(r12, 1);
        0qQ.A0B(r13, 2);
        0sL r3 = r16;
        0qQ.A0B(r3, 5);
        Object obj = map.get(RealtimeProtocol.THREAD_ID);
        if (obj == null || !"replace".equals(r13.A00)) {
            return AnonymousClass6BO.A00;
        }
        2Eq r4 = (2Eq) r3.invoke(obj, r12);
        if (r4 == null) {
            return C21215XPd.A00;
        }
        try {
            0c5 r2 = 0c9.A04;
            UserSession userSession = this.A00;
            String str = r13.A02;
            0qQ.A06(str);
            C45342Cuk parseFromJson = C44678Ciw.parseFromJson(r2.A01(userSession, str));
            if (parseFromJson != null) {
                bool = parseFromJson.A01;
            } else {
                bool = null;
            }
            Boolean A002 = C48861ElN.A00(r13.A02);
            boolean z2 = z;
            if (bool != null) {
                this.A01.FLr(r4.BJy(), parseFromJson.A02, parseFromJson.A00, bool.booleanValue(), z2);
                return AnonymousClass6BL.A00;
            } else if (A002 != null) {
                this.A01.FLr(r4.BJy(), (String) null, 0, A002.booleanValue(), z2);
                return AnonymousClass6BL.A00;
            } else {
                0wb.A01.Ew1("invalid_shh_mode_toggle_info_payload", "Invalid DirectShhModeToggleInfo payload", 1);
                return new AnonymousClass6BQ(new Exception("Invalid DirectShhModeToggleInfo payload"), "invalid_shh_mode_toggle_info_payload", "Invalid DirectShhModeToggleInfo payload");
            }
        } catch (IOException e) {
            0wb.A01.Ew6("invalid_shh_mode_toggle_info_format", "Invalid DirectShhModeToggleInfo format", 1, e);
            return new AnonymousClass6BQ(e, "invalid_shh_mode_toggle_info_format", "Invalid DirectShhModeToggleInfo format");
        }
    }
}
