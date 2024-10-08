package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.List;

/* renamed from: X.SOs  reason: case insensitive filesystem */
public final class C11356SOs {
    public final 01r A00 = new 01r(0);
    public final 01r A01 = new 01r(0);

    public static C11356SOs A00(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return A01(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                return A01(DbV.A14(loadAnimator));
            }
            return null;
        } catch (Exception e) {
            Log.w("MotionSpec", 002.A0R("Can't load animation resource ID #0x", Integer.toHexString(i)), e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.RRO, java.lang.Object] */
    public static C11356SOs A01(List list) {
        C11356SOs sOs = new C11356SOs();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                sOs.A00.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = AnonymousClass6Y2.A02;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = AnonymousClass6Y2.A01;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = AnonymousClass6Y2.A04;
                }
                ? obj = new Object();
                obj.A00 = 0;
                obj.A01 = 1;
                obj.A02 = startDelay;
                obj.A03 = duration;
                obj.A04 = interpolator;
                obj.A00 = objectAnimator.getRepeatCount();
                obj.A01 = objectAnimator.getRepeatMode();
                sOs.A01.put(propertyName, obj);
                i++;
            } else {
                throw C51973G9u.A0g(animator, "Animator must be an ObjectAnimator: ", AnonymousClass7TE.A1A());
            }
        }
        return sOs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11356SOs)) {
            return false;
        }
        return this.A01.equals(((C11356SOs) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(10);
        A1A.append(C66581MXm.A0y(this));
        A1A.append('{');
        A1A.append(Pxf.A0h(this));
        A1A.append(" timings: ");
        A1A.append(this.A01);
        return AnonymousClass7TF.A0l("}\n", A1A);
    }
}
