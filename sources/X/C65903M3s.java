package X;

import android.widget.SeekBar;
import com.instagram.creation.base.ui.ConstrainedTextureView;

/* renamed from: X.M3s  reason: case insensitive filesystem */
public final class C65903M3s implements Runnable {
    public final /* synthetic */ C61868KPh A00;

    public C65903M3s(C61868KPh kPh) {
        this.A00 = kPh;
    }

    public final void run() {
        C61868KPh kPh = this.A00;
        C59986Jcv jcv = kPh.A06;
        if (jcv != null) {
            float f = kPh.A01;
            SeekBar seekBar = kPh.A05;
            if (seekBar != null) {
                int A03 = (int) ((f * AnonymousClass7TE.A03(seekBar)) + 0.5f);
                ConstrainedTextureView constrainedTextureView = kPh.A03;
                if (constrainedTextureView != null) {
                    SeekBar seekBar2 = kPh.A05;
                    0qQ.A0A(seekBar2);
                    jcv.A07 = constrainedTextureView.getBitmap(A03, seekBar2.getHeight());
                    jcv.invalidateSelf();
                    SeekBar seekBar3 = kPh.A05;
                    0qQ.A0A(seekBar3);
                    seekBar3.invalidate();
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
