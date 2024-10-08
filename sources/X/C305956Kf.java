package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.6Kf  reason: invalid class name and case insensitive filesystem */
public final class C305956Kf {
    public static final C305956Kf A00 = new Object();

    public static final ObjectAnimator A02(C307086Ot r7) {
        long j;
        int ordinal = r7.A05.ordinal();
        if (ordinal == 3) {
            j = 1200;
        } else if (ordinal != 2) {
            j = 1300;
        } else {
            j = 300;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7.A00(), "translationY", new float[]{0.0f});
        ofFloat.setDuration(1300);
        ofFloat.setStartDelay(j);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        return ofFloat;
    }

    public static final AnimatorSet A00(C307086Ot r10, int i) {
        TextView A01 = r10.A01();
        long j = ((long) i) + 900;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(A01, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(250);
        ofFloat.setStartDelay(j);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(A01, "translationY", new float[]{0.0f});
        ofFloat2.setDuration(250);
        ofFloat2.setStartDelay(j);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        return animatorSet;
    }

    public static final AnimatorSet A01(C307086Ot r9, int i, long j) {
        ImageView A002 = r9.A00();
        long j2 = ((long) i) + 600;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(A002, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.setStartDelay(j2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(A002, "translationY", new float[]{r9.A01});
        ofFloat2.setDuration(j);
        ofFloat2.setStartDelay(j2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        return animatorSet;
    }

    public static final void A03(C305946Ke r1) {
        AnimatorSet A002 = r1.A00();
        if (A002 != null) {
            A002.cancel();
        }
        C309426Yf r12 = r1.A00;
        if (r12 != null) {
            r12.A0t = false;
        }
    }
}
