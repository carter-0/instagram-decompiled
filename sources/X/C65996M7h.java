package X;

import android.graphics.RectF;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;

/* renamed from: X.M7h  reason: case insensitive filesystem */
public final class C65996M7h implements Runnable {
    public final /* synthetic */ TouchImageView A00;
    public final /* synthetic */ C61382K5a A01;

    public C65996M7h(TouchImageView touchImageView, C61382K5a k5a) {
        this.A01 = k5a;
        this.A00 = touchImageView;
    }

    public final void run() {
        C61382K5a k5a = this.A01;
        RectF rectF = k5a.A00;
        if (rectF != null) {
            float f = 1.0f / (rectF.right - rectF.left);
            TouchImageView touchImageView = this.A00;
            RectF rectF2 = touchImageView.A0M;
            rectF2.right = rectF2.left + (rectF2.width() * f);
            rectF2.bottom = rectF2.top + (rectF2.height() * f);
            touchImageView.invalidate();
            RectF rectF3 = k5a.A00;
            if (rectF3 != null) {
                rectF2.offset(rectF2.width() * rectF3.left * -1.0f, rectF2.height() * rectF3.top * -1.0f);
                touchImageView.invalidate();
                return;
            }
        }
        0qQ.A0F("cropRectF");
        throw AnonymousClass00P.createAndThrow();
    }
}
