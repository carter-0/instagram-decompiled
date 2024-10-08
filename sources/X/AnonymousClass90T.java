package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.90T  reason: invalid class name */
public final class AnonymousClass90T extends C331017Pd implements C328277Ee {
    public static final AnonymousClass90X A05 = new Object();
    public final UserSession A00;
    public final C3723290j A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90T(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r5, AnonymousClass9HC r6, AnonymousClass7L2 r7, AnonymousClass7RV r8, String str) {
        super(r8.createViewHolder(layoutInflater, viewGroup), r8, r5);
        0qQ.A0B(r8, 3);
        this.A00 = userSession;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
        this.A01 = new C3723290j(str);
    }

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r10) {
        0qQ.A0B(r10, 0);
        C3723290j r1 = this.A01;
        Context context = this.itemView.getContext();
        0qQ.A07(context);
        UserSession userSession = this.A00;
        17i r7 = this.A04;
        AnonymousClass7L2 r6 = this.A03;
        return r1.AWb(context, userSession, this.A02, r10, r6, r7, false);
    }

    public final /* synthetic */ void AHu() {
        C66677Mak.A04(this);
    }

    public final /* synthetic */ C242553Us BKr() {
        return C66677Mak.A00(this);
    }

    public final /* synthetic */ C242553Us BzG() {
        return C66677Mak.A01(this);
    }

    public final /* synthetic */ void CsL(float f) {
        C66677Mak.A06(this, f);
    }

    public final /* synthetic */ void EI5() {
        C66677Mak.A05(this);
    }

    public final /* synthetic */ void Ehf(C242553Us r1) {
        C66677Mak.A02(r1, this);
    }

    public final /* synthetic */ void FM4(C242553Us r1, float f) {
        C66677Mak.A03(r1, this, f);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.text.TightTextView, android.view.View] */
    public final C331277Qg BLj() {
        C328007Db r1 = ((AnonymousClass7EZ) this.A00).A0M;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.direct.messagethread.visual.VisualContentViewHolder");
        return (C331277Qg) C331277Qg.A06.get(((C3722390a) r1).A07.getBackground());
    }
}
