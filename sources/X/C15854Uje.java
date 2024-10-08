package X;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.Uje  reason: case insensitive filesystem */
public final class C15854Uje extends AnonymousClass4HF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C15854Uje(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DVx(int i, int i2) {
        if (this.A00 != 0) {
            super.DVx(i, i2);
            return;
        }
        C14877UDf uDf = (C14877UDf) this.A01;
        CirclePageIndicator circlePageIndicator = uDf.A04;
        circlePageIndicator.setCurrentPage(i);
        boolean z = true;
        if (circlePageIndicator.A06 + 1 != circlePageIndicator.A05) {
            z = false;
        }
        ImageView imageView = uDf.A02;
        if (z) {
            imageView.setVisibility(8);
            W4L w4l = (W4L) ((VXp) this.A02).A03.getValue();
            w4l.A01 = true;
            w4l.A03.end();
            return;
        }
        imageView.setVisibility(0);
        W4L w4l2 = (W4L) ((VXp) this.A02).A03.getValue();
        if (w4l2.A01) {
            w4l2.A01 = false;
            ValueAnimator valueAnimator = w4l2.A03;
            if (!valueAnimator.isRunning()) {
                valueAnimator.start();
            }
        }
    }

    public final void DW9(int i, int i2, boolean z) {
        if (this.A00 != 0) {
            ((C266934aa) this.A02).A04 = i;
        } else {
            ((VXp) this.A02).A00 = i;
        }
    }

    public final void DhK(AnonymousClass3TF r2, float f, float f2) {
        AnonymousClass343 r0;
        if (1 - this.A00 != 0) {
            super.DhK(r2, f, f2);
            return;
        }
        0qQ.A0B(r2, 2);
        if (r2 != AnonymousClass3TF.IDLE && (r0 = ((OFS) this.A01).A03) != null) {
            r0.A01();
        }
    }
}
