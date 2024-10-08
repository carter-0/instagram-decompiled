package X;

import android.view.View;
import android.widget.Adapter;
import com.instagram.common.session.UserSession;

/* renamed from: X.4HF  reason: invalid class name */
public abstract class AnonymousClass4HF implements C252293os {
    public /* synthetic */ void DVx(int i, int i2) {
    }

    public /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public /* synthetic */ void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public /* synthetic */ void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public /* synthetic */ void Dpz(int i, int i2) {
    }

    public /* synthetic */ void DzE(View view) {
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public /* synthetic */ void Dwb(int i, float f) {
        if (this instanceof AnonymousClass4HE) {
            AnonymousClass4HE r4 = (AnonymousClass4HE) this;
            C262774Fy r6 = r4.A00;
            C262754Fw r2 = r4.A01;
            C262714Fq r0 = r6.A02;
            1Xj r5 = r2.A0D;
            AnonymousClass3W1 r8 = r2.A0G;
            0qQ.A0B(r5, 0);
            0qQ.A0B(r8, 1);
            UserSession userSession = r0.A01;
            if (!r5.CcK() && r5.A4V() && r5.A0o() < r5.A13() && 182.A06(0Tu.A05, userSession, 36316650022441516L)) {
                C247023fe.A00(userSession, r5, r8);
            }
            if (f > 0.0f) {
                AnonymousClass3TR r22 = r4.A04;
                Adapter adapter = r22.A09.getAdapter();
                if (adapter == null) {
                    throw new IllegalArgumentException("Required value was null.");
                } else if (adapter.getCount() == i + 1 && !r22.A04) {
                    r22.A04 = true;
                    AnonymousClass4DU r42 = r4.A05;
                    UserSession userSession2 = r6.A01;
                    C254523sc A04 = C254513sb.A04(r5, r42, "gesture");
                    A04.A0G(userSession2, r5);
                    A04.A08(i);
                    A04.A7M = "swipe_left_on_last_card";
                    boolean CcK = r5.CcK();
                    0wc A01 = AnonymousClass0kN.A01(r42, userSession2);
                    if (CcK) {
                        XWx.A00(A01, A04, r42);
                    } else {
                        XXC.A00(A01, A04, r42);
                    }
                }
            }
        }
    }
}
