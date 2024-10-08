package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: X.2gu  reason: invalid class name and case insensitive filesystem */
public interface C226492gu {
    C226492gu A8s(Animator.AnimatorListener animatorListener);

    C226492gu AAc(ValueAnimator.AnimatorUpdateListener animatorUpdateListener);

    C226492gu AB9(boolean z);

    void ABF(float f);

    void APO();

    C226492gu AWD(String str);

    float AzF();

    float BhR();

    int Bm3();

    C49443Evk CLv(String[] strArr, float f, float f2);

    void E2p();

    void EDF();

    void EDp(Animator.AnimatorListener animatorListener);

    C226492gu EFJ(int i);

    C226492gu EFK();

    C226492gu EL2(float f);

    C226492gu Ea6(TimeInterpolator timeInterpolator);

    @Deprecated
    C226492gu FNX(float f, float f2);

    boolean isFinished();

    boolean isPlaying();

    void pause();

    void stop();
}
