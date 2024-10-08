package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LjI  reason: case insensitive filesystem */
public class C64856LjI implements AnonymousClass3NL, C252213ok {
    public C262204Co A00;
    public boolean A01;
    public final View A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final AnonymousClass3E6 A05;
    public final C313666go A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final ViewStub A0J;
    public final C635813i A0K;

    public C64856LjI(View view, AnonymousClass4DH r12, UserSession userSession, C313666go r14, int i) {
        View findViewById;
        0qQ.A0B(userSession, 2);
        this.A03 = r12;
        this.A04 = userSession;
        this.A06 = r14;
        C66305MMo mMo = new C66305MMo(this, 29);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66305MMo(new C66305MMo(r12, 25), 26));
        this.A0I = DbS.A0I(new C66305MMo(A002, 27), mMo, new MJ6(14, (Object) null, A002), DbS.A0z(C60255JiC.class));
        ViewStub A0F2 = DbS.A0F(view, R.id.iglive_buttons_container_stub);
        this.A0J = A0F2;
        if (A0F2 != null) {
            findViewById = JTP.A0H(A0F2, i);
        } else {
            findViewById = view.findViewById(R.id.iglive_buttons_container);
        }
        0qQ.A0A(findViewById);
        this.A02 = findViewById;
        this.A07 = C66305MMo.A01(this, 15);
        this.A08 = C66305MMo.A01(this, 16);
        this.A09 = C66305MMo.A01(this, 17);
        this.A0A = C66305MMo.A01(this, 18);
        this.A0C = C66305MMo.A01(this, 20);
        this.A0D = C66305MMo.A01(this, 21);
        this.A0F = C66305MMo.A01(this, 23);
        this.A0G = C66305MMo.A01(this, 24);
        this.A0H = C66305MMo.A01(this, 28);
        this.A0B = C66305MMo.A01(this, 19);
        this.A0E = C66305MMo.A01(this, 22);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A05 = A012;
        this.A0K = C64461LcL.A00;
        AnonymousClass0eM r8 = this.A08;
        A03(r8);
        AnonymousClass0eM r7 = this.A09;
        A03(r7);
        AnonymousClass0eM r6 = this.A0A;
        A03(r6);
        AnonymousClass0eM r5 = this.A0C;
        A03(r5);
        AnonymousClass0eM r4 = this.A0D;
        A03(r4);
        AnonymousClass0eM r3 = this.A0F;
        A03(r3);
        AnonymousClass0eM r1 = this.A0G;
        A03(r1);
        AnonymousClass0eM r0 = this.A0H;
        A03(r0);
        JTS.A1X(r8, 0);
        JTS.A1X(r7, 0);
        JTS.A1X(r6, 0);
        JTS.A1X(r5, 0);
        JTS.A1X(r4, 0);
        JTS.A1X(r3, 0);
        JTS.A1X(r1, 0);
        JTS.A1X(r0, 0);
        if (r14 != C313666go.VIEWER) {
            A04(r12);
        }
        View A0c = AnonymousClass7TE.A0c(this.A08);
        if (A0c != null) {
            LY3.A00(A0c, 3, this);
        }
        A02(this, this.A07);
        A02(this, this.A09);
        A02(this, this.A0A);
        A02(this, this.A0C);
        A02(this, this.A0D);
        A02(this, this.A0F);
        A02(this, this.A0G);
        A02(this, this.A0H);
        A012.A9Y(this);
    }

    public static void A03(AnonymousClass0eM r2) {
        A01((View) r2.getValue(), false, false);
    }

    public final void DP5(View view) {
        0qQ.A0B(view, 0);
        if (JTP.A1a(view, this.A09)) {
            2YL A0H2 = DbS.A0H(this.A0I);
            MG2.A01(A0H2, C318116oQ.A00(A0H2), 14);
        }
    }

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        if (JTP.A1a(view, this.A07)) {
            2YL A0H2 = DbS.A0H(this.A0I);
            MG2.A01(A0H2, C318116oQ.A00(A0H2), 13);
            return true;
        } else if (JTP.A1a(view, this.A09)) {
            2YL A0H3 = DbS.A0H(this.A0I);
            MG2.A01(A0H3, C318116oQ.A00(A0H3), 15);
            return true;
        } else if (JTP.A1a(view, this.A0A)) {
            2YL A0H4 = DbS.A0H(this.A0I);
            MG2.A01(A0H4, C318116oQ.A00(A0H4), 16);
            return true;
        } else if (JTP.A1a(view, this.A0C)) {
            2YL A0H5 = DbS.A0H(this.A0I);
            MG2.A01(A0H5, C318116oQ.A00(A0H5), 17);
            return true;
        } else if (JTP.A1a(view, this.A0D)) {
            2YL A0H6 = DbS.A0H(this.A0I);
            MG2.A01(A0H6, C318116oQ.A00(A0H6), 18);
            return true;
        } else if (JTP.A1a(view, this.A0F)) {
            2YL A0H7 = DbS.A0H(this.A0I);
            MG2.A01(A0H7, C318116oQ.A00(A0H7), 19);
            return true;
        } else if (JTP.A1a(view, this.A0G)) {
            C60255JiC jiC = (C60255JiC) this.A0I.getValue();
            C61013JvD A0Q = JTQ.A0Q(jiC.A02);
            AnonymousClass3NV r1 = null;
            if (A0Q != null) {
                r1 = A0Q.A06;
            }
            if (r1 != AnonymousClass3NV.A0A) {
                MG2.A01(jiC, C318116oQ.A00(jiC), 21);
                return true;
            } else if (jiC.A01) {
                return true;
            } else {
                MG2.A01(jiC, C318116oQ.A00(jiC), 20);
                return true;
            }
        } else if (!JTP.A1a(view, this.A0H)) {
            return true;
        } else {
            2YL A0H8 = DbS.A0H(this.A0I);
            MG2.A01(A0H8, C318116oQ.A00(A0H8), 22);
            return true;
        }
    }

    private final void A00(View view) {
        if (view != null) {
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
            A0m.A04 = this;
            A0m.A05 = AnonymousClass05K.A01;
            A0m.A00();
        }
    }

    public static final void A01(View view, boolean z, boolean z2) {
        float f;
        if (view != null) {
            float f2 = 1.0f;
            if (z2) {
                C294975nL A0c = JTP.A0c(view, 1);
                float A022 = AnonymousClass7TE.A02(view);
                if (z) {
                    f = AnonymousClass7TE.A01(DbU.A05(view), R.dimen.account_group_management_clickable_width);
                } else {
                    f = 0.0f;
                }
                A0c.A0R(A022, f);
                A0c.A0P(C51971G9r.A00(z), -1.0f);
                if (!z) {
                    f2 = 0.0f;
                }
                A0c.A0Q(f2, -1.0f);
                A0c.A0C(200).A0H();
                return;
            }
            int i = 0;
            C294975nL.A01(view, 0).A0G();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z) {
                i = -2;
            }
            layoutParams.width = i;
            view.setScaleX(C51971G9r.A00(z ? 1 : 0));
            if (!z) {
                f2 = 0.0f;
            }
            view.setScaleY(f2);
        }
    }

    public void A04(Fragment fragment) {
        2Fk r3;
        AnonymousClass0eM r4 = this.A0I;
        C60255JiC jiC = (C60255JiC) r4.getValue();
        if (jiC instanceof C62415KfQ) {
            r3 = ((C62415KfQ) jiC).A01;
        } else if (jiC instanceof C62414KfP) {
            r3 = ((C62414KfP) jiC).A01;
        } else {
            r3 = ((C62413KfO) jiC).A00;
        }
        C64321LZw.A00(fragment.getViewLifecycleOwner(), r3, new MPC(this, 22), 2);
        this.A00 = JTS.A0t(fragment, new C52070GDq(fragment, this, (AnonymousClass4D7) null, 15), ((C60255JiC) r4.getValue()).A06);
    }

    public final void DMr(int i, boolean z) {
        C60255JiC jiC = (C60255JiC) this.A0I.getValue();
        if (i > AnonymousClass7TE.A0M(this.A0K.get())) {
            jiC.A01();
        }
    }

    public static void A02(C64856LjI ljI, AnonymousClass0eM r2) {
        ljI.A00((View) r2.getValue());
    }
}
