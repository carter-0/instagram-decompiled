package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import com.instagram.common.session.UserSession;

/* renamed from: X.3jJ  reason: invalid class name and case insensitive filesystem */
public abstract class C249213jJ {
    public static final AnonymousClass9IE A00(AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(C249223jK.A00(userSession));
        ofFloat.addUpdateListener(animatorUpdateListener);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(C249223jK.A01(userSession));
        ofFloat2.setStartDelay(182.A01(0Tu.A05, userSession, 36602127910179387L));
        ofFloat2.addUpdateListener(animatorUpdateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(animatorListenerAdapter);
        return new AnonymousClass9IE((Object) animatorSet, 5);
    }

    public static final AnonymousClass9IE A01(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(C249223jK.A01(userSession));
        ofFloat.addUpdateListener(animatorUpdateListener);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(C249223jK.A00(userSession));
        ofFloat2.setStartDelay(182.A01(0Tu.A05, userSession, 36602127910179387L));
        ofFloat2.addUpdateListener(animatorUpdateListener);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        return new AnonymousClass9IE((Object) animatorSet, 5);
    }

    public static final void A02(Handler handler, UserSession userSession, C59552JNy jNy) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(handler, 2);
        handler.postDelayed(new C57719IfM(jNy), 182.A01(0Tu.A05, userSession, 36602127910310461L));
    }
}
