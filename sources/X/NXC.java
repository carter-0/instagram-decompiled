package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class NXC extends C331017Pd {
    public final UserSession A00;
    public final C72466P7b A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NXC(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r5, AnonymousClass9HC r6, C68813NXx nXx, AnonymousClass7L2 r8, Map map) {
        super(nXx.createViewHolder(layoutInflater, viewGroup), nXx, r5);
        AnonymousClass7TF.A1F(nXx, 3, map);
        this.A00 = userSession;
        this.A03 = r8;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
        this.A01 = new C72466P7b(map);
    }

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        C72466P7b p7b = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7b.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }
}
