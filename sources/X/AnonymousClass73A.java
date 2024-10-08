package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;

/* renamed from: X.73A  reason: invalid class name */
public abstract class AnonymousClass73A {
    public static int A00;
    public static int A01;
    public static Drawable A02;
    public static Interpolator A03;
    public static boolean A04;

    public static Animator A00(Fragment fragment, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        View view = fragment.mView;
        Context context = fragment.getContext();
        if (i == 0 || !z2 || context == null) {
            return null;
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
        if (A04) {
            Interpolator interpolator = A03;
            if (interpolator != null) {
                loadAnimator.setInterpolator(interpolator);
            }
            if (z3) {
                i2 = A00;
            } else {
                i2 = A01;
            }
            loadAnimator.setDuration((long) i2);
            A04 = false;
        }
        loadAnimator.addListener(new W42(context, view, fragment, z));
        return loadAnimator;
    }
}
