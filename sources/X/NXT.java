package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class NXT extends C331017Pd implements C3266277n {
    public final UserSession A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass7L2 A02;
    public final 17i A03;
    public final C3266277n A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        C72482P7r p7r = C72482P7r.A00;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A03;
        AnonymousClass7L2 r5 = this.A02;
        return p7r.AWb(A06, userSession, this.A01, r9, r5, r6, false);
    }

    public final AnonymousClass758 CEa(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        return this.A04.CEa(directMessageIdentifier);
    }

    public NXT(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r5, AnonymousClass9HC r6, NYD nyd, AnonymousClass7L2 r8) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, nyd), nyd, r5);
        this.A00 = userSession;
        this.A02 = r8;
        this.A01 = r6;
        this.A03 = 17h.A00(userSession);
        this.A04 = nyd;
    }
}
