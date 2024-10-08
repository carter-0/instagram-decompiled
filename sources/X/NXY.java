package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This is slated to be merged with GenericXmaMessageItemDefinitionShimViewHolder.")
public final class NXY extends AnonymousClass7PK {
    public final UserSession A00;
    public final P7L A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.P7L, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NXY(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, AnonymousClass9HC r5, C68590NOm nOm, AnonymousClass7L2 r7) {
        super(nOm.createViewHolder(layoutInflater, viewGroup), nOm);
        0qQ.A0B(nOm, 3);
        this.A00 = userSession;
        this.A03 = r7;
        this.A02 = r5;
        this.A04 = 17h.A00(userSession);
    }

    public final /* bridge */ /* synthetic */ C232262tL A04(C331837So r9) {
        0qQ.A0B(r9, 0);
        P7L p7l = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7l.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }
}
