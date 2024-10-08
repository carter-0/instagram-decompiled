package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.IOt  reason: case insensitive filesystem */
public final class C57105IOt implements AnonymousClass3NL {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = A00(this, 34);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = A00(this, 36);
    public final AnonymousClass0eM A09 = A00(this, 37);
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;

    public C57105IOt(View view, AnonymousClass4DH r9, UserSession userSession, C55538HjK hjK) {
        0qQ.A0B(userSession, 2);
        C66304MMn mMn = new C66304MMn(18, userSession, r9);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MM8(new MM8(r9, 40), 41));
        this.A0C = DbS.A0I(new MM8(A002, 42), mMn, new C66304MMn(17, A002, (Object) null), DbS.A0z(C60249Ji6.class));
        this.A02 = A00(view, 31);
        this.A00 = A00(view, 29);
        this.A0B = A00(view, 39);
        this.A0A = A00(view, 38);
        this.A04 = AnonymousClass0eN.A01(new C20704Wxb(43, userSession, view, r9));
        this.A03 = A00(view, 32);
        this.A01 = A00(view, 30);
        this.A05 = A00(view, 33);
        this.A07 = A00(view, 35);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(AnonymousClass7TH.A06(this.A01));
        A0m.A04 = this;
        Integer num = AnonymousClass05K.A01;
        A0m.A05 = num;
        A0m.A00();
        AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(AnonymousClass7TH.A06(this.A05));
        A0m2.A04 = this;
        A0m2.A05 = num;
        A0m2.A00();
        ((GradientSpinner) AnonymousClass7TE.A14(this.A03)).A06();
        C51969G9p.A15(r9.getViewLifecycleOwner(), ((C60249Ji6) this.A0C.getValue()).A01, new J6T(19, (Object) r9, (Object) this), 19);
        DbZ.A1C(r9, new C52070GDq(hjK, this, (AnonymousClass4D7) null, 11), ((C60249Ji6) this.A0C.getValue()).A06);
    }

    public final void DP5(View view) {
    }

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        if (!view.equals(AnonymousClass7TE.A14(this.A01)) && !view.equals(AnonymousClass7TE.A14(this.A05))) {
            return true;
        }
        2YL A0H = DbS.A0H(this.A0C);
        AnonymousClass7TE.A1Z(new C66184MGv((Object) A0H, (AnonymousClass4D7) null, 42), C318116oQ.A00(A0H));
        return true;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new MM8(obj, i));
    }
}
