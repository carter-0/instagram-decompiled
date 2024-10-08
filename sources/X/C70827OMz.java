package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.OMz  reason: case insensitive filesystem */
public final class C70827OMz {
    public C39894ADw A00;
    public boolean A01;
    public final C263534Mj A02;
    public final C71256OgN A03;
    public final C263484Me A04;
    public final AtomicInteger A05 = new AtomicInteger(1);
    public final AtomicReference A06;
    public final Handler A07;
    public final HeroPlayerSetting A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final ReentrantLock A0B;
    public volatile int A0C;

    public C70827OMz(Handler handler, C263534Mj r4, C263624Ms r5, C263484Me r6, HeroPlayerSetting heroPlayerSetting) {
        this.A07 = handler;
        this.A02 = r4;
        AtomicReference atomicReference = new AtomicReference(C69308Nj9.UNSET);
        this.A06 = atomicReference;
        this.A03 = new C71256OgN(r5, atomicReference);
        this.A08 = heroPlayerSetting;
        this.A04 = r6;
        this.A0B = new ReentrantLock();
        this.A0A = new C73051PUi(this);
        this.A09 = new C73050PUh(this);
    }

    public final void A00() {
        ReentrantLock reentrantLock;
        boolean tryLock;
        if (this.A01) {
            try {
                reentrantLock = this.A0B;
                tryLock = reentrantLock.tryLock(1, TimeUnit.SECONDS);
                this.A09.run();
                if (tryLock) {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                if (tryLock) {
                    reentrantLock.unlock();
                }
                throw th;
            }
        }
    }

    public final void A01() {
        if (!this.A01) {
            ReentrantLock reentrantLock = this.A0B;
            reentrantLock.lock();
            try {
                this.A0A.run();
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
