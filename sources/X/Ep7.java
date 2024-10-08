package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class Ep7 {
    public static void A00(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r10, UserSession userSession) {
        AnonymousClass7TG.A1U(userSession, fragmentActivity, r10);
        C279244yJ r3 = C283535Ib.A01;
        if (C279244yJ.A00(userSession)) {
            C62880wX r7 = C61170le.A00;
            0xm A00 = AnonymousClass0xl.A00(r7);
            if (C279244yJ.A01(userSession)) {
                0xm A002 = AnonymousClass0xl.A00(r7);
                A002.A01(A002.A00.getInt("preference_push_permission_impression_count", 0) + 1);
                AnonymousClass36Z.A01(fragmentActivity, r10, userSession, new MJ8(0, context, userSession));
            }
            if (!AnonymousClass0xl.A00(r7).A00.getBoolean("preference_has_denied_push_system_dialog", false)) {
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36319570599878118L)) {
                    long A01 = 182.A01(r2, userSession, 36601045576650838L);
                    if (r3.A02(userSession, A01)) {
                        AnonymousClass36Z.A01(fragmentActivity, r10, userSession, new MJ8(0, context, userSession));
                        A00.A04(false);
                        0xm A003 = AnonymousClass0xl.A00(r7);
                        A003.A01(A003.A00.getInt("preference_push_permission_impression_count", 0) + 1);
                        if (((long) A00.A00.getInt("preference_push_permission_impression_count", 0)) >= A01) {
                            0xm A004 = AnonymousClass0xl.A00(r7);
                            A004.A01(0);
                            A004.A04(true);
                            long currentTimeMillis = System.currentTimeMillis();
                            0xY A0d = DbS.A0d(A004);
                            A0d.E5c(C273654mx.A00(363), currentTimeMillis);
                            A0d.apply();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            0xa r1 = A00.A00;
            if (!r1.getBoolean(C273654mx.A00(361), false) && r1.getInt("preference_push_permission_impression_count", 0) == 0) {
                AnonymousClass36Z.A01(fragmentActivity, r10, userSession, new MJ8(0, context, userSession));
                0xm A005 = AnonymousClass0xl.A00(r7);
                A005.A01(A005.A00.getInt("preference_push_permission_impression_count", 0) + 1);
            }
        }
    }
}
