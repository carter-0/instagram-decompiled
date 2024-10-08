package X;

import android.view.MotionEvent;
import android.view.View;

public final class IR5 implements AnonymousClass7PN {
    public C55480HiO A00;
    public final View A01;

    public final void APf(MotionEvent motionEvent) {
    }

    public final boolean EsS(MotionEvent motionEvent) {
        return false;
    }

    public final boolean Esh() {
        return false;
    }

    public final void DAV(float f, float f2) {
        this.A01.setTranslationX(f);
        C55480HiO hiO = this.A00;
        if (hiO != null) {
            float min = Math.min(f / f2, 1.0f);
            C328167Dt r1 = hiO.A00;
            r1.A00 = f;
            r1.A02 = min;
            2cs r0 = r1.A03;
            if (r0 == null || r0.A0C()) {
                C328167Dt.A00(r1, f, min);
            }
        }
    }

    public IR5(View view) {
        this.A01 = view;
    }
}
