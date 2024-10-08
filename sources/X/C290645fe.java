package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.banyan.BanyanCoordinator;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5fe  reason: invalid class name and case insensitive filesystem */
public final class C290645fe implements AnonymousClass0lh {
    public static boolean A02;
    public final BanyanCoordinator A00;
    public final AnonymousClass0eM A01;

    public C290645fe(UserSession userSession, boolean z) {
        Lock writeLock;
        InterruptedException th;
        0qQ.A0B(userSession, 1);
        this.A01 = AnonymousClass0eN.A00(0eO.A03, new C377199Kx(userSession, 41));
        AwakeTimeSinceBootClock.INSTANCE.now();
        BanyanCoordinator banyanCoordinator = new BanyanCoordinator(userSession);
        this.A00 = banyanCoordinator;
        if (z) {
            banyanCoordinator.A0A();
        } else {
            boolean A06 = 182.A06(0Tu.A05, userSession, 36327576419908125L);
            1ES.A05(new C290815g0(new C290805fz(this, A06), 1967622104), 1967622104, 2, A06, false);
        }
        try {
            C290655fg r1 = banyanCoordinator.A09;
            if (r1.A01) {
                writeLock = r1.A00.readLock();
            } else {
                writeLock = r1.A00.writeLock();
            }
            if (writeLock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    if (!banyanCoordinator.A04) {
                        1Ng A002 = AnonymousClass1Nd.A00(banyanCoordinator.A0I);
                        A002.A01(banyanCoordinator.A0F, 27U.class);
                        A002.A01(banyanCoordinator.A0H, C290835g2.class);
                        A002.A01(banyanCoordinator.A0G, AnonymousClass3KA.class);
                        A002.A01(banyanCoordinator.A0E, 2Kd.class);
                        A002.A01(banyanCoordinator.A0D, C290845g3.class);
                        A002.A01(banyanCoordinator.A0C, C70162Jt.class);
                        banyanCoordinator.A04 = true;
                    }
                    writeLock.unlock();
                    A02 = true;
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

    public final C290865g5 A01(String str) {
        C290865g5 A07;
        0qQ.A0B(str, 0);
        if (!A00(this)) {
            return this.A00.A07(str);
        }
        synchronized (this) {
            A07 = this.A00.A07(str);
        }
        return A07;
    }

    public static final boolean A00(C290645fe r0) {
        Object value = r0.A01.getValue();
        0qQ.A07(value);
        return ((Boolean) value).booleanValue();
    }

    public final void onSessionWillEnd() {
        this.A00.A0H(false);
    }

    public final C290865g5 A02(String str, String str2, String str3, Set set, Set set2) {
        C290865g5 A002;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Set set3 = set;
        Set set4 = set2;
        if (!A00(this)) {
            return BanyanCoordinator.A00(this.A00, str4, str5, str6, set3, set4);
        }
        synchronized (this) {
            A002 = BanyanCoordinator.A00(this.A00, str4, str5, str6, set3, set4);
        }
        return A002;
    }

    public final String A03(String str) {
        String A09;
        if (!A00(this)) {
            return this.A00.A09(str);
        }
        synchronized (this) {
            A09 = this.A00.A09(str);
        }
        return A09;
    }

    public final void A04(C290995gL r3, boolean z) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0C(r3, "", z);
            }
            return;
        }
        this.A00.A0C(r3, "", z);
    }

    public final void A05(String str) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0D(str);
            }
            return;
        }
        this.A00.A0D(str);
    }

    public final void A06(String str) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0E(str);
            }
            return;
        }
        this.A00.A0E(str);
    }

    public final void A07(String str) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0F(str);
            }
            return;
        }
        this.A00.A0F(str);
    }

    public final void A08(ArrayList arrayList) {
        if (A00(this)) {
            synchronized (this) {
                this.A00.A0G(arrayList);
            }
            return;
        }
        this.A00.A0G(arrayList);
    }
}
