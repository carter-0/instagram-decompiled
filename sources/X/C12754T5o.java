package X;

import com.instagram.business.instantexperiences.ui.InstantExperiencesSaveAutofillDialog;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* renamed from: X.T5o  reason: case insensitive filesystem */
public final class C12754T5o implements C13666Tea {
    public InstantExperiencesSaveAutofillDialog A00;
    public final C10662Rvw A01;
    public final S1O A02 = new C8755R8g(this);
    public final Executor A03;
    public final UserSession A04;

    public final S1O BzA() {
        return this.A02;
    }

    public C12754T5o(C10662Rvw rvw, UserSession userSession, Executor executor) {
        this.A04 = userSession;
        this.A03 = executor;
        this.A01 = rvw;
    }
}
