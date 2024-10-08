package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: X.Jdp  reason: case insensitive filesystem */
public final class C60037Jdp extends TouchDelegate {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ LPG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60037Jdp(Rect rect, Rect rect2, View view, LPG lpg) {
        super(rect, view);
        this.A01 = lpg;
        this.A00 = rect2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A00.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return this.A01.A06(motionEvent);
        }
        float x = motionEvent.getX();
        LPG lpg = this.A01;
        Rect rect = lpg.A09;
        motionEvent.setLocation(x - ((float) rect.left), motionEvent.getY() - ((float) rect.top));
        return lpg.A0I.onTouchEvent(motionEvent);
    }
}
