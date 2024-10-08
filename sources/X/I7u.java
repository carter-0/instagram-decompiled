package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class I7u implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GMF A01;
    public final /* synthetic */ Integer A02;

    public I7u(GMF gmf, Integer num, int i) {
        this.A01 = gmf;
        this.A02 = num;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        float f;
        0qQ.A0B(valueAnimator, 0);
        GMF gmf = this.A01;
        Integer num = this.A02;
        int i = this.A00;
        float A04 = C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
        Integer num2 = AnonymousClass05K.A00;
        IgImageView igImageView = gmf.A07;
        if (num == num2) {
            if (igImageView != null) {
                igImageView.setAlpha(1.0f - A04);
            }
            IgTextView igTextView = gmf.A06;
            if (igTextView != null) {
                igTextView.setAlpha(1.0f - A04);
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView = gmf.A08;
            if (gradientSpinnerAvatarView != null) {
                gradientSpinnerAvatarView.setAlpha(A04);
            }
            IgTextView igTextView2 = gmf.A05;
            if (igTextView2 != null) {
                igTextView2.setAlpha(A04);
            }
            IgImageView igImageView2 = gmf.A07;
            if (igImageView2 != null) {
                igImageView2.setRotation(-54.000004f * A04);
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gmf.A08;
            if (gradientSpinnerAvatarView2 != null) {
                gradientSpinnerAvatarView2.setRotation(54.000004f * (1.0f - A04));
            }
            ViewGroup viewGroup2 = gmf.A04;
            if (viewGroup2 != null) {
                AnonymousClass0eM r1 = gmf.A0P;
                0nA.A0Z(viewGroup2, (int) (((float) DbX.A07(r1)) - (((float) (DbX.A07(r1) - DbX.A07(gmf.A0O))) * (1.0f - A04))));
            }
            viewGroup = gmf.A03;
            if (viewGroup != null) {
                f = ((float) i) - (((float) gmf.A00) * A04);
            } else {
                return;
            }
        } else {
            if (igImageView != null) {
                igImageView.setAlpha(A04);
            }
            IgTextView igTextView3 = gmf.A06;
            if (igTextView3 != null) {
                igTextView3.setAlpha(A04);
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView3 = gmf.A08;
            if (gradientSpinnerAvatarView3 != null) {
                gradientSpinnerAvatarView3.setAlpha(1.0f - A04);
            }
            IgTextView igTextView4 = gmf.A05;
            if (igTextView4 != null) {
                igTextView4.setAlpha(1.0f - A04);
            }
            IgImageView igImageView3 = gmf.A07;
            if (igImageView3 != null) {
                igImageView3.setRotation(-54.000004f * (1.0f - A04));
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView4 = gmf.A08;
            if (gradientSpinnerAvatarView4 != null) {
                gradientSpinnerAvatarView4.setRotation(54.000004f * A04);
            }
            ViewGroup viewGroup3 = gmf.A04;
            if (viewGroup3 != null) {
                AnonymousClass0eM r12 = gmf.A0P;
                0nA.A0Z(viewGroup3, (int) (((float) DbX.A07(r12)) - (((float) (DbX.A07(r12) - DbX.A07(gmf.A0O))) * A04)));
            }
            viewGroup = gmf.A03;
            if (viewGroup != null) {
                f = ((float) i) + (((float) gmf.A00) * A04);
            } else {
                return;
            }
        }
        0nA.A0f(viewGroup, (int) f);
    }
}
