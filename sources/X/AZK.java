package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

public final class AZK implements C262424Dq {
    public final int A00;
    public final Object A01;

    public AZK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.common.ui.widget.imageview.CornerPunchedImageView, android.widget.ImageView] */
    public final void CyE(Bitmap bitmap) {
        Drawable drawable;
        switch (this.A00) {
            case 0:
            case 6:
                break;
            case 1:
                0qQ.A0A(bitmap);
                ((C64965Ll4) this.A01).A00 = new C3018360g(bitmap);
                return;
            case 7:
                AnonymousClass9Wo r4 = (AnonymousClass9Wo) this.A01;
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setFilterBitmap(true);
                paint.setAlpha(63);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
                int i = r4.A0A;
                Bitmap A002 = 0fO.A00(bitmap, i, i, true);
                Shader.TileMode tileMode = Shader.TileMode.MIRROR;
                paint.setShader(new BitmapShader(A002, tileMode, tileMode));
                r4.A01 = paint;
                drawable = r4;
                break;
            case 8:
                ((ReelAvatarWithBadgeView) this.A01).A01.setImageBitmap(bitmap);
                return;
            default:
                if (bitmap == null) {
                    return;
                }
                break;
        }
        drawable = (Drawable) this.A01;
        drawable.invalidateSelf();
    }
}
