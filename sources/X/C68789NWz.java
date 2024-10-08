package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.NWz  reason: case insensitive filesystem */
public final class C68789NWz extends C331017Pd {
    public final UserSession A00;
    public final P7W A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68789NWz(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, AnonymousClass7RQ r5, C332807Wl r6, AnonymousClass9HC r7, AnonymousClass7L2 r8, Map map) {
        super(r5.createViewHolder(layoutInflater, viewGroup), r5, r6);
        AnonymousClass7TF.A1F(r5, 3, map);
        this.A00 = userSession;
        this.A03 = r8;
        this.A02 = r7;
        this.A04 = 17h.A00(userSession);
        this.A01 = new P7W(map);
    }

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        P7W p7w = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7w.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }
}
