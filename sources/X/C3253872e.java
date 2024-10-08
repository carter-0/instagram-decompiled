package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;

/* renamed from: X.72e  reason: invalid class name and case insensitive filesystem */
public abstract class C3253872e {
    public static int A00;
    public static int A01;
    public static Interpolator A02;
    public static boolean A03;
    public static boolean A04;

    public static Animation A00(Fragment fragment, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context;
        int i2;
        int i3;
        int i4;
        View view = fragment.mView;
        if (fragment instanceof AnonymousClass4DH) {
            context = ((AnonymousClass4DH) fragment).getThemedContext();
        } else {
            context = fragment.getContext();
        }
        Animation animation = null;
        if (z) {
            context.getClass();
            animation = AnimationUtils.loadAnimation(context, i);
            animation.setAnimationListener(new AnonymousClass72G(context, view, z4));
            if (A03) {
                animation.setInterpolator(A02);
                if (z3) {
                    i4 = A00;
                } else {
                    i4 = A01;
                }
                animation.setDuration((long) i4);
                A03 = false;
            }
            if (!A04 && (context instanceof C249453jo)) {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                loadAnimation.setAnimationListener(new AnonymousClass72G(context, view, z4));
                if (A03) {
                    loadAnimation.setInterpolator(A02);
                    if (z3) {
                        i3 = A00;
                    } else {
                        i3 = A01;
                    }
                    loadAnimation.setDuration((long) i3);
                    A03 = false;
                }
                loadAnimation.reset();
                Activity activity = (Activity) context;
                ViewGroup viewGroup = 2dZ.A0t.A03(activity).A0P;
                viewGroup.clearAnimation();
                viewGroup.setAnimation(loadAnimation);
                View findViewById = activity.findViewById(16908335);
                if (findViewById != null) {
                    findViewById.clearAnimation();
                    findViewById.setAnimation(loadAnimation);
                }
            }
        } else if (view != null && z2) {
            A04 = fragment instanceof AnonymousClass4DS;
            context.getClass();
            view.setElevation(0.0f);
            animation = AnimationUtils.loadAnimation(context, i);
            if (A03) {
                animation.setInterpolator(A02);
                if (z3) {
                    i2 = A00;
                } else {
                    i2 = A01;
                }
                animation.setDuration((long) i2);
                A03 = false;
                return animation;
            }
        }
        return animation;
    }
}
