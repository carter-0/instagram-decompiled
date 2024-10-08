package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

public final class GKH {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public GKH(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = r2;
        this.A01 = userSession;
    }

    public final void A00(C247003fc r12, 1Xj r13, WeakReference weakReference, 0sP r15) {
        FragmentActivity fragmentActivity;
        0qQ.A0B(weakReference, 0);
        DbZ.A0t(1, r13, r12, r15);
        Object obj = weakReference.get();
        if ((obj instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) obj) != null) {
            IQ1 iq1 = new IQ1(r12, this, r15);
            UserSession userSession = this.A01;
            if (C247323g9.A00(userSession).A06()) {
                iq1.DZJ();
                return;
            }
            E68.A08.A00(fragmentActivity, GPK.NEW_TOOLTIP, userSession, iq1, C51970G9q.A0j(r13), this.A00.getModuleName(), (String) null, AnonymousClass7TF.A1W(r12, C247003fc.COMMENT_BUTTON), true);
        }
    }
}
