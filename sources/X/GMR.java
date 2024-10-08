package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.common.session.UserSession;
import java.util.NoSuchElementException;

public abstract class GMR {
    public static final float A00(float f, float f2, float f3) {
        float f4 = f * f2;
        float f5 = -1.0f * f3;
        return (f4 <= f5 || f4 >= f3) ? f4 < f5 ? f5 : f3 : f4;
    }

    public static final float A01(UserSession userSession, float f) {
        float A01 = (float) 182.A01(DbS.A0J(userSession, 1), userSession, 36609244669351767L);
        float f2 = -1.0f * A01;
        if (f <= f2 || f >= A01) {
            int i = (f > f2 ? 1 : (f == f2 ? 0 : -1));
            f = A01;
            if (i < 0) {
                return f2;
            }
        }
        return f;
    }

    public static ValueAnimator A02(float[] fArr, float f, float f2) {
        fArr[0] = f;
        fArr[1] = f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofFloat;
    }

    public static final C61084JwM A03(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener3, UserSession userSession, long j, boolean z) {
        long j2;
        float f;
        float f2;
        int i;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 5);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.05f});
        C51969G9p.A10(ofFloat);
        0Tu r4 = 0Tu.A05;
        ofFloat.setDuration(182.A01(r4, userSession2, 36602127909261877L));
        ofFloat.setStartDelay(j);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener4 = animatorUpdateListener;
        ofFloat.addUpdateListener(animatorUpdateListener4);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.05f, 1.0f});
        C51969G9p.A10(ofFloat2);
        ofFloat2.setDuration(182.A01(r4, userSession2, 36602127909458488L));
        ofFloat2.addUpdateListener(animatorUpdateListener4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        if (z) {
            j2 = 182.A01(r4, userSession2, 36602127909196340L);
        } else {
            j2 = 0;
        }
        int A04 = DbS.A04(r4, userSession2, 36602127912342084L);
        int A042 = DbS.A04(r4, userSession2, 36602127912473158L);
        try {
            f = (float) C51972G9s.A05(A04, A042);
        } catch (NoSuchElementException unused) {
            0f9 AEf = 0wj.A01.AEf("Invalid sway range", 817892647);
            AEf.ABO("xMin", A04);
            AEf.ABO("xMax", A042);
            AEf.report();
            f = 5.0f;
        }
        int A043 = DbS.A04(r4, userSession2, 36602127912407621L);
        int A044 = DbS.A04(r4, userSession2, 36602127912538695L);
        try {
            i = A043;
            float A05 = (float) C51972G9s.A05(A043, A044);
            i = A05;
            f2 = A05;
        } catch (NoSuchElementException unused2) {
            0f9 AEf2 = 0wj.A01.AEf("Invalid sway range", 817892647);
            AEf2.ABO("yMin", i);
            AEf2.ABO("yMax", A044);
            AEf2.report();
            f2 = 2.0f;
        }
        2SP r0 = 2SP.A01;
        boolean A0A = r0.A0A();
        boolean A0A2 = r0.A0A();
        if (!A0A) {
            f = -f;
        }
        if (!A0A2) {
            f2 = -f2;
        }
        ValueAnimator A02 = A02(new float[2], 0.0f, f);
        A02.setDuration(182.A01(r4, userSession2, 36602127909327414L) / 2);
        A02.setStartDelay(animatorSet.getTotalDuration() + j2);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener5 = animatorUpdateListener2;
        A02.addUpdateListener(animatorUpdateListener5);
        ValueAnimator A022 = A02(new float[2], f, -f);
        A022.setDuration(182.A01(r4, userSession2, 36602127909327414L));
        A022.setRepeatCount(-1);
        A022.setRepeatMode(2);
        A022.addUpdateListener(animatorUpdateListener5);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(new Animator[]{A02, A022});
        ValueAnimator A023 = A02(new float[2], 0.0f, f2);
        A023.setDuration(182.A01(r4, userSession2, 36602127909327414L) / 2);
        A023.setStartDelay(animatorSet.getTotalDuration() + j2);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener6 = animatorUpdateListener3;
        A023.addUpdateListener(animatorUpdateListener6);
        ValueAnimator A024 = A02(new float[2], f2, -f2);
        A024.setDuration(182.A01(r4, userSession2, 36602127909327414L));
        A024.setRepeatCount(-1);
        A024.setRepeatMode(2);
        A024.addUpdateListener(animatorUpdateListener6);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{A023, A024});
        return new C61084JwM(14, (Object) animatorSet, (Object) animatorSet2, (Object) animatorSet3);
    }
}
