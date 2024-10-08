package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.instagram.android.R;

/* renamed from: X.Jeq  reason: case insensitive filesystem */
public final class C60066Jeq extends LinearLayout implements AnonymousClass08u {
    public int A00 = -1;
    public int A01;
    public int A02 = -1;
    public boolean A03;
    public float A04;
    public float A05;
    public ValueAnimator A06;
    public final Paint A07;

    public C60066Jeq(Context context) {
        super(context, (AttributeSet) null, 0);
        setOrientation(0);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A07 = A0V;
        JTO.A1N(A0V);
        A0V.setStrokeWidth(AnonymousClass7TE.A01(getResources(), C61670oa.A0E() ? R.dimen.abc_control_corner_material : R.dimen.account_recs_header_image_margin));
        AnonymousClass7TE.A1N(context, A0V, 2Yu.A07(context));
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        if (getChildCount() > 0) {
            float f = this.A04;
            float A032 = AnonymousClass7TE.A03(this);
            Paint paint = this.A07;
            canvas2.drawLine(f, A032 - (paint.getStrokeWidth() / 2.0f), this.A05, AnonymousClass7TE.A03(this) - (paint.getStrokeWidth() / 2.0f), paint);
        }
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
        A00(this, f, i, (int) Math.ceil((double) (((float) i) + f)));
    }

    public final void onPageSelected(int i) {
    }

    public final void A02(int i, boolean z) {
        if (this.A02 != i && i < getChildCount()) {
            this.A02 = i;
            ValueAnimator valueAnimator = this.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.setDuration(250);
                valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimator2.addUpdateListener(new LTn(this, i, 3));
                valueAnimator2.addListener(new C59969Jce(this, 1));
                valueAnimator2.setIntValues(new int[]{this.A01, i});
                valueAnimator2.start();
                this.A06 = valueAnimator2;
                return;
            }
            M7Y m7y = new M7Y(this, i);
            if (isLayoutRequested()) {
                0nA.A0p(this, m7y);
            } else {
                m7y.run();
            }
        }
    }

    public final int getSelectedIndex() {
        return this.A01;
    }

    public final void setIndicatorColor(int i) {
        this.A07.setColor(i);
    }

    public final void setIndicatorThickness(float f) {
        this.A07.setStrokeWidth(f);
    }

    public static final void A00(C60066Jeq jeq, float f, int i, int i2) {
        View childAt = jeq.getChildAt(i);
        View childAt2 = jeq.getChildAt(i2);
        if (childAt != null && childAt2 != null) {
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int left2 = childAt2.getLeft();
            int right2 = childAt2.getRight();
            if (!jeq.A03 && C61670oa.A0E()) {
                int i3 = DbU.A05(jeq).getDisplayMetrics().widthPixels / 5;
                int max = Math.max((right - left) - i3, 0) / 2;
                int max2 = Math.max((right2 - left2) - i3, 0) / 2;
                left += max;
                right -= max;
                left2 += max2;
                right2 -= max2;
            }
            float f2 = 1.0f - f;
            jeq.A04 = (((float) left2) * f) + (((float) left) * f2);
            float f3 = (float) right;
            float f4 = (float) right2;
            float f5 = (f4 * f) + (f2 * f3);
            jeq.A05 = f5;
            if (AnonymousClass7TE.A00(f5, f3) > AnonymousClass7TE.A00(f5, f4)) {
                i = i2;
            }
            if (jeq.A00 != i) {
                int childCount = jeq.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt3 = jeq.getChildAt(i4);
                    0qQ.A0C(childAt3, "null cannot be cast to non-null type com.instagram.igds.components.segmentedtabs.TabView");
                    C46720Djx djx = (C46720Djx) childAt3;
                    if (i4 == i) {
                        djx.A01();
                        jeq.A02 = i4;
                    } else {
                        djx.A00();
                    }
                }
                jeq.A00 = i;
            }
            jeq.invalidate();
        }
    }

    public final void A01() {
        if (2eO.A00(getContext())) {
            int i = 0;
            int childCount = getChildCount();
            while (i < childCount) {
                int i2 = this.A01;
                View childAt = getChildAt(i);
                0qQ.A07(childAt);
                int i3 = i + 1;
                AnonymousClass2gY.A00(childAt, i3, getChildCount(), AnonymousClass7TF.A1S(i, i2));
                i = i3;
            }
        }
    }

    public final void setForceIndicatorFullWidth(boolean z) {
        this.A03 = z;
    }
}
