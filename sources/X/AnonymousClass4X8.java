package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.4X8  reason: invalid class name */
public abstract class AnonymousClass4X8 {
    public AnonymousClass4M1 A00;
    public final int A01;

    public final Bitmap A01() {
        if (!(this instanceof AnonymousClass4X7)) {
            return null;
        }
        ScalingTextureView scalingTextureView = ((AnonymousClass4X7) this).A02;
        return scalingTextureView.getBitmap(scalingTextureView.A02 / 2, scalingTextureView.A01 / 2);
    }

    public final View A02() {
        if (this instanceof AnonymousClass4X7) {
            return ((AnonymousClass4X7) this).A01;
        }
        return ((C266404Yt) this).A03;
    }

    public final void A03() {
        if (this instanceof AnonymousClass4X7) {
            ScalingTextureView scalingTextureView = ((AnonymousClass4X7) this).A02;
            scalingTextureView.A02 = 0;
            scalingTextureView.A01 = 0;
            scalingTextureView.setTransform((Matrix) null);
        }
    }

    public final boolean A04() {
        if (this instanceof AnonymousClass4X7) {
            return ((AnonymousClass4X7) this).A03;
        }
        return ((C266404Yt) this).A05;
    }

    public AnonymousClass4X8(AnonymousClass4M1 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public void A05(C242423Ua r3) {
        View A02 = A02();
        if (A02.getParent() != r3) {
            r3.addView(A02, this.A01);
        }
    }
}
