package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.MsY  reason: case insensitive filesystem */
public final class C67694MsY extends FrameLayout {
    public final AnimatorSet A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ImageView A03;

    public C67694MsY(Context context) {
        super(context, (AttributeSet) null, 0);
        View inflate = DbV.A0D(this).inflate(R.layout.pulsing_image_view, this, true);
        ImageView A0G = DbS.A0G(inflate, R.id.pulse_circle_outer);
        this.A03 = A0G;
        ImageView A0G2 = DbS.A0G(inflate, R.id.pulse_circle_inner);
        this.A02 = A0G2;
        this.A01 = DbS.A0G(inflate, R.id.pulse_icon);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.playTogether(new Animator[]{C61210lx.A01(A0G), C61210lx.A01(A0G2)});
    }

    public final void setButtonResource(int i) {
        this.A01.setImageResource(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public final void setPulsingEnabled(boolean z) {
        if (z) {
            AnimatorSet animatorSet = this.A00;
            if (!animatorSet.isStarted()) {
                this.A03.setVisibility(0);
                this.A02.setVisibility(0);
                animatorSet.start();
                return;
            }
            return;
        }
        this.A03.setVisibility(8);
        this.A02.setVisibility(8);
        AnimatorSet animatorSet2 = this.A00;
        if (animatorSet2.isStarted()) {
            animatorSet2.end();
        }
    }
}
