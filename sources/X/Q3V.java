package X;

import android.animation.Animator;
import com.instagram.android.R;
import java.util.AbstractMap;

public final class Q3V implements Animator.AnimatorListener {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C229612nk A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public Q3V(C307786Rm r1, C229612nk r2, String str, boolean z) {
        this.A03 = z;
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.A03) {
            C307786Rm r2 = this.A00;
            ((AbstractMap) r2.A00(R.id.bk_context_key_animations)).remove(this.A02);
        }
        C229612nk r22 = this.A01;
        if (r22 != null) {
            r22.A00(this.A00, this.A02);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A03) {
            C307786Rm r2 = this.A00;
            ((AbstractMap) r2.A00(R.id.bk_context_key_animations)).remove(this.A02);
        }
        C229612nk r22 = this.A01;
        if (r22 != null) {
            r22.A00(this.A00, this.A02);
        }
    }
}
