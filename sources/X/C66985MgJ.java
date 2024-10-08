package X;

import android.content.Context;
import android.os.MessageQueue;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.MgJ  reason: case insensitive filesystem */
public final class C66985MgJ implements MessageQueue.IdleHandler {
    public final /* synthetic */ C66633Ma2 A00;

    public C66985MgJ(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final boolean queueIdle() {
        C66633Ma2 ma2 = this.A00;
        List A0F = ma2.A0v().A0C.A0F(ma2.A0t());
        if (A0F.isEmpty()) {
            return false;
        }
        Context A05 = DbT.A05(ma2.A1J.requireActivity());
        UserSession A0p = ma2.A0p();
        Set set = C66959Mfs.A04;
        0qQ.A0B(A0p, 2);
        if (C66959Mfs.A00 != null) {
            return false;
        }
        C66856Mdp mdp = new C66856Mdp(A05, A0p, A0F);
        0nY.A00().ATE(mdp);
        C66959Mfs.A00 = mdp;
        return false;
    }
}
