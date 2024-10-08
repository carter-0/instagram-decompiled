package X;

import com.instagram.banyan.BanyanCoordinator;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5fx  reason: invalid class name and case insensitive filesystem */
public final class C290785fx implements C61110lV {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ UserSession A01;

    public C290785fx(BanyanCoordinator banyanCoordinator, UserSession userSession) {
        this.A00 = banyanCoordinator;
        this.A01 = userSession;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-735594862);
        this.A00.A03 = true;
        AnonymousClass0fD.A0A(-1086820214, A03);
    }

    public final void onAppForegrounded() {
        Lock writeLock;
        InterruptedException th;
        int A03 = AnonymousClass0fD.A03(1509606034);
        BanyanCoordinator banyanCoordinator = this.A00;
        if (banyanCoordinator.A03) {
            if (182.A06(0Tu.A05, banyanCoordinator.A0I, 36324355193516061L)) {
                banyanCoordinator.A0A();
            }
        }
        if (182.A06(0Tu.A05, this.A01, 36324355193647135L)) {
            try {
                C290655fg r1 = banyanCoordinator.A09;
                if (r1.A01) {
                    writeLock = r1.A00.readLock();
                } else {
                    writeLock = r1.A00.writeLock();
                }
                if (writeLock.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        C290675fi r12 = banyanCoordinator.A07;
                        r12.A02.A00();
                        if (r12.A07.containsKey("reshare_share_sheet")) {
                            C290935gF A02 = r12.A02("reshare_share_sheet");
                            if (A02 == null) {
                                writeLock.unlock();
                            } else {
                                for (Object next : A02.A04.values()) {
                                    0qQ.A07(next);
                                    if (((C290955gH) next).A00 == 0.0d) {
                                        writeLock.unlock();
                                    }
                                }
                                writeLock.unlock();
                            }
                        } else {
                            writeLock.unlock();
                        }
                        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(839557200, 3));
                        1Eo.A05(19B.A00, new MFS(banyanCoordinator, (AnonymousClass4D7) null, 32), A022);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        writeLock.unlock();
                    }
                } else {
                    th = new InterruptedException("Failed to claim lock after 1 seconds");
                    throw th;
                }
            } catch (IOException | InterruptedException e) {
                0KC.A0F("BanyanCoordinator", "Unable to acquire lock for executing this block.", e);
            }
        }
        banyanCoordinator.A03 = false;
        AnonymousClass0fD.A0A(-391251910, A03);
    }
}
