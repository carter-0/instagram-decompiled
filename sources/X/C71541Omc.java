package X;

import android.view.MotionEvent;

/* renamed from: X.Omc  reason: case insensitive filesystem */
public final class C71541Omc implements C317516nO {
    public final /* synthetic */ C70974OTv A00;

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public C71541Omc(C70974OTv oTv) {
        this.A00 = oTv;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C70974OTv oTv = this.A00;
        oTv.A00 = 0.0f;
        oTv.A01 = System.currentTimeMillis();
        oTv.A09.A01();
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C70974OTv oTv = this.A00;
        float A02 = f / AnonymousClass7TE.A02(oTv.A03);
        2cs r4 = oTv.A09;
        r4.A08(r4.A09.A00 - ((double) A02), true);
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) <= 500.0f) {
            return true;
        }
        this.A00.A00 = f;
        return true;
    }
}
