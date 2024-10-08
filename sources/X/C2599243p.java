package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.43p  reason: invalid class name and case insensitive filesystem */
public final class C2599243p implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2599243p(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r11, AnonymousClass653 r12, List list, Map map, 0sL r15, 0sL r16, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r11, 1);
        0qQ.A0B(r12, 2);
        0qQ.A0B(r15, 5);
        Object obj = map.get(RealtimeProtocol.THREAD_ID);
        String str = (String) map.get(RealtimeProtocol.ITEM_ID);
        if (obj == null || str == null || !"replace".equals(r12.A00)) {
            return AnonymousClass6BO.A00;
        }
        2Eq r1 = (2Eq) r15.invoke(obj, r11);
        if (r1 != null) {
            2Dm r9 = this.A01;
            if (r9.BRz(r1.BJy(), str) == null) {
                return new CHW("UpdateMessageMediaInterventionsDeltaProcessor", "No cached message to update");
            }
            UserSession userSession = this.A00;
            if (C66797Mcj.A02(userSession, false)) {
                String C6C = r1.C6C();
                if (C6C != null) {
                    C254763t0 r8 = new C254763t0(C6C);
                    try {
                        C45214CsS parseFromJson = C44720Cjo.parseFromJson(16P.A00(r12.A02));
                        if (parseFromJson != null) {
                            LinkedHashMap linkedHashMap = parseFromJson.A00;
                            if (linkedHashMap != null) {
                                for (Object next : linkedHashMap.keySet()) {
                                    0qQ.A07(next);
                                    String str2 = (String) next;
                                    r9.Ed4(new DirectMessageIdentifier((2FW) null, str, (String) null), r8, (Integer) linkedHashMap.get(str2), str2);
                                }
                            } else {
                                0qQ.A0F("mediaInterventions");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    } catch (IOException e) {
                        1Zp A012 = 1Zm.A00(userSession).A01(AnonymousClass05K.A0N, AnonymousClass05K.A0K, true);
                        A012.A03("error_message: ", "Invalid MessageMediaInterventionsInfo format");
                        A012.A05(e);
                        A012.A00();
                        return new AnonymousClass6BQ(e, "UpdateMessageMediaInterventionsDeltaProcessor", "Invalid MessageMediaInterventionsInfo format");
                    }
                }
            }
            return AnonymousClass6BL.A00;
        }
        return C21215XPd.A00;
    }
}
