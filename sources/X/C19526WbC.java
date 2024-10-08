package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.instagram.common.session.UserSession;

/* renamed from: X.WbC  reason: case insensitive filesystem */
public final class C19526WbC implements AnonymousClass6O7 {
    public final int A00;
    public final UserSession A01;
    public final int A02;
    public final C300635xX A03;
    public final Integer A04;

    public final AnimatorSet Abm() {
        AnimatorSet animatorSet;
        C300635xX r7 = this.A03;
        if (r7 != null) {
            int i = r7.A02;
            UserSession userSession = this.A01;
            0Tu r2 = 0Tu.A05;
            long A012 = 182.A01(r2, userSession, 36610022058432471L);
            long A013 = 182.A01(r2, userSession, 36610022058694619L);
            Integer valueOf = Integer.valueOf(i);
            int i2 = this.A00;
            Integer valueOf2 = Integer.valueOf(i2);
            ValueAnimator[] valueAnimatorArr = {new AnonymousClass6O8(r7, valueOf, valueOf2, 0.2f, i, A012, A013).A00(), new AnonymousClass6O8(r7, valueOf2, valueOf, 0.2f, i2, 0, 182.A01(r2, userSession, 36610022058694619L)).A00()};
            0qQ.A0B(valueAnimatorArr, 0);
            animatorSet.playSequentially(03t.A0I(valueAnimatorArr));
            return animatorSet;
        }
        animatorSet = new AnimatorSet();
        return animatorSet;
    }

    public final void Eqh() {
        C300635xX r2 = this.A03;
        if (r2 != null) {
            r2.A02(this.A04, Integer.valueOf(this.A02));
        }
    }

    public C19526WbC(UserSession userSession, C300635xX r4, Integer num) {
        int i;
        Integer num2;
        this.A03 = r4;
        this.A01 = userSession;
        if (num != null) {
            i = num.intValue();
        } else {
            i = AnonymousClass6LW.A08[0];
        }
        this.A00 = i;
        if (r4 != null) {
            num2 = Integer.valueOf(r4.A02);
        } else {
            num2 = null;
        }
        this.A04 = num2;
        this.A02 = i;
    }

    public final void EIN() {
        Eqh();
    }
}
