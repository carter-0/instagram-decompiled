package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.44u  reason: invalid class name and case insensitive filesystem */
public final class C2602344u {
    public C250773m2 A00;
    public final 26N A01;
    public final ReentrantReadWriteLock A02 = new ReentrantReadWriteLock();

    public C2602344u(26N r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final void A00() {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = null;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.A02.writeLock().unlock();
            throw th;
        }
    }

    public final void A01(C250773m2 r3) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = r3;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.A02.writeLock().unlock();
            throw th;
        }
    }

    public final boolean A02(C61079JwH jwH) {
        boolean z;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.readLock().lock();
            C250773m2 r3 = this.A00;
            if (r3 == null) {
                z = this.A01.A01(new C65949M5m(jwH, this));
            } else {
                z = r3.subscribe(jwH.A02, (C2605346a) jwH.A01, (MqttSubscribeListener) jwH.A00);
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            this.A02.readLock().unlock();
            throw th;
        }
    }

    public final boolean A03(List list) {
        boolean z;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.readLock().lock();
            C250773m2 r0 = this.A00;
            if (r0 != null) {
                z = r0.unsubscribe(list);
            } else {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            this.A02.readLock().unlock();
            throw th;
        }
    }
}
