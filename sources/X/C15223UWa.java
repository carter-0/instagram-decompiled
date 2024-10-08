package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.UWa  reason: case insensitive filesystem */
public final class C15223UWa extends VV7 {
    public AnimatorSet A00;
    public ValueAnimator A01;
    public final TextWatcher A02 = new W7b(this, 1);
    public final View.OnFocusChangeListener A03 = new WBI(this, 1);
    public final X35 A04 = new WMY(this);
    public final X36 A05 = new C19120WMb(this);

    public static void A00(C15223UWa uWa, boolean z) {
        Animator animator;
        boolean A0T = uWa.A02.A0T();
        boolean A1S = AnonymousClass7TF.A1S(A0T ? 1 : 0, z ? 1 : 0);
        AnimatorSet animatorSet = uWa.A00;
        if (!z) {
            animatorSet.cancel();
            uWa.A01.start();
            if (A1S) {
                animator = uWa.A01;
            } else {
                return;
            }
        } else if (!animatorSet.isRunning()) {
            uWa.A01.cancel();
            uWa.A00.start();
            if (A1S) {
                animator = uWa.A00;
            } else {
                return;
            }
        } else {
            return;
        }
        animator.end();
    }

    public C15223UWa(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }
}
