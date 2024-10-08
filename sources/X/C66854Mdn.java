package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdn  reason: case insensitive filesystem */
public final class C66854Mdn extends C331017Pd {
    public static final AnonymousClass0eM A06 = AnonymousClass0eN.A01(C73778Pjd.A00);
    public final UserSession A00;
    public final C66855Mdo A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;
    public final AnonymousClass0eM A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66854Mdn(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r7, AnonymousClass9HC r8, AnonymousClass7L2 r9, C331487Re r10, C331527Ri r11) {
        super(r10.createViewHolder(layoutInflater, viewGroup), r10, r7);
        AnonymousClass7TF.A1F(r10, 3, r11);
        this.A00 = userSession;
        this.A03 = r9;
        this.A02 = r8;
        0t0 A012 = C73918Ply.A01(this, 33);
        this.A05 = A012;
        this.A04 = 17h.A00(userSession);
        this.A01 = new C66855Mdo(new OFA(JTQ.A06(this), userSession, r11, A012));
    }

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        C66855Mdo mdo = this.A01;
        Context A062 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return mdo.AWb(A062, userSession, this.A02, r9, r5, r6, false);
    }
}
