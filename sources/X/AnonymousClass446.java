package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.446  reason: invalid class name */
public final class AnonymousClass446 implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass446(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r6, AnonymousClass653 r7, List list, Map map, 0sL r10, 0sL r11, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(r10, 5);
        Object obj = map.get(RealtimeProtocol.THREAD_ID);
        if (obj != null) {
            String str = r7.A00;
            if (0qQ.A0K(str, "add")) {
                2Eq r3 = (2Eq) r10.invoke(obj, r6);
                if (r3 != null) {
                    try {
                        0c5 r2 = 0c9.A04;
                        UserSession userSession = this.A00;
                        String str2 = r7.A02;
                        0qQ.A06(str2);
                        C44055CTy parseFromJson = C44680Ciy.parseFromJson(r2.A01(userSession, str2));
                        if (parseFromJson == null) {
                            return new AnonymousClass6BQ(new Exception("Invalid DirectThreadImageInfo payload"), "invalid_thread_image_info_payload", "Invalid DirectThreadImageInfo payload");
                        }
                        this.A01.FLq(parseFromJson.A00, r3.BJy(), z);
                        return AnonymousClass6BL.A00;
                    } catch (IOException e) {
                        0wb.A05("invalid_thread_image_info_format", "Invalid DirectThreadImageInfo format", 1, e);
                        return new AnonymousClass6BQ(e, "invalid_thread_image_info_format", "Invalid DirectThreadImageInfo format");
                    }
                }
            } else if (0qQ.A0K(str, "remove")) {
                2Eq r0 = (2Eq) r10.invoke(obj, r6);
                if (r0 != null) {
                    this.A01.FLq((AnonymousClass4jH) null, r0.BJy(), z);
                    return AnonymousClass6BL.A00;
                }
            }
            return C21215XPd.A00;
        }
        return AnonymousClass6BO.A00;
    }
}
