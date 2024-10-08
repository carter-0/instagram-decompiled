package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7Vy  reason: invalid class name and case insensitive filesystem */
public final class C332677Vy {
    public AnonymousClass7MA A00;
    public AnonymousClass7Q8 A01;
    public boolean A02;
    public final AnonymousClass4DH A03;
    public final 1wn A04 = new AnonymousClass7W1(this);
    public final 1wn A05 = new AnonymousClass7WF(this);
    public final 1wn A06 = new C332687Vz(this);
    public final 1wn A07 = new AnonymousClass7WG(this);
    public final 1wn A08 = new AnonymousClass7WA(this);
    public final 1wn A09 = new AnonymousClass7WC(this);
    public final 1wn A0A = new AnonymousClass7W0(this);
    public final 1wn A0B = new AnonymousClass7W3(this);
    public final 1wn A0C = new AnonymousClass7W4(this);
    public final 1wn A0D = new AnonymousClass7WB(this);
    public final 1wn A0E = new AnonymousClass7W5(this);
    public final 1wn A0F = new AnonymousClass7W2(this);
    public final 1wn A0G = new AnonymousClass7WD(this);
    public final 1wn A0H = new AnonymousClass7WE(this);
    public final 1wn A0I = new AnonymousClass7W9(this);
    public final UserSession A0J;
    public final AnonymousClass7US A0K;
    public final AnonymousClass7UW A0L;
    public final AnonymousClass7W8 A0M = new AnonymousClass7W8(this);
    public final AnonymousClass7W7 A0N = new AnonymousClass7W7(this);
    public final AnonymousClass7W6 A0O = new AnonymousClass7W6(this);
    public final C331747Sf A0P;
    public final AnonymousClass7VD A0Q;
    public final AnonymousClass7UE A0R;
    public final AnonymousClass7UE A0S;
    public final AnonymousClass7VL A0T;
    public final Runnable A0U;
    public final AnonymousClass0eK A0V;
    public final AnonymousClass0eK A0W;
    public final AnonymousClass0eK A0X;

    public C332677Vy(AnonymousClass4DH r2, UserSession userSession, AnonymousClass7US r4, AnonymousClass7UW r5, C331747Sf r6, AnonymousClass7VD r7, AnonymousClass7UE r8, AnonymousClass7UE r9, AnonymousClass7VL r10, Runnable runnable, AnonymousClass0eK r12, AnonymousClass0eK r13, AnonymousClass0eK r14) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r10, 4);
        0qQ.A0B(r7, 5);
        0qQ.A0B(r5, 6);
        0qQ.A0B(r6, 7);
        0qQ.A0B(r4, 8);
        this.A03 = r2;
        this.A0J = userSession;
        this.A0V = r12;
        this.A0T = r10;
        this.A0Q = r7;
        this.A0L = r5;
        this.A0P = r6;
        this.A0K = r4;
        this.A0W = r13;
        this.A0X = r14;
        this.A0R = r8;
        this.A0S = r9;
        this.A0U = runnable;
    }

    public static final DirectThreadKey A00(C332677Vy r0) {
        return C66647MaG.A04(((C333517Zg) r0.A0W.get()).C6l().AfV());
    }

    public static final void A01(C332677Vy r1) {
        AnonymousClass4DH r12 = r1.A03;
        if (r12.isResumed()) {
            FragmentActivity requireActivity = r12.requireActivity();
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(requireActivity);
            if (A012 == null || !((AnonymousClass37F) A012).A0g) {
                requireActivity.onBackPressed();
            }
        }
    }
}
