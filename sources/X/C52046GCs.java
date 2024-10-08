package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCs  reason: case insensitive filesystem */
public final class C52046GCs {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new C58711IwK(this, 34));
    public final AnonymousClass4DU A02;

    public C52046GCs(UserSession userSession, AnonymousClass4DU r5) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 2);
        this.A00 = userSession;
        this.A02 = r5;
    }

    public final void A04(View view, C238863Ds r13, C59543JNp jNp, AnonymousClass3OA r15, Integer num) {
        0qQ.A0B(view, 0);
        A01(view, r13, jNp, (1Xj) null, r15, num, false, false);
        A00(this).A0B(view, new String[0]);
        A02(view);
    }

    public final void A05(View view, C238863Ds r7, Integer num) {
        0qQ.A0B(view, 0);
        if (r7 != null) {
            A00(this).A09(view, new C238873Dt(num, r7, (String) null, (String) null), new String[0], 1);
            return;
        }
        A00(this).A0B(view, new String[0]);
    }

    public static C238833Dp A00(C52046GCs gCs) {
        return (C238833Dp) gCs.A01.getValue();
    }

    private final void A01(View view, C238863Ds r15, C59543JNp jNp, 1Xj r17, AnonymousClass3OA r18, Integer num, boolean z, boolean z2) {
        C238833Dp A002;
        C244333b1 r5;
        view.hashCode();
        AnonymousClass3OA r10 = r18;
        if (r15 != null) {
            if (r18 == null && !z) {
                return;
            }
            if (num != null) {
                A00(this).A06(view, r15, num.intValue());
            } else {
                A00(this).A05(view, r15);
            }
        }
        if (r18 != null) {
            A002 = A00(this);
            C59543JNp jNp2 = jNp;
            UserSession userSession = this.A00;
            AnonymousClass4DU r9 = this.A02;
            if (z2) {
                1Xj r3 = r10.A0K;
                r5 = new GTB(new AnonymousClass4HH(AnonymousClass7TE.A0S(view), G9t.A18(r3), userSession, r3), jNp2, userSession, r9, r10, "in_app_browser_v2", 0sl.A00);
            } else {
                r5 = new GTB((AnonymousClass4HI) null, jNp2, userSession, r9, r10);
            }
        } else if (z) {
            1Xj r4 = r17;
            if (r17 != null) {
                A002 = A00(this);
                r5 = new C246153e7((AnonymousClass4HI) null, this.A00, r4, this.A02);
            } else {
                return;
            }
        } else {
            return;
        }
        A002.A0A(view, r5);
    }

    public final void A02(View view) {
        view.hashCode();
        A00(this).A04(view);
    }

    public final void A03(View view, C238863Ds r11, C59543JNp jNp, C267324bN r13, Integer num, boolean z, boolean z2) {
        AnonymousClass3OA A07;
        if (r13.CcK()) {
            A07 = r13.A06();
        } else {
            A07 = r13.A07();
            if (A07 == null) {
                A07 = null;
            }
        }
        A01(view, r11, jNp, r13.A02, A07, num, z, z2);
    }
}
