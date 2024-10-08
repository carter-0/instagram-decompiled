package X;

import android.animation.AnimatorSet;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.TxY  reason: case insensitive filesystem */
public final class C14512TxY implements AnonymousClass6O7 {
    public final int A00;
    public final View A01;
    public final UserSession A02;
    public final boolean A03;
    public final int A04;
    public final int A05;
    public final C300635xX A06;
    public final Integer A07;
    public final Integer A08;

    public final AnimatorSet Abm() {
        AnimatorSet animatorSet;
        C300635xX r10 = this.A06;
        if (r10 != null) {
            ArrayList arrayList = new ArrayList();
            int i = r10.A02;
            int i2 = this.A00;
            UserSession userSession = this.A02;
            0Tu r0 = 0Tu.A05;
            arrayList.add(new AnonymousClass6O8(r10, Integer.valueOf(i), Integer.valueOf(i2), 0.2f, i, 182.A01(r0, userSession, 36610022058432471L), 182.A01(r0, userSession, 36610022058366934L)).A00());
            if (this.A03) {
                View view = this.A01;
                arrayList.add(new C18566VuI(view, 0.0f, 0.0f, 120, 182.A01(r0, userSession, 36610022058432471L), 182.A01(r0, userSession, 36610022058498008L)).A01());
                arrayList.add(C18566VuI.A00(view, r0, userSession));
            }
            animatorSet.playTogether(arrayList);
            return animatorSet;
        }
        animatorSet = new AnimatorSet();
        return animatorSet;
    }

    public final void EIN() {
        C300635xX r2 = this.A06;
        if (r2 != null) {
            r2.A02(this.A08, Integer.valueOf(this.A05));
        }
        if (this.A03) {
            JTR.A1B(this.A01);
        }
    }

    public final void Eqh() {
        C300635xX r2 = this.A06;
        if (r2 != null) {
            r2.A02(Integer.valueOf(this.A04), this.A07);
        }
        if (this.A03) {
            JTR.A1B(this.A01);
        }
    }

    public C14512TxY(View view, UserSession userSession, C300635xX r6, Integer num, boolean z) {
        Integer num2;
        int i;
        this.A06 = r6;
        this.A01 = view;
        this.A02 = userSession;
        this.A03 = z;
        Integer num3 = null;
        if (r6 != null) {
            num2 = Integer.valueOf(r6.A02);
        } else {
            num2 = null;
        }
        this.A07 = num2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = AnonymousClass6LW.A08[0];
        }
        this.A04 = i;
        this.A05 = i;
        this.A08 = r6 != null ? Integer.valueOf(r6.A02) : num3;
        this.A00 = i;
    }
}
