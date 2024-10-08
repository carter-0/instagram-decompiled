package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.3Gi  reason: invalid class name and case insensitive filesystem */
public abstract class C239403Gi {
    public static final C239413Gj A01(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C239413Gj) userSession.A01(C239413Gj.class, new AnonymousClass9M1(36, context.getApplicationContext(), userSession));
    }

    public static final void A03(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        if (!userSession.A07()) {
            1OP r0 = 1OP.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession);
            0qQ.A07(A03);
            Reel A0M = A03.A0M(str);
            if (A0M != null) {
                C270194gL r1 = A0M.A0H;
                if (A0M.A0d() && r1 != null) {
                    C278114wI r02 = r1.A06;
                    if (r02 == null) {
                        r02 = C278114wI.UNKNOWN;
                    }
                    if (!r02.A00()) {
                        r1.A06 = C278114wI.STOPPED;
                        A0M.A0R(userSession);
                    }
                }
            }
        }
    }

    public static final FragmentActivity A00() {
        try {
            if (2MD.A01().A0A()) {
                return 2MD.A01().A06();
            }
            return null;
        } catch (Exception unused) {
            0wb.A03("IgLiveNotificationsController", "failed to get current activity from InAppNotificationController");
            return null;
        }
    }

    public static final void A02(UserSession userSession, String str) {
        1Xc A01 = 1Xc.A01();
        String A00 = AnonymousClass000.A00(1555);
        0qQ.A0B(A00, 1);
        A01.A04(userSession, "iglive", 002.A0T(str, A00, '_'));
    }
}
