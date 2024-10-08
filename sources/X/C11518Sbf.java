package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;

/* renamed from: X.Sbf  reason: case insensitive filesystem */
public final class C11518Sbf implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public C11518Sbf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onPreDraw() {
        if (this.A00 != 0) {
            View view = ((Q9N) this.A01).A01;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            view.setTranslationY(AnonymousClass7TE.A03(view));
            view.animate().translationY(0.0f).setInterpolator(new DecelerateInterpolator()).setListener((Animator.AnimatorListener) null).setDuration(250).start();
            return false;
        }
        EditText editText = (EditText) this.A01;
        editText.getViewTreeObserver().removeOnPreDrawListener(this);
        editText.setSelection(editText.length());
        return true;
    }
}
