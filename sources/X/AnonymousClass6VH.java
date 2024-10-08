package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.6VH  reason: invalid class name */
public final class AnonymousClass6VH implements AnonymousClass6VI {
    public AnonymousClass6VG A00;
    public GradientSpinner A01;
    public boolean A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());

    public final void DEU(long j) {
        if (!this.A02) {
            this.A01.A08();
        }
        Handler handler = this.A03;
        handler.removeCallbacksAndMessages((Object) null);
        handler.post(new AnonymousClass6VM(this, j, false));
    }

    public final void Dom(boolean z, long j) {
        if (!this.A02) {
            this.A01.A08();
        }
        Handler handler = this.A03;
        handler.removeCallbacksAndMessages((Object) null);
        handler.post(new AnonymousClass6VM(this, j, true));
    }

    public final void onCancel() {
        if (!this.A02) {
            this.A01.A08();
        }
        this.A03.removeCallbacksAndMessages((Object) null);
    }

    public final void onStart() {
        GradientSpinner gradientSpinner = this.A01;
        if (gradientSpinner.A04 != gradientSpinner.A0P && !this.A02) {
            gradientSpinner.A06();
        }
    }

    public AnonymousClass6VH(AnonymousClass6VG r3, GradientSpinner gradientSpinner, boolean z) {
        this.A01 = gradientSpinner;
        this.A00 = r3;
        this.A02 = z;
    }
}
