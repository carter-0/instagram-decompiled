package X;

import com.facebook.proxygen.LigerSamplePolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.7lZ  reason: invalid class name and case insensitive filesystem */
public class C340627lZ {
    public C340917m2 A00;
    public long A01 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
    public Condition A02;
    public final ReentrantLock A03 = new ReentrantLock();

    public final void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.await(this.A01, TimeUnit.MILLISECONDS);
            }
            if (this.A02 != null) {
                this.A02 = null;
                C340917m2 r0 = this.A00;
                if (r0 != null) {
                    r0.Drj();
                }
            }
            reentrantLock.unlock();
        } catch (InterruptedException e) {
            throw new RuntimeException("Operation blocker interrupted. ", e);
        } catch (Throwable th) {
            if (this.A02 != null) {
                this.A02 = null;
                C340917m2 r02 = this.A00;
                if (r02 != null) {
                    r02.Drj();
                }
            }
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void A01() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.signal();
            }
        } finally {
            this.A02 = null;
            reentrantLock.unlock();
        }
    }

    public final void A02(long j) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A02 == null) {
            this.A02 = reentrantLock.newCondition();
            if (j <= 0) {
                j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            }
            this.A01 = j;
            reentrantLock.unlock();
            return;
        }
        throw new IllegalStateException("There is already a block condition being used.");
    }
}
