package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;

public final class W42 implements Animator.AnimatorListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ boolean A03;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public W42(Context context, View view, Fragment fragment, boolean z) {
        this.A02 = fragment;
        this.A00 = context;
        this.A01 = view;
        this.A03 = z;
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.A01;
        if (this.A03 && view != null) {
            view.setElevation(0.0f);
            view.setBackground(AnonymousClass73A.A02);
        }
    }

    public final void onAnimationStart(Animator animator) {
        Context context = this.A00;
        View view = this.A01;
        if (this.A03 && view != null) {
            view.setElevation(0nA.A04(context, 4));
            Drawable background = view.getBackground();
            background.getClass();
            AnonymousClass73A.A02 = background;
            Pxf.A1B(view, 2Yu.A00(context));
        }
    }
}
