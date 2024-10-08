package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.FcF  reason: case insensitive filesystem */
public final class C50467FcF implements C20953X6g {
    public final /* synthetic */ C47713EDw A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ UserSession A03;

    public C50467FcF(C47713EDw eDw, C307786Rm r2, C276544tV r3, UserSession userSession) {
        this.A00 = eDw;
        this.A01 = r2;
        this.A03 = userSession;
        this.A02 = r3;
    }

    public final void D2V(Hashtag hashtag) {
        C307786Rm r4 = this.A01;
        0qQ.A0B(r4, 0);
        ((AnonymousClass4D6) r4.A00(R.id.bloks_ig_scheduler)).schedule(C230132oy.A00(this.A03, hashtag));
        C276544tV r2 = this.A02;
        C277014uI A08 = r2.A08();
        if (A08 != null) {
            C308276Tl A0P = DbS.A0P();
            A0P.A03(r2, 0);
            A0P.A02(r4);
            DbT.A1R(r4, r2, A0P, A08);
        }
    }

    public final void D3G(Hashtag hashtag) {
        C307786Rm r4 = this.A01;
        0qQ.A0B(r4, 0);
        ((AnonymousClass4D6) r4.A00(R.id.bloks_ig_scheduler)).schedule(C230132oy.A01(this.A03, hashtag));
        C276544tV r2 = this.A02;
        C277014uI A0A = r2.A0A(38);
        if (A0A != null) {
            C308276Tl A0P = DbS.A0P();
            A0P.A03(r2, 0);
            A0P.A02(r4);
            DbT.A1R(r4, r2, A0P, A0A);
        }
    }
}
