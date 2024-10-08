package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public final class U0F extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public U0F(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                ((01r) this.A02).remove(animator);
                ((C14284TtI) this.A01).A0F.remove(animator);
                return;
            case 1:
                U3Z u3z = (U3Z) this.A02;
                C17722Vcr vcr = (C17722Vcr) this.A01;
                C17185VLp vLp = vcr.A09;
                if (vLp != null && !u3z.A03.hasMessages(1, vcr)) {
                    U3Z.A04(vcr, u3z, vLp);
                    return;
                }
                return;
            case 2:
                ((View) this.A02).setVisibility(0);
                return;
            case 3:
                C18488Vsj vsj = (C18488Vsj) this.A02;
                View view = vsj.A02;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                0qQ.A0C(layoutParams, AnonymousClass000.A00(6));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                X7D x7d = (X7D) this.A01;
                layoutParams2.weight = 1.0f;
                int i = 0;
                layoutParams2.width = 0;
                if (vsj.A04) {
                    layoutParams2.rightMargin = 0;
                    if (vsj.A00) {
                        i = view.getLeft();
                    }
                    layoutParams2.leftMargin = i;
                } else {
                    layoutParams2.leftMargin = 0;
                    if (vsj.A00) {
                        i = view.getLeft();
                    }
                    layoutParams2.rightMargin = i;
                }
                view.setLayoutParams(layoutParams2);
                x7d.DC3();
                return;
            default:
                ((View) this.A01).setVisibility(8);
                ((View) this.A02).setVisibility(8);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 0:
                ((C14284TtI) this.A01).A0F.add(animator);
                return;
            case 1:
                ((C17722Vcr) this.A01).A0A = false;
                return;
            case 2:
                ((View) this.A01).setVisibility(0);
                return;
            case 3:
                ((X7D) this.A01).onStart();
                return;
            default:
                return;
        }
    }
}
