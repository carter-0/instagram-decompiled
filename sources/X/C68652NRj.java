package X;

import com.instagram.banyan.BanyanCoordinator;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.NRj  reason: case insensitive filesystem */
public final class C68652NRj extends 0ng {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ 2Kd A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68652NRj(BanyanCoordinator banyanCoordinator, 2Kd r5) {
        super(20, 3, true, true);
        this.A00 = banyanCoordinator;
        this.A01 = r5;
    }

    public final void run() {
        InterruptedException th;
        BanyanCoordinator banyanCoordinator = this.A00;
        String A0x = C66580MXl.A0x(this.A01.A00);
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = banyanCoordinator.A09.A00;
            if (C66582MXn.A1V(reentrantReadWriteLock)) {
                try {
                    C290675fi r3 = banyanCoordinator.A07;
                    C290655fg r2 = r3.A02;
                    r2.A00();
                    if (r3.A08.remove(A0x) != null) {
                        Iterator A0v = AnonymousClass7TF.A0v(r3.A07);
                        while (A0v.hasNext()) {
                            C66580MXl.A1S(((C290935gF) A0v.next()).A04, A0x);
                        }
                    }
                    r2.A00();
                    C290675fi.A00(r3, (C293635l6) null);
                    C66580MXl.A1W(reentrantReadWriteLock);
                } catch (Throwable th2) {
                    th = th2;
                    C66580MXl.A1W(reentrantReadWriteLock);
                }
            } else {
                th = new InterruptedException("Failed to claim lock after 1 seconds");
                throw th;
            }
        } catch (InterruptedException e) {
            0KC.A0F("BanyanCoordinator", C273654mx.A00(12), e);
        }
    }
}
