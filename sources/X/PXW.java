package X;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
import android.view.View;

public final class PXW implements Runnable {
    public final /* synthetic */ C69103Nei A00;

    public PXW(C69103Nei nei) {
        this.A00 = nei;
    }

    public final void run() {
        Rational rational;
        try {
            C69103Nei nei = this.A00;
            if (nei.A05) {
                try {
                    rational = nei.A02;
                    if (rational == null) {
                        Activity activity = nei.A07;
                        int A09 = 0nA.A09(activity);
                        int A08 = 0nA.A08(activity);
                        if (nei.A00 == 2) {
                            A09 *= 2;
                        }
                        rational = new Rational(A09, A08);
                    }
                    nei.A07.setPictureInPictureParams(new PictureInPictureParams.Builder().setAspectRatio(rational).build());
                } catch (Exception e) {
                    0KC.A0J("RtcCallPipPresenter", "Failed to set FSV PIP params", e);
                    rational = Rational.NaN;
                    0qQ.A08(rational);
                }
                if (!rational.equals(Rational.NaN)) {
                    C69103Nei.A00((Rect) null, rational, nei);
                    if (Build.VERSION.SDK_INT == 31) {
                        Activity activity2 = nei.A07;
                        View A0A = C66581MXm.A0A(activity2);
                        0qQ.A07(A0A);
                        activity2.getWindowManager().updateViewLayout(A0A, A0A.getLayoutParams());
                    }
                }
            }
        } catch (Exception e2) {
            0wb.A06("RtcCallPipPresenter", "Failed to update FSV PIP params", e2);
        }
    }
}
