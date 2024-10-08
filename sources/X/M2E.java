package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final /* synthetic */ class M2E implements Runnable {
    public final /* synthetic */ C60070Jez A00;

    public /* synthetic */ M2E(C60070Jez jez) {
        this.A00 = jez;
    }

    public final void run() {
        WeakReference weakReference;
        C60070Jez jez = this.A00;
        LPC lpc = C63515KyQ.A00;
        if (!lpc.A06() && (weakReference = lpc.A01) != null && weakReference.get() != null) {
            Rect A0W = AnonymousClass7TE.A0W();
            Point point = new Point();
            jez.getGlobalVisibleRect(A0W, point);
            A0W.top = point.y;
            A0W.left = point.x;
            ViewParent parent = jez.getParent();
            parent.getClass();
            lpc.A04(new LD1((View) parent, (float) A0W.left, (float) A0W.top));
        }
    }
}
