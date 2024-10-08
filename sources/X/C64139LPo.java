package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LPo  reason: case insensitive filesystem */
public abstract class C64139LPo {
    public static void A02(C62423KfY kfY, Throwable th) {
        A01(kfY.A0Y, kfY.A07).A00();
        LKF.A00(th);
    }

    public static M0X A00(K6W k6w) {
        return A01(k6w, K6W.A00(k6w)).A01(k6w.requireContext());
    }

    public static final C62176KbY A01(AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1N(userSession, r2);
        C313646gm A00 = C313646gm.A0A.A00(r2, userSession, C313666go.BROADCASTER);
        0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.logger.store.IgLiveHostLoggerStore");
        return (C62176KbY) A00;
    }
}
