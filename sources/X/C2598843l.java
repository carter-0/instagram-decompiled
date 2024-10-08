package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.43l  reason: invalid class name and case insensitive filesystem */
public final class C2598843l implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2598843l(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r7, AnonymousClass653 r8, List list, Map map, 0sL r11, 0sL r12, boolean z) {
        0qQ.A0B(map, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(r8, 2);
        0qQ.A0B(list, 4);
        0qQ.A0B(r11, 5);
        Object obj = map.get(RealtimeProtocol.THREAD_ID);
        if (obj == null || !"replace".equals(r8.A00)) {
            return AnonymousClass6BO.A00;
        }
        2Eq r5 = (2Eq) r11.invoke(obj, r7);
        if (r5 == null) {
            return C21215XPd.A00;
        }
        try {
            0c5 r2 = 0c9.A04;
            UserSession userSession = this.A00;
            String str = r8.A02;
            0qQ.A06(str);
            C254703su A002 = C254703su.A00(r2.A01(userSession, str), r5.BJy(), false);
            if (A002 == null) {
                return new AnonymousClass6BR(new Exception("Failed to parse value as DirectMessage"), "Invalid DirectMessage format", "Failed to parse value as DirectMessage");
            }
            A002.A1m(AnonymousClass05K.A0j);
            this.A01.A9f(A002, r5.BJy(), false);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C2597342w) it.next()).D8s(A002, r5.BJy(), r7.A06);
            }
            return AnonymousClass6BL.A00;
        } catch (IOException e) {
            0KC.A0F("BatchedPollsMessageDeltaProcessor", "Invalid DirectMessage format", e);
            return new AnonymousClass6BQ(e, "BatchedPollsMessageDeltaProcessor", "Invalid DirectMessage format");
        }
    }
}
