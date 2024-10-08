package X;

import android.animation.ValueAnimator;
import com.instagram.android.R;

/* renamed from: X.I7z  reason: case insensitive filesystem */
public final class C56693I7z implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C56693I7z(AnonymousClass3Y5 r1, 2V5 r2, Boolean bool, 0sP r4, int i, int i2) {
        this.A00 = i2;
        this.A03 = bool;
        this.A04 = r1;
        this.A01 = i;
        this.A05 = r2;
        this.A02 = r4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int i;
        int A022;
        Number number;
        Object A0o = C51971G9r.A0o(valueAnimator);
        if (!(A0o instanceof Float) || (number = (Number) A0o) == null) {
            f = 0.0f;
        } else {
            f = number.floatValue();
        }
        if (AnonymousClass7TE.A1a(this.A03)) {
            i = C244013aV.A02((AnonymousClass3Y5) this.A04, R.color.fds_transparent);
            A022 = this.A01;
        } else {
            i = this.A01;
            A022 = C244013aV.A02((AnonymousClass3Y5) this.A04, R.color.fds_transparent);
        }
        ((2V5) this.A05).A00(C51968G9o.A0w(0nH.A02(f, i, A022), (0sP) this.A02));
    }
}
