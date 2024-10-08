package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;
import com.instagram.android.R;

public final class U0O extends AnimatorListenerAdapter implements C20991X8n {
    public boolean A00 = false;
    public final View A01;

    public final void Dtl(C14284TtI ttI) {
    }

    public final void Dtm(C14284TtI ttI) {
    }

    public final void Dtr(C14284TtI ttI, boolean z) {
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void Dtn(C14284TtI ttI) {
        float f;
        View view = this.A01;
        if (view.getVisibility() == 0) {
            f = C17158VKk.A02.A00(view);
        } else {
            f = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    public final void Dtp(C14284TtI ttI) {
        this.A01.setTag(R.id.transition_pause_alpha, (Object) null);
    }

    public final void onAnimationCancel(Animator animator) {
        C17158VKk.A02.A03(this.A01, 1.0f);
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.A01;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.A00 = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public U0O(View view) {
        this.A01 = view;
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.A00) {
            this.A01.setLayerType(0, (Paint) null);
        }
        if (!z) {
            C17158VKk.A02.A03(this.A01, 1.0f);
        }
    }
}
