package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3fw  reason: invalid class name and case insensitive filesystem */
public final class C247203fw implements C247223fy {
    public final AnonymousClass2xS A00;

    public final boolean DyC(MotionEvent motionEvent, AnonymousClass3W1 r5) {
        C263744Ne r0;
        AnonymousClass3V3 r02;
        C258253yi BRL;
        View view;
        0qQ.A0B(r5, 1);
        if (!r5.A0l.A00() || (r0 = this.A00.A0G.A02) == null || (r02 = r0.A08) == null || (BRL = r02.BRL()) == null || (view = (View) BRL.A03.getValue()) == null) {
            return false;
        }
        return view.onTouchEvent(motionEvent);
    }

    public C247203fw(AnonymousClass2xS r1) {
        this.A00 = r1;
    }
}
