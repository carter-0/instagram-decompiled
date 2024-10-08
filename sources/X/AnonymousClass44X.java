package X;

import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.44X  reason: invalid class name */
public final class AnonymousClass44X implements C2598643j {
    public final 2Dm A00;

    public AnonymousClass44X(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r7, AnonymousClass653 r8, List list, Map map, 0sL r11, 0sL r12, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(r8, 2);
        0qQ.A0B(r11, 5);
        String str = (String) map.get(RealtimeProtocol.THREAD_ID);
        if (str == null || !0qQ.A0K(r8.A00, "replace")) {
            return AnonymousClass6BO.A00;
        }
        try {
            C45211CsO parseFromJson = C44672Ciq.parseFromJson(16P.A00(r8.A02));
            0qQ.A07(parseFromJson);
            if (r11.invoke(str, r7) == null) {
                return AnonymousClass6BO.A00;
            }
            2Dm r4 = this.A00;
            List list2 = parseFromJson.A00;
            r4.FKt(str, ((A5M) list2.get(0)).A01, ((A5M) list2.get(0)).A00);
            return AnonymousClass6BL.A00;
        } catch (IOException e) {
            return new AnonymousClass6BR(e, "invalid_direct_nickname_settings_payload", "Invalid DirectNicknameUpdate payload");
        }
    }
}
