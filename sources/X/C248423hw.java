package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.3hw  reason: invalid class name and case insensitive filesystem */
public final class C248423hw extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248423hw(2Lk r7) {
        super("initializeLocationManagerDetours", 389, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        if (userSession != null) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36311405867172365L)) {
                boolean z = false;
                if (182.A06(r2, userSession, 36311405867106828L)) {
                    z = true;
                }
                boolean z2 = false;
                if (182.A06(r2, userSession, 36311405867041291L)) {
                    z2 = true;
                }
                AnonymousClass9D2 r22 = new AnonymousClass9D2(z2, z);
                try {
                    ReadWriteLock readWriteLock = AnonymousClass0T2.A01;
                    readWriteLock.writeLock().lock();
                    AnonymousClass0T2.A00 = r22;
                    readWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    AnonymousClass0T2.A01.writeLock().unlock();
                    throw th;
                }
            }
        }
    }
}
