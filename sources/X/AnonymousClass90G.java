package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.90G  reason: invalid class name */
public final class AnonymousClass90G extends C331017Pd {
    public final UserSession A00;
    public final AnonymousClass90I A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.90I, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90G(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r5, AnonymousClass9HC r6, AnonymousClass7L2 r7, C331457Rb r8) {
        super(r8.createViewHolder(layoutInflater, viewGroup), r8, r5);
        0qQ.A0B(r8, 3);
        this.A00 = userSession;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
    }

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r10) {
        0qQ.A0B(r10, 0);
        AnonymousClass90I r1 = this.A01;
        Context context = this.itemView.getContext();
        0qQ.A07(context);
        UserSession userSession = this.A00;
        17i r7 = this.A04;
        AnonymousClass7L2 r6 = this.A03;
        return r1.AWb(context, userSession, this.A02, r10, r6, r7, false);
    }
}
