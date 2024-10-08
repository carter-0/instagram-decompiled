package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.44P  reason: invalid class name */
public final class AnonymousClass44P implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44P(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r6, AnonymousClass653 r7, List list, Map map, 0sL r10, 0sL r11, boolean z) {
        C242373Tu r2;
        0qQ.A0B(map, 0);
        0qQ.A0B(r7, 2);
        String str = (String) map.get(RealtimeProtocol.THREAD_ID);
        if (str == null || !0qQ.A0K(r7.A00, "replace")) {
            return AnonymousClass6BO.A00;
        }
        String str2 = r7.A02;
        0qQ.A06(str2);
        try {
            DirectThreadKey directThreadKey = new DirectThreadKey(str, (List) null);
            C300585xS parseFromJson = C300595xT.parseFromJson(0c9.A04.A01(this.A00, str2));
            if (parseFromJson == null || (r2 = parseFromJson.A0Z) == null) {
                String simpleName = getClass().getSimpleName();
                0qQ.A07(simpleName);
                return new AnonymousClass6BQ(new Exception("Invalid btvEnabledMap payload"), simpleName, "Invalid btvEnabledMap payload");
            }
            this.A01.FLp(r2, directThreadKey, "delta");
            return AnonymousClass6BL.A00;
        } catch (IOException e) {
            String simpleName2 = getClass().getSimpleName();
            0KC.A0F(simpleName2, "Invalid btvEnabledMap format", e);
            0qQ.A07(simpleName2);
            return new AnonymousClass6BQ(e, simpleName2, "Invalid btvEnabledMap format");
        }
    }
}
