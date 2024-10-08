package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hr7  reason: case insensitive filesystem */
public final class C56001Hr7 {
    public final UserSession A00;
    public final C230372pW A01;
    public final 2el A02;
    public final GWX A03;
    public final GXM A04;
    public final IPE A05;
    public final C52535GWm A06;
    public final AnonymousClass2pP A07;

    public final void A00(View view, C296995qz r7, C296905qq r8, C296935qt r9, boolean z) {
        C2354830a A002 = AnonymousClass30Y.A00(r9, new C52528GWf(r7, r8), r9.getKey());
        A002.A00(this.A05);
        if (r9 instanceof C52435GSn) {
            A002.A00(this.A06);
            A002.A00(this.A01);
        }
        if (z && (r9 instanceof C296955qv) && ((C296955qv) r9).CP9()) {
            A002.A00(this.A03);
        }
        if (182.A06(0Tu.A05, this.A00, 36315155374017576L)) {
            GXM gxm = this.A04;
            gxm.A00.put(r9, view);
            A002.A00(gxm);
        }
        C51967G9n.A0z(view, A002, this.A02);
    }

    public C56001Hr7(0wc r4, UserSession userSession, 2el r6, C59630JQy jQy, C56524Hzv hzv, AnonymousClass4DU r9) {
        C51972G9s.A1D(userSession, jQy);
        this.A02 = r6;
        this.A00 = userSession;
        this.A03 = new GWX(jQy);
        this.A05 = new IPE(hzv, (C18383Vqj) null);
        AnonymousClass2pP A0f = C51972G9s.A0f(userSession);
        this.A07 = A0f;
        this.A06 = new C52535GWm(r4, userSession, r9, A0f);
        this.A01 = new C52540GWr(userSession, (C52526GWd) null, r9);
        this.A04 = new GXM(userSession, r9);
    }
}
