package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.LjY  reason: case insensitive filesystem */
public final class C64872LjY implements C252213ok {
    public final AnonymousClass4DH A00;
    public final AnonymousClass3E6 A01;
    public final AnonymousClass0eM A02 = MMN.A00(this, 40);
    public final AnonymousClass0eM A03 = MMN.A00(this, 41);
    public final AnonymousClass0eM A04 = MMN.A00(this, 42);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = MMN.A00(this, 47);
    public final AnonymousClass0eM A07;

    public C64872LjY(View view, AnonymousClass4DH r15, UserSession userSession, C313666go r17) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        this.A00 = r15;
        C20704Wxb wxb = new C20704Wxb(42, this, r17, userSession2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMN(new MMN(r15, 44), 45));
        this.A07 = DbS.A0I(new MMN(A002, 46), wxb, C66304MMn.A01(A002, (Object) null, 8), DbS.A0z(C60218Jhb.class));
        this.A05 = MMN.A00(view, 43);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A01 = A012;
        07U r9 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r15.getViewLifecycleOwner();
        AnonymousClass0xx A003 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHL mhl = new MHL(userSession2, viewLifecycleOwner, r9, this, (AnonymousClass4D7) null, 38);
        19B r1 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(r15, r1, mhl, A003);
        1Eo.A05(r1, new C59845JaL(A0I, r9, this, (AnonymousClass4D7) null, 42), AnonymousClass07a.A00(A0I));
        LY5.A01(AnonymousClass7TH.A06(this.A02), 40, this);
        A012.A9Y(this);
        JTP.A17(this.A00, this.A01);
    }

    public final void DMr(int i, boolean z) {
        AnonymousClass7TF.A1O(((C60218Jhb) this.A07.getValue()).A09, AnonymousClass7TF.A1R(i));
    }
}
