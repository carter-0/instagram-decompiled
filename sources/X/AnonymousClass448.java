package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.448  reason: invalid class name */
public final class AnonymousClass448 implements C2598643j {
    public final 2Dm A00;

    public AnonymousClass448(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r16, AnonymousClass653 r17, List list, Map map, 0sL r20, 0sL r21, boolean z) {
        Long l;
        2Kb r3;
        C300625xW r9;
        int i;
        C300625xW r92;
        Map map2 = map;
        0qQ.A0B(map2, 0);
        AnonymousClass651 r5 = r16;
        0qQ.A0B(r5, 1);
        AnonymousClass653 r4 = r17;
        0qQ.A0B(r4, 2);
        0sL r32 = r20;
        0qQ.A0B(r32, 5);
        Object obj = map2.get(RealtimeProtocol.THREAD_ID);
        if (obj == null || !0qQ.A0K(r4.A00, "replace")) {
            0wb.A03("PolicyViolation_Thread_IrisSyncMessageProcessor", "threadId is missing from policy violation reported path or operation is not replace");
            return AnonymousClass6BO.A00;
        }
        2Eq r33 = (2Eq) r32.invoke(obj, r5);
        if (r33 == null) {
            return C21215XPd.A00;
        }
        try {
            String str = r4.A02;
            0qQ.A06(str);
            l = 00y.A0n(10, str);
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
            0wb.A03("PolicyViolation_Thread_IrisSyncMessageProcessor", "timestamp is missing for policy violation reported");
            return new AnonymousClass6BR(new Exception("timestamp is missing for policy violation reported"), "PolicyViolation_Thread_IrisSyncMessageProcessor", "timestamp is missing for policy violation reported");
        }
        2Dr r2 = this.A00;
        DirectThreadKey BJy = r33.BJy();
        long longValue = number.longValue();
        2Dr r22 = r2;
        AnonymousClass48S A0P = r22.A0P(BJy);
        if (A0P == null) {
            0wb.A03("PolicyViolation_THREAD_DirectThreadStoreImpl", "Entry should exist before function call");
        } else {
            synchronized (A0P) {
                AnonymousClass3U9 r0 = A0P.A0I;
                if (((Boolean) r0.A05.getValue()).booleanValue()) {
                    ReentrantReadWriteLock reentrantReadWriteLock = r0.A03;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                    int i2 = 0;
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock.getReadHoldCount();
                        for (int i3 = 0; i3 < i; i3++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        AnonymousClass3S9 r52 = r0.A01;
                        C300625xW r6 = r52.A0r;
                        if (r6 == null) {
                            r92 = new C300625xW(0, longValue, "UNKNOWN");
                        } else {
                            r92 = new C300625xW(r6.A00, longValue, r6.A00());
                        }
                        r52.A0r = r92;
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                    } catch (Throwable th2) {
                        th = th2;
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                        throw th;
                    }
                } else {
                    AnonymousClass3S9 r42 = r0.A01;
                    synchronized (r42) {
                        try {
                            C300625xW r34 = r42.A0r;
                            if (r34 == null) {
                                r9 = new C300625xW(0, longValue, "UNKNOWN");
                            } else {
                                r9 = new C300625xW(r34.A00, longValue, r34.A00());
                            }
                            r42.A0r = r9;
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                }
                r3 = new 2Kb(r0.BJz(), AnonymousClass05K.A0K, (List) null, (List) null, (List) null, false);
            }
            2Dr.A0E(r3, r22, z);
        }
        return AnonymousClass6BL.A00;
    }
}
