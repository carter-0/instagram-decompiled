package X;

import android.view.View;

public final class AgB implements C315616kD {
    public final /* synthetic */ AnonymousClass8WJ A00;

    public AgB(AnonymousClass8WJ r1) {
        this.A00 = r1;
    }

    public final void DaF(C294975nL r16, float f) {
        float f2;
        AnonymousClass8WJ r2 = this.A00;
        double d = (double) (1.0f - f);
        if (d >= 0.25d) {
            f2 = (float) AnonymousClass37Q.A04(d - 0.25d, 0.0d, 1.0d - 0.25d, 0.0d, 1.0d);
        } else {
            f2 = 0.0f;
        }
        if (!r2.A0F) {
            View view = r2.A0B;
            f2 = Math.min(view.getScaleX(), view.getScaleY());
        }
        r2.Cxf(f2, -16777216);
    }
}
