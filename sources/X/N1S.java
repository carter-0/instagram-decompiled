package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import com.facebook.common.draggableview.DraggableViewContainer;
import java.util.Iterator;

public final class N1S extends C283285Gy {
    public Scroller A00;
    public final /* synthetic */ DraggableViewContainer A01;

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        DraggableViewContainer draggableViewContainer = this.A01;
        draggableViewContainer.A03 = (int) motionEvent.getX();
        draggableViewContainer.A04 = (int) motionEvent.getY();
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        int x = (int) motionEvent2.getX();
        int y = (int) motionEvent2.getY();
        DraggableViewContainer draggableViewContainer = this.A01;
        if (draggableViewContainer.A09 == null) {
            return false;
        }
        double d = (double) (x - draggableViewContainer.A03);
        double d2 = (double) (y - draggableViewContainer.A04);
        draggableViewContainer.A03 = x;
        draggableViewContainer.A04 = y;
        2cs r7 = draggableViewContainer.A0K;
        2cs r2 = draggableViewContainer.A0L;
        r7.A08(r7.A09.A00 + d, true);
        r2.A08(r2.A09.A00 + d2, true);
        return false;
    }

    public N1S(DraggableViewContainer draggableViewContainer) {
        this.A01 = draggableViewContainer;
        this.A00 = new Scroller(draggableViewContainer.getContext());
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        DraggableViewContainer draggableViewContainer = this.A01;
        C15048ULb A012 = draggableViewContainer.getCenterBounds();
        Scroller scroller = this.A00;
        scroller.abortAnimation();
        View view = draggableViewContainer.A09;
        if (view != null) {
            int A03 = C66584MXp.A03(view);
            int A04 = C66584MXp.A04(view);
            float f3 = f;
            float f4 = f2;
            int i = A012.A01;
            int i2 = A012.A02;
            int i3 = A012.A03;
            int i4 = A012.A00;
            int i5 = (int) f3;
            int i6 = (int) f4;
            scroller.fling(A03, A04, i5, i6, i, i2, i3, i4);
            int i7 = i;
            if (scroller.getFinalX() > ((A012.A01 + A012.A02) >> 1)) {
                i7 = i2;
            }
            if (scroller.getFinalY() > ((A012.A03 + A012.A00) >> 1)) {
                i3 = i4;
            }
            boolean A1S = AnonymousClass7TF.A1S(scroller.getFinalX(), i);
            if (DraggableViewContainer.A09(view, draggableViewContainer, A1S)) {
                i7 = DraggableViewContainer.A00(view, draggableViewContainer, A1S);
            }
            DraggableViewContainer.A06(draggableViewContainer, Double.valueOf((double) f3), Double.valueOf((double) f4), i7, i3);
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        Iterator it = this.A01.A0M.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        DraggableViewContainer draggableViewContainer = this.A01;
        View view = draggableViewContainer.A09;
        if (!draggableViewContainer.A0C || view == null) {
            for (C74291PsJ AP9 : draggableViewContainer.A0M) {
                AP9.AP9();
            }
            return false;
        }
        boolean z = false;
        int A03 = C66584MXp.A03(view);
        if (A03 < 0 || A03 > draggableViewContainer.getWidth()) {
            z = true;
        }
        DraggableViewContainer.A04(view, draggableViewContainer, DbT.A0l(z));
        return true;
    }
}
