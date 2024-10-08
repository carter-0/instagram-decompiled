package X;

import com.instagram.igsignals.core.IgSignalsModelPrediction;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.KSb  reason: case insensitive filesystem */
public final class C61930KSb extends LDU {
    public IgSignalsModelPrediction A00;
    public boolean A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final ReentrantLock A03 = new ReentrantLock();

    /* JADX INFO: finally extract failed */
    public final void A00(IgSignalsModelPrediction igSignalsModelPrediction) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            this.A00 = igSignalsModelPrediction;
            List<LDU> list = this.A02;
            for (LDU A002 : list) {
                A002.A00(igSignalsModelPrediction);
            }
            list.clear();
            reentrantLock.unlock();
            super.A00(igSignalsModelPrediction);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public C61930KSb(C65380LsL lsL, AnonymousClass566 r3, C62943Kov kov) {
        super(lsL, r3, kov);
    }
}
