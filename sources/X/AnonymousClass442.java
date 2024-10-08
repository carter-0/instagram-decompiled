package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.442  reason: invalid class name */
public final class AnonymousClass442 implements C2598643j {
    public final 2Dm A00;

    public AnonymousClass442(2Dm r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r16, AnonymousClass653 r17, List list, Map map, 0sL r20, 0sL r21, boolean z) {
        int i;
        Map map2 = map;
        0qQ.A0B(map2, 0);
        AnonymousClass651 r5 = r16;
        0qQ.A0B(r5, 1);
        AnonymousClass653 r6 = r17;
        0qQ.A0B(r6, 2);
        0sL r4 = r20;
        0qQ.A0B(r4, 5);
        Object obj = map2.get(RealtimeProtocol.THREAD_ID);
        Boolean A002 = C48861ElN.A00(r6.A02);
        if (obj == null || A002 == null || !"replace".equals(r6.A00)) {
            return AnonymousClass6BO.A00;
        }
        boolean booleanValue = A002.booleanValue();
        2Eq r0 = (2Eq) r4.invoke(obj, r5);
        if (r0 == null) {
            return C21215XPd.A00;
        }
        2Dr r2 = this.A00;
        DirectThreadKey BJy = r0.BJy();
        2Dr r22 = r2;
        synchronized (r22) {
            AnonymousClass48S A0P = r22.A0P(BJy);
            if (A0P != null) {
                AnonymousClass3U9 r8 = A0P.A0I;
                if (((Boolean) r8.A05.getValue()).booleanValue()) {
                    ReentrantReadWriteLock reentrantReadWriteLock = r8.A03;
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
                        r8.A01.A2S = booleanValue;
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                    } catch (Throwable th) {
                        th = th;
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                        throw th;
                    }
                } else {
                    AnonymousClass3S9 r1 = r8.A01;
                    synchronized (r1) {
                        try {
                            r1.A2S = booleanValue;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
                if (z) {
                    2Dr.A0F(r22, A0P);
                }
                2Kb r82 = new 2Kb(BJy, AnonymousClass05K.A0D, (List) null, (List) null, (List) null, false);
                r22.A06.A00(r82);
                r22.A09.accept(r82);
            }
        }
        return AnonymousClass6BL.A00;
    }
}
