package androidx.appcompat.widget;

import X.C13988Tno;
import X.C13989Tnp;
import X.SN3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;

public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        int i9 = 0;
        while (true) {
            i3 = i;
            i4 = i2;
            if (i9 < childCount) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        view = childAt;
                    } else if (id == R.id.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i9++;
            } else {
                int mode = View.MeasureSpec.getMode(i4);
                int size = View.MeasureSpec.getSize(i4);
                int mode2 = View.MeasureSpec.getMode(i3);
                int A0H = C13989Tnp.A0H(this);
                if (view != null) {
                    view.measure(i3, 0);
                    A0H += view.getMeasuredHeight();
                    i5 = C13988Tno.A0A(view, 0);
                } else {
                    i5 = 0;
                }
                if (view2 != null) {
                    view2.measure(i3, 0);
                    i6 = A00(view2);
                    i7 = view2.getMeasuredHeight() - i6;
                    A0H += i6;
                    i5 = C13988Tno.A0A(view2, i5);
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (view3 != null) {
                    if (mode == 0) {
                        makeMeasureSpec = 0;
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C13988Tno.A07(size, A0H, 0), mode);
                    }
                    view3.measure(i3, makeMeasureSpec);
                    i8 = view3.getMeasuredHeight();
                    A0H += i8;
                    i5 = C13988Tno.A0A(view3, i5);
                } else {
                    i8 = 0;
                }
                int i10 = size - A0H;
                if (view2 != null) {
                    int i11 = A0H - i6;
                    int min = Math.min(i10, i7);
                    if (min > 0) {
                        i10 -= min;
                        i6 += min;
                    }
                    C13988Tno.A11(view2, i6, SN3.MAX_SIGNED_POWER_OF_TWO, i3);
                    A0H = i11 + view2.getMeasuredHeight();
                    i5 = C13988Tno.A0A(view2, i5);
                }
                if (view3 != null && i10 > 0) {
                    C13988Tno.A11(view3, i8 + i10, mode, i3);
                    A0H = (A0H - i8) + view3.getMeasuredHeight();
                    i5 = C13988Tno.A0A(view3, i5);
                }
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2.getVisibility() != 8) {
                        i12 = Math.max(i12, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i12 + C13989Tnp.A0E(this), i3, i5), View.resolveSizeAndState(A0H, i4, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), SN3.MAX_SIGNED_POWER_OF_TWO);
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt3 = getChildAt(i14);
                        if (childAt3.getVisibility() != 8) {
                            ViewGroup.LayoutParams layoutParams = childAt3.getLayoutParams();
                            if (layoutParams.width == -1) {
                                int i15 = layoutParams.height;
                                layoutParams.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i4, 0);
                                layoutParams.height = i15;
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        super.onMeasure(i3, i4);
    }

    public static int A00(View view) {
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight <= 0) {
            minimumHeight = 0;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() == 1) {
                    return A00(viewGroup.getChildAt(0));
                }
            }
        }
        return minimumHeight;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int intrinsicHeight;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i8 = this.A05;
        int i9 = i8 & 112;
        int i10 = i8 & 8388615;
        if (i9 == 16) {
            paddingTop = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        } else if (i9 != 80) {
            paddingTop = getPaddingTop();
        } else {
            paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
        }
        Drawable drawable = this.A08;
        if (drawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int i12 = layoutParams.gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = i5 - layoutParams.rightMargin;
                } else if (absoluteGravity != 5) {
                    i6 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = i5 - layoutParams.rightMargin;
                }
                if (A07(i11)) {
                    paddingTop += intrinsicHeight;
                }
                int i13 = paddingTop + layoutParams.topMargin;
                childAt.layout(i6, i13, measuredWidth + i6, measuredHeight2 + i13);
                paddingTop = i13 + measuredHeight2 + layoutParams.bottomMargin;
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
