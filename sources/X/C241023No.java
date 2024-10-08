package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.3No  reason: invalid class name and case insensitive filesystem */
public abstract class C241023No {
    public static final Reel A00(UserSession userSession, C241013Nn r4, boolean z) {
        AnonymousClass9IZ r2;
        AnonymousClass3HX r22;
        0qQ.A0B(r4, 0);
        0qQ.A0B(userSession, 1);
        AnonymousClass2Q9 AvE = ((C241053Nr) ((C241033Np) ((C241003Nm) userSession.A01(C241033Np.class, new C51793G2c(userSession, 28)))).A00.getValue()).AvE();
        Reel reel = null;
        if (AvE.CQL() && (r2 = (AnonymousClass9IZ) ((C262214Cp) AvE).A0B()) != null && ((!z || r2.A01) && (r22 = (AnonymousClass3HX) r2.A03) != null)) {
            1OP r0 = 1OP.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession);
            0qQ.A07(A03);
            reel = A03.A0M(r22.A1U);
            if (reel == null) {
                return A03.A0I(r22, false);
            }
        }
        return reel;
    }
}
