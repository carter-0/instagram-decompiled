package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.7gG  reason: invalid class name and case insensitive filesystem */
public final class C337387gG extends RecyclerView implements C338447hy {
    public C334327b5 A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public float getBottomFadingEdgeStrength() {
        if (this.A02) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    public float getLeftFadingEdgeStrength() {
        if (this.A03) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    public float getRightFadingEdgeStrength() {
        if (this.A04) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    public float getTopFadingEdgeStrength() {
        if (this.A05) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C334327b5 r0 = this.A00;
        if (r0 != null) {
            ((C334317b4) r0).A00.onTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        List list = this.A01;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                getChildCount();
                2We.A0J(((C338167hW) this.A01.get(i)).A00);
            }
        }
    }

    public void setBottomFadingEnabled(boolean z) {
        this.A02 = z;
    }

    public void setLeftFadingEnabled(boolean z) {
        this.A03 = z;
    }

    public void setRightFadingEnabled(boolean z) {
        this.A04 = z;
    }

    public void setTopFadingEnabled(boolean z) {
        this.A05 = z;
    }

    public void setTouchInterceptor(C334327b5 r1) {
        this.A00 = r1;
    }
}
