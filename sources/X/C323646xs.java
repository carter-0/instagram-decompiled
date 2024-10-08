package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6xs  reason: invalid class name and case insensitive filesystem */
public final class C323646xs extends LinearLayout {
    public float A00;
    public int A01 = -1;
    public ValueAnimator A02;
    public final /* synthetic */ TabLayout A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C323646xs(Context context, TabLayout tabLayout) {
        super(context);
        this.A03 = tabLayout;
        setWillNotDraw(false);
    }

    public static void A00(View view, View view2, C323646xs r12, float f) {
        int i;
        int round;
        float sin;
        double cos;
        if (view == null || view.getWidth() <= 0) {
            TabLayout tabLayout = r12.A03;
            Drawable drawable = tabLayout.A0I;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.A0I.getBounds().bottom);
        } else {
            TabLayout tabLayout2 = r12.A03;
            C323666xu r0 = tabLayout2.A0K;
            Drawable drawable2 = tabLayout2.A0I;
            boolean z = r0 instanceof C3252471p;
            RectF A002 = C323666xu.A00(view, tabLayout2);
            RectF A003 = C323666xu.A00(view2, tabLayout2);
            if (z) {
                float f2 = A002.left;
                float f3 = A003.left;
                double d = (((double) f) * 3.141592653589793d) / 2.0d;
                if (f2 < f3) {
                    sin = (float) (1.0d - Math.cos(d));
                    cos = Math.sin(d);
                } else {
                    sin = (float) Math.sin(d);
                    cos = 1.0d - Math.cos(d);
                }
                f = (float) cos;
                i = (int) f2;
                TimeInterpolator timeInterpolator = AnonymousClass6Y2.A00;
                round = Math.round(sin * ((float) (((int) f3) - i)));
            } else {
                i = (int) A002.left;
                int i2 = (int) A003.left;
                TimeInterpolator timeInterpolator2 = AnonymousClass6Y2.A00;
                round = Math.round(((float) (i2 - i)) * f);
            }
            int i3 = drawable2.getBounds().top;
            int i4 = (int) A002.right;
            drawable2.setBounds(i + round, i3, i4 + Math.round(f * ((float) (((int) A003.right) - i4))), drawable2.getBounds().bottom);
        }
        r12.postInvalidateOnAnimation();
    }

    public static void A01(C323646xs r4) {
        View childAt = r4.getChildAt(r4.A01);
        TabLayout tabLayout = r4.A03;
        Drawable drawable = tabLayout.A0I;
        RectF A002 = C323666xu.A00(childAt, tabLayout);
        drawable.setBounds((int) A002.left, drawable.getBounds().top, (int) A002.right, drawable.getBounds().bottom);
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(1470989980);
        TabLayout tabLayout = this.A03;
        int height = tabLayout.A0I.getBounds().height();
        if (height < 0) {
            height = tabLayout.A0I.getIntrinsicHeight();
        }
        int i = tabLayout.A06;
        int i2 = 0;
        if (i == 0) {
            i2 = getHeight() - height;
            height = getHeight();
        } else if (i == 1) {
            i2 = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        } else if (i != 2) {
            if (i != 3) {
                height = 0;
            }
            height = getHeight();
        }
        if (tabLayout.A0I.getBounds().width() > 0) {
            Rect bounds = tabLayout.A0I.getBounds();
            tabLayout.A0I.setBounds(bounds.left, i2, bounds.right, height);
            Drawable drawable = tabLayout.A0I;
            int i3 = tabLayout.A0C;
            if (i3 != 0) {
                drawable.setTint(i3);
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
        AnonymousClass0fD.A0A(190362272, A032);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            int i5 = this.A01;
            View childAt = getChildAt(i5);
            View childAt2 = getChildAt(i5);
            if (childAt2 != null) {
                C56687I7s i7s = new C56687I7s(childAt, childAt2, this);
                this.A02.removeAllUpdateListeners();
                this.A02.addUpdateListener(i7s);
                return;
            }
        }
        A01(this);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.A03;
            if (tabLayout.A03 == 1 || tabLayout.A02 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (((int) C295305nv.A00(getContext(), 16)) * 2)) {
                        boolean z = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i3;
                                layoutParams.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        tabLayout.A03 = 0;
                        tabLayout.A0G(false);
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }
}
