package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class U4Q extends FrameLayout {
    public C14554TyJ A00;
    public final int A01;

    public U4Q(Context context, int i) {
        super(context, (AttributeSet) null);
        this.A01 = i;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        U4Q u4q = this;
        while (viewGroup2 != null && !(viewGroup2 instanceof C14554TyJ)) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            if (viewGroup2.getParent() instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewGroup2.getParent();
            } else {
                viewGroup = null;
            }
            u4q = viewGroup2;
            viewGroup2 = viewGroup;
        }
        if (!(u4q.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewGroup2 == null) {
            0KC.A0C("SparkAvatarView", "could not apply negative top margin as layoutParams not of type marginLayoutParams");
        } else {
            C14554TyJ tyJ = (C14554TyJ) viewGroup2;
            this.A00 = tyJ;
            int i3 = this.A01;
            if (i3 > Integer.MIN_VALUE) {
                ViewGroup.MarginLayoutParams A0G = DbX.A0G(u4q);
                A0G.topMargin = i3;
                u4q.setLayoutParams(A0G);
                tyJ.requestLayout();
            }
        }
        super.onMeasure(i, i2);
    }
}
