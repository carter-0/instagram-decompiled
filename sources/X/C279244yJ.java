package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4yJ  reason: invalid class name and case insensitive filesystem */
public final class C279244yJ {
    public static final boolean A00(UserSession userSession) {
        if (AnonymousClass0xl.A00(C61170le.A00).A00.getInt("session_count_for_push_permission", 0) == 1) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36327542059514364L)) {
                return true;
            }
            if (182.A06(r2, userSession, 36327542059448827L)) {
                return false;
            }
        }
        0Tu r22 = 0Tu.A05;
        if (182.A06(r22, userSession, 36320944989414370L) || 182.A06(r22, userSession, 2342165049419835290L)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        0xa r4 = AnonymousClass0xl.A00(C61170le.A00).A00;
        if (r4.getInt("session_count_for_push_permission", 0) != 1 || !182.A06(0Tu.A05, userSession, 36327542059514364L) || r4.getBoolean("preference_has_allowed_push_system_dialog", false) || r4.getBoolean(AnonymousClass000.A00(3765), false)) {
            return false;
        }
        return true;
    }

    public final boolean A02(UserSession userSession, long j) {
        C62880wX r4 = C61170le.A00;
        0xm A00 = AnonymousClass0xl.A00(r4);
        0xa r3 = A00.A00;
        if (!r3.getBoolean(AnonymousClass000.A00(3765), false) && ((long) r3.getInt("preference_push_permission_impression_count", 0)) < j && !r3.getBoolean("preference_has_allowed_push_system_dialog", false)) {
            String A002 = AnonymousClass000.A00(3766);
            if (!r3.getBoolean(A002, false)) {
                return true;
            }
            0xa r32 = AnonymousClass0xl.A00(r4).A00;
            if (r32.getBoolean(A002, false) && System.currentTimeMillis() >= r32.getLong("preference_push_permission_cooldown_start_timestamp", 0) + TimeUnit.DAYS.toMillis(182.A01(0Tu.A05, userSession, 36601045576716375L))) {
                return true;
            }
        }
        A00.A03(false);
        return false;
    }
}
