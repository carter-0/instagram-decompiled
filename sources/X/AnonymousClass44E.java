package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.44E  reason: invalid class name */
public final class AnonymousClass44E implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44E(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r13, AnonymousClass653 r14, List list, Map map, 0sL r17, 0sL r18, boolean z) {
        Map map2 = map;
        0qQ.A0B(map2, 0);
        0qQ.A0B(r13, 1);
        0qQ.A0B(r14, 2);
        0sL r1 = r17;
        0qQ.A0B(r1, 5);
        Object obj = map2.get(RealtimeProtocol.THREAD_ID);
        if (obj != null) {
            2Eq r3 = (2Eq) r1.invoke(obj, r13);
            if (r3 == null) {
                return C21215XPd.A00;
            }
            try {
                String str = r14.A02;
                boolean z2 = z;
                if (str == null || "remove".equals(r14.A00)) {
                    this.A01.Eq4(r3.BJy(), (String) null, (String) null, false, z2);
                } else {
                    0c5 r12 = 0c9.A04;
                    UserSession userSession = this.A00;
                    0qQ.A06(str);
                    C45344Cum parseFromJson = C44687CjE.parseFromJson(r12.A01(userSession, str));
                    if (parseFromJson != null) {
                        this.A01.Eq4(r3.BJy(), parseFromJson.A01, parseFromJson.A00, parseFromJson.A02, z2);
                    }
                }
                return AnonymousClass6BL.A00;
            } catch (IOException e) {
                0wb.A01.Ew0("video_call_iris_sync_message_error", "Invalid DirectThreadVideoCallInfo format");
                return new AnonymousClass6BQ(e, "video_call_iris_sync_message_error", "Invalid DirectThreadVideoCallInfo format");
            }
        } else {
            0wb.A01.Ew0("video_call_iris_sync_message_error", "Thread id is missing from iris sync message video call info");
            return AnonymousClass6BO.A00;
        }
    }
}
