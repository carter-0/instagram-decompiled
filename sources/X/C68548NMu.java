package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NMu  reason: case insensitive filesystem */
public final class C68548NMu extends C228042kh {
    public final AnonymousClass4DH A00;
    public final UserSession A01;

    public C68548NMu(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        AnonymousClass4DH r4 = this.A00;
        Context requireContext = r4.requireContext();
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        return new C53004Ggv(requireContext, userSession, new C69067Ne6(r4, userSession));
    }
}
