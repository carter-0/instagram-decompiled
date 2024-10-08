package X;

import android.animation.Animator;
import android.media.SoundPool;
import com.instagram.common.session.UserSession;

/* renamed from: X.I7d  reason: case insensitive filesystem */
public final class C56674I7d implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SoundPool A02;
    public final /* synthetic */ UserSession A03;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public C56674I7d(SoundPool soundPool, UserSession userSession, int i, int i2) {
        this.A03 = userSession;
        this.A02 = soundPool;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void onAnimationEnd(Animator animator) {
        if (C255613uQ.A00(this.A03, (Integer) null, false, false)) {
            SoundPool soundPool = this.A02;
            int i = this.A01;
            float f = (float) this.A00;
            soundPool.play(i, f, f, 1, 0, 1.0f);
        }
    }
}
