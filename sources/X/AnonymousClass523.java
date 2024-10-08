package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.instagram.common.session.UserSession;

/* renamed from: X.523  reason: invalid class name */
public final class AnonymousClass523 implements C242803Vz {
    public float A00;
    public Integer A01 = AnonymousClass05K.A00;
    public String A02;
    public boolean A03;
    public int A04 = -1;
    public final ValueAnimator A05;
    public final UserSession A06;
    public final Animator.AnimatorListener A07;
    public final AnimatorSet A08;
    public final ValueAnimator.AnimatorUpdateListener A09;
    public final ValueAnimator.AnimatorUpdateListener A0A;
    public final ValueAnimator A0B;

    public AnonymousClass523(UserSession userSession, long j) {
        0qQ.A0B(userSession, 2);
        AnonymousClass524 r3 = new AnonymousClass524(this);
        this.A07 = r3;
        AnonymousClass525 r4 = new AnonymousClass525(this);
        this.A09 = r4;
        AnonymousClass526 r1 = new AnonymousClass526(this);
        this.A0A = r1;
        this.A06 = userSession;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A05 = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(r4);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 0.0f, 1.0f});
        this.A0B = ofFloat2;
        ofFloat2.addUpdateListener(r1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A08 = animatorSet;
        ofFloat.setDuration(j);
        ofFloat2.setDuration(j);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(r3);
    }

    public final void A00() {
        if (this.A01 == AnonymousClass05K.A00) {
            this.A08.start();
            if (182.A06(0Tu.A05, this.A06, 36310439512309868L)) {
                AnonymousClass2S0.A01.A03();
            }
        }
    }

    public final void A01(int i) {
        11Z.A06("This operation must be run on UI thread.");
        this.A04 = i;
    }

    public final /* synthetic */ int BKg() {
        return -1;
    }

    public final /* synthetic */ int BL7() {
        return -1;
    }

    public final int getPosition() {
        int i = this.A04;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Position is not set.");
    }
}
