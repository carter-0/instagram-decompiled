package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: X.9Ri  reason: invalid class name and case insensitive filesystem */
public final class C378819Ri extends 0ng {
    public final /* synthetic */ C66633Ma2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C378819Ri(C66633Ma2 ma2, int i) {
        super(899347975, i, false, false);
        this.A00 = ma2;
    }

    public final void run() {
        Lock writeLock;
        InterruptedException th;
        Lock writeLock2;
        InterruptedException th2;
        AnonymousClass9B2 r3 = this.A00.A0J;
        if (r3 != null) {
            synchronized (r3) {
                AnonymousClass9B4 r5 = r3.A00;
                UserSession userSession = r5.A08;
                if (182.A06(0Tu.A06, userSession, 36320438183272877L)) {
                    if (!r5.A06) {
                        try {
                            C290655fg r1 = r5.A07;
                            if (r1.A01) {
                                writeLock2 = r1.A00.readLock();
                            } else {
                                writeLock2 = r1.A00.writeLock();
                            }
                            if (writeLock2.tryLock(1, TimeUnit.SECONDS)) {
                                try {
                                    boolean A1R = AnonymousClass7TF.A1R((((double) (AnonymousClass7TG.A0I() - r5.A03.A01.getLong("last_sync_prompts_timestamp_sec", -1))) > 182.A00(0Tu.A05, userSession, 37164863113462136L) ? 1 : (((double) (AnonymousClass7TG.A0I() - r5.A03.A01.getLong("last_sync_prompts_timestamp_sec", -1))) == 182.A00(0Tu.A05, userSession, 37164863113462136L) ? 0 : -1)));
                                    writeLock2.unlock();
                                    if (A1R) {
                                        AnonymousClass9B4.A02(r5);
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    writeLock2.unlock();
                                }
                            } else {
                                th2 = new InterruptedException("Failed to claim lock after 1 seconds");
                                throw th2;
                            }
                        } catch (InterruptedException e) {
                            0KC.A0F(AnonymousClass9B4.A0B, C273654mx.A00(12), e);
                        }
                    }
                    try {
                        C290655fg r12 = r5.A07;
                        if (r12.A01) {
                            writeLock = r12.A00.readLock();
                        } else {
                            writeLock = r12.A00.writeLock();
                        }
                        if (writeLock.tryLock(1, TimeUnit.SECONDS)) {
                            try {
                                r5.A01 = r5.A03.A00();
                            } catch (IOException e2) {
                                0wb.A06(AnonymousClass9B4.A0B, "Error while deserializing prompt", e2);
                                AnonymousClass9B4.A02(r5);
                            } catch (Throwable th4) {
                                th = th4;
                                writeLock.unlock();
                            }
                            writeLock.unlock();
                        } else {
                            th = new InterruptedException("Failed to claim lock after 1 seconds");
                            throw th;
                        }
                    } catch (InterruptedException e3) {
                        0KC.A0F(AnonymousClass9B4.A0B, C273654mx.A00(12), e3);
                    }
                }
            }
            return;
        }
        return;
    }
}
