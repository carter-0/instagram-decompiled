package X;

import android.view.View;
import java.util.List;

/* renamed from: X.6ts  reason: invalid class name and case insensitive filesystem */
public final class C321286ts implements C252203oj {
    public final /* synthetic */ C321266tq A00;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public C321286ts(C321266tq r1) {
        this.A00 = r1;
    }

    public final void DmE(2cs r9) {
        float f;
        float f2;
        if (r9 != null) {
            f = (float) r9.A09.A00;
        } else {
            f = 1.0f;
        }
        float f3 = 1.0f - 0.0f;
        float f4 = 0.9f - 1.0f;
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f5 = (f - 0.0f) / f3;
        }
        float f6 = (f5 * f4) + 1.0f;
        if (r9 != null) {
            f2 = (float) r9.A09.A00;
        } else {
            f2 = 1.0f;
        }
        float f7 = 0.0f - 1.0f;
        float f8 = 0.0f;
        if (f3 != 0.0f) {
            f8 = (f2 - 0.0f) / f3;
        }
        float f9 = (f8 * f7) + 1.0f;
        C321266tq r3 = this.A00;
        List<View> list = r3.A01;
        if (list != null) {
            for (View view : list) {
                view.setScaleX(Math.signum(r3.A0C.getScaleX()) * f6);
                view.setScaleY(f6);
                view.setAlpha(f9);
            }
        }
    }
}
