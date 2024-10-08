package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Deprecated;

/* renamed from: X.7r7  reason: invalid class name and case insensitive filesystem */
public final class C343977r7 {
    public static final C343977r7 A00 = new Object();

    @Deprecated(message = "Only for Lite Camera and legacy")
    public static final C344037rD A00(UserSession userSession, String str, String str2) {
        C344037rD r1;
        0qQ.A0B(userSession, 3);
        if (182.A06(0Tu.A05, userSession, 36316332194599143L)) {
            r1 = new C368708tC();
        } else {
            r1 = new C344007rA(new ATX(AnonymousClass0eN.A01(new C377129Kq(userSession, 26)), AnonymousClass0eN.A01(new AnonymousClass9M0(15, new 0xG("OneCamera"), userSession))), str, str2);
        }
        return r1;
    }

    public final C344037rD A01(C343837qt r8) {
        C344037rD r1;
        0qQ.A0B(r8, 0);
        C343667qb r6 = C343677qc.A00;
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, (0lg) r8.Apu(r6), 36316332194599143L)) {
            r1 = new C368708tC(r8);
        } else {
            SystemClock.elapsedRealtimeNanos();
            C343987r8 r4 = new C343987r8(AnonymousClass0eN.A01(new C377129Kq(r8, 27)), AnonymousClass0eN.A01(new AnonymousClass9M0(16, new 0xG("OneCamera"), r8)));
            AtomicLong atomicLong = C344007rA.A03;
            r1 = new C344007rA(r8, r4, 182.A06(r5, (0lg) r8.Apu(r6), 36315683656568290L), 182.A06(r5, (0lg) r8.Apu(r6), 36315683656895975L));
            SystemClock.elapsedRealtimeNanos();
        }
        return r1;
    }
}
