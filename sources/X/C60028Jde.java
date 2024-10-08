package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Jde  reason: case insensitive filesystem */
public final class C60028Jde extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C315496jz A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C60028Jde(C315496jz r1) {
        this.A00 = r1;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A00.A00 = f;
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C315496jz r3 = this.A00;
        if (r3.A0G) {
            float f3 = r3.A03;
            View view = r3.A09;
            if (view != null) {
                float A02 = f3 + (f / AnonymousClass7TE.A02(view));
                r3.A03 = A02;
                2cs r0 = r3.A0B;
                if (r0 != null) {
                    JTP.A1K(r0, A02);
                    return false;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (!r3.A0H) {
            return false;
        } else {
            float f4 = r3.A04;
            View view2 = r3.A09;
            if (view2 != null) {
                r3.A04 = f4 + JTP.A00(f2, view2);
                return false;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
