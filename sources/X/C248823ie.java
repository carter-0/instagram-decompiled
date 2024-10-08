package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ie  reason: invalid class name and case insensitive filesystem */
public final class C248823ie extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248823ie(2Lk r3) {
        super("initCasdDetector", 1606061422);
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.9EW, java.lang.Object, X.0Un] */
    public final void loggedRun() {
        int i;
        0Uk[] r7;
        int i2;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 1);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36314983574866857L)) {
            i = (int) 182.A01(r2, userSession, 36596458551511539L);
        } else {
            i = 0;
        }
        0wj r0 = 0wj.A01;
        ? obj = new Object();
        obj.A00 = r0;
        0Uj r8 = new 0Uj(obj, i);
        synchronized (0Um.class) {
            0Um.A01 = r8;
            r7 = 0Um.A02;
            i2 = 0Um.A00;
            0Um.A02 = null;
        }
        if (i > 0 && r7 != null) {
            int length = r7.length;
            int min = Math.min(i2, length);
            for (int i3 = 0; i3 < min; i3++) {
                0Uk r02 = r7[i3];
                r8.A00(r02.A02, r02.A00, r02.A01);
            }
            if (min < i2) {
                0f9 AEf = obj.A00.AEf("content_resolver_dropped", 817892585);
                AEf.ABO("early_calls_count", i2);
                AEf.ABO("buffer_size", length);
                AEf.report();
            }
        }
    }
}
