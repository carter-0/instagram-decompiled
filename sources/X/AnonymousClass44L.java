package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.44L  reason: invalid class name */
public final class AnonymousClass44L implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44L(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r5, AnonymousClass653 r6, List list, Map map, 0sL r9, 0sL r10, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(r9, 5);
        Object obj = map.get(RealtimeProtocol.THREAD_ID);
        if (obj == null || !"replace".equals(r6.A00)) {
            return AnonymousClass6BO.A00;
        }
        2Eq r3 = (2Eq) r9.invoke(obj, r5);
        if (r3 != null) {
            try {
                0c5 r2 = 0c9.A04;
                UserSession userSession = this.A00;
                String str = r6.A02;
                0qQ.A06(str);
                this.A01.EoX(C300595xT.parseFromJson(r2.A01(userSession, str)).A0M, r3);
            } catch (IOException e) {
                0KC.A0F("ThreadSnippetUpdateDeltaProcessor", "Invalid thread snippet format", e);
                return new AnonymousClass6BQ(e, "ThreadSnippetUpdateDeltaProcessor", "Invalid thread snippet format");
            }
        }
        return AnonymousClass6BL.A00;
    }
}
