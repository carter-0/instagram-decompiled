package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class Md8 extends C331017Pd implements C328277Ee {
    public static final Md6 A05 = new Object();
    public final UserSession A00;
    public final Md7 A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    public final /* bridge */ /* synthetic */ C232262tL A05(AnonymousClass7LQ r9) {
        0qQ.A0B(r9, 0);
        Md7 md7 = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return md7.AWb(A06, userSession, this.A02, r9, r5, r6, false);
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

    public final C331277Qg BLj() {
        AnonymousClass77D r2;
        C328007Db r1 = ((AnonymousClass7EZ) this.A00).A0M;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.direct.messagethread.media.MediaContentViewHolder<*>");
        C226642hc r22 = ((C66775McL) r1).A09.getIgImageView().A0I;
        if (!(r22 instanceof AnonymousClass77D) || (r2 = (AnonymousClass77D) r22) == null) {
            return null;
        }
        return r2.A04;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Md7, java.lang.Object] */
    public Md8(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C332807Wl r5, AnonymousClass9HC r6, AnonymousClass77Q r7, AnonymousClass7L2 r8) {
        super(C66582MXn.A0T(layoutInflater, viewGroup, r7), r7, r5);
        this.A00 = userSession;
        this.A03 = r8;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
    }
}
