package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3mS  reason: invalid class name and case insensitive filesystem */
public final class C251033mS {
    public AnonymousClass0eM A00;
    public final 27c A01;
    public final 27P A02;

    public static C251033mS A00(UserSession userSession) {
        0t0 A012 = AnonymousClass0eN.A01(new C251043mT(userSession));
        return new C251033mS(27Z.A00(userSession), 27P.A00(userSession), A012);
    }

    public final 1aU A01() {
        AnonymousClass1aS r5 = this.A02.A03;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AnonymousClass0eM r3 = this.A00;
        return r5.A0R((C269794fh) r3.getValue(), timeUnit, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT).A0P((C269794fh) r3.getValue());
    }

    public final C251053mU A02(String str) {
        27P r0 = this.A02;
        Lock lock = r0.A04;
        lock.lock();
        try {
            return (C251053mU) r0.A00.get(str);
        } finally {
            lock.unlock();
        }
    }

    public C251033mS(27c r1, 27P r2, AnonymousClass0eM r3) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
    }
}
