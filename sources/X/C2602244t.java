package X;

import android.os.Handler;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.44t  reason: invalid class name and case insensitive filesystem */
public final class C2602244t {
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public C250773m2 A00;
    public boolean A01 = true;
    public final 26N A02;
    public final LinkedList A03 = new LinkedList();
    public final ReentrantReadWriteLock A04 = new ReentrantReadWriteLock();

    public C2602244t(26N r3) {
        0qQ.A0B(r3, 1);
        this.A02 = r3;
    }

    public final int A00(MqttPublishListener mqttPublishListener, C2605346a r16, String str, String str2, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        C12143Sno sno;
        try {
            reentrantReadWriteLock = this.A04;
            reentrantReadWriteLock.readLock().lock();
            int i = -1;
            String str3 = str;
            if (!this.A01) {
                0KC.A0D("MqttXplatPublisher", 002.A0R("Publisher is disabled for msg to ", str3));
            } else {
                String str4 = str2;
                if (str2 == null || str4.equals((Object) null)) {
                    C250773m2 r0 = this.A00;
                    MqttPublishListener mqttPublishListener2 = mqttPublishListener;
                    C2605346a r10 = r16;
                    byte[] bArr2 = bArr;
                    if (r0 == null) {
                        reentrantReadWriteLock.readLock().unlock();
                        reentrantReadWriteLock.writeLock().lock();
                        C250773m2 r02 = this.A00;
                        if (r02 == null) {
                            sno = new C12143Sno(mqttPublishListener2, this, r10, str3, bArr2, A05.incrementAndGet());
                            LinkedList linkedList = this.A03;
                            if (linkedList.size() >= 100) {
                                linkedList.poll();
                            }
                            linkedList.offer(sno);
                            sno.A00.set(true);
                            26N r6 = this.A02;
                            C12959TFs tFs = new C12959TFs(sno, this);
                            r6.A03.incrementAndGet();
                            AnonymousClass9M0 r5 = new AnonymousClass9M0(8, tFs, r6);
                            Handler A002 = r6.A00();
                            if (A002 != null) {
                                A002.postDelayed(new C45976DHf(r5), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                            }
                        } else {
                            sno = new C12143Sno((MqttPublishListener) null, this, r10, str3, bArr2, r02.publish(str3, bArr2, r10, mqttPublishListener));
                        }
                        reentrantReadWriteLock.writeLock().unlock();
                        reentrantReadWriteLock.readLock().lock();
                        i = sno.A01;
                    } else {
                        i = r0.publish(str3, bArr2, r10, mqttPublishListener);
                    }
                } else {
                    0KC.A0D("MqttXplatPublisher", 002.A0u("The target user id ", str4, " doesn't match the client's user id ", (String) null));
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            return i;
        } catch (Throwable th) {
            this.A04.readLock().unlock();
            throw th;
        }
    }

    public final void A02(C250773m2 r7) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A04;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = r7;
            while (true) {
                LinkedList linkedList = this.A03;
                if (!linkedList.isEmpty()) {
                    C12143Sno sno = (C12143Sno) linkedList.poll();
                    if (sno != null && !sno.A04.get() && sno.A00.compareAndSet(true, false) && r7.publish(sno.A03, sno.A05, sno.A02, sno) == -1) {
                        sno.onFailure(0, 0);
                    }
                } else {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
            }
        } catch (Throwable th) {
            this.A04.writeLock().unlock();
            throw th;
        }
    }

    public final void A01() {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A04;
            reentrantReadWriteLock.writeLock().lock();
            this.A00 = null;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.A04.writeLock().unlock();
            throw th;
        }
    }

    public final boolean A03(int i) {
        boolean z;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A04;
            reentrantReadWriteLock.readLock().lock();
            C250773m2 r0 = this.A00;
            if (r0 != null) {
                z = r0.cancelPublish(i);
            } else {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            this.A04.readLock().unlock();
            throw th;
        }
    }
}
