package X;

import com.facebook.mqtt.service.XplatServiceDelegate;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.TBr  reason: case insensitive filesystem */
public final class C12877TBr implements Runnable {
    public final /* synthetic */ XplatServiceDelegate A00;

    public C12877TBr(XplatServiceDelegate xplatServiceDelegate) {
        this.A00 = xplatServiceDelegate;
    }

    public final void run() {
        if (XplatServiceDelegate.A07 == null) {
            0KC.A0C("MqttXplatService", "Service have been destroyed!");
            return;
        }
        0qQ.A0B(AnonymousClass05K.A00, 0);
        C2602244t r3 = XplatServiceDelegate.A02;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = r3.A04;
            reentrantReadWriteLock.writeLock().lock();
            r3.A01 = false;
            0KC.A0D("MqttXplatPublisher", "Disabling publisher and flushing pending tasks");
            while (true) {
                LinkedList linkedList = r3.A03;
                if (!linkedList.isEmpty()) {
                    C12143Sno sno = (C12143Sno) linkedList.poll();
                    if (sno != null && !sno.A04.get() && sno.A00.compareAndSet(true, false)) {
                        sno.onFailure(0, 0);
                    }
                } else {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
            }
        } catch (Throwable th) {
            r3.A04.writeLock().unlock();
            throw th;
        }
    }
}
