package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.HFx  reason: case insensitive filesystem */
public final class C54491HFx extends C2806552w {
    public final int A00 = 3;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54491HFx(C61078JwG jwG, AnonymousClass0iw r3, int i) {
        super(Integer.valueOf(i));
        this.A02 = jwG;
        this.A01 = r3;
    }

    public final void onClick(View view) {
        C331157Pu r2;
        switch (this.A00) {
            case 0:
                2YL A0H = DbS.A0H(((K5N) this.A02).A0B);
                String str = ((C61081JwJ) this.A01).A01;
                AnonymousClass7TE.A1Z(new MGE(A0H, str, (AnonymousClass4D7) null, 6), C51975G9x.A0R(A0H, str));
                return;
            case 1:
                ((0sP) ((C61078JwG) ((C61082JwK) this.A01).A00).A00).invoke(((C53649Gs2) this.A02).A00);
                return;
            case 2:
                0qQ.A0B(view, 0);
                ((0sL) ((C61078JwG) ((C61078JwG) this.A02).A00).A00).invoke(AnonymousClass7TE.A0S(view), this.A01);
                return;
            case 3:
                ((C242813Wa) this.A01).Dtz((1Xj) this.A02);
                return;
            default:
                C61427K7c k7c = (C61427K7c) this.A02;
                String A0t = DbS.A0t(k7c.A0D);
                if (A0t != null) {
                    AnonymousClass0eM r1 = k7c.A0H;
                    C54167H1m A002 = C54909HXr.A00(AnonymousClass7TE.A0l(r1), A0t);
                    AnonymousClass37E r0 = AnonymousClass37D.A00;
                    Activity activity = (Activity) this.A01;
                    C331157Pu A003 = C48943Emh.A00(r0.A01(activity));
                    if (A003 != null && (r2 = A003.A03.A02) != null) {
                        C331127Pr A0f = DbX.A0f(r1);
                        DbZ.A0z(activity, A0f, 2131956901);
                        A0f.A0T = A002;
                        r2.A0F(A002, A0f);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54491HFx(C61081JwJ jwJ, K5N k5n, int i) {
        super(Integer.valueOf(i));
        this.A02 = k5n;
        this.A01 = jwJ;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54491HFx(C61082JwK jwK, C53649Gs2 gs2, int i) {
        super(Integer.valueOf(i));
        this.A01 = jwK;
        this.A02 = gs2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54491HFx(1Xj r2, C242813Wa r3, int i) {
        super(Integer.valueOf(i));
        this.A01 = r3;
        this.A02 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54491HFx(FragmentActivity fragmentActivity, C61427K7c k7c, int i) {
        super(Integer.valueOf(i));
        this.A02 = k7c;
        this.A01 = fragmentActivity;
    }
}
