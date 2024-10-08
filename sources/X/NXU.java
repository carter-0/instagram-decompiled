package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class NXU extends C331017Pd implements C3266277n {
    public final UserSession A00;
    public final C72467P7c A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;
    public final C3266277n A05;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        C72467P7c p7c = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7c.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }

    public final AnonymousClass758 CEa(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        return this.A05.CEa(directMessageIdentifier);
    }

    public NXU(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, AnonymousClass9HO r5, C332807Wl r6, AnonymousClass9HC r7, NYE nye, AnonymousClass7L2 r9) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, nye), nye, r6);
        this.A00 = userSession;
        this.A03 = r9;
        this.A02 = r7;
        this.A04 = 17h.A00(userSession);
        this.A05 = nye;
        this.A01 = new C72467P7c(r5);
    }
}
