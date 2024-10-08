package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.65n  reason: invalid class name and case insensitive filesystem */
public abstract class C3028165n extends C267924cT {
    public float A00;
    public float A01;
    public JQA A02;

    public void A02(View view, Integer num, String str, float f, float f2, int i, int i2) {
    }

    public void A03(View view, Integer num, String str, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        View view2 = view;
        if (i != 0) {
            f = (float) (A00(view2) + i);
            f2 = (float) (A01(view2) + i2);
        } else {
            f = this.A00;
            f2 = this.A01;
        }
        Integer num2 = num;
        String str2 = str;
        A02(view2, num2, str2, f, f2, i3, i4);
        JQA jqa = this.A02;
        if (jqa != null) {
            jqa.D20(new C55981Hqm(new PointF(f, f2), new RectF((float) view2.getLeft(), (float) view2.getTop(), (float) view2.getRight(), (float) view2.getBottom()), view2, C54769HSb.A00(num2), str2));
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0) {
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final int A00(View view) {
        View view2;
        if (view == null) {
            0wb.A03("BaseCompositionView#getRelativeLeft", "The view is not a child of IgShowreelCompositionView");
            return 0;
        } else if (view.getParent() == this) {
            return view.getLeft();
        } else {
            int left = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            return A00(view2) + left;
        }
    }

    private final int A01(View view) {
        View view2;
        if (view == null) {
            0wb.A03("BaseCompositionView#getRelativeTop", "The view is not a child of IgShowreelCompositionView");
            return 0;
        } else if (view.getParent() == this) {
            return view.getTop();
        } else {
            int top = view.getTop();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            return A01(view2) + top;
        }
    }

    public final void setInteractivityListener(JQA jqa) {
        this.A02 = jqa;
    }
}
