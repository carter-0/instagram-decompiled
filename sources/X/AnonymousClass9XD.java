package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;

/* renamed from: X.9XD  reason: invalid class name */
public final class AnonymousClass9XD extends Drawable implements C268714ds, C3724991d {
    public int A00;
    public int A01;
    public final Bitmap A02;
    public final SharePlatformStickerClientModel A03;
    public final C391049sG A04;
    public final String A05;
    public final Paint A06;
    public final RectF A07;

    public AnonymousClass9XD(SharePlatformStickerClientModel sharePlatformStickerClientModel) {
        0qQ.A0B(sharePlatformStickerClientModel, 1);
        this.A03 = sharePlatformStickerClientModel;
        Bitmap A0G = 1MF.A0G(sharePlatformStickerClientModel.A0A, sharePlatformStickerClientModel.A03, sharePlatformStickerClientModel.A02, sharePlatformStickerClientModel.A06, sharePlatformStickerClientModel.A05, sharePlatformStickerClientModel.A04, false);
        this.A02 = A0G;
        this.A04 = sharePlatformStickerClientModel.A08;
        this.A05 = sharePlatformStickerClientModel.A0A;
        Paint A0V = AnonymousClass7TE.A0V(3);
        this.A06 = A0V;
        if (A0G != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            A0V.setShader(new BitmapShader(A0G, tileMode, tileMode));
            this.A01 = A0G.getWidth();
            this.A00 = A0G.getHeight();
        }
        this.A07 = new RectF(0.0f, 0.0f, (float) this.A01, (float) this.A00);
    }

    public final int getOpacity() {
        return -3;
    }

    public final C2802350v BzV() {
        return this.A03;
    }

    public final void Dre(int i, int i2) {
        SharePlatformStickerClientModel sharePlatformStickerClientModel = this.A03;
        sharePlatformStickerClientModel.A01 = (float) i;
        sharePlatformStickerClientModel.A00 = (float) i2;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        AnonymousClass7TG.A0z(canvas, this);
        canvas.drawRect(this.A07, this.A06);
        canvas.restore();
    }
}
