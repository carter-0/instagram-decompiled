package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.ui.widget.pulsingbutton.PulsingPillButton;

/* renamed from: X.PXl  reason: case insensitive filesystem */
public final class C73150PXl implements Runnable {
    public final /* synthetic */ PulsingPillButton A00;

    public C73150PXl(PulsingPillButton pulsingPillButton) {
        this.A00 = pulsingPillButton;
    }

    public final void run() {
        PulsingPillButton pulsingPillButton = this.A00;
        if (pulsingPillButton.A04) {
            AnimatorSet animatorSet = pulsingPillButton.A06;
            if (!animatorSet.isStarted()) {
                FrameLayout frameLayout = pulsingPillButton.A08;
                frameLayout.setVisibility(0);
                FrameLayout frameLayout2 = pulsingPillButton.A09;
                frameLayout2.setVisibility(0);
                int i = frameLayout.getLayoutParams().width;
                int i2 = frameLayout.getLayoutParams().height;
                Context A0S = AnonymousClass7TE.A0S(pulsingPillButton);
                float f = (float) i;
                float A002 = 0nA.A00(A0S, pulsingPillButton.A00) * 2.0f;
                float f2 = (float) i2;
                float f3 = (f + A002) / f;
                float f4 = (A002 + f2) / f2;
                int i3 = frameLayout2.getLayoutParams().width;
                int i4 = frameLayout2.getLayoutParams().height;
                float f5 = (float) i3;
                float A003 = 0nA.A00(A0S, pulsingPillButton.A01) * 2.0f;
                float f6 = (float) i4;
                float f7 = (f5 + A003) / f5;
                float f8 = (A003 + f6) / f6;
                int i5 = pulsingPillButton.A02;
                boolean z = pulsingPillButton.A03;
                float f9 = 1.0f;
                if (z) {
                    f9 = 0.3f;
                }
                Keyframe ofFloat = Keyframe.ofFloat(0.0f, f9);
                Keyframe ofFloat2 = Keyframe.ofFloat(1.0f, 0.0f);
                Property property = View.ALPHA;
                PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(property, new Keyframe[]{ofFloat, ofFloat2});
                PropertyValuesHolder A004 = ORL.A00(f3, z);
                PropertyValuesHolder A01 = ORL.A01(f4, z);
                0qQ.A0A(ofKeyframe);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout, new PropertyValuesHolder[]{A004, A01, ofKeyframe});
                0qQ.A07(ofPropertyValuesHolder);
                ofPropertyValuesHolder.setDuration(2000);
                ofPropertyValuesHolder.setRepeatCount(i5);
                int i6 = pulsingPillButton.A02;
                boolean z2 = pulsingPillButton.A03;
                float f10 = 0.3f;
                if (z2) {
                    f10 = 1.0f;
                }
                PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(property, new Keyframe[]{Keyframe.ofFloat(0.0f, f10), Keyframe.ofFloat(1.0f, 0.0f)});
                PropertyValuesHolder A005 = ORL.A00(f7, z2);
                PropertyValuesHolder A012 = ORL.A01(f8, z2);
                0qQ.A0A(ofKeyframe2);
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(frameLayout2, new PropertyValuesHolder[]{A005, A012, ofKeyframe2});
                0qQ.A07(ofPropertyValuesHolder2);
                ofPropertyValuesHolder2.setDuration(2000);
                ofPropertyValuesHolder2.setRepeatCount(i6);
                animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofPropertyValuesHolder2});
                animatorSet.start();
                return;
            }
        }
        if (!pulsingPillButton.A04) {
            pulsingPillButton.A08.setVisibility(8);
            pulsingPillButton.A09.setVisibility(8);
            AnimatorSet animatorSet2 = pulsingPillButton.A06;
            if (animatorSet2.isStarted()) {
                animatorSet2.end();
            }
        }
    }
}
