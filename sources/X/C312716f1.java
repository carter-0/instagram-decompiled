package X;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.6f1  reason: invalid class name and case insensitive filesystem */
public final class C312716f1 {
    public final AnonymousClass6f0 A00;
    public final List A01;
    public final ScheduledExecutorService A02;
    public final ReentrantLock A03;
    public volatile C312746f6 A04 = null;
    public volatile boolean A05;

    public final synchronized void A01(C312746f6 r5) {
        if (this.A04 != r5) {
            this.A04 = r5;
            for (AnonymousClass2gO r2 : this.A01) {
                this.A02.execute(new C306266Lm(r2, r5));
            }
        }
    }

    public final void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            if (this.A04 == null && !this.A05) {
                this.A05 = true;
                AnonymousClass6f0 r6 = this.A00;
                C312756f7 r5 = new C312756f7(this);
                1Ef build = ((C312776f9) C312766f8.class.getMethod("create", new Class[0]).invoke((Object) null, new Object[0])).build();
                0qQ.A07(build);
                r6.A00.ATL(new C312806fC(r5), new C312796fB(r5), build);
            }
            reentrantLock.unlock();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public C312716f1(AnonymousClass6f0 r2, ScheduledExecutorService scheduledExecutorService) {
        this.A00 = r2;
        this.A02 = scheduledExecutorService;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        0qQ.A07(synchronizedList);
        this.A01 = synchronizedList;
        this.A03 = new ReentrantLock();
    }
}
