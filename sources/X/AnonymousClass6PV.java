package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6PV  reason: invalid class name */
public final class AnonymousClass6PV {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public ConstraintLayout A07;
    public ConstraintLayout A08;
    public IgLinearLayout A09;
    public CircularImageView A0A;
    public String A0B = "";
    public boolean A0C;
    public final C252063oV A0D;

    public AnonymousClass6PV(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A0D = A012;
        A012.EeU(new AnonymousClass6PW(this));
    }

    public final View A00() {
        View view = this.A01;
        if (view != null) {
            return view;
        }
        0qQ.A0F("containerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView A01() {
        TextView textView = this.A03;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("ctaButtonView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        if (!this.A0C) {
            A01().setVisibility(0);
            ConstraintLayout constraintLayout = this.A08;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            } else {
                0qQ.A0F("ctaButtonLayout");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        if (this.A0B.length() == 0) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(A00().getContext(), R.anim.button_slide_down_100_to_20);
                loadAnimation.setAnimationListener(new IE4(this));
                ConstraintLayout constraintLayout2 = this.A08;
                if (constraintLayout2 != null) {
                    constraintLayout2.startAnimation(loadAnimation);
                } else {
                    0qQ.A0F("ctaButtonLayout");
                    throw AnonymousClass00P.createAndThrow();
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
    }
}
