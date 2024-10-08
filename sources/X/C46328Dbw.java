package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.Map;

/* renamed from: X.Dbw  reason: case insensitive filesystem */
public final class C46328Dbw implements 2Ax {
    public final 2Ay A00;
    public final UserSession A01;

    public C46328Dbw(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        2Ay r1 = 2Ay.A06;
        this.A00 = r1;
        2B0.A01.A06(userSession, r1);
    }

    public final 2Ay CAd() {
        return this.A00;
    }

    public final AnonymousClass9IL Crb(Map map) {
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A01;
        if (!r0.A01(userSession).A1Z() || !182.A06(0Tu.A05, userSession, 36316001483689832L)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis < DbW.A06(2B0.A01.A07(userSession), "BEDTIME_REMINDER_BLOCKING_SCREEN_ELIGIBLE_TIMESTAMP_SECONDS") || !new AnonymousClass3FW(userSession).A07(currentTimeMillis) || !new AnonymousClass3FW(userSession).A07(currentTimeMillis)) {
            return null;
        }
        long A002 = (C280074zx.A00() / 1000) + new AnonymousClass3FW(userSession).A01();
        if (currentTimeMillis <= A002) {
            A002 -= SandboxRepository.CACHE_TTL;
        }
        Long valueOf = Long.valueOf(A002);
        if (valueOf != null) {
            return new AnonymousClass9IL(valueOf.longValue(), Long.valueOf(C46359DdX.A02(userSession, currentTimeMillis)), 3);
        }
        return null;
    }
}
