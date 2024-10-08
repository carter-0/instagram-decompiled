package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.44B  reason: invalid class name */
public final class AnonymousClass44B implements C2598643j {
    public final 2Dm A00;

    public AnonymousClass44B(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r10, AnonymousClass653 r11, List list, Map map, 0sL r14, 0sL r15, boolean z) {
        Long l;
        2Kb r2;
        C300625xW r3;
        0qQ.A0B(map, 0);
        0qQ.A0B(r10, 1);
        0qQ.A0B(r11, 2);
        0qQ.A0B(r14, 5);
        Object obj = map.get(RealtimeProtocol.THREAD_ID);
        String str = (String) map.get(RealtimeProtocol.ITEM_ID);
        if (obj == null || str == null || !0qQ.A0K(r11.A00, "replace")) {
            0wb.A03("PolicyViolation_IrisSyncMessageProcessor", "threadId/messageId is missing from policy violation reviewed path or operation is not replace");
            return AnonymousClass6BO.A00;
        }
        2Eq r5 = (2Eq) r14.invoke(obj, r10);
        if (r5 == null) {
            return C21215XPd.A00;
        }
        try {
            String str2 = r11.A02;
            0qQ.A06(str2);
            l = 00y.A0n(10, str2);
        } catch (Throwable th) {
            l = new 0eQ(th);
        }
        Throwable A002 = 0eR.A00(l);
        if (A002 != null) {
            0wb.A06("PolicyViolation_IrisSyncMessageProcessor", "Invalid policy violation timestampMs format", A002);
            l = null;
        }
        Number number = l;
        if (number == null) {
            0wb.A03("PolicyViolation_IrisSyncMessageProcessor", "timestamp is missing for policy violation reviewed");
            return new AnonymousClass6BR(new Exception("timestamp is missing for policy violation reviewed"), "PolicyViolation_IrisSyncMessageProcessor", "timestamp is missing for policy violation reviewed");
        }
        2Dr r1 = this.A00;
        DirectThreadKey BJy = r5.BJy();
        long longValue = number.longValue();
        2Dr r12 = r1;
        AnonymousClass48S A0P = r12.A0P(BJy);
        if (A0P == null) {
            0wb.A03("PolicyViolation_DirectThreadStoreImpl", "Entry should exist before function call");
        } else {
            synchronized (A0P) {
                C254703su A0J = A0P.A0J(str);
                if (A0J == null) {
                    0wj.A01.AEf("PolicyViolation_DirectThreadEntry policy violation reported message is missing from thread entry", 20134884).report();
                    r2 = null;
                } else {
                    synchronized (A0J) {
                        C300625xW r32 = A0J.A0W;
                        if (r32 == null) {
                            r3 = new C300625xW(0, longValue, "UNKNOWN");
                        } else {
                            r3 = new C300625xW(r32.A00, longValue, r32.A00());
                        }
                        A0J.A0W = r3;
                        A0J.A2C = true;
                    }
                    r2 = new 2Kb(A0P.A0I.BJz(), AnonymousClass05K.A0K, (List) null, (List) null, Collections.singletonList(A0J), false);
                }
            }
            2Dr.A0E(r2, r12, z);
        }
        return AnonymousClass6BL.A00;
    }
}
