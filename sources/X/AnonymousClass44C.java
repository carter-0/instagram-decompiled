package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.44C  reason: invalid class name */
public final class AnonymousClass44C implements C2598643j {
    public final 2Dm A00;

    public AnonymousClass44C(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r11, AnonymousClass653 r12, List list, Map map, 0sL r15, 0sL r16, boolean z) {
        2Kb r3;
        C300625xW r4;
        0qQ.A0B(map, 0);
        0qQ.A0B(r11, 1);
        0qQ.A0B(r12, 2);
        0qQ.A0B(r15, 5);
        Object obj = map.get(RealtimeProtocol.THREAD_ID);
        String str = (String) map.get(RealtimeProtocol.ITEM_ID);
        if (obj == null || str == null || !0qQ.A0K(r12.A00, "replace")) {
            0wb.A03("PolicyViolation_IrisSyncMessageProcessor", "threadId/messageId is missing from policy violation reviewed path or operation is not replace");
            return AnonymousClass6BO.A00;
        }
        2Eq r0 = (2Eq) r15.invoke(obj, r11);
        if (r0 == null) {
            return C21215XPd.A00;
        }
        2Dr r1 = this.A00;
        DirectThreadKey BJy = r0.BJy();
        String str2 = r12.A02;
        2Dr r13 = r1;
        AnonymousClass48S A0P = r13.A0P(BJy);
        if (A0P == null) {
            0wb.A03("PolicyViolation_DirectThreadStoreImpl", "Entry should exist before function call");
        } else {
            synchronized (A0P) {
                C254703su A0J = A0P.A0J(str);
                if (A0J == null) {
                    0wj.A01.AEf("PolicyViolation_DirectThreadEntry policy violation visibility changed message is missing from thread entry", 20134884).report();
                    r3 = null;
                } else {
                    synchronized (A0J) {
                        C300625xW r2 = A0J.A0W;
                        if (r2 == null) {
                            r4 = new C300625xW(0, 0, str2);
                        } else {
                            r4 = new C300625xW(r2.A00, r2.A01, str2);
                        }
                        A0J.A0W = r4;
                        A0J.A2C = true;
                    }
                    r3 = new 2Kb(A0P.A0I.BJz(), AnonymousClass05K.A0K, (List) null, (List) null, Collections.singletonList(A0J), false);
                }
            }
            2Dr.A0E(r3, r13, z);
        }
        return AnonymousClass6BL.A00;
    }
}
