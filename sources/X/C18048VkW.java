package X;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import java.util.List;

/* renamed from: X.VkW  reason: case insensitive filesystem */
public final class C18048VkW {
    public int A00;
    public List A01 = 0sn.A00;
    public VVW A02;
    public final AccelerateDecelerateInterpolator A03 = new AccelerateDecelerateInterpolator();
    public final AccelerateInterpolator A04 = new AccelerateInterpolator();

    public final void A02(List list) {
        0qQ.A0B(list, 0);
        if (!0qQ.A0K(this.A01, list)) {
            this.A01 = list;
            this.A02 = null;
        }
    }

    public final VVW A00() {
        VVW vvw = this.A02;
        if (vvw == null) {
            if (this.A01.isEmpty()) {
                vvw = null;
            } else {
                int A002 = C17038VFm.A00(this.A01, this.A00);
                C15092UOk uOk = (C15092UOk) this.A01.get(A002);
                float A012 = (float) (this.A00 - uOk.A01());
                AccelerateInterpolator accelerateInterpolator = this.A04;
                float f = uOk.A01;
                float f2 = (float) (((int) (((float) uOk.A02) / f)) - ((int) (((float) uOk.A04) / f)));
                float f3 = 500.0f - 0.0f;
                float f4 = 1.0f - 0.0f;
                float f5 = 0.0f;
                if (f3 != 0.0f) {
                    f5 = (f2 - 0.0f) / f3;
                }
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = this.A03;
                float A022 = (C229632nm.A02(accelerateInterpolator.getInterpolation((f5 * f4) + 0.0f), 0.0f, 1.0f) * 400.0f) - 0.0f;
                float f6 = 0.0f;
                if (A022 != 0.0f) {
                    f6 = (A012 - 0.0f) / A022;
                }
                float interpolation = accelerateDecelerateInterpolator.getInterpolation(C229632nm.A02((f6 * f4) + 0.0f, 0.0f, 1.0f));
                boolean z = false;
                if (((C15092UOk) this.A01.get(0)).A04 <= this.A00) {
                    z = true;
                }
                vvw = new VVW(A002, interpolation, z);
            }
            this.A02 = vvw;
        }
        return vvw;
    }

    public final void A01(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A02 = null;
        }
    }
}
