package X;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

public final class WTJ implements C240963Ni {
    public final int A00;
    public final Object A01;

    public WTJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void DEN() {
        switch (this.A00) {
            case 0:
                0wb.A03("ArAdsPreCaptureUIControllerImpl", "Failed to load effect thumbnail");
                return;
            case 3:
                C18066Vks vks = (C18066Vks) this.A01;
                vks.A04.setVisibility(0);
                vks.A06.setVisibility(0);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void DO4(C240983Nk r5) {
        IgImageView igImageView;
        Bitmap bitmap;
        Bitmap bitmap2;
        switch (this.A00) {
            case 0:
                ShutterButton shutterButton = ((C17667Vby) this.A01).A01;
                if (shutterButton != null) {
                    shutterButton.setInnerCircleAlpha(0.0f);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(r5, 0);
                C17621VbD vbD = (C17621VbD) this.A01;
                if (vbD.A00 != null && (igImageView = vbD.A01) != null && (bitmap = r5.A02) != null) {
                    0oT.A02(GradientDrawable.Orientation.TOP_BOTTOM, igImageView, 0oT.A00(bitmap, AnonymousClass05K.A00));
                    return;
                }
                return;
            case 2:
                C17622VbE vbE = (C17622VbE) this.A01;
                if (vbE.A00 != null && vbE.A01 != null && (bitmap2 = r5.A02) != null) {
                    BackgroundGradientColors A002 = 0oT.A00(bitmap2, AnonymousClass05K.A00);
                    0oT.A02(GradientDrawable.Orientation.TOP_BOTTOM, vbE.A01, A002);
                    return;
                }
                return;
            case 3:
                C18066Vks vks = (C18066Vks) this.A01;
                vks.A04.setVisibility(0);
                vks.A06.setVisibility(0);
                return;
            default:
                ((C15698Uh5) this.A01).A09.A01(0);
                return;
        }
    }
}
