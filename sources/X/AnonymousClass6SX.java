package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6SX  reason: invalid class name */
public final class AnonymousClass6SX {
    public C316026kz A00;
    public final AnonymousClass07g A01;
    public final C55689Hlm A02;

    public AnonymousClass6SX(View view, AnonymousClass07Z r8, AnonymousClass07g r9, C376579In r10, UserSession userSession, C313056fm r12, C311716d8 r13) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r13, 4);
        0qQ.A0B(r10, 5);
        0qQ.A0B(r12, 7);
        WEH weh = new WEH(r9.getViewModelStore(), r10, userSession, r13);
        this.A01 = weh;
        C55689Hlm hlm = new C55689Hlm(view, weh, userSession);
        this.A02 = hlm;
        AnonymousClass07V lifecycle = r8.getLifecycle();
        0qQ.A0B(lifecycle, 1);
        VX9 vx9 = new VX9(view, lifecycle);
        int hashCode = lifecycle.hashCode();
        C64072LLq.A00.put(Integer.valueOf(hashCode), vx9);
        lifecycle.A09(new LZY(hashCode));
        for (0sP invoke : hlm.A01) {
            invoke.invoke(r8);
        }
        r12.A90(new C64877Ljd(r8, r12, this));
    }
}
