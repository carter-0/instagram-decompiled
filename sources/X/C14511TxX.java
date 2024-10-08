package X;

import android.animation.AnimatorSet;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.TxX  reason: case insensitive filesystem */
public final class C14511TxX implements AnonymousClass6O7 {
    public final View A00;
    public final UserSession A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final C300635xX A06;

    public final AnimatorSet Abm() {
        AnimatorSet animatorSet;
        Integer num;
        C300635xX r8 = this.A06;
        if (r8 != null) {
            ArrayList A0q = AnonymousClass7TF.A0q(r8, 0);
            if (this.A04) {
                long A012 = 182.A01(0Tu.A05, this.A01, 36610022058432471L);
                int i = AnonymousClass6LW.A08[0];
                Integer num2 = this.A02;
                if (!(num2 == null || i != num2.intValue() || (num = this.A03) == null)) {
                    i = num.intValue();
                }
                A0q.add(new AnonymousClass6O8(r8, (Integer) null, (Integer) null, 0.0f, i, A012, 0).A00());
            }
            if (this.A05) {
                View view = this.A00;
                UserSession userSession = this.A01;
                0Tu r4 = 0Tu.A05;
                A0q.add(new C18566VuI(view, 0.0f, 0.0f, 120, 182.A01(r4, userSession, 36610022058432471L), 182.A01(r4, userSession, 36610022058498008L)).A01());
                A0q.add(C18566VuI.A00(view, r4, userSession));
            }
            animatorSet.playTogether(A0q);
            return animatorSet;
        }
        animatorSet = new AnimatorSet();
        return animatorSet;
    }

    public final void EIN() {
        C300635xX r3;
        int i;
        if (this.A04 && (r3 = this.A06) != null) {
            Integer num = this.A02;
            if (num != null) {
                i = num.intValue();
            } else {
                i = AnonymousClass6LW.A08[0];
            }
            r3.A02((Integer) null, Integer.valueOf(i));
        }
        if (this.A05) {
            JTR.A1B(this.A00);
        }
    }

    public final void Eqh() {
        C300635xX r3;
        Integer num;
        if (this.A04 && (r3 = this.A06) != null) {
            int i = AnonymousClass6LW.A08[0];
            Integer num2 = this.A02;
            if (!(num2 == null || i != num2.intValue() || (num = this.A03) == null)) {
                i = num.intValue();
            }
            r3.A02((Integer) null, Integer.valueOf(i));
        }
        if (this.A05) {
            JTR.A1B(this.A00);
        }
    }

    public C14511TxX(View view, UserSession userSession, C300635xX r3, Integer num, Integer num2, boolean z, boolean z2) {
        this.A06 = r3;
        this.A01 = userSession;
        this.A00 = view;
        this.A02 = num;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = num2;
    }
}
