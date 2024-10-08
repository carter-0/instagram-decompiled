package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.743  reason: invalid class name */
public abstract class AnonymousClass743 implements AnonymousClass7JP {
    public final IgImageView A00;

    public final void Cwk(int i, int i2, boolean z) {
        float f = ((float) i) / ((float) i2);
        C71090Oc5 A002 = C71090Oc5.A0C.A00(this.A00);
        if (z) {
            A002.A02();
            return;
        }
        A002.A04();
        ValueAnimator valueAnimator = A002.A01;
        valueAnimator.cancel();
        valueAnimator.setFloatValues(new float[]{A002.A00, f});
        valueAnimator.start();
    }

    public final void Cwj() {
        C71090Oc5.A0C.A00(this.A00).A03();
    }

    public AnonymousClass743(IgImageView igImageView) {
        this.A00 = igImageView;
    }
}
