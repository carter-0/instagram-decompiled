package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.ui.widget.drawing.StrokeWidthTool;

/* renamed from: X.5xl  reason: invalid class name and case insensitive filesystem */
public final class C300745xl extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ StrokeWidthTool A00;

    public C300745xl(StrokeWidthTool strokeWidthTool) {
        this.A00 = strokeWidthTool;
    }

    public final void onShowPress(MotionEvent motionEvent) {
        StrokeWidthTool strokeWidthTool = this.A00;
        if (strokeWidthTool.A0N) {
            strokeWidthTool.A0M = true;
            strokeWidthTool.setMode(C300715xi.EXPANDED);
            ((2cs) strokeWidthTool.A0n.getValue()).A03();
            AnonymousClass8O5 r3 = strokeWidthTool.A0J;
            if (r3 != null) {
                int[] iArr = StrokeWidthTool.A0t;
                strokeWidthTool.getLocationInWindow(iArr);
                r3.DrM(((float) iArr[0]) + strokeWidthTool.A0D, ((float) iArr[1]) + strokeWidthTool.A0A);
            }
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        StrokeWidthTool strokeWidthTool = this.A00;
        boolean A08 = strokeWidthTool.A08(motionEvent.getX(), motionEvent.getY());
        if (A08) {
            if (strokeWidthTool.A0O) {
                C300715xi r1 = strokeWidthTool.A0I;
                C300715xi r0 = C300715xi.COLLAPSED;
                if (r1 == r0) {
                    r0 = C300715xi.EXPANDED;
                }
                strokeWidthTool.setMode(r0);
            }
            strokeWidthTool.A0N = false;
            strokeWidthTool.A0P = false;
        }
        return A08;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        StrokeWidthTool strokeWidthTool = this.A00;
        boolean A08 = strokeWidthTool.A08(x, y);
        strokeWidthTool.A0N = A08;
        if (!A08 && strokeWidthTool.A0I == C300715xi.EXPANDED && y <= strokeWidthTool.A0B) {
            strokeWidthTool.A0P = true;
            ((2cs) strokeWidthTool.A0n.getValue()).A06(1.0d);
            StrokeWidthTool.A06(strokeWidthTool, y);
        }
        if (strokeWidthTool.A0P || strokeWidthTool.A0N) {
            return true;
        }
        return false;
    }
}
