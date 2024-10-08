package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public final class U0Q extends AnimatorListenerAdapter implements C20991X8n {
    public boolean A00 = false;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final ViewGroup A04;
    public final boolean A05;

    public U0Q(View view, int i) {
        this.A03 = view;
        this.A02 = i;
        this.A04 = (ViewGroup) view.getParent();
        this.A05 = true;
        A00(true);
    }

    public final void Dtl(C14284TtI ttI) {
    }

    public final void Dtn(C14284TtI ttI) {
        A00(false);
        if (!this.A00) {
            C17158VKk.A02.A04(this.A03, this.A02);
        }
    }

    public final void Dtp(C14284TtI ttI) {
        A00(true);
        if (!this.A00) {
            C17158VKk.A02.A04(this.A03, 0);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    private void A00(boolean z) {
        ViewGroup viewGroup;
        if (this.A05 && this.A01 != z && (viewGroup = this.A04) != null) {
            this.A01 = z;
            VJL.A00(viewGroup, z);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.A00) {
            C17158VKk.A02.A04(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            C17158VKk.A02.A04(this.A03, 0);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public final /* synthetic */ void Dtr(C14284TtI ttI, boolean z) {
    }

    public final void Dtm(C14284TtI ttI) {
        ttI.A0B(this);
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.A00) {
                C17158VKk.A02.A04(this.A03, this.A02);
                ViewGroup viewGroup = this.A04;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            A00(false);
        }
    }
}
