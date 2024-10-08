package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.44U  reason: invalid class name */
public final class AnonymousClass44U implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public AnonymousClass44U(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r16, AnonymousClass653 r17, List list, Map map, 0sL r20, 0sL r21, boolean z) {
        A5N a5n;
        int i;
        Map map2 = map;
        0qQ.A0B(map2, 0);
        AnonymousClass653 r2 = r17;
        0qQ.A0B(r2, 2);
        String str = (String) map2.get(RealtimeProtocol.THREAD_ID);
        if (str == null || !0qQ.A0K(r2.A00, "replace")) {
            return AnonymousClass6BO.A00;
        }
        String str2 = r2.A02;
        0qQ.A06(str2);
        try {
            DirectThreadKey directThreadKey = new DirectThreadKey(str, (List) null);
            C300585xS parseFromJson = C300595xT.parseFromJson(0c9.A04.A01(this.A00, str2));
            if (parseFromJson == null || (a5n = parseFromJson.A0g) == null) {
                String simpleName = getClass().getSimpleName();
                0qQ.A07(simpleName);
                return new AnonymousClass6BQ(new Exception("Invalid instamadilloCutoverMetadata payload"), simpleName, "Invalid instamadilloCutoverMetadata payload");
            }
            2Dr r5 = this.A01;
            AnonymousClass48S A0P = r5.A0P(directThreadKey);
            if (A0P != null) {
                synchronized (A0P) {
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
                            r8.A01.A0y = a5n;
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
                                r1.A0y = a5n;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    }
                }
                2Kb r82 = new 2Kb(directThreadKey, AnonymousClass05K.A0D, (List) null, (List) null, (List) null, false);
                r5.A06.A00(r82);
                r5.A09.accept(r82);
            }
            return AnonymousClass6BL.A00;
        } catch (IOException e) {
            String simpleName2 = getClass().getSimpleName();
            0KC.A0F(simpleName2, "Invalid instamadilloCutoverMetadata payload", e);
            0qQ.A07(simpleName2);
            return new AnonymousClass6BQ(e, simpleName2, "Invalid instamadilloCutoverMetadata payload");
        }
    }
}
