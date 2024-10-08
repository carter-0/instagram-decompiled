package X;

import android.animation.Animator;
import android.view.View;
import com.instagram.reels.viewer.attribution.CyclingFrameLayout;
import java.util.List;

/* renamed from: X.6KR  reason: invalid class name */
public final class AnonymousClass6KR implements Animator.AnimatorListener {
    public boolean A00;
    public final /* synthetic */ CyclingFrameLayout A01;

    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public AnonymousClass6KR(CyclingFrameLayout cyclingFrameLayout) {
        this.A01 = cyclingFrameLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        Integer num;
        CyclingFrameLayout cyclingFrameLayout = this.A01;
        List list = cyclingFrameLayout.A0B;
        if (!list.isEmpty()) {
            cyclingFrameLayout.setLayerType(0);
            ((View) list.get(cyclingFrameLayout.A02)).setVisibility(8);
            cyclingFrameLayout.A02 = cyclingFrameLayout.getNextViewIndex();
            if (!this.A00 && cyclingFrameLayout.A06) {
                Integer num2 = cyclingFrameLayout.A05;
                if (num2 != null) {
                    num = Integer.valueOf(num2.intValue() - 1);
                } else {
                    num = null;
                }
                cyclingFrameLayout.A05 = num;
                if (num == null || num.intValue() > 0) {
                    CyclingFrameLayout.A01(cyclingFrameLayout);
                } else {
                    cyclingFrameLayout.A06 = false;
                    C74266Pru pru = cyclingFrameLayout.A04;
                    if (pru != null) {
                        PJY pjy = (PJY) pru;
                        AnonymousClass7LZ r1 = pjy.A01;
                        if (r1.A0q) {
                            C330447Mu r2 = pjy.A00;
                            C254793t3 r0 = r1.A0C;
                            if (r0 != null) {
                                1Au.A00(r2.A0Q).A0v(C300965yF.A07(r0));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.A00 = false;
        }
    }

    public final void onAnimationStart(Animator animator) {
        CyclingFrameLayout cyclingFrameLayout = this.A01;
        int A002 = cyclingFrameLayout.getNextViewIndex();
        List list = cyclingFrameLayout.A0B;
        ((View) list.get(A002)).setAlpha(0.0f);
        ((View) list.get(A002)).setVisibility(0);
    }
}
