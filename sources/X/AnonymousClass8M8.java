package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;

/* renamed from: X.8M8  reason: invalid class name */
public final class AnonymousClass8M8 {
    public Bitmap A00;
    public final C71662eb A01;
    public final AnonymousClass80G A02;
    public final C3499582p A03;

    public AnonymousClass8M8(C71662eb r2, AnonymousClass80G r3, C3499582p r4) {
        0qQ.A0B(r3, 3);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void A00() {
        C71662eb r2 = this.A01;
        if (r2.A04()) {
            ((ImageView) r2.A01()).setImageDrawable((Drawable) null);
        }
        r2.A03(8);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            bitmap.recycle();
            this.A00 = null;
        }
    }

    public final void A01() {
        if (this.A03.A02.A01() == C365758nd.A07) {
            Bitmap bitmap = this.A00;
            AnonymousClass80G r0 = this.A02;
            if (bitmap == null) {
                MultiListenerTextureView multiListenerTextureView = r0.A0D;
                if (multiListenerTextureView != null) {
                    bitmap = multiListenerTextureView.getBitmap();
                } else {
                    bitmap = null;
                }
            } else {
                r0.A03(bitmap);
                bitmap.setPixel(0, 0, bitmap.getPixel(0, 0));
            }
            this.A00 = bitmap;
            if (bitmap != null) {
                C71662eb r2 = this.A01;
                r2.A03(0);
                ((ImageView) r2.A01()).setImageBitmap(this.A00);
                r2.A01().invalidate();
            }
        }
    }
}
