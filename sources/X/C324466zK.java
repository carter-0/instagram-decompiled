package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import com.instagram.android.R;

/* renamed from: X.6zK  reason: invalid class name and case insensitive filesystem */
public final class C324466zK extends C252233om {
    public ValueAnimator.AnimatorUpdateListener A00;
    public ValueAnimator A01;
    public View A02;
    public Integer A03 = AnonymousClass05K.A01;
    public boolean A04;
    public final int A05;
    public final int A06;

    public final void A00() {
        View view = this.A02;
        if (view != null) {
            view.setTranslationY((float) this.A05);
        }
        View view2 = this.A02;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    public final void A01(int i) {
        View view = this.A02;
        if (view != null && !this.A04) {
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i + dimensionPixelSize;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void A04(View view) {
        this.A02 = view;
        if (this.A04) {
            A00();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.A05, 0});
        this.A01 = ofInt;
        if (ofInt != null) {
            ofInt.setDuration((long) this.A06);
        }
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new AnonymousClass9P4(view, this));
        }
        ValueAnimator valueAnimator2 = this.A01;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new C14181TrL(view, this));
        }
        ValueAnimator valueAnimator3 = this.A01;
        if (valueAnimator3 != null) {
            valueAnimator3.setInterpolator(new OvershootInterpolator());
        }
    }

    public final boolean A05() {
        View view = this.A02;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void onPause() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public C324466zK(int i, int i2) {
        this.A05 = i;
        this.A06 = i2;
    }

    public final void A02(View view) {
        A04(view);
        A00();
        View view2 = this.A02;
        if (view2 != null) {
            view2.postDelayed(new C14182TrM(this), 250);
        }
    }

    public final void A03(View view) {
        A04(view);
        View view2 = this.A02;
        if (view2 != null) {
            view2.postDelayed(new C20028Wjo(this), 100);
        }
    }
}
