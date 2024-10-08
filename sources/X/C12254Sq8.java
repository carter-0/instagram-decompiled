package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Sq8  reason: case insensitive filesystem */
public final class C12254Sq8 implements C13803ThS {
    public C2596142j A00 = C2596142j.A00;
    public boolean A01;
    public final AnonymousClass45J A02;
    public final ReentrantLock A03;

    public final String Anh() {
        return "device_auth";
    }

    public final synchronized C2596142j BK9() {
        C2596142j r0;
        try {
            ReentrantLock reentrantLock = this.A03;
            reentrantLock.lock();
            r0 = this.A00;
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.A03.unlock();
            throw th;
        }
        return r0;
    }

    public final synchronized boolean FJS(C2596142j r7) {
        boolean z;
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A00.equals(r7)) {
            reentrantLock.unlock();
            z = false;
        } else {
            CountDownLatch A0y = Pxf.A0y();
            C10558RuC ruC = new C10558RuC(r7, this, A0y);
            C13849TiS AR1 = this.A02.AR1();
            AR1.E5e("/settings/mqtt/id/connection_key", (String) r7.first);
            AR1.E5e("/settings/mqtt/id/connection_secret", (String) r7.second);
            AR1.AIQ(ruC);
            try {
                A0y.await(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                0KC.A0F("MqttDeviceAuthCredentials", "Interrupted while waiting for latch", e);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
            z = this.A01;
            reentrantLock.unlock();
        }
        return z;
    }

    public final synchronized void clear() {
        FJS(C2596142j.A00);
    }

    public C12254Sq8(AnonymousClass45J r6) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A03 = reentrantLock;
        this.A01 = false;
        this.A02 = r6;
        reentrantLock.lock();
        CountDownLatch A0y = Pxf.A0y();
        AnonymousClass45I r62 = (AnonymousClass45I) r6;
        this.A00 = C2596142j.A00(r62.getString("/settings/mqtt/id/connection_key", ""), r62.getString("/settings/mqtt/id/connection_secret", ""));
        A0y.countDown();
        try {
            A0y.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            0KC.A0F("MqttDeviceAuthCredentials", "Interrupted while waiting for latch", e);
        }
        reentrantLock.unlock();
    }
}
