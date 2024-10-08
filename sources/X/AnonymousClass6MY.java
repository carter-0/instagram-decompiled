package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6MY  reason: invalid class name */
public final class AnonymousClass6MY implements C74500Pvu {
    public static final /* synthetic */ AnonymousClass0YZ[] A08 = {new 015(AnonymousClass6MY.class, "dominantMediaColor", "getDominantMediaColor()I", 0)};
    public AnimatorSet A00;
    public C300635xX A01;
    public C309426Yf A02;
    public AnonymousClass6O7 A03;
    public final Animator.AnimatorListener A04 = new AnonymousClass6O6(this);
    public final View A05;
    public final UserSession A06;
    public final 0s0 A07 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.0s0] */
    public AnonymousClass6MY(View view, UserSession userSession) {
        0qQ.A0B(view, 1);
        this.A05 = view;
        this.A06 = userSession;
    }

    public final void EOh() {
    }

    public static final int A00(AnonymousClass6MY r3) {
        return ((Number) r3.A07.CDM(r3, A08[0])).intValue();
    }

    public final AnimatorSet Abq() {
        return this.A00;
    }

    public final C309426Yf Bkh() {
        return this.A02;
    }

    public final void EIN() {
        AnonymousClass6O7 r0 = this.A03;
        if (r0 != null) {
            r0.EIN();
        }
    }

    public final void Eqh() {
        C309426Yf r0 = this.A02;
        if (r0 == null || !r0.A0k) {
            C66951Mfk.A00(this);
            AnonymousClass6O7 r02 = this.A03;
            if (r02 != null) {
                r02.EIN();
                return;
            }
            return;
        }
        AnonymousClass6O7 r03 = this.A03;
        if (r03 != null) {
            r03.Eqh();
        }
    }

    public final void Eu9() {
        C309426Yf r0 = this.A02;
        if (r0 != null && r0.A0k) {
            C66951Mfk.A01(this);
        }
    }

    public final void start() {
        C66951Mfk.A02(this);
    }

    public final void Ehz(C309426Yf r1) {
        this.A02 = r1;
    }
}
