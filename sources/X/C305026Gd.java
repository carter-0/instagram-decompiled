package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* renamed from: X.6Gd  reason: invalid class name and case insensitive filesystem */
public final class C305026Gd extends ViewGroup {
    public final HashMap A00 = new HashMap();
    public final HashMap A01 = new HashMap();

    public final void dispatchDraw(Canvas canvas) {
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void onDescendantInvalidated(View view, View view2) {
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final HashMap getHolderToLayoutNode() {
        return this.A00;
    }

    public final HashMap getLayoutNodeToHolder() {
        return this.A01;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (ViewGroup viewGroup : this.A00.keySet()) {
            viewGroup.layout(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
        }
    }

    public C305026Gd(Context context) {
        super(context);
        setClipChildren(false);
    }

    public final void onMeasure(int i, int i2) {
        String str;
        int i3;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            str = "widthMeasureSpec should be EXACTLY";
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            for (C52849Gdi gdi : this.A00.keySet()) {
                int i4 = gdi.A01;
                if (!(i4 == Integer.MIN_VALUE || (i3 = gdi.A00) == Integer.MIN_VALUE)) {
                    gdi.measure(i4, i3);
                }
            }
            return;
        } else {
            str = "heightMeasureSpec should be EXACTLY";
        }
        I2E.A00(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AnonymousClass5R6 r2 = (AnonymousClass5R6) this.A00.get(childAt);
            if (childAt.isLayoutRequested() && r2 != null) {
                r2.A0a(false, true, true);
            }
        }
    }

    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }
}
