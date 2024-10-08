package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Pzp  reason: case insensitive filesystem */
public final class C7220Pzp extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass37F A00;

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        AnonymousClass37F r2 = this.A00;
        C7218Pzn pzn = r2.A0D;
        if (!(pzn == null || pzn.A09 == 2 || !r2.A0Y())) {
            r2.A0T(r2.A0a(Float.valueOf(motionEvent.getY())));
            C13823Tht tht = r2.A0G;
            if (tht != null) {
                tht.Dkz();
            }
        }
        return false;
    }

    public C7220Pzp(AnonymousClass37F r1) {
        this.A00 = r1;
    }
}
