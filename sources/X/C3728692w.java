package X;

import android.location.LocationManager;
import android.os.Looper;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.92w  reason: invalid class name and case insensitive filesystem */
public final class C3728692w implements Runnable {
    public final /* synthetic */ Q0H A00;
    public final /* synthetic */ Set A01;

    public C3728692w(Q0H q0h, Set set) {
        this.A00 = q0h;
        this.A01 = set;
    }

    public final void run() {
        LocationManager locationManager;
        C270914hb r0;
        Q0H q0h = this.A00;
        Set set = this.A01;
        synchronized (q0h) {
            if (q0h.A06.get()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (q0h.A00 != null && (r0 = q0h.A0A) != null && C270914hb.A00(r0) != AnonymousClass05K.A00) {
                        q0h.A06();
                        break;
                    }
                    if (q0h.A0B.A03()) {
                        try {
                            AnonymousClass9QC r02 = q0h.A02;
                            if (r02 == null || !r02.A09) {
                                q0h.A01 = "SingleSubscription";
                                LocationManager locationManager2 = q0h.A02;
                                if (locationManager2 != null) {
                                    Q0I q0i = q0h.A04;
                                    0fW r03 = 0fW.$redex_init_class;
                                    if (AnonymousClass0T2.A01()) {
                                        try {
                                            AnonymousClass0T2.A01.readLock().lock();
                                            0qQ.A0B(str, 1);
                                            0qQ.A0B(q0i, 2);
                                            0qQ.A0B((Object) null, 3);
                                            throw AnonymousClass00P.createAndThrow();
                                        } catch (Throwable th) {
                                            th = th;
                                            AnonymousClass0T2.A01.readLock().unlock();
                                            throw th;
                                        }
                                    } else {
                                        locationManager2.requestSingleUpdate(str, q0i, (Looper) null);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    AnonymousClass9QC r1 = q0h.A00;
                    q0h.A01 = "ContinuousSubscription";
                    if (!(r1 == null || (locationManager = q0h.A02) == null)) {
                        0fW.A02(q0h.A04, locationManager, str, 0.0f, -1796640290, r1.A03);
                    }
                }
            }
        }
    }
}
